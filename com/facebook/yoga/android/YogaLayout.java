package com.facebook.yoga.android.YogaLayout;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import lg.g;
import lg.h;
import java.util.HashMap;
import java.lang.Object;
import com.facebook.yoga.android.YogaLayout$a;
import lg.e;
import com.facebook.yoga.android.YogaLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.res.Resources;
import android.content.res.Configuration;
import com.facebook.yoga.YogaDirection;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import com.facebook.yoga.YogaEdge;
import android.util.SparseArray;
import java.lang.Float;
import java.lang.Math;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import java.lang.String;
import java.util.Map;
import com.facebook.yoga.android.VirtualYogaLayout;
import android.view.View$MeasureSpec;
import android.view.ViewParent;

public class YogaLayout extends ViewGroup	// class@001466
{
    public final Map b;
    public final g c;

    public void YogaLayout(Context p0){
       super(p0, null, 0);
    }
    public void YogaLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void YogaLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       g og = h.a();
       this.c = og;
       this.b = new HashMap();
       og.h0(this);
       og.D0(new YogaLayout$a());
       YogaLayout$LayoutParams layoutParams = (p1 != null)? new YogaLayout$LayoutParams(p0, p1): this.generateDefaultLayoutParams();
       YogaLayout.b(layoutParams, og, this);
       return;
    }
    public static void b(YogaLayout$LayoutParams p0,g p1,View p2){
       YogaLayout$LayoutParams layoutParams = p0;
       g og = p1;
       int i = 1;
       if (p2.getResources().getConfiguration().getLayoutDirection() == i) {
          og.i0(YogaDirection.RTL);
       }
       Drawable background = p2.getBackground();
       if (background != null) {
          Rect rect = new Rect();
          if (background.getPadding(rect)) {
             og.J0(YogaEdge.LEFT, (float)rect.left);
             og.J0(YogaEdge.TOP, (float)rect.top);
             og.J0(YogaEdge.RIGHT, (float)rect.right);
             og.J0(YogaEdge.BOTTOM, (float)rect.bottom);
          }
       }
       int i1 = 0;
       int i2 = 16;
       int i3 = 30;
       while (i1 < layoutParams.a.size()) {
          int i4 = layoutParams.a.keyAt(i1);
          float f = layoutParams.a.valueAt(i1).floatValue();
          if (!i4) {
             og.b0(YogaAlign.fromInt(Math.round(f)));
          }else if(i4 == i){
             og.c0(YogaAlign.fromInt(Math.round(f)));
          }else if(i4 == 2){
             og.d0(YogaAlign.fromInt(Math.round(f)));
          }else if(i4 == 3){
             og.e0(f);
          }else if(i4 == 8){
             og.g0(YogaEdge.LEFT, f);
          }else if(i4 == 11){
             og.g0(YogaEdge.TOP, f);
          }else if(i4 == 9){
             og.g0(YogaEdge.RIGHT, f);
          }else if(i4 == 5){
             og.g0(YogaEdge.BOTTOM, f);
          }else if(i4 == 10){
             og.g0(YogaEdge.START, f);
          }else if(i4 == 6){
             og.g0(YogaEdge.END, f);
          }else if(i4 == 7){
             og.g0(YogaEdge.HORIZONTAL, f);
          }else if(i4 == 12){
             og.g0(YogaEdge.VERTICAL, f);
          }else if(i4 == 4){
             og.g0(YogaEdge.ALL, f);
          }else if(i4 == 13){
             og.i0(YogaDirection.fromInt(Math.round(f)));
          }else if(i4 == 14){
             og.j0(YogaDisplay.fromInt(Math.round(f)));
          }else if(i4 == 15){
             og.k0(f);
          }else if(i4 == i2){
             og.l0(f);
          }else if(i4 == 17){
             og.o0(YogaFlexDirection.fromInt(Math.round(f)));
          }else if(i4 == 18){
             og.p0(f);
          }else if(i4 == 19){
             og.q0(f);
          }else if(i4 == 20){
             og.r0(f);
          }else if(i4 == 26){
             og.w0(YogaEdge.LEFT, f);
          }else if(i4 == 21){
             og.v0(YogaJustify.fromInt(Math.round(f)));
          }else if(i4 == 29){
             og.w0(YogaEdge.TOP, f);
          }else if(i4 == 27){
             og.w0(YogaEdge.RIGHT, f);
          }else if(i4 == 23){
             og.w0(YogaEdge.BOTTOM, f);
          }else if(i4 == 28){
             og.w0(YogaEdge.START, f);
          }else if(i4 == 24){
             og.w0(YogaEdge.END, f);
          }else if(i4 == 25){
             og.w0(YogaEdge.HORIZONTAL, f);
          }else if(i4 == i3){
             og.w0(YogaEdge.VERTICAL, f);
          }else if(i4 == 22){
             og.w0(YogaEdge.ALL, f);
          }else if(i4 == 31){
             og.z0(f);
          }else if(i4 == 32){
             og.B0(f);
          }else if(i4 == 33){
             og.E0(f);
          }else if(i4 == 34){
             og.G0(f);
          }else if(i4 == 35){
             og.I0(YogaOverflow.fromInt(Math.round(f)));
          }else if(i4 == 40){
             og.J0(YogaEdge.LEFT, f);
          }else if(i4 == 43){
             og.J0(YogaEdge.TOP, f);
          }else if(i4 == 41){
             og.J0(YogaEdge.RIGHT, f);
          }else if(i4 == 37){
             og.J0(YogaEdge.BOTTOM, f);
          }else if(i4 == 42){
             og.J0(YogaEdge.START, f);
          }else if(i4 == 38){
             og.J0(YogaEdge.END, f);
          }else if(i4 == 39){
             og.J0(YogaEdge.HORIZONTAL, f);
          }else if(i4 == 44){
             og.J0(YogaEdge.VERTICAL, f);
          }else if(i4 == 36){
             og.J0(YogaEdge.ALL, f);
          }else if(i4 == 49){
             og.L0(YogaEdge.LEFT, f);
          }else if(i4 == 52){
             og.L0(YogaEdge.TOP, f);
          }else if(i4 == 50){
             og.L0(YogaEdge.RIGHT, f);
          }else if(i4 == 46){
             og.L0(YogaEdge.BOTTOM, f);
          }else if(i4 == 51){
             og.L0(YogaEdge.START, f);
          }else if(i4 == 47){
             og.L0(YogaEdge.END, f);
          }else if(i4 == 48){
             og.L0(YogaEdge.HORIZONTAL, f);
          }else if(i4 == 54){
             og.L0(YogaEdge.VERTICAL, f);
          }else if(i4 == 45){
             og.L0(YogaEdge.ALL, f);
          }else if(i4 == 53){
             og.N0(YogaPositionType.fromInt(Math.round(f)));
          }else if(i4 == 55){
             og.O0(f);
          }else if(i4 == 56){
             og.R0(YogaWrap.fromInt(Math.round(f)));
          }
          i1 = i1 + 1;
          i = 1;
       }
       i = 0;
       while (i < layoutParams.b.size()) {
          i1 = layoutParams.b.keyAt(i);
          String str = layoutParams.b.valueAt(i);
          if (str.equals("auto")) {
             if (i1 == 26) {
                og.x0(YogaEdge.LEFT);
             }else if(i1 == 29){
                og.x0(YogaEdge.TOP);
             }else if(i1 == 27){
                og.x0(YogaEdge.RIGHT);
             }else if(i1 == 23){
                og.x0(YogaEdge.BOTTOM);
             }else if(i1 == 28){
                og.x0(YogaEdge.START);
             }else if(i1 == 24){
                og.x0(YogaEdge.END);
             }else if(i1 == 25){
                og.x0(YogaEdge.HORIZONTAL);
             }else if(i1 == i3){
                og.x0(YogaEdge.VERTICAL);
             }else if(i1 == 22){
                og.x0(YogaEdge.ALL);
             }
          }
          if (str.endsWith("%")) {
             int i5 = str.length() - 1;
             float f1 = Float.parseFloat(str.substring(0, i5));
             if (i1 == i2) {
                og.n0(f1);
             }else if(i1 == 20){
                og.t0(f1);
             }else if(i1 == 26){
                og.y0(YogaEdge.LEFT, f1);
             }else if(i1 == 29){
                og.y0(YogaEdge.TOP, f1);
             }else if(i1 == 27){
                og.y0(YogaEdge.RIGHT, f1);
             }else if(i1 == 23){
                og.y0(YogaEdge.BOTTOM, f1);
             }else if(i1 == 28){
                og.y0(YogaEdge.START, f1);
             }else if(i1 == 24){
                og.y0(YogaEdge.END, f1);
             }else if(i1 == 25){
                og.y0(YogaEdge.HORIZONTAL, f1);
             }else if(i1 == 30){
                og.y0(YogaEdge.VERTICAL, f1);
             }else if(i1 == 22){
                og.y0(YogaEdge.ALL, f1);
             }else if(i1 == 31){
                og.A0(f1);
             }else if(i1 == 32){
                og.C0(f1);
             }else if(i1 == 33){
                og.F0(f1);
             }else if(i1 == 34){
                og.H0(f1);
             }else if(i1 == 40){
                og.K0(YogaEdge.LEFT, f1);
             }else if(i1 == 43){
                og.K0(YogaEdge.TOP, f1);
             }else if(i1 == 41){
                og.K0(YogaEdge.RIGHT, f1);
             }else if(i1 == 37){
                og.K0(YogaEdge.BOTTOM, f1);
             }else if(i1 == 42){
                og.K0(YogaEdge.START, f1);
             }else if(i1 == 38){
                og.K0(YogaEdge.END, f1);
             }else if(i1 == 39){
                og.K0(YogaEdge.HORIZONTAL, f1);
             }else if(i1 == 44){
                og.K0(YogaEdge.VERTICAL, f1);
             }else if(i1 == 36){
                og.K0(YogaEdge.ALL, f1);
             }else if(i1 == 49){
                og.M0(YogaEdge.LEFT, f1);
             }else if(i1 == 52){
                og.M0(YogaEdge.TOP, f1);
             }else if(i1 == 50){
                og.M0(YogaEdge.RIGHT, f1);
             }else if(i1 == 46){
                og.M0(YogaEdge.BOTTOM, f1);
             }else if(i1 == 51){
                og.M0(YogaEdge.START, f1);
             }else if(i1 == 47){
                og.M0(YogaEdge.END, f1);
             }else if(i1 == 48){
                og.M0(YogaEdge.HORIZONTAL, f1);
             }else if(i1 == 54){
                og.M0(YogaEdge.VERTICAL, f1);
             }else if(i1 == 45){
                og.M0(YogaEdge.ALL, f1);
             }else if(i1 == 55){
                og.Q0(f1);
             }
             String str1 = 30;
          }else {
             int i6 = 1;
          }
          i = i + 1;
          i2 = 16;
          i3 = 30;
       }
       return;
    }
    public void a(View p0,g p1){
       this.b.put(p0, p1);
       this.addView(p0);
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       g yogaNode;
       this.c.D0(null);
       if (p0 instanceof VirtualYogaLayout) {
          p0.b(this);
          YogaLayout tc = this.c;
          tc.a(p0.getYogaNode(), tc.l());
          return;
       }else {
          super.addView(p0, p1, p2);
          if (this.b.containsKey(p0)) {
             return;
          }
          if (p0 instanceof YogaLayout) {
             yogaNode = p0.getYogaNode();
          }else if(this.b.containsKey(p0)){
             yogaNode = this.b.get(p0);
          }else {
             yogaNode = h.a();
          }
          yogaNode.h0(p0);
          yogaNode.D0(new YogaLayout$a());
          YogaLayout.b(p0.getLayoutParams(), yogaNode, p0);
          this.b.put(p0, yogaNode);
          YogaLayout tc1 = this.c;
          tc1.a(yogaNode, tc1.l());
          return;
       }
    }
    public final void c(g p0,float p1,float p2){
       int i;
       int i1;
       View view = p0.m();
       if (view != null && view != this) {
          if (view.getVisibility() == 0.00f) {
             return;
          }else {
             i = Math.round((p0.B() + p1));
             i1 = Math.round((p0.C() + p2));
             view.measure(View$MeasureSpec.makeMeasureSpec(Math.round(p0.A()), 0x40000000), View$MeasureSpec.makeMeasureSpec(Math.round(p0.x()), 0x40000000));
             view.layout(i, i1, (view.getMeasuredWidth() + i), (view.getMeasuredHeight() + i1));
          }
       }
       i = p0.l();
       i1 = 0;
       while (i1 < i) {
          if (this.equals(view)) {
             this.c(p0.k(i1), p1, p2);
          }else if(view instanceof YogaLayout){
             float f = p0.B() + p1;
             float f1 = p0.C() + p2;
             this.c(p0.k(i1), f, f1);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       return p0 instanceof YogaLayout$LayoutParams;
    }
    public final void d(int p0,int p1){
       int size = View$MeasureSpec.getSize(p0);
       int size1 = View$MeasureSpec.getSize(p1);
       p0 = View$MeasureSpec.getMode(p0);
       p1 = View$MeasureSpec.getMode(p1);
       YogaLayout yogaLayout = 0x40000000;
       if (p1 == yogaLayout) {
          this.c.r0((float)size1);
       }
       if (p0 == yogaLayout) {
          this.c.O0((float)size);
       }
       if (p1 == Integer.MIN_VALUE) {
          this.c.z0((float)size1);
       }
       if (p0 == Integer.MIN_VALUE) {
          this.c.B0((float)size);
       }
       this.c.b(Float.NaN, Float.NaN);
       return;
    }
    public final void e(View p0,boolean p1){
       g og = this.b.get(p0);
       if (og == null) {
          return;
       }
       g og1 = og.J();
       int i = 0;
       while (i < og1.l()) {
          if (og1.k(i).equals(og)) {
             og1.Z(i);
             break ;
          }else {
             i = i + 1;
          }
       }
       og.h0(null);
       this.b.remove(p0);
       if (p1) {
          this.c.b(Float.NaN, Float.NaN);
       }
       return;
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return new YogaLayout$LayoutParams(-1, -1);
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return new YogaLayout$LayoutParams(this.getContext(), p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return new YogaLayout$LayoutParams(p0);
    }
    public g getYogaNode(){
       return this.c;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (!this.getParent() instanceof YogaLayout) {
          this.d(View$MeasureSpec.makeMeasureSpec((p3 - p1), 0x40000000), View$MeasureSpec.makeMeasureSpec((p4 - p2), 0x40000000));
       }
       this.c(this.c, 0, 0);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (!this.getParent() instanceof YogaLayout) {
          this.d(p0, p1);
       }
       this.setMeasuredDimension(Math.round(this.c.A()), Math.round(this.c.x()));
       return;
    }
    public void removeAllViews(){
       int childCount = this.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          this.e(this.getChildAt(i), false);
       }
       super.removeAllViews();
       return;
    }
    public void removeAllViewsInLayout(){
       int childCount = this.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          this.e(this.getChildAt(i), true);
       }
       super.removeAllViewsInLayout();
       return;
    }
    public void removeView(View p0){
       this.e(p0, false);
       super.removeView(p0);
    }
    public void removeViewAt(int p0){
       this.e(this.getChildAt(p0), false);
       super.removeViewAt(p0);
    }
    public void removeViewInLayout(View p0){
       this.e(p0, true);
       super.removeViewInLayout(p0);
    }
    public void removeViews(int p0,int p1){
       int i = p0;
       int i1 = p0 + p1;
       while (i < i1) {
          this.e(this.getChildAt(i), false);
          i = i + 1;
       }
       super.removeViews(p0, p1);
       return;
    }
    public void removeViewsInLayout(int p0,int p1){
       int i = p0;
       int i1 = p0 + p1;
       while (i < i1) {
          this.e(this.getChildAt(i), true);
          i = i + 1;
       }
       super.removeViewsInLayout(p0, p1);
       return;
    }
}
