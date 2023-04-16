package com.kwai.video.westeros.models.EffectErrorCode;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.EffectErrorCode$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.EffectErrorCode$EffectErrorCodeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class EffectErrorCode extends Enum implements Internal$EnumLite	// class@000f1d
{
    public final int value;
    public static final EffectErrorCode[] $VALUES;
    public static final EffectErrorCode UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final EffectErrorCode kAutoChooseIndexFileFail;
    public static final EffectErrorCode kEffectCannotCoexist;
    public static final EffectErrorCode kEffectCountNotEqual;
    public static final EffectErrorCode kEffectDrawCreateFail;
    public static final EffectErrorCode kEffectHandleBusy;
    public static final EffectErrorCode kEffectHandleCreateFail;
    public static final EffectErrorCode kIndexFileNotFound;
    public static final EffectErrorCode kSuccess;

    static {
       EffectErrorCode uEffectError = new EffectErrorCode("kSuccess", 0, 0);
       EffectErrorCode.kSuccess = uEffectError;
       EffectErrorCode uEffectError1 = new EffectErrorCode("kEffectHandleCreateFail", 1, 1);
       EffectErrorCode.kEffectHandleCreateFail = uEffectError1;
       EffectErrorCode uEffectError2 = new EffectErrorCode("kEffectDrawCreateFail", 2, 2);
       EffectErrorCode.kEffectDrawCreateFail = uEffectError2;
       EffectErrorCode uEffectError3 = new EffectErrorCode("kEffectCountNotEqual", 3, 3);
       EffectErrorCode.kEffectCountNotEqual = uEffectError3;
       EffectErrorCode uEffectError4 = new EffectErrorCode("kAutoChooseIndexFileFail", 4, 4);
       EffectErrorCode.kAutoChooseIndexFileFail = uEffectError4;
       EffectErrorCode uEffectError5 = new EffectErrorCode("kIndexFileNotFound", 5, 5);
       EffectErrorCode.kIndexFileNotFound = uEffectError5;
       EffectErrorCode uEffectError6 = new EffectErrorCode("kEffectHandleBusy", 6, 6);
       EffectErrorCode.kEffectHandleBusy = uEffectError6;
       EffectErrorCode uEffectError7 = new EffectErrorCode("kEffectCannotCoexist", 7, 7);
       EffectErrorCode.kEffectCannotCoexist = uEffectError7;
       EffectErrorCode uEffectError8 = new EffectErrorCode("UNRECOGNIZED", 8, -1);
       EffectErrorCode.UNRECOGNIZED = uEffectError8;
       EffectErrorCode[] uEffectError9 = new EffectErrorCode[9];
       uEffectError9[0] = uEffectError;
       uEffectError9[1] = uEffectError1;
       uEffectError9[2] = uEffectError2;
       uEffectError9[3] = uEffectError3;
       uEffectError9[4] = uEffectError4;
       uEffectError9[5] = uEffectError5;
       uEffectError9[6] = uEffectError6;
       uEffectError9[7] = uEffectError7;
       uEffectError9[8] = uEffectError8;
       EffectErrorCode.$VALUES = uEffectError9;
       EffectErrorCode.internalValueMap = new EffectErrorCode$1();
    }
    public void EffectErrorCode(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EffectErrorCode forNumber(int p0){
       switch (p0){
           case 0:
             return EffectErrorCode.kSuccess;
           case 1:
             return EffectErrorCode.kEffectHandleCreateFail;
           case 2:
             return EffectErrorCode.kEffectDrawCreateFail;
           case 3:
             return EffectErrorCode.kEffectCountNotEqual;
           case 4:
             return EffectErrorCode.kAutoChooseIndexFileFail;
           case 5:
             return EffectErrorCode.kIndexFileNotFound;
           case 6:
             return EffectErrorCode.kEffectHandleBusy;
           case 7:
             return EffectErrorCode.kEffectCannotCoexist;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return EffectErrorCode.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return EffectErrorCode$EffectErrorCodeVerifier.INSTANCE;
    }
    public static EffectErrorCode valueOf(int p0){
       return EffectErrorCode.forNumber(p0);
    }
    public static EffectErrorCode valueOf(String p0){
       return Enum.valueOf(EffectErrorCode.class, p0);
    }
    public static EffectErrorCode[] values(){
       return EffectErrorCode.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != EffectErrorCode.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
