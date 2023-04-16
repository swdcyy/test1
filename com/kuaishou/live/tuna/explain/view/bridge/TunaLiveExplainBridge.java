package com.kuaishou.live.tuna.explain.view.bridge.TunaLiveExplainBridge;
import tx4.l;
import com.kuaishou.live.tuna.explain.view.bridge.TunaLiveExplainBridge$a;
import nsd.u;
import sp3.a;
import com.kuaishou.live.tuna.explain.view.TunaExplainTKRender;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.ConcurrentHashMap;
import wp3.d;
import com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaLiveRouterHandleBridge;
import wp3.c;
import wp3.b;
import tx4.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.tuna.model.TunaLiveExplainMessage;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import java.util.List;
import com.kuaishou.live.tuna.explain.view.bridge.TunaLiveExplainBridge$invoke$1;
import msd.a;
import c15.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import vp3.a;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.live.tuna.explain.view.bridge.TunaLiveExplainBridge$invoke$2;
import tx4.k;

public final class TunaLiveExplainBridge implements l	// class@000fa9
{
    public final ConcurrentHashMap a;
    public final a b;
    public final TunaExplainTKRender c;
    public static final TunaLiveExplainBridge$a d;

    static {
       TunaLiveExplainBridge.d = new TunaLiveExplainBridge$a(null);
    }
    public void TunaLiveExplainBridge(a p0,TunaExplainTKRender p1){
       a.p(p0, "tunaLiveExplainContext");
       a.p(p1, "tkRender");
       super();
       this.b = p0;
       this.c = p1;
       ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
       this.a = uConcurrentH;
       uConcurrentH.put("fetchTunaLiveExplainContext", new d());
       uConcurrentH.put("handleTunaLiveScheme", new TunaLiveRouterHandleBridge());
       uConcurrentH.put("handleTunaLiveExplainClose", new c());
       uConcurrentH.put("logTunaLiveExplainClick", new b());
    }
    public Object a(String p0,String p1,h p2){
       TunaLiveExplainMessage obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TunaLiveExplainBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.d();
       KsgLogTunaLiveTag eXPLAIN_CARD = KsgLogTunaLiveTag.EXPLAIN_CARD;
       eXPLAIN_CARD.appendTag("TunaExplainBridge");
       b.f(eXPLAIN_CARD, new TunaLiveExplainBridge$invoke$1(p0, obj));
       Object obj1 = null;
       if (!TextUtils.x(p0) && obj != null) {
          a uoa = this.a.get(p0);
          if (uoa != null) {
             obj1 = uoa.b(this.b, this.c, p1, p2);
          }else {
             ExceptionHandler.handleCaughtException(new NullPointerException("tuna live "+p0+" bridge is NULL"));
             eXPLAIN_CARD.appendTag("TunaExplainBridge");
             b.d(eXPLAIN_CARD, new TunaLiveExplainBridge$invoke$2(p0, p1));
          }
       }
       return obj1;
    }
    public Object b(String p0,String p1,String p2,h p3){
       return k.a(this, p0, p1, p2, p3);
    }
}
