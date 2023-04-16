package com.google.protobuf.Field$Cardinality;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.google.protobuf.Field$Cardinality$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.google.protobuf.Field$Cardinality$CardinalityVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class Field$Cardinality extends Enum implements Internal$EnumLite	// class@000416
{
    public final int value;
    public static final Field$Cardinality[] $VALUES;
    public static final Field$Cardinality CARDINALITY_OPTIONAL;
    public static final Field$Cardinality CARDINALITY_REPEATED;
    public static final Field$Cardinality CARDINALITY_REQUIRED;
    public static final Field$Cardinality CARDINALITY_UNKNOWN;
    public static final Field$Cardinality UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       Field$Cardinality uCardinality = new Field$Cardinality("CARDINALITY_UNKNOWN", 0, 0);
       Field$Cardinality.CARDINALITY_UNKNOWN = uCardinality;
       Field$Cardinality uCardinality1 = new Field$Cardinality("CARDINALITY_OPTIONAL", 1, 1);
       Field$Cardinality.CARDINALITY_OPTIONAL = uCardinality1;
       Field$Cardinality uCardinality2 = new Field$Cardinality("CARDINALITY_REQUIRED", 2, 2);
       Field$Cardinality.CARDINALITY_REQUIRED = uCardinality2;
       Field$Cardinality uCardinality3 = new Field$Cardinality("CARDINALITY_REPEATED", 3, 3);
       Field$Cardinality.CARDINALITY_REPEATED = uCardinality3;
       Field$Cardinality uCardinality4 = new Field$Cardinality("UNRECOGNIZED", 4, -1);
       Field$Cardinality.UNRECOGNIZED = uCardinality4;
       Field$Cardinality[] uCardinality5 = new Field$Cardinality[]{uCardinality,uCardinality1,uCardinality2,uCardinality3,uCardinality4};
       Field$Cardinality.$VALUES = uCardinality5;
       Field$Cardinality.internalValueMap = new Field$Cardinality$1();
    }
    public void Field$Cardinality(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Field$Cardinality forNumber(int p0){
       if (!p0) {
          return Field$Cardinality.CARDINALITY_UNKNOWN;
       }
       if (p0 == 1) {
          return Field$Cardinality.CARDINALITY_OPTIONAL;
       }
       if (p0 == 2) {
          return Field$Cardinality.CARDINALITY_REQUIRED;
       }
       if (p0 != 3) {
          return null;
       }
       return Field$Cardinality.CARDINALITY_REPEATED;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return Field$Cardinality.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return Field$Cardinality$CardinalityVerifier.INSTANCE;
    }
    public static Field$Cardinality valueOf(int p0){
       return Field$Cardinality.forNumber(p0);
    }
    public static Field$Cardinality valueOf(String p0){
       return Enum.valueOf(Field$Cardinality.class, p0);
    }
    public static Field$Cardinality[] values(){
       return Field$Cardinality.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != Field$Cardinality.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
