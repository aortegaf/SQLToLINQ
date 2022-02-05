// Generated from D:/General/Trabajos/SQLToLINQ/grammar\SqlParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(SqlParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(SqlParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatements(SqlParser.SqlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatements(SqlParser.SqlStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(SqlParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(SqlParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement_(SqlParser.EmptyStatement_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement_(SqlParser.EmptyStatement_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDdlStatement(SqlParser.DdlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDdlStatement(SqlParser.DdlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(SqlParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(SqlParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#transactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterTransactionStatement(SqlParser.TransactionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#transactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitTransactionStatement(SqlParser.TransactionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#replicationStatement}.
	 * @param ctx the parse tree
	 */
	void enterReplicationStatement(SqlParser.ReplicationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#replicationStatement}.
	 * @param ctx the parse tree
	 */
	void exitReplicationStatement(SqlParser.ReplicationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#preparedStatement}.
	 * @param ctx the parse tree
	 */
	void enterPreparedStatement(SqlParser.PreparedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#preparedStatement}.
	 * @param ctx the parse tree
	 */
	void exitPreparedStatement(SqlParser.PreparedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(SqlParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(SqlParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#administrationStatement}.
	 * @param ctx the parse tree
	 */
	void enterAdministrationStatement(SqlParser.AdministrationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#administrationStatement}.
	 * @param ctx the parse tree
	 */
	void exitAdministrationStatement(SqlParser.AdministrationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#utilityStatement}.
	 * @param ctx the parse tree
	 */
	void enterUtilityStatement(SqlParser.UtilityStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#utilityStatement}.
	 * @param ctx the parse tree
	 */
	void exitUtilityStatement(SqlParser.UtilityStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(SqlParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(SqlParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void enterCreateEvent(SqlParser.CreateEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void exitCreateEvent(SqlParser.CreateEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(SqlParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(SqlParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterCreateLogfileGroup(SqlParser.CreateLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitCreateLogfileGroup(SqlParser.CreateLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedure(SqlParser.CreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedure(SqlParser.CreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(SqlParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(SqlParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createServer}.
	 * @param ctx the parse tree
	 */
	void enterCreateServer(SqlParser.CreateServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createServer}.
	 * @param ctx the parse tree
	 */
	void exitCreateServer(SqlParser.CreateServerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code copyCreateTable}
	 * labeled alternative in {@link SqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCopyCreateTable(SqlParser.CopyCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code copyCreateTable}
	 * labeled alternative in {@link SqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCopyCreateTable(SqlParser.CopyCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryCreateTable}
	 * labeled alternative in {@link SqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterQueryCreateTable(SqlParser.QueryCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryCreateTable}
	 * labeled alternative in {@link SqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitQueryCreateTable(SqlParser.QueryCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnCreateTable}
	 * labeled alternative in {@link SqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterColumnCreateTable(SqlParser.ColumnCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnCreateTable}
	 * labeled alternative in {@link SqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitColumnCreateTable(SqlParser.ColumnCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceInnodb(SqlParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceInnodb(SqlParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceNdb(SqlParser.CreateTablespaceNdbContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceNdb(SqlParser.CreateTablespaceNdbContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrigger(SqlParser.CreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrigger(SqlParser.CreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(SqlParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(SqlParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createDatabaseOption}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseOption(SqlParser.CreateDatabaseOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createDatabaseOption}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseOption(SqlParser.CreateDatabaseOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#charSet}.
	 * @param ctx the parse tree
	 */
	void enterCharSet(SqlParser.CharSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#charSet}.
	 * @param ctx the parse tree
	 */
	void exitCharSet(SqlParser.CharSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ownerStatement}.
	 * @param ctx the parse tree
	 */
	void enterOwnerStatement(SqlParser.OwnerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ownerStatement}.
	 * @param ctx the parse tree
	 */
	void exitOwnerStatement(SqlParser.OwnerStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preciseSchedule}
	 * labeled alternative in {@link SqlParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreciseSchedule(SqlParser.PreciseScheduleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preciseSchedule}
	 * labeled alternative in {@link SqlParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreciseSchedule(SqlParser.PreciseScheduleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalSchedule}
	 * labeled alternative in {@link SqlParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalSchedule(SqlParser.IntervalScheduleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalSchedule}
	 * labeled alternative in {@link SqlParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalSchedule(SqlParser.IntervalScheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#timestampValue}.
	 * @param ctx the parse tree
	 */
	void enterTimestampValue(SqlParser.TimestampValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#timestampValue}.
	 * @param ctx the parse tree
	 */
	void exitTimestampValue(SqlParser.TimestampValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#intervalExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpr(SqlParser.IntervalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#intervalExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpr(SqlParser.IntervalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#intervalType}.
	 * @param ctx the parse tree
	 */
	void enterIntervalType(SqlParser.IntervalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#intervalType}.
	 * @param ctx the parse tree
	 */
	void exitIntervalType(SqlParser.IntervalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#enableType}.
	 * @param ctx the parse tree
	 */
	void enterEnableType(SqlParser.EnableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#enableType}.
	 * @param ctx the parse tree
	 */
	void exitEnableType(SqlParser.EnableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(SqlParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(SqlParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void enterIndexOption(SqlParser.IndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void exitIndexOption(SqlParser.IndexOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#procedureParameter}.
	 * @param ctx the parse tree
	 */
	void enterProcedureParameter(SqlParser.ProcedureParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#procedureParameter}.
	 * @param ctx the parse tree
	 */
	void exitProcedureParameter(SqlParser.ProcedureParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(SqlParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(SqlParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineComment}
	 * labeled alternative in {@link SqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineComment(SqlParser.RoutineCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineComment}
	 * labeled alternative in {@link SqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineComment(SqlParser.RoutineCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineLanguage}
	 * labeled alternative in {@link SqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineLanguage(SqlParser.RoutineLanguageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineLanguage}
	 * labeled alternative in {@link SqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineLanguage(SqlParser.RoutineLanguageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineBehavior}
	 * labeled alternative in {@link SqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineBehavior(SqlParser.RoutineBehaviorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineBehavior}
	 * labeled alternative in {@link SqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineBehavior(SqlParser.RoutineBehaviorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineData}
	 * labeled alternative in {@link SqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineData(SqlParser.RoutineDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineData}
	 * labeled alternative in {@link SqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineData(SqlParser.RoutineDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineSecurity}
	 * labeled alternative in {@link SqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineSecurity(SqlParser.RoutineSecurityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineSecurity}
	 * labeled alternative in {@link SqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineSecurity(SqlParser.RoutineSecurityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#serverOption}.
	 * @param ctx the parse tree
	 */
	void enterServerOption(SqlParser.ServerOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#serverOption}.
	 * @param ctx the parse tree
	 */
	void exitServerOption(SqlParser.ServerOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitions(SqlParser.CreateDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitions(SqlParser.CreateDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnDeclaration}
	 * labeled alternative in {@link SqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDeclaration(SqlParser.ColumnDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnDeclaration}
	 * labeled alternative in {@link SqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDeclaration(SqlParser.ColumnDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constraintDeclaration}
	 * labeled alternative in {@link SqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstraintDeclaration(SqlParser.ConstraintDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constraintDeclaration}
	 * labeled alternative in {@link SqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstraintDeclaration(SqlParser.ConstraintDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexDeclaration}
	 * labeled alternative in {@link SqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterIndexDeclaration(SqlParser.IndexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexDeclaration}
	 * labeled alternative in {@link SqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitIndexDeclaration(SqlParser.IndexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(SqlParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(SqlParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterNullColumnConstraint(SqlParser.NullColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitNullColumnConstraint(SqlParser.NullColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterDefaultColumnConstraint(SqlParser.DefaultColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitDefaultColumnConstraint(SqlParser.DefaultColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visibilityColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterVisibilityColumnConstraint(SqlParser.VisibilityColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visibilityColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitVisibilityColumnConstraint(SqlParser.VisibilityColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code autoIncrementColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterAutoIncrementColumnConstraint(SqlParser.AutoIncrementColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code autoIncrementColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitAutoIncrementColumnConstraint(SqlParser.AutoIncrementColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyColumnConstraint(SqlParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyColumnConstraint(SqlParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniqueKeyColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterUniqueKeyColumnConstraint(SqlParser.UniqueKeyColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniqueKeyColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitUniqueKeyColumnConstraint(SqlParser.UniqueKeyColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCommentColumnConstraint(SqlParser.CommentColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCommentColumnConstraint(SqlParser.CommentColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formatColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterFormatColumnConstraint(SqlParser.FormatColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formatColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitFormatColumnConstraint(SqlParser.FormatColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code storageColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterStorageColumnConstraint(SqlParser.StorageColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code storageColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitStorageColumnConstraint(SqlParser.StorageColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code referenceColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterReferenceColumnConstraint(SqlParser.ReferenceColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code referenceColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitReferenceColumnConstraint(SqlParser.ReferenceColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collateColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCollateColumnConstraint(SqlParser.CollateColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collateColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCollateColumnConstraint(SqlParser.CollateColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generatedColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedColumnConstraint(SqlParser.GeneratedColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generatedColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedColumnConstraint(SqlParser.GeneratedColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code serialDefaultColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterSerialDefaultColumnConstraint(SqlParser.SerialDefaultColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code serialDefaultColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitSerialDefaultColumnConstraint(SqlParser.SerialDefaultColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckColumnConstraint(SqlParser.CheckColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckColumnConstraint(SqlParser.CheckColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link SqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyTableConstraint(SqlParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link SqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyTableConstraint(SqlParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniqueKeyTableConstraint}
	 * labeled alternative in {@link SqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterUniqueKeyTableConstraint(SqlParser.UniqueKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniqueKeyTableConstraint}
	 * labeled alternative in {@link SqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitUniqueKeyTableConstraint(SqlParser.UniqueKeyTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foreignKeyTableConstraint}
	 * labeled alternative in {@link SqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyTableConstraint(SqlParser.ForeignKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreignKeyTableConstraint}
	 * labeled alternative in {@link SqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyTableConstraint(SqlParser.ForeignKeyTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link SqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckTableConstraint(SqlParser.CheckTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link SqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckTableConstraint(SqlParser.CheckTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReferenceDefinition(SqlParser.ReferenceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReferenceDefinition(SqlParser.ReferenceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#referenceAction}.
	 * @param ctx the parse tree
	 */
	void enterReferenceAction(SqlParser.ReferenceActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#referenceAction}.
	 * @param ctx the parse tree
	 */
	void exitReferenceAction(SqlParser.ReferenceActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#referenceControlType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceControlType(SqlParser.ReferenceControlTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#referenceControlType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceControlType(SqlParser.ReferenceControlTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleIndexDeclaration}
	 * labeled alternative in {@link SqlParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIndexDeclaration(SqlParser.SimpleIndexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleIndexDeclaration}
	 * labeled alternative in {@link SqlParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIndexDeclaration(SqlParser.SimpleIndexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specialIndexDeclaration}
	 * labeled alternative in {@link SqlParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSpecialIndexDeclaration(SqlParser.SpecialIndexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specialIndexDeclaration}
	 * labeled alternative in {@link SqlParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSpecialIndexDeclaration(SqlParser.SpecialIndexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionEngine}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionEngine(SqlParser.TableOptionEngineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionEngine}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionEngine(SqlParser.TableOptionEngineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionAutoIncrement}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionAutoIncrement(SqlParser.TableOptionAutoIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionAutoIncrement}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionAutoIncrement(SqlParser.TableOptionAutoIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionAverage}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionAverage(SqlParser.TableOptionAverageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionAverage}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionAverage(SqlParser.TableOptionAverageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionCharset}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCharset(SqlParser.TableOptionCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCharset}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCharset(SqlParser.TableOptionCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionChecksum}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionChecksum(SqlParser.TableOptionChecksumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionChecksum}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionChecksum(SqlParser.TableOptionChecksumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionCollate}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCollate(SqlParser.TableOptionCollateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCollate}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCollate(SqlParser.TableOptionCollateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionComment}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionComment(SqlParser.TableOptionCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionComment}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionComment(SqlParser.TableOptionCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionCompression}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCompression(SqlParser.TableOptionCompressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCompression}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCompression(SqlParser.TableOptionCompressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionConnection}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionConnection(SqlParser.TableOptionConnectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionConnection}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionConnection(SqlParser.TableOptionConnectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionDataDirectory}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionDataDirectory(SqlParser.TableOptionDataDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionDataDirectory}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionDataDirectory(SqlParser.TableOptionDataDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionDelay}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionDelay(SqlParser.TableOptionDelayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionDelay}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionDelay(SqlParser.TableOptionDelayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionEncryption}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionEncryption(SqlParser.TableOptionEncryptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionEncryption}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionEncryption(SqlParser.TableOptionEncryptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionIndexDirectory}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionIndexDirectory(SqlParser.TableOptionIndexDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionIndexDirectory}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionIndexDirectory(SqlParser.TableOptionIndexDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionInsertMethod}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionInsertMethod(SqlParser.TableOptionInsertMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionInsertMethod}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionInsertMethod(SqlParser.TableOptionInsertMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionKeyBlockSize}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionKeyBlockSize(SqlParser.TableOptionKeyBlockSizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionKeyBlockSize}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionKeyBlockSize(SqlParser.TableOptionKeyBlockSizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionMaxRows}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionMaxRows(SqlParser.TableOptionMaxRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionMaxRows}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionMaxRows(SqlParser.TableOptionMaxRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionMinRows}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionMinRows(SqlParser.TableOptionMinRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionMinRows}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionMinRows(SqlParser.TableOptionMinRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionPackKeys}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPackKeys(SqlParser.TableOptionPackKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPackKeys}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPackKeys(SqlParser.TableOptionPackKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionPassword}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPassword(SqlParser.TableOptionPasswordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPassword}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPassword(SqlParser.TableOptionPasswordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionRowFormat}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionRowFormat(SqlParser.TableOptionRowFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionRowFormat}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionRowFormat(SqlParser.TableOptionRowFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionRecalculation}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionRecalculation(SqlParser.TableOptionRecalculationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionRecalculation}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionRecalculation(SqlParser.TableOptionRecalculationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionPersistent}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPersistent(SqlParser.TableOptionPersistentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPersistent}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPersistent(SqlParser.TableOptionPersistentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionSamplePage}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionSamplePage(SqlParser.TableOptionSamplePageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionSamplePage}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionSamplePage(SqlParser.TableOptionSamplePageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionTablespace}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionTablespace(SqlParser.TableOptionTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionTablespace}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionTablespace(SqlParser.TableOptionTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionTableType}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionTableType(SqlParser.TableOptionTableTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionTableType}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionTableType(SqlParser.TableOptionTableTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionUnion}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionUnion(SqlParser.TableOptionUnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionUnion}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionUnion(SqlParser.TableOptionUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableType}.
	 * @param ctx the parse tree
	 */
	void enterTableType(SqlParser.TableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableType}.
	 * @param ctx the parse tree
	 */
	void exitTableType(SqlParser.TableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tablespaceStorage}.
	 * @param ctx the parse tree
	 */
	void enterTablespaceStorage(SqlParser.TablespaceStorageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tablespaceStorage}.
	 * @param ctx the parse tree
	 */
	void exitTablespaceStorage(SqlParser.TablespaceStorageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinitions(SqlParser.PartitionDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinitions(SqlParser.PartitionDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionHash}
	 * labeled alternative in {@link SqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionHash(SqlParser.PartitionFunctionHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionHash}
	 * labeled alternative in {@link SqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionHash(SqlParser.PartitionFunctionHashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionKey}
	 * labeled alternative in {@link SqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionKey(SqlParser.PartitionFunctionKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionKey}
	 * labeled alternative in {@link SqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionKey(SqlParser.PartitionFunctionKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionRange}
	 * labeled alternative in {@link SqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionRange(SqlParser.PartitionFunctionRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionRange}
	 * labeled alternative in {@link SqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionRange(SqlParser.PartitionFunctionRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionList}
	 * labeled alternative in {@link SqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionList(SqlParser.PartitionFunctionListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionList}
	 * labeled alternative in {@link SqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionList(SqlParser.PartitionFunctionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subPartitionFunctionHash}
	 * labeled alternative in {@link SqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubPartitionFunctionHash(SqlParser.SubPartitionFunctionHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subPartitionFunctionHash}
	 * labeled alternative in {@link SqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubPartitionFunctionHash(SqlParser.SubPartitionFunctionHashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subPartitionFunctionKey}
	 * labeled alternative in {@link SqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubPartitionFunctionKey(SqlParser.SubPartitionFunctionKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subPartitionFunctionKey}
	 * labeled alternative in {@link SqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubPartitionFunctionKey(SqlParser.SubPartitionFunctionKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionComparison}
	 * labeled alternative in {@link SqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionComparison(SqlParser.PartitionComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionComparison}
	 * labeled alternative in {@link SqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionComparison(SqlParser.PartitionComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionListAtom}
	 * labeled alternative in {@link SqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionListAtom(SqlParser.PartitionListAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionListAtom}
	 * labeled alternative in {@link SqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionListAtom(SqlParser.PartitionListAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionListVector}
	 * labeled alternative in {@link SqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionListVector(SqlParser.PartitionListVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionListVector}
	 * labeled alternative in {@link SqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionListVector(SqlParser.PartitionListVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionSimple}
	 * labeled alternative in {@link SqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSimple(SqlParser.PartitionSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionSimple}
	 * labeled alternative in {@link SqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSimple(SqlParser.PartitionSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#partitionDefinerAtom}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinerAtom(SqlParser.PartitionDefinerAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#partitionDefinerAtom}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinerAtom(SqlParser.PartitionDefinerAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#partitionDefinerVector}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinerVector(SqlParser.PartitionDefinerVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#partitionDefinerVector}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinerVector(SqlParser.PartitionDefinerVectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubpartitionDefinition(SqlParser.SubpartitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubpartitionDefinition(SqlParser.SubpartitionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionEngine}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionEngine(SqlParser.PartitionOptionEngineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionEngine}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionEngine(SqlParser.PartitionOptionEngineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionComment}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionComment(SqlParser.PartitionOptionCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionComment}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionComment(SqlParser.PartitionOptionCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionDataDirectory}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionDataDirectory(SqlParser.PartitionOptionDataDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionDataDirectory}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionDataDirectory(SqlParser.PartitionOptionDataDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionIndexDirectory}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionIndexDirectory(SqlParser.PartitionOptionIndexDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionIndexDirectory}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionIndexDirectory(SqlParser.PartitionOptionIndexDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionMaxRows}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionMaxRows(SqlParser.PartitionOptionMaxRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionMaxRows}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionMaxRows(SqlParser.PartitionOptionMaxRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionMinRows}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionMinRows(SqlParser.PartitionOptionMinRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionMinRows}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionMinRows(SqlParser.PartitionOptionMinRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionTablespace}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionTablespace(SqlParser.PartitionOptionTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionTablespace}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionTablespace(SqlParser.PartitionOptionTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionNodeGroup}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionNodeGroup(SqlParser.PartitionOptionNodeGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionNodeGroup}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionNodeGroup(SqlParser.PartitionOptionNodeGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterSimpleDatabase}
	 * labeled alternative in {@link SqlParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterSimpleDatabase(SqlParser.AlterSimpleDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterSimpleDatabase}
	 * labeled alternative in {@link SqlParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterSimpleDatabase(SqlParser.AlterSimpleDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterUpgradeName}
	 * labeled alternative in {@link SqlParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterUpgradeName(SqlParser.AlterUpgradeNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterUpgradeName}
	 * labeled alternative in {@link SqlParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterUpgradeName(SqlParser.AlterUpgradeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterEvent}.
	 * @param ctx the parse tree
	 */
	void enterAlterEvent(SqlParser.AlterEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterEvent}.
	 * @param ctx the parse tree
	 */
	void exitAlterEvent(SqlParser.AlterEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunction(SqlParser.AlterFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunction(SqlParser.AlterFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterInstance}.
	 * @param ctx the parse tree
	 */
	void enterAlterInstance(SqlParser.AlterInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterInstance}.
	 * @param ctx the parse tree
	 */
	void exitAlterInstance(SqlParser.AlterInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterAlterLogfileGroup(SqlParser.AlterLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitAlterLogfileGroup(SqlParser.AlterLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void enterAlterProcedure(SqlParser.AlterProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void exitAlterProcedure(SqlParser.AlterProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void enterAlterServer(SqlParser.AlterServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void exitAlterServer(SqlParser.AlterServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(SqlParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(SqlParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespace(SqlParser.AlterTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespace(SqlParser.AlterTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterView}.
	 * @param ctx the parse tree
	 */
	void enterAlterView(SqlParser.AlterViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterView}.
	 * @param ctx the parse tree
	 */
	void exitAlterView(SqlParser.AlterViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByTableOption}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByTableOption(SqlParser.AlterByTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByTableOption}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByTableOption(SqlParser.AlterByTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddColumn}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddColumn(SqlParser.AlterByAddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddColumn}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddColumn(SqlParser.AlterByAddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddColumns}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddColumns(SqlParser.AlterByAddColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddColumns}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddColumns(SqlParser.AlterByAddColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddIndex}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddIndex(SqlParser.AlterByAddIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddIndex}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddIndex(SqlParser.AlterByAddIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddPrimaryKey}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddPrimaryKey(SqlParser.AlterByAddPrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddPrimaryKey}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddPrimaryKey(SqlParser.AlterByAddPrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddUniqueKey}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddUniqueKey(SqlParser.AlterByAddUniqueKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddUniqueKey}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddUniqueKey(SqlParser.AlterByAddUniqueKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddSpecialIndex}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddSpecialIndex(SqlParser.AlterByAddSpecialIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddSpecialIndex}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddSpecialIndex(SqlParser.AlterByAddSpecialIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddForeignKey}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddForeignKey(SqlParser.AlterByAddForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddForeignKey}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddForeignKey(SqlParser.AlterByAddForeignKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddCheckTableConstraint}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddCheckTableConstraint(SqlParser.AlterByAddCheckTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddCheckTableConstraint}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddCheckTableConstraint(SqlParser.AlterByAddCheckTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterBySetAlgorithm}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterBySetAlgorithm(SqlParser.AlterBySetAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterBySetAlgorithm}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterBySetAlgorithm(SqlParser.AlterBySetAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByChangeDefault}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByChangeDefault(SqlParser.AlterByChangeDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByChangeDefault}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByChangeDefault(SqlParser.AlterByChangeDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByChangeColumn}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByChangeColumn(SqlParser.AlterByChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByChangeColumn}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByChangeColumn(SqlParser.AlterByChangeColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRenameColumn}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRenameColumn(SqlParser.AlterByRenameColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRenameColumn}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRenameColumn(SqlParser.AlterByRenameColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByLock}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByLock(SqlParser.AlterByLockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByLock}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByLock(SqlParser.AlterByLockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByModifyColumn}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByModifyColumn(SqlParser.AlterByModifyColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByModifyColumn}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByModifyColumn(SqlParser.AlterByModifyColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropColumn}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropColumn(SqlParser.AlterByDropColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropColumn}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropColumn(SqlParser.AlterByDropColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropConstraintCheck}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropConstraintCheck(SqlParser.AlterByDropConstraintCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropConstraintCheck}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropConstraintCheck(SqlParser.AlterByDropConstraintCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropPrimaryKey}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropPrimaryKey(SqlParser.AlterByDropPrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropPrimaryKey}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropPrimaryKey(SqlParser.AlterByDropPrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRenameIndex}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRenameIndex(SqlParser.AlterByRenameIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRenameIndex}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRenameIndex(SqlParser.AlterByRenameIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAlterIndexVisibility}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAlterIndexVisibility(SqlParser.AlterByAlterIndexVisibilityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAlterIndexVisibility}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAlterIndexVisibility(SqlParser.AlterByAlterIndexVisibilityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropIndex}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropIndex(SqlParser.AlterByDropIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropIndex}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropIndex(SqlParser.AlterByDropIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropForeignKey}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropForeignKey(SqlParser.AlterByDropForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropForeignKey}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropForeignKey(SqlParser.AlterByDropForeignKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDisableKeys}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDisableKeys(SqlParser.AlterByDisableKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDisableKeys}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDisableKeys(SqlParser.AlterByDisableKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByEnableKeys}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByEnableKeys(SqlParser.AlterByEnableKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByEnableKeys}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByEnableKeys(SqlParser.AlterByEnableKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRename}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRename(SqlParser.AlterByRenameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRename}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRename(SqlParser.AlterByRenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByOrder}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByOrder(SqlParser.AlterByOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByOrder}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByOrder(SqlParser.AlterByOrderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByConvertCharset}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByConvertCharset(SqlParser.AlterByConvertCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByConvertCharset}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByConvertCharset(SqlParser.AlterByConvertCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDefaultCharset}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDefaultCharset(SqlParser.AlterByDefaultCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDefaultCharset}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDefaultCharset(SqlParser.AlterByDefaultCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDiscardTablespace}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDiscardTablespace(SqlParser.AlterByDiscardTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDiscardTablespace}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDiscardTablespace(SqlParser.AlterByDiscardTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByImportTablespace}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByImportTablespace(SqlParser.AlterByImportTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByImportTablespace}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByImportTablespace(SqlParser.AlterByImportTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByForce}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByForce(SqlParser.AlterByForceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByForce}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByForce(SqlParser.AlterByForceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByValidate}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByValidate(SqlParser.AlterByValidateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByValidate}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByValidate(SqlParser.AlterByValidateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddPartition(SqlParser.AlterByAddPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddPartition(SqlParser.AlterByAddPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropPartition(SqlParser.AlterByDropPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropPartition(SqlParser.AlterByDropPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDiscardPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDiscardPartition(SqlParser.AlterByDiscardPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDiscardPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDiscardPartition(SqlParser.AlterByDiscardPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByImportPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByImportPartition(SqlParser.AlterByImportPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByImportPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByImportPartition(SqlParser.AlterByImportPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByTruncatePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByTruncatePartition(SqlParser.AlterByTruncatePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByTruncatePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByTruncatePartition(SqlParser.AlterByTruncatePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByCoalescePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByCoalescePartition(SqlParser.AlterByCoalescePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByCoalescePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByCoalescePartition(SqlParser.AlterByCoalescePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByReorganizePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByReorganizePartition(SqlParser.AlterByReorganizePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByReorganizePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByReorganizePartition(SqlParser.AlterByReorganizePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByExchangePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByExchangePartition(SqlParser.AlterByExchangePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByExchangePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByExchangePartition(SqlParser.AlterByExchangePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAnalyzePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAnalyzePartition(SqlParser.AlterByAnalyzePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAnalyzePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAnalyzePartition(SqlParser.AlterByAnalyzePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByCheckPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByCheckPartition(SqlParser.AlterByCheckPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByCheckPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByCheckPartition(SqlParser.AlterByCheckPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByOptimizePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByOptimizePartition(SqlParser.AlterByOptimizePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByOptimizePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByOptimizePartition(SqlParser.AlterByOptimizePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRebuildPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRebuildPartition(SqlParser.AlterByRebuildPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRebuildPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRebuildPartition(SqlParser.AlterByRebuildPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRepairPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRepairPartition(SqlParser.AlterByRepairPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRepairPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRepairPartition(SqlParser.AlterByRepairPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRemovePartitioning}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRemovePartitioning(SqlParser.AlterByRemovePartitioningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRemovePartitioning}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRemovePartitioning(SqlParser.AlterByRemovePartitioningContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByUpgradePartitioning}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByUpgradePartitioning(SqlParser.AlterByUpgradePartitioningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByUpgradePartitioning}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByUpgradePartitioning(SqlParser.AlterByUpgradePartitioningContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(SqlParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(SqlParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropEvent}.
	 * @param ctx the parse tree
	 */
	void enterDropEvent(SqlParser.DropEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropEvent}.
	 * @param ctx the parse tree
	 */
	void exitDropEvent(SqlParser.DropEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(SqlParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(SqlParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterDropLogfileGroup(SqlParser.DropLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitDropLogfileGroup(SqlParser.DropLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void enterDropProcedure(SqlParser.DropProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void exitDropProcedure(SqlParser.DropProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(SqlParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(SqlParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void enterDropServer(SqlParser.DropServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void exitDropServer(SqlParser.DropServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(SqlParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(SqlParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void enterDropTablespace(SqlParser.DropTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void exitDropTablespace(SqlParser.DropTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void enterDropTrigger(SqlParser.DropTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void exitDropTrigger(SqlParser.DropTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropView}.
	 * @param ctx the parse tree
	 */
	void enterDropView(SqlParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropView}.
	 * @param ctx the parse tree
	 */
	void exitDropView(SqlParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(SqlParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(SqlParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#renameTableClause}.
	 * @param ctx the parse tree
	 */
	void enterRenameTableClause(SqlParser.RenameTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#renameTableClause}.
	 * @param ctx the parse tree
	 */
	void exitRenameTableClause(SqlParser.RenameTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(SqlParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(SqlParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(SqlParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(SqlParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(SqlParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(SqlParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(SqlParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(SqlParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerStatement(SqlParser.HandlerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerStatement(SqlParser.HandlerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(SqlParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(SqlParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadDataStatement(SqlParser.LoadDataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadDataStatement(SqlParser.LoadDataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadXmlStatement(SqlParser.LoadXmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadXmlStatement(SqlParser.LoadXmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#replaceStatement}.
	 * @param ctx the parse tree
	 */
	void enterReplaceStatement(SqlParser.ReplaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#replaceStatement}.
	 * @param ctx the parse tree
	 */
	void exitReplaceStatement(SqlParser.ReplaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link SqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelect(SqlParser.SimpleSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link SqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelect(SqlParser.SimpleSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link SqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisSelect(SqlParser.ParenthesisSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link SqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisSelect(SqlParser.ParenthesisSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link SqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionSelect(SqlParser.UnionSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link SqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionSelect(SqlParser.UnionSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link SqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionParenthesisSelect(SqlParser.UnionParenthesisSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link SqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionParenthesisSelect(SqlParser.UnionParenthesisSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(SqlParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(SqlParser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insertStatementValue}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatementValue(SqlParser.InsertStatementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insertStatementValue}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatementValue(SqlParser.InsertStatementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#updatedElement}.
	 * @param ctx the parse tree
	 */
	void enterUpdatedElement(SqlParser.UpdatedElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#updatedElement}.
	 * @param ctx the parse tree
	 */
	void exitUpdatedElement(SqlParser.UpdatedElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assignmentField}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentField(SqlParser.AssignmentFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assignmentField}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentField(SqlParser.AssignmentFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void enterLockClause(SqlParser.LockClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void exitLockClause(SqlParser.LockClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleDeleteStatement(SqlParser.SingleDeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleDeleteStatement(SqlParser.SingleDeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#multipleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleDeleteStatement(SqlParser.MultipleDeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#multipleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleDeleteStatement(SqlParser.MultipleDeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerOpenStatement(SqlParser.HandlerOpenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerOpenStatement(SqlParser.HandlerOpenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadIndexStatement(SqlParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadIndexStatement(SqlParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadStatement(SqlParser.HandlerReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadStatement(SqlParser.HandlerReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerCloseStatement(SqlParser.HandlerCloseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerCloseStatement(SqlParser.HandlerCloseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleUpdateStatement(SqlParser.SingleUpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleUpdateStatement(SqlParser.SingleUpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#multipleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleUpdateStatement(SqlParser.MultipleUpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#multipleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleUpdateStatement(SqlParser.MultipleUpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SqlParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SqlParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpression(SqlParser.OrderByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpression(SqlParser.OrderByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void enterTableSources(SqlParser.TableSourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void exitTableSources(SqlParser.TableSourcesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link SqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceBase(SqlParser.TableSourceBaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link SqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceBase(SqlParser.TableSourceBaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link SqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceNested(SqlParser.TableSourceNestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link SqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceNested(SqlParser.TableSourceNestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link SqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterAtomTableItem(SqlParser.AtomTableItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link SqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitAtomTableItem(SqlParser.AtomTableItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link SqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryTableItem(SqlParser.SubqueryTableItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link SqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryTableItem(SqlParser.SubqueryTableItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link SqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterTableSourcesItem(SqlParser.TableSourcesItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link SqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitTableSourcesItem(SqlParser.TableSourcesItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void enterIndexHint(SqlParser.IndexHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void exitIndexHint(SqlParser.IndexHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#indexHintType}.
	 * @param ctx the parse tree
	 */
	void enterIndexHintType(SqlParser.IndexHintTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#indexHintType}.
	 * @param ctx the parse tree
	 */
	void exitIndexHintType(SqlParser.IndexHintTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link SqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoin(SqlParser.InnerJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link SqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoin(SqlParser.InnerJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code straightJoin}
	 * labeled alternative in {@link SqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterStraightJoin(SqlParser.StraightJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code straightJoin}
	 * labeled alternative in {@link SqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitStraightJoin(SqlParser.StraightJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link SqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterOuterJoin(SqlParser.OuterJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link SqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitOuterJoin(SqlParser.OuterJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link SqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterNaturalJoin(SqlParser.NaturalJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link SqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitNaturalJoin(SqlParser.NaturalJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpression(SqlParser.QueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpression(SqlParser.QueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionNointo(SqlParser.QueryExpressionNointoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionNointo(SqlParser.QueryExpressionNointoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(SqlParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(SqlParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecificationNointo(SqlParser.QuerySpecificationNointoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecificationNointo(SqlParser.QuerySpecificationNointoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unionParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterUnionParenthesis(SqlParser.UnionParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unionParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitUnionParenthesis(SqlParser.UnionParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unionStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionStatement(SqlParser.UnionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unionStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionStatement(SqlParser.UnionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpec(SqlParser.SelectSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpec(SqlParser.SelectSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(SqlParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(SqlParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStarElement(SqlParser.SelectStarElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStarElement(SqlParser.SelectStarElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectColumnElement(SqlParser.SelectColumnElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectColumnElement(SqlParser.SelectColumnElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectFunctionElement(SqlParser.SelectFunctionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectFunctionElement(SqlParser.SelectFunctionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpressionElement(SqlParser.SelectExpressionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpressionElement(SqlParser.SelectExpressionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link SqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoVariables(SqlParser.SelectIntoVariablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link SqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoVariables(SqlParser.SelectIntoVariablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link SqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoDumpFile(SqlParser.SelectIntoDumpFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link SqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoDumpFile(SqlParser.SelectIntoDumpFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link SqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoTextFile(SqlParser.SelectIntoTextFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link SqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoTextFile(SqlParser.SelectIntoTextFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectFieldsInto(SqlParser.SelectFieldsIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectFieldsInto(SqlParser.SelectFieldsIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectLinesInto(SqlParser.SelectLinesIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectLinesInto(SqlParser.SelectLinesIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SqlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(SqlParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(SqlParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(SqlParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(SqlParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(SqlParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(SqlParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void enterGroupByItem(SqlParser.GroupByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void exitGroupByItem(SqlParser.GroupByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(SqlParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(SqlParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 */
	void enterLimitClauseAtom(SqlParser.LimitClauseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 */
	void exitLimitClauseAtom(SqlParser.LimitClauseAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void enterStartTransaction(SqlParser.StartTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void exitStartTransaction(SqlParser.StartTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#beginWork}.
	 * @param ctx the parse tree
	 */
	void enterBeginWork(SqlParser.BeginWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#beginWork}.
	 * @param ctx the parse tree
	 */
	void exitBeginWork(SqlParser.BeginWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#commitWork}.
	 * @param ctx the parse tree
	 */
	void enterCommitWork(SqlParser.CommitWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#commitWork}.
	 * @param ctx the parse tree
	 */
	void exitCommitWork(SqlParser.CommitWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#rollbackWork}.
	 * @param ctx the parse tree
	 */
	void enterRollbackWork(SqlParser.RollbackWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#rollbackWork}.
	 * @param ctx the parse tree
	 */
	void exitRollbackWork(SqlParser.RollbackWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#savepointStatement}.
	 * @param ctx the parse tree
	 */
	void enterSavepointStatement(SqlParser.SavepointStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#savepointStatement}.
	 * @param ctx the parse tree
	 */
	void exitSavepointStatement(SqlParser.SavepointStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#rollbackStatement}.
	 * @param ctx the parse tree
	 */
	void enterRollbackStatement(SqlParser.RollbackStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#rollbackStatement}.
	 * @param ctx the parse tree
	 */
	void exitRollbackStatement(SqlParser.RollbackStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#releaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterReleaseStatement(SqlParser.ReleaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#releaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitReleaseStatement(SqlParser.ReleaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#lockTables}.
	 * @param ctx the parse tree
	 */
	void enterLockTables(SqlParser.LockTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#lockTables}.
	 * @param ctx the parse tree
	 */
	void exitLockTables(SqlParser.LockTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unlockTables}.
	 * @param ctx the parse tree
	 */
	void enterUnlockTables(SqlParser.UnlockTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unlockTables}.
	 * @param ctx the parse tree
	 */
	void exitUnlockTables(SqlParser.UnlockTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#setAutocommitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetAutocommitStatement(SqlParser.SetAutocommitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#setAutocommitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetAutocommitStatement(SqlParser.SetAutocommitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#setTransactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetTransactionStatement(SqlParser.SetTransactionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#setTransactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetTransactionStatement(SqlParser.SetTransactionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void enterTransactionMode(SqlParser.TransactionModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void exitTransactionMode(SqlParser.TransactionModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#lockTableElement}.
	 * @param ctx the parse tree
	 */
	void enterLockTableElement(SqlParser.LockTableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#lockTableElement}.
	 * @param ctx the parse tree
	 */
	void exitLockTableElement(SqlParser.LockTableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#lockAction}.
	 * @param ctx the parse tree
	 */
	void enterLockAction(SqlParser.LockActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#lockAction}.
	 * @param ctx the parse tree
	 */
	void exitLockAction(SqlParser.LockActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#transactionOption}.
	 * @param ctx the parse tree
	 */
	void enterTransactionOption(SqlParser.TransactionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#transactionOption}.
	 * @param ctx the parse tree
	 */
	void exitTransactionOption(SqlParser.TransactionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#transactionLevel}.
	 * @param ctx the parse tree
	 */
	void enterTransactionLevel(SqlParser.TransactionLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#transactionLevel}.
	 * @param ctx the parse tree
	 */
	void exitTransactionLevel(SqlParser.TransactionLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#changeMaster}.
	 * @param ctx the parse tree
	 */
	void enterChangeMaster(SqlParser.ChangeMasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#changeMaster}.
	 * @param ctx the parse tree
	 */
	void exitChangeMaster(SqlParser.ChangeMasterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterChangeReplicationFilter(SqlParser.ChangeReplicationFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitChangeReplicationFilter(SqlParser.ChangeReplicationFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#purgeBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void enterPurgeBinaryLogs(SqlParser.PurgeBinaryLogsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#purgeBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void exitPurgeBinaryLogs(SqlParser.PurgeBinaryLogsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#resetMaster}.
	 * @param ctx the parse tree
	 */
	void enterResetMaster(SqlParser.ResetMasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#resetMaster}.
	 * @param ctx the parse tree
	 */
	void exitResetMaster(SqlParser.ResetMasterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#resetSlave}.
	 * @param ctx the parse tree
	 */
	void enterResetSlave(SqlParser.ResetSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#resetSlave}.
	 * @param ctx the parse tree
	 */
	void exitResetSlave(SqlParser.ResetSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#startSlave}.
	 * @param ctx the parse tree
	 */
	void enterStartSlave(SqlParser.StartSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#startSlave}.
	 * @param ctx the parse tree
	 */
	void exitStartSlave(SqlParser.StartSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#stopSlave}.
	 * @param ctx the parse tree
	 */
	void enterStopSlave(SqlParser.StopSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#stopSlave}.
	 * @param ctx the parse tree
	 */
	void exitStopSlave(SqlParser.StopSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#startGroupReplication}.
	 * @param ctx the parse tree
	 */
	void enterStartGroupReplication(SqlParser.StartGroupReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#startGroupReplication}.
	 * @param ctx the parse tree
	 */
	void exitStartGroupReplication(SqlParser.StartGroupReplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 */
	void enterStopGroupReplication(SqlParser.StopGroupReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 */
	void exitStopGroupReplication(SqlParser.StopGroupReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterStringOption}
	 * labeled alternative in {@link SqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterStringOption(SqlParser.MasterStringOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterStringOption}
	 * labeled alternative in {@link SqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterStringOption(SqlParser.MasterStringOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterDecimalOption}
	 * labeled alternative in {@link SqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterDecimalOption(SqlParser.MasterDecimalOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterDecimalOption}
	 * labeled alternative in {@link SqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterDecimalOption(SqlParser.MasterDecimalOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterBoolOption}
	 * labeled alternative in {@link SqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterBoolOption(SqlParser.MasterBoolOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterBoolOption}
	 * labeled alternative in {@link SqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterBoolOption(SqlParser.MasterBoolOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterRealOption}
	 * labeled alternative in {@link SqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterRealOption(SqlParser.MasterRealOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterRealOption}
	 * labeled alternative in {@link SqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterRealOption(SqlParser.MasterRealOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterUidListOption}
	 * labeled alternative in {@link SqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterUidListOption(SqlParser.MasterUidListOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterUidListOption}
	 * labeled alternative in {@link SqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterUidListOption(SqlParser.MasterUidListOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#stringMasterOption}.
	 * @param ctx the parse tree
	 */
	void enterStringMasterOption(SqlParser.StringMasterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#stringMasterOption}.
	 * @param ctx the parse tree
	 */
	void exitStringMasterOption(SqlParser.StringMasterOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#decimalMasterOption}.
	 * @param ctx the parse tree
	 */
	void enterDecimalMasterOption(SqlParser.DecimalMasterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#decimalMasterOption}.
	 * @param ctx the parse tree
	 */
	void exitDecimalMasterOption(SqlParser.DecimalMasterOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#boolMasterOption}.
	 * @param ctx the parse tree
	 */
	void enterBoolMasterOption(SqlParser.BoolMasterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#boolMasterOption}.
	 * @param ctx the parse tree
	 */
	void exitBoolMasterOption(SqlParser.BoolMasterOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void enterChannelOption(SqlParser.ChannelOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void exitChannelOption(SqlParser.ChannelOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doDbReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterDoDbReplication(SqlParser.DoDbReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doDbReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitDoDbReplication(SqlParser.DoDbReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ignoreDbReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreDbReplication(SqlParser.IgnoreDbReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ignoreDbReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreDbReplication(SqlParser.IgnoreDbReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doTableReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterDoTableReplication(SqlParser.DoTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doTableReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitDoTableReplication(SqlParser.DoTableReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ignoreTableReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreTableReplication(SqlParser.IgnoreTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ignoreTableReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreTableReplication(SqlParser.IgnoreTableReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wildDoTableReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterWildDoTableReplication(SqlParser.WildDoTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wildDoTableReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitWildDoTableReplication(SqlParser.WildDoTableReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wildIgnoreTableReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterWildIgnoreTableReplication(SqlParser.WildIgnoreTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wildIgnoreTableReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitWildIgnoreTableReplication(SqlParser.WildIgnoreTableReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rewriteDbReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterRewriteDbReplication(SqlParser.RewriteDbReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rewriteDbReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitRewriteDbReplication(SqlParser.RewriteDbReplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tablePair}.
	 * @param ctx the parse tree
	 */
	void enterTablePair(SqlParser.TablePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tablePair}.
	 * @param ctx the parse tree
	 */
	void exitTablePair(SqlParser.TablePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#threadType}.
	 * @param ctx the parse tree
	 */
	void enterThreadType(SqlParser.ThreadTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#threadType}.
	 * @param ctx the parse tree
	 */
	void exitThreadType(SqlParser.ThreadTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtidsUntilOption}
	 * labeled alternative in {@link SqlParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterGtidsUntilOption(SqlParser.GtidsUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtidsUntilOption}
	 * labeled alternative in {@link SqlParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitGtidsUntilOption(SqlParser.GtidsUntilOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterLogUntilOption}
	 * labeled alternative in {@link SqlParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterLogUntilOption(SqlParser.MasterLogUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterLogUntilOption}
	 * labeled alternative in {@link SqlParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterLogUntilOption(SqlParser.MasterLogUntilOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relayLogUntilOption}
	 * labeled alternative in {@link SqlParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterRelayLogUntilOption(SqlParser.RelayLogUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relayLogUntilOption}
	 * labeled alternative in {@link SqlParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitRelayLogUntilOption(SqlParser.RelayLogUntilOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlGapsUntilOption}
	 * labeled alternative in {@link SqlParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterSqlGapsUntilOption(SqlParser.SqlGapsUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlGapsUntilOption}
	 * labeled alternative in {@link SqlParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitSqlGapsUntilOption(SqlParser.SqlGapsUntilOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code userConnectionOption}
	 * labeled alternative in {@link SqlParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterUserConnectionOption(SqlParser.UserConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code userConnectionOption}
	 * labeled alternative in {@link SqlParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitUserConnectionOption(SqlParser.UserConnectionOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passwordConnectionOption}
	 * labeled alternative in {@link SqlParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterPasswordConnectionOption(SqlParser.PasswordConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passwordConnectionOption}
	 * labeled alternative in {@link SqlParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitPasswordConnectionOption(SqlParser.PasswordConnectionOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultAuthConnectionOption}
	 * labeled alternative in {@link SqlParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterDefaultAuthConnectionOption(SqlParser.DefaultAuthConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultAuthConnectionOption}
	 * labeled alternative in {@link SqlParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitDefaultAuthConnectionOption(SqlParser.DefaultAuthConnectionOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pluginDirConnectionOption}
	 * labeled alternative in {@link SqlParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterPluginDirConnectionOption(SqlParser.PluginDirConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pluginDirConnectionOption}
	 * labeled alternative in {@link SqlParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitPluginDirConnectionOption(SqlParser.PluginDirConnectionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#gtuidSet}.
	 * @param ctx the parse tree
	 */
	void enterGtuidSet(SqlParser.GtuidSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#gtuidSet}.
	 * @param ctx the parse tree
	 */
	void exitGtuidSet(SqlParser.GtuidSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xaStartTransaction}.
	 * @param ctx the parse tree
	 */
	void enterXaStartTransaction(SqlParser.XaStartTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xaStartTransaction}.
	 * @param ctx the parse tree
	 */
	void exitXaStartTransaction(SqlParser.XaStartTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xaEndTransaction}.
	 * @param ctx the parse tree
	 */
	void enterXaEndTransaction(SqlParser.XaEndTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xaEndTransaction}.
	 * @param ctx the parse tree
	 */
	void exitXaEndTransaction(SqlParser.XaEndTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xaPrepareStatement}.
	 * @param ctx the parse tree
	 */
	void enterXaPrepareStatement(SqlParser.XaPrepareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xaPrepareStatement}.
	 * @param ctx the parse tree
	 */
	void exitXaPrepareStatement(SqlParser.XaPrepareStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xaCommitWork}.
	 * @param ctx the parse tree
	 */
	void enterXaCommitWork(SqlParser.XaCommitWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xaCommitWork}.
	 * @param ctx the parse tree
	 */
	void exitXaCommitWork(SqlParser.XaCommitWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xaRollbackWork}.
	 * @param ctx the parse tree
	 */
	void enterXaRollbackWork(SqlParser.XaRollbackWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xaRollbackWork}.
	 * @param ctx the parse tree
	 */
	void exitXaRollbackWork(SqlParser.XaRollbackWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xaRecoverWork}.
	 * @param ctx the parse tree
	 */
	void enterXaRecoverWork(SqlParser.XaRecoverWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xaRecoverWork}.
	 * @param ctx the parse tree
	 */
	void exitXaRecoverWork(SqlParser.XaRecoverWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#prepareStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrepareStatement(SqlParser.PrepareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#prepareStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrepareStatement(SqlParser.PrepareStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStatement(SqlParser.ExecuteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStatement(SqlParser.ExecuteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#deallocatePrepare}.
	 * @param ctx the parse tree
	 */
	void enterDeallocatePrepare(SqlParser.DeallocatePrepareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#deallocatePrepare}.
	 * @param ctx the parse tree
	 */
	void exitDeallocatePrepare(SqlParser.DeallocatePrepareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void enterRoutineBody(SqlParser.RoutineBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void exitRoutineBody(SqlParser.RoutineBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(SqlParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(SqlParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(SqlParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(SqlParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SqlParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SqlParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterateStatement(SqlParser.IterateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterateStatement(SqlParser.IterateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void enterLeaveStatement(SqlParser.LeaveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void exitLeaveStatement(SqlParser.LeaveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(SqlParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(SqlParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(SqlParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(SqlParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SqlParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SqlParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SqlParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SqlParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CloseCursor}
	 * labeled alternative in {@link SqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterCloseCursor(SqlParser.CloseCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CloseCursor}
	 * labeled alternative in {@link SqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitCloseCursor(SqlParser.CloseCursorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FetchCursor}
	 * labeled alternative in {@link SqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterFetchCursor(SqlParser.FetchCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FetchCursor}
	 * labeled alternative in {@link SqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitFetchCursor(SqlParser.FetchCursorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpenCursor}
	 * labeled alternative in {@link SqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterOpenCursor(SqlParser.OpenCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpenCursor}
	 * labeled alternative in {@link SqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitOpenCursor(SqlParser.OpenCursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declareVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVariable(SqlParser.DeclareVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declareVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVariable(SqlParser.DeclareVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declareCondition}.
	 * @param ctx the parse tree
	 */
	void enterDeclareCondition(SqlParser.DeclareConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declareCondition}.
	 * @param ctx the parse tree
	 */
	void exitDeclareCondition(SqlParser.DeclareConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declareCursor}.
	 * @param ctx the parse tree
	 */
	void enterDeclareCursor(SqlParser.DeclareCursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declareCursor}.
	 * @param ctx the parse tree
	 */
	void exitDeclareCursor(SqlParser.DeclareCursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declareHandler}.
	 * @param ctx the parse tree
	 */
	void enterDeclareHandler(SqlParser.DeclareHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declareHandler}.
	 * @param ctx the parse tree
	 */
	void exitDeclareHandler(SqlParser.DeclareHandlerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionCode}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionCode(SqlParser.HandlerConditionCodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionCode}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionCode(SqlParser.HandlerConditionCodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionState}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionState(SqlParser.HandlerConditionStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionState}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionState(SqlParser.HandlerConditionStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionName}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionName(SqlParser.HandlerConditionNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionName}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionName(SqlParser.HandlerConditionNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionWarning}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionWarning(SqlParser.HandlerConditionWarningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionWarning}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionWarning(SqlParser.HandlerConditionWarningContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionNotfound}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionNotfound(SqlParser.HandlerConditionNotfoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionNotfound}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionNotfound(SqlParser.HandlerConditionNotfoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionException}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionException(SqlParser.HandlerConditionExceptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionException}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionException(SqlParser.HandlerConditionExceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#procedureSqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureSqlStatement(SqlParser.ProcedureSqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#procedureSqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureSqlStatement(SqlParser.ProcedureSqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#caseAlternative}.
	 * @param ctx the parse tree
	 */
	void enterCaseAlternative(SqlParser.CaseAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#caseAlternative}.
	 * @param ctx the parse tree
	 */
	void exitCaseAlternative(SqlParser.CaseAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#elifAlternative}.
	 * @param ctx the parse tree
	 */
	void enterElifAlternative(SqlParser.ElifAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#elifAlternative}.
	 * @param ctx the parse tree
	 */
	void exitElifAlternative(SqlParser.ElifAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterUserMysqlV56}
	 * labeled alternative in {@link SqlParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserMysqlV56(SqlParser.AlterUserMysqlV56Context ctx);
	/**
	 * Exit a parse tree produced by the {@code alterUserMysqlV56}
	 * labeled alternative in {@link SqlParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserMysqlV56(SqlParser.AlterUserMysqlV56Context ctx);
	/**
	 * Enter a parse tree produced by the {@code alterUserMysqlV57}
	 * labeled alternative in {@link SqlParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserMysqlV57(SqlParser.AlterUserMysqlV57Context ctx);
	/**
	 * Exit a parse tree produced by the {@code alterUserMysqlV57}
	 * labeled alternative in {@link SqlParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserMysqlV57(SqlParser.AlterUserMysqlV57Context ctx);
	/**
	 * Enter a parse tree produced by the {@code createUserMysqlV56}
	 * labeled alternative in {@link SqlParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserMysqlV56(SqlParser.CreateUserMysqlV56Context ctx);
	/**
	 * Exit a parse tree produced by the {@code createUserMysqlV56}
	 * labeled alternative in {@link SqlParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserMysqlV56(SqlParser.CreateUserMysqlV56Context ctx);
	/**
	 * Enter a parse tree produced by the {@code createUserMysqlV57}
	 * labeled alternative in {@link SqlParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserMysqlV57(SqlParser.CreateUserMysqlV57Context ctx);
	/**
	 * Exit a parse tree produced by the {@code createUserMysqlV57}
	 * labeled alternative in {@link SqlParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserMysqlV57(SqlParser.CreateUserMysqlV57Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void enterDropUser(SqlParser.DropUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void exitDropUser(SqlParser.DropUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#grantStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantStatement(SqlParser.GrantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#grantStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantStatement(SqlParser.GrantStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#roleOption}.
	 * @param ctx the parse tree
	 */
	void enterRoleOption(SqlParser.RoleOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#roleOption}.
	 * @param ctx the parse tree
	 */
	void exitRoleOption(SqlParser.RoleOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#grantProxy}.
	 * @param ctx the parse tree
	 */
	void enterGrantProxy(SqlParser.GrantProxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#grantProxy}.
	 * @param ctx the parse tree
	 */
	void exitGrantProxy(SqlParser.GrantProxyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#renameUser}.
	 * @param ctx the parse tree
	 */
	void enterRenameUser(SqlParser.RenameUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#renameUser}.
	 * @param ctx the parse tree
	 */
	void exitRenameUser(SqlParser.RenameUserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code detailRevoke}
	 * labeled alternative in {@link SqlParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void enterDetailRevoke(SqlParser.DetailRevokeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code detailRevoke}
	 * labeled alternative in {@link SqlParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void exitDetailRevoke(SqlParser.DetailRevokeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shortRevoke}
	 * labeled alternative in {@link SqlParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void enterShortRevoke(SqlParser.ShortRevokeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shortRevoke}
	 * labeled alternative in {@link SqlParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void exitShortRevoke(SqlParser.ShortRevokeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roleRevoke}
	 * labeled alternative in {@link SqlParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void enterRoleRevoke(SqlParser.RoleRevokeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roleRevoke}
	 * labeled alternative in {@link SqlParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void exitRoleRevoke(SqlParser.RoleRevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#revokeProxy}.
	 * @param ctx the parse tree
	 */
	void enterRevokeProxy(SqlParser.RevokeProxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#revokeProxy}.
	 * @param ctx the parse tree
	 */
	void exitRevokeProxy(SqlParser.RevokeProxyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#setPasswordStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetPasswordStatement(SqlParser.SetPasswordStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#setPasswordStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetPasswordStatement(SqlParser.SetPasswordStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#userSpecification}.
	 * @param ctx the parse tree
	 */
	void enterUserSpecification(SqlParser.UserSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#userSpecification}.
	 * @param ctx the parse tree
	 */
	void exitUserSpecification(SqlParser.UserSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passwordAuthOption}
	 * labeled alternative in {@link SqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterPasswordAuthOption(SqlParser.PasswordAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passwordAuthOption}
	 * labeled alternative in {@link SqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitPasswordAuthOption(SqlParser.PasswordAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAuthOption}
	 * labeled alternative in {@link SqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterStringAuthOption(SqlParser.StringAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAuthOption}
	 * labeled alternative in {@link SqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitStringAuthOption(SqlParser.StringAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashAuthOption}
	 * labeled alternative in {@link SqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterHashAuthOption(SqlParser.HashAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashAuthOption}
	 * labeled alternative in {@link SqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitHashAuthOption(SqlParser.HashAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleAuthOption}
	 * labeled alternative in {@link SqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAuthOption(SqlParser.SimpleAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleAuthOption}
	 * labeled alternative in {@link SqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAuthOption(SqlParser.SimpleAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tlsOption}.
	 * @param ctx the parse tree
	 */
	void enterTlsOption(SqlParser.TlsOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tlsOption}.
	 * @param ctx the parse tree
	 */
	void exitTlsOption(SqlParser.TlsOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#userResourceOption}.
	 * @param ctx the parse tree
	 */
	void enterUserResourceOption(SqlParser.UserResourceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#userResourceOption}.
	 * @param ctx the parse tree
	 */
	void exitUserResourceOption(SqlParser.UserResourceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#userPasswordOption}.
	 * @param ctx the parse tree
	 */
	void enterUserPasswordOption(SqlParser.UserPasswordOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#userPasswordOption}.
	 * @param ctx the parse tree
	 */
	void exitUserPasswordOption(SqlParser.UserPasswordOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#userLockOption}.
	 * @param ctx the parse tree
	 */
	void enterUserLockOption(SqlParser.UserLockOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#userLockOption}.
	 * @param ctx the parse tree
	 */
	void exitUserLockOption(SqlParser.UserLockOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#privelegeClause}.
	 * @param ctx the parse tree
	 */
	void enterPrivelegeClause(SqlParser.PrivelegeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#privelegeClause}.
	 * @param ctx the parse tree
	 */
	void exitPrivelegeClause(SqlParser.PrivelegeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#privilege}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege(SqlParser.PrivilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#privilege}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege(SqlParser.PrivilegeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentSchemaPriviLevel}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterCurrentSchemaPriviLevel(SqlParser.CurrentSchemaPriviLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentSchemaPriviLevel}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitCurrentSchemaPriviLevel(SqlParser.CurrentSchemaPriviLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalPrivLevel}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterGlobalPrivLevel(SqlParser.GlobalPrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalPrivLevel}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitGlobalPrivLevel(SqlParser.GlobalPrivLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definiteSchemaPrivLevel}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteSchemaPrivLevel(SqlParser.DefiniteSchemaPrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteSchemaPrivLevel}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteSchemaPrivLevel(SqlParser.DefiniteSchemaPrivLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definiteFullTablePrivLevel}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteFullTablePrivLevel(SqlParser.DefiniteFullTablePrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteFullTablePrivLevel}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteFullTablePrivLevel(SqlParser.DefiniteFullTablePrivLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definiteFullTablePrivLevel2}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteFullTablePrivLevel2(SqlParser.DefiniteFullTablePrivLevel2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteFullTablePrivLevel2}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteFullTablePrivLevel2(SqlParser.DefiniteFullTablePrivLevel2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code definiteTablePrivLevel}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteTablePrivLevel(SqlParser.DefiniteTablePrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteTablePrivLevel}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteTablePrivLevel(SqlParser.DefiniteTablePrivLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#renameUserClause}.
	 * @param ctx the parse tree
	 */
	void enterRenameUserClause(SqlParser.RenameUserClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#renameUserClause}.
	 * @param ctx the parse tree
	 */
	void exitRenameUserClause(SqlParser.RenameUserClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeTable(SqlParser.AnalyzeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeTable(SqlParser.AnalyzeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void enterCheckTable(SqlParser.CheckTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void exitCheckTable(SqlParser.CheckTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void enterChecksumTable(SqlParser.ChecksumTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void exitChecksumTable(SqlParser.ChecksumTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void enterOptimizeTable(SqlParser.OptimizeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void exitOptimizeTable(SqlParser.OptimizeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(SqlParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(SqlParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#checkTableOption}.
	 * @param ctx the parse tree
	 */
	void enterCheckTableOption(SqlParser.CheckTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#checkTableOption}.
	 * @param ctx the parse tree
	 */
	void exitCheckTableOption(SqlParser.CheckTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createUdfunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateUdfunction(SqlParser.CreateUdfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createUdfunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateUdfunction(SqlParser.CreateUdfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void enterInstallPlugin(SqlParser.InstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void exitInstallPlugin(SqlParser.InstallPluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void enterUninstallPlugin(SqlParser.UninstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void exitUninstallPlugin(SqlParser.UninstallPluginContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setVariable}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(SqlParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setVariable}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(SqlParser.SetVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setCharset}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetCharset(SqlParser.SetCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setCharset}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetCharset(SqlParser.SetCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNames}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetNames(SqlParser.SetNamesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNames}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetNames(SqlParser.SetNamesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setPassword}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetPassword(SqlParser.SetPasswordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setPassword}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetPassword(SqlParser.SetPasswordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(SqlParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(SqlParser.SetTransactionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setAutocommit}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetAutocommit(SqlParser.SetAutocommitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setAutocommit}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetAutocommit(SqlParser.SetAutocommitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNewValueInsideTrigger}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetNewValueInsideTrigger(SqlParser.SetNewValueInsideTriggerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNewValueInsideTrigger}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetNewValueInsideTrigger(SqlParser.SetNewValueInsideTriggerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showMasterLogs}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowMasterLogs(SqlParser.ShowMasterLogsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showMasterLogs}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowMasterLogs(SqlParser.ShowMasterLogsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showLogEvents}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowLogEvents(SqlParser.ShowLogEventsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showLogEvents}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowLogEvents(SqlParser.ShowLogEventsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showObjectFilter}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowObjectFilter(SqlParser.ShowObjectFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showObjectFilter}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowObjectFilter(SqlParser.ShowObjectFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(SqlParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(SqlParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateDb}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateDb(SqlParser.ShowCreateDbContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateDb}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateDb(SqlParser.ShowCreateDbContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateFullIdObject}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateFullIdObject(SqlParser.ShowCreateFullIdObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateFullIdObject}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateFullIdObject(SqlParser.ShowCreateFullIdObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateUser}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateUser(SqlParser.ShowCreateUserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateUser}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateUser(SqlParser.ShowCreateUserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showEngine}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowEngine(SqlParser.ShowEngineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showEngine}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowEngine(SqlParser.ShowEngineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showGlobalInfo}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowGlobalInfo(SqlParser.ShowGlobalInfoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showGlobalInfo}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowGlobalInfo(SqlParser.ShowGlobalInfoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showErrors}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowErrors(SqlParser.ShowErrorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showErrors}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowErrors(SqlParser.ShowErrorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCountErrors}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCountErrors(SqlParser.ShowCountErrorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCountErrors}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCountErrors(SqlParser.ShowCountErrorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showSchemaFilter}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowSchemaFilter(SqlParser.ShowSchemaFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showSchemaFilter}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowSchemaFilter(SqlParser.ShowSchemaFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showRoutine}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowRoutine(SqlParser.ShowRoutineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showRoutine}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowRoutine(SqlParser.ShowRoutineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showGrants}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowGrants(SqlParser.ShowGrantsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showGrants}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowGrants(SqlParser.ShowGrantsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowIndexes(SqlParser.ShowIndexesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowIndexes(SqlParser.ShowIndexesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showOpenTables}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowOpenTables(SqlParser.ShowOpenTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showOpenTables}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowOpenTables(SqlParser.ShowOpenTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showProfile}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowProfile(SqlParser.ShowProfileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showProfile}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowProfile(SqlParser.ShowProfileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showSlaveStatus}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowSlaveStatus(SqlParser.ShowSlaveStatusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showSlaveStatus}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowSlaveStatus(SqlParser.ShowSlaveStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#variableClause}.
	 * @param ctx the parse tree
	 */
	void enterVariableClause(SqlParser.VariableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#variableClause}.
	 * @param ctx the parse tree
	 */
	void exitVariableClause(SqlParser.VariableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#showCommonEntity}.
	 * @param ctx the parse tree
	 */
	void enterShowCommonEntity(SqlParser.ShowCommonEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#showCommonEntity}.
	 * @param ctx the parse tree
	 */
	void exitShowCommonEntity(SqlParser.ShowCommonEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void enterShowFilter(SqlParser.ShowFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void exitShowFilter(SqlParser.ShowFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#showGlobalInfoClause}.
	 * @param ctx the parse tree
	 */
	void enterShowGlobalInfoClause(SqlParser.ShowGlobalInfoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#showGlobalInfoClause}.
	 * @param ctx the parse tree
	 */
	void exitShowGlobalInfoClause(SqlParser.ShowGlobalInfoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#showSchemaEntity}.
	 * @param ctx the parse tree
	 */
	void enterShowSchemaEntity(SqlParser.ShowSchemaEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#showSchemaEntity}.
	 * @param ctx the parse tree
	 */
	void exitShowSchemaEntity(SqlParser.ShowSchemaEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void enterShowProfileType(SqlParser.ShowProfileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void exitShowProfileType(SqlParser.ShowProfileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#binlogStatement}.
	 * @param ctx the parse tree
	 */
	void enterBinlogStatement(SqlParser.BinlogStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#binlogStatement}.
	 * @param ctx the parse tree
	 */
	void exitBinlogStatement(SqlParser.BinlogStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cacheIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterCacheIndexStatement(SqlParser.CacheIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cacheIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitCacheIndexStatement(SqlParser.CacheIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#flushStatement}.
	 * @param ctx the parse tree
	 */
	void enterFlushStatement(SqlParser.FlushStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#flushStatement}.
	 * @param ctx the parse tree
	 */
	void exitFlushStatement(SqlParser.FlushStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#killStatement}.
	 * @param ctx the parse tree
	 */
	void enterKillStatement(SqlParser.KillStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#killStatement}.
	 * @param ctx the parse tree
	 */
	void exitKillStatement(SqlParser.KillStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#loadIndexIntoCache}.
	 * @param ctx the parse tree
	 */
	void enterLoadIndexIntoCache(SqlParser.LoadIndexIntoCacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#loadIndexIntoCache}.
	 * @param ctx the parse tree
	 */
	void exitLoadIndexIntoCache(SqlParser.LoadIndexIntoCacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void enterResetStatement(SqlParser.ResetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void exitResetStatement(SqlParser.ResetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#shutdownStatement}.
	 * @param ctx the parse tree
	 */
	void enterShutdownStatement(SqlParser.ShutdownStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#shutdownStatement}.
	 * @param ctx the parse tree
	 */
	void exitShutdownStatement(SqlParser.ShutdownStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableIndexes}.
	 * @param ctx the parse tree
	 */
	void enterTableIndexes(SqlParser.TableIndexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableIndexes}.
	 * @param ctx the parse tree
	 */
	void exitTableIndexes(SqlParser.TableIndexesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleFlushOption}
	 * labeled alternative in {@link SqlParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFlushOption(SqlParser.SimpleFlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleFlushOption}
	 * labeled alternative in {@link SqlParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFlushOption(SqlParser.SimpleFlushOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code channelFlushOption}
	 * labeled alternative in {@link SqlParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterChannelFlushOption(SqlParser.ChannelFlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code channelFlushOption}
	 * labeled alternative in {@link SqlParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitChannelFlushOption(SqlParser.ChannelFlushOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFlushOption}
	 * labeled alternative in {@link SqlParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterTableFlushOption(SqlParser.TableFlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFlushOption}
	 * labeled alternative in {@link SqlParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitTableFlushOption(SqlParser.TableFlushOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#flushTableOption}.
	 * @param ctx the parse tree
	 */
	void enterFlushTableOption(SqlParser.FlushTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#flushTableOption}.
	 * @param ctx the parse tree
	 */
	void exitFlushTableOption(SqlParser.FlushTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#loadedTableIndexes}.
	 * @param ctx the parse tree
	 */
	void enterLoadedTableIndexes(SqlParser.LoadedTableIndexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#loadedTableIndexes}.
	 * @param ctx the parse tree
	 */
	void exitLoadedTableIndexes(SqlParser.LoadedTableIndexesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#simpleDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDescribeStatement(SqlParser.SimpleDescribeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#simpleDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDescribeStatement(SqlParser.SimpleDescribeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fullDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void enterFullDescribeStatement(SqlParser.FullDescribeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fullDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void exitFullDescribeStatement(SqlParser.FullDescribeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#helpStatement}.
	 * @param ctx the parse tree
	 */
	void enterHelpStatement(SqlParser.HelpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#helpStatement}.
	 * @param ctx the parse tree
	 */
	void exitHelpStatement(SqlParser.HelpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void enterUseStatement(SqlParser.UseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void exitUseStatement(SqlParser.UseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#signalStatement}.
	 * @param ctx the parse tree
	 */
	void enterSignalStatement(SqlParser.SignalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#signalStatement}.
	 * @param ctx the parse tree
	 */
	void exitSignalStatement(SqlParser.SignalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#resignalStatement}.
	 * @param ctx the parse tree
	 */
	void enterResignalStatement(SqlParser.ResignalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#resignalStatement}.
	 * @param ctx the parse tree
	 */
	void exitResignalStatement(SqlParser.ResignalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#signalConditionInformation}.
	 * @param ctx the parse tree
	 */
	void enterSignalConditionInformation(SqlParser.SignalConditionInformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#signalConditionInformation}.
	 * @param ctx the parse tree
	 */
	void exitSignalConditionInformation(SqlParser.SignalConditionInformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#diagnosticsStatement}.
	 * @param ctx the parse tree
	 */
	void enterDiagnosticsStatement(SqlParser.DiagnosticsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#diagnosticsStatement}.
	 * @param ctx the parse tree
	 */
	void exitDiagnosticsStatement(SqlParser.DiagnosticsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#diagnosticsConditionInformationName}.
	 * @param ctx the parse tree
	 */
	void enterDiagnosticsConditionInformationName(SqlParser.DiagnosticsConditionInformationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#diagnosticsConditionInformationName}.
	 * @param ctx the parse tree
	 */
	void exitDiagnosticsConditionInformationName(SqlParser.DiagnosticsConditionInformationNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeStatements}
	 * labeled alternative in {@link SqlParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterDescribeStatements(SqlParser.DescribeStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeStatements}
	 * labeled alternative in {@link SqlParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitDescribeStatements(SqlParser.DescribeStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeConnection}
	 * labeled alternative in {@link SqlParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterDescribeConnection(SqlParser.DescribeConnectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeConnection}
	 * labeled alternative in {@link SqlParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitDescribeConnection(SqlParser.DescribeConnectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fullId}.
	 * @param ctx the parse tree
	 */
	void enterFullId(SqlParser.FullIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fullId}.
	 * @param ctx the parse tree
	 */
	void exitFullId(SqlParser.FullIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnName(SqlParser.FullColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnName(SqlParser.FullColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#indexColumnName}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumnName(SqlParser.IndexColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#indexColumnName}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumnName(SqlParser.IndexColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#userName}.
	 * @param ctx the parse tree
	 */
	void enterUserName(SqlParser.UserNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#userName}.
	 * @param ctx the parse tree
	 */
	void exitUserName(SqlParser.UserNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#mysqlVariable}.
	 * @param ctx the parse tree
	 */
	void enterMysqlVariable(SqlParser.MysqlVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#mysqlVariable}.
	 * @param ctx the parse tree
	 */
	void exitMysqlVariable(SqlParser.MysqlVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void enterCharsetName(SqlParser.CharsetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void exitCharsetName(SqlParser.CharsetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(SqlParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(SqlParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#engineName}.
	 * @param ctx the parse tree
	 */
	void enterEngineName(SqlParser.EngineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#engineName}.
	 * @param ctx the parse tree
	 */
	void exitEngineName(SqlParser.EngineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#uuidSet}.
	 * @param ctx the parse tree
	 */
	void enterUuidSet(SqlParser.UuidSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#uuidSet}.
	 * @param ctx the parse tree
	 */
	void exitUuidSet(SqlParser.UuidSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xid}.
	 * @param ctx the parse tree
	 */
	void enterXid(SqlParser.XidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xid}.
	 * @param ctx the parse tree
	 */
	void exitXid(SqlParser.XidContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xuidStringId}.
	 * @param ctx the parse tree
	 */
	void enterXuidStringId(SqlParser.XuidStringIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xuidStringId}.
	 * @param ctx the parse tree
	 */
	void exitXuidStringId(SqlParser.XuidStringIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#authPlugin}.
	 * @param ctx the parse tree
	 */
	void enterAuthPlugin(SqlParser.AuthPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#authPlugin}.
	 * @param ctx the parse tree
	 */
	void exitAuthPlugin(SqlParser.AuthPluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(SqlParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(SqlParser.UidContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#simpleId}.
	 * @param ctx the parse tree
	 */
	void enterSimpleId(SqlParser.SimpleIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#simpleId}.
	 * @param ctx the parse tree
	 */
	void exitSimpleId(SqlParser.SimpleIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dottedId}.
	 * @param ctx the parse tree
	 */
	void enterDottedId(SqlParser.DottedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dottedId}.
	 * @param ctx the parse tree
	 */
	void exitDottedId(SqlParser.DottedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(SqlParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(SqlParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFileSizeLiteral(SqlParser.FileSizeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFileSizeLiteral(SqlParser.FileSizeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SqlParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SqlParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SqlParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SqlParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(SqlParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(SqlParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void enterNullNotnull(SqlParser.NullNotnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void exitNullNotnull(SqlParser.NullNotnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterStringDataType(SqlParser.StringDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitStringDataType(SqlParser.StringDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nationalStringDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterNationalStringDataType(SqlParser.NationalStringDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nationalStringDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitNationalStringDataType(SqlParser.NationalStringDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nationalVaryingStringDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterNationalVaryingStringDataType(SqlParser.NationalVaryingStringDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nationalVaryingStringDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitNationalVaryingStringDataType(SqlParser.NationalVaryingStringDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dimensionDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDimensionDataType(SqlParser.DimensionDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimensionDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDimensionDataType(SqlParser.DimensionDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDataType(SqlParser.SimpleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDataType(SqlParser.SimpleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collectionDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterCollectionDataType(SqlParser.CollectionDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collectionDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitCollectionDataType(SqlParser.CollectionDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code spatialDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterSpatialDataType(SqlParser.SpatialDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code spatialDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitSpatialDataType(SqlParser.SpatialDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code longVarcharDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterLongVarcharDataType(SqlParser.LongVarcharDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code longVarcharDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitLongVarcharDataType(SqlParser.LongVarcharDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code longVarbinaryDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterLongVarbinaryDataType(SqlParser.LongVarbinaryDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code longVarbinaryDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitLongVarbinaryDataType(SqlParser.LongVarbinaryDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#collectionOptions}.
	 * @param ctx the parse tree
	 */
	void enterCollectionOptions(SqlParser.CollectionOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#collectionOptions}.
	 * @param ctx the parse tree
	 */
	void exitCollectionOptions(SqlParser.CollectionOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#convertedDataType}.
	 * @param ctx the parse tree
	 */
	void enterConvertedDataType(SqlParser.ConvertedDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#convertedDataType}.
	 * @param ctx the parse tree
	 */
	void exitConvertedDataType(SqlParser.ConvertedDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthOneDimension(SqlParser.LengthOneDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthOneDimension(SqlParser.LengthOneDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthTwoDimension(SqlParser.LengthTwoDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthTwoDimension(SqlParser.LengthTwoDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthTwoOptionalDimension(SqlParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthTwoOptionalDimension(SqlParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#uidList}.
	 * @param ctx the parse tree
	 */
	void enterUidList(SqlParser.UidListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#uidList}.
	 * @param ctx the parse tree
	 */
	void exitUidList(SqlParser.UidListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tables}.
	 * @param ctx the parse tree
	 */
	void enterTables(SqlParser.TablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tables}.
	 * @param ctx the parse tree
	 */
	void exitTables(SqlParser.TablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#indexColumnNames}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumnNames(SqlParser.IndexColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#indexColumnNames}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumnNames(SqlParser.IndexColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(SqlParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(SqlParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expressionsWithDefaults}.
	 * @param ctx the parse tree
	 */
	void enterExpressionsWithDefaults(SqlParser.ExpressionsWithDefaultsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expressionsWithDefaults}.
	 * @param ctx the parse tree
	 */
	void exitExpressionsWithDefaults(SqlParser.ExpressionsWithDefaultsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterConstants(SqlParser.ConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitConstants(SqlParser.ConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#simpleStrings}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStrings(SqlParser.SimpleStringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#simpleStrings}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStrings(SqlParser.SimpleStringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#userVariables}.
	 * @param ctx the parse tree
	 */
	void enterUserVariables(SqlParser.UserVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#userVariables}.
	 * @param ctx the parse tree
	 */
	void exitUserVariables(SqlParser.UserVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(SqlParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(SqlParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#currentTimestamp}.
	 * @param ctx the parse tree
	 */
	void enterCurrentTimestamp(SqlParser.CurrentTimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#currentTimestamp}.
	 * @param ctx the parse tree
	 */
	void exitCurrentTimestamp(SqlParser.CurrentTimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expressionOrDefault}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOrDefault(SqlParser.ExpressionOrDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expressionOrDefault}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOrDefault(SqlParser.ExpressionOrDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(SqlParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(SqlParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(SqlParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(SqlParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSpecificFunctionCall(SqlParser.SpecificFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSpecificFunctionCall(SqlParser.SpecificFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunctionCall(SqlParser.AggregateFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunctionCall(SqlParser.AggregateFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonAggregateFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterNonAggregateFunctionCall(SqlParser.NonAggregateFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonAggregateFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitNonAggregateFunctionCall(SqlParser.NonAggregateFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunctionCall(SqlParser.ScalarFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunctionCall(SqlParser.ScalarFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterUdfFunctionCall(SqlParser.UdfFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitUdfFunctionCall(SqlParser.UdfFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPasswordFunctionCall(SqlParser.PasswordFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPasswordFunctionCall(SqlParser.PasswordFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFunctionCall(SqlParser.SimpleFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFunctionCall(SqlParser.SimpleFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeFunctionCall(SqlParser.DataTypeFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeFunctionCall(SqlParser.DataTypeFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterValuesFunctionCall(SqlParser.ValuesFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitValuesFunctionCall(SqlParser.ValuesFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseExpressionFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpressionFunctionCall(SqlParser.CaseExpressionFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseExpressionFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpressionFunctionCall(SqlParser.CaseExpressionFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCaseFunctionCall(SqlParser.CaseFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCaseFunctionCall(SqlParser.CaseFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunctionCall(SqlParser.CharFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunctionCall(SqlParser.CharFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunctionCall(SqlParser.PositionFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunctionCall(SqlParser.PositionFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstrFunctionCall(SqlParser.SubstrFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstrFunctionCall(SqlParser.SubstrFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunctionCall(SqlParser.TrimFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunctionCall(SqlParser.TrimFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterWeightFunctionCall(SqlParser.WeightFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitWeightFunctionCall(SqlParser.WeightFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunctionCall(SqlParser.ExtractFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunctionCall(SqlParser.ExtractFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterGetFormatFunctionCall(SqlParser.GetFormatFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitGetFormatFunctionCall(SqlParser.GetFormatFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonValueFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterJsonValueFunctionCall(SqlParser.JsonValueFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonValueFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitJsonValueFunctionCall(SqlParser.JsonValueFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 */
	void enterCaseFuncAlternative(SqlParser.CaseFuncAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 */
	void exitCaseFuncAlternative(SqlParser.CaseFuncAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link SqlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void enterLevelWeightList(SqlParser.LevelWeightListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link SqlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void exitLevelWeightList(SqlParser.LevelWeightListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link SqlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void enterLevelWeightRange(SqlParser.LevelWeightRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link SqlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void exitLevelWeightRange(SqlParser.LevelWeightRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void enterLevelInWeightListElement(SqlParser.LevelInWeightListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void exitLevelInWeightListElement(SqlParser.LevelInWeightListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateWindowedFunction(SqlParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateWindowedFunction(SqlParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#nonAggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void enterNonAggregateWindowedFunction(SqlParser.NonAggregateWindowedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#nonAggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void exitNonAggregateWindowedFunction(SqlParser.NonAggregateWindowedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#overClause}.
	 * @param ctx the parse tree
	 */
	void enterOverClause(SqlParser.OverClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#overClause}.
	 * @param ctx the parse tree
	 */
	void exitOverClause(SqlParser.OverClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowSpec(SqlParser.WindowSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowSpec(SqlParser.WindowSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#windowName}.
	 * @param ctx the parse tree
	 */
	void enterWindowName(SqlParser.WindowNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#windowName}.
	 * @param ctx the parse tree
	 */
	void exitWindowName(SqlParser.WindowNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void enterFrameClause(SqlParser.FrameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void exitFrameClause(SqlParser.FrameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#frameUnits}.
	 * @param ctx the parse tree
	 */
	void enterFrameUnits(SqlParser.FrameUnitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#frameUnits}.
	 * @param ctx the parse tree
	 */
	void exitFrameUnits(SqlParser.FrameUnitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#frameExtent}.
	 * @param ctx the parse tree
	 */
	void enterFrameExtent(SqlParser.FrameExtentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#frameExtent}.
	 * @param ctx the parse tree
	 */
	void exitFrameExtent(SqlParser.FrameExtentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void enterFrameBetween(SqlParser.FrameBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void exitFrameBetween(SqlParser.FrameBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#frameRange}.
	 * @param ctx the parse tree
	 */
	void enterFrameRange(SqlParser.FrameRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#frameRange}.
	 * @param ctx the parse tree
	 */
	void exitFrameRange(SqlParser.FrameRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionClause(SqlParser.PartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionClause(SqlParser.PartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunctionName(SqlParser.ScalarFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunctionName(SqlParser.ScalarFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 */
	void enterPasswordFunctionClause(SqlParser.PasswordFunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 */
	void exitPasswordFunctionClause(SqlParser.PasswordFunctionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(SqlParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(SqlParser.FunctionArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(SqlParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(SqlParser.FunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpression(SqlParser.IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpression(SqlParser.IsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SqlParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SqlParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(SqlParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(SqlParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPredicateExpression(SqlParser.PredicateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPredicateExpression(SqlParser.PredicateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterSoundsLikePredicate(SqlParser.SoundsLikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitSoundsLikePredicate(SqlParser.SoundsLikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAtomPredicate(SqlParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAtomPredicate(SqlParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryComparisonPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryComparisonPredicate(SqlParser.SubqueryComparisonPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryComparisonPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryComparisonPredicate(SqlParser.SubqueryComparisonPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonMemberOfPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterJsonMemberOfPredicate(SqlParser.JsonMemberOfPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonMemberOfPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitJsonMemberOfPredicate(SqlParser.JsonMemberOfPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryComparisonPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComparisonPredicate(SqlParser.BinaryComparisonPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryComparisonPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComparisonPredicate(SqlParser.BinaryComparisonPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(SqlParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(SqlParser.InPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBetweenPredicate(SqlParser.BetweenPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBetweenPredicate(SqlParser.BetweenPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterIsNullPredicate(SqlParser.IsNullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitIsNullPredicate(SqlParser.IsNullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLikePredicate(SqlParser.LikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLikePredicate(SqlParser.LikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterRegexpPredicate(SqlParser.RegexpPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitRegexpPredicate(SqlParser.RegexpPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionAtom(SqlParser.UnaryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionAtom(SqlParser.UnaryExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterCollateExpressionAtom(SqlParser.CollateExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitCollateExpressionAtom(SqlParser.CollateExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMysqlVariableExpressionAtom(SqlParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMysqlVariableExpressionAtom(SqlParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpressionAtom(SqlParser.NestedExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpressionAtom(SqlParser.NestedExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterNestedRowExpressionAtom(SqlParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitNestedRowExpressionAtom(SqlParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionAtom(SqlParser.MathExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionAtom(SqlParser.MathExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code existsExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterExistsExpressionAtom(SqlParser.ExistsExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existsExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitExistsExpressionAtom(SqlParser.ExistsExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpressionAtom(SqlParser.IntervalExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpressionAtom(SqlParser.IntervalExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterJsonExpressionAtom(SqlParser.JsonExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitJsonExpressionAtom(SqlParser.JsonExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpressionAtom(SqlParser.SubqueryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpressionAtom(SqlParser.SubqueryExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpressionAtom(SqlParser.ConstantExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpressionAtom(SqlParser.ConstantExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpressionAtom(SqlParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpressionAtom(SqlParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionAtom(SqlParser.BinaryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionAtom(SqlParser.BinaryExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnNameExpressionAtom(SqlParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnNameExpressionAtom(SqlParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterBitExpressionAtom(SqlParser.BitExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitBitExpressionAtom(SqlParser.BitExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(SqlParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(SqlParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SqlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(SqlParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(SqlParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void enterBitOperator(SqlParser.BitOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void exitBitOperator(SqlParser.BitOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathOperator(SqlParser.MathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathOperator(SqlParser.MathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonOperator(SqlParser.JsonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonOperator(SqlParser.JsonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#charsetNameBase}.
	 * @param ctx the parse tree
	 */
	void enterCharsetNameBase(SqlParser.CharsetNameBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#charsetNameBase}.
	 * @param ctx the parse tree
	 */
	void exitCharsetNameBase(SqlParser.CharsetNameBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 */
	void enterTransactionLevelBase(SqlParser.TransactionLevelBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 */
	void exitTransactionLevelBase(SqlParser.TransactionLevelBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#privilegesBase}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegesBase(SqlParser.PrivilegesBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#privilegesBase}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegesBase(SqlParser.PrivilegesBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 */
	void enterIntervalTypeBase(SqlParser.IntervalTypeBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 */
	void exitIntervalTypeBase(SqlParser.IntervalTypeBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dataTypeBase}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeBase(SqlParser.DataTypeBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dataTypeBase}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeBase(SqlParser.DataTypeBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 */
	void enterKeywordsCanBeId(SqlParser.KeywordsCanBeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 */
	void exitKeywordsCanBeId(SqlParser.KeywordsCanBeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#functionNameBase}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNameBase(SqlParser.FunctionNameBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#functionNameBase}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNameBase(SqlParser.FunctionNameBaseContext ctx);
}