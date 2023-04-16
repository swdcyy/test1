package com.kuaishou.live.core.show.liveslidesquare.sidebar.LiveSquareSideBarUnfoldTabLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;

public class LiveSquareSideBarUnfoldTabLayoutManager extends RecyclerView$LayoutManager	// class@000ca2
{
    public static final int a;

    static {
       LiveSquareSideBarUnfoldTabLayoutManager.a = a1.d(0x7f07030a);
    }
    public void LiveSquareSideBarUnfoldTabLayoutManager(){
       super();
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, LiveSquareSideBarUnfoldTabLayoutManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RecyclerView$LayoutParams(-2, -2);
    }
    public boolean isAutoMeasureEnabled(){
       return true;
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       int i5;
       int i6;
       int i7;
       int i8;
       int i10;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidTwoRefs(obj1, p1, obj, LiveSquareSideBarUnfoldTabLayoutManager.class, "2")) {
          return;
       }
       this.detachAndScrapAttachedViews(p0);
       int a = LiveSquareSideBarUnfoldTabLayoutManager.a;
       int i = this.getWidth() - a;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (i1 < this.getItemCount()) {
          View view = obj1.o(i1);
          obj.addView(view);
          obj.measureChildWithMargins(view, 0, 0);
          int decoratedMea = obj.getDecoratedMeasuredWidth(view);
          int decoratedMea1 = obj.getDecoratedMeasuredHeight(view);
          ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
          int i4 = layoutParams.leftMargin + decoratedMea;
          a = a + i4;
          i4 = (!i2)? i - a1.d(0x7f0702fe): i;
          if (a <= i4) {
             ViewGroup$MarginLayoutParams rightMargin = layoutParams.rightMargin;
             i5 = a + rightMargin;
             decoratedMea = i5 - decoratedMea;
             i6 = decoratedMea - rightMargin;
             ViewGroup$MarginLayoutParams topMargin = layoutParams.topMargin;
             i7 = i2 + topMargin;
             i8 = i5 - rightMargin;
             a = i2 + decoratedMea1;
             int i9 = a + topMargin;
             i10 = i6;
             i4 = i7;
             this.layoutDecorated(view, i10, i4, i8, i9);
             decoratedMea1 = decoratedMea1 + layoutParams.bottomMargin;
             decoratedMea1 = decoratedMea1 + layoutParams.topMargin;
             i3 = Math.max(i3, decoratedMea1);
          }else {
             layoutParams.leftMargin = 0;
             a = decoratedMea + 0;
             a = a + layoutParams.rightMargin;
             i4 = LiveSquareSideBarUnfoldTabLayoutManager.a;
             i5 = a + i4;
             if (!i3) {
                a = layoutParams.bottomMargin + decoratedMea1;
                i3 = a + layoutParams.topMargin;
             }
             i2 = i2 + i3;
             i6 = 0 + i4;
             ViewGroup$MarginLayoutParams topMargin1 = layoutParams.topMargin;
             i7 = i2 + topMargin1;
             decoratedMea = decoratedMea + 0;
             i3 = decoratedMea + i4;
             decoratedMea = i2 + decoratedMea1;
             i8 = decoratedMea + topMargin1;
             i10 = i6;
             i4 = i7;
             this.layoutDecorated(view, i10, i4, i3, i8);
             decoratedMea1 = decoratedMea1 + layoutParams.bottomMargin;
             decoratedMea1 = decoratedMea1 + layoutParams.topMargin;
             i3 = decoratedMea1;
          }
          a = i5;
          i1 = i1 + 1;
       }
       return;
    }
}
