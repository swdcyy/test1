package com.taobao.gcanvas.bridges.spec.module.IGBridgeModule$ContextType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class IGBridgeModule$ContextType extends Enum	// class@000dfd
{
    public int value;
    public static final IGBridgeModule$ContextType[] $VALUES;
    public static final IGBridgeModule$ContextType _2D;
    public static final IGBridgeModule$ContextType _3D;

    static {
       IGBridgeModule$ContextType uContextType = new IGBridgeModule$ContextType("_2D", 0, 0);
       IGBridgeModule$ContextType._2D = uContextType;
       IGBridgeModule$ContextType uContextType1 = new IGBridgeModule$ContextType("_3D", 1, 1);
       IGBridgeModule$ContextType._3D = uContextType1;
       IGBridgeModule$ContextType[] uContextType2 = new IGBridgeModule$ContextType[]{uContextType,uContextType1};
       IGBridgeModule$ContextType.$VALUES = uContextType2;
    }
    public void IGBridgeModule$ContextType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static IGBridgeModule$ContextType valueOf(String p0){
       return Enum.valueOf(IGBridgeModule$ContextType.class, p0);
    }
    public static IGBridgeModule$ContextType[] values(){
       return IGBridgeModule$ContextType.$VALUES.clone();
    }
    public int value(){
       return this.value;
    }
}
