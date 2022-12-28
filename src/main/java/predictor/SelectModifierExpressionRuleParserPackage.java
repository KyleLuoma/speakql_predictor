package predictor;

import org.antlr.v4.runtime.ParserRuleContext;

public class SelectModifierExpressionRuleParserPackage extends ParserPackage{

    public SelectModifierExpressionRuleParserPackage(String query) {
        this.updateWithNewQuery(query);
    }

    public ParserRuleContext generateTree() {
        return parser.selectModifierExpression();
    }
}
