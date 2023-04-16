package com.yxcorp.gifshow.profile.widget.HorizontalLoadMoreLayout;
import a2.v;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewConfiguration;
import tyc.v;
import android.widget.Scroller;
import android.os.Handler;
import com.yxcorp.gifshow.profile.widget.HorizontalLoadMoreLayout$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.View;
import lnc.a1;
import com.yxcorp.gifshow.profile.widget.HorizontalLoadMoreLayout$a;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import androidx.viewpager.widget.ViewPager;
import b6c.a;
import android.view.ViewGroup;
import java.lang.Float;
import java.lang.Runnable;

public class HorizontalLoadMoreLayout extends FrameLayout implements v	// class@0015f4
{
    public final ViewConfiguration b;
    public final int c;
    public float d;
    public float e;
    public final v f;
    public boolean g;
    public HorizontalLoadMoreLayout$a h;
    public View i;
    public final Scroller j;
    public final Handler k;
    public final Runnable l;
    public HashMap m;

    public void HorizontalLoadMoreLayout(Context p0){
       super(p0, null);
    }
    public void HorizontalLoadMoreLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
       this.b = viewConfigur;
       a.o(viewConfigur, "mViewConfiguration");
       this.c = viewConfigur.getScaledTouchSlop();
       this.f = new v();
       this.g = true;
       this.j = new Scroller(p0);
       this.k = new Handler();
       this.l = new HorizontalLoadMoreLayout$b(this);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, HorizontalLoadMoreLayout.class, "8")) {
          return;
       }
       this.k.removeCallbacksAndMessages(null);
       return;
    }
    public void b(){
    }
    public final void c(int p0){
       if (PatchProxy.isSupport(HorizontalLoadMoreLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HorizontalLoadMoreLayout.class, "15")) {
          return;
       }
       this.f.a(p0);
       this.scrollTo(this.f.c(), 0);
       HorizontalLoadMoreLayout ti = this.i;
       if (ti != null) {
          ti.requestLayout();
       }
       if (this.getScrollX() > a1.e(10.00f)) {
          this.requestDisallowInterceptTouchEvent(true);
       }
       ti = this.h;
       if (ti != null) {
          ti.a(this.getScrollX());
       }
       return;
    }
    public void computeScroll(){
       if (PatchProxy.applyVoid(null, this, HorizontalLoadMoreLayout.class, "13")) {
          return;
       }
       super.computeScroll();
       if (this.j.computeScrollOffset()) {
          this.scrollTo(this.j.getCurrX(), this.j.getCurrY());
          this.invalidate();
          HorizontalLoadMoreLayout ti = this.i;
          if (ti != null) {
             ti.requestLayout();
          }
          ti = this.h;
          if (ti != null) {
             ti.a(this.getScrollX());
          }
          this.f.f(this.getScrollX());
       }
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       ViewPager obj = PatchProxy.applyOneRefs(p0, this, HorizontalLoadMoreLayout.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       int action = p0.getAction();
       boolean b = true;
       if (action) {
          if (action == 0.00f) {
             float y = p0.getY();
             if (Math.abs((p0.getX() - this.e)) - (float)this.c > 0 && Math.abs((y - this.d)) - (float)(this.c * 2) < 0) {
                obj = a.a(this);
                if (obj != null) {
                   obj.requestDisallowInterceptTouchEvent(false);
                }
             }else {
                obj = a.a(this);
                if (obj != null) {
                   obj.requestDisallowInterceptTouchEvent(b);
                }
             }
          }
       }else {
          this.d = p0.getX();
          this.e = p0.getY();
          obj = a.a(this);
          if (obj != null) {
             obj.requestDisallowInterceptTouchEvent(b);
          }
       }
       return super.dispatchTouchEvent(p0);
    }
    public final boolean getMEnable(){
       return this.g;
    }
    public final View getMLoadView(){
       return this.i;
    }
    public final HorizontalLoadMoreLayout$a getMScrollListener(){
       return this.h;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(HorizontalLoadMoreLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, HorizontalLoadMoreLayout.class, "6")) {
          return;
       }
       super.onMeasure(p0, p1);
       HorizontalLoadMoreLayout ti = this.i;
       a.m(ti);
       ti.setTranslationX((float)this.getMeasuredWidth());
       HorizontalLoadMoreLayout ti1 = this.i;
       a.m(ti1);
       this.f.e(ti1.getMeasuredWidth());
       return;
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       if (PatchProxy.isSupport(HorizontalLoadMoreLayout.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Boolean.valueOf(p3), this, HorizontalLoadMoreLayout.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "target");
       return true;
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       if (PatchProxy.isSupport(HorizontalLoadMoreLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, HorizontalLoadMoreLayout.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "target");
       if (this.getScrollX() > 0) {
          HorizontalLoadMoreLayout tb = this.b;
          a.o(tb, "mViewConfiguration");
          if (Math.abs(p1) - (float)(tb.getScaledMinimumFlingVelocity() * 10) < 0) {
             return true;
          }
       }
       return false;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3,int p4){
       if (PatchProxy.isSupport(HorizontalLoadMoreLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, HorizontalLoadMoreLayout.class, "5")) {
             return;
          }
       }
       a.p(p0, "target");
       a.p(p3, "consumed");
       if (this.getScrollX() > 0 && p1 < 0) {
          this.c(p1);
          p3[0] = p1;
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5){
       if (PatchProxy.isSupport(HorizontalLoadMoreLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, HorizontalLoadMoreLayout.class, "12")) {
             return;
          }
       }
       a.p(p0, "target");
       if (this.getScrollX() <= 0 && p3 <= 0) {
          return;
       }else {
          this.c(p3);
          return;
       }
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2,int p3){
       if (PatchProxy.isSupport(HorizontalLoadMoreLayout.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, HorizontalLoadMoreLayout.class, "11")) {
          return;
       }
       a.p(p0, "child");
       a.p(p1, "target");
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2,int p3){
       if (PatchProxy.isSupport(HorizontalLoadMoreLayout.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, HorizontalLoadMoreLayout.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "child");
       a.p(p1, "target");
       if (this.g == null) {
          return false;
       }else if(p2 == 1 && !p3){
          this.a();
          return 1;
       }else {
          return false;
       }
    }
    public void onStopNestedScroll(View p0,int p1){
       if (PatchProxy.isSupport(HorizontalLoadMoreLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, HorizontalLoadMoreLayout.class, "10")) {
          return;
       }
       a.p(p0, "target");
       if (!p1 && !PatchProxy.applyVoid(null, this, HorizontalLoadMoreLayout.class, "7")) {
          this.a();
          this.k.post(this.l);
       }
       return;
    }
    public final void setMEnable(boolean p0){
       if (PatchProxy.isSupport(HorizontalLoadMoreLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HorizontalLoadMoreLayout.class, "1")) {
          return;
       }
       this.g = p0;
       HorizontalLoadMoreLayout ti = this.i;
       if (ti != null) {
          int i = (p0)? 0: 4;
          ti.setVisibility(i);
       }
       return;
    }
    public final void setMLoadView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HorizontalLoadMoreLayout.class, "2")) {
          return;
       }
       this.i = p0;
       this.setTranslationX((float)this.getWidth());
       return;
    }
    public final void setMScrollListener(HorizontalLoadMoreLayout$a p0){
       this.h = p0;
    }
}
