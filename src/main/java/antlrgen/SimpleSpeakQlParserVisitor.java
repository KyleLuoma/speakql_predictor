// Generated from SimpleSpeakQlParser.g4 by ANTLR 4.9.3
package antlrgen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleSpeakQlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleSpeakQlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SimpleSpeakQlParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelect(SimpleSpeakQlParser.SimpleSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisSelect(SimpleSpeakQlParser.ParenthesisSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionSelect(SimpleSpeakQlParser.UnionSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionParenthesisSelect(SimpleSpeakQlParser.UnionParenthesisSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleQuerySpecification}
	 * labeled alternative in {@link SimpleSpeakQlParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleQuerySpecification(SimpleSpeakQlParser.SingleQuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiQuerySpecification}
	 * labeled alternative in {@link SimpleSpeakQlParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiQuerySpecification(SimpleSpeakQlParser.MultiQuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#queryOrderSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryOrderSpecification(SimpleSpeakQlParser.QueryOrderSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#multiQueryOrderSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiQueryOrderSpecification(SimpleSpeakQlParser.MultiQueryOrderSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#selectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectExpression(SimpleSpeakQlParser.SelectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(SimpleSpeakQlParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#selectKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectKeyword(SimpleSpeakQlParser.SelectKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#nothingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNothingElement(SimpleSpeakQlParser.NothingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#nothingKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNothingKeyword(SimpleSpeakQlParser.NothingKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#selectSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpec(SimpleSpeakQlParser.SelectSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(SimpleSpeakQlParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStarElement(SimpleSpeakQlParser.SelectStarElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumnElement(SimpleSpeakQlParser.SelectColumnElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFunctionElement(SimpleSpeakQlParser.SelectFunctionElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectExpressionElement(SimpleSpeakQlParser.SelectExpressionElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#fullId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullId(SimpleSpeakQlParser.FullIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#uid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUid(SimpleSpeakQlParser.UidContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#simpleId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleId(SimpleSpeakQlParser.SimpleIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#charsetNameBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetNameBase(SimpleSpeakQlParser.CharsetNameBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionLevelBase(SimpleSpeakQlParser.TransactionLevelBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#engineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngineName(SimpleSpeakQlParser.EngineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#privilegesBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegesBase(SimpleSpeakQlParser.PrivilegesBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalTypeBase(SimpleSpeakQlParser.IntervalTypeBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#dataTypeBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeBase(SimpleSpeakQlParser.DataTypeBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordsCanBeId(SimpleSpeakQlParser.KeywordsCanBeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#functionNameBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionNameBase(SimpleSpeakQlParser.FunctionNameBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#selectElementDot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElementDot(SimpleSpeakQlParser.SelectElementDotContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#fullColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullColumnName(SimpleSpeakQlParser.FullColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#dottedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedId(SimpleSpeakQlParser.DottedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#selectElementAs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElementAs(SimpleSpeakQlParser.SelectElementAsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecificFunctionCall(SimpleSpeakQlParser.SpecificFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateFunctionCall(SimpleSpeakQlParser.AggregateFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonAggregateFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonAggregateFunctionCall(SimpleSpeakQlParser.NonAggregateFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarFunctionCall(SimpleSpeakQlParser.ScalarFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdfFunctionCall(SimpleSpeakQlParser.UdfFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordFunctionCall(SimpleSpeakQlParser.PasswordFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFunctionCall(SimpleSpeakQlParser.SimpleFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeFunctionCall(SimpleSpeakQlParser.DataTypeFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesFunctionCall(SimpleSpeakQlParser.ValuesFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseExpressionFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpressionFunctionCall(SimpleSpeakQlParser.CaseExpressionFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseFunctionCall(SimpleSpeakQlParser.CaseFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunctionCall(SimpleSpeakQlParser.CharFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionFunctionCall(SimpleSpeakQlParser.PositionFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstrFunctionCall(SimpleSpeakQlParser.SubstrFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimFunctionCall(SimpleSpeakQlParser.TrimFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeightFunctionCall(SimpleSpeakQlParser.WeightFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractFunctionCall(SimpleSpeakQlParser.ExtractFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetFormatFunctionCall(SimpleSpeakQlParser.GetFormatFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonValueFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValueFunctionCall(SimpleSpeakQlParser.JsonValueFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#leftParen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftParen(SimpleSpeakQlParser.LeftParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#rightParen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightParen(SimpleSpeakQlParser.RightParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link SimpleSpeakQlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsExpression(SimpleSpeakQlParser.IsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SimpleSpeakQlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(SimpleSpeakQlParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link SimpleSpeakQlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(SimpleSpeakQlParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link SimpleSpeakQlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateExpression(SimpleSpeakQlParser.PredicateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(SimpleSpeakQlParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoundsLikePredicate(SimpleSpeakQlParser.SoundsLikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAtomPredicate(SimpleSpeakQlParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryComparisonPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryComparisonPredicate(SimpleSpeakQlParser.SubqueryComparisonPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonMemberOfPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonMemberOfPredicate(SimpleSpeakQlParser.JsonMemberOfPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryComparisonPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryComparisonPredicate(SimpleSpeakQlParser.BinaryComparisonPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(SimpleSpeakQlParser.InPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenPredicate(SimpleSpeakQlParser.BetweenPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNullPredicate(SimpleSpeakQlParser.IsNullPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikePredicate(SimpleSpeakQlParser.LikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexpPredicate(SimpleSpeakQlParser.RegexpPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#isKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsKeyword(SimpleSpeakQlParser.IsKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#expressionDelimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionDelimiter(SimpleSpeakQlParser.ExpressionDelimiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#selectModifierExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectModifierExpression(SimpleSpeakQlParser.SelectModifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(SimpleSpeakQlParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#groupByKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByKeyword(SimpleSpeakQlParser.GroupByKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#groupByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByItem(SimpleSpeakQlParser.GroupByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#automaticGroupByKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomaticGroupByKeyword(SimpleSpeakQlParser.AutomaticGroupByKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#groupByExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByExpression(SimpleSpeakQlParser.GroupByExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#groupByItemDelimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByItemDelimiter(SimpleSpeakQlParser.GroupByItemDelimiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(SimpleSpeakQlParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#havingKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingKeyword(SimpleSpeakQlParser.HavingKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#windowClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause(SimpleSpeakQlParser.WindowClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#windowName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowName(SimpleSpeakQlParser.WindowNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowSpec(SimpleSpeakQlParser.WindowSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#partitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionClause(SimpleSpeakQlParser.PartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(SimpleSpeakQlParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#orderByExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByExpression(SimpleSpeakQlParser.OrderByExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#frameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameClause(SimpleSpeakQlParser.FrameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#frameUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameUnits(SimpleSpeakQlParser.FrameUnitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#frameExtent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameExtent(SimpleSpeakQlParser.FrameExtentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#frameRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameRange(SimpleSpeakQlParser.FrameRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#frameBetween}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBetween(SimpleSpeakQlParser.FrameBetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(SimpleSpeakQlParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClauseAtom(SimpleSpeakQlParser.LimitClauseAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoVariables(SimpleSpeakQlParser.SelectIntoVariablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoDumpFile(SimpleSpeakQlParser.SelectIntoDumpFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoTextFile(SimpleSpeakQlParser.SelectIntoTextFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#assignmentField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentField(SimpleSpeakQlParser.AssignmentFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFieldsInto(SimpleSpeakQlParser.SelectFieldsIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#selectLinesInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectLinesInto(SimpleSpeakQlParser.SelectLinesIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#lockClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockClause(SimpleSpeakQlParser.LockClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#queryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpression(SimpleSpeakQlParser.QueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecificationNointo(SimpleSpeakQlParser.QuerySpecificationNointoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#fromClauseNoJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClauseNoJoin(SimpleSpeakQlParser.FromClauseNoJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SimpleSpeakQlParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#fromKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromKeyword(SimpleSpeakQlParser.FromKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#tableKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableKeyword(SimpleSpeakQlParser.TableKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#tableSources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSources(SimpleSpeakQlParser.TableSourcesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableSourceNoJoinBase}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceNoJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSourceNoJoinBase(SimpleSpeakQlParser.TableSourceNoJoinBaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableSourceNoJoinNested}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceNoJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSourceNoJoinNested(SimpleSpeakQlParser.TableSourceNoJoinNestedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSourceBase(SimpleSpeakQlParser.TableSourceBaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSourceNested(SimpleSpeakQlParser.TableSourceNestedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryTableItem(SimpleSpeakQlParser.SubqueryTableItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code onlyTableNameItem}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyTableNameItem(SimpleSpeakQlParser.OnlyTableNameItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomTableItem(SimpleSpeakQlParser.AtomTableItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSourcesItem(SimpleSpeakQlParser.TableSourcesItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#subQueryTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubQueryTable(SimpleSpeakQlParser.SubQueryTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAlias(SimpleSpeakQlParser.TableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#tableAliasAs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAliasAs(SimpleSpeakQlParser.TableAliasAsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SimpleSpeakQlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#uidList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUidList(SimpleSpeakQlParser.UidListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#indexHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHint(SimpleSpeakQlParser.IndexHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#indexHintType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHintType(SimpleSpeakQlParser.IndexHintTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#joinKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinKeyword(SimpleSpeakQlParser.JoinKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#multiJoinExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiJoinExpression(SimpleSpeakQlParser.MultiJoinExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#multiJoinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiJoinPart(SimpleSpeakQlParser.MultiJoinPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#multiInnerJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInnerJoin(SimpleSpeakQlParser.MultiInnerJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#multiOuterJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiOuterJoin(SimpleSpeakQlParser.MultiOuterJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#multiNaturalJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiNaturalJoin(SimpleSpeakQlParser.MultiNaturalJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#withKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithKeyword(SimpleSpeakQlParser.WithKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#joinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinPart(SimpleSpeakQlParser.JoinPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#innerJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerJoin(SimpleSpeakQlParser.InnerJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#innerJoinKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerJoinKeyword(SimpleSpeakQlParser.InnerJoinKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#onKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnKeyword(SimpleSpeakQlParser.OnKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#outerJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuterJoin(SimpleSpeakQlParser.OuterJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#joinDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinDirection(SimpleSpeakQlParser.JoinDirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#outerJoinKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuterJoinKeyword(SimpleSpeakQlParser.OuterJoinKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#naturalJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalJoin(SimpleSpeakQlParser.NaturalJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#naturalJoinKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalJoinKeyword(SimpleSpeakQlParser.NaturalJoinKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#tableSourceDelimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSourceDelimiter(SimpleSpeakQlParser.TableSourceDelimiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#unionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionStatement(SimpleSpeakQlParser.UnionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpressionNointo(SimpleSpeakQlParser.QueryExpressionNointoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#unionParenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionParenthesis(SimpleSpeakQlParser.UnionParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(SimpleSpeakQlParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#nullNotnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullNotnull(SimpleSpeakQlParser.NullNotnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SimpleSpeakQlParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionAtom(SimpleSpeakQlParser.UnaryExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateExpressionAtom(SimpleSpeakQlParser.CollateExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMysqlVariableExpressionAtom(SimpleSpeakQlParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedExpressionAtom(SimpleSpeakQlParser.NestedExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedRowExpressionAtom(SimpleSpeakQlParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionAtom(SimpleSpeakQlParser.MathExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code existsExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsExpressionAtom(SimpleSpeakQlParser.ExistsExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExpressionAtom(SimpleSpeakQlParser.IntervalExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonExpressionAtom(SimpleSpeakQlParser.JsonExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpressionAtom(SimpleSpeakQlParser.SubqueryExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpressionAtom(SimpleSpeakQlParser.ConstantExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpressionAtom(SimpleSpeakQlParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpressionAtom(SimpleSpeakQlParser.BinaryExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullColumnNameExpressionAtom(SimpleSpeakQlParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpressionAtom(SimpleSpeakQlParser.BitExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(SimpleSpeakQlParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SimpleSpeakQlParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#collationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationName(SimpleSpeakQlParser.CollationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(SimpleSpeakQlParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiteral(SimpleSpeakQlParser.HexadecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(SimpleSpeakQlParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#mysqlVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMysqlVariable(SimpleSpeakQlParser.MysqlVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(SimpleSpeakQlParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#intervalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalType(SimpleSpeakQlParser.IntervalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#bitOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOperator(SimpleSpeakQlParser.BitOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#mathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOperator(SimpleSpeakQlParser.MathOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#jsonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonOperator(SimpleSpeakQlParser.JsonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#convertedDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertedDataType(SimpleSpeakQlParser.ConvertedDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthOneDimension(SimpleSpeakQlParser.LengthOneDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#charsetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetName(SimpleSpeakQlParser.CharsetNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthTwoDimension(SimpleSpeakQlParser.LengthTwoDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseFuncAlternative(SimpleSpeakQlParser.CaseFuncAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#functionArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgs(SimpleSpeakQlParser.FunctionArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link SimpleSpeakQlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelWeightList(SimpleSpeakQlParser.LevelWeightListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link SimpleSpeakQlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelWeightRange(SimpleSpeakQlParser.LevelWeightRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelInWeightListElement(SimpleSpeakQlParser.LevelInWeightListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(SimpleSpeakQlParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#currentTimestamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentTimestamp(SimpleSpeakQlParser.CurrentTimestampContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateWindowedFunction(SimpleSpeakQlParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#ofKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOfKeyword(SimpleSpeakQlParser.OfKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#theKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheKeyword(SimpleSpeakQlParser.TheKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#functionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArg(SimpleSpeakQlParser.FunctionArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#overClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverClause(SimpleSpeakQlParser.OverClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#allAggregatorKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllAggregatorKeyword(SimpleSpeakQlParser.AllAggregatorKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#distinctAggregatorKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctAggregatorKeyword(SimpleSpeakQlParser.DistinctAggregatorKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#nonAggregateWindowedFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonAggregateWindowedFunction(SimpleSpeakQlParser.NonAggregateWindowedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarFunctionName(SimpleSpeakQlParser.ScalarFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordFunctionClause(SimpleSpeakQlParser.PasswordFunctionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#selectElementDelimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElementDelimiter(SimpleSpeakQlParser.SelectElementDelimiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#whereKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereKeyword(SimpleSpeakQlParser.WhereKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#whereExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereExpression(SimpleSpeakQlParser.WhereExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#tableExpressionNoJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExpressionNoJoin(SimpleSpeakQlParser.TableExpressionNoJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSpeakQlParser#tableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExpression(SimpleSpeakQlParser.TableExpressionContext ctx);
}