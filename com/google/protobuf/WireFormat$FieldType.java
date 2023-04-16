package com.google.protobuf.WireFormat$FieldType;
import java.lang.Enum;
import com.google.protobuf.WireFormat$JavaType;
import java.lang.String;
import com.google.protobuf.WireFormat$FieldType$1;
import com.google.protobuf.WireFormat$FieldType$2;
import com.google.protobuf.WireFormat$FieldType$3;
import com.google.protobuf.WireFormat$FieldType$4;
import com.google.protobuf.WireFormat$1;
import java.lang.Class;
import java.lang.Object;

public class WireFormat$FieldType extends Enum	// class@0004fa
{
    public final WireFormat$JavaType javaType;
    public final int wireType;
    public static final WireFormat$FieldType[] $VALUES;
    public static final WireFormat$FieldType BOOL;
    public static final WireFormat$FieldType BYTES;
    public static final WireFormat$FieldType DOUBLE;
    public static final WireFormat$FieldType ENUM;
    public static final WireFormat$FieldType FIXED32;
    public static final WireFormat$FieldType FIXED64;
    public static final WireFormat$FieldType FLOAT;
    public static final WireFormat$FieldType GROUP;
    public static final WireFormat$FieldType INT32;
    public static final WireFormat$FieldType INT64;
    public static final WireFormat$FieldType MESSAGE;
    public static final WireFormat$FieldType SFIXED32;
    public static final WireFormat$FieldType SFIXED64;
    public static final WireFormat$FieldType SINT32;
    public static final WireFormat$FieldType SINT64;
    public static final WireFormat$FieldType STRING;
    public static final WireFormat$FieldType UINT32;
    public static final WireFormat$FieldType UINT64;

