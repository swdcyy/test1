package com.kuaishou.live.bridge.channels.LiveJsInteractBizChange$bizAdapterObserverLazy$1$a;
import uz1.a;
import com.kuaishou.live.bridge.channels.LiveJsInteractBizChange$bizAdapterObserverLazy$1;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.live.bridge.channels.LiveJsInteractBizChange;
import com.kuaishou.live.common.multiinteract.biz.adapter.BizEndReason;
import kotlin.jvm.internal.a;

public final class LiveJsInteractBizChange$bizAdapterObserverLazy$1$a implements a	// class@000dde
{
    public final LiveJsInteractBizChange$bizAdapterObserverLazy$1 a;

    public void LiveJsInteractBizChange$bizAdapterObserverLazy$1$a(LiveJsInteractBizChange$bizAdapterObserverLazy$1 p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1){
       LiveJsInteractBizChange$bizAdapterObserverLazy$1$a uobizAdapter = LiveJsInteractBizChange$bizAdapterObserverLazy$1$a.class;
       if (PatchProxy.isSupport(uobizAdapter) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uobizAdapter, "2")) {
          return;
       }
       this.a.this$0.p(p0, p1, true);
       return;
    }
    public void b(int p0,String p1,BizEndReason p2){
       if (PatchProxy.isSupport(LiveJsInteractBizChange$bizAdapterObserverLazy$1$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, LiveJsInteractBizChange$bizAdapterObserverLazy$1$a.class, "1")) {
          return;
       }
       a.p(p2, "bizEndReason");
       this.a.this$0.p(p0, p1, false);
       return;
    }
}
