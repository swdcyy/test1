package com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter$a;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import mxb.f0;
import com.yxcorp.gifshow.entity.QPhoto;
import by.a;
import java.lang.Float;
import com.kwai.framework.model.feed.BaseFeed;
import iz.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo;
import mxb.c;
import java.lang.Runnable;
import ekd.k1;

public final class PhotoAdShakePresenter$a extends a	// class@0015b5
{
    public final PhotoAdShakePresenter b;

    public void PhotoAdShakePresenter$a(PhotoAdShakePresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotoAdShakePresenter$a.class, "2")) {
          return;
       }
       PhotoAdShakePresenter$a tb = this.b;
       tb.A = false;
       if (tb.w != null) {
          f0 uof0 = b.a(-762347696);
          QPhoto mEntity = PhotoAdShakePresenter.P8(this.b).mEntity;
          PhotoAdShakePresenter q = this.b.q;
          if (q != null) {
             objArray = Float.valueOf(q.a());
          }
          uof0.r1(mEntity, "shake_acceleration", objArray);
       }
       this.b.R8();
       return;
    }
    public void i2(){
       int i;
       if (PatchProxy.applyVoid(null, this, PhotoAdShakePresenter$a.class, "1")) {
          return;
       }
       this.b.A = true;
       if (!a.b()) {
          PhotoAdShakePresenter$a tb = this.b;
          PhotoAdShakePresenter s = tb.s;
          PhotoAdvertisement$ShakeInfo shakeInfo = c.z(PhotoAdShakePresenter.P8(tb).mEntity);
          shakeInfo = (shakeInfo != null)? shakeInfo.mShakeEnableDelayTimeMs: 0;
          k1.r(s, (long)shakeInfo);
       }
       return;
    }
}
