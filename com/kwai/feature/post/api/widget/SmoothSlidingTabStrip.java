package com.kwai.feature.post.api.widget.SmoothSlidingTabStrip;
import android.widget.HorizontalScrollView;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ll8.c$b;
import android.content.res.TypedArray;
import lnc.a1;
import android.widget.LinearLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import t46.a0;
import android.view.View;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Float;
import java.lang.Boolean;
import android.animation.ValueAnimator;
import java.lang.Math;
import t46.v;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import th0.e;
import android.animation.TimeInterpolator;
import com.kwai.feature.post.api.widget.SmoothSlidingTabStrip$a;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.utility.Log;
import android.content.res.Configuration;
import t46.w;
import java.lang.Runnable;
import t46.x;
import com.kwai.library.widget.popup.common.f;
import com.yxcorp.utility.n;
import android.widget.LinearLayout$LayoutParams;

public abstract class SmoothSlidingTabStrip extends HorizontalScrollView	// class@001481
{
    public boolean b;
    public int c;
    public a0 d;
    public ArrayList e;
    public LinearLayout f;
    public ViewGroup g;
    public int h;
    public ValueAnimator i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public static final int r;

    public void SmoothSlidingTabStrip(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SmoothSlidingTabStrip(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = -1;
       this.e = new ArrayList();
       if (!PatchProxy.isSupport(SmoothSlidingTabStrip.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, SmoothSlidingTabStrip.class, "19")) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.m5, p2, false);
          this.h = typedArray.getDimensionPixelSize(8, a1.e(12.00f));
          this.k = typedArray.getDimensionPixelSize(6, false);
          this.l = typedArray.getDimensionPixelSize(true, false);
          this.j = typedArray.getDimensionPixelSize(7, false);
          this.o = typedArray.getDimensionPixelSize(3, a1.e(2.00f));
          this.n = typedArray.getDimensionPixelSize(5, a1.e(12.00f));
          this.p = typedArray.getDimensionPixelSize(4, false);
          this.q = typedArray.getDimensionPixelSize(2, false);
          this.m = typedArray.getBoolean(false, false);
          typedArray.recycle();
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, SmoothSlidingTabStrip.class, "22")) {
          this.setFillViewport(true);
          this.setWillNotDraw(false);
          LinearLayout linearLayout = new LinearLayout(p0);
          this.f = linearLayout;
          linearLayout.setOrientation(false);
          this.f.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
          this.f.setGravity(false);
          this.f.setClipChildren(false);
          this.f.setClipToPadding(false);
          if (this.m != null) {
             a0 uoa0 = this.a(p0);
             this.d = uoa0;
             SmoothSlidingTabStrip tq = this.q;
             if (tq != null) {
                uoa0.setIndicatorCorner((float)tq);
             }
             this.d.setMarginBottom(this.p);
             this.d.e(this.n, this.o);
             this.d.setTabContainerView(this.f);
             FrameLayout uFrameLayout = new FrameLayout(p0);
             this.g = uFrameLayout;
             uFrameLayout.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
             this.g.addView(this.f);
             this.g.addView(this.d);
             this.addView(this.g);
          }else {
             SmoothSlidingTabStrip tf = this.f;
             this.g = tf;
             this.addView(tf);
          }
       }
       return;
    }
    public abstract a0 a(Context p0);
    public int b(int p0){
       View obj;
       if (PatchProxy.isSupport(SmoothSlidingTabStrip.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SmoothSlidingTabStrip.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.getTabsContainer().getChildAt(p0);
       if (obj == null) {
          return this.getScrollX();
       }else {
          int width = obj.getWidth();
          int left = obj.getLeft();
          if (p0 > 0) {
             left = ((left - (this.getWidth() / 2)) + (width / 2)) + (this.j / 2);
          }
          return left;
       }
    }
    public int c(int p0,float p1){
       if (PatchProxy.isSupport(SmoothSlidingTabStrip.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, SmoothSlidingTabStrip.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = this.b(p0);
       p0++;
       if (p0 >= this.getTabsContainer().getChildCount()) {
          return i;
       }else {
          return (int)(((float)i * (0x3f800000 - p1)) + ((float)this.b(p0) * p1));
       }
    }
    public abstract View d(View p0);
    public abstract View e(View p0);
    public boolean f(){
       return this.b;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, SmoothSlidingTabStrip.class, "5")) {
          return;
       }
       this.f.removeAllViews();
       this.j();
       this.c = this.getCurrentPosition();
       this.m();
       this.v();
       this.u(this.c, this.c, 0);
       this.p(this.c, 0);
       return;
    }
    public abstract int getCurrentPosition();
    public LinearLayout getTabsContainer(){
       return this.f;
    }
    public void h(int p0,float p1,boolean p2){
       int this;
       float f1;
       float f2;
       boolean b;
       boolean b1;
       if (PatchProxy.isSupport(SmoothSlidingTabStrip.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, SmoothSlidingTabStrip.class, "8")) {
          return;
       }
       SmoothSlidingTabStrip tc = this.c;
       this.c = p0;
       if (p2 && p1 - 0x3f800000 < 0) {
          SmoothSlidingTabStrip ti = this.i;
          if (ti != null && ti.isRunning()) {
             this.i.cancel();
          }
          this.i = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
          this = this.getScrollX();
          int i = this.c(p0, 0);
          View childAt = this.f.getChildAt(this.c);
          int i1 = 0;
          if (childAt != null && this.d != null) {
             if (Math.abs(p1) - 0x3a83126f < 0) {
                i1 = 1;
             }
             ti = this.d;
             float f = 2.00f;
             f1 = ti.c(childAt, ti.getIndicatorDefaultWidth()) + ((float)this.d.getIndicatorDefaultWidth() / f);
             f2 = this.d.getIndicatorTranslateX() + ((float)this.d.getIndicatorWidth() / f);
             b = i1;
             b1 = true;
          }else {
             b1 = false;
             b = false;
             f2 = 0;
             f1 = 0;
          }
          v ov = new v(this, p1, this, i, b1, b, f2, f1, tc, p0);
          this.i.addUpdateListener(childAt);
          this.i.setInterpolator(new e());
          this.i.setDuration(300);
          this.i.start();
       }
       return;
    }
    public void i(int p0,int p1,float p2){
    }
    public abstract void j();
    public void k(SmoothSlidingTabStrip$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SmoothSlidingTabStrip.class, "2")) {
          return;
       }
       this.e.remove(p0);
       return;
    }
    public void l(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SmoothSlidingTabStrip.class, "9")) {
          return;
       }
       this.m();
       SmoothSlidingTabStrip tc = this.c;
       if (!PatchProxy.isSupport(SmoothSlidingTabStrip.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tc), this, SmoothSlidingTabStrip.class, "23")) {
          this.u(tc, tc, 0);
          tc = this.d;
          if (tc != null) {
             tc.a(0);
          }
       }
       this.p(this.c, 0);
       tc = this.i;
       if (tc != null && tc.isRunning()) {
          this.i.cancel();
          this.i = objArray;
       }
       this.b = false;
       if (!PatchProxy.applyVoid(objArray, this, SmoothSlidingTabStrip.class, "20")) {
          Iterator iterator = new ArrayList(this.e).iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
       }
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, SmoothSlidingTabStrip.class, "6")) {
          return;
       }
       Log.b("SmoothSlidingTabStrip", "reset All Alpha");
       int childCount = this.getTabsContainer().getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return;
          }
          View childAt = this.getTabsContainer().getChildAt(i);
          if (childAt == null) {
             break ;
          }else if(i == this.c){
             childAt.setTag(R.id.tab_progress, Float.valueOf(0x3f800000));
          }else {
             childAt.setTag(R.id.tab_progress, Float.valueOf(0));
          }
          this.s(i);
          i = i + 1;
       }
       return;
    }
    public float n(int p0,float p1){
       if (PatchProxy.isSupport(SmoothSlidingTabStrip.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, SmoothSlidingTabStrip.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       float f = 0xbf800000;
       if (this.f()) {
          return f;
       }else {
          this.o(p0, p1);
          if (p0 < this.c) {
             p1 = 0x3f800000 - p1;
             int i = p0 + 1;
             this.t(i, p0, p1);
             this.u(i, p0, p1);
          }else {
             int i1 = p0 + 1;
             if (i1 < this.getTabsContainer().getChildCount()) {
                this.t(p0, i1, p1);
                this.u(p0, i1, p1);
             }else {
                p1 = 0xbf800000;
             }
          }
          return p1;
       }
    }
    public void o(int p0,float p1){
       if (PatchProxy.isSupport(SmoothSlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, SmoothSlidingTabStrip.class, "3")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       if (p0 >= 0 && p0 < this.getTabsContainer().getChildCount()) {
          p0 = this.c(p0, p1);
          if (p0 == this.getScrollX()) {
             return;
          }else {
             this.scrollTo(p0, 0);
          }
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SmoothSlidingTabStrip.class, "14")) {
          return;
       }
       this.v();
       this.post(new w(this));
       return;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(SmoothSlidingTabStrip.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, SmoothSlidingTabStrip.class, "13")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       return;
    }
    public void p(int p0,float p1){
       if (PatchProxy.isSupport(SmoothSlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, SmoothSlidingTabStrip.class, "4")) {
          return;
       }
       f.G(this.getTabsContainer().getChildAt(p0), new x(this, p0, p1));
       return;
    }
    public void q(int p0,int p1){
       if (PatchProxy.isSupport(SmoothSlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SmoothSlidingTabStrip.class, "24")) {
          return;
       }
       SmoothSlidingTabStrip td = this.d;
       if (td != null) {
          this.n = p0;
          this.o = p1;
          td.e(p0, p1);
       }
       return;
    }
    public abstract void r(View p0);
    public void s(int p0){
       if (PatchProxy.isSupport(SmoothSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SmoothSlidingTabStrip.class, "15")) {
          return;
       }
       View childAt = this.f.getChildAt(p0);
       if (childAt == null) {
          return;
       }
       View view = this.d(childAt);
       View view1 = this.e(childAt);
       Object tag = childAt.getTag(R.id.tab_progress);
       float f = (tag instanceof Float)? tag.floatValue(): 0;
       int i = 0x3a83126f;
       if (f - i <= 0) {
          n.Y(view, 4, false);
          n.Y(view1, false, false);
          if (view1 != null) {
             view1.setAlpha(0x3f800000);
          }
          if (view != null) {
             view.setAlpha(0);
          }
       }else {
          float f1 = 0x3f800000 - f;
          if (Math.abs(f1) - i <= 0) {
             n.Y(view, false, false);
             n.Y(view1, 4, false);
             if (view1 != null) {
                view1.setAlpha(0);
             }
             if (view != null) {
                view.setAlpha(0x3f800000);
             }
          }else {
             n.Y(view, false, false);
             n.Y(view1, false, false);
             if (view != null) {
                view.setAlpha(f);
             }
             if (view1 != null) {
                view1.setAlpha(f1);
             }
          }
       }
       return;
    }
    public final void t(int p0,int p1,float p2){
       if (PatchProxy.isSupport(SmoothSlidingTabStrip.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), this, SmoothSlidingTabStrip.class, "18")) {
          return;
       }
       View childAt = this.getTabsContainer().getChildAt(p0);
       if (childAt != null) {
          childAt.setTag(R.id.tab_progress, Float.valueOf((0x3f800000 - p2)));
          this.s(p0);
       }
       View childAt1 = this.getTabsContainer().getChildAt(p1);
       if (childAt1 != null) {
          childAt1.setTag(R.id.tab_progress, Float.valueOf(p2));
          this.s(p1);
       }
       return;
    }
    public void u(int p0,int p1,float p2){
       if (PatchProxy.isSupport(SmoothSlidingTabStrip.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), this, SmoothSlidingTabStrip.class, "21")) {
          return;
       }
       if (this.d == null) {
          return;
       }
       View childAt = this.getTabsContainer().getChildAt(p0);
       View childAt1 = this.getTabsContainer().getChildAt(p1);
       if (childAt != null && childAt1 != null) {
          this.d.d(childAt, childAt1, p2);
       }
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, SmoothSlidingTabStrip.class, "17")) {
          return;
       }
       int i = 0;
       while (i < this.f.getChildCount()) {
          if (!PatchProxy.isSupport(SmoothSlidingTabStrip.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, SmoothSlidingTabStrip.class, "16")) {
             View childAt = this.f.getChildAt(i);
             if (childAt != null) {
                if (childAt.getLayoutParams() == null || childAt.getLayoutParams().width < null) {
                   ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
                   ViewGroup$LayoutParams layoutParams1 = PatchProxy.applyOneRefs(layoutParams, this, SmoothSlidingTabStrip.class, "10");
                   if (layoutParams1 != PatchProxyResult.class) {
                   }else {
                      int i2 = -2;
                      if (layoutParams instanceof LinearLayout$LayoutParams) {
                         layoutParams.width = i2;
                         layoutParams.height = -1;
                         layoutParams1 = layoutParams;
                      }else {
                         layoutParams1 = new LinearLayout$LayoutParams(i2, -1);
                      }
                   }
                   int i1 = this.f.getChildCount() - 1;
                   if (i == i1) {
                      layoutParams1.rightMargin = this.k;
                   }
                   if (!i) {
                      layoutParams1.leftMargin = this.l;
                   }
                   childAt.setLayoutParams(layoutParams1);
                   childAt.setPadding(this.h, 0, this.h, 0);
                }
                View view = this.d(childAt);
                childAt = this.e(childAt);
                if (view != null) {
                   this.r(view);
                }
                if (childAt != null) {
                   this.w(childAt);
                }
                this.s(i);
             }
          }
          i = i + 1;
       }
       return;
    }
    public abstract void w(View p0);
}
