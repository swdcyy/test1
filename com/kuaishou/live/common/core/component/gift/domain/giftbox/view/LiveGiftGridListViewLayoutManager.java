package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftGridListViewLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftGridListViewLayoutManager$a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class LiveGiftGridListViewLayoutManager extends GridLayoutManager	// class@001219
{
    public final LiveGiftGridListViewLayoutManager$a A;

    public void LiveGiftGridListViewLayoutManager(Context p0,int p1){
       super(p0, p1);
       this.A = new LiveGiftGridListViewLayoutManager$a(this, p0);
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(LiveGiftGridListViewLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveGiftGridListViewLayoutManager.class, "1")) {
          return;
       }
       this.A.p(p2);
       this.startSmoothScroll(this.A);
       return;
    }
}
