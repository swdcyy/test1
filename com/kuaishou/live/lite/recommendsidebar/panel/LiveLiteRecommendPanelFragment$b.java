package com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendPanelItemType;
import com.kuaishou.live.lite.recommendsidebar.panel.j;
import androidx.lifecycle.LiveData;
import lnc.a1;
import androidx.lifecycle.MutableLiveData;

public class LiveLiteRecommendPanelFragment$b extends RecyclerView$r	// class@000af0
{
    public final LiveLiteRecommendPanelFragment a;

    public void LiveLiteRecommendPanelFragment$b(LiveLiteRecommendPanelFragment p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveLiteRecommendPanelFragment$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveLiteRecommendPanelFragment$b.class, "1")) {
          return;
       }
       LiveLiteRecommendPanelFragment h = this.a.H;
       if (h != null) {
          int i = h.i0() - this.a.Gh();
          LiveLiteRecommendPanelFragment$b ta = this.a;
          if (ta.N == LiveLiteRecommendPanelItemType.Followed.mType) {
             if (ta.I.b.getValue() != null && (!this.a.I.b.getValue().intValue() || i <= this.a.I.b.getValue().intValue())) {
                this.a.I.c.setValue(a1.p(R.string.arg_RES_7f102c8f));
             }else {
                this.a.I.c.setValue(a1.p(R.string.arg_RES_7f102c94));
             }
          }else {
             ta.I.c.setValue(a1.p(R.string.arg_RES_7f102c94));
          }
       }
       return;
    }
}
