package com.kuaishou.live.tuna.explain.view.TunaExplainTKRender$refresh$1;
import tx4.o;
import com.kuaishou.live.tuna.explain.view.TunaExplainTKRender;
import com.kuaishou.live.tuna.explain.performance.TunaLiveExplainPerfLogger;
import java.lang.Object;
import sx4.e;
import tx4.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.view.View;
import up3.a;
import up3.b$a;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import java.util.List;
import com.kuaishou.live.tuna.explain.view.TunaExplainTKRender$refresh$1$onSuccess$1;
import msd.a;
import c15.b;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.lang.Integer;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.live.tuna.explain.view.TunaExplainTKRender$refresh$1$onFailed$1$1;
import com.kuaishou.live.tuna.performance.model.TunaLiveExplainPerfInfo$RenderInfo;
import kotlin.jvm.internal.a;

public final class TunaExplainTKRender$refresh$1 implements o	// class@000f9f
{
    public final TunaExplainTKRender a;
    public final TunaLiveExplainPerfLogger b;

    public void TunaExplainTKRender$refresh$1(TunaExplainTKRender p0,TunaLiveExplainPerfLogger p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(e p0,w p1){
       a a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TunaExplainTKRender$refresh$1.class, "1")) {
          return;
       }
       if (p0 != null && p0.getView() != null) {
          TunaExplainTKRender$refresh$1 ta = this.a;
          ta.e = p0;
          TunaExplainTKRender d = ta.d;
          if (d != null) {
             d.removeAllViews();
          }
          d = this.a.d;
          if (d != null) {
             d.addView(p0.getView());
          }
          TunaExplainTKRender$refresh$1 tb = this.b;
          if (tb != null) {
             tb.d();
          }
          tb = this.b;
          if (tb != null) {
             tb.f();
          }
          tb = this.b;
          if (tb != null) {
             tb.a();
          }
          a = this.a.a;
          if (a != null) {
             a.a();
          }
       }else {
          b.d(KsgLogTunaLiveTag.EXPLAIN_CARD.appendTag("TK render error"), TunaExplainTKRender$refresh$1$onSuccess$1.INSTANCE);
          a = this.a.a;
          if (a != null) {
             a.f(1, new IllegalStateException("render tk error, when tk success"), "PLC_5");
          }
       }
       return;
    }
    public void b(int p0,Throwable p1,w p2){
       if (PatchProxy.isSupport(TunaExplainTKRender$refresh$1.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, TunaExplainTKRender$refresh$1.class, "2")) {
          return;
       }
       if (p1 != null) {
          ExceptionHandler.handleCaughtException(p1);
          b.e(KsgLogTunaLiveTag.EXPLAIN_CARD.appendTag("TK render error"), TunaExplainTKRender$refresh$1$onFailed$1$1.INSTANCE, p1);
       }
       a a = this.a.a;
       if (a != null) {
          String str = TunaLiveExplainPerfInfo$RenderInfo.generateTKError(p0);
          a.o(str, "TunaLiveExplainPerfInfo.¡­enerateTKError\(errorCode\)");
          a.f(1, new IllegalStateException("render tk error, when tk success"), str);
       }
       return;
    }
}
