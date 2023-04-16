package com.kuaishou.live.basic.performance.biz.LiveBizPerfReporter$bizStop$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.basic.performance.biz.LiveBizPerfReporter$bizStop$1;
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
import java.util.HashMap;
import l51.a$b;
import java.lang.System;
import java.lang.Long;
import kotlin.Pair;
import java.util.ArrayList;

public final class LiveBizPerfReporter$bizStop$1$1 extends Lambda implements l	// class@000ce8
{
    public final LiveBizPerfReporter$bizStop$1 this$0;

    public void LiveBizPerfReporter$bizStop$1$1(LiveBizPerfReporter$bizStop$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(PerfStatExecutor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBizPerfReporter$bizStop$1$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       LivePerfBizInfo livePerfBizI = this.this$0.$bizInfoBuilder.b();
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidOneRefs(livePerfBizI, p0, PerfStatExecutor.class, "4")) {
          String str = "bizInfo";
          a.p(livePerfBizI, str);
          p0 = p0.b;
          Objects.requireNonNull(p0);
          a uoa = a.class;
          if (!PatchProxy.applyVoidOneRefs(livePerfBizI, p0, uoa, "2")) {
             a.p(livePerfBizI, str);
             a$b uob = p0.a.get(livePerfBizI);
             if (uob != null) {
                uob.c((uob.a() - 1));
                if (uob.a() <= 0) {
                   uob.b = Long.valueOf(System.currentTimeMillis());
                   if (!PatchProxy.applyVoidOneRefs(livePerfBizI, p0, uoa, "5")) {
                      uob = p0.a.remove(livePerfBizI);
                      if (uob != null) {
                         a.o(uob, "startedBizMap.remove\(bizInfo\) ?: return");
                         p0.b.add(new Pair(livePerfBizI, uob));
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
