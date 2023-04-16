package com.yxcorp.gifshow.widget.FlexBoxLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
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

public class FlexBoxLayoutManager extends RecyclerView$LayoutManager	// class@00184d
{

    public void FlexBoxLayoutManager(){
       super();
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, FlexBoxLayoutManager.class, "1");
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
       int i6;
       int i7;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidTwoRefs(obj1, p1, obj, FlexBoxLayoutManager.class, "2")) {
          return;
       }
       this.detachAndScrapAttachedViews(p0);
       int width = this.getWidth();
       int i = 0;
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
          ViewGroup$MarginLayoutParams leftMargin = layoutParams.leftMargin;
          int i4 = decoratedMea + leftMargin;
          ViewGroup$MarginLayoutParams rightMargin = layoutParams.rightMargin;
          i4 = i4 + rightMargin;
          int i5 = i + i4;
          if (i5 <= width) {
             i = i5 - decoratedMea;
             decoratedMea = i - rightMargin;
             topMargin = layoutParams.topMargin;
             i6 = i3 + topMargin;
             i4 = i5 - rightMargin;
             i7 = i3 + decoratedMea1;
             i7 = i7 + topMargin;
             this.layoutDecorated(view, decoratedMea, i6, i4, i7);
             decoratedMea1 = decoratedMea1 + layoutParams.bottomMargin;
             decoratedMea1 = decoratedMea1 + layoutParams.topMargin;
             i2 = Math.max(i2, decoratedMea1);
          }else {
             i = decoratedMea + leftMargin;
             i5 = i + rightMargin;
             if (!i2) {
                i = layoutParams.bottomMargin + decoratedMea1;
                i2 = i + layoutParams.topMargin;
             }
             i3 = i3 + i2;
             topMargin = layoutParams.topMargin;
             i4 = i3 + topMargin;
             i7 = decoratedMea + leftMargin;
             decoratedMea = i3 + decoratedMea1;
             i2 = decoratedMea + topMargin;
             i6 = i4;
             i4 = i7;
             this.layoutDecorated(view, leftMargin, i6, i4, i2);
             decoratedMea1 = decoratedMea1 + layoutParams.bottomMargin;
             decoratedMea1 = decoratedMea1 + layoutParams.topMargin;
             i2 = decoratedMea1;
          }
          i = i5;
          i1 = i1 + 1;
       }
       return;
    }
}
