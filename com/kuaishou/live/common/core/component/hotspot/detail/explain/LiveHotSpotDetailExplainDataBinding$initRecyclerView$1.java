package com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainDataBinding$initRecyclerView$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainDataBinding;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainDataBinding$a;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotFlexBoxLayoutManager;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainDataBinding$initRecyclerView$1$a;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class LiveHotSpotDetailExplainDataBinding$initRecyclerView$1 extends Lambda implements a	// class@00139c
{
    public final LiveHotSpotDetailExplainDataBinding$a $itemDecoration;
    public final LiveHotSpotFlexBoxLayoutManager $layoutManager;
    public final LiveHotSpotDetailExplainDataBinding this$0;

    public void LiveHotSpotDetailExplainDataBinding$initRecyclerView$1(LiveHotSpotDetailExplainDataBinding p0,LiveHotSpotDetailExplainDataBinding$a p1,LiveHotSpotFlexBoxLayoutManager p2){
       this.this$0 = p0;
       this.$itemDecoration = p1;
       this.$layoutManager = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailExplainDataBinding$initRecyclerView$1.class, "1")) {
          return;
       }
       if (this.$itemDecoration.a != this.$layoutManager.N()) {
          this.$itemDecoration.a = this.$layoutManager.N();
          this.this$0.c.post(new LiveHotSpotDetailExplainDataBinding$initRecyclerView$1$a(this));
       }
       return;
    }
}
