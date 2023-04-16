package com.google.android.material.internal.FlowLayout;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Math;
import android.content.res.Resources$Theme;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View;
import a2.i0;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import a2.o;
import android.view.View$MeasureSpec;

public class FlowLayout extends ViewGroup	// class@00169b
{
    public int b;
    public int c;
    public boolean d;

    public void FlowLayout(Context p0){
       super(p0, null);
    }
    public void FlowLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void FlowLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = false;
       this.c(p0, p1);
    }
    public static int a(int p0,int p1,int p2){
       if (p1 == Integer.MIN_VALUE) {
          return Math.min(p2, p0);
       }
       if (p1 != 0x40000000) {
          return p2;
       }
       return p0;
    }
    public boolean b(){
       return this.d;
    }
    public final void c(Context p0,AttributeSet p1){
       TypedArray typedArray = p0.getTheme().obtainStyledAttributes(p1, c$b.N0, 0, 0);
       this.b = typedArray.getDimensionPixelSize(9, 0);
       this.c = typedArray.getDimensionPixelSize(8, 0);
       typedArray.recycle();
    }
    public int getItemSpacing(){
       return this.c;
    }
    public int getLineSpacing(){
       return this.b;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i1;
       int i2;
       if (!this.getChildCount()) {
          return;
       }
       p2 = 1;
       if (i0.B(this) != p2) {
          p2 = 0;
       }
       int paddingRight = (p2)? this.getPaddingRight(): this.getPaddingLeft();
       int paddingLeft = (p2)? this.getPaddingLeft(): this.getPaddingRight();
       int paddingTop = this.getPaddingTop();
       p3 = (p3 - p1) - paddingLeft;
       int i = paddingRight;
       p1 = paddingTop;
       paddingLeft = 0;
       while (paddingLeft < this.getChildCount()) {
          View childAt = this.getChildAt(paddingLeft);
          if (childAt.getVisibility() != 8) {
             ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
             if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                i1 = o.b(layoutParams);
                i2 = o.a(layoutParams);
             }else {
                i2 = 0;
                i1 = 0;
             }
             int i3 = i + i1;
             i3 = i3 + childAt.getMeasuredWidth();
             if (this.d == null && i3 > p3) {
                p1 = this.b + paddingTop;
                i = paddingRight;
             }
             paddingTop = i + i1;
             i3 = childAt.getMeasuredWidth() + paddingTop;
             int i4 = childAt.getMeasuredHeight() + p1;
             if (p2) {
                paddingTop = p3 - i3;
                i3 = p3 - i;
                i3 = i3 - i1;
                childAt.layout(paddingTop, p1, i3, i4);
             }else {
                childAt.layout(paddingTop, p1, i3, i4);
             }
             i1 = i1 + i2;
             i1 = i1 + childAt.getMeasuredWidth();
             i1 = i1 + this.c;
             i = i + i1;
             paddingTop = i4;
          }
          paddingLeft = paddingLeft + 1;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       int i5;
       int i6;
       ViewGroup viewGroup = this;
       int size = View$MeasureSpec.getSize(p0);
       int mode = View$MeasureSpec.getMode(p0);
       int size1 = View$MeasureSpec.getSize(p1);
       int mode1 = View$MeasureSpec.getMode(p1);
       int i = (mode == Integer.MIN_VALUE || mode == 0x40000000)? size: Integer.MAX_VALUE;
       int paddingLeft = this.getPaddingLeft();
       int paddingTop = this.getPaddingTop();
       i = i - this.getPaddingRight();
       int i1 = paddingTop;
       int i2 = 0;
       int i3 = 0;
       while (i2 < this.getChildCount()) {
          View childAt = viewGroup.getChildAt(i2);
          if (childAt.getVisibility() == 8) {
             int i4 = 0;
          }else {
             viewGroup.measureChild(childAt, p0, p1);
             ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
             if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                i5 = layoutParams.leftMargin + 0;
                i6 = layoutParams.rightMargin + 0;
             }else {
                i5 = 0;
                i6 = 0;
             }
             int i7 = paddingLeft + i5;
             int i8 = paddingLeft;
             paddingLeft = i7 + childAt.getMeasuredWidth();
             if (paddingLeft > i && !this.b()) {
                paddingLeft = this.getPaddingLeft();
                i1 = viewGroup.b + paddingTop;
             }else {
                paddingLeft = i8;
             }
             paddingTop = paddingLeft + i5;
             paddingTop = paddingTop + childAt.getMeasuredWidth();
             i7 = i1 + childAt.getMeasuredHeight();
             if (paddingTop > i3) {
                i3 = paddingTop;
             }
             i5 = i5 + i6;
             i5 = i5 + childAt.getMeasuredWidth();
             i5 = i5 + viewGroup.c;
             paddingLeft = paddingLeft + i5;
             paddingTop = i7;
          }
          i2 = i2 + 1;
       }
       viewGroup.setMeasuredDimension(FlowLayout.a(size, mode, i3), FlowLayout.a(size1, mode1, paddingTop));
       return;
    }
    public void setItemSpacing(int p0){
       this.c = p0;
    }
    public void setLineSpacing(int p0){
       this.b = p0;
    }
    public void setSingleLine(boolean p0){
       this.d = p0;
    }
}
