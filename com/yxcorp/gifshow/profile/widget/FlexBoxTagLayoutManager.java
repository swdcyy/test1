package com.yxcorp.gifshow.profile.widget.FlexBoxTagLayoutManager;
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
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import java.lang.Math;

public class FlexBoxTagLayoutManager extends RecyclerView$LayoutManager	// class@0015f1
{

    public void FlexBoxTagLayoutManager(){
       super();
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, FlexBoxTagLayoutManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RecyclerView$LayoutParams(-2, -2);
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       int i5;
       int i6;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidTwoRefs(obj1, p1, obj, FlexBoxTagLayoutManager.class, "2")) {
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
          int i4 = i + decoratedMea;
          ViewGroup$LayoutParams layoutParams = (i4 > width)? 1: null;
          if (layoutParams) {
             i5 = width - i;
             if (i5 < a1.e(100.00f)) {
                if (!i2) {
                   i2 = decoratedMea1;
                }
                i3 = i3 + i2;
                i6 = i3 + decoratedMea1;
                this.layoutDecorated(view, 0, i3, decoratedMea, i6);
                i = decoratedMea;
                i2 = decoratedMea1;
             label_0079 :
                i1 = i1 + 1;
             }
          }
          if (layoutParams) {
             layoutParams = view.getLayoutParams();
             i5 = width - i;
             layoutParams.width = i5;
             view.setLayoutParams(layoutParams);
          }
          i6 = i3 + decoratedMea1;
          this.layoutDecorated(view, i, i3, Math.min(i4, width), i6);
          i2 = Math.max(i2, decoratedMea1);
          i = i4;
          goto label_0079 ;
       }
       return;
    }
}
