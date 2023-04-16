package com.google.protobuf.Field$Kind;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.google.protobuf.Field$Kind$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.google.protobuf.Field$Kind$KindVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class Field$Kind extends Enum implements Internal$EnumLite	// class@000419
{
    public final int value;
    public static final Field$Kind[] $VALUES;
    public static final Field$Kind TYPE_BOOL;
    public static final Field$Kind TYPE_BYTES;
    public static final Field$Kind TYPE_DOUBLE;
    public static final Field$Kind TYPE_ENUM;
    public static final Field$Kind TYPE_FIXED32;
    public static final Field$Kind TYPE_FIXED64;
    public static final Field$Kind TYPE_FLOAT;
    public static final Field$Kind TYPE_GROUP;
    public static final Field$Kind TYPE_INT32;
    public static final Field$Kind TYPE_INT64;
    public static final Field$Kind TYPE_MESSAGE;
    public static final Field$Kind TYPE_SFIXED32;
    public static final Field$Kind TYPE_SFIXED64;
    public static final Field$Kind TYPE_SINT32;
    public static final Field$Kind TYPE_SINT64;
    public static final Field$Kind TYPE_STRING;
    public static final Field$Kind TYPE_UINT32;
    public static final Field$Kind TYPE_UINT64;
    public static final Field$Kind TYPE_UNKNOWN;
    public static final Field$Kind UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       Field$Kind kind = new Field$Kind("TYPE_UNKNOWN", 0, 0);
       Field$Kind.TYPE_UNKNOWN = kind;
       Field$Kind kind1 = new Field$Kind("TYPE_DOUBLE", 1, 1);
       Field$Kind.TYPE_DOUBLE = kind1;
       Field$Kind kind2 = new Field$Kind("TYPE_FLOAT", 2, 2);
       Field$Kind.TYPE_FLOAT = kind2;
       Field$Kind kind3 = new Field$Kind("TYPE_INT64", 3, 3);
       Field$Kind.TYPE_INT64 = kind3;
       Field$Kind kind4 = new Field$Kind("TYPE_UINT64", 4, 4);
       Field$Kind.TYPE_UINT64 = kind4;
       Field$Kind kind5 = new Field$Kind("TYPE_INT32", 5, 5);
       Field$Kind.TYPE_INT32 = kind5;
       Field$Kind kind6 = new Field$Kind("TYPE_FIXED64", 6, 6);
       Field$Kind.TYPE_FIXED64 = kind6;
       Field$Kind kind7 = new Field$Kind("TYPE_FIXED32", 7, 7);
       Field$Kind.TYPE_FIXED32 = kind7;
       Field$Kind kind8 = new Field$Kind("TYPE_BOOL", 8, 8);
       Field$Kind.TYPE_BOOL = kind8;
       Field$Kind kind9 = new Field$Kind("TYPE_STRING", 9, 9);
       Field$Kind.TYPE_STRING = kind9;
       Field$Kind kind10 = new Field$Kind("TYPE_GROUP", 10, 10);
       Field$Kind.TYPE_GROUP = kind10;
       Field$Kind kind11 = new Field$Kind("TYPE_MESSAGE", 11, 11);
       Field$Kind.TYPE_MESSAGE = kind11;
       Field$Kind kind12 = new Field$Kind("TYPE_BYTES", 12, 12);
       Field$Kind.TYPE_BYTES = kind12;
       Field$Kind kind13 = new Field$Kind("TYPE_UINT32", 13, 13);
       Field$Kind.TYPE_UINT32 = kind13;
       Field$Kind kind14 = kind13;
       Field$Kind kind15 = new Field$Kind("TYPE_ENUM", 14, 14);
       Field$Kind.TYPE_ENUM = kind15;
       Field$Kind kind16 = kind15;
       Field$Kind kind17 = new Field$Kind("TYPE_SFIXED32", 15, 15);
       Field$Kind.TYPE_SFIXED32 = kind17;
       Field$Kind kind18 = kind17;
       kind13 = new Field$Kind("TYPE_SFIXED64", 16, 16);
       Field$Kind.TYPE_SFIXED64 = kind13;
       Field$Kind kind19 = kind13;
       kind15 = new Field$Kind("TYPE_SINT32", 17, 17);
       Field$Kind.TYPE_SINT32 = kind15;
       Field$Kind kind20 = kind15;
       kind17 = new Field$Kind("TYPE_SINT64", 18, 18);
       Field$Kind.TYPE_SINT64 = kind17;
       Field$Kind kind21 = kind17;
       Field$Kind kind22 = kind12;
       kind13 = new Field$Kind("UNRECOGNIZED", 19, -1);
       Field$Kind.UNRECOGNIZED = kind13;
       Field$Kind[] kindArray = new Field$Kind[20];
       kindArray[0] = kind;
       kindArray[1] = kind1;
       kindArray[2] = kind2;
       kindArray[3] = kind3;
       kindArray[4] = kind4;
       kindArray[5] = kind5;
       kindArray[6] = kind6;
       kindArray[7] = kind7;
       kindArray[8] = kind8;
       kindArray[9] = kind9;
       kindArray[10] = kind10;
       kindArray[11] = kind11;
       kindArray[12] = kind22;
       kindArray[13] = kind14;
       kindArray[14] = kind16;
       kindArray[15] = kind18;
       kindArray[16] = kind19;
       kindArray[17] = kind20;
       kindArray[18] = kind21;
       kindArray[19] = kind13;
       Field$Kind.$VALUES = kindArray;
       Field$Kind.internalValueMap = new Field$Kind$1();
    }
    public void Field$Kind(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Field$Kind forNumber(int p0){
       switch (p0){
           case 0:
             return Field$Kind.TYPE_UNKNOWN;
           case 1:
             return Field$Kind.TYPE_DOUBLE;
           case 2:
             return Field$Kind.TYPE_FLOAT;
           case 3:
             return Field$Kind.TYPE_INT64;
           case 4:
             return Field$Kind.TYPE_UINT64;
           case 5:
             return Field$Kind.TYPE_INT32;
           case 6:
             return Field$Kind.TYPE_FIXED64;
           case 7:
             return Field$Kind.TYPE_FIXED32;
           case 8:
             return Field$Kind.TYPE_BOOL;
           case 9:
             return Field$Kind.TYPE_STRING;
           case 10:
             return Field$Kind.TYPE_GROUP;
           case 11:
             return Field$Kind.TYPE_MESSAGE;
           case 12:
             return Field$Kind.TYPE_BYTES;
           case 13:
             return Field$Kind.TYPE_UINT32;
           case 14:
             return Field$Kind.TYPE_ENUM;
           case 15:
             return Field$Kind.TYPE_SFIXED32;
           case 16:
             return Field$Kind.TYPE_SFIXED64;
           case 17:
             return Field$Kind.TYPE_SINT32;
           case 18:
             return Field$Kind.TYPE_SINT64;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return Field$Kind.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return Field$Kind$KindVerifier.INSTANCE;
    }
    public static Field$Kind valueOf(int p0){
       return Field$Kind.forNumber(p0);
    }
    public static Field$Kind valueOf(String p0){
       return Enum.valueOf(Field$Kind.class, p0);
    }
    public static Field$Kind[] values(){
       return Field$Kind.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != Field$Kind.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
