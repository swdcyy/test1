package com.kwai.video.ksuploaderkit.network.NetworkUtils$NetErrorCode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NetworkUtils$NetErrorCode extends Enum	// class@0009b4
{
    public static final NetworkUtils$NetErrorCode[] $VALUES;
    public static final NetworkUtils$NetErrorCode CONNECT_SERVER_FAILED;
    public static final NetworkUtils$NetErrorCode HTTP_CODE_3XX;
    public static final NetworkUtils$NetErrorCode HTTP_CODE_4XX;
    public static final NetworkUtils$NetErrorCode HTTP_CODE_5XX;
    public static final NetworkUtils$NetErrorCode NOT2XX_HTTP_CODE;
    public static final NetworkUtils$NetErrorCode NO_ERROR;
    public static final NetworkUtils$NetErrorCode RESPONSE_ERROR;

    static {
       NetworkUtils$NetErrorCode netErrorCode = new NetworkUtils$NetErrorCode("NO_ERROR", 0);
       NetworkUtils$NetErrorCode.NO_ERROR = netErrorCode;
       NetworkUtils$NetErrorCode netErrorCode1 = new NetworkUtils$NetErrorCode("CONNECT_SERVER_FAILED", 1);
       NetworkUtils$NetErrorCode.CONNECT_SERVER_FAILED = netErrorCode1;
       NetworkUtils$NetErrorCode netErrorCode2 = new NetworkUtils$NetErrorCode("NOT2XX_HTTP_CODE", 2);
       NetworkUtils$NetErrorCode.NOT2XX_HTTP_CODE = netErrorCode2;
       NetworkUtils$NetErrorCode netErrorCode3 = new NetworkUtils$NetErrorCode("RESPONSE_ERROR", 3);
       NetworkUtils$NetErrorCode.RESPONSE_ERROR = netErrorCode3;
       NetworkUtils$NetErrorCode netErrorCode4 = new NetworkUtils$NetErrorCode("HTTP_CODE_3XX", 4);
       NetworkUtils$NetErrorCode.HTTP_CODE_3XX = netErrorCode4;
       NetworkUtils$NetErrorCode netErrorCode5 = new NetworkUtils$NetErrorCode("HTTP_CODE_4XX", 5);
       NetworkUtils$NetErrorCode.HTTP_CODE_4XX = netErrorCode5;
       NetworkUtils$NetErrorCode netErrorCode6 = new NetworkUtils$NetErrorCode("HTTP_CODE_5XX", 6);
       NetworkUtils$NetErrorCode.HTTP_CODE_5XX = netErrorCode6;
       NetworkUtils$NetErrorCode[] netErrorCode7 = new NetworkUtils$NetErrorCode[]{netErrorCode,netErrorCode1,netErrorCode2,netErrorCode3,netErrorCode4,netErrorCode5,netErrorCode6};
       NetworkUtils$NetErrorCode.$VALUES = netErrorCode7;
    }
    public void NetworkUtils$NetErrorCode(String p0,int p1){
       super(p0, p1);
    }
    public static NetworkUtils$NetErrorCode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils$NetErrorCode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(NetworkUtils$NetErrorCode.class, p0);
    }
    public static NetworkUtils$NetErrorCode[] values(){
       Object obj = PatchProxy.apply(null, null, NetworkUtils$NetErrorCode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NetworkUtils$NetErrorCode.$VALUES.clone();
    }
}
