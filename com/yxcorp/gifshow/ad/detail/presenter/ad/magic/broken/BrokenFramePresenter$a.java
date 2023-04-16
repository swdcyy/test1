package com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$a;
import jy.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import p49.d;
import com.kwai.adclient.kscommerciallogger.model.SubBusinessType;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.BrokenFrameInfo;
import mxb.c;

public final class BrokenFramePresenter$a extends a	// class@0015cf
{

    public void BrokenFramePresenter$a(){
       super();
    }
    public double a(){
       Object obj = PatchProxy.apply(null, this, BrokenFramePresenter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return (double)d.d.a("ad_thanos_apm_broken_frame", 0);
    }
    public SubBusinessType b(){
       return SubBusinessType.BROKEN_FRAME;
    }
    public boolean c(QPhoto p0){
       boolean b;
       BrokenFrameInfo obj = PatchProxy.applyOneRefs(p0, this, BrokenFramePresenter$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = null;
       QPhoto mEntity = (p0 != null)? p0.mEntity: obj;
       if (c.j(mEntity) != null) {
          p0 = (p0 != null)? p0.mEntity: obj;
          BrokenFrameInfo uBrokenFrame = c.j(p0);
          if (uBrokenFrame != null) {
             obj = uBrokenFrame.mMagicVideoInfo;
          }
          if (obj != null) {
             b = true;
          label_0033 :
             return b;
          }
       }
       b = false;
       goto label_0033 ;
    }
}
