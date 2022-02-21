package dag;

import java.util.ArrayList;

public class DagNode {

    private ArrayList<DagNode> children;
    private String value;
    private TokenType type;
    private Boolean isRoot;
    private Integer depth;

    public enum TokenType {
        KEYWORD, SYMBOL, LITERAL
    }

    public DagNode(String value, TokenType type, Integer depth) {
        this.type = type;
        this.value = value;
        this.depth = depth;
        this.isRoot = depth == 0;
        this.children = new ArrayList<>();

    }

    public ArrayList<DagNode> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<DagNode> children) {
        this.children = children;
    }

    public void addChild(DagNode newChild) {
        newChild.setDepth(this.getDepth() + 1);
        this.children.add(newChild);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TokenType getType() {
        return type;
    }

    public void setType(TokenType type) {
        this.type = type;
    }

    public Boolean getRoot() {
        return isRoot;
    }

    public void setRoot(Boolean root) {
        isRoot = root;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }
}
