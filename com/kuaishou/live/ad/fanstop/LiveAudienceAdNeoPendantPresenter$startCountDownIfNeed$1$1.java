package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$startCountDownIfNeed$1$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter;
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

public final class LiveAudienceAdNeoPendantPresenter$startCountDownIfNeed$1$1 extends FunctionReferenceImpl implements l	// class@000980
{

    public void LiveAudienceAdNeoPendantPresenter$startCountDownIfNeed$1$1(LiveAudienceAdNeoPendantPresenter p0){
       super(1, p0, LiveAudienceAdNeoPendantPresenter.class, "onTimeTick", "onTimeTick\(J\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.longValue());
       return l1.a;
    }
    public final void invoke(long p0){
       if (PatchProxy.isSupport(LiveAudienceAdNeoPendantPresenter$startCountDownIfNeed$1$1.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveAudienceAdNeoPendantPresenter$startCountDownIfNeed$1$1.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       LiveAudienceAdNeoPendantPresenter liveAudience = LiveAudienceAdNeoPendantPresenter.class;
       if (!PatchProxy.isSupport(liveAudience) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), treceiver, liveAudience, "18")) {
          LiveAudienceAdNeoPendantPresenter s = treceiver.s;
          if (s != null) {
             s.set(Long.valueOf((s.get().longValue() + TimeUnit.SECONDS.toMillis(p0))));
          }
       }
       return;
    }
}
