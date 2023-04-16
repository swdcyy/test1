package com.kuaishou.live.bridge.channels.LiveJsInteractBizChange;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;
import com.kuaishou.live.bridge.channels.LiveJsInteractBizChange$bizAdapterObserverLazy$1;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.jsbridge.LiveJsSubscribeParams$Params;
import kotlin.jvm.internal.a;
import lp3.e;
import sz1.e;
import lp3.c;
import uz1.b;
import com.kuaishou.live.bridge.channels.LiveJsInteractBizChange$bizAdapterObserverLazy$1$a;
import uz1.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.live.bridge.channels.LiveJsInteractBizChange$BizInfo;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class LiveJsInteractBizChange extends AbstractLiveJsChannel	// class@000de0
{
    public final p h;
    public final p i;

    public void LiveJsInteractBizChange(){
       super();
       p op = s.c(new LiveJsInteractBizChange$bizAdapterObserverLazy$1(this));
       this.h = op;
       this.i = op;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, LiveJsInteractBizChange.class, "4")) {
          return;
       }
       this.q();
       return;
    }
    public void m(String p0,LiveJsSubscribeParams$Params p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveJsInteractBizChange.class, "2")) {
          return;
       }
       a.p(p0, "subscribeId");
       super.m(p0, p1);
       if (!PatchProxy.applyVoid(null, this, LiveJsInteractBizChange.class, "5") && !this.j().b()) {
          c uoc = this.j().a(e.class);
          a.o(uoc, "serviceManager.getServic¡­eractManager::class.java\)");
          uoc.Wi().M(this.o());
       }
       return;
    }
    public void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveJsInteractBizChange.class, "3")) {
          return;
       }
       a.p(p0, "subscribeId");
       super.n(p0);
       this.q();
       return;
    }
    public final LiveJsInteractBizChange$bizAdapterObserverLazy$1$a o(){
       Object obj = PatchProxy.apply(null, this, LiveJsInteractBizChange.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public final void p(int p0,String p1,boolean p2){
       if (PatchProxy.isSupport(LiveJsInteractBizChange.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, LiveJsInteractBizChange.class, "7")) {
          return;
       }
       this.a(a.a.q(new LiveJsInteractBizChange$BizInfo(p0, p1, p2)));
       return;
    }
    public final void q(){
       if (PatchProxy.applyVoid(null, this, LiveJsInteractBizChange.class, "6")) {
          return;
       }
       if (!this.h.isInitialized()) {
          return;
       }
       if (this.j().b()) {
          return;
       }
       try{
          c uoc = this.j().a(e.class);
          a.o(uoc, "serviceManager.getServic¡­eractManager::class.java\)");
          uoc.Wi().i(this.o());
       }catch(java.lang.Exception e0){
          b.y(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveJsInteractBizChange"), "removeObserverIfNeed", e0);
       }
       return;
    }
}
