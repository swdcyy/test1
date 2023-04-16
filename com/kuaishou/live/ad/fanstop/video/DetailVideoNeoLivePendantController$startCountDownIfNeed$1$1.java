package com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$startCountDownIfNeed$1$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Number;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import dm9.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.concurrent.TimeUnit;

public final class DetailVideoNeoLivePendantController$startCountDownIfNeed$1$1 extends FunctionReferenceImpl implements l	// class@0009bf
{

    public void DetailVideoNeoLivePendantController$startCountDownIfNeed$1$1(DetailVideoNeoLivePendantController p0){
       super(1, p0, DetailVideoNeoLivePendantController.class, "onTimeTick", "onTimeTick\(J\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.longValue());
       return l1.a;
    }
    public final void invoke(long p0){
       boolean b;
       if (PatchProxy.isSupport(DetailVideoNeoLivePendantController$startCountDownIfNeed$1$1.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, DetailVideoNeoLivePendantController$startCountDownIfNeed$1$1.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       a uoa = a.class;
       DetailVideoNeoLivePendantController uDetailVideo = DetailVideoNeoLivePendantController.class;
       if (!PatchProxy.isSupport(uDetailVideo) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), treceiver, uDetailVideo, "20")) {
          a d = a.d;
          DetailVideoNeoLivePendantController r = treceiver.r;
          Objects.requireNonNull(d);
          Object obj = PatchProxy.applyOneRefs(r, d, uoa, "2");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             a.p(r, "scene");
             b = (r == a.c)? true: false;
          }
          if (!b) {
             treceiver.p();
          }else {
             DetailVideoNeoLivePendantController q = treceiver.q;
             p0 = TimeUnit.SECONDS.toMillis(p0);
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(q, Long.valueOf(p0), d, uoa, "4")) {
                a.p(q, "videoLivePendantId");
                if (!a.g(q, "") && !(a.g(a.b, q) ^ 1)) {
                   a.a = a.a + p0;
                }
             }
          }
       }
    label_0097 :
       return;
    }
}
