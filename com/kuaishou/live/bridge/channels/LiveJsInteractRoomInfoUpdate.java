package com.kuaishou.live.bridge.channels.LiveJsInteractRoomInfoUpdate;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;
import com.kuaishou.live.bridge.channels.LiveJsInteractRoomInfoUpdate$rtcManagerObserverLazy$1;
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
import lh3.b;
import com.kuaishou.live.bridge.channels.LiveJsInteractRoomInfoUpdate$rtcManagerObserverLazy$1$a;
import lh3.i0;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class LiveJsInteractRoomInfoUpdate extends AbstractLiveJsChannel	// class@000de8
{
    public final p h;
    public final p i;

    public void LiveJsInteractRoomInfoUpdate(){
       super();
       p op = s.c(new LiveJsInteractRoomInfoUpdate$rtcManagerObserverLazy$1(this));
       this.h = op;
       this.i = op;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, LiveJsInteractRoomInfoUpdate.class, "4")) {
          return;
       }
       this.p();
       return;
    }
    public void m(String p0,LiveJsSubscribeParams$Params p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveJsInteractRoomInfoUpdate.class, "2")) {
          return;
       }
       a.p(p0, "subscribeId");
       super.m(p0, p1);
       if (!PatchProxy.applyVoid(null, this, LiveJsInteractRoomInfoUpdate.class, "5") && !this.j().b()) {
          c uoc = this.j().a(e.class);
          a.o(uoc, "serviceManager.getServic¡­eractManager::class.java\)");
          uoc.gc().m(this.o());
       }
       return;
    }
    public void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveJsInteractRoomInfoUpdate.class, "3")) {
          return;
       }
       a.p(p0, "subscribeId");
       super.n(p0);
       this.p();
       return;
    }
    public final LiveJsInteractRoomInfoUpdate$rtcManagerObserverLazy$1$a o(){
       Object obj = PatchProxy.apply(null, this, LiveJsInteractRoomInfoUpdate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, LiveJsInteractRoomInfoUpdate.class, "6")) {
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
          uoc.gc().h(this.o());
       }catch(java.lang.Exception e0){
          b.y(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveJsInteractRoomInfoUpdate"), "removeObserverIfNeed", e0);
       }
       return;
    }
}
