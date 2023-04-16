package com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainLinkAdapter;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainLinkAdapter$a;
import android.view.View;

public final class LiveHotSpotDetailExplainLinkAdapter extends ViewControllerAdapter	// class@00139f
{
    public final k j;

    public void LiveHotSpotDetailExplainLinkAdapter(LifecycleOwner p0,Activity p1,k p2){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "detailMainVCDelegate");
       super(p0, p1);
       this.j = p2;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveHotSpotDetailExplainLinkAdapter$a uoa;
       LiveHotSpotDetailExplainLinkAdapter liveHotSpotD = LiveHotSpotDetailExplainLinkAdapter.class;
       if (PatchProxy.isSupport(liveHotSpotD)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, liveHotSpotD, "1");
          if (uoa != PatchProxyResult.class) {
          label_003e :
             return uoa;
          }
       }
       a.p(p0, "parent");
       FrameLayout uFrameLayout = new FrameLayout(p0.getContext());
       uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
       uoa = new LiveHotSpotDetailExplainLinkAdapter$a(this, uFrameLayout, this.N0(), this.K0());
       goto label_003e ;
    }
}
