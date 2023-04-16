package com.kuaishou.merchant.home.basic.widget.ImageTextViewGroup;
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
import java.lang.Math;
import java.lang.Number;
import android.view.View$MeasureSpec;

public class ImageTextViewGroup extends ViewGroup	// class@0016d5
{
    public int b;

    public void ImageTextViewGroup(Context p0){
       super(p0);
    }
    public void ImageTextViewGroup(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, ImageTextViewGroup.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ViewGroup$MarginLayoutParams(-2, -2);
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       ViewGroup$MarginLayoutParams marginLayout = PatchProxy.applyOneRefs(p0, this, ImageTextViewGroup.class, "1");
       if (marginLayout != PatchProxyResult.class) {
       }else {
          marginLayout = new ViewGroup$MarginLayoutParams(this.getContext(), p0);
       }
       return marginLayout;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ImageTextViewGroup.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ImageTextViewGroup.class, "5")) {
             return;
          }
       }
       p3 = p3 - p1;
       p4 = ((p4 - p2) - this.getPaddingBottom()) - this.getPaddingTop();
       int childCount = this.getChildCount();
       p2 = 0;
       for (p1 = 0; p1 < childCount; p1++) {
          p2 = Math.max(p2, this.getChildAt(p1).getMeasuredWidth());
       }
       ImageTextViewGroup tb = this.b;
       p3 = p3 - (tb << 1);
       int i = p3 / childCount;
       if (p2 > i) {
          p2 = i;
       }
       p3 = (p3 - (childCount * p2)) / (childCount - 1);
       for (i = 0; i < childCount; i = i + 1) {
          int i1 = tb + p2;
          this.getChildAt(i).layout(tb, 0, i1, p4);
          int i2 = p2 + p3;
          tb = tb + i2;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       int i;
       int i1;
       if (PatchProxy.isSupport(ImageTextViewGroup.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ImageTextViewGroup.class, "3")) {
          return;
       }
       if (PatchProxy.isSupport(ImageTextViewGroup.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ImageTextViewGroup.class, "4");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
          label_003a :
             i1 = View$MeasureSpec.getSize(p0) - (this.b << 1);
             i = (View$MeasureSpec.getMode(p0))? View$MeasureSpec.makeMeasureSpec((i1 / this.getChildCount()), Integer.MIN_VALUE): p0;
          }
       }else {
          goto label_003a ;
       }
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       for (i1 = 0; i1 < this.getChildCount(); i1 = i1 + 1) {
          View childAt = this.getChildAt(i1);
          int i5 = this.getPaddingTop() + this.getPaddingBottom();
          childAt.measure(i, ViewGroup.getChildMeasureSpec(p1, i5, childAt.getLayoutParams().height));
          i3 = ViewGroup.combineMeasuredStates(i3, childAt.getMeasuredState());
          i2 = i2 + childAt.getMeasuredWidth();
          i4 = Math.max(i4, childAt.getMeasuredHeight());
       }
       this.setMeasuredDimension(ViewGroup.resolveSizeAndState(i2, p0, i3), ViewGroup.resolveSizeAndState(i4, p1, i3));
       return;
    }
    public void setHorizontalPadding(int p0){
       this.b = p0;
    }
}
