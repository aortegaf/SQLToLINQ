// Generated from C:/Users/nxpan/Desktop/LenguajesProgr/proy2/SQLToLINQ/grammar\SqlParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(SqlParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatements(SqlParser.SqlStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatement(SqlParser.SqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#emptyStatement_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement_(SqlParser.EmptyStatement_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ddlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdlStatement(SqlParser.DdlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlStatement(SqlParser.DmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transactionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionStatement(SqlParser.TransactionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#replicationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplicationStatement(SqlParser.ReplicationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#preparedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreparedStatement(SqlParser.PreparedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(SqlParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#administrationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdministrationStatement(SqlParser.AdministrationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#utilityStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtilityStatement(SqlParser.UtilityStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(SqlParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateEvent(SqlParser.CreateEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(SqlParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLogfileGroup(SqlParser.CreateLogfileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateProcedure(SqlParser.CreateProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(SqlParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateServer(SqlParser.CreateServerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code copyCreateTable}
	 * labeled alternative in {@link SqlParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyCreateTable(SqlParser.CopyCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryCreateTable}
	 * labeled alternative in {@link SqlParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryCreateTable(SqlParser.QueryCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnCreateTable}
	 * labeled alternative in {@link SqlParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnCreateTable(SqlParser.ColumnCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTablespaceInnodb(SqlParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTablespaceNdb(SqlParser.CreateTablespaceNdbContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTrigger(SqlParser.CreateTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(SqlParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createDatabaseOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabaseOption(SqlParser.CreateDatabaseOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#charSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharSet(SqlParser.CharSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ownerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnerStatement(SqlParser.OwnerStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preciseSchedule}
	 * labeled alternative in {@link SqlParser#scheduleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreciseSchedule(SqlParser.PreciseScheduleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalSchedule}
	 * labeled alternative in {@link SqlParser#scheduleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalSchedule(SqlParser.IntervalScheduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#timestampValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestampValue(SqlParser.TimestampValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#intervalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExpr(SqlParser.IntervalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#intervalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalType(SqlParser.IntervalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#enableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnableType(SqlParser.EnableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#indexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexType(SqlParser.IndexTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#indexOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOption(SqlParser.IndexOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#procedureParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureParameter(SqlParser.ProcedureParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(SqlParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code routineComment}
	 * labeled alternative in {@link SqlParser#routineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineComment(SqlParser.RoutineCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code routineLanguage}
	 * labeled alternative in {@link SqlParser#routineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineLanguage(SqlParser.RoutineLanguageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code routineBehavior}
	 * labeled alternative in {@link SqlParser#routineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineBehavior(SqlParser.RoutineBehaviorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code routineData}
	 * labeled alternative in {@link SqlParser#routineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineData(SqlParser.RoutineDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code routineSecurity}
	 * labeled alternative in {@link SqlParser#routineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineSecurity(SqlParser.RoutineSecurityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#serverOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServerOption(SqlParser.ServerOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinitions(SqlParser.CreateDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnDeclaration}
	 * labeled alternative in {@link SqlParser#createDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDeclaration(SqlParser.ColumnDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constraintDeclaration}
	 * labeled alternative in {@link SqlParser#createDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintDeclaration(SqlParser.ConstraintDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexDeclaration}
	 * labeled alternative in {@link SqlParser#createDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexDeclaration(SqlParser.IndexDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(SqlParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullColumnConstraint(SqlParser.NullColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultColumnConstraint(SqlParser.DefaultColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visibilityColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibilityColumnConstraint(SqlParser.VisibilityColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code autoIncrementColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoIncrementColumnConstraint(SqlParser.AutoIncrementColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyColumnConstraint(SqlParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uniqueKeyColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueKeyColumnConstraint(SqlParser.UniqueKeyColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentColumnConstraint(SqlParser.CommentColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formatColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatColumnConstraint(SqlParser.FormatColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code storageColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageColumnConstraint(SqlParser.StorageColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code referenceColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceColumnConstraint(SqlParser.ReferenceColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collateColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateColumnConstraint(SqlParser.CollateColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code generatedColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratedColumnConstraint(SqlParser.GeneratedColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code serialDefaultColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerialDefaultColumnConstraint(SqlParser.SerialDefaultColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkColumnConstraint}
	 * labeled alternative in {@link SqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckColumnConstraint(SqlParser.CheckColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link SqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyTableConstraint(SqlParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uniqueKeyTableConstraint}
	 * labeled alternative in {@link SqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueKeyTableConstraint(SqlParser.UniqueKeyTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code foreignKeyTableConstraint}
	 * labeled alternative in {@link SqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyTableConstraint(SqlParser.ForeignKeyTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link SqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckTableConstraint(SqlParser.CheckTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#referenceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceDefinition(SqlParser.ReferenceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#referenceAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceAction(SqlParser.ReferenceActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#referenceControlType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceControlType(SqlParser.ReferenceControlTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleIndexDeclaration}
	 * labeled alternative in {@link SqlParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIndexDeclaration(SqlParser.SimpleIndexDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialIndexDeclaration}
	 * labeled alternative in {@link SqlParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialIndexDeclaration(SqlParser.SpecialIndexDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionEngine}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionEngine(SqlParser.TableOptionEngineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionAutoIncrement}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionAutoIncrement(SqlParser.TableOptionAutoIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionAverage}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionAverage(SqlParser.TableOptionAverageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionCharset}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionCharset(SqlParser.TableOptionCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionChecksum}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionChecksum(SqlParser.TableOptionChecksumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionCollate}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionCollate(SqlParser.TableOptionCollateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionComment}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionComment(SqlParser.TableOptionCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionCompression}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionCompression(SqlParser.TableOptionCompressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionConnection}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionConnection(SqlParser.TableOptionConnectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionDataDirectory}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionDataDirectory(SqlParser.TableOptionDataDirectoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionDelay}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionDelay(SqlParser.TableOptionDelayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionEncryption}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionEncryption(SqlParser.TableOptionEncryptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionIndexDirectory}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionIndexDirectory(SqlParser.TableOptionIndexDirectoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionInsertMethod}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionInsertMethod(SqlParser.TableOptionInsertMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionKeyBlockSize}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionKeyBlockSize(SqlParser.TableOptionKeyBlockSizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionMaxRows}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionMaxRows(SqlParser.TableOptionMaxRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionMinRows}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionMinRows(SqlParser.TableOptionMinRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionPackKeys}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionPackKeys(SqlParser.TableOptionPackKeysContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionPassword}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionPassword(SqlParser.TableOptionPasswordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionRowFormat}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionRowFormat(SqlParser.TableOptionRowFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionRecalculation}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionRecalculation(SqlParser.TableOptionRecalculationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionPersistent}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionPersistent(SqlParser.TableOptionPersistentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionSamplePage}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionSamplePage(SqlParser.TableOptionSamplePageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionTablespace}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionTablespace(SqlParser.TableOptionTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionTableType}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionTableType(SqlParser.TableOptionTableTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionUnion}
	 * labeled alternative in {@link SqlParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionUnion(SqlParser.TableOptionUnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableType(SqlParser.TableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tablespaceStorage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespaceStorage(SqlParser.TablespaceStorageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDefinitions(SqlParser.PartitionDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionFunctionHash}
	 * labeled alternative in {@link SqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionFunctionHash(SqlParser.PartitionFunctionHashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionFunctionKey}
	 * labeled alternative in {@link SqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionFunctionKey(SqlParser.PartitionFunctionKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionFunctionRange}
	 * labeled alternative in {@link SqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionFunctionRange(SqlParser.PartitionFunctionRangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionFunctionList}
	 * labeled alternative in {@link SqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionFunctionList(SqlParser.PartitionFunctionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subPartitionFunctionHash}
	 * labeled alternative in {@link SqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubPartitionFunctionHash(SqlParser.SubPartitionFunctionHashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subPartitionFunctionKey}
	 * labeled alternative in {@link SqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubPartitionFunctionKey(SqlParser.SubPartitionFunctionKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionComparison}
	 * labeled alternative in {@link SqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionComparison(SqlParser.PartitionComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionListAtom}
	 * labeled alternative in {@link SqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionListAtom(SqlParser.PartitionListAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionListVector}
	 * labeled alternative in {@link SqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionListVector(SqlParser.PartitionListVectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionSimple}
	 * labeled alternative in {@link SqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSimple(SqlParser.PartitionSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#partitionDefinerAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDefinerAtom(SqlParser.PartitionDefinerAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#partitionDefinerVector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDefinerVector(SqlParser.PartitionDefinerVectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartitionDefinition(SqlParser.SubpartitionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionEngine}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionEngine(SqlParser.PartitionOptionEngineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionComment}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionComment(SqlParser.PartitionOptionCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionDataDirectory}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionDataDirectory(SqlParser.PartitionOptionDataDirectoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionIndexDirectory}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionIndexDirectory(SqlParser.PartitionOptionIndexDirectoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionMaxRows}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionMaxRows(SqlParser.PartitionOptionMaxRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionMinRows}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionMinRows(SqlParser.PartitionOptionMinRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionTablespace}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionTablespace(SqlParser.PartitionOptionTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionNodeGroup}
	 * labeled alternative in {@link SqlParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionNodeGroup(SqlParser.PartitionOptionNodeGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterSimpleDatabase}
	 * labeled alternative in {@link SqlParser#alterDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSimpleDatabase(SqlParser.AlterSimpleDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterUpgradeName}
	 * labeled alternative in {@link SqlParser#alterDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUpgradeName(SqlParser.AlterUpgradeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterEvent(SqlParser.AlterEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunction(SqlParser.AlterFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterInstance(SqlParser.AlterInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterLogfileGroup(SqlParser.AlterLogfileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterProcedure(SqlParser.AlterProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterServer(SqlParser.AlterServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(SqlParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTablespace(SqlParser.AlterTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterView(SqlParser.AlterViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByTableOption}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByTableOption(SqlParser.AlterByTableOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddColumn}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddColumn(SqlParser.AlterByAddColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddColumns}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddColumns(SqlParser.AlterByAddColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddIndex}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddIndex(SqlParser.AlterByAddIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddPrimaryKey}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddPrimaryKey(SqlParser.AlterByAddPrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddUniqueKey}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddUniqueKey(SqlParser.AlterByAddUniqueKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddSpecialIndex}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddSpecialIndex(SqlParser.AlterByAddSpecialIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddForeignKey}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddForeignKey(SqlParser.AlterByAddForeignKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddCheckTableConstraint}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddCheckTableConstraint(SqlParser.AlterByAddCheckTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterBySetAlgorithm}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterBySetAlgorithm(SqlParser.AlterBySetAlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByChangeDefault}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByChangeDefault(SqlParser.AlterByChangeDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByChangeColumn}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByChangeColumn(SqlParser.AlterByChangeColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByRenameColumn}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByRenameColumn(SqlParser.AlterByRenameColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByLock}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByLock(SqlParser.AlterByLockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByModifyColumn}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByModifyColumn(SqlParser.AlterByModifyColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDropColumn}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDropColumn(SqlParser.AlterByDropColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDropConstraintCheck}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDropConstraintCheck(SqlParser.AlterByDropConstraintCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDropPrimaryKey}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDropPrimaryKey(SqlParser.AlterByDropPrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByRenameIndex}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByRenameIndex(SqlParser.AlterByRenameIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAlterIndexVisibility}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAlterIndexVisibility(SqlParser.AlterByAlterIndexVisibilityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDropIndex}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDropIndex(SqlParser.AlterByDropIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDropForeignKey}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDropForeignKey(SqlParser.AlterByDropForeignKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDisableKeys}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDisableKeys(SqlParser.AlterByDisableKeysContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByEnableKeys}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByEnableKeys(SqlParser.AlterByEnableKeysContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByRename}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByRename(SqlParser.AlterByRenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByOrder}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByOrder(SqlParser.AlterByOrderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByConvertCharset}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByConvertCharset(SqlParser.AlterByConvertCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDefaultCharset}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDefaultCharset(SqlParser.AlterByDefaultCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDiscardTablespace}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDiscardTablespace(SqlParser.AlterByDiscardTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByImportTablespace}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByImportTablespace(SqlParser.AlterByImportTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByForce}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByForce(SqlParser.AlterByForceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByValidate}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByValidate(SqlParser.AlterByValidateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddPartition(SqlParser.AlterByAddPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDropPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDropPartition(SqlParser.AlterByDropPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDiscardPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDiscardPartition(SqlParser.AlterByDiscardPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByImportPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByImportPartition(SqlParser.AlterByImportPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByTruncatePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByTruncatePartition(SqlParser.AlterByTruncatePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByCoalescePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByCoalescePartition(SqlParser.AlterByCoalescePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByReorganizePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByReorganizePartition(SqlParser.AlterByReorganizePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByExchangePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByExchangePartition(SqlParser.AlterByExchangePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAnalyzePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAnalyzePartition(SqlParser.AlterByAnalyzePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByCheckPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByCheckPartition(SqlParser.AlterByCheckPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByOptimizePartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByOptimizePartition(SqlParser.AlterByOptimizePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByRebuildPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByRebuildPartition(SqlParser.AlterByRebuildPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByRepairPartition}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByRepairPartition(SqlParser.AlterByRepairPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByRemovePartitioning}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByRemovePartitioning(SqlParser.AlterByRemovePartitioningContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByUpgradePartitioning}
	 * labeled alternative in {@link SqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByUpgradePartitioning(SqlParser.AlterByUpgradePartitioningContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(SqlParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropEvent(SqlParser.DropEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndex(SqlParser.DropIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropLogfileGroup(SqlParser.DropLogfileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropProcedure(SqlParser.DropProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(SqlParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropServer(SqlParser.DropServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(SqlParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablespace(SqlParser.DropTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTrigger(SqlParser.DropTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropView(SqlParser.DropViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#renameTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(SqlParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#renameTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTableClause(SqlParser.RenameTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#truncateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(SqlParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#callStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(SqlParser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(SqlParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(SqlParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#handlerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerStatement(SqlParser.HandlerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(SqlParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#loadDataStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadDataStatement(SqlParser.LoadDataStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadXmlStatement(SqlParser.LoadXmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#replaceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceStatement(SqlParser.ReplaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link SqlParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelect(SqlParser.SimpleSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link SqlParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisSelect(SqlParser.ParenthesisSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link SqlParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionSelect(SqlParser.UnionSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link SqlParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionParenthesisSelect(SqlParser.UnionParenthesisSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(SqlParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insertStatementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatementValue(SqlParser.InsertStatementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#updatedElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdatedElement(SqlParser.UpdatedElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assignmentField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentField(SqlParser.AssignmentFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#lockClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockClause(SqlParser.LockClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDeleteStatement(SqlParser.SingleDeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#multipleDeleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleDeleteStatement(SqlParser.MultipleDeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerOpenStatement(SqlParser.HandlerOpenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerReadIndexStatement(SqlParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerReadStatement(SqlParser.HandlerReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerCloseStatement(SqlParser.HandlerCloseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleUpdateStatement(SqlParser.SingleUpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#multipleUpdateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleUpdateStatement(SqlParser.MultipleUpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(SqlParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#orderByExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByExpression(SqlParser.OrderByExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableSources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSources(SqlParser.TableSourcesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link SqlParser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSourceBase(SqlParser.TableSourceBaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link SqlParser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSourceNested(SqlParser.TableSourceNestedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link SqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomTableItem(SqlParser.AtomTableItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link SqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryTableItem(SqlParser.SubqueryTableItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link SqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSourcesItem(SqlParser.TableSourcesItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#indexHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHint(SqlParser.IndexHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#indexHintType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHintType(SqlParser.IndexHintTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link SqlParser#joinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerJoin(SqlParser.InnerJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code straightJoin}
	 * labeled alternative in {@link SqlParser#joinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStraightJoin(SqlParser.StraightJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link SqlParser#joinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuterJoin(SqlParser.OuterJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link SqlParser#joinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalJoin(SqlParser.NaturalJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#queryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpression(SqlParser.QueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpressionNointo(SqlParser.QueryExpressionNointoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(SqlParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecificationNointo(SqlParser.QuerySpecificationNointoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unionParenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionParenthesis(SqlParser.UnionParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionStatement(SqlParser.UnionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#selectSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpec(SqlParser.SelectSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(SqlParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStarElement(SqlParser.SelectStarElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumnElement(SqlParser.SelectColumnElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFunctionElement(SqlParser.SelectFunctionElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectExpressionElement(SqlParser.SelectExpressionElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link SqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoVariables(SqlParser.SelectIntoVariablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link SqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoDumpFile(SqlParser.SelectIntoDumpFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link SqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoTextFile(SqlParser.SelectIntoTextFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFieldsInto(SqlParser.SelectFieldsIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#selectLinesInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectLinesInto(SqlParser.SelectLinesIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SqlParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(SqlParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(SqlParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#windowClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause(SqlParser.WindowClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#groupByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByItem(SqlParser.GroupByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(SqlParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClauseAtom(SqlParser.LimitClauseAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#startTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartTransaction(SqlParser.StartTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#beginWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginWork(SqlParser.BeginWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#commitWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommitWork(SqlParser.CommitWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rollbackWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollbackWork(SqlParser.RollbackWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#savepointStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepointStatement(SqlParser.SavepointStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rollbackStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollbackStatement(SqlParser.RollbackStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#releaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReleaseStatement(SqlParser.ReleaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#lockTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockTables(SqlParser.LockTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unlockTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlockTables(SqlParser.UnlockTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#setAutocommitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAutocommitStatement(SqlParser.SetAutocommitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#setTransactionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransactionStatement(SqlParser.SetTransactionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transactionMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionMode(SqlParser.TransactionModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#lockTableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockTableElement(SqlParser.LockTableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#lockAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockAction(SqlParser.LockActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transactionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionOption(SqlParser.TransactionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transactionLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionLevel(SqlParser.TransactionLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#changeMaster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeMaster(SqlParser.ChangeMasterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeReplicationFilter(SqlParser.ChangeReplicationFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#purgeBinaryLogs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPurgeBinaryLogs(SqlParser.PurgeBinaryLogsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#resetMaster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetMaster(SqlParser.ResetMasterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#resetSlave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetSlave(SqlParser.ResetSlaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#startSlave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartSlave(SqlParser.StartSlaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stopSlave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopSlave(SqlParser.StopSlaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#startGroupReplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartGroupReplication(SqlParser.StartGroupReplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopGroupReplication(SqlParser.StopGroupReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterStringOption}
	 * labeled alternative in {@link SqlParser#masterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterStringOption(SqlParser.MasterStringOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterDecimalOption}
	 * labeled alternative in {@link SqlParser#masterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterDecimalOption(SqlParser.MasterDecimalOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterBoolOption}
	 * labeled alternative in {@link SqlParser#masterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterBoolOption(SqlParser.MasterBoolOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterRealOption}
	 * labeled alternative in {@link SqlParser#masterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterRealOption(SqlParser.MasterRealOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterUidListOption}
	 * labeled alternative in {@link SqlParser#masterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterUidListOption(SqlParser.MasterUidListOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stringMasterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringMasterOption(SqlParser.StringMasterOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#decimalMasterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalMasterOption(SqlParser.DecimalMasterOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#boolMasterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolMasterOption(SqlParser.BoolMasterOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#channelOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelOption(SqlParser.ChannelOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doDbReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoDbReplication(SqlParser.DoDbReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ignoreDbReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreDbReplication(SqlParser.IgnoreDbReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doTableReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoTableReplication(SqlParser.DoTableReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ignoreTableReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreTableReplication(SqlParser.IgnoreTableReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wildDoTableReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildDoTableReplication(SqlParser.WildDoTableReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wildIgnoreTableReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildIgnoreTableReplication(SqlParser.WildIgnoreTableReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rewriteDbReplication}
	 * labeled alternative in {@link SqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRewriteDbReplication(SqlParser.RewriteDbReplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tablePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePair(SqlParser.TablePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#threadType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreadType(SqlParser.ThreadTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gtidsUntilOption}
	 * labeled alternative in {@link SqlParser#untilOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtidsUntilOption(SqlParser.GtidsUntilOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterLogUntilOption}
	 * labeled alternative in {@link SqlParser#untilOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterLogUntilOption(SqlParser.MasterLogUntilOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relayLogUntilOption}
	 * labeled alternative in {@link SqlParser#untilOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelayLogUntilOption(SqlParser.RelayLogUntilOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlGapsUntilOption}
	 * labeled alternative in {@link SqlParser#untilOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlGapsUntilOption(SqlParser.SqlGapsUntilOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code userConnectionOption}
	 * labeled alternative in {@link SqlParser#connectionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserConnectionOption(SqlParser.UserConnectionOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code passwordConnectionOption}
	 * labeled alternative in {@link SqlParser#connectionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordConnectionOption(SqlParser.PasswordConnectionOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultAuthConnectionOption}
	 * labeled alternative in {@link SqlParser#connectionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultAuthConnectionOption(SqlParser.DefaultAuthConnectionOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pluginDirConnectionOption}
	 * labeled alternative in {@link SqlParser#connectionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginDirConnectionOption(SqlParser.PluginDirConnectionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#gtuidSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtuidSet(SqlParser.GtuidSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xaStartTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaStartTransaction(SqlParser.XaStartTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xaEndTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaEndTransaction(SqlParser.XaEndTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xaPrepareStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaPrepareStatement(SqlParser.XaPrepareStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xaCommitWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaCommitWork(SqlParser.XaCommitWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xaRollbackWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaRollbackWork(SqlParser.XaRollbackWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xaRecoverWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaRecoverWork(SqlParser.XaRecoverWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#prepareStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepareStatement(SqlParser.PrepareStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#executeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteStatement(SqlParser.ExecuteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#deallocatePrepare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocatePrepare(SqlParser.DeallocatePrepareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#routineBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineBody(SqlParser.RoutineBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(SqlParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(SqlParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SqlParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#iterateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterateStatement(SqlParser.IterateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#leaveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeaveStatement(SqlParser.LeaveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(SqlParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(SqlParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SqlParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SqlParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CloseCursor}
	 * labeled alternative in {@link SqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseCursor(SqlParser.CloseCursorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FetchCursor}
	 * labeled alternative in {@link SqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchCursor(SqlParser.FetchCursorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpenCursor}
	 * labeled alternative in {@link SqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenCursor(SqlParser.OpenCursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declareVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareVariable(SqlParser.DeclareVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declareCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareCondition(SqlParser.DeclareConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declareCursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareCursor(SqlParser.DeclareCursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declareHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareHandler(SqlParser.DeclareHandlerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionCode}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionCode(SqlParser.HandlerConditionCodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionState}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionState(SqlParser.HandlerConditionStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionName}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionName(SqlParser.HandlerConditionNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionWarning}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionWarning(SqlParser.HandlerConditionWarningContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionNotfound}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionNotfound(SqlParser.HandlerConditionNotfoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionException}
	 * labeled alternative in {@link SqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionException(SqlParser.HandlerConditionExceptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#procedureSqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureSqlStatement(SqlParser.ProcedureSqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#caseAlternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseAlternative(SqlParser.CaseAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#elifAlternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifAlternative(SqlParser.ElifAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterUserMysqlV56}
	 * labeled alternative in {@link SqlParser#alterUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserMysqlV56(SqlParser.AlterUserMysqlV56Context ctx);
	/**
	 * Visit a parse tree produced by the {@code alterUserMysqlV57}
	 * labeled alternative in {@link SqlParser#alterUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserMysqlV57(SqlParser.AlterUserMysqlV57Context ctx);
	/**
	 * Visit a parse tree produced by the {@code createUserMysqlV56}
	 * labeled alternative in {@link SqlParser#createUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserMysqlV56(SqlParser.CreateUserMysqlV56Context ctx);
	/**
	 * Visit a parse tree produced by the {@code createUserMysqlV57}
	 * labeled alternative in {@link SqlParser#createUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserMysqlV57(SqlParser.CreateUserMysqlV57Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUser(SqlParser.DropUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#grantStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantStatement(SqlParser.GrantStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#roleOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleOption(SqlParser.RoleOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#grantProxy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantProxy(SqlParser.GrantProxyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#renameUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameUser(SqlParser.RenameUserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code detailRevoke}
	 * labeled alternative in {@link SqlParser#revokeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetailRevoke(SqlParser.DetailRevokeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shortRevoke}
	 * labeled alternative in {@link SqlParser#revokeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortRevoke(SqlParser.ShortRevokeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code roleRevoke}
	 * labeled alternative in {@link SqlParser#revokeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleRevoke(SqlParser.RoleRevokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#revokeProxy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeProxy(SqlParser.RevokeProxyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#setPasswordStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPasswordStatement(SqlParser.SetPasswordStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#userSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserSpecification(SqlParser.UserSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code passwordAuthOption}
	 * labeled alternative in {@link SqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordAuthOption(SqlParser.PasswordAuthOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAuthOption}
	 * labeled alternative in {@link SqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAuthOption(SqlParser.StringAuthOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hashAuthOption}
	 * labeled alternative in {@link SqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashAuthOption(SqlParser.HashAuthOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleAuthOption}
	 * labeled alternative in {@link SqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAuthOption(SqlParser.SimpleAuthOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tlsOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTlsOption(SqlParser.TlsOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#userResourceOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserResourceOption(SqlParser.UserResourceOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#userPasswordOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserPasswordOption(SqlParser.UserPasswordOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#userLockOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserLockOption(SqlParser.UserLockOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#privelegeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivelegeClause(SqlParser.PrivelegeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege(SqlParser.PrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentSchemaPriviLevel}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentSchemaPriviLevel(SqlParser.CurrentSchemaPriviLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalPrivLevel}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalPrivLevel(SqlParser.GlobalPrivLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definiteSchemaPrivLevel}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefiniteSchemaPrivLevel(SqlParser.DefiniteSchemaPrivLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definiteFullTablePrivLevel}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefiniteFullTablePrivLevel(SqlParser.DefiniteFullTablePrivLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definiteFullTablePrivLevel2}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefiniteFullTablePrivLevel2(SqlParser.DefiniteFullTablePrivLevel2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code definiteTablePrivLevel}
	 * labeled alternative in {@link SqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefiniteTablePrivLevel(SqlParser.DefiniteTablePrivLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#renameUserClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameUserClause(SqlParser.RenameUserClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#analyzeTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeTable(SqlParser.AnalyzeTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#checkTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckTable(SqlParser.CheckTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#checksumTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecksumTable(SqlParser.ChecksumTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optimizeTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimizeTable(SqlParser.OptimizeTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#repairTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepairTable(SqlParser.RepairTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#checkTableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckTableOption(SqlParser.CheckTableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createUdfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUdfunction(SqlParser.CreateUdfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#installPlugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstallPlugin(SqlParser.InstallPluginContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUninstallPlugin(SqlParser.UninstallPluginContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setVariable}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVariable(SqlParser.SetVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setCharset}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCharset(SqlParser.SetCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setNames}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetNames(SqlParser.SetNamesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setPassword}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPassword(SqlParser.SetPasswordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransaction(SqlParser.SetTransactionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setAutocommit}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAutocommit(SqlParser.SetAutocommitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setNewValueInsideTrigger}
	 * labeled alternative in {@link SqlParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetNewValueInsideTrigger(SqlParser.SetNewValueInsideTriggerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showMasterLogs}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowMasterLogs(SqlParser.ShowMasterLogsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showLogEvents}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowLogEvents(SqlParser.ShowLogEventsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showObjectFilter}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowObjectFilter(SqlParser.ShowObjectFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(SqlParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateDb}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateDb(SqlParser.ShowCreateDbContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateFullIdObject}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateFullIdObject(SqlParser.ShowCreateFullIdObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateUser}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateUser(SqlParser.ShowCreateUserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showEngine}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEngine(SqlParser.ShowEngineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showGlobalInfo}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowGlobalInfo(SqlParser.ShowGlobalInfoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showErrors}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowErrors(SqlParser.ShowErrorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCountErrors}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCountErrors(SqlParser.ShowCountErrorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showSchemaFilter}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSchemaFilter(SqlParser.ShowSchemaFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showRoutine}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRoutine(SqlParser.ShowRoutineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showGrants}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowGrants(SqlParser.ShowGrantsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowIndexes(SqlParser.ShowIndexesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showOpenTables}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowOpenTables(SqlParser.ShowOpenTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showProfile}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProfile(SqlParser.ShowProfileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showSlaveStatus}
	 * labeled alternative in {@link SqlParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSlaveStatus(SqlParser.ShowSlaveStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#variableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableClause(SqlParser.VariableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#showCommonEntity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCommonEntity(SqlParser.ShowCommonEntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#showFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFilter(SqlParser.ShowFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#showGlobalInfoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowGlobalInfoClause(SqlParser.ShowGlobalInfoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#showSchemaEntity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSchemaEntity(SqlParser.ShowSchemaEntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#showProfileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProfileType(SqlParser.ShowProfileTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#binlogStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinlogStatement(SqlParser.BinlogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cacheIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheIndexStatement(SqlParser.CacheIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#flushStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlushStatement(SqlParser.FlushStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#killStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKillStatement(SqlParser.KillStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#loadIndexIntoCache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadIndexIntoCache(SqlParser.LoadIndexIntoCacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#resetStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetStatement(SqlParser.ResetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#shutdownStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShutdownStatement(SqlParser.ShutdownStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableIndexes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIndexes(SqlParser.TableIndexesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleFlushOption}
	 * labeled alternative in {@link SqlParser#flushOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFlushOption(SqlParser.SimpleFlushOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code channelFlushOption}
	 * labeled alternative in {@link SqlParser#flushOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelFlushOption(SqlParser.ChannelFlushOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFlushOption}
	 * labeled alternative in {@link SqlParser#flushOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFlushOption(SqlParser.TableFlushOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#flushTableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlushTableOption(SqlParser.FlushTableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#loadedTableIndexes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadedTableIndexes(SqlParser.LoadedTableIndexesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#simpleDescribeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDescribeStatement(SqlParser.SimpleDescribeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fullDescribeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullDescribeStatement(SqlParser.FullDescribeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#helpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelpStatement(SqlParser.HelpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#useStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStatement(SqlParser.UseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#signalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalStatement(SqlParser.SignalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#resignalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResignalStatement(SqlParser.ResignalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#signalConditionInformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalConditionInformation(SqlParser.SignalConditionInformationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#diagnosticsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiagnosticsStatement(SqlParser.DiagnosticsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#diagnosticsConditionInformationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiagnosticsConditionInformationName(SqlParser.DiagnosticsConditionInformationNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeStatements}
	 * labeled alternative in {@link SqlParser#describeObjectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeStatements(SqlParser.DescribeStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeConnection}
	 * labeled alternative in {@link SqlParser#describeObjectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeConnection(SqlParser.DescribeConnectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fullId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullId(SqlParser.FullIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fullColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullColumnName(SqlParser.FullColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#indexColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexColumnName(SqlParser.IndexColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#userName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserName(SqlParser.UserNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#mysqlVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMysqlVariable(SqlParser.MysqlVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#charsetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetName(SqlParser.CharsetNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#collationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationName(SqlParser.CollationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#engineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngineName(SqlParser.EngineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#uuidSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUuidSet(SqlParser.UuidSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXid(SqlParser.XidContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xuidStringId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXuidStringId(SqlParser.XuidStringIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#authPlugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthPlugin(SqlParser.AuthPluginContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#uid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUid(SqlParser.UidContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#simpleId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleId(SqlParser.SimpleIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dottedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedId(SqlParser.DottedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(SqlParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileSizeLiteral(SqlParser.FileSizeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SqlParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(SqlParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiteral(SqlParser.HexadecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#nullNotnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullNotnull(SqlParser.NullNotnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(SqlParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDataType(SqlParser.StringDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nationalStringDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNationalStringDataType(SqlParser.NationalStringDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nationalVaryingStringDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNationalVaryingStringDataType(SqlParser.NationalVaryingStringDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dimensionDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionDataType(SqlParser.DimensionDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDataType(SqlParser.SimpleDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collectionDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionDataType(SqlParser.CollectionDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code spatialDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpatialDataType(SqlParser.SpatialDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code longVarcharDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongVarcharDataType(SqlParser.LongVarcharDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code longVarbinaryDataType}
	 * labeled alternative in {@link SqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongVarbinaryDataType(SqlParser.LongVarbinaryDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#collectionOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionOptions(SqlParser.CollectionOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#convertedDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertedDataType(SqlParser.ConvertedDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthOneDimension(SqlParser.LengthOneDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthTwoDimension(SqlParser.LengthTwoDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthTwoOptionalDimension(SqlParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#uidList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUidList(SqlParser.UidListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTables(SqlParser.TablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#indexColumnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexColumnNames(SqlParser.IndexColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(SqlParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expressionsWithDefaults}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionsWithDefaults(SqlParser.ExpressionsWithDefaultsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstants(SqlParser.ConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#simpleStrings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStrings(SqlParser.SimpleStringsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#userVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserVariables(SqlParser.UserVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(SqlParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#currentTimestamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentTimestamp(SqlParser.CurrentTimestampContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expressionOrDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOrDefault(SqlParser.ExpressionOrDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(SqlParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(SqlParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecificFunctionCall(SqlParser.SpecificFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateFunctionCall(SqlParser.AggregateFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonAggregateFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonAggregateFunctionCall(SqlParser.NonAggregateFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarFunctionCall(SqlParser.ScalarFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdfFunctionCall(SqlParser.UdfFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordFunctionCall(SqlParser.PasswordFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFunctionCall(SqlParser.SimpleFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeFunctionCall(SqlParser.DataTypeFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesFunctionCall(SqlParser.ValuesFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseExpressionFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpressionFunctionCall(SqlParser.CaseExpressionFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseFunctionCall(SqlParser.CaseFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunctionCall(SqlParser.CharFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionFunctionCall(SqlParser.PositionFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstrFunctionCall(SqlParser.SubstrFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimFunctionCall(SqlParser.TrimFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeightFunctionCall(SqlParser.WeightFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractFunctionCall(SqlParser.ExtractFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetFormatFunctionCall(SqlParser.GetFormatFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonValueFunctionCall}
	 * labeled alternative in {@link SqlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValueFunctionCall(SqlParser.JsonValueFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseFuncAlternative(SqlParser.CaseFuncAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link SqlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelWeightList(SqlParser.LevelWeightListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link SqlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelWeightRange(SqlParser.LevelWeightRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelInWeightListElement(SqlParser.LevelInWeightListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateWindowedFunction(SqlParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#nonAggregateWindowedFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonAggregateWindowedFunction(SqlParser.NonAggregateWindowedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#overClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverClause(SqlParser.OverClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowSpec(SqlParser.WindowSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#windowName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowName(SqlParser.WindowNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#frameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameClause(SqlParser.FrameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#frameUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameUnits(SqlParser.FrameUnitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#frameExtent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameExtent(SqlParser.FrameExtentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#frameBetween}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBetween(SqlParser.FrameBetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#frameRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameRange(SqlParser.FrameRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#partitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionClause(SqlParser.PartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarFunctionName(SqlParser.ScalarFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordFunctionClause(SqlParser.PasswordFunctionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#functionArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgs(SqlParser.FunctionArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#functionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArg(SqlParser.FunctionArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsExpression(SqlParser.IsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(SqlParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(SqlParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateExpression(SqlParser.PredicateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoundsLikePredicate(SqlParser.SoundsLikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAtomPredicate(SqlParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryComparisonPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryComparisonPredicate(SqlParser.SubqueryComparisonPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonMemberOfPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonMemberOfPredicate(SqlParser.JsonMemberOfPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryComparisonPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryComparisonPredicate(SqlParser.BinaryComparisonPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(SqlParser.InPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenPredicate(SqlParser.BetweenPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNullPredicate(SqlParser.IsNullPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikePredicate(SqlParser.LikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexpPredicate(SqlParser.RegexpPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionAtom(SqlParser.UnaryExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateExpressionAtom(SqlParser.CollateExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMysqlVariableExpressionAtom(SqlParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedExpressionAtom(SqlParser.NestedExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedRowExpressionAtom(SqlParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionAtom(SqlParser.MathExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code existsExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsExpressionAtom(SqlParser.ExistsExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExpressionAtom(SqlParser.IntervalExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonExpressionAtom(SqlParser.JsonExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpressionAtom(SqlParser.SubqueryExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpressionAtom(SqlParser.ConstantExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpressionAtom(SqlParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpressionAtom(SqlParser.BinaryExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullColumnNameExpressionAtom(SqlParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpressionAtom(SqlParser.BitExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(SqlParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SqlParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(SqlParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bitOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOperator(SqlParser.BitOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#mathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOperator(SqlParser.MathOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#jsonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonOperator(SqlParser.JsonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#charsetNameBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetNameBase(SqlParser.CharsetNameBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionLevelBase(SqlParser.TransactionLevelBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#privilegesBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegesBase(SqlParser.PrivilegesBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalTypeBase(SqlParser.IntervalTypeBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dataTypeBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeBase(SqlParser.DataTypeBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordsCanBeId(SqlParser.KeywordsCanBeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#functionNameBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionNameBase(SqlParser.FunctionNameBaseContext ctx);
}