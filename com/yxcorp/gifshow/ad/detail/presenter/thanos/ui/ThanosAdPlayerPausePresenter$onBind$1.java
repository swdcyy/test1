package com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import zca.s;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import p5a.e;
import de5.a;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.yxcorp.gifshow.entity.QPhoto;

public final class ThanosAdPlayerPausePresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@0016d2
{

    public void ThanosAdPlayerPausePresenter$onBind$1(ThanosAdPlayerPausePresenter p0){
       super(1, p0, ThanosAdPlayerPausePresenter.class, "handleSlidingPanelEvent", "handleSlidingPanelEvent\(Lcom/yxcorp/gifshow/event/SlidingPanelEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(s p0){
       a uoa;
       ThanosAdPlayerPausePresenter q;
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdPlayerPausePresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, ThanosAdPlayerPausePresenter.class, "7") && treceiver.y != null) {
          ThanosAdPlayerPausePresenter u = treceiver.u;
          if (u == null) {
             a.S("mPlayModule");
          }
          if (u.getPlayer() != null) {
             String str = "mPhoto";
             if (p0.a != null) {
                uoa = a.d();
                q = treceiver.q;
                if (q == null) {
                   a.S(str);
                }
                uoa.k(new PlayEvent(q, PlayEvent$Status.PAUSE, 20));
             }else {
                uoa = a.d();
                q = treceiver.q;
                if (q == null) {
                   a.S(str);
                }
                uoa.k(new PlayEvent(q, PlayEvent$Status.RESUME, 20));
             }
          }
       }
    label_0069 :
       return;
    }
}
