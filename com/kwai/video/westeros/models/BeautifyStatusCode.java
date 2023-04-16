package com.kwai.video.westeros.models.BeautifyStatusCode;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.BeautifyStatusCode$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.BeautifyStatusCode$BeautifyStatusCodeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class BeautifyStatusCode extends Enum implements Internal$EnumLite	// class@000ead
{
    public final int value;
    public static final BeautifyStatusCode[] $VALUES;
    public static final BeautifyStatusCode UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final BeautifyStatusCode kCreateFailed;
    public static final BeautifyStatusCode kCreateNotUsed;
    public static final BeautifyStatusCode kCreateSucceed;
    public static final BeautifyStatusCode kDefaultValue;

    static {
       BeautifyStatusCode uBeautifySta = new BeautifyStatusCode("kDefaultValue", 0, 0);
       BeautifyStatusCode.kDefaultValue = uBeautifySta;
       BeautifyStatusCode uBeautifySta1 = new BeautifyStatusCode("kCreateSucceed", 1, 1);
       BeautifyStatusCode.kCreateSucceed = uBeautifySta1;
       BeautifyStatusCode uBeautifySta2 = new BeautifyStatusCode("kCreateFailed", 2, 2);
       BeautifyStatusCode.kCreateFailed = uBeautifySta2;
       BeautifyStatusCode uBeautifySta3 = new BeautifyStatusCode("kCreateNotUsed", 3, 3);
       BeautifyStatusCode.kCreateNotUsed = uBeautifySta3;
       BeautifyStatusCode uBeautifySta4 = new BeautifyStatusCode("UNRECOGNIZED", 4, -1);
       BeautifyStatusCode.UNRECOGNIZED = uBeautifySta4;
       BeautifyStatusCode[] uBeautifySta5 = new BeautifyStatusCode[]{uBeautifySta,uBeautifySta1,uBeautifySta2,uBeautifySta3,uBeautifySta4};
       BeautifyStatusCode.$VALUES = uBeautifySta5;
       BeautifyStatusCode.internalValueMap = new BeautifyStatusCode$1();
    }
    public void BeautifyStatusCode(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static BeautifyStatusCode forNumber(int p0){
       if (!p0) {
          return BeautifyStatusCode.kDefaultValue;
       }
       if (p0 == 1) {
          return BeautifyStatusCode.kCreateSucceed;
       }
       if (p0 == 2) {
          return BeautifyStatusCode.kCreateFailed;
       }
       if (p0 != 3) {
          return null;
       }
       return BeautifyStatusCode.kCreateNotUsed;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return BeautifyStatusCode.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return BeautifyStatusCode$BeautifyStatusCodeVerifier.INSTANCE;
    }
    public static BeautifyStatusCode valueOf(int p0){
       return BeautifyStatusCode.forNumber(p0);
    }
    public static BeautifyStatusCode valueOf(String p0){
       return Enum.valueOf(BeautifyStatusCode.class, p0);
    }
    public static BeautifyStatusCode[] values(){
       return BeautifyStatusCode.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != BeautifyStatusCode.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
