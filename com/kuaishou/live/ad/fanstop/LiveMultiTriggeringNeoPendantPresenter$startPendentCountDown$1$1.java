package com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Number;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import im8.f;
import java.util.concurrent.TimeUnit;

public final class LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1$1 extends FunctionReferenceImpl implements l	// class@000992
{

    public void LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1$1(LiveMultiTriggeringNeoPendantPresenter p0){
       super(1, p0, LiveMultiTriggeringNeoPendantPresenter.class, "onTimeTick", "onTimeTick\(J\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.longValue());
       return l1.a;
    }
    public final void invoke(long p0){
       if (PatchProxy.isSupport(LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1$1.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1$1.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       LiveMultiTriggeringNeoPendantPresenter liveMultiTri = LiveMultiTriggeringNeoPendantPresenter.class;
       if (!PatchProxy.isSupport(liveMultiTri) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), treceiver, liveMultiTri, "14")) {
          LiveMultiTriggeringNeoPendantPresenter r = treceiver.r;
          if (r != null) {
             r.set(Long.valueOf((r.get().longValue() + TimeUnit.SECONDS.toMillis(p0))));
          }
       }
       return;
    }
}
