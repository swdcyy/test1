package com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter$onBind$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import wl9.o;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;

public final class PhotoAdRotatePresenter$onBind$2 extends FunctionReferenceImpl implements l	// class@0015b3
{

    public void PhotoAdRotatePresenter$onBind$2(PhotoAdRotatePresenter p0){
       super(1, p0, PhotoAdRotatePresenter.class, "liveHalfSubscribeDialogStateChange", "liveHalfSubscribeDialogStateChange\(Lcom/yxcorp/gifshow/commercial/event/LiveHalfSubscribeDialogEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoAdRotatePresenter$onBind$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, PhotoAdRotatePresenter.class, "8")) {
          o b = p0.b;
          PhotoAdRotatePresenter p = treceiver.p;
          if (p == null) {
             a.S("mPhoto");
          }
          if (a.g(b, p) && treceiver.A != null) {
             treceiver.D = p0.a();
             treceiver.S8((p0.a() ^ 0x01));
          }
       }
    label_0046 :
       return;
    }
}
