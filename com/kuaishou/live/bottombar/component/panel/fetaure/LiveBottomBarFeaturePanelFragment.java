package com.kuaishou.live.bottombar.component.panel.fetaure.LiveBottomBarFeaturePanelFragment;
import com.kuaishou.live.bottombar.component.panel.LiveBottomBarBasePanelFragment;
import com.kuaishou.live.bottombar.service.model.panel.LiveBottomBarPanelData;
import k61.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bottombar.component.panel.a;
import l61.a;
import androidx.lifecycle.LifecycleOwner;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import com.kuaishou.live.bottombar.component.panel.fetaure.LiveBottomBarFeaturePanelFragment$a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import java.util.Collection;
import ekd.q;
import java.util.List;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import k61.g;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;

public class LiveBottomBarFeaturePanelFragment extends LiveBottomBarBasePanelFragment	// class@000d3c
{

    public void LiveBottomBarFeaturePanelFragment(){
       super();
    }
    public static LiveBottomBarFeaturePanelFragment Yg(LiveBottomBarPanelData p0,f p1){
       LiveBottomBarFeaturePanelFragment obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveBottomBarFeaturePanelFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveBottomBarFeaturePanelFragment();
       obj.b = p0;
       obj.f = p1;
       return obj;
    }
    public a Ug(){
       Object obj = PatchProxy.apply(null, this, LiveBottomBarFeaturePanelFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this, this.b.mDisableShowSelectedStatus, this.Wg());
    }
    public RecyclerView$LayoutManager Vg(Context p0){
       LiveBottomBarPanelData obj = PatchProxy.applyOneRefs(p0, this, LiveBottomBarFeaturePanelFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.mMaxIconPerRow;
       if (obj <= null) {
          int i = 4;
       }
       GridLayoutManager gridLayoutMa = new GridLayoutManager(p0, obj);
       gridLayoutMa.m1(new LiveBottomBarFeaturePanelFragment$a(this, gridLayoutMa));
       return gridLayoutMa;
    }
    public void Xg(){
       if (PatchProxy.applyVoid(null, this, LiveBottomBarFeaturePanelFragment.class, "2")) {
          return;
       }
       super.Xg();
       if (!q.f(this.e) && !this.e.get(0).getValue() instanceof g) {
          ViewGroup$LayoutParams layoutParams = this.c.getLayoutParams();
          if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
             layoutParams.topMargin = a1.e(13.00f);
          }
       }
       return;
    }
}
