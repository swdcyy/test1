package com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotFlexBoxLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import kotlin.jvm.internal.a;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import msd.a;
import qrd.l1;

public final class LiveHotSpotFlexBoxLayoutManager extends RecyclerView$LayoutManager	// class@0013aa
{
    public a a;
    public int b;
    public int c;

    public void LiveHotSpotFlexBoxLayoutManager(){
       super();
       this.c = Integer.MAX_VALUE;
    }
    public final int N(){
       return this.b;
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotFlexBoxLayoutManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RecyclerView$LayoutParams(-2, -2);
    }
    public boolean isAutoMeasureEnabled(){
       return true;
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       ViewGroup$MarginLayoutParams topMargin;
       int i8;
       int i9;
       LiveHotSpotFlexBoxLayoutManager a;
       int i = this;
       Object obj = p0;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, i, LiveHotSpotFlexBoxLayoutManager.class, "2")) {
          return;
       }
       a.p(obj, "recycler");
       this.detachAndScrapAttachedViews(p0);
       int width = this.getWidth();
       int i1 = 0;
       i.b = i1;
       int itemCount = this.getItemCount();
       int i2 = 0;
       int i3 = 1;
       int i4 = 0;
       int i5 = 0;
       int i6 = 0;
       while (true) {
          if (i4 < itemCount) {
             View view = obj.o(i4);
             a.o(view, "recycler.getViewForPosition\(i\)");
             i.addView(view);
             i.measureChildWithMargins(view, i1, i1);
             int decoratedMea = i.getDecoratedMeasuredWidth(view);
             int decoratedMea1 = i.getDecoratedMeasuredHeight(view);
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             ViewGroup$LayoutParams layoutParams1 = layoutParams;
             ViewGroup$MarginLayoutParams leftMargin = layoutParams1.leftMargin;
             int i7 = decoratedMea + leftMargin;
             ViewGroup$MarginLayoutParams rightMargin = layoutParams1.rightMargin;
             i7 = i7 + rightMargin;
             i7 = i7 + i2;
             if (i7 <= width) {
                i2 = i7 - decoratedMea;
                decoratedMea = i2 - rightMargin;
                topMargin = layoutParams1.topMargin;
                i8 = i5 + topMargin;
                i1 = i7 - rightMargin;
                i9 = i5 + decoratedMea1;
                i9 = i9 + topMargin;
                i7 = i1;
                ViewGroup$LayoutParams layoutParams2 = layoutParams1;
                this.layoutDecorated(view, decoratedMea, i8, i7, i9);
                decoratedMea1 = decoratedMea1 + layoutParams2.bottomMargin;
                decoratedMea1 = decoratedMea1 + layoutParams2.topMargin;
                i6 = Math.max(i6, decoratedMea1);
                i2 = i7;
             }else {
                i3 = i3 + 1;
                if (i3 > i.c) {
                   i.removeView(view);
                label_00bb :
                   a = i.a;
                   if (a != null) {
                      a.invoke();
                      break ;
                   }
                   break ;
                }else {
                   i2 = decoratedMea + leftMargin;
                   i1 = rightMargin + i2;
                   if (!i6) {
                      i2 = layoutParams1.bottomMargin + decoratedMea1;
                      i6 = i2 + layoutParams1.topMargin;
                   }
                   i5 = i5 + i6;
                   i.b = i4;
                   topMargin = layoutParams1.topMargin;
                   i7 = i5 + topMargin;
                   i6 = decoratedMea + leftMargin;
                   decoratedMea = i5 + decoratedMea1;
                   i9 = decoratedMea + topMargin;
                   i8 = i7;
                   i7 = i6;
                   ViewGroup$LayoutParams layoutParams3 = layoutParams1;
                   this.layoutDecorated(view, leftMargin, i8, i7, i9);
                   decoratedMea1 = decoratedMea1 + layoutParams3.bottomMargin;
                   decoratedMea1 = decoratedMea1 + layoutParams3.topMargin;
                   i2 = i1;
                   i6 = decoratedMea1;
                }
             }
             i4 = i4 + 1;
             i1 = 0;
          }else {
             goto label_00bb ;
          }
       }
       return;
    }
}
