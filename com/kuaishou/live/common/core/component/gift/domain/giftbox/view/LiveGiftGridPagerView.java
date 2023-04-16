package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftGridPagerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$s;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$ScrollMode;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftGridPagerView$a;
import androidx.recyclerview.widget.RecyclerView$r;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import yl1.n;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import zi1.f;
import androidx.recyclerview.widget.RecyclerView$n;
import zi1.g;

public final class LiveGiftGridPagerView extends RecyclerView	// class@00121d
{
    public n b;
    public RecyclerView$s c;
    public int d;
    public LiveGiftBoxConfig$ScrollMode e;
    public final ArrayList f;
    public HashMap g;

    public void LiveGiftGridPagerView(Context p0){
       super(p0, null);
    }
    public void LiveGiftGridPagerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.c = new RecyclerView$s();
       this.d = -1;
       this.e = LiveGiftBoxConfig$ScrollMode.PAGER_HORIZONTAL;
       this.f = new ArrayList();
       this.c.k(0, 8);
       this.addOnScrollListener(new LiveGiftGridPagerView$a(this));
    }
    public final int getCurrentPos(){
       ViewGroup$LayoutParams obj = PatchProxy.apply(null, this, LiveGiftGridPagerView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       View childAt = this.getChildAt(i);
       if (childAt != null) {
          obj = childAt.getLayoutParams();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
          i = obj.getAbsoluteAdapterPosition();
       }
       return i;
    }
    public final n getGridPagerAdapter(){
       return this.b;
    }
    public final int getPagerCount(){
       LiveGiftGridPagerView obj = PatchProxy.apply(null, this, LiveGiftGridPagerView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int itemCount = (obj != null)? obj.getItemCount(): 0;
       return itemCount;
    }
    public final void setCurrentPos(int p0){
       if (PatchProxy.isSupport(LiveGiftGridPagerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGiftGridPagerView.class, "7")) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = this.getLayoutManager();
       if (!layoutManage instanceof LinearLayoutManager) {
          layoutManage = null;
       }
       if (layoutManage != null) {
          layoutManage.scrollToPositionWithOffset(p0, 0);
       }
       return;
    }
    public final void setGridPagerAdapter(n p0){
       this.b = p0;
    }
    public final void setScrollerModel(LiveGiftBoxConfig$ScrollMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftGridPagerView.class, "1")) {
          return;
       }
       a.p(p0, "scrollMode");
       this.e = p0;
       if (p0 == LiveGiftBoxConfig$ScrollMode.PAGER_HORIZONTAL) {
          this.f.clear();
       }
       if (!PatchProxy.applyVoid(null, this, LiveGiftGridPagerView.class, "2")) {
          if (this.e == LiveGiftBoxConfig$ScrollMode.LIST_VERTICAL) {
             this.addItemDecoration(new f());
             this.addItemDecoration(new g());
          }else {
             int itemDecorati = this.getItemDecorationCount();
             for (int i = 0; i < itemDecorati; i++) {
                this.removeItemDecorationAt(i);
             }
          }
       }
       return;
    }
}
