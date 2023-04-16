package com.kuaishou.live.audience.component.vfc.LiveVfcPresenter$onBind$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.audience.component.vfc.LiveVfcPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import fda.d;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class LiveVfcPresenter$onBind$2 extends FunctionReferenceImpl implements l	// class@000bf0
{

    public void LiveVfcPresenter$onBind$2(LiveVfcPresenter p0){
       super(1, p0, LiveVfcPresenter.class, "onGrowthShowShopEvent", "onGrowthShowShopEvent\(Lcom/yxcorp/gifshow/events/growth/GrowthShowShopEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVfcPresenter$onBind$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.onGrowthShowShopEvent(p0);
       return;
    }
}
