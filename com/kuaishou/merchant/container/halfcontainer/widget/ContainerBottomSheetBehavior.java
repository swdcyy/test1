package com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior$b;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.util.TypedValue;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.ViewConfiguration;
import com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior$c;
import java.lang.Math;
import java.lang.Integer;
import java.lang.ref.WeakReference;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import a2.i0;
import android.view.ViewGroup;
import java.lang.Float;
import java.lang.Number;
import android.view.VelocityTracker;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.MotionEvent;
import java.util.Objects;
import com.kuaishou.merchant.container.halfcontainer.widget.a;
import a2.q;
import com.kuaishou.merchant.container.halfcontainer.widget.a$c;
import android.content.res.Resources;
import cw9.c;
import android.os.Parcelable;
import com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior$SavedState;
import androidx.customview.view.AbsSavedState;
import com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior$d;
import java.lang.Runnable;
import android.view.ViewParent;
import com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior$a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.HashMap;
import java.util.Map;

public class ContainerBottomSheetBehavior extends CoordinatorLayout$Behavior	// class@001639
{
    public Map A;
    public float B;
    public float C;
    public float D;
    public float E;
    public boolean F;
    public final a$c G;
    public boolean a;
    public float b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public boolean l;
    public int m;
    public a n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    public int s;
    public WeakReference t;
    public WeakReference u;
    public ContainerBottomSheetBehavior$c v;
    public VelocityTracker w;
    public int x;
    public int y;
    public boolean z;

