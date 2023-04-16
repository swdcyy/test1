package com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListAdapter$LiveHotSpotRankListViewHolder;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListAdapter;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.hotspot.ranklist.item.LiveHotSpotRankListItemViewController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListAdapter$LiveHotSpotRankListViewHolder$1;
import yn1.i;
import yn1.h;
import msd.l;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiveHotSpotRankListAdapter$LiveHotSpotRankListViewHolder extends ViewControllerAdapter$a	// class@00142b
{
    public final LiveHotSpotRankListAdapter f;

    public void LiveHotSpotRankListAdapter$LiveHotSpotRankListViewHolder(LiveHotSpotRankListAdapter p0,View p1,LifecycleOwner p2,Activity p3){
       a.p(p1, "itemView");
       a.p(p2, "parentLifecycleOwner");
       a.p(p3, "activity");
       this.f = p0;
       super(p1, p2, p3);
       this.E2(p1, new LiveHotSpotRankListItemViewController(this.b(), p0.k, p0.l, new LiveHotSpotRankListAdapter$LiveHotSpotRankListViewHolder$1(this)));
    }
}
