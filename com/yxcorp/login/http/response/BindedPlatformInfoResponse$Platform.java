package com.yxcorp.login.http.response.BindedPlatformInfoResponse$Platform;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BindedPlatformInfoResponse$Platform extends Enum	// class@001ac6
{
    public static final BindedPlatformInfoResponse$Platform[] $VALUES;
    public static final BindedPlatformInfoResponse$Platform QQ;
    public static final BindedPlatformInfoResponse$Platform WEXIN;

    static {
       BindedPlatformInfoResponse$Platform platform = new BindedPlatformInfoResponse$Platform("WEXIN", 0);
       BindedPlatformInfoResponse$Platform.WEXIN = platform;
       BindedPlatformInfoResponse$Platform platform1 = new BindedPlatformInfoResponse$Platform("QQ", 1);
       BindedPlatformInfoResponse$Platform.QQ = platform1;
       BindedPlatformInfoResponse$Platform[] platformArra = new BindedPlatformInfoResponse$Platform[]{platform,platform1};
       BindedPlatformInfoResponse$Platform.$VALUES = platformArra;
    }
    public void BindedPlatformInfoResponse$Platform(String p0,int p1){
       super(p0, p1);
    }
    public static BindedPlatformInfoResponse$Platform valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BindedPlatformInfoResponse$Platform.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BindedPlatformInfoResponse$Platform.class, p0);
    }
    public static BindedPlatformInfoResponse$Platform[] values(){
       Object obj = PatchProxy.apply(null, null, BindedPlatformInfoResponse$Platform.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BindedPlatformInfoResponse$Platform.$VALUES.clone();
    }
}
