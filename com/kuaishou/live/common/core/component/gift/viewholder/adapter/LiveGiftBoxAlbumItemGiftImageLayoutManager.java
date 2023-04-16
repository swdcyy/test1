package com.kuaishou.live.common.core.component.gift.viewholder.adapter.LiveGiftBoxAlbumItemGiftImageLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import java.lang.Float;
import java.lang.Math;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.common.core.component.gift.viewholder.adapter.LiveGiftBoxAlbumItemGiftImageLayoutManager$a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;

public class LiveGiftBoxAlbumItemGiftImageLayoutManager extends LinearLayoutManager	// class@001333
{

    public void LiveGiftBoxAlbumItemGiftImageLayoutManager(Context p0){
       super(p0, 1, false);
    }
    public void LiveGiftBoxAlbumItemGiftImageLayoutManager(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
    }
    public void LiveGiftBoxAlbumItemGiftImageLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
    }
    public int scrollHorizontallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (PatchProxy.isSupport(LiveGiftBoxAlbumItemGiftImageLayoutManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, LiveGiftBoxAlbumItemGiftImageLayoutManager.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = super.scrollHorizontallyBy(p0, p1, p2);
       if (!this.getOrientation() && !PatchProxy.applyVoid(null, this, LiveGiftBoxAlbumItemGiftImageLayoutManager.class, "3")) {
          float f = (float)this.getWidth() / 2.00f;
          int i = 0;
          while (i < this.getChildCount()) {
             View childAt = this.getChildAt(i);
             if (childAt != null && (!PatchProxy.isSupport(LiveGiftBoxAlbumItemGiftImageLayoutManager.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f), childAt, this, LiveGiftBoxAlbumItemGiftImageLayoutManager.class, "4"))) {
                boolean i1 = this.getDecoratedRight(childAt) + this.getDecoratedLeft(childAt);
                float f1 = (float)i1 / 2.00f;
                f1 = f - f1;
                float f2 = Math.min((float)this.getWidth(), Math.abs(f1)) / (float)this.getWidth();
                i1 = (f1 < 0)? true: false;
                if (!PatchProxy.isSupport(LiveGiftBoxAlbumItemGiftImageLayoutManager.class) || !PatchProxy.applyVoidTwoRefs(childAt, Boolean.valueOf(i1), this, LiveGiftBoxAlbumItemGiftImageLayoutManager.class, "5")) {
                   if (i1) {
                      childAt.setPivotX(0);
                   }else {
                      childAt.setPivotX((float)this.getWidth());
                   }
                }
                f1 = 0x3f800000;
                f2 = f1 - f2;
                f2 = f2 * f1;
                childAt.setAlpha(f2);
             }
             i = i + 1;
          }
       }
       return p0;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(LiveGiftBoxAlbumItemGiftImageLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveGiftBoxAlbumItemGiftImageLayoutManager.class, "1")) {
          return;
       }
       LiveGiftBoxAlbumItemGiftImageLayoutManager$a uoa = new LiveGiftBoxAlbumItemGiftImageLayoutManager$a(this, p0.getContext());
       uoa.p(p2);
       this.startSmoothScroll(uoa);
       return;
    }
}
