package com.yxcorp.gifshow.widget.CustomLayout;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import java.lang.Float;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;

public abstract class CustomLayout extends ViewGroup	// class@001816
{
    public final int b;
    public final int c;
    public HashMap d;

    public void CustomLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void CustomLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void CustomLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = -1;
       this.c = -2;
    }
    public void CustomLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static void i(CustomLayout p0,View p1,int p2,int p3,boolean p4,int p5,Object p6){
       if (p5 & 0x04) {
          p4 = false;
       }
       if (!PatchProxy.isSupport(CustomLayout.class) || !PatchProxy.applyVoidFourRefs(p1, Integer.valueOf(p2), Integer.valueOf(p3), Boolean.valueOf(p4), p0, CustomLayout.class, "10")) {
          a.p(p1, "$this$layout");
          if (!p4) {
             p1.layout(p2, p3, (p1.getMeasuredWidth() + p2), (p1.getMeasuredHeight() + p3));
          }else {
             CustomLayout.i(p0, p1, ((p0.getMeasuredWidth() - p2) - p1.getMeasuredWidth()), p3, false, 4, null);
          }
       }
       return;
    }
    public final void a(View p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomLayout.class, "5")) {
          return;
       }
       String str = "view";
       a.p(p0, str);
       Object obj = PatchProxy.applyOneRefs(p0, this, CustomLayout.class, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, str);
          b = (this.indexOfChild(p0) != -1)? true: false;
       }
       if (!b) {
          this.b(p0);
       }
       return;
    }
    public final void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomLayout.class, "4")) {
          return;
       }
       a.p(p0, "view");
       this.addView(p0);
       return;
    }
    public final void c(View p0){
       int i;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomLayout.class, "9")) {
          return;
       }
       a.p(p0, "$this$autoMeasure");
       ViewGroup$LayoutParams obj = PatchProxy.applyTwoRefs(p0, this, this, CustomLayout.class, "16");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else {
          a.p(p0, "$this$defaultWidthMeasureSpec");
          a.p(this, "parentView");
          obj = p0.getLayoutParams().width;
          if (obj != -2) {
             i = (obj != -1)? this.m(p0.getLayoutParams().width): this.m(this.getMeasuredWidth());
          }else {
             i = this.l(-2);
          }
       }
       Object obj1 = PatchProxy.applyTwoRefs(p0, this, this, CustomLayout.class, "17");
       if (obj1 != patchProxyRe) {
          i1 = obj1.intValue();
       }else {
          a.p(p0, "$this$defaultHeightMeasureSpec");
          a.p(this, "parentView");
          ViewGroup$LayoutParams height = p0.getLayoutParams().height;
          if (height != -2) {
             i1 = (height != -1)? this.m(p0.getLayoutParams().height): this.m(this.getMeasuredHeight());
          }else {
             i1 = this.l(-2);
          }
       }
       p0.measure(i, i1);
       return;
    }
    public final int d(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CustomLayout.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "$this$actualHeightWithMargin");
       int i = 0;
       obj = (!p0.getVisibility())? 1: 0;
       if (obj) {
          i = this.g(p0);
       }
       return i;
    }
    public final int e(float p0){
       Resources obj;
       if (PatchProxy.isSupport(CustomLayout.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, CustomLayout.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.getResources();
       a.o(obj, "resources");
       return (int)((p0 * c.c(obj).density) + 0x3f000000);
    }
    public final int f(int p0){
       Resources obj;
       if (PatchProxy.isSupport(CustomLayout.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CustomLayout.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.getResources();
       a.o(obj, "resources");
       return (int)(((float)p0 * c.c(obj).density) + 0x3f000000);
    }
    public final int g(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CustomLayout.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "$this$measuredHeightWithMargin");
       int measuredHeig = p0.getMeasuredHeight();
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       ViewGroup$MarginLayoutParams marginLayout = null;
       if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams = marginLayout;
       }
       ViewGroup$MarginLayoutParams marginLayout1 = null;
       ViewGroup$MarginLayoutParams topMargin = (layoutParams != null)? layoutParams.topMargin: 0;
       measuredHeig = measuredHeig + topMargin;
       ViewGroup$LayoutParams layoutParams1 = p0.getLayoutParams();
       if (layoutParams1 instanceof ViewGroup$MarginLayoutParams) {
          marginLayout = layoutParams1;
       }
       if (marginLayout != null) {
          marginLayout1 = marginLayout.bottomMargin;
       }
       return (measuredHeig + marginLayout1);
    }
    public final int getMATCH_PARENT(){
       return this.b;
    }
    public final int getWRAP_CONTENT(){
       return this.c;
    }
    public final int h(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CustomLayout.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "$this$measuredWidthWithMargin");
       int measuredWidt = p0.getMeasuredWidth();
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       ViewGroup$MarginLayoutParams marginLayout = null;
       if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams = marginLayout;
       }
       ViewGroup$MarginLayoutParams marginLayout1 = null;
       ViewGroup$MarginLayoutParams leftMargin = (layoutParams != null)? layoutParams.leftMargin: 0;
       measuredWidt = measuredWidt + leftMargin;
       ViewGroup$LayoutParams layoutParams1 = p0.getLayoutParams();
       if (layoutParams1 instanceof ViewGroup$MarginLayoutParams) {
          marginLayout = layoutParams1;
       }
       if (marginLayout != null) {
          marginLayout1 = marginLayout.rightMargin;
       }
       return (measuredWidt + marginLayout1);
    }
    public final int j(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CustomLayout.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "$this$layoutHeightCenter");
       return ((this.getMeasuredHeight() - this.g(p0)) / 2);
    }
    public final int k(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CustomLayout.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "$this$layoutWidthCenter");
       return ((this.getMeasuredWidth() - this.h(p0)) / 2);
    }
    public final int l(int p0){
       if (PatchProxy.isSupport(CustomLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CustomLayout.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return View$MeasureSpec.makeMeasureSpec(p0, Integer.MIN_VALUE);
    }
    public final int m(int p0){
       if (PatchProxy.isSupport(CustomLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CustomLayout.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return View$MeasureSpec.makeMeasureSpec(p0, 0x40000000);
    }
}
