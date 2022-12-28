package predictor;

import org.antlr.v4.runtime.ParserRuleContext;

public class TableExpressionRuleParserPackage extends ParserPackage{

    public TableExpressionRuleParserPackage(String query) {
        this.updateWithNewQuery(query);
    }

    public ParserRuleContext generateTree() {
        return parser.tableExpression();
    }
}
