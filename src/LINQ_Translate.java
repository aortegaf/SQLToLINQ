import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Locale;

public class LINQ_Translate extends SqlParserBaseListener{


    @Override
    public void enterRoot(SqlParser.RootContext ctx) {
        super.enterRoot(ctx);
        System.out.print("var result = ");
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

    @Override
    public void exitRoot(SqlParser.RootContext ctx) {
        super.exitRoot(ctx);
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

            if(keys.get("where") != null) {
                System.out.print("where ");
                int size = keys.get("where").size();
                for (int i = 0; i<size; i++) {
                    String id = keys.get("where").get(i).Id.toLowerCase(Locale.ROOT);
                    if( i % 2 == 0)
                        System.out.print( table_name.charAt(0)+ "." + id + " ");
                    else
                        System.out.print( id + " ");
                }
                System.out.println();
                keys.remove("where");
            }

            if(keys.get("orderby") != null) {
                int size = keys.get("orderby").size();
                if(size > 1){
                    System.out.print("orderby ");
                    String first_id = keys.get("orderby").get(0).Id.toLowerCase(Locale.ROOT);
                    System.out.print(table_name.charAt(0) + "." + first_id);
                    if(keys.get("orderby").get(0).Propertie != null )
                    {
                        System.out.print( " " + keys.get("orderby").get(0).Propertie);
                    }
                    for (int i = 1; i<size; i++) {
                        String id = keys.get("orderby").get(i).Id.toLowerCase(Locale.ROOT);
                        System.out.print(", " + table_name.charAt(0)+ "." + id);
                        if(keys.get("orderby").get(i).Propertie != null )
                        {
                            System.out.print( " " + keys.get("orderby").get(i).Propertie);
                        }
                    }
                    System.out.println();
                    keys.remove("orderby");
                }else{
                    String id = keys.get("orderby").get(0).Id.toLowerCase(Locale.ROOT);
                    System.out.print("orderby " + table_name.charAt(0) + "." + id);

                    if(keys.get("orderby").get(0).Propertie != null )
                    {
                        System.out.println( " " + keys.get("orderby").get(0).Propertie);
                    }
                    else
                        System.out.println();

                    keys.remove("orderby");
                }
            }
            if(keys.get("select") != null) {
                int size = keys.get("select").size();
                if(size > 1){
                    System.out.print("select new {");
                    String first_id = keys.get("select").get(0).Id.toLowerCase(Locale.ROOT);
                    System.out.print(table_name.charAt(0) + "." + first_id);
                    for (int i = 1; i<size; i++) {
                        String id = keys.get("select").get(i).Id.toLowerCase(Locale.ROOT);
                        System.out.print(", " + table_name.charAt(0)+ "." + id);
                    }
                    System.out.print("}");
                    keys.remove("select");
                }else{
                    String id = keys.get("select").get(0).Id.toLowerCase(Locale.ROOT);
                    if(id.equals("*")){
                        System.out.print("select " + table_name.charAt(0));
                    }else{
                        System.out.print("select " + table_name.charAt(0) + "." + id);
                    }
                    keys.remove("select");
                }
            }
        }
        System.out.println(";");
    }
}
