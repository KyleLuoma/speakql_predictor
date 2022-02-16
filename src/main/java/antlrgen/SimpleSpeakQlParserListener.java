// Generated from SimpleSpeakQlParser.g4 by ANTLR 4.9.3
package antlrgen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleSpeakQlParser}.
 */
public interface SimpleSpeakQlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SimpleSpeakQlParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SimpleSpeakQlParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelect(SimpleSpeakQlParser.SimpleSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelect(SimpleSpeakQlParser.SimpleSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisSelect(SimpleSpeakQlParser.ParenthesisSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisSelect(SimpleSpeakQlParser.ParenthesisSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionSelect(SimpleSpeakQlParser.UnionSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionSelect(SimpleSpeakQlParser.UnionSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionParenthesisSelect(SimpleSpeakQlParser.UnionParenthesisSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionParenthesisSelect(SimpleSpeakQlParser.UnionParenthesisSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleQuerySpecification}
	 * labeled alternative in {@link SimpleSpeakQlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterSingleQuerySpecification(SimpleSpeakQlParser.SingleQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleQuerySpecification}
	 * labeled alternative in {@link SimpleSpeakQlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitSingleQuerySpecification(SimpleSpeakQlParser.SingleQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiQuerySpecification}
	 * labeled alternative in {@link SimpleSpeakQlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterMultiQuerySpecification(SimpleSpeakQlParser.MultiQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiQuerySpecification}
	 * labeled alternative in {@link SimpleSpeakQlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitMultiQuerySpecification(SimpleSpeakQlParser.MultiQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#queryOrderSpecification}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrderSpecification(SimpleSpeakQlParser.QueryOrderSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#queryOrderSpecification}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrderSpecification(SimpleSpeakQlParser.QueryOrderSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#multiQueryOrderSpecification}.
	 * @param ctx the parse tree
	 */
	void enterMultiQueryOrderSpecification(SimpleSpeakQlParser.MultiQueryOrderSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#multiQueryOrderSpecification}.
	 * @param ctx the parse tree
	 */
	void exitMultiQueryOrderSpecification(SimpleSpeakQlParser.MultiQueryOrderSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#selectExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpression(SimpleSpeakQlParser.SelectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#selectExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpression(SimpleSpeakQlParser.SelectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(SimpleSpeakQlParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(SimpleSpeakQlParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#selectKeyword}.
	 * @param ctx the parse tree
	 */
	void enterSelectKeyword(SimpleSpeakQlParser.SelectKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#selectKeyword}.
	 * @param ctx the parse tree
	 */
	void exitSelectKeyword(SimpleSpeakQlParser.SelectKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#nothingElement}.
	 * @param ctx the parse tree
	 */
	void enterNothingElement(SimpleSpeakQlParser.NothingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#nothingElement}.
	 * @param ctx the parse tree
	 */
	void exitNothingElement(SimpleSpeakQlParser.NothingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#nothingKeyword}.
	 * @param ctx the parse tree
	 */
	void enterNothingKeyword(SimpleSpeakQlParser.NothingKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#nothingKeyword}.
	 * @param ctx the parse tree
	 */
	void exitNothingKeyword(SimpleSpeakQlParser.NothingKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpec(SimpleSpeakQlParser.SelectSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpec(SimpleSpeakQlParser.SelectSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(SimpleSpeakQlParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(SimpleSpeakQlParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStarElement(SimpleSpeakQlParser.SelectStarElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStarElement(SimpleSpeakQlParser.SelectStarElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectColumnElement(SimpleSpeakQlParser.SelectColumnElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectColumnElement(SimpleSpeakQlParser.SelectColumnElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectFunctionElement(SimpleSpeakQlParser.SelectFunctionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectFunctionElement(SimpleSpeakQlParser.SelectFunctionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpressionElement(SimpleSpeakQlParser.SelectExpressionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpressionElement(SimpleSpeakQlParser.SelectExpressionElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#fullId}.
	 * @param ctx the parse tree
	 */
	void enterFullId(SimpleSpeakQlParser.FullIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#fullId}.
	 * @param ctx the parse tree
	 */
	void exitFullId(SimpleSpeakQlParser.FullIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(SimpleSpeakQlParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(SimpleSpeakQlParser.UidContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#simpleId}.
	 * @param ctx the parse tree
	 */
	void enterSimpleId(SimpleSpeakQlParser.SimpleIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#simpleId}.
	 * @param ctx the parse tree
	 */
	void exitSimpleId(SimpleSpeakQlParser.SimpleIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#charsetNameBase}.
	 * @param ctx the parse tree
	 */
	void enterCharsetNameBase(SimpleSpeakQlParser.CharsetNameBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#charsetNameBase}.
	 * @param ctx the parse tree
	 */
	void exitCharsetNameBase(SimpleSpeakQlParser.CharsetNameBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 */
	void enterTransactionLevelBase(SimpleSpeakQlParser.TransactionLevelBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 */
	void exitTransactionLevelBase(SimpleSpeakQlParser.TransactionLevelBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#engineName}.
	 * @param ctx the parse tree
	 */
	void enterEngineName(SimpleSpeakQlParser.EngineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#engineName}.
	 * @param ctx the parse tree
	 */
	void exitEngineName(SimpleSpeakQlParser.EngineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#privilegesBase}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegesBase(SimpleSpeakQlParser.PrivilegesBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#privilegesBase}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegesBase(SimpleSpeakQlParser.PrivilegesBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 */
	void enterIntervalTypeBase(SimpleSpeakQlParser.IntervalTypeBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 */
	void exitIntervalTypeBase(SimpleSpeakQlParser.IntervalTypeBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#dataTypeBase}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeBase(SimpleSpeakQlParser.DataTypeBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#dataTypeBase}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeBase(SimpleSpeakQlParser.DataTypeBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 */
	void enterKeywordsCanBeId(SimpleSpeakQlParser.KeywordsCanBeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 */
	void exitKeywordsCanBeId(SimpleSpeakQlParser.KeywordsCanBeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#functionNameBase}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNameBase(SimpleSpeakQlParser.FunctionNameBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#functionNameBase}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNameBase(SimpleSpeakQlParser.FunctionNameBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#selectElementDot}.
	 * @param ctx the parse tree
	 */
	void enterSelectElementDot(SimpleSpeakQlParser.SelectElementDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#selectElementDot}.
	 * @param ctx the parse tree
	 */
	void exitSelectElementDot(SimpleSpeakQlParser.SelectElementDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnName(SimpleSpeakQlParser.FullColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnName(SimpleSpeakQlParser.FullColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#dottedId}.
	 * @param ctx the parse tree
	 */
	void enterDottedId(SimpleSpeakQlParser.DottedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#dottedId}.
	 * @param ctx the parse tree
	 */
	void exitDottedId(SimpleSpeakQlParser.DottedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#selectElementAs}.
	 * @param ctx the parse tree
	 */
	void enterSelectElementAs(SimpleSpeakQlParser.SelectElementAsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#selectElementAs}.
	 * @param ctx the parse tree
	 */
	void exitSelectElementAs(SimpleSpeakQlParser.SelectElementAsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSpecificFunctionCall(SimpleSpeakQlParser.SpecificFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSpecificFunctionCall(SimpleSpeakQlParser.SpecificFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunctionCall(SimpleSpeakQlParser.AggregateFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunctionCall(SimpleSpeakQlParser.AggregateFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonAggregateFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterNonAggregateFunctionCall(SimpleSpeakQlParser.NonAggregateFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonAggregateFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitNonAggregateFunctionCall(SimpleSpeakQlParser.NonAggregateFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunctionCall(SimpleSpeakQlParser.ScalarFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunctionCall(SimpleSpeakQlParser.ScalarFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterUdfFunctionCall(SimpleSpeakQlParser.UdfFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitUdfFunctionCall(SimpleSpeakQlParser.UdfFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPasswordFunctionCall(SimpleSpeakQlParser.PasswordFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPasswordFunctionCall(SimpleSpeakQlParser.PasswordFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFunctionCall(SimpleSpeakQlParser.SimpleFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFunctionCall(SimpleSpeakQlParser.SimpleFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeFunctionCall(SimpleSpeakQlParser.DataTypeFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeFunctionCall(SimpleSpeakQlParser.DataTypeFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterValuesFunctionCall(SimpleSpeakQlParser.ValuesFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitValuesFunctionCall(SimpleSpeakQlParser.ValuesFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseExpressionFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpressionFunctionCall(SimpleSpeakQlParser.CaseExpressionFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseExpressionFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpressionFunctionCall(SimpleSpeakQlParser.CaseExpressionFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCaseFunctionCall(SimpleSpeakQlParser.CaseFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCaseFunctionCall(SimpleSpeakQlParser.CaseFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunctionCall(SimpleSpeakQlParser.CharFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunctionCall(SimpleSpeakQlParser.CharFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunctionCall(SimpleSpeakQlParser.PositionFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunctionCall(SimpleSpeakQlParser.PositionFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstrFunctionCall(SimpleSpeakQlParser.SubstrFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstrFunctionCall(SimpleSpeakQlParser.SubstrFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunctionCall(SimpleSpeakQlParser.TrimFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunctionCall(SimpleSpeakQlParser.TrimFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterWeightFunctionCall(SimpleSpeakQlParser.WeightFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitWeightFunctionCall(SimpleSpeakQlParser.WeightFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunctionCall(SimpleSpeakQlParser.ExtractFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunctionCall(SimpleSpeakQlParser.ExtractFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterGetFormatFunctionCall(SimpleSpeakQlParser.GetFormatFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitGetFormatFunctionCall(SimpleSpeakQlParser.GetFormatFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonValueFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterJsonValueFunctionCall(SimpleSpeakQlParser.JsonValueFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonValueFunctionCall}
	 * labeled alternative in {@link SimpleSpeakQlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitJsonValueFunctionCall(SimpleSpeakQlParser.JsonValueFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#leftParen}.
	 * @param ctx the parse tree
	 */
	void enterLeftParen(SimpleSpeakQlParser.LeftParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#leftParen}.
	 * @param ctx the parse tree
	 */
	void exitLeftParen(SimpleSpeakQlParser.LeftParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#rightParen}.
	 * @param ctx the parse tree
	 */
	void enterRightParen(SimpleSpeakQlParser.RightParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#rightParen}.
	 * @param ctx the parse tree
	 */
	void exitRightParen(SimpleSpeakQlParser.RightParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link SimpleSpeakQlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpression(SimpleSpeakQlParser.IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link SimpleSpeakQlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpression(SimpleSpeakQlParser.IsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SimpleSpeakQlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SimpleSpeakQlParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SimpleSpeakQlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SimpleSpeakQlParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link SimpleSpeakQlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(SimpleSpeakQlParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link SimpleSpeakQlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(SimpleSpeakQlParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link SimpleSpeakQlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPredicateExpression(SimpleSpeakQlParser.PredicateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link SimpleSpeakQlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPredicateExpression(SimpleSpeakQlParser.PredicateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(SimpleSpeakQlParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(SimpleSpeakQlParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterSoundsLikePredicate(SimpleSpeakQlParser.SoundsLikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitSoundsLikePredicate(SimpleSpeakQlParser.SoundsLikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAtomPredicate(SimpleSpeakQlParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAtomPredicate(SimpleSpeakQlParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryComparisonPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryComparisonPredicate(SimpleSpeakQlParser.SubqueryComparisonPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryComparisonPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryComparisonPredicate(SimpleSpeakQlParser.SubqueryComparisonPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonMemberOfPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterJsonMemberOfPredicate(SimpleSpeakQlParser.JsonMemberOfPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonMemberOfPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitJsonMemberOfPredicate(SimpleSpeakQlParser.JsonMemberOfPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryComparisonPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComparisonPredicate(SimpleSpeakQlParser.BinaryComparisonPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryComparisonPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComparisonPredicate(SimpleSpeakQlParser.BinaryComparisonPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(SimpleSpeakQlParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(SimpleSpeakQlParser.InPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBetweenPredicate(SimpleSpeakQlParser.BetweenPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBetweenPredicate(SimpleSpeakQlParser.BetweenPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterIsNullPredicate(SimpleSpeakQlParser.IsNullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitIsNullPredicate(SimpleSpeakQlParser.IsNullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLikePredicate(SimpleSpeakQlParser.LikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLikePredicate(SimpleSpeakQlParser.LikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterRegexpPredicate(SimpleSpeakQlParser.RegexpPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link SimpleSpeakQlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitRegexpPredicate(SimpleSpeakQlParser.RegexpPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#isKeyword}.
	 * @param ctx the parse tree
	 */
	void enterIsKeyword(SimpleSpeakQlParser.IsKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#isKeyword}.
	 * @param ctx the parse tree
	 */
	void exitIsKeyword(SimpleSpeakQlParser.IsKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#expressionDelimiter}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDelimiter(SimpleSpeakQlParser.ExpressionDelimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#expressionDelimiter}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDelimiter(SimpleSpeakQlParser.ExpressionDelimiterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#selectModifierExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectModifierExpression(SimpleSpeakQlParser.SelectModifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#selectModifierExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectModifierExpression(SimpleSpeakQlParser.SelectModifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(SimpleSpeakQlParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(SimpleSpeakQlParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#groupByKeyword}.
	 * @param ctx the parse tree
	 */
	void enterGroupByKeyword(SimpleSpeakQlParser.GroupByKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#groupByKeyword}.
	 * @param ctx the parse tree
	 */
	void exitGroupByKeyword(SimpleSpeakQlParser.GroupByKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void enterGroupByItem(SimpleSpeakQlParser.GroupByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void exitGroupByItem(SimpleSpeakQlParser.GroupByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#automaticGroupByKeyword}.
	 * @param ctx the parse tree
	 */
	void enterAutomaticGroupByKeyword(SimpleSpeakQlParser.AutomaticGroupByKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#automaticGroupByKeyword}.
	 * @param ctx the parse tree
	 */
	void exitAutomaticGroupByKeyword(SimpleSpeakQlParser.AutomaticGroupByKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#groupByExpression}.
	 * @param ctx the parse tree
	 */
	void enterGroupByExpression(SimpleSpeakQlParser.GroupByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#groupByExpression}.
	 * @param ctx the parse tree
	 */
	void exitGroupByExpression(SimpleSpeakQlParser.GroupByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#groupByItemDelimiter}.
	 * @param ctx the parse tree
	 */
	void enterGroupByItemDelimiter(SimpleSpeakQlParser.GroupByItemDelimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#groupByItemDelimiter}.
	 * @param ctx the parse tree
	 */
	void exitGroupByItemDelimiter(SimpleSpeakQlParser.GroupByItemDelimiterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(SimpleSpeakQlParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(SimpleSpeakQlParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#havingKeyword}.
	 * @param ctx the parse tree
	 */
	void enterHavingKeyword(SimpleSpeakQlParser.HavingKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#havingKeyword}.
	 * @param ctx the parse tree
	 */
	void exitHavingKeyword(SimpleSpeakQlParser.HavingKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(SimpleSpeakQlParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(SimpleSpeakQlParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#windowName}.
	 * @param ctx the parse tree
	 */
	void enterWindowName(SimpleSpeakQlParser.WindowNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#windowName}.
	 * @param ctx the parse tree
	 */
	void exitWindowName(SimpleSpeakQlParser.WindowNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowSpec(SimpleSpeakQlParser.WindowSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowSpec(SimpleSpeakQlParser.WindowSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionClause(SimpleSpeakQlParser.PartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionClause(SimpleSpeakQlParser.PartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SimpleSpeakQlParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SimpleSpeakQlParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpression(SimpleSpeakQlParser.OrderByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpression(SimpleSpeakQlParser.OrderByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void enterFrameClause(SimpleSpeakQlParser.FrameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void exitFrameClause(SimpleSpeakQlParser.FrameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#frameUnits}.
	 * @param ctx the parse tree
	 */
	void enterFrameUnits(SimpleSpeakQlParser.FrameUnitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#frameUnits}.
	 * @param ctx the parse tree
	 */
	void exitFrameUnits(SimpleSpeakQlParser.FrameUnitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#frameExtent}.
	 * @param ctx the parse tree
	 */
	void enterFrameExtent(SimpleSpeakQlParser.FrameExtentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#frameExtent}.
	 * @param ctx the parse tree
	 */
	void exitFrameExtent(SimpleSpeakQlParser.FrameExtentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#frameRange}.
	 * @param ctx the parse tree
	 */
	void enterFrameRange(SimpleSpeakQlParser.FrameRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#frameRange}.
	 * @param ctx the parse tree
	 */
	void exitFrameRange(SimpleSpeakQlParser.FrameRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void enterFrameBetween(SimpleSpeakQlParser.FrameBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void exitFrameBetween(SimpleSpeakQlParser.FrameBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(SimpleSpeakQlParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(SimpleSpeakQlParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 */
	void enterLimitClauseAtom(SimpleSpeakQlParser.LimitClauseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 */
	void exitLimitClauseAtom(SimpleSpeakQlParser.LimitClauseAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoVariables(SimpleSpeakQlParser.SelectIntoVariablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoVariables(SimpleSpeakQlParser.SelectIntoVariablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoDumpFile(SimpleSpeakQlParser.SelectIntoDumpFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoDumpFile(SimpleSpeakQlParser.SelectIntoDumpFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoTextFile(SimpleSpeakQlParser.SelectIntoTextFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link SimpleSpeakQlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoTextFile(SimpleSpeakQlParser.SelectIntoTextFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#assignmentField}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentField(SimpleSpeakQlParser.AssignmentFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#assignmentField}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentField(SimpleSpeakQlParser.AssignmentFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectFieldsInto(SimpleSpeakQlParser.SelectFieldsIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectFieldsInto(SimpleSpeakQlParser.SelectFieldsIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectLinesInto(SimpleSpeakQlParser.SelectLinesIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectLinesInto(SimpleSpeakQlParser.SelectLinesIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void enterLockClause(SimpleSpeakQlParser.LockClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void exitLockClause(SimpleSpeakQlParser.LockClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpression(SimpleSpeakQlParser.QueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpression(SimpleSpeakQlParser.QueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecificationNointo(SimpleSpeakQlParser.QuerySpecificationNointoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecificationNointo(SimpleSpeakQlParser.QuerySpecificationNointoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#fromClauseNoJoin}.
	 * @param ctx the parse tree
	 */
	void enterFromClauseNoJoin(SimpleSpeakQlParser.FromClauseNoJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#fromClauseNoJoin}.
	 * @param ctx the parse tree
	 */
	void exitFromClauseNoJoin(SimpleSpeakQlParser.FromClauseNoJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SimpleSpeakQlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SimpleSpeakQlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#fromKeyword}.
	 * @param ctx the parse tree
	 */
	void enterFromKeyword(SimpleSpeakQlParser.FromKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#fromKeyword}.
	 * @param ctx the parse tree
	 */
	void exitFromKeyword(SimpleSpeakQlParser.FromKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#tableKeyword}.
	 * @param ctx the parse tree
	 */
	void enterTableKeyword(SimpleSpeakQlParser.TableKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#tableKeyword}.
	 * @param ctx the parse tree
	 */
	void exitTableKeyword(SimpleSpeakQlParser.TableKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void enterTableSources(SimpleSpeakQlParser.TableSourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void exitTableSources(SimpleSpeakQlParser.TableSourcesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourceNoJoinBase}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceNoJoin}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceNoJoinBase(SimpleSpeakQlParser.TableSourceNoJoinBaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceNoJoinBase}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceNoJoin}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceNoJoinBase(SimpleSpeakQlParser.TableSourceNoJoinBaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourceNoJoinNested}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceNoJoin}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceNoJoinNested(SimpleSpeakQlParser.TableSourceNoJoinNestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceNoJoinNested}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceNoJoin}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceNoJoinNested(SimpleSpeakQlParser.TableSourceNoJoinNestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceBase(SimpleSpeakQlParser.TableSourceBaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceBase(SimpleSpeakQlParser.TableSourceBaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceNested(SimpleSpeakQlParser.TableSourceNestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceNested(SimpleSpeakQlParser.TableSourceNestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryTableItem(SimpleSpeakQlParser.SubqueryTableItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryTableItem(SimpleSpeakQlParser.SubqueryTableItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onlyTableNameItem}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterOnlyTableNameItem(SimpleSpeakQlParser.OnlyTableNameItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onlyTableNameItem}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitOnlyTableNameItem(SimpleSpeakQlParser.OnlyTableNameItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterAtomTableItem(SimpleSpeakQlParser.AtomTableItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitAtomTableItem(SimpleSpeakQlParser.AtomTableItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterTableSourcesItem(SimpleSpeakQlParser.TableSourcesItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link SimpleSpeakQlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitTableSourcesItem(SimpleSpeakQlParser.TableSourcesItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#subQueryTable}.
	 * @param ctx the parse tree
	 */
	void enterSubQueryTable(SimpleSpeakQlParser.SubQueryTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#subQueryTable}.
	 * @param ctx the parse tree
	 */
	void exitSubQueryTable(SimpleSpeakQlParser.SubQueryTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(SimpleSpeakQlParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(SimpleSpeakQlParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#tableAliasAs}.
	 * @param ctx the parse tree
	 */
	void enterTableAliasAs(SimpleSpeakQlParser.TableAliasAsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#tableAliasAs}.
	 * @param ctx the parse tree
	 */
	void exitTableAliasAs(SimpleSpeakQlParser.TableAliasAsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SimpleSpeakQlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SimpleSpeakQlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#uidList}.
	 * @param ctx the parse tree
	 */
	void enterUidList(SimpleSpeakQlParser.UidListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#uidList}.
	 * @param ctx the parse tree
	 */
	void exitUidList(SimpleSpeakQlParser.UidListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void enterIndexHint(SimpleSpeakQlParser.IndexHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void exitIndexHint(SimpleSpeakQlParser.IndexHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#indexHintType}.
	 * @param ctx the parse tree
	 */
	void enterIndexHintType(SimpleSpeakQlParser.IndexHintTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#indexHintType}.
	 * @param ctx the parse tree
	 */
	void exitIndexHintType(SimpleSpeakQlParser.IndexHintTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#joinKeyword}.
	 * @param ctx the parse tree
	 */
	void enterJoinKeyword(SimpleSpeakQlParser.JoinKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#joinKeyword}.
	 * @param ctx the parse tree
	 */
	void exitJoinKeyword(SimpleSpeakQlParser.JoinKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#multiJoinExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiJoinExpression(SimpleSpeakQlParser.MultiJoinExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#multiJoinExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiJoinExpression(SimpleSpeakQlParser.MultiJoinExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#multiJoinPart}.
	 * @param ctx the parse tree
	 */
	void enterMultiJoinPart(SimpleSpeakQlParser.MultiJoinPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#multiJoinPart}.
	 * @param ctx the parse tree
	 */
	void exitMultiJoinPart(SimpleSpeakQlParser.MultiJoinPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#multiInnerJoin}.
	 * @param ctx the parse tree
	 */
	void enterMultiInnerJoin(SimpleSpeakQlParser.MultiInnerJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#multiInnerJoin}.
	 * @param ctx the parse tree
	 */
	void exitMultiInnerJoin(SimpleSpeakQlParser.MultiInnerJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#multiOuterJoin}.
	 * @param ctx the parse tree
	 */
	void enterMultiOuterJoin(SimpleSpeakQlParser.MultiOuterJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#multiOuterJoin}.
	 * @param ctx the parse tree
	 */
	void exitMultiOuterJoin(SimpleSpeakQlParser.MultiOuterJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#multiNaturalJoin}.
	 * @param ctx the parse tree
	 */
	void enterMultiNaturalJoin(SimpleSpeakQlParser.MultiNaturalJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#multiNaturalJoin}.
	 * @param ctx the parse tree
	 */
	void exitMultiNaturalJoin(SimpleSpeakQlParser.MultiNaturalJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#withKeyword}.
	 * @param ctx the parse tree
	 */
	void enterWithKeyword(SimpleSpeakQlParser.WithKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#withKeyword}.
	 * @param ctx the parse tree
	 */
	void exitWithKeyword(SimpleSpeakQlParser.WithKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterJoinPart(SimpleSpeakQlParser.JoinPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitJoinPart(SimpleSpeakQlParser.JoinPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#innerJoin}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoin(SimpleSpeakQlParser.InnerJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#innerJoin}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoin(SimpleSpeakQlParser.InnerJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#innerJoinKeyword}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoinKeyword(SimpleSpeakQlParser.InnerJoinKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#innerJoinKeyword}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoinKeyword(SimpleSpeakQlParser.InnerJoinKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#onKeyword}.
	 * @param ctx the parse tree
	 */
	void enterOnKeyword(SimpleSpeakQlParser.OnKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#onKeyword}.
	 * @param ctx the parse tree
	 */
	void exitOnKeyword(SimpleSpeakQlParser.OnKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#outerJoin}.
	 * @param ctx the parse tree
	 */
	void enterOuterJoin(SimpleSpeakQlParser.OuterJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#outerJoin}.
	 * @param ctx the parse tree
	 */
	void exitOuterJoin(SimpleSpeakQlParser.OuterJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#joinDirection}.
	 * @param ctx the parse tree
	 */
	void enterJoinDirection(SimpleSpeakQlParser.JoinDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#joinDirection}.
	 * @param ctx the parse tree
	 */
	void exitJoinDirection(SimpleSpeakQlParser.JoinDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#outerJoinKeyword}.
	 * @param ctx the parse tree
	 */
	void enterOuterJoinKeyword(SimpleSpeakQlParser.OuterJoinKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#outerJoinKeyword}.
	 * @param ctx the parse tree
	 */
	void exitOuterJoinKeyword(SimpleSpeakQlParser.OuterJoinKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#naturalJoin}.
	 * @param ctx the parse tree
	 */
	void enterNaturalJoin(SimpleSpeakQlParser.NaturalJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#naturalJoin}.
	 * @param ctx the parse tree
	 */
	void exitNaturalJoin(SimpleSpeakQlParser.NaturalJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#naturalJoinKeyword}.
	 * @param ctx the parse tree
	 */
	void enterNaturalJoinKeyword(SimpleSpeakQlParser.NaturalJoinKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#naturalJoinKeyword}.
	 * @param ctx the parse tree
	 */
	void exitNaturalJoinKeyword(SimpleSpeakQlParser.NaturalJoinKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#tableSourceDelimiter}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceDelimiter(SimpleSpeakQlParser.TableSourceDelimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#tableSourceDelimiter}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceDelimiter(SimpleSpeakQlParser.TableSourceDelimiterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#unionStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionStatement(SimpleSpeakQlParser.UnionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#unionStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionStatement(SimpleSpeakQlParser.UnionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionNointo(SimpleSpeakQlParser.QueryExpressionNointoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionNointo(SimpleSpeakQlParser.QueryExpressionNointoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#unionParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterUnionParenthesis(SimpleSpeakQlParser.UnionParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#unionParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitUnionParenthesis(SimpleSpeakQlParser.UnionParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(SimpleSpeakQlParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(SimpleSpeakQlParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void enterNullNotnull(SimpleSpeakQlParser.NullNotnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void exitNullNotnull(SimpleSpeakQlParser.NullNotnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SimpleSpeakQlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SimpleSpeakQlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionAtom(SimpleSpeakQlParser.UnaryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionAtom(SimpleSpeakQlParser.UnaryExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterCollateExpressionAtom(SimpleSpeakQlParser.CollateExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitCollateExpressionAtom(SimpleSpeakQlParser.CollateExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMysqlVariableExpressionAtom(SimpleSpeakQlParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMysqlVariableExpressionAtom(SimpleSpeakQlParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpressionAtom(SimpleSpeakQlParser.NestedExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpressionAtom(SimpleSpeakQlParser.NestedExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterNestedRowExpressionAtom(SimpleSpeakQlParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitNestedRowExpressionAtom(SimpleSpeakQlParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionAtom(SimpleSpeakQlParser.MathExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionAtom(SimpleSpeakQlParser.MathExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code existsExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterExistsExpressionAtom(SimpleSpeakQlParser.ExistsExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existsExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitExistsExpressionAtom(SimpleSpeakQlParser.ExistsExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpressionAtom(SimpleSpeakQlParser.IntervalExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpressionAtom(SimpleSpeakQlParser.IntervalExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterJsonExpressionAtom(SimpleSpeakQlParser.JsonExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitJsonExpressionAtom(SimpleSpeakQlParser.JsonExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpressionAtom(SimpleSpeakQlParser.SubqueryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpressionAtom(SimpleSpeakQlParser.SubqueryExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpressionAtom(SimpleSpeakQlParser.ConstantExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpressionAtom(SimpleSpeakQlParser.ConstantExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpressionAtom(SimpleSpeakQlParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpressionAtom(SimpleSpeakQlParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionAtom(SimpleSpeakQlParser.BinaryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionAtom(SimpleSpeakQlParser.BinaryExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnNameExpressionAtom(SimpleSpeakQlParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnNameExpressionAtom(SimpleSpeakQlParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterBitExpressionAtom(SimpleSpeakQlParser.BitExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link SimpleSpeakQlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitBitExpressionAtom(SimpleSpeakQlParser.BitExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SimpleSpeakQlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SimpleSpeakQlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SimpleSpeakQlParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SimpleSpeakQlParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(SimpleSpeakQlParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(SimpleSpeakQlParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(SimpleSpeakQlParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(SimpleSpeakQlParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(SimpleSpeakQlParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(SimpleSpeakQlParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SimpleSpeakQlParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SimpleSpeakQlParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#mysqlVariable}.
	 * @param ctx the parse tree
	 */
	void enterMysqlVariable(SimpleSpeakQlParser.MysqlVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#mysqlVariable}.
	 * @param ctx the parse tree
	 */
	void exitMysqlVariable(SimpleSpeakQlParser.MysqlVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(SimpleSpeakQlParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(SimpleSpeakQlParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#intervalType}.
	 * @param ctx the parse tree
	 */
	void enterIntervalType(SimpleSpeakQlParser.IntervalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#intervalType}.
	 * @param ctx the parse tree
	 */
	void exitIntervalType(SimpleSpeakQlParser.IntervalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void enterBitOperator(SimpleSpeakQlParser.BitOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void exitBitOperator(SimpleSpeakQlParser.BitOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathOperator(SimpleSpeakQlParser.MathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathOperator(SimpleSpeakQlParser.MathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonOperator(SimpleSpeakQlParser.JsonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonOperator(SimpleSpeakQlParser.JsonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#convertedDataType}.
	 * @param ctx the parse tree
	 */
	void enterConvertedDataType(SimpleSpeakQlParser.ConvertedDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#convertedDataType}.
	 * @param ctx the parse tree
	 */
	void exitConvertedDataType(SimpleSpeakQlParser.ConvertedDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthOneDimension(SimpleSpeakQlParser.LengthOneDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthOneDimension(SimpleSpeakQlParser.LengthOneDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void enterCharsetName(SimpleSpeakQlParser.CharsetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void exitCharsetName(SimpleSpeakQlParser.CharsetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthTwoDimension(SimpleSpeakQlParser.LengthTwoDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthTwoDimension(SimpleSpeakQlParser.LengthTwoDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 */
	void enterCaseFuncAlternative(SimpleSpeakQlParser.CaseFuncAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 */
	void exitCaseFuncAlternative(SimpleSpeakQlParser.CaseFuncAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(SimpleSpeakQlParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(SimpleSpeakQlParser.FunctionArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link SimpleSpeakQlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void enterLevelWeightList(SimpleSpeakQlParser.LevelWeightListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link SimpleSpeakQlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void exitLevelWeightList(SimpleSpeakQlParser.LevelWeightListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link SimpleSpeakQlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void enterLevelWeightRange(SimpleSpeakQlParser.LevelWeightRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link SimpleSpeakQlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void exitLevelWeightRange(SimpleSpeakQlParser.LevelWeightRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void enterLevelInWeightListElement(SimpleSpeakQlParser.LevelInWeightListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void exitLevelInWeightListElement(SimpleSpeakQlParser.LevelInWeightListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(SimpleSpeakQlParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(SimpleSpeakQlParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#currentTimestamp}.
	 * @param ctx the parse tree
	 */
	void enterCurrentTimestamp(SimpleSpeakQlParser.CurrentTimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#currentTimestamp}.
	 * @param ctx the parse tree
	 */
	void exitCurrentTimestamp(SimpleSpeakQlParser.CurrentTimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateWindowedFunction(SimpleSpeakQlParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateWindowedFunction(SimpleSpeakQlParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#ofKeyword}.
	 * @param ctx the parse tree
	 */
	void enterOfKeyword(SimpleSpeakQlParser.OfKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#ofKeyword}.
	 * @param ctx the parse tree
	 */
	void exitOfKeyword(SimpleSpeakQlParser.OfKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#theKeyword}.
	 * @param ctx the parse tree
	 */
	void enterTheKeyword(SimpleSpeakQlParser.TheKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#theKeyword}.
	 * @param ctx the parse tree
	 */
	void exitTheKeyword(SimpleSpeakQlParser.TheKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(SimpleSpeakQlParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(SimpleSpeakQlParser.FunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#overClause}.
	 * @param ctx the parse tree
	 */
	void enterOverClause(SimpleSpeakQlParser.OverClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#overClause}.
	 * @param ctx the parse tree
	 */
	void exitOverClause(SimpleSpeakQlParser.OverClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#allAggregatorKeyword}.
	 * @param ctx the parse tree
	 */
	void enterAllAggregatorKeyword(SimpleSpeakQlParser.AllAggregatorKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#allAggregatorKeyword}.
	 * @param ctx the parse tree
	 */
	void exitAllAggregatorKeyword(SimpleSpeakQlParser.AllAggregatorKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#distinctAggregatorKeyword}.
	 * @param ctx the parse tree
	 */
	void enterDistinctAggregatorKeyword(SimpleSpeakQlParser.DistinctAggregatorKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#distinctAggregatorKeyword}.
	 * @param ctx the parse tree
	 */
	void exitDistinctAggregatorKeyword(SimpleSpeakQlParser.DistinctAggregatorKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#nonAggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void enterNonAggregateWindowedFunction(SimpleSpeakQlParser.NonAggregateWindowedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#nonAggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void exitNonAggregateWindowedFunction(SimpleSpeakQlParser.NonAggregateWindowedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunctionName(SimpleSpeakQlParser.ScalarFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunctionName(SimpleSpeakQlParser.ScalarFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 */
	void enterPasswordFunctionClause(SimpleSpeakQlParser.PasswordFunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 */
	void exitPasswordFunctionClause(SimpleSpeakQlParser.PasswordFunctionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#selectElementDelimiter}.
	 * @param ctx the parse tree
	 */
	void enterSelectElementDelimiter(SimpleSpeakQlParser.SelectElementDelimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#selectElementDelimiter}.
	 * @param ctx the parse tree
	 */
	void exitSelectElementDelimiter(SimpleSpeakQlParser.SelectElementDelimiterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#whereKeyword}.
	 * @param ctx the parse tree
	 */
	void enterWhereKeyword(SimpleSpeakQlParser.WhereKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#whereKeyword}.
	 * @param ctx the parse tree
	 */
	void exitWhereKeyword(SimpleSpeakQlParser.WhereKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhereExpression(SimpleSpeakQlParser.WhereExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhereExpression(SimpleSpeakQlParser.WhereExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#tableExpressionNoJoin}.
	 * @param ctx the parse tree
	 */
	void enterTableExpressionNoJoin(SimpleSpeakQlParser.TableExpressionNoJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#tableExpressionNoJoin}.
	 * @param ctx the parse tree
	 */
	void exitTableExpressionNoJoin(SimpleSpeakQlParser.TableExpressionNoJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSpeakQlParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void enterTableExpression(SimpleSpeakQlParser.TableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSpeakQlParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void exitTableExpression(SimpleSpeakQlParser.TableExpressionContext ctx);
}