package com.yxcorp.gifshow.music.ReverseMeasureLayout;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.View;
import android.view.View$MeasureSpec;
import java.lang.Math;

public class ReverseMeasureLayout extends ViewGroup	// class@001fd5
{

    public void ReverseMeasureLayout(Context p0){
       super(p0, null);
    }
    public void ReverseMeasureLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ReverseMeasureLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, ReverseMeasureLayout.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ViewGroup$MarginLayoutParams(-2, -2);
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReverseMeasureLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ViewGroup$MarginLayoutParams(this.getContext(), p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReverseMeasureLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ViewGroup$MarginLayoutParams(p0);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(ReverseMeasureLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ReverseMeasureLayout.class, "5")) {
             return;
          }
       }
       p3 = p3 - p1;
       int i1 = 0;
       while (i < this.getChildCount() && i1 <= p3) {
          View childAt = this.getChildAt(i);
          if (childAt.getVisibility() != 8 && childAt.getMeasuredWidth() >= 0) {
             ViewGroup$MarginLayoutParams layoutParams = childAt.getLayoutParams();
             int i2 = p4 - p2;
             i2 = i2 - childAt.getMeasuredHeight();
             i2 = i2 / 2;
             i2 = i2 + layoutParams.topMargin;
             int i3 = childAt.getMeasuredHeight() + i2;
             i1 = i1 + layoutParams.leftMargin;
             int i4 = childAt.getMeasuredWidth() + i1;
             i4 = i4 + layoutParams.rightMargin;
             childAt.layout(i1, i2, i4, i3);
             i1 = i4;
          }
          i = i + 1;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ReverseMeasureLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ReverseMeasureLayout.class, "4")) {
          return;
       }
       int size = View$MeasureSpec.getSize(p0);
       int mode = View$MeasureSpec.getMode(p0);
       int i = this.getChildCount() - 1;
       int i1 = 0;
       int i2 = size;
       int i3 = 0;
       while (i >= 0 && i2 >= 0) {
          View childAt = this.getChildAt(i);
          if (childAt.getVisibility() != 8) {
             ViewGroup$MarginLayoutParams layoutParams = childAt.getLayoutParams();
             int i4 = layoutParams.leftMargin + layoutParams.rightMargin;
             int childMeasure = ViewGroup.getChildMeasureSpec(View$MeasureSpec.makeMeasureSpec(i2, mode), i4, layoutParams.width);
             i4 = layoutParams.topMargin + layoutParams.bottomMargin;
             childAt.measure(childMeasure, ViewGroup.getChildMeasureSpec(p1, i4, layoutParams.height));
             childMeasure = childAt.getMeasuredWidth() + layoutParams.leftMargin;
             childMeasure = childMeasure + layoutParams.rightMargin;
             i2 = i2 - childMeasure;
             childMeasure = childAt.getMeasuredHeight() + layoutParams.topMargin;
             childMeasure = childMeasure + layoutParams.bottomMargin;
             i1 = Math.max(i1, childMeasure);
             i3 = ViewGroup.combineMeasuredStates(i3, childAt.getMeasuredState());
          }
          i = i - 1;
       }
       this.setMeasuredDimension(ViewGroup.resolveSizeAndState(size, p0, i3), ViewGroup.resolveSizeAndState(Math.max(i1, this.getSuggestedMinimumHeight()), p1, (i3 << 16)));
       return;
    }
}
