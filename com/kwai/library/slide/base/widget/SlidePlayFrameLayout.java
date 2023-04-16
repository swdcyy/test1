package com.kwai.library.slide.base.widget.SlidePlayFrameLayout;
import android.widget.FrameLayout;
import com.kwai.library.slide.base.widget.SlidePlayFrameLayout$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View$MeasureSpec;
import java.lang.Math;
import android.view.View;
import bz6.c;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import java.lang.Boolean;
import java.lang.UnsupportedOperationException;

public class SlidePlayFrameLayout extends FrameLayout	// class@0008f0
{
    public final ArrayList b;
    public static final SlidePlayFrameLayout$a c;

    static {
       SlidePlayFrameLayout.c = new SlidePlayFrameLayout$a(null);
    }
    public void SlidePlayFrameLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void SlidePlayFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void SlidePlayFrameLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = new ArrayList(1);
    }
    public void SlidePlayFrameLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final int a(int p0,int p1,int p2){
       if (PatchProxy.isSupport(SlidePlayFrameLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, SlidePlayFrameLayout.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p2 = FrameLayout.getChildMeasureSpec(p0, p1, p2);
       int size = View$MeasureSpec.getSize(p2);
       int mode = View$MeasureSpec.getMode(p2);
       int size1 = View$MeasureSpec.getSize(p0);
       if (View$MeasureSpec.getMode(p0) && (size1 > 0 && mode)) {
          size1 = size1 - p1;
          if (size > size1) {
             p2 = View$MeasureSpec.makeMeasureSpec(Math.min(size1, size), mode);
          }
       }
       return p2;
    }
    public void addView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayFrameLayout.class, "1")) {
          return;
       }
       c a = c.a;
       ViewGroup$LayoutParams layoutParams = (p0 != null)? p0.getLayoutParams(): null;
       a.a(this, layoutParams);
       super.addView(p0);
       return;
    }
    public void addView(View p0,int p1){
       if (PatchProxy.isSupport(SlidePlayFrameLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, SlidePlayFrameLayout.class, "2")) {
          return;
       }
       c a = c.a;
       ViewGroup$LayoutParams layoutParams = (p0 != null)? p0.getLayoutParams(): null;
       a.a(this, layoutParams);
       super.addView(p0, p1);
       return;
    }
    public void addView(View p0,int p1,int p2){
       if (PatchProxy.isSupport(SlidePlayFrameLayout.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, SlidePlayFrameLayout.class, "3")) {
          return;
       }
       c a = c.a;
       ViewGroup$LayoutParams layoutParams = (p0 != null)? p0.getLayoutParams(): null;
       a.a(this, layoutParams);
       super.addView(p0, p1, p2);
       return;
    }
    public void addView(View p0,ViewGroup$LayoutParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayFrameLayout.class, "4")) {
          return;
       }
       c.a.a(this, p1);
       super.addView(p0, p1);
       return;
    }
    public void measureChildWithMargins(View p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(SlidePlayFrameLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SlidePlayFrameLayout.class, "8")) {
             return;
          }
       }
       a.p(p0, "child");
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       p0.measure(this.a(p1, ((((this.getPaddingLeft() + this.getPaddingRight()) + layoutParams.leftMargin) + layoutParams.rightMargin) + p2), layoutParams.width), this.a(p3, ((((this.getPaddingTop() + this.getPaddingBottom()) + layoutParams.topMargin) + layoutParams.bottomMargin) + p4), layoutParams.height));
       return;
    }
    public void onMeasure(int p0,int p1){
       View view;
       ViewGroup$LayoutParams this;
       int i7;
       int i8;
       int i11;
       int i12;
       Object obj = this;
       int i = p0;
       int i1 = p1;
       if (PatchProxy.isSupport(SlidePlayFrameLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), obj, SlidePlayFrameLayout.class, "6")) {
          return;
       }
       View$MeasureSpec.toString(p0);
       View$MeasureSpec.toString(p1);
       int childCount = this.getChildCount();
       int i2 = 0x40000000;
       int i3 = (View$MeasureSpec.getMode(p0) != i2 || View$MeasureSpec.getMode(p1) != i2)? 1: 0;
       obj.b.clear();
       String str = null;
       int i4 = 0;
       int i5 = 0;
       int i6 = 0;
       while (i5 < childCount) {
          View childAt = obj.getChildAt(i5);
          a.o(childAt, "child");
          if (childAt.getVisibility() != 8) {
             view = childAt;
             i2 = -1;
             this.measureChildWithMargins(childAt, p0, 0, p1, 0);
             this = view.getLayoutParams();
             Objects.requireNonNull(this, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
             i7 = view.getMeasuredWidth() + this.leftMargin;
             i7 = i7 + this.rightMargin;
             i6 = Math.max(i6, i7);
             i7 = view.getMeasuredHeight() + this.topMargin;
             i7 = i7 + this.bottomMargin;
             i4 = Math.max(i4, i7);
             str = FrameLayout.combineMeasuredStates(str, view.getMeasuredState());
             if (i3 && (this.width == i2 || this.height == i2)) {
                obj.b.add(view);
             }
          }else {
             i8 = i4;
          }
          i5 = i5 + 1;
          i2 = 0x40000000;
       }
       int i9 = str;
       int i10 = Math.max((i4 + (this.getPaddingTop() + this.getPaddingBottom())), this.getSuggestedMinimumHeight());
       i7 = Math.max((i6 + (this.getPaddingLeft() + this.getPaddingRight())), this.getSuggestedMinimumWidth());
       Drawable foreground = this.getForeground();
       if (foreground != null) {
          i10 = Math.max(i10, foreground.getMinimumHeight());
          i7 = Math.max(i7, foreground.getMinimumWidth());
       }
       obj.setMeasuredDimension(FrameLayout.resolveSizeAndState(i7, i, i9), FrameLayout.resolveSizeAndState(i10, i1, (i9 << 16)));
       i10 = obj.b.size();
       if (i10 > 1) {
          for (i7 = 0; i7 < i10; i7 = i7 + 1) {
             Object obj1 = obj.b.get(i7);
             a.o(obj1, "mMatchParentChildren.get\(i\)");
             ViewGroup$LayoutParams layoutParams = obj1.getLayoutParams();
             Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             if (layoutParams.width == -1) {
                i11 = this.getMeasuredWidth() - this.getPaddingLeft();
                i11 = i11 - this.getPaddingRight();
                i11 = i11 - layoutParams.leftMargin;
                i11 = i11 - layoutParams.rightMargin;
                i11 = View$MeasureSpec.makeMeasureSpec(Math.max(0, i11), 0x40000000);
             }else {
                i11 = this.getPaddingLeft() + this.getPaddingRight();
                i11 = i11 + layoutParams.leftMargin;
                i11 = i11 + layoutParams.rightMargin;
                i11 = obj.a(i, i11, layoutParams.width);
             }
             if (layoutParams.height == -1) {
                i4 = this.getMeasuredHeight() - this.getPaddingTop();
                i4 = i4 - this.getPaddingBottom();
                i4 = i4 - layoutParams.topMargin;
                i4 = i4 - layoutParams.bottomMargin;
                i12 = Math.max(0, i4);
                i12 = View$MeasureSpec.makeMeasureSpec(i12, 0x40000000);
             }else {
                i8 = this.getPaddingTop() + this.getPaddingBottom();
                i8 = i8 + layoutParams.topMargin;
                i8 = i8 + layoutParams.bottomMargin;
                i12 = obj.a(i1, i8, layoutParams.height);
             }
             obj1.measure(i11, i12);
          }
       }
       return;
    }
    public void setMeasureAllChildren(boolean p0){
       if (PatchProxy.isSupport(SlidePlayFrameLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SlidePlayFrameLayout.class, "5")) {
          return;
       }
       throw new UnsupportedOperationException();
    }
}
