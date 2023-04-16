package com.kwai.video.westeros.v2.faceless.FacelessResourceVersion;
import com.kwai.FaceMagic.nativePort.FMResourceVersion;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class FacelessResourceVersion	// class@0010e8
{
    public static int SUPPORT_3D_VERSION;
    public static int SUPPORT_MAKEUP_VERSION;
    public static int SUPPORT_MAX_VERSION;
    public static int[] UNSUPPORT_MAKEUP_VERSION;
    public static int[] UNSUPPORT_VERSION;

    static {
       FacelessResourceVersion.SUPPORT_MAX_VERSION = FMResourceVersion.SUPPORT_MAX_VERSION;
       FacelessResourceVersion.UNSUPPORT_VERSION = FMResourceVersion.UNSUPPORT_VERSION;
       FacelessResourceVersion.SUPPORT_3D_VERSION = FMResourceVersion.SUPPORT_3D_VERSION;
       FacelessResourceVersion.SUPPORT_MAKEUP_VERSION = FMResourceVersion.SUPPORT_MAKEUP_VERSION;
       FacelessResourceVersion.UNSUPPORT_MAKEUP_VERSION = FMResourceVersion.UNSUPPORT_MAKEUP_VERSION;
    }
    public void FacelessResourceVersion(){
       super();
    }
    public static String getSDKVersion(){
       Object obj = PatchProxy.apply(null, null, FacelessResourceVersion.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FMResourceVersion.getSDKVersion();
    }
}
