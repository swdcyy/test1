package com.yxcorp.gifshow.photoad.AdTrackBlackUtil$mTrackBlackInfo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.photoad.model.TrackBlackUrlInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.photoad.AdTrackBlackUtil;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import fg6.a;
import com.google.gson.Gson;
import yx.j0;
import java.lang.Exception;

public final class AdTrackBlackUtil$mTrackBlackInfo$2 extends Lambda implements a	// class@000f54
{
    public static final AdTrackBlackUtil$mTrackBlackInfo$2 INSTANCE;

    static {
       AdTrackBlackUtil$mTrackBlackInfo$2.INSTANCE = new AdTrackBlackUtil$mTrackBlackInfo$2();
    }
    public void AdTrackBlackUtil$mTrackBlackInfo$2(){
       super(0);
    }
    public final TrackBlackUrlInfo invoke(){
       TrackBlackUrlInfo trackBlackUr1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       AdTrackBlackUtil obj = PatchProxy.apply(objArray, this, AdTrackBlackUtil$mTrackBlackInfo$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = AdTrackBlackUtil.b;
       Objects.requireNonNull(obj);
       TrackBlackUrlInfo trackBlackUr = PatchProxy.apply(objArray, obj, AdTrackBlackUtil.class, "2");
       if (trackBlackUr != patchProxyRe) {
       }else {
          try{
             TrackBlackUrlInfo value = a.t().getValue("trackBlackUrlInfo", TrackBlackUrlInfo.class, new TrackBlackUrlInfo());
             Object[] objArray1 = new Object[0];
             j0.f("AdTrackBlackUtil", a.a.q(value), objArray1);
             trackBlackUr1 = value;
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          trackBlackUr = trackBlackUr1;
       }
       return trackBlackUr;
    }
    public Object invoke(){
       return this.invoke();
    }
}
