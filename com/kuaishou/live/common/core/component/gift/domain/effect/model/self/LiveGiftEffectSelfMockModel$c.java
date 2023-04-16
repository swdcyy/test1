package com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel$c;
import erd.g;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.android.live.log.b;
import ei1.a;
import crd.b;

public final class LiveGiftEffectSelfMockModel$c implements g	// class@0011bb
{
    public final LiveGiftEffectSelfMockModel b;
    public final LiveSendGiftBaseTraceInfo c;
    public final Ref$ObjectRef d;

    public void LiveGiftEffectSelfMockModel$c(LiveGiftEffectSelfMockModel p0,LiveSendGiftBaseTraceInfo p1,Ref$ObjectRef p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftEffectSelfMockModel$c.class, "1")) {
       }else {
          b.y(this.b.i, "[requestMockSelfGiftEffect] fail", p0);
          LiveGiftEffectSelfMockModel p = this.b.p;
          if (p != null) {
             p.a(this.c, false, p0);
          }
          this.b.f(this.d.element);
       }
       return;
    }
}
