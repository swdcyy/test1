package com.tachikoma.component.scroll.TKVerticalScrollView;
import do8.a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.ScrollView;
import android.content.Context;
import android.os.Handler;
import com.tachikoma.component.scroll.TKVerticalScrollView$a;
import com.tachikoma.component.scroll.TKVerticalScrollView$f;
import eo8.a;
import eo8.b;
import android.view.ViewTreeObserver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import on8.a;
import java.lang.Integer;
import com.tachikoma.component.scroll.TKVerticalScrollView$e;
import java.lang.Runnable;
import iq8.x;
import android.view.ViewGroup;
import com.tachikoma.component.scroll.TKVerticalScrollView$b;
import java.lang.Long;
import android.animation.ValueAnimator;
import com.tachikoma.component.scroll.TKVerticalScrollView$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.tachikoma.component.scroll.TKVerticalScrollView$d;
import android.animation.Animator$AnimatorListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.FrameLayout;
import on8.b;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Math;
import java.lang.System;
import android.view.ViewParent;

public class TKVerticalScrollView extends ScrollView implements a, ViewTreeObserver$OnGlobalLayoutListener	// class@000d26
{
    public boolean b;
    public boolean c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public long q;
    public long r;
    public final b s;
    public final a t;
    public boolean u;
    public Handler v;
    public final Runnable w;
    public Runnable x;

