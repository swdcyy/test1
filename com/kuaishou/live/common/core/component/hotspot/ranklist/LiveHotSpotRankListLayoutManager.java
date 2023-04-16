package com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListLayoutManager$a;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import msd.a;
import qrd.l1;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public final class LiveHotSpotRankListLayoutManager extends LinearLayoutManager	// class@001435
{
    public final LiveHotSpotRankListLayoutManager$a r;
    public a s;
    public boolean t;

    public void LiveHotSpotRankListLayoutManager(Context p0){
       a.p(p0, "context");
       super(p0);
       this.r = new LiveHotSpotRankListLayoutManager$a(p0);
    }
    public boolean isAutoMeasureEnabled(){
       return false;
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotRankListLayoutManager.class, "2")) {
          return;
       }
       super.onLayoutCompleted(p0);
       this.t = true;
       LiveHotSpotRankListLayoutManager ts = this.s;
       if (ts != null) {
          ts.invoke();
       }
       return;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(LiveHotSpotRankListLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveHotSpotRankListLayoutManager.class, "3")) {
          return;
       }
       a.p(p0, "recyclerView");
       a.p(p1, "state");
       this.r.p(p2);
       this.startSmoothScroll(this.r);
       return;
    }
}
