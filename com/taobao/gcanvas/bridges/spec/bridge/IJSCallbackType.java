package com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class IJSCallbackType extends Enum	// class@000dfc
{
    public static final IJSCallbackType[] $VALUES;
    public static final IJSCallbackType Array;
    public static final IJSCallbackType Boolean;
    public static final IJSCallbackType Map;
    public static final IJSCallbackType Null;
    public static final IJSCallbackType Number;
    public static final IJSCallbackType String;

    static {
       IJSCallbackType iJSCallbackT = new IJSCallbackType("Null", 0);
       IJSCallbackType.Null = iJSCallbackT;
       IJSCallbackType iJSCallbackT1 = new IJSCallbackType("Boolean", 1);
       IJSCallbackType.Boolean = iJSCallbackT1;
       IJSCallbackType iJSCallbackT2 = new IJSCallbackType("Number", 2);
       IJSCallbackType.Number = iJSCallbackT2;
       IJSCallbackType iJSCallbackT3 = new IJSCallbackType("String", 3);
       IJSCallbackType.String = iJSCallbackT3;
       IJSCallbackType iJSCallbackT4 = new IJSCallbackType("Map", 4);
       IJSCallbackType.Map = iJSCallbackT4;
       IJSCallbackType iJSCallbackT5 = new IJSCallbackType("Array", 5);
       IJSCallbackType.Array = iJSCallbackT5;
       IJSCallbackType[] iJSCallbackT6 = new IJSCallbackType[]{iJSCallbackT,iJSCallbackT1,iJSCallbackT2,iJSCallbackT3,iJSCallbackT4,iJSCallbackT5};
       IJSCallbackType.$VALUES = iJSCallbackT6;
    }
    public void IJSCallbackType(String p0,int p1){
       super(p0, p1);
    }
    public static IJSCallbackType valueOf(String p0){
       return Enum.valueOf(IJSCallbackType.class, p0);
    }
    public static IJSCallbackType[] values(){
       return IJSCallbackType.$VALUES.clone();
    }
}
