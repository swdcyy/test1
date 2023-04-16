package com.kuaishou.live.bridge.channels.LiveJsInteractChatMediaInfoUpdate;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;
import com.kuaishou.live.bridge.channels.LiveJsInteractChatMediaInfoUpdate$liveInteractMediaObserverLazy$1;
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
import hh3.d;
import com.kuaishou.live.bridge.channels.LiveJsInteractChatMediaInfoUpdate$liveInteractMediaObserverLazy$1$a;
import hh3.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class LiveJsInteractChatMediaInfoUpdate extends AbstractLiveJsChannel	// class@000de4
{
    public final p h;
    public final p i;

    public void LiveJsInteractChatMediaInfoUpdate(){
       super();
       p op = s.c(new LiveJsInteractChatMediaInfoUpdate$liveInteractMediaObserverLazy$1(this));
       this.h = op;
       this.i = op;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, LiveJsInteractChatMediaInfoUpdate.class, "4")) {
          return;
       }
       this.p();
       return;
    }
    public void m(String p0,LiveJsSubscribeParams$Params p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveJsInteractChatMediaInfoUpdate.class, "2")) {
          return;
       }
       a.p(p0, "subscribeId");
       super.m(p0, p1);
       if (!PatchProxy.applyVoid(null, this, LiveJsInteractChatMediaInfoUpdate.class, "5") && !this.j().b()) {
          this.i(e.class).Sj().z(this.o());
       }
       return;
    }
    public void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveJsInteractChatMediaInfoUpdate.class, "3")) {
          return;
       }
       a.p(p0, "subscribeId");
       super.n(p0);
       this.p();
       return;
    }
    public final LiveJsInteractChatMediaInfoUpdate$liveInteractMediaObserverLazy$1$a o(){
       Object obj = PatchProxy.apply(null, this, LiveJsInteractChatMediaInfoUpdate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, LiveJsInteractChatMediaInfoUpdate.class, "6")) {
          return;
       }
       if (this.h.isInitialized() && !this.j().b()) {
          try{
             this.i(e.class).Sj().g(this.o());
          }catch(java.lang.Exception e0){
             b.y(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveJsInteractChatMediaInfoUpdate"), "removeObserverIfNeed", e0);
          }
       }
    }
}