    public void ContainerBottomSheetBehavior(){
       super();
       this.a = true;
       this.m = 4;
       this.B = 0x3f800000;
       this.C = 0x3f800000;
       this.D = 0x3f000000;
       this.E = 0x3f000000;
       this.G = new ContainerBottomSheetBehavior$b(this);
    }
    public void ContainerBottomSheetBehavior(Context p0,AttributeSet p1){
       ContainerBottomSheetBehavior tm;
       super(p0, p1);
       int b = true;
       this.a = b;
       this.m = 4;
       this.B = 0x3f800000;
       this.C = 0x3f800000;
       this.D = 0x3f000000;
       this.E = 0x3f000000;
       this.G = new ContainerBottomSheetBehavior$b(this);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.D);
       int i = 2;
       TypedValue typedValue = typedArray.peekValue(i);
       boolean b1 = -1;
       if (typedValue != null) {
          typedValue = typedValue.data;
          if (typedValue == b1) {
             this.setPeekHeight(typedValue);
          label_0039 :
             this.setHideable(typedArray.getBoolean(b, false));
             b = typedArray.getBoolean(false, b);
             ContainerBottomSheetBehavior uContainerBo = ContainerBottomSheetBehavior.class;
             if (!PatchProxy.isSupport(uContainerBo) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uContainerBo, "9") && this.a != b)) {
                this.a = b;
                if (this.t != null) {
                   this.calculateCollapsedOffset();
                }
                b = (this.a != null && this.m == 6)? 3: this.m;
                this.setStateInternal(b);
             }
             this.l = typedArray.getBoolean(3, false);
             typedArray.recycle();
             this.b = (float)ViewConfiguration.get(p0).getScaledMaximumFlingVelocity();
             this.d(this.m);
             return;
          }
       }
       this.setPeekHeight(typedArray.getDimensionPixelSize(i, b1));
       goto label_0039 ;
    }
    public void c(ContainerBottomSheetBehavior$c p0){
       this.v = p0;
    }
    public final void calculateCollapsedOffset(){
       if (PatchProxy.applyVoid(null, this, ContainerBottomSheetBehavior.class, "13")) {
          return;
       }
       this.i = (this.a != null)? Math.max((this.s - this.f), this.g): this.s - this.f;
       return;
    }
    public final void d(int p0){
       if (p0 != 3) {
          if (p0 == 4 || (p0 == 5 || p0 == 6)) {
             this.F = false;
          }
       }else {
          this.F = true;
       }
       return;
    }
    public void dispatchOnSlide(int p0){
       ContainerBottomSheetBehavior uContainerBo = ContainerBottomSheetBehavior.class;
       if (PatchProxy.isSupport(uContainerBo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uContainerBo, "20")) {
          return;
       }
       View view = this.t.get();
       if (view != null && this.v != null) {
          ContainerBottomSheetBehavior ti = this.i;
          this.j = (p0 > ti)? (float)(ti - p0) / (float)(this.s - ti): (float)(ti - p0) / (float)(ti - this.getExpandedOffset());
          this.v.f(view, this.j);
       }
       return;
    }
    public void e(float p0){
       this.E = p0;
    }
    public View findScrollingChild(View p0){
       ContainerBottomSheetBehavior obj = PatchProxy.applyOneRefs(p0, this, ContainerBottomSheetBehavior.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (i0.Z(p0)) {
          obj = this.v;
          if (obj == null || !obj.h(p0)) {
             if (!p0.getVisibility()) {
                return p0;
             }else {
                return null;
             }
          }
       }
       if (p0 instanceof ViewGroup) {
          int i = 0;
          int childCount = p0.getChildCount();
          while (i < childCount) {
             View view = this.findScrollingChild(p0.getChildAt(i));
             if (view != null) {
                return view;
             }
             i = i + 1;
          }
       }
       return null;
    }
    public boolean g(View p0,float p1){
       ContainerBottomSheetBehavior uContainerBo = ContainerBottomSheetBehavior.class;
       if (PatchProxy.isSupport(uContainerBo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, uContainerBo, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0.getTop() > this.i) {
          return b;
       }else {
          int expandedOffs = this.getExpandedOffset();
          ContainerBottomSheetBehavior tC = (this.F != null)? this.C: this.B;
          float f = (float)expandedOffs;
          float f1 = Math.max(f, ((float)p0.getTop() + (p1 * tC)));
          if (!f1 - f) {
             return true;
          }else {
             tC = this.i;
             expandedOffs = tC - expandedOffs;
             if (this.F == null) {
                f = (float)tC;
             }
             f1 = Math.abs((f1 - f)) / (float)expandedOffs;
             if (this.F != null) {
                if (f1 - this.E <= 0) {
                   b = true;
                }
                return b;
             }else if(f1 - this.D >= 0){
                b = true;
             }
             return b;
          }
       }
    }
    public int getExpandedOffset(){
       ContainerBottomSheetBehavior tg = (this.a != null)? this.g: 0;
       return tg;
    }
    public final int getState(){
       return this.m;
    }
    public final float getYVelocity(){
       ContainerBottomSheetBehavior obj = PatchProxy.apply(null, this, ContainerBottomSheetBehavior.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.w;
       if (obj == null) {
          return 0;
       }
       obj.computeCurrentVelocity(1000, this.b);
       return this.w.getYVelocity(this.x);
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       int i;
       ContainerBottomSheetBehavior obj1;
       boolean b2;
       int i1;
       View view;
       int i4;
       ContainerBottomSheetBehavior uContainerBo = this;
       CoordinatorLayout uCoordinator = p0;
       MotionEvent motionEvent = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ContainerBottomSheetBehavior.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int b = false;
       int b1 = true;
       if (!p1.isShown()) {
          uContainerBo.o = b1;
          return b;
       }else {
          int actionMasked = p2.getActionMasked();
          if (!actionMasked) {
             this.reset();
          }
          if (uContainerBo.w == null) {
             uContainerBo.w = VelocityTracker.obtain();
          }
          uContainerBo.w.addMovement(motionEvent);
          ContainerBottomSheetBehavior uContainerBo1 = -1;
          a uoa = 3;
          if (actionMasked) {
             if (actionMasked == b1 || actionMasked == uoa) {
                uContainerBo.z = b;
                uContainerBo.x = uContainerBo1;
                if (uContainerBo.o != null) {
                   uContainerBo.o = b;
                   return b;
                }
             }
          }else {
             i = (int)p2.getX();
             uContainerBo.y = (int)p2.getY();
             obj1 = uContainerBo.u;
             View view3 = (obj1 != null)? obj1.get(): null;
             if (view3 != null && uCoordinator.C(view3, i, uContainerBo.y)) {
                uContainerBo.x = motionEvent.getPointerId(p2.getActionIndex());
                uContainerBo.z = b1;
             }
             b2 = (uContainerBo.p == null && (uContainerBo.x == uContainerBo1 && !uCoordinator.C(p1, i, uContainerBo.y)))? true: false;
             uContainerBo.o = b2;
          }
          i = 2;
          if (uContainerBo.o == null) {
             uContainerBo1 = uContainerBo.n;
             if (uContainerBo1 != null) {
                Objects.requireNonNull(uContainerBo1);
                obj1 = PatchProxy.applyOneRefs(motionEvent, uContainerBo1, a.class, "24");
                if (obj1 != patchProxyRe) {
                   b2 = obj1.booleanValue();
                   i1 = 0;
                }else {
                   int i2 = q.c(p2);
                   int i3 = q.b(p2);
                   if (!i2) {
                      uContainerBo1.a();
                   }
                   if (uContainerBo1.o == null) {
                      uContainerBo1.o = VelocityTracker.obtain();
                   }
                   uContainerBo1.o.addMovement(motionEvent);
                   if (i2) {
                      if (i2 != b1) {
                         if (i2 != i) {
                            if (i2 != uoa) {
                               if (i2 != 5) {
                                  if (i2 == 6) {
                                     uContainerBo1.g(q.e(motionEvent, i3));
                                  }
                               }else {
                                  i4 = q.e(motionEvent, i3);
                                  float f = q.f(motionEvent, i3);
                                  float f1 = q.g(motionEvent, i3);
                                  uContainerBo1.p(f, f1, i4);
                                  a d = uContainerBo1.d;
                                  if (d == null) {
                                     if (uContainerBo1.k[i4] & uContainerBo1.s) {
                                        Objects.requireNonNull(uContainerBo1.b);
                                     }
                                  }else if(d == i){
                                     View view1 = uContainerBo1.j((int)f, (int)f1);
                                     if (view1 == uContainerBo1.u) {
                                        uContainerBo1.t(view1, i4);
                                     }
                                  }
                               }
                            }else {
                            label_01af :
                               uContainerBo1.a();
                            }
                         }else if(uContainerBo1.g == null || uContainerBo1.h == null){
                            i4 = q.d(p2);
                            i2 = 0;
                            while (i2 < i4) {
                               i3 = q.e(motionEvent, i2);
                               if (uContainerBo1.m(i3)) {
                                  float f2 = q.f(motionEvent, i2);
                                  float f3 = q.g(motionEvent, i2);
                                  float f4 = f2 - uContainerBo1.g[i3];
                                  float f5 = f3 - uContainerBo1.h[i3];
                                  View view2 = uContainerBo1.j((int)f2, (int)f3);
                                  f3 = (view2 != null && uContainerBo1.d(view2, f4, f5))? Float.MIN_VALUE: 0;
                                  if (f3) {
                                     i1 = (int)f4;
                                     i = view2.getLeft() + i1;
                                     uContainerBo1.b.a(view2, i, i1);
                                     b = view2.getTop();
                                     i1 = (int)f5;
                                     i = b + i1;
                                     b1 = uContainerBo1.b.b(view2, i, i1);
                                     Objects.requireNonNull(uContainerBo1.b);
                                     i1 = uContainerBo1.b.c(view2);
                                     if (!i1 || (i1 > 0 && b1 == b)) {
                                        break ;
                                     }
                                  }
                                  uContainerBo1.o(f4, f5, i3);
                                  if (uContainerBo1.d == 1 || (f3 && uContainerBo1.t(view2, i3))) {
                                     break ;
                                  }
                               }
                            label_01a5 :
                               i2 = i2 + 1;
                               i = 2;
                            }
                         label_01ab :
                            uContainerBo1.q(motionEvent);
                         }
                      }else {
                         goto label_01af ;
                      }
                      i1 = 0;
                   }else {
                      float x = p2.getX();
                      float y = p2.getY();
                      i4 = q.e(motionEvent, 0);
                      uContainerBo1.p(x, y, i4);
                      view = uContainerBo1.j((int)x, (int)y);
                      if (view == uContainerBo1.u && uContainerBo1.d == 2) {
                         uContainerBo1.t(view, i4);
                      }
                      if (uContainerBo1.k[i4] & uContainerBo1.s) {
                         Objects.requireNonNull(uContainerBo1.b);
                      }
                   }
                   b1 = true;
                   if (uContainerBo1.d == b1) {
                      b2 = true;
                   }else {
                      b2 = false;
                   }
                }
                if (b2) {
                   return b1;
                }else {
                label_01f0 :
                   ContainerBottomSheetBehavior u = uContainerBo.u;
                   view = (u != null)? u.get(): null;
                   b = (actionMasked == 2 && (view != null && (uContainerBo.o == null && (uContainerBo.m != 1 && (!uCoordinator.C(view, (int)p2.getX(), (int)p2.getY()) && (uContainerBo.n != null && Math.abs(((float)uContainerBo.y - p2.getY())) - (float)uContainerBo.n.l() > 0))))))? true: false;
                   return b;
                }
             }
          }
          i1 = 0;
          goto label_01f0 ;
       }
    }
    public boolean onLayoutChild(CoordinatorLayout p0,View p1,int p2){
       a obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(ContainerBottomSheetBehavior.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, ContainerBottomSheetBehavior.class, "3");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (i0.y(p0) && !i0.y(p1)) {
          p1.setFitsSystemWindows(true);
       }
       int top = p1.getTop();
       p0.J(p1, p2);
       this.s = p0.getHeight();
       if (this.d != null) {
          if (this.e == null) {
             this.e = c.b(p0.getResources(), 0x7f0701a9);
          }
          this.f = Math.max(this.e, (this.s - ((p0.getWidth() * 9) / 16)));
       }else {
          this.f = this.c;
       }
       this.g = Math.max(0, (this.s - p1.getHeight()));
       int i = 2;
       this.h = this.s / i;
       this.calculateCollapsedOffset();
       ContainerBottomSheetBehavior tm = this.m;
       if (tm == 3) {
          i0.e0(p1, this.getExpandedOffset());
       }else if(tm == 6){
          i0.e0(p1, this.h);
       }else if(this.k != null && tm == 5){
          i0.e0(p1, this.s);
       }else if(tm == 4){
          i0.e0(p1, this.i);
       }else if(tm == true || tm == i){
          i0.e0(p1, (top - p1.getTop()));
       }
       if (this.n == null) {
          tm = this.G;
          obj = PatchProxy.applyTwoRefs(p0, tm, null, a.class, "1");
          if (obj != patchProxyRe) {
          }else {
             obj = new a(p0.getContext(), p0, tm);
          }
          this.n = obj;
       }
       this.t = new WeakReference(p1);
       this.u = new WeakReference(this.findScrollingChild(p1));
       return true;
    }
    public boolean onNestedPreFling(CoordinatorLayout p0,View p1,View p2,float p3,float p4){
       ContainerBottomSheetBehavior uContainerBo = ContainerBottomSheetBehavior.class;
       int i = 1;
       if (PatchProxy.isSupport(uContainerBo)) {
          Object[] objArray = new Object[]{p0,p1,p2,Float.valueOf(p3),Float.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uContainerBo, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p2 != this.u.get() || (this.m == 3 && !super.onNestedPreFling(p0, p1, p2, p3, p4))) {
          i = false;
       }
       return i;
    }
    public void onNestedPreScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int[] p5,int p6){
       if (PatchProxy.isSupport(ContainerBottomSheetBehavior.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),p5,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, ContainerBottomSheetBehavior.class, "6")) {
             return;
          }
       }
       if (p6 == 1) {
          return;
       }else {
          View view = this.u.get();
          ContainerBottomSheetBehavior tv = this.v;
          if (tv == null || (tv.g(p2, view) && p2 != view)) {
             return;
          }else {
             int top = p1.getTop();
             tv = top - p4;
             if (p4 > 0) {
                if (tv < this.getExpandedOffset()) {
                   p5[1] = top - this.getExpandedOffset();
                   i0.e0(p1, (- p5[1]));
                   this.setStateInternal(3);
                }else {
                   p5[1] = p4;
                   i0.e0(p1, (- p4));
                   this.setStateInternal(1);
                }
             }else if(p4 < 0 && !p2.canScrollVertically(-1)){
                ContainerBottomSheetBehavior ti = this.i;
                if (tv <= ti || this.k != null) {
                   p5[1] = p4;
                   i0.e0(p1, (- p4));
                   this.setStateInternal(1);
                }else {
                   p5[1] = top - ti;
                   i0.e0(p1, (- p5[1]));
                   this.setStateInternal(4);
                }
             }
             this.dispatchOnSlide(p1.getTop());
             this.q = p4;
             this.r = true;
             return;
          }
       }
    }
    public void onRestoreInstanceState(CoordinatorLayout p0,View p1,Parcelable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ContainerBottomSheetBehavior.class, "2")) {
          return;
       }
       super.onRestoreInstanceState(p0, p1, p2.a());
       ContainerBottomSheetBehavior$SavedState d = p2.d;
       this.m = (d == 1 || d == 2)? 4: d;
       this.d(this.m);
       return;
    }
    public Parcelable onSaveInstanceState(CoordinatorLayout p0,View p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ContainerBottomSheetBehavior.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ContainerBottomSheetBehavior$SavedState(super.onSaveInstanceState(p0, p1), this.m);
    }
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       int i = 0;
       this.q = i;
       this.r = i;
       if (p4 & 0x02) {
          i = true;
       }
       return i;
    }
    public void onStopNestedScroll(CoordinatorLayout p0,View p1,View p2,int p3){
       int expandedOffs;
       if (PatchProxy.isSupport(ContainerBottomSheetBehavior.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, ContainerBottomSheetBehavior.class, "7")) {
          return;
       }
       int i = 3;
       if (p1.getTop() == this.getExpandedOffset()) {
          this.setStateInternal(i);
          return;
       }else {
          ContainerBottomSheetBehavior tv = this.v;
          if (tv != null && (!tv.g(p2, this.u.get()) || (p2 == this.u.get() && this.r != null))) {
             if (this.q > null) {
                if (this.g(p1, this.getYVelocity())) {
                   expandedOffs = this.getExpandedOffset();
                }else {
                   expandedOffs = this.i;
                label_0062 :
                   i = 4;
                }
             }else if(this.k != null && this.shouldHide(p1, this.getYVelocity())){
                expandedOffs = this.s;
                i = 5;
             }else if(this.q == null){
                expandedOffs = p1.getTop();
                if (this.a != null) {
                   if (this.g(p1, this.getYVelocity())) {
                      expandedOffs = this.g;
                   }else {
                      expandedOffs = this.i;
                      goto label_0062 ;
                   }
                }else {
                   ContainerBottomSheetBehavior th = this.h;
                   if (expandedOffs < th) {
                      if (expandedOffs < Math.abs((expandedOffs - this.i))) {
                         expandedOffs = 0;
                      }else {
                         expandedOffs = this.h;
                      }
                   }else if(Math.abs((expandedOffs - th)) < Math.abs((expandedOffs - this.i))){
                      expandedOffs = this.h;
                   }else {
                      expandedOffs = this.i;
                      goto label_0062 ;
                   }
                   i = 6;
                }
             }else if(this.g(p1, this.getYVelocity())){
                expandedOffs = this.getExpandedOffset();
             }else {
                expandedOffs = this.i;
                goto label_0062 ;
             }
             if (this.n.s(p1, p1.getLeft(), expandedOffs)) {
                this.setStateInternal(2);
                i0.k0(p1, new ContainerBottomSheetBehavior$d(this, p1, i));
             }else {
                this.setStateInternal(i);
             }
             this.r = false;
          }
          return;
       }
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       int this;
       int i2;
       int i3;
       a u;
       a f1;
       int i4;
       float f2;
       float f3;
       a uoa2;
       int i7;
       float f4;
       float f5;
       int i9;
       ContainerBottomSheetBehavior uContainerBo = this;
       Object obj = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ContainerBottomSheetBehavior.class, "5");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       int b = false;
       if (!p1.isShown()) {
          return b;
       }
       int actionMasked = p2.getActionMasked();
       this = true;
       if (uContainerBo.m == this && !actionMasked) {
          return this;
       }
       ContainerBottomSheetBehavior n = uContainerBo.n;
       a uoa = 2;
       if (n != null) {
          Objects.requireNonNull(n);
          a uoa1 = a.class;
          if (!PatchProxy.applyVoidOneRefs(obj, n, uoa1, "25")) {
             int i = q.c(p2);
             int i1 = q.b(p2);
             if (!i) {
                n.a();
             }
             if (n.o == null) {
                n.o = VelocityTracker.obtain();
             }
             n.o.addMovement(obj);
             if (i) {
                if (i != this) {
                   float f = 0;
                   if (i != uoa) {
                      if (i != 0.00f) {
                         if (i != 5) {
                            if (i == 6) {
                               i2 = q.e(obj, i1);
                               if (n.d == this && i2 == n.f) {
                                  i3 = q.d(p2);
                                  while (true) {
                                     if (b < i3) {
                                        i1 = q.e(obj, b);
                                        if (i1 != n.f) {
                                           u = n.u;
                                           if (n.j((int)q.f(obj, b), (int)q.g(obj, b)) == u && n.t(u, i1)) {
                                              f1 = n.f;
                                           label_00b0 :
                                              if (f1 == -1) {
                                                 n.n();
                                              }
                                           }
                                        }
                                        b = b + 1;
                                     }else {
                                        f1 = -1;
                                        goto label_00b0 ;
                                     }
                                  }
                               }
                            label_00b5 :
                               n.g(i2);
                            }
                         }else {
                            i4 = q.e(obj, i1);
                            f2 = q.f(obj, i1);
                            f3 = q.g(obj, i1);
                            n.p(f2, f3, i4);
                            if (n.d == null) {
                               n.t(n.j((int)f2, (int)f3), i4);
                               if (n.k[i4] & n.s) {
                                  Objects.requireNonNull(n.b);
                               }
                            }else {
                               int i5 = (int)f2;
                               int i6 = (int)f3;
                               if (PatchProxy.isSupport(uoa1)) {
                                  Object obj2 = PatchProxy.applyTwoRefs(Integer.valueOf(i5), Integer.valueOf(i6), n, uoa1, "35");
                                  if (obj2 != patchProxyRe) {
                                     b = obj2.booleanValue();
                                  }else {
                                  label_0105 :
                                     u = n.u;
                                     if (PatchProxy.isSupport(uoa1)) {
                                        uoa2 = u;
                                        i7 = i6;
                                        i2 = i5;
                                        obj2 = PatchProxy.applyThreeRefs(u, Integer.valueOf(i5), Integer.valueOf(i6), n, a.class, "36");
                                        if (obj2 != patchProxyRe) {
                                           b = obj2.booleanValue();
                                        }
                                     }else {
                                        uoa2 = u;
                                        i7 = i6;
                                        i2 = i5;
                                     }
                                     if (uoa2 != null && (i2 >= uoa2.getLeft() && (i2 < uoa2.getRight() && (i7 >= uoa2.getTop() && i7 < uoa2.getBottom())))) {
                                        b = true;
                                     }
                                  }
                               }else {
                                  goto label_0105 ;
                               }
                            label_014f :
                               if (b) {
                                  n.t(n.u, i4);
                               }
                            }
                         }
                      }else if(n.d == this){
                         n.i(f, f);
                      }
                      n.a();
                   }else if(n.d == this){
                      if (n.m(n.f)) {
                         b = q.a(obj, n.f);
                         try{
                            f4 = q.f(obj, b);
                            try{
                               f5 = q.g(obj, b);
                               f = f4;
                            }catch(java.lang.IllegalArgumentException e0){
                               f = f4;
                               f5 = 0;
                            }
                            a f6 = n.f;
                            i7 = (int)(f - n.i[f6]);
                            b = (int)(f5 - n.j[f6]);
                            i3 = n.u.getLeft() + i7;
                            i4 = n.u.getTop() + b;
                            if (PatchProxy.isSupport(uoa1)) {
                               this = i4;
                               if (!PatchProxy.applyVoidFourRefs(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i7), Integer.valueOf(b), n, a.class, "34")) {
                               label_01c7 :
                                  i2 = n.u.getLeft();
                                  i = n.u.getTop();
                                  if (i7) {
                                     i3 = n.b.a(n.u, i3, i7);
                                     i0.d0(n.u, (i3 - i2));
                                  }
                                  int i8 = i3;
                                  if (b) {
                                     i4 = n.b.b(n.u, this, b);
                                     i0.e0(n.u, (i4 - i));
                                     i9 = i4;
                                  }else {
                                     i9 = this;
                                  }
                                  if (i7 || b) {
                                     n.b.e(n.u, i8, i9, (i8 - i2), (i9 - i));
                                  }
                               }
                            }else {
                               this = i4;
                               goto label_01c7 ;
                            }
                            n.q(obj);
                         }catch(java.lang.IllegalArgumentException e0){
                         }
                      }
                   }else {
                      this = q.d(p2);
                      while (b < this) {
                         i7 = q.e(obj, b);
                         if (n.m(i7)) {
                            float f7 = q.f(obj, b);
                            float f8 = q.g(obj, b);
                            f2 = f7 - n.g[i7];
                            f3 = f8 - n.h[i7];
                            n.o(f2, f3, i7);
                            if (n.d == 1) {
                               break ;
                            }else {
                               View view = n.j((int)f7, (int)f8);
                               if (n.d(view, f2, f3) && n.t(view, i7)) {
                                  break ;
                               }
                            }
                         }
                         b = b + 1;
                      }
                      n.q(obj);
                   }
                }else if(n.d == 1){
                   n.n();
                }
                n.a();
             }else {
                float this1 = p2.getX();
                f4 = p2.getY();
                b = q.e(obj, b);
                n.p(this1, f4, b);
                n.t(n.j((int)this1, (int)f4), b);
                if (n.k[b] & n.s) {
                   Objects.requireNonNull(n.b);
                }
             }
          }
       }
    label_028e :
       if (!actionMasked) {
          this.reset();
       }
       if (uContainerBo.w == null) {
          uContainerBo.w = VelocityTracker.obtain();
       }
       uContainerBo.w.addMovement(obj);
       if (actionMasked == 0.00f && (uContainerBo.o == null && Math.abs(((float)uContainerBo.y - p2.getY())) - (float)uContainerBo.n.l() > 0)) {
          uContainerBo.n.b(p1, obj.getPointerId(p2.getActionIndex()));
       }
       return (uContainerBo.o ^ 1);
    }
    public final void reset(){
       if (PatchProxy.applyVoid(null, this, ContainerBottomSheetBehavior.class, "14")) {
          return;
       }
       this.x = -1;
       ContainerBottomSheetBehavior tw = this.w;
       if (tw != null) {
          tw.recycle();
          this.w = null;
       }
       return;
    }
    public void setHideable(boolean p0){
       this.k = p0;
    }
    public final void setPeekHeight(int p0){
       ContainerBottomSheetBehavior uContainerBo = ContainerBottomSheetBehavior.class;
       if (PatchProxy.isSupport(uContainerBo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uContainerBo, "10")) {
          return;
       }
       boolean b = true;
       if (p0 == -1) {
          if (this.d == null) {
             this.d = b;
          }else {
          label_002a :
             b = false;
          }
       }else if(this.d != null || this.c != p0){
          this.d = false;
          this.c = Math.max(false, p0);
          this.i = this.s - p0;
       }else {
          goto label_002a ;
       }
       if (b && this.m == 4) {
          ContainerBottomSheetBehavior tt = this.t;
          if (tt != null) {
             View view = tt.get();
             if (view != null) {
                view.requestLayout();
             }
          }
       }
       return;
    }
    public final void setState(int p0){
       ContainerBottomSheetBehavior uContainerBo = ContainerBottomSheetBehavior.class;
       if (PatchProxy.isSupport(uContainerBo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uContainerBo, "11")) {
          return;
       }
       if (p0 == this.m) {
          return;
       }
       uContainerBo = this.t;
       if (uContainerBo == null) {
          if (p0 != 4 && (p0 != 3 && (p0 == 6 || (this.k != null && p0 == 5)))) {
             this.m = p0;
             this.d(p0);
          }
          return;
       }else {
          View view = uContainerBo.get();
          if (view == null) {
             return;
          }
          ViewParent parent = view.getParent();
          if (parent != null && (parent.isLayoutRequested() && i0.X(view))) {
             view.post(new ContainerBottomSheetBehavior$a(this, view, p0));
          }else {
             this.startSettlingAnimation(view, p0);
          }
          return;
       }
    }
    public void setStateInternal(int p0){
       ContainerBottomSheetBehavior uContainerBo = ContainerBottomSheetBehavior.class;
       if (PatchProxy.isSupport(uContainerBo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uContainerBo, "12")) {
          return;
       }
       if (this.m == p0) {
          return;
       }
       this.m = p0;
       this.d(p0);
       if (p0 == 6 || p0 == 3) {
          this.updateImportantForAccessibility(true);
       }else if(p0 == 5 || p0 == 4){
          this.updateImportantForAccessibility(false);
       }
       View view = this.t.get();
       if (view != null) {
          ContainerBottomSheetBehavior tv = this.v;
          if (tv != null) {
             tv.c(view, p0);
          }
       }
       return;
    }
    public boolean shouldHide(View p0,float p1){
       ContainerBottomSheetBehavior uContainerBo = ContainerBottomSheetBehavior.class;
       if (PatchProxy.isSupport(uContainerBo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, uContainerBo, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (this.l != null) {
          return b;
       }else if(p0.getTop() < this.i){
          return false;
       }else if((Math.abs((((float)p0.getTop() + (p1 * 0.10f)) - (float)this.i)) / (float)this.c) - this.E > 0){
          b = false;
       }
       return b;
    }
    public void startSettlingAnimation(View p0,int p1){
       int expandedOffs;
       ContainerBottomSheetBehavior uContainerBo = ContainerBottomSheetBehavior.class;
       if (PatchProxy.isSupport(uContainerBo) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uContainerBo, "19")) {
          return;
       }
       ContainerBottomSheetBehavior uContainerBo1 = 3;
       if (p1 == 4) {
          uContainerBo = this.i;
       }else if(p1 == 6){
          uContainerBo = this.h;
          if (this.a != null) {
             ContainerBottomSheetBehavior tg = this.g;
             if (uContainerBo <= tg) {
                uContainerBo = tg;
                p1 = 3;
             }
          }
       }else if(p1 == uContainerBo1){
          expandedOffs = this.getExpandedOffset();
       }else if(this.k != null && p1 == 5){
          expandedOffs = this.s;
       }else {
          throw new IllegalArgumentException("Illegal mState argument: "+p1);
       }
       if (this.n.s(p0, p0.getLeft(), uContainerBo)) {
          this.setStateInternal(2);
          i0.k0(p0, new ContainerBottomSheetBehavior$d(this, p0, p1));
       }else {
          this.setStateInternal(p1);
       }
       return;
    }
    public final void updateImportantForAccessibility(boolean p0){
       ContainerBottomSheetBehavior uContainerBo = ContainerBottomSheetBehavior.class;
       if (PatchProxy.isSupport(uContainerBo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uContainerBo, "22")) {
          return;
       }
       uContainerBo = this.t;
       if (uContainerBo == null) {
          return;
       }
       ViewParent parent = uContainerBo.get().getParent();
       if (!parent instanceof CoordinatorLayout) {
          return;
       }
       int childCount = parent.getChildCount();
       if (p0) {
          if (this.A == null) {
             this.A = new HashMap(childCount);
          }else {
             return;
          }
       }
       int i = 0;
       while (i < childCount) {
          View childAt = parent.getChildAt(i);
          if (childAt != this.t.get()) {
             if (!p0) {
                ContainerBottomSheetBehavior tA = this.A;
                if (tA != null && tA.containsKey(childAt)) {
                   i0.D0(childAt, this.A.get(childAt).intValue());
                }
             }else {
                this.A.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                i0.D0(childAt, 4);
             }
          }
          i = i + 1;
       }
       if (!p0) {
          this.A = null;
       }
       return;
    }
}
