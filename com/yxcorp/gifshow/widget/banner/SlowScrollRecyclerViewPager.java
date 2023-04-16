package com.yxcorp.gifshow.widget.banner.SlowScrollRecyclerViewPager;
import com.kwai.library.widget.viewpager.RecyclerViewPager;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Integer;
import java.util.Objects;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.widget.banner.SlowScrollRecyclerViewPager$a;
import androidx.recyclerview.widget.RecyclerView$x;

public final class SlowScrollRecyclerViewPager extends RecyclerViewPager	// class@001954
{

    public void SlowScrollRecyclerViewPager(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void SlowScrollRecyclerViewPager(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void SlowScrollRecyclerViewPager(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void SlowScrollRecyclerViewPager(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, SlowScrollRecyclerViewPager.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       if (this.getLayoutManager() != null) {
          if (this.getChildCount() < 2) {
             return;
          }else {
             int childLayoutP = this.getChildLayoutPosition(this.getChildAt((this.getChildCount() - 1)));
             if (this.getChildLayoutPosition(this.getChildAt(0)) < this.getCurrentItem() && this.getCurrentItem() <= childLayoutP) {
                this.scrollToPosition(this.getCurrentItem());
             }
          }
       }
       return;
    }
    public void smoothScrollToPosition(int p0){
       if (PatchProxy.isSupport(SlowScrollRecyclerViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlowScrollRecyclerViewPager.class, "1")) {
          return;
       }
       super.smoothScrollToPosition(p0);
       RecyclerView$LayoutManager layoutManage = this.getLayoutManager();
       Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
       SlowScrollRecyclerViewPager$a uoa = new SlowScrollRecyclerViewPager$a(this, this.getContext());
       uoa.p(p0);
       layoutManage.startSmoothScroll(uoa);
       return;
    }
}
