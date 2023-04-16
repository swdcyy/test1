package com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.LiveHotSpotDetailRelatedAnchorItemAdapter;
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
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.LiveHotSpotDetailRelatedAnchorItemAdapter$RelatedAnchorViewHolder;
import android.view.View;

public final class LiveHotSpotDetailRelatedAnchorItemAdapter extends ViewControllerAdapter	// class@0013ef
{
    public final k j;

    public void LiveHotSpotDetailRelatedAnchorItemAdapter(LifecycleOwner p0,Activity p1,k p2){
       a.p(p0, "parentLifeCycle");
       a.p(p1, "activity");
       a.p(p2, "detailMainVCDelegate");
       super(p0, p1);
       this.j = p2;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveHotSpotDetailRelatedAnchorItemAdapter$RelatedAnchorViewHolder relatedAncho;
       LiveHotSpotDetailRelatedAnchorItemAdapter liveHotSpotD = LiveHotSpotDetailRelatedAnchorItemAdapter.class;
       if (PatchProxy.isSupport(liveHotSpotD)) {
          relatedAncho = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, liveHotSpotD, "1");
          if (relatedAncho != PatchProxyResult.class) {
          label_0035 :
             return relatedAncho;
          }
       }
       a.p(p0, "parent");
       relatedAncho = new LiveHotSpotDetailRelatedAnchorItemAdapter$RelatedAnchorViewHolder(this, new FrameLayout(p0.getContext()), this.N0(), this.K0());
       goto label_0035 ;
    }
}
