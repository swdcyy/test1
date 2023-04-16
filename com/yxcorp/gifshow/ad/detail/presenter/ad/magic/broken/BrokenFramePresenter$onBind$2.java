package com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$onBind$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import wl9.x;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;

public final class BrokenFramePresenter$onBind$2 extends FunctionReferenceImpl implements l	// class@0015d8
{

    public void BrokenFramePresenter$onBind$2(BrokenFramePresenter p0){
       super(1, p0, BrokenFramePresenter.class, "onSplashEyemaxEnterDetail", "onSplashEyemaxEnterDetail\(Lcom/yxcorp/gifshow/commercial/event/SplashEyemaxEnterDetail;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BrokenFramePresenter$onBind$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, BrokenFramePresenter.class, "6")) {
          p0 = p0.a;
          BrokenFramePresenter q = treceiver.q;
          if (q == null) {
             a.S("mPhoto");
          }
          if (a.g(p0, q) && treceiver.v != null) {
             treceiver.w = true;
             q = treceiver.p;
             if (q == null) {
                a.S("mPlayModule");
             }
             e player = q.getPlayer();
             if (player != null && player.isPlaying() == true) {
                BrokenFramePresenter.S8(treceiver, false, true, null);
             }
          }
       }
    label_0054 :
       return;
    }
}
