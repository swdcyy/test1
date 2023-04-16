package com.google.protobuf.NullValue;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.google.protobuf.NullValue$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.google.protobuf.NullValue$NullValueVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class NullValue extends Enum implements Internal$EnumLite	// class@000492
{
    public final int value;
    public static final NullValue[] $VALUES;
    public static final NullValue NULL_VALUE;
    public static final NullValue UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       NullValue nullValue = new NullValue("NULL_VALUE", 0, 0);
       NullValue.NULL_VALUE = nullValue;
       NullValue nullValue1 = new NullValue("UNRECOGNIZED", 1, -1);
       NullValue.UNRECOGNIZED = nullValue1;
       NullValue[] nullValueArr = new NullValue[]{nullValue,nullValue1};
       NullValue.$VALUES = nullValueArr;
       NullValue.internalValueMap = new NullValue$1();
    }
    public void NullValue(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static NullValue forNumber(int p0){
       if (p0) {
          return null;
       }
       return NullValue.NULL_VALUE;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return NullValue.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return NullValue$NullValueVerifier.INSTANCE;
    }
    public static NullValue valueOf(int p0){
       return NullValue.forNumber(p0);
    }
    public static NullValue valueOf(String p0){
       return Enum.valueOf(NullValue.class, p0);
    }
    public static NullValue[] values(){
       return NullValue.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != NullValue.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
