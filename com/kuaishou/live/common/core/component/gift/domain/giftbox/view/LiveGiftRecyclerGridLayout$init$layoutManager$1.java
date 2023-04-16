package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftRecyclerGridLayout$init$layoutManager$1;
import androidx.recyclerview.widget.GridLayoutManager;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftRecyclerGridLayout;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class LiveGiftRecyclerGridLayout$init$layoutManager$1 extends GridLayoutManager	// class@001228
{
    public final LiveGiftRecyclerGridLayout A;

    public void LiveGiftRecyclerGridLayout$init$layoutManager$1(LiveGiftRecyclerGridLayout p0,Context p1,int p2){
       this.A = p0;
       super(p1, p2);
    }
    public boolean canScrollVertically(){
       return false;
    }
    public void onAttachedToWindow(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftRecyclerGridLayout$init$layoutManager$1.class, "1")) {
          return;
       }
       super.onAttachedToWindow(p0);
       if (this.f0() && p0 != null) {
          RecyclerView$Adapter adapter = p0.getAdapter();
          if (adapter != null) {
             adapter.k0();
          }
       }
       return;
    }
}
