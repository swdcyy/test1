package com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior$b;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import java.lang.Integer;
import java.lang.ref.WeakReference;
import android.view.View;
import com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior$c;
import com.kwai.robust.PatchProxyResult;
import a2.i0;
import android.view.ViewGroup;
import java.lang.Boolean;
import android.view.ViewParent;
import com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior$a;
import java.lang.Runnable;
import java.lang.Number;
import android.view.VelocityTracker;
import java.lang.Float;
import com.yxcorp.gifshow.camera.record.widget.i;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior$d;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.MotionEvent;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.widget.i$c;
import android.content.res.Resources;
import cw9.c;
import lnc.a1;
import android.os.Parcelable;
import com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior$SavedState;
import androidx.customview.view.AbsSavedState;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior extends CoordinatorLayout$Behavior	// class@000fbb
{
    public Map A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public int H;
    public boolean I;
    public boolean J;
    public final i$c K;
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
    public i n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    public int s;
    public WeakReference t;
    public WeakReference u;
    public BottomSheetBehavior$c v;
    public VelocityTracker w;
    public int x;
    public int y;
    public boolean z;

    public void BottomSheetBehavior(){
       super();
       this.a = true;
       this.m = 4;
       this.B = 0x3f800000;
       this.C = 0x3f800000;
       this.D = 0x3f000000;
       this.E = 0x3f000000;
       this.F = 0x3f000000;
       this.G = 0.14f;
       this.H = 0;
       this.K = new BottomSheetBehavior$b(this);
    }
    public void BottomSheetBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       boolean b = true;
       this.a = b;
       this.m = 4;
       this.B = 0x3f800000;
       this.C = 0x3f800000;
       this.D = 0x3f000000;
       this.E = 0x3f000000;
       this.F = 0x3f000000;
       this.G = 0.14f;
       this.H = 0;
       this.K = new BottomSheetBehavior$b(this);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.D);
       int i = 2;
       TypedValue typedValue = typedArray.peekValue(i);
       if (typedValue != null) {
          typedValue = typedValue.data;
          if (typedValue == -1) {
             this.setPeekHeight(typedValue);
          label_0043 :
             this.k = typedArray.getBoolean(b, 0);
             this.setFitToContents(typedArray.getBoolean(0, b));
             this.l = typedArray.getBoolean(3, 0);
             typedArray.recycle();
             this.b = (float)ViewConfiguration.get(p0).getScaledMaximumFlingVelocity();
             this.e(this.m);
             return;
          }
       }
       this.setPeekHeight(typedArray.getDimensionPixelSize(i, -1));
       goto label_0043 ;
    }
    public float c(){
       return this.j;
    }
    public final void calculateCollapsedOffset(){
       if (PatchProxy.applyVoid(null, this, BottomSheetBehavior.class, "14")) {
          return;
       }
       this.i = (this.a != null)? Math.max((this.s - this.f), this.g): this.s - this.f;
       return;
    }
    public void d(boolean p0){
       this.p = p0;
    }
    public void dispatchOnSlide(int p0){
       BottomSheetBehavior uBottomSheet = BottomSheetBehavior.class;
       if (PatchProxy.isSupport(uBottomSheet) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBottomSheet, "21")) {
          return;
       }
       View view = this.t.get();
       if (view != null && this.v != null) {
          BottomSheetBehavior ti = this.i;
          this.j = (p0 > ti)? (float)(ti - p0) / (float)(this.s - ti): (float)(ti - p0) / (float)(ti - this.getExpandedOffset());
          this.v.f(view, this.j);
       }
       return;
    }
    public final void e(int p0){
       if (p0 != 3) {
          if (p0 == 4 || (p0 == 5 || p0 == 6)) {
             this.I = false;
          }
       }else {
          this.I = true;
       }
       return;
    }
    public View findScrollingChild(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BottomSheetBehavior.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (i0.Z(p0)) {
          if (!p0.getVisibility()) {
             return p0;
          }else {
             return null;
          }
       }else if(p0 instanceof ViewGroup){
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
    public final void g(int p0,boolean p1){
       BottomSheetBehavior uBottomSheet = BottomSheetBehavior.class;
       if (PatchProxy.isSupport(uBottomSheet) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uBottomSheet, "12")) {
          return;
       }
       if (p0 == this.m) {
          return;
       }
       uBottomSheet = this.t;
       if (uBottomSheet == null) {
          if (p0 != 4 && (p0 != 3 && (p0 == 6 || (this.k != null && p0 == 5)))) {
             this.m = p0;
             this.e(p0);
          }
          return;
       }else {
          View view = uBottomSheet.get();
          if (view == null) {
             return;
          }
          ViewParent parent = view.getParent();
          if (parent != null && (parent.isLayoutRequested() && i0.X(view))) {
             view.post(new BottomSheetBehavior$a(this, view, p0, p1));
          }else {
             this.i(view, p0, p1);
          }
          return;
       }
    }
    public int getExpandedOffset(){
       BottomSheetBehavior tg = (this.a != null)? this.g: 0;
       return tg;
    }
    public final int getState(){
       return this.m;
    }
    public final float getYVelocity(){
       BottomSheetBehavior obj = PatchProxy.apply(null, this, BottomSheetBehavior.class, "19");
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
    public boolean h(View p0,float p1){
       BottomSheetBehavior uBottomSheet = BottomSheetBehavior.class;
       if (PatchProxy.isSupport(uBottomSheet)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, uBottomSheet, "17");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int expandedOffs = this.getExpandedOffset();
       BottomSheetBehavior tC = (this.I != null)? this.C: this.B;
       float f = (float)expandedOffs;
       float f1 = Math.max(f, ((float)p0.getTop() + (tC * p1)));
       boolean b = true;
       if (!f1 - f) {
          return b;
       }else {
          BottomSheetBehavior ti = this.i;
          expandedOffs = ti - expandedOffs;
          if (this.I == null) {
             f = (float)ti;
          }
          f1 = Math.abs((f1 - f)) / (float)expandedOffs;
          BottomSheetBehavior uBottomSheet1 = (p1 - null <= 0)? 1: null;
          if (this.I != null) {
             if (f1 - this.E > 0) {
                b = false;
             }
             return b;
          }else if(uBottomSheet1 != null && f1 - this.D >= 0){
             b = false;
          }
          return b;
       }
    }
    public void i(View p0,int p1,boolean p2){
       BottomSheetBehavior ti;
       if (PatchProxy.isSupport(BottomSheetBehavior.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, BottomSheetBehavior.class, "20")) {
          return;
       }
       boolean i = 3;
       if (p1 == 4) {
          ti = this.i;
       }else if(p1 == 6){
          ti = this.h;
          if (this.a != null) {
             BottomSheetBehavior tg = this.g;
             if (ti <= tg) {
                ti = tg;
                p1 = 3;
             }
          }
       }else if(p1 == i){
          ti = this.getExpandedOffset();
       }else if(this.k != null && p1 == 5){
          ti = this.s;
       }else {
          throw new IllegalArgumentException("Illegal mState argument: "+p1);
       }
       i = false;
       BottomSheetBehavior tn = this.n;
       if (tn != null) {
          if (p2) {
             i = tn.t(p0, p0.getLeft(), ti);
          }else {
             int left = p0.getLeft();
             Objects.requireNonNull(tn);
             if (PatchProxy.isSupport(i.class)) {
                Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(left), Integer.valueOf(ti), tn, i.class, "7");
                if (obj != PatchProxyResult.class) {
                   left = obj.booleanValue();
                }else {
                label_0080 :
                   tn.s = p0;
                   tn.c = -1;
                   left = tn.k(left, ti, Integer.MAX_VALUE, Integer.MAX_VALUE);
                   if (!left && (tn.a == null && tn.s != null)) {
                      tn.s = null;
                   }
                }
             }else {
                goto label_0080 ;
             }
             i = left;
          }
       }
       if (i) {
          this.setStateInternal(2);
          i0.k0(p0, new BottomSheetBehavior$d(this, p0, p1));
       }else {
          this.setStateInternal(p1);
       }
       return;
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       int this;
       Object[] objArray;
       BottomSheetBehavior obj2;
       int b;
       Object obj3;
       i a;
       int i2;
       int i3;
       BottomSheetBehavior uBottomSheet = this;
       CoordinatorLayout uCoordinator = p0;
       Object obj = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BottomSheetBehavior.class, "4");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       String str = "Behavior onInterceptTouchEvent";
       this = true;
       int i = 0;
       if (!p1.isShown()) {
          uBottomSheet.o = this;
          objArray = new Object[i];
          a.D().w("BottomSheetBehavior", str+obj, objArray);
          return i;
       }else {
          int actionMasked = p2.getActionMasked();
          if (!actionMasked) {
             this.reset();
          }
          if (uBottomSheet.w == null) {
             uBottomSheet.w = VelocityTracker.obtain();
          }
          uBottomSheet.w.addMovement(obj);
          BottomSheetBehavior uBottomSheet1 = -1;
          int i1 = 3;
          if (actionMasked) {
             if (actionMasked == this || actionMasked == i1) {
                uBottomSheet.z = i;
                uBottomSheet.x = uBottomSheet1;
                if (uBottomSheet.o != null) {
                   uBottomSheet.o = i;
                   objArray = new Object[i];
                   a.D().w("BottomSheetBehavior", str+obj, objArray);
                   return i;
                }
             }
          }else {
             int i4 = (int)p2.getX();
             uBottomSheet.y = (int)p2.getY();
             obj2 = uBottomSheet.u;
             View view2 = (obj2 != null)? obj2.get(): null;
             if (view2 != null && uCoordinator.C(view2, i4, uBottomSheet.y)) {
                uBottomSheet.x = obj.getPointerId(p2.getActionIndex());
                uBottomSheet.z = this;
             }
             boolean b1 = (uBottomSheet.p == null && (uBottomSheet.x == uBottomSheet1 && !uCoordinator.C(p1, i4, uBottomSheet.y)))? true: false;
             uBottomSheet.o = b1;
          }
          i oi = 2;
          if (uBottomSheet.o == null) {
             uBottomSheet1 = uBottomSheet.n;
             if (uBottomSheet1 != null) {
                Objects.requireNonNull(uBottomSheet1);
                obj2 = PatchProxy.applyOneRefs(obj, uBottomSheet1, i.class, "26");
                if (obj2 != patchProxyRe) {
                   b = obj2.booleanValue();
                }else {
                   b = p2.getActionMasked();
                   int actionIndex = p2.getActionIndex();
                   if (!b) {
                      uBottomSheet1.a();
                   }
                   if (uBottomSheet1.l == null) {
                      uBottomSheet1.l = VelocityTracker.obtain();
                   }
                   uBottomSheet1.l.addMovement(obj);
                   if (b) {
                      if (b != this) {
                         if (b != oi) {
                            if (b != i1) {
                               if (b != 0.00f) {
                                  if (b == 6) {
                                     uBottomSheet1.g(obj.getPointerId(actionIndex));
                                  }
                               }else {
                                  b = obj.getPointerId(actionIndex);
                                  float x = obj.getX(actionIndex);
                                  float y = obj.getY(actionIndex);
                                  uBottomSheet1.q(x, y, b);
                                  a = uBottomSheet1.a;
                                  if (a == null) {
                                     if (uBottomSheet1.h[b] & uBottomSheet1.p) {
                                        Objects.requireNonNull(uBottomSheet1.r);
                                     }
                                  }else if(a == oi){
                                     View view = uBottomSheet1.j((int)x, (int)y);
                                     if (view == uBottomSheet1.s) {
                                        uBottomSheet1.u(view, b);
                                     }
                                  }
                               }
                            }
                         }else if(uBottomSheet1.d == null || uBottomSheet1.e == null){
                            b = p2.getPointerCount();
                            i1 = 0;
                            while (true) {
                               if (i1 < b) {
                                  actionIndex = obj.getPointerId(i1);
                                  if (!uBottomSheet1.n(actionIndex)) {
                                     i2 = b;
                                  }else {
                                     float x1 = obj.getX(i1);
                                     float y1 = obj.getY(i1);
                                     float f = x1 - uBottomSheet1.d[actionIndex];
                                     float f1 = y1 - uBottomSheet1.e[actionIndex];
                                     View view1 = uBottomSheet1.j((int)x1, (int)y1);
                                     y1 = (view1 != null && uBottomSheet1.d(view1, f, f1))? Float.MIN_VALUE: 0;
                                     if (y1) {
                                        i = (int)f;
                                        this = view1.getLeft() + i;
                                        i2 = b;
                                        uBottomSheet1.r.a(view1, this, i);
                                        this = view1.getTop();
                                        i = (int)f1;
                                        b = this + i;
                                        i = uBottomSheet1.r.b(view1, b, i);
                                        Objects.requireNonNull(uBottomSheet1.r);
                                        i3 = uBottomSheet1.r.c(view1);
                                        if (!i3 || (i3 > 0 && i == this)) {
                                        label_01e9 :
                                           uBottomSheet1.r(obj);
                                           break ;
                                        }
                                     }else {
                                        i2 = b;
                                     }
                                     uBottomSheet1.p(f, f1, actionIndex);
                                     if (uBottomSheet1.a == 1 || (y1 && uBottomSheet1.u(view1, actionIndex))) {
                                        goto label_01e9 ;
                                     }
                                  }
                                  i1 = i1 + 1;
                                  b = i2;
                                  oi = 2;
                               }else {
                                  goto label_01e9 ;
                               }
                            }
                         }
                      }
                      uBottomSheet1.a();
                   }else {
                      float View this2 = p2.getX();
                      float y2 = p2.getY();
                      i3 = obj.getPointerId(0);
                      uBottomSheet1.q(this2, y2, i3);
                      this2 = uBottomSheet1.j((int)this2, (int)y2);
                      if (this2 == uBottomSheet1.s && uBottomSheet1.a == 2) {
                         uBottomSheet1.u(this2, i3);
                      }
                      if (uBottomSheet1.h[i3] & uBottomSheet1.p) {
                         Objects.requireNonNull(uBottomSheet1.r);
                      }
                   }
                label_0221 :
                   if (uBottomSheet1.a == Float.MIN_VALUE) {
                      b = true;
                   }else {
                      b = false;
                   }
                }
                if (b) {
                   objArray = new Object[0];
                   a.D().w("BottomSheetBehavior", str+obj, objArray);
                   return true;
                }
             }
          }
          BottomSheetBehavior this1 = uBottomSheet.u;
          if (this1 != null) {
             obj3 = this1.get();
             this1 = 2;
          }else {
             this1 = 2;
             obj3 = null;
          }
          if (actionMasked == this1 && (obj3 != null && uBottomSheet.o == null)) {
             this = true;
             if (uBottomSheet.m != this && (!p0.C(obj3, (int)p2.getX(), (int)p2.getY()) && (uBottomSheet.n != null && Math.abs(((float)uBottomSheet.y - p2.getY())) - (float)uBottomSheet.n.l() > 0))) {
             label_0291 :
                Object[] objArray1 = new Object[0];
                a.D().w("BottomSheetBehavior", str+this, objArray1);
                return this;
             }
          }
       label_0290 :
          this = false;
          goto label_0291 ;
       }
    }
    public boolean onLayoutChild(CoordinatorLayout p0,View p1,int p2){
       i obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(BottomSheetBehavior.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, BottomSheetBehavior.class, "3");
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
       this.h = (int)((float)a1.g() * this.F);
       this.calculateCollapsedOffset();
       BottomSheetBehavior tm = this.m;
       if (tm == 3) {
          i0.e0(p1, this.getExpandedOffset());
       }else if(tm == 6){
          i0.e0(p1, this.h);
       }else if(this.k != null && tm == 5){
          i0.e0(p1, this.s);
       }else if(tm == 4){
          i0.e0(p1, this.i);
       }else if(tm == true || tm == 2){
          i0.e0(p1, (top - p1.getTop()));
       }
       if (this.n == null) {
          tm = this.K;
          obj = PatchProxy.applyTwoRefs(p0, tm, null, i.class, "1");
          if (obj != patchProxyRe) {
          }else {
             obj = new i(p0.getContext(), p0, tm);
          }
          this.n = obj;
       }
       this.t = new WeakReference(p1);
       this.u = new WeakReference(this.findScrollingChild(p1));
       return true;
    }
    public boolean onNestedPreFling(CoordinatorLayout p0,View p1,View p2,float p3,float p4){
       BottomSheetBehavior uBottomSheet = BottomSheetBehavior.class;
       int i = 1;
       if (PatchProxy.isSupport(uBottomSheet)) {
          Object[] objArray = new Object[]{p0,p1,p2,Float.valueOf(p3),Float.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uBottomSheet, "8");
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
       if (PatchProxy.isSupport(BottomSheetBehavior.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),p5,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, BottomSheetBehavior.class, "6")) {
             return;
          }
       }
       if (p6 == 1) {
          return;
       }else if(p2 != this.u.get()){
          return;
       }else {
          int top = p1.getTop();
          p3 = top - p4;
          if (p4 > 0) {
             if (p3 < this.getExpandedOffset()) {
                p5[1] = top - this.getExpandedOffset();
                i0.e0(p1, (- p5[1]));
                this.setStateInternal(3);
             }else {
                p5[1] = p4;
                i0.e0(p1, (- p4));
                this.setStateInternal(1);
             }
          }else if(p4 < 0 && !p2.canScrollVertically(-1)){
             BottomSheetBehavior ti = this.i;
             if (p3 <= ti || this.k != null) {
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
    public void onRestoreInstanceState(CoordinatorLayout p0,View p1,Parcelable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, BottomSheetBehavior.class, "2")) {
          return;
       }
       super.onRestoreInstanceState(p0, p1, p2.a());
       BottomSheetBehavior$SavedState d = p2.d;
       this.m = (d == 1 || d == 2)? 4: d;
       this.e(this.m);
       return;
    }
    public Parcelable onSaveInstanceState(CoordinatorLayout p0,View p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, BottomSheetBehavior.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BottomSheetBehavior$SavedState(super.onSaveInstanceState(p0, p1), this.m);
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
       if (PatchProxy.isSupport(BottomSheetBehavior.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, BottomSheetBehavior.class, "7")) {
          return;
       }
       int i = 3;
       if (p1.getTop() == this.getExpandedOffset()) {
          this.setStateInternal(i);
          return;
       }else if(p2 != this.u.get() || this.r == null){
          if (this.q > null) {
             if (this.h(p1, this.getYVelocity())) {
                expandedOffs = this.getExpandedOffset();
             }else {
                expandedOffs = this.i;
             label_0050 :
                i = 4;
             }
          }else if(this.k != null && this.shouldHide(p1, this.getYVelocity())){
             expandedOffs = this.s;
             i = 5;
          }else if(this.q == null){
             expandedOffs = p1.getTop();
             if (this.a != null) {
                if (this.h(p1, this.getYVelocity())) {
                   expandedOffs = this.g;
                }else {
                   expandedOffs = this.i;
                   goto label_0050 ;
                }
             }else {
                BottomSheetBehavior th = this.h;
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
                   goto label_0050 ;
                }
                i = 6;
             }
          }else if(this.h(p1, this.getYVelocity())){
             expandedOffs = this.getExpandedOffset();
          }else {
             expandedOffs = this.i;
             goto label_0050 ;
          }
          if (this.n.t(p1, p1.getLeft(), expandedOffs)) {
             this.setStateInternal(2);
             i0.k0(p1, new BottomSheetBehavior$d(this, p1, i));
          }else {
             this.setStateInternal(i);
          }
          this.r = false;
       }
       return;
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       int this;
       int pointerId;
       int pointerCount;
       i s;
       i c;
       int pointerId1;
       float x;
       float y;
       int i;
       i obj2;
       i oi2;
       int i2;
       float x1;
       int i4;
       BottomSheetBehavior uBottomSheet = this;
       Object obj = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BottomSheetBehavior.class, "5");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       int b = false;
       if (!p1.isShown()) {
          return b;
       }
       int actionMasked = p2.getActionMasked();
       this = true;
       if (uBottomSheet.m == this && !actionMasked) {
          return this;
       }
       BottomSheetBehavior n = uBottomSheet.n;
       i oi = 2;
       if (n != null) {
          Objects.requireNonNull(n);
          i oi1 = i.class;
          if (!PatchProxy.applyVoidOneRefs(obj, n, oi1, "27")) {
             int actionMasked1 = p2.getActionMasked();
             int actionIndex = p2.getActionIndex();
             if (!actionMasked1) {
                n.a();
             }
             if (n.l == null) {
                n.l = VelocityTracker.obtain();
             }
             n.l.addMovement(obj);
             if (actionMasked1) {
                if (actionMasked1 != this) {
                   if (actionMasked1 != oi) {
                      if (actionMasked1 != 3) {
                         if (actionMasked1 != 5) {
                            if (actionMasked1 == 6) {
                               pointerId = obj.getPointerId(actionIndex);
                               if (n.a == this && pointerId == n.c) {
                                  pointerCount = p2.getPointerCount();
                                  while (true) {
                                     if (b < pointerCount) {
                                        actionIndex = obj.getPointerId(b);
                                        if (actionIndex != n.c) {
                                           s = n.s;
                                           if (n.j((int)obj.getX(b), (int)obj.getY(b)) == s && n.u(s, actionIndex)) {
                                              c = n.c;
                                           label_00af :
                                              if (c == -1) {
                                                 n.o();
                                              }
                                           }
                                        }
                                        b = b + 1;
                                     }else {
                                        c = -1;
                                        goto label_00af ;
                                     }
                                  }
                               }
                            label_00b4 :
                               n.g(pointerId);
                            }
                         }else {
                            pointerId1 = obj.getPointerId(actionIndex);
                            x = obj.getX(actionIndex);
                            y = obj.getY(actionIndex);
                            n.q(x, y, pointerId1);
                            if (n.a == null) {
                               n.u(n.j((int)x, (int)y), pointerId1);
                               if (n.h[pointerId1] & n.p) {
                                  Objects.requireNonNull(n.r);
                               }
                            }else {
                               i = (int)x;
                               int i1 = (int)y;
                               if (PatchProxy.isSupport(oi1)) {
                                  obj2 = PatchProxy.applyTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), n, oi1, "38");
                                  if (obj2 != patchProxyRe) {
                                     b = obj2.booleanValue();
                                  }else {
                                  label_0104 :
                                     s = n.s;
                                     if (PatchProxy.isSupport(oi1)) {
                                        oi2 = s;
                                        i2 = i1;
                                        pointerId = i;
                                        obj2 = PatchProxy.applyThreeRefs(s, Integer.valueOf(i), Integer.valueOf(i1), n, i.class, "39");
                                        if (obj2 != patchProxyRe) {
                                           b = obj2.booleanValue();
                                        }
                                     }else {
                                        oi2 = s;
                                        i2 = i1;
                                        pointerId = i;
                                     }
                                     if (oi2 != null && (pointerId >= oi2.getLeft() && (pointerId < oi2.getRight() && (i2 >= oi2.getTop() && i2 < oi2.getBottom())))) {
                                        b = true;
                                     }
                                  }
                               }else {
                                  goto label_0104 ;
                               }
                            label_014e :
                               if (b) {
                                  n.u(n.s, pointerId1);
                               }
                            }
                         }
                      }else if(n.a == this){
                         n.i(0, 0);
                      }
                      n.a();
                   }else if(n.a == this){
                      if (n.n(n.c)) {
                         b = obj.findPointerIndex(n.c);
                         x1 = obj.getX(b);
                         obj2 = n.c;
                         i2 = (int)(x1 - n.f[obj2]);
                         b = (int)(obj.getY(b) - n.g[obj2]);
                         pointerCount = n.s.getLeft() + i2;
                         pointerId1 = n.s.getTop() + b;
                         if (PatchProxy.isSupport(oi1)) {
                            this = pointerId1;
                            if (!PatchProxy.applyVoidFourRefs(Integer.valueOf(pointerCount), Integer.valueOf(pointerId1), Integer.valueOf(i2), Integer.valueOf(b), n, i.class, "36")) {
                            label_01c2 :
                               pointerId = n.s.getLeft();
                               actionMasked1 = n.s.getTop();
                               if (i2) {
                                  pointerCount = n.r.a(n.s, pointerCount, i2);
                                  i0.d0(n.s, (pointerCount - pointerId));
                               }
                               int i3 = pointerCount;
                               if (b) {
                                  pointerId1 = n.r.b(n.s, this, b);
                                  i0.e0(n.s, (pointerId1 - actionMasked1));
                                  i4 = pointerId1;
                               }else {
                                  i4 = this;
                               }
                               if (i2 || b) {
                                  n.r.e(n.s, i3, i4, (i3 - pointerId), (i4 - actionMasked1));
                               }
                            }
                         }else {
                            this = pointerId1;
                            goto label_01c2 ;
                         }
                         n.r(obj);
                      }
                   }else {
                      this = p2.getPointerCount();
                      while (b < this) {
                         i2 = obj.getPointerId(b);
                         if (n.n(i2)) {
                            float x2 = obj.getX(b);
                            float y1 = obj.getY(b);
                            x = x2 - n.d[i2];
                            y = y1 - n.e[i2];
                            n.p(x, y, i2);
                            if (n.a == 1) {
                               break ;
                            }else {
                               View view = n.j((int)x2, (int)y1);
                               if (n.d(view, x, y) && n.u(view, i2)) {
                                  break ;
                               }
                            }
                         }
                         b = b + 1;
                      }
                      n.r(obj);
                   }
                }else if(n.a == 1){
                   n.o();
                }
                n.a();
             }else {
                float this1 = p2.getX();
                x1 = p2.getY();
                b = obj.getPointerId(b);
                n.q(this1, x1, b);
                n.u(n.j((int)this1, (int)x1), b);
                if (n.h[b] & n.p) {
                   Objects.requireNonNull(n.r);
                }
             }
          }
       }
    label_0289 :
       if (!actionMasked) {
          this.reset();
       }
       if (uBottomSheet.w == null) {
          uBottomSheet.w = VelocityTracker.obtain();
       }
       uBottomSheet.w.addMovement(obj);
       if (actionMasked == 0.00f && (uBottomSheet.o == null && (uBottomSheet.n != null && Math.abs(((float)uBottomSheet.y - p2.getY())) - (float)uBottomSheet.n.l() > 0))) {
          uBottomSheet.n.b(p1, obj.getPointerId(p2.getActionIndex()));
       }
       return (uBottomSheet.o ^ 1);
    }
    public final void reset(){
       if (PatchProxy.applyVoid(null, this, BottomSheetBehavior.class, "15")) {
          return;
       }
       this.x = -1;
       BottomSheetBehavior tw = this.w;
       if (tw != null) {
          tw.recycle();
          this.w = null;
       }
       return;
    }
    public void setFitToContents(boolean p0){
       BottomSheetBehavior uBottomSheet = BottomSheetBehavior.class;
       if (PatchProxy.isSupport(uBottomSheet) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBottomSheet, "9")) {
          return;
       }
       if (this.a == p0) {
          return;
       }
       this.a = p0;
       if (this.t != null) {
          this.calculateCollapsedOffset();
       }
       int i = (this.a != null && this.m == 6)? 3: this.m;
       this.setStateInternal(i);
       return;
    }
    public final void setPeekHeight(int p0){
       BottomSheetBehavior uBottomSheet = BottomSheetBehavior.class;
       if (PatchProxy.isSupport(uBottomSheet) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBottomSheet, "10")) {
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
          BottomSheetBehavior tt = this.t;
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
       BottomSheetBehavior uBottomSheet = BottomSheetBehavior.class;
       if (PatchProxy.isSupport(uBottomSheet) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBottomSheet, "11")) {
          return;
       }
       this.g(p0, true);
       return;
    }
    public void setStateInternal(int p0){
       BottomSheetBehavior uBottomSheet = BottomSheetBehavior.class;
       if (PatchProxy.isSupport(uBottomSheet) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBottomSheet, "13")) {
          return;
       }
       if (this.m == p0) {
          return;
       }
       this.m = p0;
       this.e(p0);
       if (p0 == 6 || p0 == 3) {
          this.updateImportantForAccessibility(true);
       }else if(p0 == 5 || p0 == 4){
          this.updateImportantForAccessibility(false);
       }
       View view = this.t.get();
       if (view != null) {
          BottomSheetBehavior tv = this.v;
          if (tv != null) {
             tv.c(view, p0);
          }
       }
       return;
    }
    public boolean shouldHide(View p0,float p1){
       BottomSheetBehavior uBottomSheet = BottomSheetBehavior.class;
       if (PatchProxy.isSupport(uBottomSheet)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, uBottomSheet, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (this.l != null) {
          return b;
       }else if(p0.getTop() < this.i){
          return false;
       }else if((Math.abs((((float)p0.getTop() + (p1 * 0.10f)) - (float)this.i)) / (float)this.c) - 0x3f000000 > 0){
          b = false;
       }
       return b;
    }
    public final void updateImportantForAccessibility(boolean p0){
       BottomSheetBehavior uBottomSheet = BottomSheetBehavior.class;
       if (PatchProxy.isSupport(uBottomSheet) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBottomSheet, "24")) {
          return;
       }
       uBottomSheet = this.t;
       if (uBottomSheet == null) {
          return;
       }
       ViewParent parent = uBottomSheet.get().getParent();
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
                BottomSheetBehavior tA = this.A;
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
