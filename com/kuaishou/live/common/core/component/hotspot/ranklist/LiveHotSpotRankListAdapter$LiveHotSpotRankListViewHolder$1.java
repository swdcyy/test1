package com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListAdapter$LiveHotSpotRankListViewHolder$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListAdapter$LiveHotSpotRankListViewHolder;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotspot.ranklist.model.LiveHotSpotRankListData$LiveHotSpotRankListItem;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListAdapter;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListLayoutManager;
import androidx.recyclerview.widget.RecyclerView$x;

public final class LiveHotSpotRankListAdapter$LiveHotSpotRankListViewHolder$1 extends Lambda implements l	// class@00142a
{
    public final LiveHotSpotRankListAdapter$LiveHotSpotRankListViewHolder this$0;

    public void LiveHotSpotRankListAdapter$LiveHotSpotRankListViewHolder$1(LiveHotSpotRankListAdapter$LiveHotSpotRankListViewHolder p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(LiveHotSpotRankListData$LiveHotSpotRankListItem p0){
       String str = "1";
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveHotSpotRankListAdapter$LiveHotSpotRankListViewHolder$1.class, str);
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       LiveHotSpotRankListAdapter j = this.this$0.f.j;
       boolean b = true;
       if (j != null) {
          Object obj1 = PatchProxy.apply(null, j, LiveHotSpotRankListLayoutManager.class, str);
          boolean b1 = (obj1 != PatchProxyResult.class)? obj1.booleanValue(): j.r.g();
          if (b1) {
             b = false;
          }
       }
       return b;
    }
}
