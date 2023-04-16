package com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailAdapter;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import un1.d;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Number;
import java.util.List;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailItemData;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailItemType;
import java.util.Objects;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailItemType$a;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailDataId;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailAdapter$a;
import android.view.View;

public final class LiveHotSpotDetailAdapter extends ViewControllerAdapter	// class@00135c
{
    public final d j;
    public final k k;

    public void LiveHotSpotDetailAdapter(LifecycleOwner p0,Activity p1,d p2,k p3){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "detailContentVCDelegate");
       a.p(p3, "detailMainVCDelegate");
       super(p0, p1);
       this.j = p2;
       this.k = p3;
    }
    public int f0(int p0){
       LiveHotSpotDetailItemType$a obj;
       LiveHotSpotDetailItemType bASE_INFO;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveHotSpotDetailAdapter liveHotSpotD = LiveHotSpotDetailAdapter.class;
       if (PatchProxy.isSupport(liveHotSpotD)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveHotSpotD, "2");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       obj = LiveHotSpotDetailItemType.Companion;
       LiveHotSpotDetailItemData id = this.L0().get(p0).id;
       Objects.requireNonNull(obj);
       LiveHotSpotDetailItemType liveHotSpotD1 = PatchProxy.applyOneRefs(id, obj, LiveHotSpotDetailItemType$a.class, "1");
       if (liveHotSpotD1 != patchProxyRe) {
       }else if(a.g(id, LiveHotSpotDetailDataId.BASE_INFO.getId())){
          bASE_INFO = LiveHotSpotDetailItemType.BASE_INFO;
       }else if(a.g(id, LiveHotSpotDetailDataId.RELATED_AUTHOR.getId())){
          bASE_INFO = LiveHotSpotDetailItemType.RELATED_AUTHOR;
       }else if(a.g(id, LiveHotSpotDetailDataId.CORE_MEDIA_AREA.getId())){
          bASE_INFO = LiveHotSpotDetailItemType.CORE_MEDIA_AREA;
       }else if(a.g(id, LiveHotSpotDetailDataId.HOT_SPOT_EXPLAIN.getId())){
          bASE_INFO = LiveHotSpotDetailItemType.HOT_SPOT_EXPLAIN;
       }else if(a.g(id, LiveHotSpotDetailDataId.NORMAL_MEDIA_AREA.getId())){
          bASE_INFO = LiveHotSpotDetailItemType.NORMAL_MEDIA_AREA;
       }else {
          bASE_INFO = LiveHotSpotDetailItemType.UNKNOWN;
       }
       liveHotSpotD1 = bASE_INFO;
       return liveHotSpotD1.getType();
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveHotSpotDetailAdapter liveHotSpotD = LiveHotSpotDetailAdapter.class;
       if (PatchProxy.isSupport(liveHotSpotD)) {
          LiveHotSpotDetailAdapter$a uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, liveHotSpotD, "1");
          if (uoa != PatchProxyResult.class) {
          label_0041 :
             return uoa;
          }
       }
       a.p(p0, "parent");
       FrameLayout uFrameLayout = new FrameLayout(p0.getContext());
       uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-1, -2));
       LiveHotSpotDetailAdapter$a uoa1 = new LiveHotSpotDetailAdapter$a(this, uFrameLayout, this.N0(), this.K0(), p1);
       goto label_0041 ;
    }
}
