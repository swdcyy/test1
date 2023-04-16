package com.tachikoma.core.yoga.layout.YogaLayout;
import wo8.d;
import android.view.ViewGroup;
import lg.i;
import com.facebook.yoga.YogaUnit;
import no8.e;
import oo8.i;
import java.lang.String;
import java.lang.Throwable;
import wp8.a;
import zp8.a;
import android.content.Context;
import android.util.AttributeSet;
import wo8.n;
import com.facebook.yoga.b;
import jq8.a;
import lg.g;
import java.util.HashMap;
import java.lang.Object;
import com.tachikoma.core.yoga.layout.YogaLayout$a;
import lg.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import android.view.View;
import android.content.res.Configuration;
import com.facebook.yoga.YogaDirection;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import com.facebook.yoga.YogaEdge;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import oo8.s;
import java.lang.Float;
import java.lang.Math;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import java.lang.Integer;
import java.util.Objects;
import java.util.Map;
import java.lang.Number;
import android.view.ViewParent;

public class YogaLayout extends ViewGroup implements d	// class@000ddc
{
    public final n b;
    public final Map c;
    public final g d;
    public final a e;
    public i f;
    public i g;
    public i h;
    public i i;
    public static final i j;
    public static Boolean k;

    static {
       YogaLayout.j = new i(0xcf000000, YogaUnit.UNDEFINED);
       YogaLayout.k = null;
       if (e.b().c() != null) {
          e.b().c().loadLibrary("yoga");
       }
    }
    public void YogaLayout(Context p0){
       super(p0, null, 0);
       i j = YogaLayout.j;
       this.f = j;
       this.g = j;
       this.h = j;
       this.i = j;
       this.b = new n(this);
       b uob = new b();
       this.d = uob;
       boolean b = true;
       this.e = new a(uob, b);
       this.c = new HashMap();
       uob.h0(this);
       uob.D0(new YogaLayout$a());
       if (PatchProxy.applyVoidTwoRefs(uob, this, null, YogaLayout.class, "22")) {
       }else if(this.getResources().getConfiguration().getLayoutDirection() == b){
          uob.i0(YogaDirection.RTL);
       }
       Drawable background = this.getBackground();
       if (background != null) {
          Rect rect = new Rect();
          if (background.getPadding(rect)) {
             uob.J0(YogaEdge.LEFT, (float)rect.left);
             uob.J0(YogaEdge.TOP, (float)rect.top);
             uob.J0(YogaEdge.RIGHT, (float)rect.right);
             uob.J0(YogaEdge.BOTTOM, (float)rect.bottom);
          }
       }
       return;
    }
    public static boolean c(){
       Boolean obj = PatchProxy.apply(null, null, YogaLayout.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (YogaLayout.k == null && e.b().d() != null) {
          YogaLayout.k = Boolean.valueOf(e.b().d().d("tkEnableYogaLayoutOriginSizeFix", b));
       }
       obj = YogaLayout.k;
       if (obj != null && obj.booleanValue()) {
          b = true;
       }
       return b;
    }
    public static void e(g p0,i p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, YogaLayout.class, "20")) {
          return;
       }
       i b = p1.b;
       if (b == YogaUnit.AUTO) {
          p0.s0();
       }else if(b == YogaUnit.POINT){
          p0.r0(p1.a);
       }else if(b == YogaUnit.PERCENT){
          p0.t0(p1.a);
       }else if(b == YogaUnit.UNDEFINED){
          p0.r0(Float.NaN);
       }
       return;
    }
    public static void f(g p0,i p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, YogaLayout.class, "19")) {
          return;
       }
       i b = p1.b;
       if (b == YogaUnit.AUTO) {
          p0.P0();
       }else if(b == YogaUnit.POINT){
          p0.O0(p1.a);
       }else if(b == YogaUnit.PERCENT){
          p0.Q0(p1.a);
       }else if(b == YogaUnit.UNDEFINED){
          p0.O0(Float.NaN);
       }
       return;
    }
    public final void a(g p0,float p1,float p2){
       int i;
       int i1;
       if (PatchProxy.isSupport(YogaLayout.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, YogaLayout.class, "16")) {
          return;
       }
       View view = p0.m();
       if (view == null) {
          return;
       }
       if (view != this) {
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
             this.a(p0.k(i1), p1, p2);
          }else if(view instanceof YogaLayout){
             float f = p0.B() + p1;
             float f1 = p0.C() + p2;
             this.a(p0.k(i1), f, f1);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (PatchProxy.isSupport(YogaLayout.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, YogaLayout.class, "3")) {
          return;
       }
       YogaLayout tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, n.class, "3")) {
          if (n.b(p0) != null) {
             tb.b = tb.b + 1;
          }
          tb.c = null;
       }
       this.setChildrenDrawingOrderEnabled(this.b.d());
       super.addView(p0, p1, p2);
       return;
    }
    public final void b(int p0,int p1){
       if (PatchProxy.isSupport(YogaLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, YogaLayout.class, "21")) {
          return;
       }
       int size = View$MeasureSpec.getSize(p0);
       int size1 = View$MeasureSpec.getSize(p1);
       p0 = View$MeasureSpec.getMode(p0);
       p1 = View$MeasureSpec.getMode(p1);
       YogaLayout yogaLayout = 0x40000000;
       if (p1 == yogaLayout) {
          if (this.g == YogaLayout.j) {
             this.g = this.d.t();
          }
          this.d.r0((float)size1);
          this.i = this.d.t();
       }
       if (p0 == yogaLayout) {
          if (this.f == YogaLayout.j) {
             this.f = this.d.P();
          }
          this.d.O0((float)size);
          this.h = this.d.P();
       }
       if (p1 == Integer.MIN_VALUE) {
          this.d.z0((float)size1);
       }
       if (p0 == Integer.MIN_VALUE) {
          this.d.B0((float)size);
       }
       this.d.b(Float.NaN, Float.NaN);
       return;
    }
    public final void d(View p0,boolean p1){
       if (PatchProxy.isSupport(YogaLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, YogaLayout.class, "15")) {
          return;
       }
       g og = this.c.get(p0);
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
       this.c.remove(p0);
       if (p1) {
          this.d.b(Float.NaN, Float.NaN);
       }
       return;
    }
    public int getChildDrawingOrder(int p0,int p1){
       if (PatchProxy.isSupport(YogaLayout.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, YogaLayout.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.a(p0, p1);
    }
    public a getYogaNode(){
       return this.e;
    }
    public int getZIndexMappedChildIndex(int p0){
       if (PatchProxy.isSupport(YogaLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, YogaLayout.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.b.d()) {
          p0 = this.b.a(this.getChildCount(), p0);
       }
       return p0;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(YogaLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, YogaLayout.class, "17")) {
             return;
          }
       }
       if (!this.getParent() instanceof YogaLayout) {
          this.b(View$MeasureSpec.makeMeasureSpec((p3 - p1), 0x40000000), View$MeasureSpec.makeMeasureSpec((p4 - p2), 0x40000000));
       }
       this.a(this.d, 0, 0);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(YogaLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, YogaLayout.class, "18")) {
          return;
       }
       if (!this.getParent() instanceof YogaLayout) {
          i j = YogaLayout.j;
          if (this.h != j) {
             if (this.h.equals(this.d.P())) {
                if (YogaLayout.c()) {
                   YogaLayout.f(this.d, this.e.c);
                }else {
                   YogaLayout.f(this.d, this.f);
                }
             }
             this.h = j;
          }
          if (this.i != j) {
             if (this.i.equals(this.d.t())) {
                if (YogaLayout.c()) {
                   YogaLayout.e(this.d, this.e.d);
                }else {
                   YogaLayout.e(this.d, this.g);
                }
             }
             this.i = j;
          }
          this.b(p0, p1);
       }
       this.setMeasuredDimension(Math.round(this.d.A()), Math.round(this.d.x()));
       return;
    }
    public void removeAllViews(){
       if (PatchProxy.applyVoid(null, this, YogaLayout.class, "13")) {
          return;
       }
       int childCount = this.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          this.d(this.getChildAt(i), false);
       }
       super.removeAllViews();
       return;
    }
    public void removeAllViewsInLayout(){
       if (PatchProxy.applyVoid(null, this, YogaLayout.class, "14")) {
          return;
       }
       int childCount = this.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          this.d(this.getChildAt(i), true);
       }
       super.removeAllViewsInLayout();
       return;
    }
    public void removeView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YogaLayout.class, "5")) {
          return;
       }
       this.d(p0, false);
       this.b.c(p0);
       this.setChildrenDrawingOrderEnabled(this.b.d());
       super.removeView(p0);
       return;
    }
    public void removeViewAt(int p0){
       if (PatchProxy.isSupport(YogaLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, YogaLayout.class, "6")) {
          return;
       }
       this.d(this.getChildAt(p0), false);
       this.b.c(this.getChildAt(p0));
       this.setChildrenDrawingOrderEnabled(this.b.d());
       super.removeViewAt(p0);
       return;
    }
    public void removeViewInLayout(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YogaLayout.class, "10")) {
          return;
       }
       this.d(p0, true);
       super.removeViewInLayout(p0);
       return;
    }
    public void removeViews(int p0,int p1){
       if (PatchProxy.isSupport(YogaLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, YogaLayout.class, "11")) {
          return;
       }
       int i = p0;
       int i1 = p0 + p1;
       while (i < i1) {
          this.d(this.getChildAt(i), false);
          i = i + 1;
       }
       super.removeViews(p0, p1);
       return;
    }
    public void removeViewsInLayout(int p0,int p1){
       if (PatchProxy.isSupport(YogaLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, YogaLayout.class, "12")) {
          return;
       }
       int i = p0;
       int i1 = p0 + p1;
       while (i < i1) {
          this.d(this.getChildAt(i), true);
          i = i + 1;
       }
       super.removeViewsInLayout(p0, p1);
       return;
    }
    public void updateDrawingOrder(){
       if (PatchProxy.applyVoid(null, this, YogaLayout.class, "9")) {
          return;
       }
       YogaLayout tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, n.class, "6")) {
          int i = 0;
          tb.b = i;
          while (i < tb.a.getChildCount()) {
             if (n.b(tb.a.getChildAt(i)) != null) {
                int i1 = tb.b + 1;
                tb.b = i1;
             }
             i = i + 1;
          }
          tb.c = null;
       }
       this.setChildrenDrawingOrderEnabled(this.b.d());
       this.invalidate();
       return;
    }
}
