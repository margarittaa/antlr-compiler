package nodes;

import java.util.ArrayList;

public class VarDefineNode extends Node {
    public String type;
    public String id;
    public ArrayList<Node> exprs;
    public ArrayList<Node> arrValues;

}
