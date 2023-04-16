package com.kuaishou.live.core.voiceparty.playway.shared.widget.GridSpacingItemDecoration;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.GridSpacingItemDecoration$Builder;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager$b;
import msd.l;
import java.lang.Number;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public final class GridSpacingItemDecoration extends RecyclerView$n	// class@00189b
{
    public final Rect a;
    public final ColorDrawable b;
    public final GridSpacingItemDecoration$Builder c;

    public void GridSpacingItemDecoration(GridSpacingItemDecoration$Builder p0){
       super();
       this.c = p0;
       this.a = new Rect();
       this.b = new ColorDrawable(p0.e);
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, GridSpacingItemDecoration.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       RecyclerView$LayoutManager layoutManage = p2.getLayoutManager();
       if (!layoutManage instanceof GridLayoutManager) {
          layoutManage = null;
       }
       RecyclerView$Adapter adapter = p2.getAdapter();
       if (layoutManage != null && adapter != null) {
          int orientation = layoutManage.getOrientation();
          int spanCount = layoutManage.getSpanCount();
          int childAdapter = p2.getChildAdapterPosition(p1);
          int i = layoutManage.j1().e(childAdapter, spanCount);
          int itemCount = adapter.getItemCount();
          int i1 = this.c.b.invoke(p2).intValue();
          int i2 = this.c.c.invoke(p2).intValue();
          int i3 = this.c.d.invoke(p2).intValue();
          if (this.c.a != null) {
             if (orientation == 1) {
                p0.left = i1 - ((i * i1) / spanCount);
                p0.right = ((i + 1) * i1) / spanCount;
                if (childAdapter < spanCount) {
                   p0.top = i2;
                }
                if (childAdapter < (itemCount - spanCount)) {
                   p0.bottom = i1;
                }else {
                   p0.bottom = i3;
                }
             }else {
                p0.top = i1 - ((i * i1) / spanCount);
                p0.bottom = ((i + 1) * i1) / spanCount;
                if (childAdapter < spanCount) {
                   p0.left = i2;
                }
                if (childAdapter < (itemCount - spanCount)) {
                   p0.right = i1;
                }else {
                   p0.right = i3;
                }
             }
          }else if(orientation == 1){
             p0.left = (i * i1) / spanCount;
             p0.right = i1 - (((i + 1) * i1) / spanCount);
             if (childAdapter < spanCount) {
                p0.top = i2;
             }
             if (childAdapter < (itemCount - spanCount)) {
                p0.bottom = i1;
             }else {
                p0.bottom = i3;
             }
          }else {
             p0.top = (i * i1) / spanCount;
             p0.bottom = i1 - (((i + 1) * i1) / spanCount);
             if (childAdapter < spanCount) {
                p0.left = i2;
             }
             if (childAdapter < (itemCount - spanCount)) {
                p0.right = i1;
             }else {
                p0.right = i3;
             }
          }
       }
       return;
    }
    public void e(Canvas p0,RecyclerView p1,RecyclerView$y p2){
       View this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GridSpacingItemDecoration.class, "2")) {
          return;
       }
       a.p(p0, "canvas");
       a.p(p1, "parent");
       a.p(p2, "state");
       int childCount = p1.getChildCount();
       int i = 0;
       while (i < childCount) {
          this = p1.getChildAt(i);
          this.a.set(0, 0, 0, 0);
          a.o(this, "child");
          this.c(this.a, this, p1, p2);
          ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
          int i1 = this.getLeft() - layoutParams.leftMargin;
          int i2 = this.getTop() - layoutParams.topMargin;
          int i3 = this.getRight() + layoutParams.rightMargin;
          int i4 = this.getBottom() + layoutParams.bottomMargin;
          GridSpacingItemDecoration ta = this.a;
          Rect left = ta.left;
          int i5 = i1 - left;
          int i6 = i2 - ta.top;
          int i7 = ta.right + i3;
          int i8 = ta.bottom + i4;
          if (left != null) {
             this.b.setBounds(i5, i6, i1, i8);
             this.b.draw(p0);
          }
          if (this.a.top != null) {
             this.b.setBounds(i5, i6, i7, i2);
             this.b.draw(p0);
          }
          if (this.a.right != null) {
             this.b.setBounds(i3, i6, i7, i8);
             this.b.draw(p0);
          }
          if (this.a.bottom != null) {
             this.b.setBounds(i5, i4, i7, i8);
             this.b.draw(p0);
          }
          i = i + 1;
       }
       return;
    }
}
