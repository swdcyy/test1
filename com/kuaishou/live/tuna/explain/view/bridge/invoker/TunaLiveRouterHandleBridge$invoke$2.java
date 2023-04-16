package com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaLiveRouterHandleBridge$invoke$2;
import qh7.b;
import com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaLiveRouterHandleBridge;
import xp3.c$a;
import java.lang.String;
import tx4.h;
import xp3.b;
import com.kuaishou.live.tuna.explain.view.TunaExplainTKRender;
import java.lang.Object;
import yh7.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import xp3.c;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import java.util.List;
import com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaLiveRouterHandleBridge$invoke$2$1;
import msd.a;
import c15.b;
import up3.b$a;
import java.util.Map;

public final class TunaLiveRouterHandleBridge$invoke$2 implements b	// class@000fb0
{
    public final TunaLiveRouterHandleBridge a;
    public final c$a b;
    public final String c;
    public final h d;
    public final b e;
    public final TunaExplainTKRender f;

    public void TunaLiveRouterHandleBridge$invoke$2(TunaLiveRouterHandleBridge p0,c$a p1,String p2,h p3,b p4,TunaExplainTKRender p5){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public final void a(a p0){
       TunaLiveRouterHandleBridge$invoke$2 tb1;
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaLiveRouterHandleBridge$invoke$2.class, "1")) {
          return;
       }
       a.p(p0, "result");
       String str = "resultBuilder";
       if (p0.a != 200) {
          TunaLiveRouterHandleBridge$invoke$2 tb = this.b;
          String str1 = "krouter jump failed!";
          Objects.requireNonNull(tb);
          if (PatchProxy.applyOneRefs(str1, tb, c$a.class, "3") != PatchProxyResult.class) {
          }else {
             tb.a.a(-1);
             tb.a.b(str1);
          }
          b.d(KsgLogTunaLiveTag.EXPLAIN_CARD.appendTag("BaseLiveTunaExplainPresenter"), new TunaLiveRouterHandleBridge$invoke$2$1(this));
          tb1 = this.b;
          a.o(tb1, str);
          this.a.e(this.d, tb1, this.e);
       }else {
          b$a uoa = this.f.e();
          if (uoa != null) {
             tb1 = this.c;
             a.o(tb1, "scheme");
             uoa.e(tb1, p0.b);
          }
          this.b.c();
          tb1 = this.b;
          a.o(tb1, str);
          this.a.e(this.d, tb1, this.e);
       }
       return;
    }
}
