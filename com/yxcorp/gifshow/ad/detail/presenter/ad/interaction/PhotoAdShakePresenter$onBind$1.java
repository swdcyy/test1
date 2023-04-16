package com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import wl9.x;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.SplashInfo;
import tw.l;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo;
import java.lang.Runnable;
import ekd.k1;

public final class PhotoAdShakePresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@0015bb
{

    public void PhotoAdShakePresenter$onBind$1(PhotoAdShakePresenter p0){
       super(1, p0, PhotoAdShakePresenter.class, "onSplashEyemaxEnterDetail", "onSplashEyemaxEnterDetail\(Lcom/yxcorp/gifshow/commercial/event/SplashEyemaxEnterDetail;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(x p0){
       PhotoAdShakePresenter p1;
       long l;
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoAdShakePresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, PhotoAdShakePresenter.class, "6")) {
          p0 = p0.a;
          PhotoAdShakePresenter p = treceiver.p;
          String str = "mPhoto";
          if (p == null) {
             a.S(str);
          }
          if (a.g(p0, p) && treceiver.A != null) {
             p1 = treceiver.p;
             if (p1 == null) {
                a.S(str);
             }
             SplashInfo splashInfo = l.e(p1.mEntity);
             p = treceiver.y;
             if (p == null) {
                a.S("mShakeInfo");
             }
             PhotoAdvertisement$ShakeInfo mShakeEnable = p.mShakeEnableDelayTimeMs;
             splashInfo = (splashInfo != null)? splashInfo.mSplashAdDuration: 0;
             int i = mShakeEnable - splashInfo;
             p1 = treceiver.s;
             l = (i > 0)? (long)i: 0;
             k1.r(p1, l);
          }
       }
    label_0061 :
       return;
    }
}
