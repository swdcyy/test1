package com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter$onBind$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import wl9.x;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;

public final class ThanosAdPlayerPausePresenter$onBind$3 extends FunctionReferenceImpl implements l	// class@0016d4
{

    public void ThanosAdPlayerPausePresenter$onBind$3(ThanosAdPlayerPausePresenter p0){
       super(1, p0, ThanosAdPlayerPausePresenter.class, "onSplashEyemaxEnterDetail", "onSplashEyemaxEnterDetail\(Lcom/yxcorp/gifshow/commercial/event/SplashEyemaxEnterDetail;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdPlayerPausePresenter$onBind$3.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, ThanosAdPlayerPausePresenter.class, "9")) {
          p0 = p0.a;
          ThanosAdPlayerPausePresenter q = treceiver.q;
          if (q == null) {
             a.S("mPhoto");
          }
          if (a.g(p0, q) && treceiver.y != null) {
             treceiver.z = true;
          }
       }
    label_003a :
       return;
    }
}
