package com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.Objects;
import androidx.recyclerview.widget.LinearLayoutManager;

public class ScrollToCenterRecyclerView extends RecyclerView	// class@00147e
{
    public int b;
    public int c;

    public void ScrollToCenterRecyclerView(Context p0){
       super(p0);
    }
    public void ScrollToCenterRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ScrollToCenterRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setItemWidth(int p0){
       this.c = p0;
    }
    public void setLeftMargin(int p0){
       this.b = p0;
    }
    public void x(int p0){
       int i;
       if (PatchProxy.isSupport(ScrollToCenterRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ScrollToCenterRecyclerView.class, "1")) {
          return;
       }
       if (!this.getChildCount()) {
          this.getViewTreeObserver().addOnGlobalLayoutListener(new ScrollToCenterRecyclerView$a(this, p0));
          return;
       }else {
          ScrollToCenterRecyclerView tc = this.c;
          if (tc != null) {
             i = tc / 2;
          }else {
             i = 0;
             View childAt = this.getChildAt(i);
             if (childAt != null) {
                i = childAt.getWidth() / 2;
             }
          }
          RecyclerView$LayoutManager layoutManage = this.getLayoutManager();
          Objects.requireNonNull(layoutManage);
          layoutManage.scrollToPositionWithOffset(p0, (((this.getWidth() / 2) - i) - this.b));
          return;
       }
    }
}
