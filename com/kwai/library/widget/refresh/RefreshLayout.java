package com.kwai.library.widget.refresh.RefreshLayout;
import a2.x;
import a2.t;
import android.view.ViewGroup;
import android.os.Handler;
import android.os.Looper;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.library.widget.refresh.RefreshLayout$RefreshStyle;
import android.view.animation.DecelerateInterpolator;
import o17.f;
import com.kwai.library.widget.refresh.RefreshLayout$a;
import com.kwai.library.widget.refresh.RefreshLayout$b;
import com.kwai.library.widget.refresh.RefreshLayout$c;
import com.kwai.library.widget.refresh.RefreshLayout$d;
import android.view.ViewConfiguration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.utility.Log;
import a2.y;
import a2.u;
import android.view.View;
import o17.b;
import a2.i0;
import android.view.MotionEvent;
import a2.q;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import java.lang.Object;
import java.util.List;
import com.kwai.library.widget.refresh.RefreshLayout$e;
import java.lang.Enum;
import o17.j;
import android.view.animation.Animation$AnimationListener;
import o17.h;
import java.lang.Runnable;
import android.view.ViewParent;
import com.kwai.library.widget.refresh.KwaiRefreshView;
import java.util.ArrayList;
import android.view.ViewGroup$LayoutParams;
import com.kwai.library.widget.refresh.RefreshLayout$LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import java.lang.System;
import java.lang.Exception;
import java.io.PrintStream;
import com.kwai.library.widget.refresh.RefreshLayout$f;
import java.lang.Math;
import com.kwai.library.widget.refresh.config.KwaiRefreshManager;
import p17.c;
import com.yxcorp.utility.n;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Objects;
import o17.g;
import p17.a;
import r17.d;
import java.lang.ClassCastException;
import com.kwai.library.widget.refresh.RefreshLayout$i;
import o17.c;
import android.animation.ValueAnimator;
import android.view.View$MeasureSpec;
import com.kwai.library.widget.refresh.RefreshLayout$g;

public abstract class RefreshLayout extends ViewGroup implements x, t	// class@0009ce
{
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public View F;
    public boolean G;
    public boolean H;
    public boolean I;
    public RefreshLayout$RefreshStyle J;
    public View K;
    public RefreshLayout$f L;
    public RefreshLayout$LayoutParams M;
    public View N;
    public KwaiRefreshView O;
    public View P;
    public ValueAnimator Q;
    public b R;
    public j S;
    public RefreshLayout$g T;
    public RefreshLayout$i U;
    public Interpolator U0;
    public RefreshLayout$h V;
    public Interpolator V0;
    public List W;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;
    public final a a1;
    public final String b;
    public final Animation b1;
    public float c;
    public final Animation c1;
    public boolean d;
    public final Animation$AnimationListener d1;
    public final int[] e;
    public final Animation$AnimationListener e1;
    public final int[] f;
    public final u g;
    public final y h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public float x;
    public float y;
    public float z;
    public static final Handler f1;

