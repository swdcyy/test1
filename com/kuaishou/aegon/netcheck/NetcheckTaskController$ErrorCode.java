package com.kuaishou.aegon.netcheck.NetcheckTaskController$ErrorCode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NetcheckTaskController$ErrorCode extends Enum	// class@0007b2
{
    public int mInternalValue;
    public static final NetcheckTaskController$ErrorCode[] $VALUES;
    public static final NetcheckTaskController$ErrorCode RESULT_BAD_CELLULAR_GATEWAY;
    public static final NetcheckTaskController$ErrorCode RESULT_BAD_WIFI_GATEWAY;
    public static final NetcheckTaskController$ErrorCode RESULT_NOT_CONNECTED;
    public static final NetcheckTaskController$ErrorCode RESULT_SLOW_INTERNET;
    public static final NetcheckTaskController$ErrorCode RESULT_WEAK_SIGNAL;

    static {
       NetcheckTaskController$ErrorCode uErrorCode = new NetcheckTaskController$ErrorCode("RESULT_WEAK_SIGNAL", 0, 1);
       NetcheckTaskController$ErrorCode.RESULT_WEAK_SIGNAL = uErrorCode;
       NetcheckTaskController$ErrorCode uErrorCode1 = new NetcheckTaskController$ErrorCode("RESULT_BAD_WIFI_GATEWAY", 1, 2);
       NetcheckTaskController$ErrorCode.RESULT_BAD_WIFI_GATEWAY = uErrorCode1;
       NetcheckTaskController$ErrorCode uErrorCode2 = new NetcheckTaskController$ErrorCode("RESULT_NOT_CONNECTED", 2, 3);
       NetcheckTaskController$ErrorCode.RESULT_NOT_CONNECTED = uErrorCode2;
       NetcheckTaskController$ErrorCode uErrorCode3 = new NetcheckTaskController$ErrorCode("RESULT_SLOW_INTERNET", 3, 4);
       NetcheckTaskController$ErrorCode.RESULT_SLOW_INTERNET = uErrorCode3;
       NetcheckTaskController$ErrorCode uErrorCode4 = new NetcheckTaskController$ErrorCode("RESULT_BAD_CELLULAR_GATEWAY", 4, 5);
       NetcheckTaskController$ErrorCode.RESULT_BAD_CELLULAR_GATEWAY = uErrorCode4;
       NetcheckTaskController$ErrorCode[] uErrorCodeAr = new NetcheckTaskController$ErrorCode[]{uErrorCode,uErrorCode1,uErrorCode2,uErrorCode3,uErrorCode4};
       NetcheckTaskController$ErrorCode.$VALUES = uErrorCodeAr;
    }
    public void NetcheckTaskController$ErrorCode(String p0,int p1,int p2){
       super(p0, p1);
       this.mInternalValue = p2;
    }
    public static NetcheckTaskController$ErrorCode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetcheckTaskController$ErrorCode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(NetcheckTaskController$ErrorCode.class, p0);
    }
    public static NetcheckTaskController$ErrorCode[] values(){
       Object obj = PatchProxy.apply(null, null, NetcheckTaskController$ErrorCode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NetcheckTaskController$ErrorCode.$VALUES.clone();
    }
    public int getInternalValue(){
       return this.mInternalValue;
    }
}
