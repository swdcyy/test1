package com.facebook.react.bridge.ReadableType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ReadableType extends Enum	// class@001235
{
    public static final ReadableType[] $VALUES;
    public static final ReadableType Array;
    public static final ReadableType Boolean;
    public static final ReadableType Map;
    public static final ReadableType Null;
    public static final ReadableType Number;
    public static final ReadableType String;

    static {
       ReadableType readableType = new ReadableType("Null", 0);
       ReadableType.Null = readableType;
       ReadableType readableType1 = new ReadableType("Boolean", 1);
       ReadableType.Boolean = readableType1;
       ReadableType readableType2 = new ReadableType("Number", 2);
       ReadableType.Number = readableType2;
       ReadableType readableType3 = new ReadableType("String", 3);
       ReadableType.String = readableType3;
       ReadableType readableType4 = new ReadableType("Map", 4);
       ReadableType.Map = readableType4;
       ReadableType readableType5 = new ReadableType("Array", 5);
       ReadableType.Array = readableType5;
       ReadableType[] readableType6 = new ReadableType[]{readableType,readableType1,readableType2,readableType3,readableType4,readableType5};
       ReadableType.$VALUES = readableType6;
    }
    public void ReadableType(String p0,int p1){
       super(p0, p1);
    }
    public static ReadableType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ReadableType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ReadableType.class, p0);
    }
    public static ReadableType[] values(){
       Object obj = PatchProxy.apply(null, null, ReadableType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReadableType.$VALUES.clone();
    }
}
