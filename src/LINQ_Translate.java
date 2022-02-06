import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Locale;

public class LINQ_Translate extends SqlParserBaseListener{

    @Override
    public void enterRoot(SqlParser.RootContext ctx) {
        super.enterRoot(ctx);
    }

    ModelIdPropertie createInstance(String id, String propertie)
    {
        return new ModelIdPropertie(id, propertie);
    }

    Hashtable<String, ArrayList<ModelIdPropertie>> keys = new Hashtable<String, ArrayList<ModelIdPropertie>>();
    String key = null;

    @Override
    public void enterSelectElements(SqlParser.SelectElementsContext ctx) {
        super.enterSelectElements(ctx);
        key = "select";
        keys.put(key, new ArrayList<>());
        if (ctx.STAR() != null){
            keys.get(key).add( createInstance("*", null));
        }
    }

    @Override
    public void enterFromClause(SqlParser.FromClauseContext ctx) {
        super.enterFromClause(ctx);
        if(ctx.FROM() != null){
            key = "from";
            keys.put(key, new ArrayList<>());
        }
    }

    @Override
    public void enterWhereClause(SqlParser.WhereClauseContext ctx) {
        super.enterWhereClause(ctx);
        if(ctx.WHERE() != null){
            key = "where";
            keys.put(key, new ArrayList<>());
        }
    }

    @Override
    public void enterPredicateExpression(SqlParser.PredicateExpressionContext ctx) {
        super.enterPredicateExpression(ctx);
        if(key.equals("where"))
            keys.get(key).add( createInstance(ctx.getText(),null));
        if(key.equals("join"))
            keys.get(key).add( createInstance(ctx.getText(),null));
    }

    @Override
    public void enterInnerJoin(SqlParser.InnerJoinContext ctx) {
        super.enterInnerJoin(ctx);
        if(ctx.JOIN() != null)
        {
            if(!keys.containsKey("join"))
            {
                key = "join";
                keys.put(key, new ArrayList<>());
            }
        }
    }

    @Override
    public void enterLogicalOperator(SqlParser.LogicalOperatorContext ctx) {
        super.enterLogicalOperator(ctx);
        keys.get(key).add( createInstance(ctx.getText(),null));
    }

    @Override
    public void enterOrderByClause(SqlParser.OrderByClauseContext ctx) {
        super.enterOrderByClause(ctx);
        key = "orderby";
        keys.put(key, new ArrayList<>());
    }

    @Override
    public void enterOrderByExpression(SqlParser.OrderByExpressionContext ctx) {
        super.enterOrderByExpression(ctx);
        if(ctx.DESC() != null )
        {
            currentProperty = "descending";
        }
        else if(ctx.ASC() != null)
        {
            currentProperty = "ascending";
        }
    }

    String currentProperty = "";

    @Override
    public void enterSimpleId(SqlParser.SimpleIdContext ctx) {
        super.enterSimpleId(ctx);
        if(key.equals("orderby"))
        {
            keys.get(key).add( createInstance(ctx.getText(),currentProperty));
            currentProperty = "";
        }
        else if(key.equals("where"))
        {}
        else
            keys.get(key).add( createInstance(ctx.getText(),null));
    }

    int indexOrder = 0;
    int indexSelect = 0;
    int indexGroupBy = 0;

    @Override
    public void enterDottedId(SqlParser.DottedIdContext ctx) {
        super.enterDottedId(ctx);
        if(key.equals("orderby"))
        {
            String currentId = keys.get(key).get(indexOrder).Id;
            keys.get(key).get(indexOrder).setId(currentId + ctx.getText());
            indexOrder++;
        }

        if(key.equals("select"))
        {
            String currentId = keys.get(key).get(indexSelect).Id;
            keys.get(key).get(indexSelect).setId(currentId + ctx.getText());
            indexSelect++;
        }

        if(key.equals("groupby"))
        {
            String currentId = keys.get(key).get(indexGroupBy).Id;
            keys.get(key).get(indexGroupBy).setId(currentId + ctx.getText());
            indexGroupBy++;
        }
    }

