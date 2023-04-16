package com.google.protobuf.WireFormat$JavaType;
import java.lang.Enum;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;
import java.lang.Boolean;
import com.google.protobuf.ByteString;
import java.lang.Class;

public final class WireFormat$JavaType extends Enum	// class@0004fb
{
    public final Object defaultDefault;
    public static final WireFormat$JavaType[] $VALUES;
    public static final WireFormat$JavaType BOOLEAN;
    public static final WireFormat$JavaType BYTE_STRING;
    public static final WireFormat$JavaType DOUBLE;
    public static final WireFormat$JavaType ENUM;
    public static final WireFormat$JavaType FLOAT;
    public static final WireFormat$JavaType INT;
    public static final WireFormat$JavaType LONG;
    public static final WireFormat$JavaType MESSAGE;
    public static final WireFormat$JavaType STRING;

    static {
       WireFormat$JavaType javaType = new WireFormat$JavaType("INT", 0, Integer.valueOf(0));
       WireFormat$JavaType.INT = javaType;
       WireFormat$JavaType javaType1 = new WireFormat$JavaType("LONG", 1, Long.valueOf(0));
       WireFormat$JavaType.LONG = javaType1;
       WireFormat$JavaType javaType2 = new WireFormat$JavaType("FLOAT", 2, Float.valueOf(0));
       WireFormat$JavaType.FLOAT = javaType2;
       WireFormat$JavaType javaType3 = new WireFormat$JavaType("DOUBLE", 3, Double.valueOf(0));
       WireFormat$JavaType.DOUBLE = javaType3;
       WireFormat$JavaType javaType4 = new WireFormat$JavaType("BOOLEAN", 4, Boolean.FALSE);
       WireFormat$JavaType.BOOLEAN = javaType4;
       WireFormat$JavaType javaType5 = new WireFormat$JavaType("STRING", 5, "");
       WireFormat$JavaType.STRING = javaType5;
       WireFormat$JavaType javaType6 = new WireFormat$JavaType("BYTE_STRING", 6, ByteString.EMPTY);
       WireFormat$JavaType.BYTE_STRING = javaType6;
       WireFormat$JavaType javaType7 = new WireFormat$JavaType("ENUM", 7, null);
       WireFormat$JavaType.ENUM = javaType7;
       WireFormat$JavaType javaType8 = new WireFormat$JavaType("MESSAGE", 8, null);
       WireFormat$JavaType.MESSAGE = javaType8;
       WireFormat$JavaType[] javaTypeArra = new WireFormat$JavaType[9];
       javaTypeArra[0] = javaType;
       javaTypeArra[1] = javaType1;
       javaTypeArra[2] = javaType2;
       javaTypeArra[3] = javaType3;
       javaTypeArra[4] = javaType4;
       javaTypeArra[5] = javaType5;
       javaTypeArra[6] = javaType6;
       javaTypeArra[7] = javaType7;
       javaTypeArra[8] = javaType8;
       WireFormat$JavaType.$VALUES = javaTypeArra;
    }
    public void WireFormat$JavaType(String p0,int p1,Object p2){
       super(p0, p1);
       this.defaultDefault = p2;
    }
    public static WireFormat$JavaType valueOf(String p0){
       return Enum.valueOf(WireFormat$JavaType.class, p0);
    }
    public static WireFormat$JavaType[] values(){
       return WireFormat$JavaType.$VALUES.clone();
    }
    public Object getDefaultDefault(){
       return this.defaultDefault;
    }
}
