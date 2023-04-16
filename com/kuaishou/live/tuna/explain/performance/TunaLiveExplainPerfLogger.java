package com.kuaishou.live.tuna.explain.performance.TunaLiveExplainPerfLogger;
import zp3.a;
import java.lang.Object;
import com.kuaishou.live.tuna.performance.model.TunaLiveExplainPerfInfo$RenderInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.tuna.util.LiveTunaUtils;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import java.util.List;
import com.kuaishou.live.tuna.explain.performance.TunaLiveExplainPerfLogger$doReport$1;
import msd.a;
import c15.b;
import tkd.b;
import tkd.d;
import xx5.g;
import zx5.a;
import zx5.e;
import kotlin.jvm.internal.a;
import com.kuaishou.live.tuna.explain.performance.TunaLiveExplainPerfLogger$doReport$2;
import zx5.a$a;
import java.lang.Integer;
import np3.a;
import com.kuaishou.live.tuna.explain.performance.TunaLiveExplainPerfLogger$reportError$1;
import com.kuaishou.live.tuna.explain.performance.TunaLiveExplainPerfLogger$reportError$2;
import android.os.SystemClock;
import com.yxcorp.utility.TextUtils;

public final class TunaLiveExplainPerfLogger implements a	// class@000f9b
{
    public final TunaLiveExplainPerfInfo$RenderInfo a;
    public long b;

    public void TunaLiveExplainPerfLogger(){
       super();
       this.a = new TunaLiveExplainPerfInfo$RenderInfo();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, TunaLiveExplainPerfLogger.class, "7")) {
          return;
       }
       if (!LiveTunaUtils.a()) {
          return;
       }
       b.b(KsgLogTunaLiveTag.EXPLAIN_CARD.appendTag("performance"), new TunaLiveExplainPerfLogger$doReport$1(this));
       if (this.a.mRenderCost - null > 0) {
          g og = d.a(-174493078);
          if (og != null) {
             e uoe = og.PB(a.class);
             if (uoe != null) {
                a.o(uoe, "PluginManager.get\(TunaUt\x20\x02java\)\n          ?: return\x00");
                a$a.a(uoe, "tuna_live_explain_render", false, new TunaLiveExplainPerfLogger$doReport$2(this), 2, null);
             }
          }
       }
       return;
    }
    public final void b(String p0,int p1,String p2){
       if (PatchProxy.isSupport(TunaLiveExplainPerfLogger.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, TunaLiveExplainPerfLogger.class, "6")) {
          return;
       }
       a.p(p0, "businessType");
       a.p(p2, "errorCode");
       if (!LiveTunaUtils.a()) {
          return;
       }
       g og = d.a(-174493078);
       if (og != null) {
          e uoe = og.PB(a.class);
          if (uoe != null) {
             a.o(uoe, "PluginManager.get\(TunaUt\x20\x02s.java\)\n        ?: return\x00");
             TunaLiveExplainPerfInfo$RenderInfo renderInfo = new TunaLiveExplainPerfInfo$RenderInfo();
             renderInfo.mBusinessType = p0;
             renderInfo.mRenderType = p1;
             renderInfo.mRenderResult = p2;
             p0 = (p1 == 1)? "TKäÖÈ¾": "NativeäÖÈ¾";
             a.o(p2, "errorInfo.mRenderResult");
             a.a(p0, p2);
             b.b(KsgLogTunaLiveTag.EXPLAIN_CARD.appendTag("biz error performance"), new TunaLiveExplainPerfLogger$reportError$1(renderInfo));
             a$a.a(uoe, "tuna_live_explain_render", false, super(renderInfo), 2, null);
          }
       }
       return;
    }
    public final void c(){
       this.a.mRenderType = 0;
    }
    public final void d(){
       this.a.mRenderResult = "PLC_1";
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, TunaLiveExplainPerfLogger.class, "1")) {
          return;
       }
       this.b = SystemClock.elapsedRealtime();
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, TunaLiveExplainPerfLogger.class, "2")) {
          return;
       }
       if (this.b > 0) {
          this.a.mRenderCost = SystemClock.elapsedRealtime() - this.b;
       }
       return;
    }
    public final void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaLiveExplainPerfLogger.class, "3")) {
          return;
       }
       TunaLiveExplainPerfLogger ta = this.a;
       ta.mRenderType = 1;
       ta.mRenderBundleId = TextUtils.I(p0);
       return;
    }
}
