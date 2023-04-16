package com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListAdapter;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import yn1.i;
import yn1.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListLayoutManager;
import java.util.Objects;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListAdapter$LiveHotSpotRankListViewHolder;
import android.view.View;

public final class LiveHotSpotRankListAdapter extends ViewControllerAdapter	// class@00142c
{
    public LiveHotSpotRankListLayoutManager j;
    public final i k;
    public final h l;

    public void LiveHotSpotRankListAdapter(LifecycleOwner p0,Activity p1,i p2,h p3){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "logger");
       a.p(p3, "delegate");
       super(p0, p1);
       this.k = p2;
       this.l = p3;
    }
    public void u0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotRankListAdapter.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       super.u0(p0);
       if (p0.getLayoutManager() instanceof LiveHotSpotRankListLayoutManager) {
          RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
          Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListLayoutManager");
          this.j = layoutManage;
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveHotSpotRankListAdapter$LiveHotSpotRankListViewHolder liveHotSpotR1;
       LiveHotSpotRankListAdapter liveHotSpotR = LiveHotSpotRankListAdapter.class;
       if (PatchProxy.isSupport(liveHotSpotR)) {
          liveHotSpotR1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, liveHotSpotR, "2");
          if (liveHotSpotR1 != PatchProxyResult.class) {
          label_003f :
             return liveHotSpotR1;
          }
       }
       a.p(p0, "parent");
       FrameLayout uFrameLayout = new FrameLayout(p0.getContext());
       uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-1, -2));
       liveHotSpotR1 = new LiveHotSpotRankListAdapter$LiveHotSpotRankListViewHolder(this, uFrameLayout, this.N0(), this.K0());
       goto label_003f ;
    }
}
