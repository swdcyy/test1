package com.kuaishou.live.basic.performance.biz.LiveBizPerfReporter$bizStart$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.basic.performance.biz.LiveBizPerfReporter$bizStart$1;
import java.lang.Object;
import com.kuaishou.live.basic.performance.biz.PerfStatExecutor;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.base.service.perf.LivePerfBizInfo;
import sq5.b;
import java.util.Objects;
import l51.a;
import java.util.Map;
import java.util.HashMap;
import l51.a$b;
import java.lang.System;
import java.lang.Long;

public final class LiveBizPerfReporter$bizStart$1$1 extends Lambda implements l	// class@000ce6
{
    public final LiveBizPerfReporter$bizStart$1 this$0;

    public void LiveBizPerfReporter$bizStart$1$1(LiveBizPerfReporter$bizStart$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(PerfStatExecutor p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBizPerfReporter$bizStart$1$1.class, str)) {
          return;
       }
       a.p(p0, "it");
       LivePerfBizInfo livePerfBizI = this.this$0.$bizInfoBuilder.b();
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidOneRefs(livePerfBizI, p0, PerfStatExecutor.class, "3")) {
          String str1 = "bizInfo";
          a.p(livePerfBizI, str1);
          p0 = p0.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(livePerfBizI, p0, a.class, str)) {
             a.p(livePerfBizI, str1);
             if (p0.a.containsKey(livePerfBizI)) {
                a$b uob = p0.a.get(livePerfBizI);
                if (uob != null) {
                   uob.c((uob.a() + 1));
                }
             }else {
                p0.a.put(livePerfBizI, new a$b(System.currentTimeMillis(), null, 0));
             }
          }
       }
       return;
    }
}
