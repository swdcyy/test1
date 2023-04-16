package com.yxcorp.gifshow.nearby.NearbyGuideParam$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.nearby.NearbyGuideParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.net.Uri;
import ekd.x0;

public final class NearbyGuideParam$a	// class@0020db
{

    public void NearbyGuideParam$a(){
       super();
    }
    public void NearbyGuideParam$a(u p0){
       super();
    }
    public final NearbyGuideParam a(String p0,boolean p1,String p2,int p3){
       NearbyGuideParam obj;
       if (PatchProxy.isSupport(NearbyGuideParam$a.class)) {
          obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), p2, Integer.valueOf(p3), this, NearbyGuideParam$a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "type");
       a.p(p2, "slideGuideText");
       obj = new NearbyGuideParam();
       obj.setGuideType(p0);
       obj.setLocalForceShowGuide(p1);
       obj.setGuideText(p2);
       obj.setLiveStreamSlidePolicy(p3);
       return obj;
    }
    public final NearbyGuideParam b(Uri p0){
       NearbyGuideParam obj = PatchProxy.applyOneRefs(p0, this, NearbyGuideParam$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "uri");
       obj = new NearbyGuideParam();
       obj.setLocalForceShowGuide(Boolean.parseBoolean(x0.b(p0, "LocalSlideGuideEnable", "false")));
       obj.setGuideText(x0.b(p0, "LocalSlideGuideText", null));
       obj.setUri(p0);
       return obj;
    }
}
