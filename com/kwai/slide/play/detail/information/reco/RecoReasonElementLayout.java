package com.kwai.slide.play.detail.information.reco.RecoReasonElementLayout;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.IllegalArgumentException;
import android.view.ViewGroup$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import java.lang.Math;

public class RecoReasonElementLayout extends ViewGroup	// class@0017ff
{
    public int b;
    public int c;

    public void RecoReasonElementLayout(Context p0){
       super(p0);
    }
    public void RecoReasonElementLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void RecoReasonElementLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void addView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoReasonElementLayout.class, "3")) {
          return;
       }
       if (this.getChildCount() > 2) {
          throw new IllegalArgumentException("child count must no more than 2");
       }
       super.addView(p0);
       return;
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecoReasonElementLayout.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ViewGroup$MarginLayoutParams(this.getContext(), p0);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(RecoReasonElementLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, RecoReasonElementLayout.class, "2")) {
             return;
          }
       }
       int paddingLeft = this.getPaddingLeft();
       while (i < this.getChildCount()) {
          View childAt = this.getChildAt(i);
          if (childAt.getVisibility() != 8) {
             ViewGroup$MarginLayoutParams layoutParams = childAt.getLayoutParams();
             paddingLeft = paddingLeft + layoutParams.leftMargin;
             p3 = this.getPaddingTop() + layoutParams.topMargin;
             p4 = childAt.getMeasuredWidth() + paddingLeft;
             int i1 = childAt.getMeasuredHeight() + p3;
             childAt.layout(paddingLeft, p3, p4, i1);
             p4 = p4 + layoutParams.rightMargin;
             paddingLeft = p4;
          }
          i = i + 1;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       View childAt;
       ViewGroup$MarginLayoutParams layoutParams;
       if (PatchProxy.isSupport(RecoReasonElementLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, RecoReasonElementLayout.class, "1")) {
          return;
       }
       int mode = View$MeasureSpec.getMode(p0);
       int size = View$MeasureSpec.getSize(p0);
       int mode1 = View$MeasureSpec.getMode(p1);
       int size1 = View$MeasureSpec.getSize(p1);
       int size2 = View$MeasureSpec.getSize(p0);
       RecoReasonElementLayout tb = this.b;
       if (tb > null && tb < size2) {
          size = tb;
       }
       size2 = View$MeasureSpec.getSize(p1);
       tb = this.c;
       if (tb > null && tb < size2) {
          size1 = tb;
       }
       size2 = this.getPaddingLeft() + this.getPaddingRight();
       int i = this.getPaddingTop() + this.getPaddingBottom();
       int i1 = 0;
       int i2 = 1;
       if (this.getChildCount() == i2) {
          childAt = this.getChildAt(i1);
          layoutParams = childAt.getLayoutParams();
          childAt.measure(ViewGroup.getChildMeasureSpec(p0, (((this.getPaddingLeft() + this.getPaddingRight()) + layoutParams.leftMargin) + layoutParams.rightMargin), layoutParams.width), ViewGroup.getChildMeasureSpec(p1, (((this.getPaddingTop() + this.getPaddingBottom()) + layoutParams.leftMargin) + layoutParams.rightMargin), layoutParams.height));
          size2 = size2 + ((childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin);
          p0 = (childAt.getMeasuredHeight() + layoutParams.topMargin) + layoutParams.bottomMargin;
       }else if(this.getChildCount() == 2){
          childAt = this.getChildAt(i2);
          ViewGroup$MarginLayoutParams layoutParams1 = childAt.getLayoutParams();
          childAt.measure(ViewGroup.getChildMeasureSpec(p0, (((this.getPaddingLeft() + this.getPaddingRight()) + layoutParams1.leftMargin) + layoutParams1.rightMargin), layoutParams1.width), ViewGroup.getChildMeasureSpec(p1, (((this.getPaddingTop() + this.getPaddingBottom()) + layoutParams1.topMargin) + layoutParams1.bottomMargin), layoutParams1.height));
          View childAt1 = this.getChildAt(i1);
          layoutParams = childAt1.getLayoutParams();
          childAt1.measure(View$MeasureSpec.makeMeasureSpec((((((size - childAt1.getMeasuredWidth()) - layoutParams1.leftMargin) - layoutParams1.rightMargin) - layoutParams.leftMargin) - layoutParams.rightMargin), Integer.MIN_VALUE), ViewGroup.getChildMeasureSpec(p1, (((this.getPaddingTop() + this.getPaddingBottom()) + layoutParams.topMargin) + layoutParams.bottomMargin), layoutParams.height));
          size2 = size2 + (((((childAt1.getMeasuredWidth() + childAt.getMeasuredWidth()) + layoutParams.leftMargin) + layoutParams.rightMargin) + layoutParams1.leftMargin) + layoutParams1.rightMargin);
          p1 = childAt.getMeasuredHeight();
          childAt1 = Math.max(((childAt1.getMeasuredHeight() + layoutParams.topMargin) + layoutParams.bottomMargin), ((p1 + layoutParams1.topMargin) + layoutParams1.bottomMargin));
       }else if(mode == 0x40000000){
          size = size2;
       }
       if (mode1 != 0x40000000) {
          size1 = i;
       }
       this.setMeasuredDimension(size, size1);
       return;
       i = i + p0;
       goto label_0152 ;
    }
    public void setMaxHeight(int p0){
       this.c = p0;
    }
    public void setMaxWidth(int p0){
       this.b = p0;
    }
}