    @Override
    public void enterGroupByClause(SqlParser.GroupByClauseContext ctx) {
        super.enterGroupByClause(ctx);
        key = "groupby";
        keys.put(key, new ArrayList<>());
    }

    @Override
    public void exitRoot(SqlParser.RootContext ctx) {
        super.exitRoot(ctx);
        Hashtable<String, String> idsVar = new Hashtable<>();
//        for (String s: keys.keySet()
//             ) {
//            System.out.println("Key+" +s );
//            for (ModelIdPropertie mip:
//                keys.get(s) ) {
//                System.out.println("Mip=" + mip.Id + ", p=" + mip.Propertie);
//            }
//        }
        while(keys.size() != 0){
            String table_name = keys.get("from").get(0).Id.toLowerCase(Locale.ROOT);
            System.out.println("from " + table_name.charAt(0) + " in " + table_name);
            keys.remove("from");

            idsVar.put(table_name, table_name.substring(0,1));

            if(keys.get("join") != null) {
                int size = keys.get("join").size();
                for (int i = 0; i<size; i+=4) {
                    String id = keys.get("join").get(i).Id.toLowerCase(Locale.ROOT);
                    String condition = keys.get("join").get(i+1).Id.toLowerCase(Locale.ROOT).replace("=", " equals ");
                    String firstTable = keys.get("join").get(i+2).Id.toLowerCase(Locale.ROOT);
                    String secondTable = keys.get("join").get(i+3).Id.toLowerCase(Locale.ROOT);

                    if(!idsVar.containsKey(id))
                        idsVar.put(id, id.substring(0,2) + i);

                    String idFisrtTableTmp = "";
                    if(idsVar.containsKey(firstTable))
                        idFisrtTableTmp = idsVar.get(firstTable);

                    String idSecondTableTmp = "";
                    if(idsVar.containsKey(secondTable))
                        idSecondTableTmp = idsVar.get(secondTable);

                    condition = condition.replace(firstTable, idFisrtTableTmp);
                    condition = condition.replace(secondTable, idSecondTableTmp);

                    System.out.println( "join " + idsVar.get(id) + " in " + id + " ");
                    System.out.println( "on " + condition);
                }
                keys.remove("join");
            }
            if(keys.get("where") != null) {
                System.out.print("where ");
                int size = keys.get("where").size();
                for (int i = 0; i<size; i++) {
                    String id = keys.get("where").get(i).Id.toLowerCase(Locale.ROOT);

                    id = id.replace("=", "==");

                    if( i % 2 == 0)
                    {
                        String idTableTmp = "";
                        String keyTable = "";
                        try
                        {
                            keyTable =  keys.get("where").get(i).Id.toLowerCase(Locale.ROOT).replace(".", "@").split("@")[0];
                        }
                        catch (Exception e)
                        {
                            keyTable = "";
                        }

                        if(idsVar.containsKey(keyTable))
                        {
                            idTableTmp = idsVar.get(keyTable);
                            id = id.replace(keyTable, idTableTmp);
                            System.out.print( id + " ");
                        }
                        else
                        {
                            System.out.print( table_name.charAt(0)+ "." + id + " ");
                        }
                    }
                    else
                        System.out.print( id + " ");
                }
                System.out.println();
                keys.remove("where");
            }
            if(keys.get("groupby") != null) {
                int size = keys.get("groupby").size();
                if(size > 1){
                    System.out.print("group " + table_name.charAt(0) + " by new {");
                    String first_id = keys.get("groupby").get(0).Id.toLowerCase(Locale.ROOT);

                    String idTableTmp1 = "";
                    String keyTable1 = "";
                    try
                    {
                        keyTable1 =  keys.get("groupby").get(0).Id.toLowerCase(Locale.ROOT).replace(".", "@").split("@")[0];
                    }
                    catch (Exception e)
                    {
                        keyTable1 = "";
                    }

                    if(idsVar.containsKey(keyTable1))
                    {
                        idTableTmp1 = idsVar.get(keyTable1);
                    }

                    first_id = first_id.replace(keyTable1, idTableTmp1);
                    System.out.print(first_id);

                    for (int i = 1; i<size; i++) {
                        String id = keys.get("groupby").get(i).Id.toLowerCase(Locale.ROOT);

                        String idTableTmp = "";
                        String keyTable = "";
                        try
                        {
                            keyTable =  keys.get("groupby").get(i).Id.toLowerCase(Locale.ROOT).replace(".", "@").split("@")[0];
                        }
                        catch (Exception e)
                        {
                            keyTable = "";
                        }

                        if(idsVar.containsKey(keyTable))
                        {
                            idTableTmp = idsVar.get(keyTable);
                        }

                        id = id.replace(keyTable, idTableTmp);
                        System.out.print(", " + id);
                    }
                    System.out.println("}");
                    keys.remove("groupby");
                }else{
                    String id = keys.get("groupby").get(0).Id.toLowerCase(Locale.ROOT);

                    String idTableTmp1 = "";
                    String keyTable1 = "";
                    try
                    {
                        keyTable1 =  keys.get("groupby").get(0).Id.toLowerCase(Locale.ROOT).replace(".", "@").split("@")[0];
                    }
                    catch (Exception e)
                    {
                        keyTable1 = "";
                    }

                    if(idsVar.containsKey(keyTable1))
                    {
                        idTableTmp1 = idsVar.get(keyTable1);
                    }

                    id = id.replace(keyTable1, idTableTmp1);
                    System.out.println("group " + table_name.charAt(0) + " by " + id);

                    keys.remove("groupby");
                }
            }
            if(keys.get("orderby") != null) {
                int size = keys.get("orderby").size();
                if(size > 1){
                    System.out.print("orderby ");
                    String first_id = keys.get("orderby").get(0).Id.toLowerCase(Locale.ROOT);

                    String idTableTmp = "";
                    String keyTable = "";
                    try
                    {
                        keyTable =  keys.get("orderby").get(0).Id.toLowerCase(Locale.ROOT).replace(".", "@").split("@")[0];
                    }
                    catch (Exception e)
                    {
                        keyTable = "";
                    }

                    if(idsVar.containsKey(keyTable))
                    {
                        idTableTmp = idsVar.get(keyTable);
                        first_id = first_id.replace(keyTable, idTableTmp);
                        System.out.print(first_id);
                        if(keys.get("orderby").get(0).Propertie != null && keys.get("orderby").get(0).Propertie.length() > 0  )
                        {
                            System.out.print( " " + keys.get("orderby").get(0).Propertie);
                        }
                    }
                    else
                    {
                        System.out.print( table_name.charAt(0) + "." + first_id.trim());
                        if(keys.get("orderby").get(0).Propertie != null && keys.get("orderby").get(0).Propertie.length() > 0 )
                        {
                            System.out.print( " " + keys.get("orderby").get(0).Propertie);
                        }
                    }

                    for (int i = 1; i<size; i++) {
                        String id = keys.get("orderby").get(i).Id.toLowerCase(Locale.ROOT);
                        String idTableTmp1 = "";
                        String keyTable1 = "";
                        try
                        {
                            keyTable1 =  keys.get("orderby").get(i).Id.toLowerCase(Locale.ROOT).replace(".", "@").split("@")[0];
                        }
                        catch (Exception e)
                        {
                            keyTable1 = "";
                        }

                        if(idsVar.containsKey(keyTable1))
                        {
                            idTableTmp1 = idsVar.get(keyTable1);
                            id = id.replace(keyTable1, idTableTmp1);
                            System.out.print(", " + id);
                            if(keys.get("orderby").get(i).Propertie != null  && keys.get("orderby").get(i).Propertie.length() > 0  )
                            {
                                System.out.print( " " + keys.get("orderby").get(i).Propertie);
                            }
                        }
                        else
                        {
                            System.out.print(", "  + table_name.charAt(0) + "."  + id);
                            if(keys.get("orderby").get(i).Propertie != null && keys.get("orderby").get(i).Propertie.length() > 0 )
                            {
                                System.out.print( " " + keys.get("orderby").get(i).Propertie);
                            }
                        }
                    }
                    System.out.println();
                    keys.remove("orderby");
                }else{
                    String id = keys.get("orderby").get(0).Id.toLowerCase(Locale.ROOT);
                    String idTableTmp = "";
                    String keyTable = "";
                    try
                    {
                        keyTable =  keys.get("orderby").get(0).Id.toLowerCase(Locale.ROOT).replace(".", "@").split("@")[0];
                    }
                    catch (Exception e)
                    {
                        keyTable = "";
                    }

                    if(idsVar.containsKey(keyTable))
                    {
                        idTableTmp = idsVar.get(keyTable);
                        id = id.replace(keyTable, idTableTmp);
                        System.out.print("orderby " + id);
                        if(keys.get("orderby").get(0).Propertie != null )
                        {
                            System.out.println( " " + keys.get("orderby").get(0).Propertie);
                        }
                        else
                            System.out.println();
                    }
                    else
                    {
                        System.out.print("orderby " + table_name.charAt(0) + "." + id);
                        if(keys.get("orderby").get(0).Propertie != null )
                        {
                            System.out.println( " " + keys.get("orderby").get(0).Propertie);
                        }
                        else
                            System.out.println();
                    }

                    keys.remove("orderby");
                }
            }
            if(keys.get("select") != null) {
                int size = keys.get("select").size();
                if(size > 1){
                    System.out.print("select new {");

                    String first_id = keys.get("select").get(0).Id.toLowerCase(Locale.ROOT);

                    String idTableTmp1 = "";
                    String keyTable1 = "";
                    try
                    {
                        keyTable1 =  keys.get("select").get(0).Id.toLowerCase(Locale.ROOT).replace(".", "@").split("@")[0];
                    }
                    catch (Exception e)
                    {
                        keyTable1 = "";
                    }

                    if(idsVar.containsKey(keyTable1))
                    {
                        idTableTmp1 = idsVar.get(keyTable1);
                        first_id = first_id.replace(keyTable1, idTableTmp1);
                        System.out.print(first_id);
                    }
                    else
                    {
                        System.out.print(table_name.charAt(0) + "." + first_id);
                    }


                    for (int i = 1; i<size; i++) {
                        String id = keys.get("select").get(i).Id.toLowerCase(Locale.ROOT);

                        String idTableTmp = "";
                        String keyTable = "";
                        try
                        {
                            keyTable =  keys.get("select").get(i).Id.toLowerCase(Locale.ROOT).replace(".", "@").split("@")[0];
                        }
                        catch (Exception e)
                        {
                            keyTable = "";
                        }

                        if(idsVar.containsKey(keyTable))
                        {
                            idTableTmp = idsVar.get(keyTable);
                            id = id.replace(keyTable, idTableTmp);
                            System.out.print(", " + id);
                        }
                        else
                        {
                            System.out.print(", " + table_name.charAt(0) + "." + id);
                        }
                    }
                    System.out.print("}");
                    keys.remove("select");
                }else{
                    String id = keys.get("select").get(0).Id.toLowerCase(Locale.ROOT);

                    String idTableTmp1 = "";
                    String keyTable1 = "";
                    try
                    {
                        keyTable1 =  keys.get("select").get(0).Id.toLowerCase(Locale.ROOT).replace(".", "@").split("@")[0];
                    }
                    catch (Exception e)
                    {
                        keyTable1 = "";
                    }


                    if(idsVar.containsKey(keyTable1))
                    {
                        idTableTmp1 = idsVar.get(keyTable1);
                        id = id.replace(keyTable1, idTableTmp1);

                        System.out.print("select " + id);
                        keys.remove("select");
                    }
                    else
                    {
                        if(id.equals("*")){
                            System.out.print("select " + table_name.charAt(0));
                        }
                        else
                        {
                            System.out.print("select " + table_name.charAt(0) + "." + id);
                        }
                        keys.remove("select");
                    }
                }
            }
        }
    }
}
