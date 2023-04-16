package com.kwai.eve.typevalue.Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Type extends Enum	// class@000dd4
{
    public final int _value;
    public static final Type[] $VALUES;
    public static final Type Array;
    public static final Type BlockData;
    public static final Type Boolean;
    public static final Type Data;
    public static final Type Float;
    public static final Type Integer;
    public static final Type Map;
    public static final Type Number;
    public static final Type Pb;
    public static final Type String;
    public static final Type UnSupported;

    static {
       Type[] typeArray = new Type[11];
       Type type = new Type("Number", 0, 1);
       Type.Number = type;
       typeArray[0] = type;
       type = new Type("Boolean", 1, 2);
       Type.Boolean = type;
       typeArray[1] = type;
       type = new Type("String", 2, 3);
       Type.String = type;
       typeArray[2] = type;
       type = new Type("Array", 3, 4);
       Type.Array = type;
       typeArray[3] = type;
       type = new Type("Map", 4, 5);
       Type.Map = type;
       typeArray[4] = type;
       type = new Type("Integer", 5, 8);
       Type.Integer = type;
       typeArray[5] = type;
       type = new Type("Data", 6, 9);
       Type.Data = type;
       typeArray[6] = type;
       type = new Type("Float", 7, 19);
       Type.Float = type;
       typeArray[7] = type;
       type = new Type("Pb", 8, 20);
       Type.Pb = type;
       typeArray[8] = type;
       type = new Type("BlockData", 9, 40);
       Type.BlockData = type;
       typeArray[9] = type;
       type = new Type("UnSupported", 10, 100);
       Type.UnSupported = type;
       typeArray[10] = type;
       Type.$VALUES = typeArray;
    }
    public void Type(String p0,int p1,int p2){
       super(p0, p1);
       this._value = p2;
    }
    public static Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(Type.class, p0);
    }
    public static Type[] values(){
       Object obj = PatchProxy.apply(null, null, Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Type.$VALUES.clone();
    }
    public final int value(){
       return this._value;
    }
}
