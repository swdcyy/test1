package com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaAdapter;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import msd.p;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.common.core.component.hotspot.detail.model.MediaType;
import java.util.List;
import ln1.b;
import com.kuaishou.live.common.core.component.hotspot.detail.model.MediaType$a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaAdapter$a;
import android.view.View;

public final class LiveHotSpotDetailNormalMediaAreaAdapter extends ViewControllerAdapter	// class@0013d4
{
    public final p j;
    public final k k;

    public void LiveHotSpotDetailNormalMediaAreaAdapter(LifecycleOwner p0,Activity p1,p p2,k p3){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "itemClickHandler");
       a.p(p3, "detailMainVCDelegate");
       super(p0, p1);
       this.j = p2;
       this.k = p3;
    }
    public int f0(int p0){
       LiveHotSpotDetailNormalMediaAreaAdapter liveHotSpotD = LiveHotSpotDetailNormalMediaAreaAdapter.class;
       if (PatchProxy.isSupport(liveHotSpotD)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveHotSpotD, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return MediaType.Companion.a(this.L0().get(p0)).getType();
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveHotSpotDetailNormalMediaAreaAdapter liveHotSpotD = LiveHotSpotDetailNormalMediaAreaAdapter.class;
       if (PatchProxy.isSupport(liveHotSpotD)) {
          LiveHotSpotDetailNormalMediaAreaAdapter$a uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, liveHotSpotD, "1");
          if (uoa != PatchProxyResult.class) {
          label_0041 :
             return uoa;
          }
       }
       a.p(p0, "parent");
       FrameLayout uFrameLayout = new FrameLayout(p0.getContext());
       uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-1, -2));
       LiveHotSpotDetailNormalMediaAreaAdapter$a uoa1 = new LiveHotSpotDetailNormalMediaAreaAdapter$a(this, uFrameLayout, this.N0(), this.K0(), p1);
       goto label_0041 ;
    }
}
