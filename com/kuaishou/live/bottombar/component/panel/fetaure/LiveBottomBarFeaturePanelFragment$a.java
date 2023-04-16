package com.kuaishou.live.bottombar.component.panel.fetaure.LiveBottomBarFeaturePanelFragment$a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.kuaishou.live.bottombar.component.panel.fetaure.LiveBottomBarFeaturePanelFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.bottombar.component.panel.LiveBottomBarBasePanelFragment;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;

public class LiveBottomBarFeaturePanelFragment$a extends GridLayoutManager$b	// class@000d3b
{
    public final GridLayoutManager e;
    public final LiveBottomBarFeaturePanelFragment f;

    public void LiveBottomBarFeaturePanelFragment$a(LiveBottomBarFeaturePanelFragment p0,GridLayoutManager p1){
       this.f = p0;
       this.e = p1;
       super();
    }
    public int f(int p0){
       LiveBottomBarBasePanelFragment obj;
       LiveBottomBarFeaturePanelFragment$a uoa = LiveBottomBarFeaturePanelFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.f.c;
       if (obj == null || obj.getAdapter() == null) {
          return this.e.getSpanCount();
       }else if(this.f.c.getAdapter().f0(p0) != 1){
          return 1;
       }else {
          return this.e.getSpanCount();
       }
    }
}