    static {
       RefreshLayout.f1 = new Handler(Looper.getMainLooper());
    }
    public void RefreshLayout(Context p0){
       super(p0, null);
    }
    public void RefreshLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = "RefreshLayout";
       int[] ointArray = new int[2];
       this.e = ointArray;
       int[] ointArray1 = new int[2];
       this.f = ointArray1;
       this.o = -1;
       this.p = -1;
       this.q = -1;
       this.r = 300;
       this.s = 500;
       this.G = false;
       this.H = false;
       this.I = false;
       this.J = RefreshLayout$RefreshStyle.NORMAL;
       this.Q = null;
       this.U0 = new DecelerateInterpolator(2.00f);
       this.V0 = new DecelerateInterpolator(2.00f);
       this.X0 = true;
       this.Y0 = true;
       this.Z0 = false;
       this.a1 = new f(this);
       this.b1 = new RefreshLayout$a(this);
       this.c1 = new RefreshLayout$b(this);
       this.d1 = new RefreshLayout$c(this);
       this.e1 = new RefreshLayout$d(this);
       this.u = ViewConfiguration.get(p0).getScaledTouchSlop();
       DisplayMetrics density = c.c(this.getResources()).density;
       this.v = (int)(density * 70.00f);
       this.C = density * 70.00f;
       this.A = 0;
       Log.g("RefreshLayout", "mRefreshViewSize: "+this.v+" mRefreshTargetOffset: "+this.C);
       this.B = 0;
       this.D = 0x3f800000;
       this.h = new y(this);
       this.g = new u(this);
       this.l(p1);
       this.R = this.y();
       this.setNestedScrollingEnabled(true);
       i0.y0(this, true);
    }
    public View A(){
       return null;
    }
    public abstract View B(AttributeSet p0);
    public void C(MotionEvent p0){
       int i = q.e(p0, q.b(p0));
       this.q = i;
       float f = this.r(p0, i);
       this.y = f - this.z;
    }
    public void D(MotionEvent p0){
       int i = q.b(p0);
       if (q.e(p0, i) == this.q) {
          i = (!i)? 1: 0;
          this.q = q.e(p0, i);
       }
       this.y = this.r(p0, this.q) - this.z;
       return;
    }
    public void E(RefreshLayout$h p0){
       if (p0 != null) {
          RefreshLayout tW = this.W;
          if (tW != null && tW.contains(p0)) {
             this.W.remove(p0);
          }
       }
       return;
    }
    public void F(){
       if (RefreshLayout$e.a[this.J.ordinal()] != 1) {
          this.setTargetOrRefreshViewOffsetY((int)(0 - this.A));
       }else {
          this.setTargetOrRefreshViewOffsetY((int)(this.B - this.A));
       }
       this.z = 0;
       this.E = 0;
       this.S.reset();
       int i = 8;
       this.N.setVisibility(i);
       RefreshLayout tP = this.P;
       if (tP != null) {
          tP.setVisibility(i);
       }
       this.j = false;
       this.i = false;
       Log.g("RefreshLayout", "reset");
       return;
    }
    public void G(){
       this.x = 0;
       this.l = false;
       this.n = false;
       this.q = -1;
    }
    public final void H(boolean p0,boolean p1){
       if (this.j != p0) {
          Log.g("RefreshLayout", "setRefreshing: "+p0+" notify: "+p1);
          this.m = p1;
          this.j = p0;
          if (p0) {
             this.e((int)this.A, this.d1);
          }else {
             this.S.refreshComplete();
             Log.g("RefreshLayout", "refreshComplete");
             RefreshLayout.f1.postDelayed(new h(this), (long)this.S.refreshedAnimatorDuration());
          }
       }
       return;
    }
    public void I(int p0,boolean p1){
       RefreshLayout tF;
       RefreshLayout tP;
       float f1;
       if (this.K == null) {
          return;
       }
       int[] a = RefreshLayout$e.a;
       int i = a[this.J.ordinal()];
       RefreshLayout refreshLayou = 1;
       if (i != refreshLayou) {
          if (i != 0.00f) {
             this.K.offsetTopAndBottom(p0);
             tF = this.F;
             if (tF != null) {
                tF.offsetTopAndBottom(p0);
             }
             float f = ((float)p0 / this.D) + this.E;
             i = (int)f;
             this.E = f - (float)i;
             this.N.offsetTopAndBottom(i);
             tP = this.P;
             if (tP != null) {
                tP.offsetTopAndBottom(i);
             }
             this.A = (float)this.K.getTop();
          }else {
             this.K.offsetTopAndBottom(p0);
             tF = this.F;
             if (tF != null) {
                tF.offsetTopAndBottom(p0);
             }
             this.A = (float)this.K.getTop();
          }
       }else {
          this.N.offsetTopAndBottom(p0);
          tF = this.P;
          if (tF != null) {
             tF.offsetTopAndBottom(p0);
          }
          this.A = (float)this.N.getTop();
       }
       if (a[this.J.ordinal()] != refreshLayou) {
          tF = this.A;
          this.S.pullProgress(tF, (tF / this.C));
          tP = this.V;
          if (tP != null) {
             tF = this.A;
             tP.a(tF, (tF / this.C), p1);
          }
          if (this.W != null) {
             for (tP = 0; tP < this.W.size(); tP++) {
                refreshLayou = this.A;
                f1 = refreshLayou / this.C;
                this.W.get(tP).a(refreshLayou, f1, p1);
             }
          }
       }else {
          tF = this.A;
          this.S.pullProgress(tF, ((tF - this.B) / this.C));
          tP = this.V;
          if (tP != null) {
             tF = this.A;
             tP.a(tF, ((tF - this.B) / this.C), p1);
          }
          if (this.W != null) {
             for (tP = 0; tP < this.W.size(); tP++) {
                refreshLayou = this.A;
                f1 = refreshLayou - this.B;
                f1 = f1 / this.C;
                this.W.get(tP).a(refreshLayou, f1, p1);
             }
          }
       }
       if (this.X0 != null && (this.N.getVisibility() && this.A - null > 0)) {
          this.N.setVisibility(0);
          tP = this.P;
          if (tP != null) {
             tP.setVisibility(0);
          }
       }
       Log.g("RefreshLayout", "mTarget getTop: "+this.K.getTop());
       this.invalidate();
       return;
    }
    public boolean J(){
       boolean b = (this.W0 == null && (float)this.getTargetOrRefreshViewOffset() - this.C > 0)? true: false;
       return b;
    }
    public void K(View p0){
       if (p0 == this.F) {
          return;
       }
       if (p0 != null && p0.getParent() != null) {
          p0.getParent().removeView(p0);
       }
       if (p0 != null) {
          RefreshLayout tF = this.F;
          if (tF != null && tF.getParent() instanceof ViewGroup) {
             this.F.getParent().removeView(this.F);
          }
          p0.setVisibility(0);
          this.addView(p0);
       }
       this.F = p0;
       return;
    }
    public final KwaiRefreshView L(View p0){
       KwaiRefreshView kwaiRefreshV;
       if (p0 instanceof KwaiRefreshView) {
          return p0;
       }
       if (!p0 instanceof ViewGroup) {
          return null;
       }
       int i = 0;
       while (true) {
          if (i >= p0.getChildCount()) {
             return null;
          }
          View childAt = p0.getChildAt(i);
          if (childAt != null) {
             kwaiRefreshV = this.L(childAt);
             if (kwaiRefreshV != null) {
                break ;
             }
          }
          i = i + 1;
       }
       return kwaiRefreshV;
    }
    public void c(RefreshLayout$h p0){
       if (this.W == null) {
          this.W = new ArrayList();
       }
       if (p0 != null && !this.W.contains(p0)) {
          this.W.add(p0);
       }
       return;
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       return p0 instanceof RefreshLayout$LayoutParams;
    }
    public void d(int p0,Animation$AnimationListener p1){
       this.clearAnimation();
       float f = (float)p0;
       if (this.j(f) <= 0) {
          p1.onAnimationStart(null);
          p1.onAnimationEnd(null);
          return;
       }else {
          this.t = p0;
          this.c1.reset();
          this.c1.setDuration((long)this.j(f));
          this.c1.setInterpolator(this.U0);
          if (p1 != null) {
             this.c1.setAnimationListener(p1);
          }
          this.startAnimation(this.c1);
          return;
       }
    }
    public boolean dispatchNestedFling(float p0,float p1,boolean p2){
       return this.g.a(p0, p1, p2);
    }
    public boolean dispatchNestedPreFling(float p0,float p1){
       return this.g.b(p0, p1);
    }
    public boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3){
       return this.g.c(p0, p1, p2, p3);
    }
    public boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4){
       return this.g.f(p0, p1, p2, p3, p4);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       boolean i;
       if (this.Y0 != null) {
          i = q.c(p0);
          if (i == 1 || i == 3) {
             this.onStopNestedScroll(this);
          }
       }
       i = false;
       try{
          i = super.dispatchTouchEvent(p0);
       }catch(java.lang.Exception e3){
          System.out.println(e3.getMessage());
       }
       return i;
    }
    public final void e(int p0,Animation$AnimationListener p1){
       this.clearAnimation();
       float f = (float)p0;
       if (this.i(f) <= 0) {
          p1.onAnimationStart(null);
          p1.onAnimationEnd(null);
          return;
       }else {
          this.t = p0;
          this.b1.reset();
          this.b1.setDuration((long)this.i(f));
          this.b1.setInterpolator(this.V0);
          if (p1 != null) {
             this.b1.setAnimationListener(p1);
          }
          this.startAnimation(this.b1);
          return;
       }
    }
    public void f(float p0,float p1,float p2){
       RefreshLayout tt = this.t;
       float f = (float)tt;
       this.setTargetOrRefreshViewOffsetY((int)((float)(int)(f + ((p0 - (float)tt) * p2)) - p1));
    }
    public boolean g(View p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       RefreshLayout tL = this.L;
       if (tL != null) {
          return tL.a(this, p0);
       }
       if (p0 instanceof ViewGroup) {
          ViewGroup viewGroup = p0;
          int childCount = viewGroup.getChildCount();
          while (b < childCount) {
             if (this.g(viewGroup.getChildAt(b))) {
                return true;
             }
             b = b + 1;
          }
       }
       return i0.e(p0, -1);
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return new RefreshLayout$LayoutParams(-2, -2);
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return new RefreshLayout$LayoutParams(this.getContext(), p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return new RefreshLayout$LayoutParams(p0);
    }
    public int getChildDrawingOrder(int p0,int p1){
       if (RefreshLayout$e.a[this.J.ordinal()] != 1) {
          if (this.p != -1) {
             return this.p(p1);
          }else {
             return this.q(p1);
          }
       }else {
          RefreshLayout to = this.o;
          if (to < null) {
             return p1;
          }
          if (p1 == (p0 - 1)) {
             return to;
          }
          if (p1 >= to) {
             p1 = p1 + 1;
          }
          return p1;
       }
    }
    public int getNestedScrollAxes(){
       return this.h.a();
    }
    public int getOverScrollYOffset(){
       return 0;
    }
    public float getRefreshTargetOffset(){
       return this.C;
    }
    public View getStateView(){
       return this.F;
    }
    public int getTargetOrRefreshViewOffset(){
       if (RefreshLayout$e.a[this.J.ordinal()] == 1) {
          return (int)((float)this.N.getTop() - this.B);
       }
       RefreshLayout tK = this.K;
       int i = (tK == null)? 0: tK.getTop();
       return i;
    }
    public int getTargetOrRefreshViewTop(){
       if (RefreshLayout$e.a[this.J.ordinal()] != 1) {
          return this.K.getTop();
       }
       return this.N.getTop();
    }
    public int getTouchSlop(){
       return this.u;
    }
    public boolean h(){
       return true;
    }
    public boolean hasNestedScrollingParent(){
       return this.g.k();
    }
    public final int i(float p0){
       RefreshLayout ts;
       if (RefreshLayout$e.a[this.J.ordinal()] != 1) {
          p0 = Math.max(0, Math.min(0x3f800000, (Math.abs((p0 - this.C)) / this.C)));
          ts = this.s;
       }else {
          p0 = Math.max(0, Math.min(0x3f800000, (Math.abs(((p0 - this.B) - this.C)) / this.C)));
          ts = this.s;
       }
       return (int)(p0 * (float)ts);
    }
    public boolean isNestedScrollingEnabled(){
       return this.g.m();
    }
    public final int j(float p0){
       RefreshLayout tr;
       if (p0 - this.B < 0) {
          return 0;
       }
       if (RefreshLayout$e.a[this.J.ordinal()] != 1) {
          p0 = Math.max(0, Math.min(0x3f800000, (Math.abs(p0) / this.C)));
          tr = this.r;
       }else {
          p0 = Math.max(0, Math.min(0x3f800000, (Math.abs((p0 - this.B)) / this.C)));
          tr = this.r;
       }
       return (int)(p0 * (float)tr);
    }
    public final void k(){
       if (!KwaiRefreshManager.c()) {
          return;
       }
       c uoc = KwaiRefreshManager.a();
       if (uoc == null) {
          return;
       }
       int i = uoc.g();
       int i1 = uoc.d();
       if (i > 0 && i1 > 0) {
          if (this.M == null) {
             return;
          }else {
             this.N.setLayoutParams(new RefreshLayout$LayoutParams(Math.max(n.c(this.getContext(), (float)i), this.M.width), Math.max(n.c(this.getContext(), (float)i1), this.M.height)));
          }
       }
       return;
    }
    public void l(AttributeSet p0){
       this.N = this.B(p0);
       this.P = this.A();
       int i = 8;
       this.N.setVisibility(i);
       RefreshLayout tN = this.N;
       if (!tN instanceof j) {
          throw new ClassCastException("the refreshView must implement the interface IRefreshStatus");
       }
       this.S = tN;
       RefreshLayout$LayoutParams layoutParams = this.z(p0);
       if (layoutParams == null) {
          layoutParams = new RefreshLayout$LayoutParams(this.v, this.v);
       }
       this.M = layoutParams;
       this.addView(this.N, layoutParams);
       this.k();
       RefreshLayout tP = this.P;
       if (tP != null) {
          tP.setVisibility(i);
          KwaiRefreshView kwaiRefreshV = this.L(this.N);
          this.O = kwaiRefreshV;
          if (kwaiRefreshV != null) {
             tN = this.a1;
             Objects.requireNonNull(tN);
             kwaiRefreshV.setOnRefreshInvalidCallback(new g(tN));
          }
          if (KwaiRefreshManager.d(this.a1)) {
             this.a1.a();
          }
          this.addView(this.P);
       }
       return;
    }
    public boolean m(){
       return false;
    }
    public void n(){
       if (!this.v()) {
          int i = 0;
          while (i < this.getChildCount()) {
             View childAt = this.getChildAt(i);
             if (!childAt.equals(this.N) && (!childAt.equals(this.F) && !childAt.equals(this.P))) {
                this.K = childAt;
                Log.g("RefreshLayout", "target get: "+childAt);
                break ;
             }
             i = i + 1;
          }
       }
       return;
    }
    public void o(){
       if (this.j == null && this.i == null) {
          RefreshLayout tU = this.U;
          boolean b = true;
          if (tU != null && tU.a(this.z, b)) {
             return;
          }else if(this.J()){
             this.H(b, b);
          }else {
             this.j = false;
             this.d((int)this.A, this.e1);
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       Log.g("RefreshLayout", "onDetachedFromWindow");
       this.F();
       this.clearAnimation();
       super.onDetachedFromWindow();
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       float f;
       this.n();
       RefreshLayout tK = this.K;
       boolean b = false;
       if (tK == null) {
          return b;
       }
       if (tK instanceof c && !tK.r()) {
          return b;
       }
       int i = 1;
       if (RefreshLayout$e.a[this.J.ordinal()] != i) {
          if (!this.m() && (!this.isEnabled() || (this.g(this.K) && this.n == null))) {
             return b;
          }
       }else if(this.isEnabled() && (!this.g(this.K) && (this.j != null || this.d != null))){
          return b;
       }
       int i1 = q.c(p0);
       if (i1) {
          if (i1 != i) {
             if (i1 != 2) {
                if (i1 != 3) {
                   if (i1 == 6) {
                      this.D(p0);
                   }
                }
             }else {
                tK = this.q;
                if (tK == -1) {
                   return b;
                }else {
                   f = this.r(p0, tK);
                   if (!f - 0xbf800000) {
                      return b;
                   }else {
                      this.t(f);
                      RefreshLayout tQ = this.Q;
                      if (tQ != null && tQ.isRunning()) {
                         this.Q.cancel();
                         this.S.refreshComplete();
                         Log.g("RefreshLayout", "refreshComplete");
                         this.d((int)this.A, this.e1);
                      }
                   }
                }
             }
          }
          this.l = b;
          this.q = -1;
       }else {
          i1 = p0.getPointerId(b);
          this.q = i1;
          this.l = b;
          f = this.r(p0, i1);
          if (!f - 0xbf800000) {
             return b;
          }else if(this.b1.hasEnded() && this.c1.hasEnded()){
             this.i = b;
          }
          this.w = f;
          this.x = this.A;
          this.n = b;
       }
       return this.l;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       RefreshLayout tF;
       int i;
       if (!this.getChildCount()) {
          return;
       }
       this.n();
       if (this.K == null) {
          return;
       }
       int measuredWidt = this.getMeasuredWidth();
       p1 = this.getMeasuredHeight();
       RefreshLayout refreshLayou = 1;
       p4 = 2;
       RefreshLayout refreshLayou1 = 8;
       if (this.K.getVisibility() == refreshLayou1) {
          tF = this.F;
          if (tF != null && tF.getVisibility() != refreshLayou1) {
          label_002d :
             tF = this.getPaddingTop();
             i = RefreshLayout$e.a[this.J.ordinal()];
             if (i != refreshLayou) {
                RefreshLayout tA = (i != p4)? this.A: this.A;
                tF = tF + (int)tA;
             }
             i = this.getPaddingLeft();
             int i1 = ((i + measuredWidt) - this.getPaddingLeft()) - this.getPaddingRight();
             p1 = ((p1 + tF) - this.getPaddingTop()) - this.getPaddingBottom();
             if (this.K.getVisibility() != refreshLayou1) {
                this.K.layout(i, tF, i1, p1);
             }
             RefreshLayout tF1 = this.F;
             if (tF1 != null && tF1.getVisibility() != refreshLayou1) {
                this.F.layout(i, tF, i1, p1);
             }
          }
       }else {
          goto label_002d ;
       }
       ViewGroup$MarginLayoutParams layoutParams = this.N.getLayoutParams();
       tF = (measuredWidt - this.N.getMeasuredWidth()) / p4;
       int i2 = (int)this.B;
       i = RefreshLayout$e.a[this.J.ordinal()];
       if (i != refreshLayou) {
          if (i != p4) {
             refreshLayou = this.A;
          }else {
          label_00a6 :
             i2 = (i2 + layoutParams.topMargin) - layoutParams.bottomMargin;
             measuredWidt = (measuredWidt + this.N.getMeasuredWidth()) / p4;
             layoutParams = this.N.getMeasuredHeight() + i2;
             refreshLayou = this.P;
             if (refreshLayou != null) {
                refreshLayou.layout(0, (layoutParams - refreshLayou.getMeasuredHeight()), this.P.getMeasuredWidth(), layoutParams);
             }
             this.N.layout(tF, i2, measuredWidt, layoutParams);
             return;
          }
       }else {
          refreshLayou = this.A;
       }
       i2 = i2 + (int)refreshLayou;
       goto label_00a6 ;
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       this.n();
       RefreshLayout tK = this.K;
       if (tK == null) {
          return;
       }
       int i = 0x40000000;
       tK.measure(View$MeasureSpec.makeMeasureSpec(((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()), i), View$MeasureSpec.makeMeasureSpec(((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()), i));
       tK = this.P;
       if (tK != null) {
          ViewGroup$LayoutParams layoutParams1 = tK.getLayoutParams();
          if (layoutParams1 != null) {
             this.P.measure(View$MeasureSpec.makeMeasureSpec(layoutParams1.width, i), View$MeasureSpec.makeMeasureSpec(layoutParams1.height, i));
          }
       }
       tK = this.F;
       if (tK != null) {
          tK.measure(View$MeasureSpec.makeMeasureSpec(((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()), i), View$MeasureSpec.makeMeasureSpec(((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()), i));
       }
       ViewGroup$MarginLayoutParams layoutParams = this.N.getLayoutParams();
       int i1 = 0;
       p0 = (layoutParams.width == -1)? View$MeasureSpec.makeMeasureSpec(Math.max(i1, ((((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()) - layoutParams.leftMargin) - layoutParams.rightMargin)), i): ViewGroup.getChildMeasureSpec(p0, (((this.getPaddingLeft() + this.getPaddingRight()) + layoutParams.leftMargin) + layoutParams.rightMargin), layoutParams.width);
       p1 = (layoutParams.height == -1)? View$MeasureSpec.makeMeasureSpec(Math.max(i1, ((((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin)), i): ViewGroup.getChildMeasureSpec(p1, (((this.getPaddingTop() + this.getPaddingBottom()) + layoutParams.topMargin) + layoutParams.bottomMargin), layoutParams.height);
       this.N.measure(p0, p1);
       boolean b = true;
       if (this.I == null && this.H == null) {
          p0 = RefreshLayout$e.a[this.J.ordinal()];
          if (p0 != b) {
             float f = 0;
             if (p0 != 2) {
                this.A = f;
                this.B = (float)(- this.N.getMeasuredHeight());
             }else {
                this.B = f;
                this.A = f;
             }
          }else {
             float f1 = (float)(- this.N.getMeasuredHeight());
             this.B = f1;
             this.A = f1;
          }
       }
       if (this.I == null && (this.G == null && this.C - (float)this.N.getMeasuredHeight() < 0)) {
          this.C = (float)this.N.getMeasuredHeight();
       }
    label_014c :
       this.I = b;
       this.o = -1;
       p0 = this.getChildCount();
       b = 0;
       while (b < p0) {
          if (this.getChildAt(b) == this.N) {
             this.o = b;
             break ;
          }
          b++;
       }
       if (this.P != null) {
          this.p = -1;
          while (i1 < p0) {
             if (this.getChildAt(i1) == this.P) {
                this.p = i1;
                break ;
             }
             i1 = i1 + 1;
          }
       }
       return;
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       return this.dispatchNestedFling(p1, p2, p3);
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       return this.dispatchNestedPreFling(p1, p2);
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3){
       RefreshLayout tc;
       boolean b = false;
       if (p2 > 0) {
          tc = this.c;
          float f = 0;
          if (tc - f > 0) {
             float f1 = (float)p2;
             if (f1 - tc > 0) {
                p3[1] = p2 - (int)tc;
                this.c = f;
             }else {
                this.c = tc - f1;
                p3[1] = p2;
             }
             Log.g("RefreshLayout", "pre scroll");
             this.w(this.c, b);
          }
       }
       tc = this.e;
       if (this.dispatchNestedPreScroll((p1 - p3[b]), (p2 - p3[1]), tc, null)) {
          p3[b] = p3[b] + tc[b];
          p3[1] = p3[1] + tc[1];
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4){
       this.dispatchNestedScroll(p1, p2, p3, p4, this.f);
       p4 = p4 + this.f[1];
       if (p4 < 0 && this.h()) {
          this.c = this.c + (float)Math.abs(p4);
          Log.g("RefreshLayout", "nested scroll");
          this.w(this.c, 1);
       }
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2){
       this.h.b(p0, p1, p2);
       this.startNestedScroll((p2 & 0x02));
       this.c = 0;
       this.d = true;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       boolean b = false;
       if (RefreshLayout$e.a[this.J.ordinal()] != 1) {
          if (this.isEnabled() && (this.g(this.K) && (p2 & 0x02))) {
             b = true;
          }
       label_0021 :
          return b;
       }else if(this.isEnabled() && (this.g(this.K) && (this.j == null && (p2 & 0x02)))){
          b = true;
       }
    label_0039 :
       return b;
    }
    public void onStopNestedScroll(View p0){
       this.h.d(p0);
       this.d = false;
       if (this.c > 0) {
          this.o();
          this.c = 0;
       }
       this.stopNestedScroll();
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       RefreshLayout tq;
       float f1;
       this.n();
       boolean b = false;
       if (this.K == null) {
          return b;
       }
       if (RefreshLayout$e.a[this.J.ordinal()] != 1) {
          if (!this.isEnabled() || (this.g(this.K) && this.n == null)) {
             return b;
          }
       }else if(this.isEnabled() && (this.g(this.K) || this.d != null)){
          return b;
       }
       if (this.J == RefreshLayout$RefreshStyle.FLOAT && (this.g(this.K) || this.d != null)) {
          return b;
       }else {
          int action = p0.getAction();
          if (action) {
             int i = 0xbf800000;
             RefreshLayout refreshLayou = -1;
             if (action != 1) {
                if (action != 2) {
                   if (action != 3) {
                      if (action != 5) {
                         if (action == 6) {
                            this.D(p0);
                         }
                      }else {
                         this.C(p0);
                      }
                   }
                }else {
                   tq = this.q;
                   if (tq == refreshLayou) {
                      return b;
                   }else {
                      float f = this.r(p0, tq);
                      if (!f - i) {
                         return b;
                      }else if(this.i != null){
                         f1 = (float)this.getTargetOrRefreshViewTop();
                         this.y = f;
                         this.x = f1;
                      }else {
                         f1 = (((float)this.getOverScrollYOffset() + f) - this.y) + this.x;
                      }
                      if (this.j != null) {
                         if (f1 <= 0) {
                            if (this.n != null) {
                               this.K.dispatchTouchEvent(p0);
                            }else {
                               p0 = MotionEvent.obtain(p0);
                               p0.setAction(b);
                               this.n = true;
                               this.K.dispatchTouchEvent(p0);
                            }
                         }else if(f1 > 0 && (f1 - this.C < 0 && this.n != null)){
                            p0 = MotionEvent.obtain(p0);
                            p0.setAction(3);
                            this.n = b;
                            this.K.dispatchTouchEvent(p0);
                         }
                         this.w(f1, true);
                      }else if(this.l != null){
                         if (f1 > 0) {
                            this.w(f1, true);
                         }else {
                            return b;
                         }
                      }else {
                         this.t(f);
                      }
                   }
                }
             }
             tq = this.q;
             if (tq == refreshLayou || !this.r(p0, tq) - i) {
                this.G();
                return b;
             }else if(this.j != null || this.i != null){
                if (this.n != null) {
                   this.K.dispatchTouchEvent(p0);
                }
                this.G();
                return b;
             }else {
                this.G();
                this.o();
                return b;
             }
          }else {
             this.q = q.e(p0, b);
             this.l = b;
          }
          return true;
       }
    }
    public int p(int p0){
       RefreshLayout to = this.o;
       if (to < null) {
          return p0;
       }
       if (!p0) {
          return this.p;
       }
       if (p0 == 1) {
          return to;
       }
       if (p0 > Math.max(this.p, to)) {
          return p0;
       }
       int i = p0 - 2;
       if (i >= Math.min(this.p, this.o)) {
          return (p0 - 1);
       }
       return i;
    }
    public int q(int p0){
       RefreshLayout to = this.o;
       if (to < null) {
          return p0;
       }
       if (!p0) {
          return to;
       }
       if (p0 <= to) {
          p0--;
       }
       return p0;
    }
    public float r(MotionEvent p0,int p1){
       p1 = q.a(p0, p1);
       if (p1 < 0) {
          return 0xbf800000;
       }
       return q.g(p0, p1);
    }
    public void requestDisallowInterceptTouchEvent(boolean p0){
       RefreshLayout tK = this.K;
       if (tK == null || i0.Z(tK)) {
          super.requestDisallowInterceptTouchEvent(p0);
       }
       return;
    }
    public void s(){
       RefreshLayout tF = this.F;
       if (tF != null && tF.getVisibility() != 8) {
          this.F.setVisibility(8);
          this.removeView(this.F);
       }
       this.F = null;
       return;
    }
    public void setAnimateToRefreshDuration(int p0){
       this.s = p0;
    }
    public void setAnimateToRefreshInterpolator(Interpolator p0){
       this.V0 = p0;
    }
    public void setAnimateToStartDuration(int p0){
       this.r = p0;
    }
    public void setAnimateToStartInterpolator(Interpolator p0){
       this.U0 = p0;
    }
    public void setChildScrollUpCallback(RefreshLayout$f p0){
       this.L = p0;
    }
    public void setDragDistanceConverter(b p0){
       Objects.requireNonNull(p0, "the dragDistanceConverter can\'t be null");
       this.R = p0;
    }
    public void setIsStopNestScrollWhenUpOrCancel(boolean p0){
       this.Y0 = p0;
    }
    public void setNestedScrollingEnabled(boolean p0){
       this.g.n(p0);
    }
    public void setOnRefreshListener(RefreshLayout$g p0){
       this.T = p0;
    }
    public void setOnRefreshStatusListener(RefreshLayout$h p0){
       this.V = p0;
    }
    public void setOnScrollInterceptor(RefreshLayout$i p0){
       this.U = p0;
    }
    public void setOnlySupportPull(boolean p0){
       this.W0 = p0;
    }
    public void setRefreshInitialOffset(float p0){
       this.B = p0;
       this.H = true;
       this.requestLayout();
    }
    public void setRefreshStyle(RefreshLayout$RefreshStyle p0){
       this.J = p0;
    }
    public void setRefreshTargetOffset(float p0){
       this.C = p0;
       this.G = true;
       this.requestLayout();
    }
    public void setRefreshing(boolean p0){
       if (this.j == p0) {
          return;
       }
       Log.g("RefreshLayout", "setRefreshing: "+p0);
       boolean b = false;
       if (p0) {
          if (this.getAnimation() != null && !this.getAnimation().hasEnded()) {
             this.getAnimation().setAnimationListener(null);
             this.clearAnimation();
             this.F();
          }
          this.j = p0;
          this.m = b;
          this.e((int)this.A, this.d1);
       }else {
          this.H(p0, b);
       }
       return;
    }
    public void setShowRefreshView(boolean p0){
       this.setOnlySupportPull((p0 ^ 0x01));
       this.X0 = p0;
    }
    public void setTargetOrRefreshViewOffsetY(int p0){
       this.I(p0, false);
    }
    public boolean startNestedScroll(int p0){
       return this.g.p(p0);
    }
    public void stopNestedScroll(){
       this.g.r();
    }
    public void t(float p0){
       RefreshLayout tw = this.w;
       p0 = p0 - tw;
       if (this.j != null) {
          RefreshLayout tu = this.u;
          if (p0 - (float)tu > 0 || this.A > 0) {
             this.l = true;
             this.y = tw + (float)tu;
          }else if(this.l == null){
             tu = this.u;
             if (p0 - (float)tu > 0) {
                this.y = tw + (float)tu;
                this.l = true;
             }
          }
       }else {
          goto label_001d ;
       }
       return;
    }
    public boolean u(){
       return this.j;
    }
    public boolean v(){
       RefreshLayout tK = this.K;
       if (tK == this.F || (tK != this.N && tK != this.P)) {
          int i = 0;
          while (i < this.getChildCount()) {
             if (this.K == this.getChildAt(i)) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public void w(float p0,boolean p1){
       RefreshLayout refreshLayou;
       this.z = p0;
       RefreshLayout tU = this.U;
       boolean b = false;
       if (tU != null && tU.a(p0, b)) {
          return;
       }
       if (this.j == null) {
          if (RefreshLayout$e.a[this.J.ordinal()] != 1) {
             p0 = this.R.a(p0, this.C);
             tU = this.C;
          }else {
             p0 = this.R.a(p0, this.C) + this.B;
             tU = this.C;
          }
       }else {
          tU = this.C;
          if (p0 - tU > 0) {
             refreshLayou = tU;
          }
          if (refreshLayou - null < 0) {
             refreshLayou = 0;
          }
       }
       if (this.j == null) {
          if (p0 - tU > 0 && this.k == null) {
             this.k = true;
             this.S.pullToRefresh();
             Log.g("RefreshLayout", "pullToRefresh");
             tU = this.V;
             if (tU != null) {
                tU.pullToRefresh();
             }
             if (this.W != null) {
                for (; b < this.W.size(); b = b + 1) {
                   this.W.get(b).pullToRefresh();
                }
             }
          }else if(p0 - tU <= 0 && this.k != null){
             this.k = b;
             this.S.releaseToRefresh();
             Log.g("RefreshLayout", "releaseToRefresh");
             tU = this.V;
             if (tU != null) {
                tU.releaseToRefresh();
             }
             if (this.W != null) {
                for (; b < this.W.size(); b = b + 1) {
                   this.W.get(b).releaseToRefresh();
                }
             }
          }
       }
       this.I((int)(p0 - this.A), p1);
       return;
    }
    public void x(View p0){
    }
    public abstract b y();
    public RefreshLayout$LayoutParams z(AttributeSet p0){
       return null;
    }
}
