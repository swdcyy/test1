package com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.LiveHotSpotDetailRelatedAnchorItemAdapter$RelatedAnchorViewHolder;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.LiveHotSpotDetailRelatedAnchorItemAdapter;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.LiveHotSpotDetailRelatedAnchorItemAdapter$RelatedAnchorViewHolder$itemVC$1;
import un1.k;
import msd.a;
import android.view.ViewGroup;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiveHotSpotDetailRelatedAnchorItemAdapter$RelatedAnchorViewHolder extends ViewControllerAdapter$a	// class@0013ee
{
    public final LiveHotSpotDetailRelatedAnchorItemAdapter f;

    public void LiveHotSpotDetailRelatedAnchorItemAdapter$RelatedAnchorViewHolder(LiveHotSpotDetailRelatedAnchorItemAdapter p0,View p1,LifecycleOwner p2,Activity p3){
       a.p(p1, "itemView");
       a.p(p2, "parentLifecycleOwner");
       a.p(p3, "activity");
       this.f = p0;
       super(p1, p2, p3);
       this.E2(p1, new LiveHotSpotDetailRelatedAnchorItemViewController(this.b(), p0.j, new LiveHotSpotDetailRelatedAnchorItemAdapter$RelatedAnchorViewHolder$itemVC$1(this)));
    }
}
