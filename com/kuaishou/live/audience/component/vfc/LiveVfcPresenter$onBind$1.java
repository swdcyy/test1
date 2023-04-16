package com.kuaishou.live.audience.component.vfc.LiveVfcPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.audience.component.vfc.LiveVfcPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import nna.a;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class LiveVfcPresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@000bef
{

    public void LiveVfcPresenter$onBind$1(LiveVfcPresenter p0){
       super(1, p0, LiveVfcPresenter.class, "onGrowthHalfWebViewEvent", "onGrowthHalfWebViewEvent\(Lcom/yxcorp/gifshow/growth/event/GrowthHalfWebViewEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVfcPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.onGrowthHalfWebViewEvent(p0);
       return;
    }
}
