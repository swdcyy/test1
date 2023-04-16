package com.kwai.sdk.eve.proto.ShowEvent$ShowType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.sdk.eve.proto.ShowEvent$ShowType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.sdk.eve.proto.ShowEvent$ShowType$ShowTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class ShowEvent$ShowType extends Enum implements Internal$EnumLite	// class@001606
{
    public final int value;
    public static final ShowEvent$ShowType[] $VALUES;
    public static final ShowEvent$ShowType COVER_SHOW;
    public static final ShowEvent$ShowType REAL_SHOW;
    public static final ShowEvent$ShowType UNKNOWN;
    public static final ShowEvent$ShowType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       ShowEvent$ShowType showType = new ShowEvent$ShowType("UNKNOWN", 0, 0);
       ShowEvent$ShowType.UNKNOWN = showType;
       ShowEvent$ShowType showType1 = new ShowEvent$ShowType("REAL_SHOW", 1, 1);
       ShowEvent$ShowType.REAL_SHOW = showType1;
       ShowEvent$ShowType showType2 = new ShowEvent$ShowType("COVER_SHOW", 2, 2);
       ShowEvent$ShowType.COVER_SHOW = showType2;
       ShowEvent$ShowType showType3 = new ShowEvent$ShowType("UNRECOGNIZED", 3, -1);
       ShowEvent$ShowType.UNRECOGNIZED = showType3;
       ShowEvent$ShowType[] showTypeArra = new ShowEvent$ShowType[]{showType,showType1,showType2,showType3};
       ShowEvent$ShowType.$VALUES = showTypeArra;
       ShowEvent$ShowType.internalValueMap = new ShowEvent$ShowType$1();
    }
    public void ShowEvent$ShowType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static ShowEvent$ShowType forNumber(int p0){
       if (!p0) {
          return ShowEvent$ShowType.UNKNOWN;
       }
       if (p0 == 1) {
          return ShowEvent$ShowType.REAL_SHOW;
       }
       if (p0 != 2) {
          return null;
       }
       return ShowEvent$ShowType.COVER_SHOW;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return ShowEvent$ShowType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return ShowEvent$ShowType$ShowTypeVerifier.INSTANCE;
    }
    public static ShowEvent$ShowType valueOf(int p0){
       return ShowEvent$ShowType.forNumber(p0);
    }
    public static ShowEvent$ShowType valueOf(String p0){
       return Enum.valueOf(ShowEvent$ShowType.class, p0);
    }
    public static ShowEvent$ShowType[] values(){
       return ShowEvent$ShowType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != ShowEvent$ShowType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
