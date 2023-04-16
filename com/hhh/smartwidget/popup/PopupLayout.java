package com.hhh.smartwidget.popup.PopupLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.RuntimeException;
import java.lang.String;

public class PopupLayout extends LinearLayout	// class@000592
{
    public int b;
    public int c;
    public int d;

    public void PopupLayout(Context p0){
       super(p0);
       this.c = Integer.MAX_VALUE;
       this.d = Integer.MAX_VALUE;
       this.a(p0, null, 0);
    }
    public void PopupLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = Integer.MAX_VALUE;
       this.d = Integer.MAX_VALUE;
       this.a(p0, p1, 0);
    }
    public void PopupLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = Integer.MAX_VALUE;
       this.d = Integer.MAX_VALUE;
       this.a(p0, p1, p2);
    }
    public final void a(Context p0,AttributeSet p1,int p2){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Y3, p2, 0);
       this.b = typedArray.getResourceId(2, 0);
       this.c = typedArray.getDimensionPixelSize(1, Integer.MAX_VALUE);
       this.d = typedArray.getDimensionPixelSize(0, Integer.MAX_VALUE);
       typedArray.recycle();
    }
    public void onMeasure(int p0,int p1){
       int mode;
       int childCount;
       int i3;
       int i4;
       View childAt;
       ViewGroup$MarginLayoutParams this;
       PopupLayout popupLayout = this;
       int size = View$MeasureSpec.getSize(p0);
       PopupLayout d = popupLayout.d;
       if (size > d) {
          size = d;
       }
       int size1 = View$MeasureSpec.getSize(p1);
       PopupLayout c = popupLayout.c;
       if (size1 > c) {
          size1 = c;
       }
       int i = View$MeasureSpec.makeMeasureSpec(size, View$MeasureSpec.getMode(p0));
       int i1 = View$MeasureSpec.makeMeasureSpec(size1, View$MeasureSpec.getMode(p1));
       if (popupLayout.b == null) {
          super.onMeasure(i, i1);
       }else {
          int i2 = 0;
          if (!this.getOrientation()) {
             mode = View$MeasureSpec.getMode(i);
             i = View$MeasureSpec.getSize(i);
             childCount = this.getChildCount();
             i3 = (i - this.getPaddingLeft()) - this.getPaddingRight();
             View view = i2;
             i4 = 0;
             while (i4 < childCount) {
                childAt = popupLayout.getChildAt(i4);
                if (childAt.getId() == popupLayout.b) {
                   view = childAt;
                }else if(childAt.getVisibility() != 8){
                   this.measureChildWithMargins(childAt, View$MeasureSpec.makeMeasureSpec(i3, mode), 0, i1, 0);
                   this = childAt.getLayoutParams();
                   size1 = childAt.getMeasuredWidth() + this.leftMargin;
                   size1 = size1 + this.rightMargin;
                   i3 = i3 - size1;
                }
                i4 = i4 + 1;
             }
             if (view != null) {
                if (view.getVisibility() != 8) {
                   this.measureChildWithMargins(view, View$MeasureSpec.makeMeasureSpec(i3, mode), 0, i1, 0);
                   this = view.getLayoutParams();
                   i3 = i3 - ((view.getMeasuredWidth() + this.leftMargin) + this.rightMargin);
                }
                popupLayout.setMeasuredDimension(View$MeasureSpec.makeMeasureSpec((i - i3), mode), i1);
             }else {
                throw new RuntimeException("PopupLayout_delay_measure_id is invalid!!!");
             }
          }else {
             mode = View$MeasureSpec.getMode(i1);
             i1 = View$MeasureSpec.getSize(i1);
             childCount = this.getChildCount();
             i3 = (i1 - this.getPaddingTop()) - this.getPaddingBottom();
             int i5 = i2;
             i4 = 0;
             while (i4 < childCount) {
                childAt = popupLayout.getChildAt(i4);
                if (childAt.getId() == popupLayout.b) {
                   i5 = childAt;
                }else if(childAt.getVisibility() != 8){
                   this.measureChildWithMargins(childAt, i, 0, View$MeasureSpec.makeMeasureSpec(i3, mode), 0);
                   this = childAt.getLayoutParams();
                   size1 = childAt.getMeasuredHeight() + this.topMargin;
                   size1 = size1 + this.bottomMargin;
                   i3 = i3 - size1;
                }
                i4 = i4 + 1;
             }
             if (i5 != null) {
                if (i5.getVisibility() != 8) {
                   this.measureChildWithMargins(i5, i, 0, View$MeasureSpec.makeMeasureSpec(i3, mode), 0);
                   this = i5.getLayoutParams();
                   i3 = i3 - ((i5.getMeasuredHeight() + this.topMargin) + this.bottomMargin);
                }
                popupLayout.setMeasuredDimension(i, View$MeasureSpec.makeMeasureSpec((i1 - i3), mode));
             }else {
                throw new RuntimeException("PopupLayout_delay_measure_id is invalid!!!");
             }
          }
       }
       return;
    }
}