    static {
       WireFormat$FieldType uFieldType = new WireFormat$FieldType("DOUBLE", 0, WireFormat$JavaType.DOUBLE, 1);
       WireFormat$FieldType.DOUBLE = uFieldType;
       WireFormat$FieldType uFieldType1 = new WireFormat$FieldType("FLOAT", 1, WireFormat$JavaType.FLOAT, 5);
       WireFormat$FieldType.FLOAT = uFieldType1;
       WireFormat$JavaType lONG = WireFormat$JavaType.LONG;
       WireFormat$FieldType uFieldType2 = new WireFormat$FieldType("INT64", 2, lONG, 0);
       WireFormat$FieldType.INT64 = uFieldType2;
       WireFormat$FieldType uFieldType3 = new WireFormat$FieldType("UINT64", 3, lONG, 0);
       WireFormat$FieldType.UINT64 = uFieldType3;
       WireFormat$JavaType iNT = WireFormat$JavaType.INT;
       WireFormat$FieldType uFieldType4 = new WireFormat$FieldType("INT32", 4, iNT, 0);
       WireFormat$FieldType.INT32 = uFieldType4;
       WireFormat$FieldType uFieldType5 = new WireFormat$FieldType("FIXED64", 5, lONG, 1);
       WireFormat$FieldType.FIXED64 = uFieldType5;
       WireFormat$FieldType uFieldType6 = new WireFormat$FieldType("FIXED32", 6, iNT, 5);
       WireFormat$FieldType.FIXED32 = uFieldType6;
       WireFormat$FieldType uFieldType7 = new WireFormat$FieldType("BOOL", 7, WireFormat$JavaType.BOOLEAN, 0);
       WireFormat$FieldType.BOOL = uFieldType7;
       WireFormat$FieldType$1 uFieldType$1 = new WireFormat$FieldType$1("STRING", 8, WireFormat$JavaType.STRING, 2);
       WireFormat$FieldType.STRING = uFieldType$1;
       WireFormat$JavaType mESSAGE = WireFormat$JavaType.MESSAGE;
       WireFormat$FieldType$2 uFieldType$2 = new WireFormat$FieldType$2("GROUP", 9, mESSAGE, 3);
       WireFormat$FieldType.GROUP = uFieldType$2;
       WireFormat$FieldType$2 uFieldType$21 = uFieldType$2;
       WireFormat$FieldType$3 uFieldType$3 = new WireFormat$FieldType$3("MESSAGE", 10, mESSAGE, 2);
       WireFormat$FieldType.MESSAGE = uFieldType$3;
       WireFormat$FieldType$3 uFieldType$31 = uFieldType$3;
       WireFormat$FieldType$4 uFieldType$4 = new WireFormat$FieldType$4("BYTES", 11, WireFormat$JavaType.BYTE_STRING, 2);
       WireFormat$FieldType.BYTES = uFieldType$4;
       WireFormat$FieldType uFieldType8 = new WireFormat$FieldType("UINT32", 12, iNT, 0);
       WireFormat$FieldType.UINT32 = uFieldType8;
       WireFormat$FieldType uFieldType9 = uFieldType8;
       WireFormat$FieldType$4 uFieldType$41 = uFieldType$4;
       WireFormat$FieldType uFieldType10 = new WireFormat$FieldType("ENUM", 13, WireFormat$JavaType.ENUM, 0);
       WireFormat$FieldType.ENUM = uFieldType10;
       WireFormat$FieldType uFieldType11 = new WireFormat$FieldType("SFIXED32", 14, iNT, 5);
       WireFormat$FieldType.SFIXED32 = uFieldType11;
       WireFormat$FieldType uFieldType12 = uFieldType11;
       uFieldType8 = new WireFormat$FieldType("SFIXED64", 15, lONG, 1);
       WireFormat$FieldType.SFIXED64 = uFieldType8;
       WireFormat$FieldType uFieldType13 = uFieldType8;
       uFieldType11 = new WireFormat$FieldType("SINT32", 16, iNT, 0);
       WireFormat$FieldType.SINT32 = uFieldType11;
       WireFormat$FieldType uFieldType14 = new WireFormat$FieldType("SINT64", 17, lONG, 0);
       WireFormat$FieldType.SINT64 = uFieldType14;
       WireFormat$FieldType[] uFieldTypeAr = new WireFormat$FieldType[18];
       uFieldTypeAr[0] = uFieldType;
       uFieldTypeAr[1] = uFieldType1;
       uFieldTypeAr[2] = uFieldType2;
       uFieldTypeAr[3] = uFieldType3;
       uFieldTypeAr[4] = uFieldType4;
       uFieldTypeAr[5] = uFieldType5;
       uFieldTypeAr[6] = uFieldType6;
       uFieldTypeAr[7] = uFieldType7;
       uFieldTypeAr[8] = uFieldType$1;
       uFieldTypeAr[9] = uFieldType$21;
       uFieldTypeAr[10] = uFieldType$31;
       uFieldTypeAr[11] = uFieldType$41;
       uFieldTypeAr[12] = uFieldType9;
       uFieldTypeAr[13] = uFieldType10;
       uFieldTypeAr[14] = uFieldType12;
       uFieldTypeAr[15] = uFieldType13;
       uFieldTypeAr[16] = uFieldType11;
       uFieldTypeAr[17] = uFieldType14;
       WireFormat$FieldType.$VALUES = uFieldTypeAr;
    }
    public void WireFormat$FieldType(String p0,int p1,WireFormat$JavaType p2,int p3){
       super(p0, p1);
       this.javaType = p2;
       this.wireType = p3;
    }
    public void WireFormat$FieldType(String p0,int p1,WireFormat$JavaType p2,int p3,WireFormat$1 p4){
       super(p0, p1, p2, p3);
    }
    public static WireFormat$FieldType valueOf(String p0){
       return Enum.valueOf(WireFormat$FieldType.class, p0);
    }
    public static WireFormat$FieldType[] values(){
       return WireFormat$FieldType.$VALUES.clone();
    }
    public WireFormat$JavaType getJavaType(){
       return this.javaType;
    }
    public int getWireType(){
       return this.wireType;
    }
    public boolean isPackable(){
       return true;
    }
}
