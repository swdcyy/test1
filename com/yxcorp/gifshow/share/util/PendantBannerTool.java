package com.yxcorp.gifshow.share.util.PendantBannerTool;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class PendantBannerTool	// class@001c82
{
    public static String a = "{\"pendantBanner\":1}";

    public void PendantBannerTool(){
       super();
    }
    public static boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PendantBannerTool.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (PendantBannerTool.a).equals(p0);
    }
}
