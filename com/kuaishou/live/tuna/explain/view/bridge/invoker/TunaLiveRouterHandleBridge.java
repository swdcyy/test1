package com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaLiveRouterHandleBridge;
import wp3.a;
import xp3.b;
import java.lang.Class;
import java.lang.String;
import sp3.a;
import com.kuaishou.live.tuna.explain.view.TunaExplainTKRender;
import java.lang.Object;
import tx4.h;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import xp3.c$a;
import com.yxcorp.utility.TextUtils;
import fq5.b;
import android.app.Activity;
import tkd.b;
import tkd.d;
import xx5.d;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import java.util.List;
import com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaLiveRouterHandleBridge$invoke$1;
import msd.a;
import c15.b;
import lnc.a1;
import java.lang.CharSequence;
import vq5.d;
import android.content.Context;
import com.kuaishou.live.tuna.util.LiveTunaUtils;
import xh7.b;
import com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaLiveRouterHandleBridge$invoke$2;
import qh7.b;
import qh7.a;
import xp3.c;
import com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaLiveRouterHandleBridge$callback$$inlined$let$lambda$1;

public final class TunaLiveRouterHandleBridge extends a	// class@000fb1
{

    public void TunaLiveRouterHandleBridge(){
       super(b.class);
    }
    public String a(){
       return "handleTunaLiveScheme";
    }
    public Object c(a p0,TunaExplainTKRender p1,Object p2,h p3){
       b obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, TunaLiveRouterHandleBridge.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "tunaLiveExplainContext");
          a.p(p1, "tkRender");
          c$a uoa = new c$a().b();
          obj = (p2 != null)? p2.mScheme: null;
          String str = TextUtils.I(obj);
          b uob = p0.b();
          Activity activity = p0.getActivity();
          if (activity != null) {
             d uod = d.a(-734569516);
             if (uod != null) {
                if (uob != null) {
                   LiveStreamFeedWrapper liveStreamFe = uob.r5();
                   if (liveStreamFe != null) {
                      liveStreamFe = liveStreamFe.mEntity;
                   label_0054 :
                      String uod1 = uod.tY(str, liveStreamFe);
                      b.f(KsgLogTunaLiveTag.EXPLAIN_CARD.appendTag("BaseLiveTunaExplainPresenter"), new TunaLiveRouterHandleBridge$invoke$1(uod1));
                      if (a1.i(activity) && !TextUtils.x(uod1)) {
                         a.o(uod1, "scheme");
                         if (LiveTunaUtils.c(uod1, activity, p0.e(), KsgLogTunaLiveTag.ANCHOR_TASK_BUTTON) ^ 0x01) {
                            TunaLiveRouterHandleBridge$invoke$2 oinvoke$2 = new TunaLiveRouterHandleBridge$invoke$2(this, uoa, uod1, p3, p2, p1);
                            a.b(new b(activity, uod1), v8);
                         }else {
                            uoa.c();
                            a.o(uoa, "resultBuilder");
                            this.e(p3, uoa, p2);
                         }
                      }
                   }
                }
                BaseFeed uBaseFeed = null;
                goto label_0054 ;
             }
          }
          obj = null;
       }
       return obj;
    }
    public final void e(h p0,c$a p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TunaLiveRouterHandleBridge.class, "2")) {
          return;
       }
       if (p0 != null) {
          String str = this.d(p1.a());
          b.f(KsgLogTunaLiveTag.EXPLAIN_CARD.appendTag("ITunaExplainBridgeFunction"), new TunaLiveRouterHandleBridge$callback$$inlined$let$lambda$1(str, this, p1, p2));
          Object[] objArray = new Object[]{str};
          p0.call(objArray);
       }
       return;
    }
}
