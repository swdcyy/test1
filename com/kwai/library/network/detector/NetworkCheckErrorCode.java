package com.kwai.library.network.detector.NetworkCheckErrorCode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NetworkCheckErrorCode extends Enum	// class@00089c
{
    public final int mInternalValue;
    public static final NetworkCheckErrorCode[] $VALUES;
    public static final NetworkCheckErrorCode RESULT_BAD_CELLULAR_GATEWAY;
    public static final NetworkCheckErrorCode RESULT_BAD_WIFI_GATEWAY;
    public static final NetworkCheckErrorCode RESULT_NOT_CONNECTED;
    public static final NetworkCheckErrorCode RESULT_SLOW_INTERNET;
    public static final NetworkCheckErrorCode RESULT_WEAK_SIGNAL;

    static {
       NetworkCheckErrorCode networkCheck = new NetworkCheckErrorCode("RESULT_WEAK_SIGNAL", 0, 1);
       NetworkCheckErrorCode.RESULT_WEAK_SIGNAL = networkCheck;
       NetworkCheckErrorCode networkCheck1 = new NetworkCheckErrorCode("RESULT_BAD_WIFI_GATEWAY", 1, 2);
       NetworkCheckErrorCode.RESULT_BAD_WIFI_GATEWAY = networkCheck1;
       NetworkCheckErrorCode networkCheck2 = new NetworkCheckErrorCode("RESULT_NOT_CONNECTED", 2, 3);
       NetworkCheckErrorCode.RESULT_NOT_CONNECTED = networkCheck2;
       NetworkCheckErrorCode networkCheck3 = new NetworkCheckErrorCode("RESULT_SLOW_INTERNET", 3, 4);
       NetworkCheckErrorCode.RESULT_SLOW_INTERNET = networkCheck3;
       NetworkCheckErrorCode networkCheck4 = new NetworkCheckErrorCode("RESULT_BAD_CELLULAR_GATEWAY", 4, 5);
       NetworkCheckErrorCode.RESULT_BAD_CELLULAR_GATEWAY = networkCheck4;
       NetworkCheckErrorCode[] networkCheck5 = new NetworkCheckErrorCode[]{networkCheck,networkCheck1,networkCheck2,networkCheck3,networkCheck4};
       NetworkCheckErrorCode.$VALUES = networkCheck5;
    }
    public void NetworkCheckErrorCode(String p0,int p1,int p2){
       super(p0, p1);
       this.mInternalValue = p2;
    }
    public static NetworkCheckErrorCode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkCheckErrorCode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(NetworkCheckErrorCode.class, p0);
    }
    public static NetworkCheckErrorCode[] values(){
       Object obj = PatchProxy.apply(null, null, NetworkCheckErrorCode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NetworkCheckErrorCode.$VALUES.clone();
    }
}
