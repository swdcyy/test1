package com.yxcorp.gifshow.photoad.AdTrackBlackUtil;
import com.yxcorp.gifshow.photoad.AdTrackBlackUtil$mTrackBlackInfo$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.photoad.model.TrackBlackUrlInfo;
import com.yxcorp.gifshow.photoad.model.TrackBlackUrlInfo$BlackUrlItem;
import lnc.y0;

public final class AdTrackBlackUtil	// class@000f55
{
    public static final p a;
    public static final AdTrackBlackUtil b;

    static {
       AdTrackBlackUtil.b = new AdTrackBlackUtil();
       AdTrackBlackUtil.a = s.c(AdTrackBlackUtil$mTrackBlackInfo$2.INSTANCE);
    }
    public void AdTrackBlackUtil(){
       super();
    }
    public final boolean a(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdTrackBlackUtil uAdTrackBlac = AdTrackBlackUtil.class;
       Object[] objArray = null;
       TrackBlackUrlInfo obj = PatchProxy.apply(objArray, this, uAdTrackBlac, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b();
       TrackBlackUrlInfo$BlackUrlItem uBlackUrlIte = (obj != null)? obj.a(): objArray;
       Object obj1 = PatchProxy.applyOneRefs(uBlackUrlIte, this, uAdTrackBlac, "7");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(this.c()){
          if (uBlackUrlIte != null) {
             objArray = Boolean.valueOf(uBlackUrlIte.enableIntercept);
          }
          if (y0.p(objArray)) {
             b = true;
          }
       }
       b = false;
       return b;
    }
    public final TrackBlackUrlInfo b(){
       Object obj = PatchProxy.apply(null, this, AdTrackBlackUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AdTrackBlackUtil.a.getValue();
    }
    public final boolean c(){
       Object[] objArray = null;
       TrackBlackUrlInfo obj = PatchProxy.apply(objArray, this, AdTrackBlackUtil.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b();
       if (obj != null) {
          objArray = Boolean.valueOf(obj.isSwitchOpen);
       }
       return y0.p(objArray);
    }
}