    public void TKVerticalScrollView(Context p0){
       super(p0);
       this.j = false;
       this.k = true;
       this.l = false;
       this.m = false;
       this.p = 0;
       this.q = 400;
       this.r = -1;
       this.u = false;
       this.v = new Handler();
       this.w = new TKVerticalScrollView$a(this);
       this.x = new TKVerticalScrollView$f(this);
       this.setClipToPadding(false);
       this.setImportantForAccessibility(2);
       this.setVerticalScrollBarEnabled(false);
       this.t = new a();
       this.s = new b();
       this.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
    public void a(boolean p0){
       if (PatchProxy.isSupport(TKVerticalScrollView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKVerticalScrollView.class, "9")) {
          return;
       }
       this.setVerticalScrollBarEnabled(p0);
       return;
    }
    public void b(boolean p0){
       this.j = p0;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKVerticalScrollView.class, "8")) {
          return;
       }
       this.s.l(p0);
       return;
    }
    public void d(int p0){
       if (PatchProxy.isSupport(TKVerticalScrollView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKVerticalScrollView.class, "10")) {
          return;
       }
       this.setOverScrollMode(p0);
       return;
    }
    public void e(boolean p0){
       if (PatchProxy.isSupport(TKVerticalScrollView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKVerticalScrollView.class, "14")) {
          return;
       }
       this.u = true;
       if (p0) {
          this.k();
       }else {
          x.f(new TKVerticalScrollView$e(this));
       }
       return;
    }
    public void f(){
       this.m = true;
    }
    public void fling(int p0){
       if (PatchProxy.isSupport(TKVerticalScrollView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKVerticalScrollView.class, "3")) {
          return;
       }
       if (this.j != null) {
          this.l(p0);
       }else {
          super.fling(p0);
       }
       this.s.h(this, this.n, this.o);
       this.setScrollState(2);
       this.postOnAnimationDelayed(new TKVerticalScrollView$b(this), 50);
       return;
    }
    public void g(int p0,int p1,long p2){
       if (PatchProxy.isSupport(TKVerticalScrollView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), this, TKVerticalScrollView.class, "11")) {
          return;
       }
       if ((v3 = p2) > 0) {
          if (p1 == this.getScrollY()) {
             return;
          }else {
             int[] ointArray = new int[]{this.getScrollY(),p1};
             ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
             valueAnimato.setDuration(p2);
             valueAnimato.addUpdateListener(new TKVerticalScrollView$c(this, p0));
             valueAnimato.addListener(new TKVerticalScrollView$d(this));
             valueAnimato.start();
             this.setScrollState(2);
          }
       }else if(!v3){
          this.scrollTo(p0, p1);
       }else {
          this.setScrollState(2);
          this.smoothScrollTo(p0, p1);
          this.postOnAnimationDelayed(this.x, 60);
       }
       return;
    }
    public int getOffsetX(){
       Object obj = PatchProxy.apply(null, this, TKVerticalScrollView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.computeHorizontalScrollOffset();
    }
    public int getOffsetY(){
       Object obj = PatchProxy.apply(null, this, TKVerticalScrollView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.computeVerticalScrollOffset();
    }
    public int getScrollState(){
       return this.p;
    }
    public FrameLayout getView(){
       return this;
    }
    public void h(boolean p0){
       this.k = p0;
    }
    public void i(long p0){
       this.q = p0;
    }
    public void j(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKVerticalScrollView.class, "7")) {
          return;
       }
       this.s.k(p0);
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, TKVerticalScrollView.class, "15")) {
          return;
       }
       this.v.removeCallbacks(this.w);
       this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.s.c();
       return;
    }
    public void l(int p0){
       if (PatchProxy.isSupport(TKVerticalScrollView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKVerticalScrollView.class, "17")) {
          return;
       }
       int height = this.getHeight();
       int scrollY = this.getScrollY();
       p0 = p0 + scrollY;
       int i = 0;
       if (height) {
          i = scrollY / height;
       }
       if ((float)p0 - ((float)(i * height) + ((float)height / 2.00f)) > 0) {
          i = i + 1;
       }
       this.smoothScrollTo(this.getScrollX(), (i * height));
       return;
    }
    public void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKVerticalScrollView.class, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, TKVerticalScrollView.class, "19")) {
          View childAt = this.getChildAt(0);
          if (childAt != null) {
             int width = childAt.getWidth();
             int height = childAt.getHeight();
             if (width != this.n || height != this.o) {
                this.n = width;
                this.o = height;
                this.s.b(width, height);
             }
          }
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKVerticalScrollView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.k == null) {
          return b;
       }
       int actionMasked = p0.getActionMasked();
       if (actionMasked) {
          if (actionMasked == 2) {
             float x = p0.getX();
             float y = p0.getY();
             this.f = this.f + Math.abs((x - this.e));
             this.g = this.g + Math.abs((y - this.d));
             this.e = x;
             this.d = y;
          }
       }else {
          this.g = 0;
          this.f = 0;
          this.e = p0.getX();
          this.d = p0.getY();
       }
       if (super.onInterceptTouchEvent(p0)) {
          if (p0.getActionMasked() == 2 && this.f - this.g > 0) {
             return b;
          }else {
             this.s.a(this, this.n, this.o);
             this.setScrollState(1);
             this.b = true;
             return 1;
          }
       }else {
          return b;
       }
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(TKVerticalScrollView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TKVerticalScrollView.class, "4")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       this.h = p0;
       this.i = p1;
       this.c = false;
       this.v.removeCallbacks(this.w);
       this.v.postDelayed(this.w, 200);
       View childAt = this.getChildAt(false);
       if (!this.getScrollY()) {
          this.s.f(this, this.n, this.o);
       }else if(childAt != null && (((this.getScrollY() + this.getHeight()) - this.getPaddingTop()) - this.getPaddingBottom()) == childAt.getHeight()){
          this.s.e(this, this.n, this.o);
       }
       this.l = true;
       if (this.t.a(p0, p1) && this.m != null) {
          long l = System.currentTimeMillis();
          if ((l - this.r) - this.q >= 0) {
             this.r = l;
             this.s.g(p0, p1);
          }
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKVerticalScrollView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int actionMasked = p0.getActionMasked();
       TKVerticalScrollView tb = this.b;
       boolean b = false;
       if (tb == null && !actionMasked) {
          this.b = true;
          this.s.a(this, this.n, this.o);
          this.setScrollState(true);
          this.setParentScrollableIfNeed(b);
       }else if(tb != null && (actionMasked == 1 || actionMasked == 3)){
          this.b = b;
          this.s.d(this, this.n, this.o);
          this.postOnAnimationDelayed(this.x, 60);
          this.setParentScrollableIfNeed(true);
       }
       if (this.k != null && super.onTouchEvent(p0)) {
          b = true;
       }
       return b;
    }
    public void setContainerView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKVerticalScrollView.class, "6")) {
          return;
       }
       if (p0.getParent() != null) {
          p0.getParent().removeView(p0);
       }
       this.removeAllViews();
       this.addView(p0);
       return;
    }
    public final void setParentScrollableIfNeed(boolean p0){
       if (PatchProxy.isSupport(TKVerticalScrollView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKVerticalScrollView.class, "16")) {
          return;
       }
       if (this.canScrollVertically(-1) || this.canScrollVertically(1)) {
          this.getParent().requestDisallowInterceptTouchEvent((p0 ^ 1));
       }
       return;
    }
    public void setScrollState(int p0){
       if (PatchProxy.isSupport(TKVerticalScrollView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKVerticalScrollView.class, "18")) {
          return;
       }
       if (p0 == this.p) {
          return;
       }
       this.p = p0;
       this.s.j(p0);
       return;
    }
}
