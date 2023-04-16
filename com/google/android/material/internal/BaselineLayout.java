package com.google.android.material.internal.BaselineLayout;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Math;

public class BaselineLayout extends ViewGroup	// class@001698
{
    public int b;

    public void BaselineLayout(Context p0){
       super(p0, null, 0);
       this.b = -1;
    }
    public void BaselineLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
       this.b = -1;
    }
    public void BaselineLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = -1;
    }
    public int getBaseline(){
       return this.b;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i2;
       int childCount = this.getChildCount();
       p2 = this.getPaddingLeft();
       p3 = ((p3 - p1) - this.getPaddingRight()) - p2;
       p1 = this.getPaddingTop();
       p4 = 0;
       while (p4 < childCount) {
          View childAt = this.getChildAt(p4);
          if (childAt.getVisibility() != 8) {
             int measuredWidt = childAt.getMeasuredWidth();
             int measuredHeig = childAt.getMeasuredHeight();
             int i = p3 - measuredWidt;
             i = i / 2;
             i = i + p2;
             int i1 = -1;
             if (this.b != i1 && childAt.getBaseline() != i1) {
                i2 = this.b + p1;
                i2 = i2 - childAt.getBaseline();
             }else {
                i2 = p1;
             }
             measuredWidt = measuredWidt + i;
             measuredHeig = measuredHeig + i2;
             childAt.layout(i, i2, measuredWidt, measuredHeig);
          }
          p4++;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       int childCount = this.getChildCount();
       int i = -1;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       int i5 = -1;
       int i6 = -1;
       while (i1 < childCount) {
          View childAt = this.getChildAt(i1);
          if (childAt.getVisibility() != 8) {
             this.measureChild(childAt, p0, p1);
             int baseline = childAt.getBaseline();
             if (baseline != i) {
                i5 = Math.max(i5, baseline);
                int i7 = childAt.getMeasuredHeight() - baseline;
                i6 = Math.max(i6, i7);
             }
             i3 = Math.max(i3, childAt.getMeasuredWidth());
             i2 = Math.max(i2, childAt.getMeasuredHeight());
             i4 = View.combineMeasuredStates(i4, childAt.getMeasuredState());
          }
          i1 = i1 + 1;
       }
       if (i5 != i) {
          i2 = Math.max(i2, (Math.max(i6, this.getPaddingBottom()) + i5));
          this.b = i5;
       }
       this.setMeasuredDimension(View.resolveSizeAndState(Math.max(i3, this.getSuggestedMinimumWidth()), p0, i4), View.resolveSizeAndState(Math.max(i2, this.getSuggestedMinimumHeight()), p1, (i4 << 16)));
       return;
    }
}
