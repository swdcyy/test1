package com.kwaishou.merchant.troubleshooting.core.model.NodeType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class NodeType extends Enum	// class@001354
{
    public static final NodeType[] $VALUES;
    public static final NodeType BUSINESS_NODE;
    public static final NodeType ENV_NODE;
    public static final NodeType NONE;

    public static final NodeType[] $values(){
       NodeType[] nodeTypeArra = new NodeType[]{NodeType.NONE,NodeType.ENV_NODE,NodeType.BUSINESS_NODE};
       return nodeTypeArra;
    }
    static {
       NodeType.NONE = new NodeType("NONE", 0);
       NodeType.ENV_NODE = new NodeType("ENV_NODE", 1);
       NodeType.BUSINESS_NODE = new NodeType("BUSINESS_NODE", 2);
       NodeType.$VALUES = NodeType.$values();
    }
    public void NodeType(String p0,int p1){
       super(p0, p1);
    }
    public static NodeType valueOf(String p0){
       return Enum.valueOf(NodeType.class, p0);
    }
    public static NodeType[] values(){
       return NodeType.$VALUES.clone();
    }
}
