package com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaExplainFetchDataBridge$invoke$task$1;
import java.lang.Runnable;
import wp3.d;
import sp3.a;
import java.lang.Void;
import tx4.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xp3.c$a;
import yp3.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import xp3.c;
import wp3.a;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import java.util.List;
import com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaExplainFetchDataBridge$invoke$task$1$1;
import msd.a;
import c15.b;
import com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaExplainFetchDataBridge$invoke$task$1$a;
import ekd.k1;

public final class TunaExplainFetchDataBridge$invoke$task$1 implements Runnable	// class@000fac
{
    public final d b;
    public final a c;
    public final Void d;
    public final h e;

    public void TunaExplainFetchDataBridge$invoke$task$1(d p0,a p1,Void p2,h p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       c$a uoa;
       a uoa1;
       if (PatchProxy.applyVoid(null, this, TunaExplainFetchDataBridge$invoke$task$1.class, "1")) {
          return;
       }
       try{
          uoa = new c$a();
          uoa1 = this.b.e(this.c);
       }catch(java.lang.Exception e2){
          ExceptionHandler.handleCaughtException(e2);
       }
       if (uoa1 != null) {
          c$a uoa2 = uoa.c();
          Objects.requireNonNull(uoa2);
          if (PatchProxy.applyOneRefs(uoa1, uoa2, c$a.class, "4") != PatchProxyResult.class) {
          }else {
             uoa2.a.data = uoa1;
          }
       }
       String str = this.b.d(uoa.a());
       b.f(KsgLogTunaLiveTag.EXPLAIN_CARD.appendTag("ITunaExplainBridgeFunction"), new TunaExplainFetchDataBridge$invoke$task$1$1(this, str));
       k1.o(new TunaExplainFetchDataBridge$invoke$task$1$a(this, str));
       return;
    }
}
