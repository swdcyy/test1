package com.google.protobuf.JavaType;
import java.lang.Enum;
import java.lang.Void;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;
import java.lang.Boolean;
import com.google.protobuf.ByteString;

public final class JavaType extends Enum	// class@00045b
{
    public final Class boxedType;
    public final Object defaultDefault;
    public final Class type;
    public static final JavaType[] $VALUES;
    public static final JavaType BOOLEAN;
    public static final JavaType BYTE_STRING;
    public static final JavaType DOUBLE;
    public static final JavaType ENUM;
    public static final JavaType FLOAT;
    public static final JavaType INT;
    public static final JavaType LONG;
    public static final JavaType MESSAGE;
    public static final JavaType STRING;
    public static final JavaType VOID;

    static {
       JavaType javaType = new JavaType("VOID", 0, Void.class, Void.class, null);
       JavaType.VOID = v6;
       Class tYPE = Integer.TYPE;
       JavaType javaType1 = new JavaType("INT", 1, tYPE, Integer.class, Integer.valueOf(0));
       JavaType.INT = javaType;
       JavaType javaType2 = new JavaType("LONG", 2, Long.TYPE, Long.class, Long.valueOf(0));
       JavaType.LONG = v3;
       javaType1 = new JavaType("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0));
       JavaType.FLOAT = v4;
       javaType2 = new JavaType("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0));
       JavaType.DOUBLE = v5;
       javaType1 = new JavaType("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
       JavaType.BOOLEAN = javaType2;
       JavaType javaType3 = new JavaType("STRING", 6, String.class, String.class, "");
       JavaType.STRING = v20;
       javaType1 = new JavaType("BYTE_STRING", 7, ByteString.class, ByteString.class, ByteString.EMPTY);
       JavaType.BYTE_STRING = javaType3;
       javaType1 = new JavaType("ENUM", 8, tYPE, Integer.class, null);
       JavaType.ENUM = v15;
       JavaType javaType4 = new JavaType("MESSAGE", 9, Object.class, Object.class, null);
       JavaType.MESSAGE = tYPE;
       JavaType[] javaTypeArra = new JavaType[10];
       javaTypeArra[0] = v6;
       javaTypeArra[1] = javaType;
       javaTypeArra[2] = v3;
       javaTypeArra[3] = v4;
       javaTypeArra[4] = v5;
       javaTypeArra[5] = javaType2;
       javaTypeArra[6] = v20;
       javaTypeArra[7] = javaType3;
       javaTypeArra[8] = v15;
       javaTypeArra[9] = tYPE;
       JavaType.$VALUES = javaTypeArra;
    }
    public void JavaType(String p0,int p1,Class p2,Class p3,Object p4){
       super(p0, p1);
       this.type = p2;
       this.boxedType = p3;
       this.defaultDefault = p4;
    }
    public static JavaType valueOf(String p0){
       return Enum.valueOf(JavaType.class, p0);
    }
    public static JavaType[] values(){
       return JavaType.$VALUES.clone();
    }
    public Class getBoxedType(){
       return this.boxedType;
    }
    public Object getDefaultDefault(){
       return this.defaultDefault;
    }
    public Class getType(){
       return this.type;
    }
    public boolean isValidType(Class p0){
       return this.type.isAssignableFrom(p0);
    }
}
