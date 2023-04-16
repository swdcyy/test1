package com.kuaishou.merchant.live.cart.onsale.audience.area.tab.LiveAudienceCommodityFragment$b;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.merchant.live.cart.onsale.audience.area.tab.LiveAudienceCommodityFragment;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager$b;
import lnc.a1;

public class LiveAudienceCommodityFragment$b extends RecyclerView$n	// class@001924
{
    public final LiveAudienceCommodityFragment a;

    public void LiveAudienceCommodityFragment$b(LiveAudienceCommodityFragment p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LiveAudienceCommodityFragment$b.class, "1")) {
          return;
       }
       if (p2.getAdapter() != null && p2.getLayoutManager() != null) {
          GridLayoutManager$b uob = p2.getLayoutManager().j1();
          int childAdapter = p2.getChildAdapterPosition(p1);
          int i = uob.f(childAdapter);
          childAdapter = uob.e(childAdapter, 2);
          p0.set(0, 0, 0, 0);
          if (!childAdapter && !this.f(i)) {
             p0.left = a1.e(14.00f);
             p0.right = a1.e(4.00f);
          }
          if (childAdapter == 1 && !this.f(i)) {
             p0.left = a1.e(4.00f);
             p0.right = a1.e(14.00f);
          }
          if (this.f(i)) {
             p0.top = 0;
          }
       }
    label_006c :
       return;
    }
    public final boolean f(int p0){
       boolean b = (p0 == 2)? true: false;
       return b;
    }
}
