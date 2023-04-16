package com.yxcorp.gifshow.ad.half.AdBottomSheetBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import java.lang.Boolean;
import java.util.ArrayList;
import com.yxcorp.gifshow.ad.half.AdBottomSheetBehavior$a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import java.lang.IllegalArgumentException;
import b2.d$a;
import java.lang.Integer;
import t29.a;
import java.lang.CharSequence;
import b2.g;
import a2.i0;
import java.lang.Number;
import java.lang.Math;
import com.yxcorp.gifshow.ad.half.AdBottomSheetBehavior$b;
import java.lang.ref.WeakReference;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.VelocityTracker;
import java.util.Map;
import java.lang.StringBuilder;
import android.view.ViewParent;
import t29.b;
import java.lang.Runnable;
import androidx.customview.widget.ViewDragHelper;
import com.yxcorp.gifshow.ad.half.AdBottomSheetBehavior$c;
import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.content.res.Resources;
import cw9.c;
import androidx.customview.widget.ViewDragHelper$c;
import java.lang.Float;
import yx.j0;
import java.util.HashMap;

public class AdBottomSheetBehavior extends CoordinatorLayout$Behavior	// class@00177a
{
    public final ArrayList A;
    public VelocityTracker B;
    public int C;
    public int D;
    public boolean E;
    public float F;
    public Map G;
    public final ViewDragHelper$c H;
    public Boolean a;
    public Boolean b;
    public boolean c;
    public boolean d;
    public float e;
    public int f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public AdBottomSheetBehavior$c k;
    public ValueAnimator l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;
    public ViewDragHelper r;
    public boolean s;
    public int t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public WeakReference y;
    public WeakReference z;

    public void AdBottomSheetBehavior(){
       super();
       Boolean fALSE = Boolean.FALSE;
       this.a = fALSE;
       this.b = fALSE;
       this.c = true;
       this.d = false;
       this.k = null;
       this.o = true;
       this.q = 4;
       this.A = new ArrayList();
       this.F = 0;
       this.H = new AdBottomSheetBehavior$a(this);
    }
    public void AdBottomSheetBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       Boolean fALSE = Boolean.FALSE;
       this.a = fALSE;
       this.b = fALSE;
       this.c = true;
       this.d = false;
       this.k = null;
       this.o = true;
       this.q = 4;
       this.A = new ArrayList();
       this.F = 0;
       this.H = new AdBottomSheetBehavior$a(this);
       this.e = (float)ViewConfiguration.get(p0).getScaledMaximumFlingVelocity();
    }
    public static AdBottomSheetBehavior g(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AdBottomSheetBehavior.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (!layoutParams instanceof CoordinatorLayout$LayoutParams) {
          throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
       }
       CoordinatorLayout$Behavior uBehavior = layoutParams.f();
       if (uBehavior instanceof AdBottomSheetBehavior) {
          return uBehavior;
       }
       throw new IllegalArgumentException("The view is not associated with AdBottomSheetBehavior");
    }
    public final void c(View p0,d$a p1,int p2){
       if (PatchProxy.isSupport(AdBottomSheetBehavior.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, AdBottomSheetBehavior.class, "38")) {
          return;
       }
       i0.o0(p0, p1, null, new a(this, p2));
       return;
    }
    public final void calculateCollapsedOffset(){
       int i;
       AdBottomSheetBehavior uAdBottomShe = AdBottomSheetBehavior.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAdBottomShe, "27")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, uAdBottomShe, "26");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(this.g != null){
          i = Math.min(Math.max(this.h, (this.x - ((this.w * 9) / 16))), this.v);
       }else {
          i = this.f;
       }
       this.n = (this.c != null)? Math.max((this.x - i), this.m): this.x - i;
       return;
    }
    public void d(AdBottomSheetBehavior$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdBottomSheetBehavior.class, "20")) {
          return;
       }
       if (!this.A.contains(p0)) {
          this.A.add(p0);
       }
       return;
    }
    public void dispatchOnSlide(int p0){
       float f;
       float f1;
       AdBottomSheetBehavior uAdBottomShe = AdBottomSheetBehavior.class;
       if (PatchProxy.isSupport(uAdBottomShe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAdBottomShe, "33")) {
          return;
       }
       uAdBottomShe = this.y;
       if (uAdBottomShe == null) {
          return;
       }
       View view = uAdBottomShe.get();
       if (view != null && !this.A.isEmpty()) {
          AdBottomSheetBehavior tn = this.n;
          if (p0 > tn || tn == this.getExpandedOffset()) {
             tn = this.n;
             f = (float)(tn - p0);
             f1 = (float)(this.x - tn);
          }else {
             tn = this.n;
             f = (float)(tn - p0);
             f1 = (float)(tn - this.getExpandedOffset());
          }
          f = f / f1;
          for (int i = 0; i < this.A.size(); i = i + 1) {
             this.A.get(i).a(view, f);
          }
       }
       return;
    }
    public final void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdBottomSheetBehavior.class, "11")) {
          return;
       }
       if (p0 instanceof ViewGroup) {
          ViewGroup viewGroup = p0;
          int childCount = viewGroup.getChildCount();
          boolean b = false;
          if (p0 instanceof RecyclerView) {
             RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
             if (layoutManage instanceof LinearLayoutManager && !layoutManage.getOrientation()) {
                p0.setNestedScrollingEnabled(b);
                return;
             }
          }
          while (b < childCount) {
             this.e(viewGroup.getChildAt(b));
             b = b + 1;
          }
       }
       return;
    }
    public View findScrollingChild(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdBottomSheetBehavior.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (i0.Z(p0)) {
          return p0;
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
    public int getExpandedOffset(){
       return this.m;
    }
    public int getState(){
       return this.q;
    }
    public final float getYVelocity(){
       AdBottomSheetBehavior obj = PatchProxy.apply(null, this, AdBottomSheetBehavior.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.B;
       if (obj == null) {
          return 0;
       }
       obj.computeCurrentVelocity(1000, this.e);
       return this.B.getYVelocity(this.C);
    }
    public final void h(boolean p0,View p1){
       AdBottomSheetBehavior uAdBottomShe = AdBottomSheetBehavior.class;
       if (PatchProxy.isSupport(uAdBottomShe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uAdBottomShe, "36")) {
          return;
       }
       uAdBottomShe = this.y;
       if (uAdBottomShe != null && p1 != uAdBottomShe.get()) {
          if (p0) {
             this.G.put(p1, Integer.valueOf(p1.getImportantForAccessibility()));
             if (this.d != null) {
                i0.D0(p1, 4);
             }
          }else if(this.d != null){
             AdBottomSheetBehavior tG = this.G;
             if (tG != null && tG.containsKey(p1)) {
                i0.D0(p1, this.G.get(p1).intValue());
             }
          }
       }
       return;
    }
    public void i(View p0,int p1){
       int expandedOffs;
       AdBottomSheetBehavior uAdBottomShe = AdBottomSheetBehavior.class;
       if (PatchProxy.isSupport(uAdBottomShe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAdBottomShe, "31")) {
          return;
       }
       if (p1 == 4) {
          uAdBottomShe = this.n;
       }else if(p1 == 3){
          expandedOffs = this.getExpandedOffset();
       }else if(this.o != null && p1 == 5){
          expandedOffs = this.x;
       }else {
          throw new IllegalArgumentException("Illegal state argument: "+p1);
       }
       this.k(p0, p1, uAdBottomShe, false);
       return;
    }
    public final void j(int p0){
       AdBottomSheetBehavior uAdBottomShe = AdBottomSheetBehavior.class;
       if (PatchProxy.isSupport(uAdBottomShe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAdBottomShe, "23")) {
          return;
       }
       uAdBottomShe = this.y;
       if (uAdBottomShe == null) {
          return;
       }
       View view = uAdBottomShe.get();
       if (view == null) {
          return;
       }
       ViewParent parent = view.getParent();
       if (parent != null && (parent.isLayoutRequested() && i0.X(view))) {
          view.post(new b(this, view, p0));
       }else {
          this.i(view, p0);
       }
       return;
    }
    public void k(View p0,int p1,int p2,boolean p3){
       if (PatchProxy.isSupport(AdBottomSheetBehavior.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, AdBottomSheetBehavior.class, "32")) {
          return;
       }
       AdBottomSheetBehavior tr = this.r;
       if (tr != null) {
          if (p3) {
             if (!tr.settleCapturedViewAt(p0.getLeft(), p2)) {
             label_003f :
                AdBottomSheetBehavior tk = 0;
             label_0040 :
                if (p2) {
                   this.setStateInternal(2);
                   this.m(p1);
                   if (this.k == null) {
                      this.k = new AdBottomSheetBehavior$c(this, p0, p1);
                   }
                   tk = this.k;
                   if (tk.c == null) {
                      tk.d = p1;
                      i0.k0(p0, tk);
                      p0.c = true;
                   }else {
                      tk.d = p1;
                   }
                }else {
                   this.setStateInternal(p1);
                }
                return;
             }
          }else if(tr.smoothSlideViewTo(p0, p0.getLeft(), p2)){
          }
          p2 = 1;
          goto label_0040 ;
       }else {
          goto label_003f ;
       }
    }
    public final void l(){
       int i;
       if (PatchProxy.applyVoid(null, this, AdBottomSheetBehavior.class, "37")) {
          return;
       }
       AdBottomSheetBehavior ty = this.y;
       if (ty == null) {
          return;
       }
       View view = ty.get();
       if (view == null) {
          return;
       }
       i0.m0(view, 0x80000);
       i0.m0(view, 0x40000);
       i0.m0(view, 0x100000);
       if (this.o != null) {
          i = 5;
          if (this.q != i) {
             this.c(view, d$a.y, i);
          }
       }
       AdBottomSheetBehavior tq = this.q;
       i = 3;
       if (tq != i) {
          if (tq == 4) {
             if (this.c == null) {
                i = 4;
             }
             this.c(view, d$a.w, i);
          }
       }else {
          this.c(view, d$a.x, 4);
       }
       return;
    }
    public final void m(int p0){
       AdBottomSheetBehavior uAdBottomShe = AdBottomSheetBehavior.class;
       if (PatchProxy.isSupport(uAdBottomShe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAdBottomShe, "25")) {
          return;
       }
       int i = 2;
       if (p0 == i) {
          return;
       }
       boolean b = (p0 == 3)? true: false;
       if (this.j != b) {
          this.j = b;
          AdBottomSheetBehavior tl = this.l;
          if (tl != null) {
             if (tl.isRunning()) {
                this.l.reverse();
             }else {
                float f = 0x3f800000;
                float f1 = (b)? 0: 0x3f800000;
                float[] uofloatArray = new float[i];
                uofloatArray[0] = f - f1;
                uofloatArray[1] = f1;
                this.l.setFloatValues(uofloatArray);
                this.l.start();
             }
          }
       }
       return;
    }
    public void onAttachedToLayoutParams(CoordinatorLayout$LayoutParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdBottomSheetBehavior.class, "1")) {
          return;
       }
       super.onAttachedToLayoutParams(p0);
       this.y = null;
       this.r = null;
       return;
    }
    public void onDetachedFromLayoutParams(){
       if (PatchProxy.applyVoid(null, this, AdBottomSheetBehavior.class, "2")) {
          return;
       }
       super.onDetachedFromLayoutParams();
       this.y = null;
       this.r = null;
       return;
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       boolean b3;
       Object obj2;
       AdBottomSheetBehavior uAdBottomShe = this;
       CoordinatorLayout uCoordinator = p0;
       View view = p1;
       MotionEvent motionEvent = p2;
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, AdBottomSheetBehavior.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       boolean b1 = false;
       if (!p1.isShown()) {
          uAdBottomShe.s = b;
          return b1;
       }else {
          int actionMasked = p2.getActionMasked();
          obj = 3;
          boolean b2 = (actionMasked != b && actionMasked != obj)? true: false;
          uAdBottomShe.a = Boolean.valueOf(b2);
          if (!actionMasked) {
             uAdBottomShe.e(view);
             this.reset();
          }
          if (uAdBottomShe.B == null) {
             uAdBottomShe.B = VelocityTracker.obtain();
          }
          uAdBottomShe.B.addMovement(motionEvent);
          String str = -1;
          if (actionMasked) {
             if (actionMasked == b || actionMasked == obj) {
                uAdBottomShe.E = b1;
                uAdBottomShe.C = str;
                if (uAdBottomShe.s != null) {
                   uAdBottomShe.s = b1;
                   return b1;
                }
             }
             b1 = 2;
          }else {
             b1 = 2;
             obj2 = -1;
             if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AdBottomSheetBehavior.class, "7")) {
                b3 = (int)p2.getX();
                uAdBottomShe.D = (int)p2.getY();
                if (uAdBottomShe.q != b1) {
                   AdBottomSheetBehavior z = uAdBottomShe.z;
                   View view1 = (z != null)? z.get(): null;
                   if (view1 != null && uCoordinator.C(view1, b3, uAdBottomShe.D)) {
                      uAdBottomShe.C = motionEvent.getPointerId(p2.getActionIndex());
                      uAdBottomShe.E = b;
                   }
                }
             label_00b9 :
                b3 = (uAdBottomShe.C == obj2 && !uCoordinator.C(view, b3, uAdBottomShe.D))? true: false;
                uAdBottomShe.s = b3;
             }
          }
          AdBottomSheetBehavior obj1 = PatchProxy.applyOneRefs(motionEvent, uAdBottomShe, AdBottomSheetBehavior.class, "8");
          if (obj1 != PatchProxyResult.class) {
             b3 = obj1.booleanValue();
          }else if(uAdBottomShe.s == null){
             obj1 = uAdBottomShe.r;
             if (obj1 != null && obj1.shouldInterceptTouchEvent(motionEvent)) {
                b3 = true;
             }
          }
          b3 = false;
          if (b3) {
             return b;
          }else if(PatchProxy.isSupport(AdBottomSheetBehavior.class)){
             obj1 = PatchProxy.applyThreeRefs(p0, p2, Integer.valueOf(actionMasked), this, AdBottomSheetBehavior.class, "9");
             if (obj1 != PatchProxyResult.class) {
                b3 = obj1.booleanValue();
             label_0155 :
                return b3;
             }
          }
          obj1 = uAdBottomShe.z;
          obj2 = (obj1 != null)? obj1.get(): null;
          if (actionMasked != b1 || (obj2 == null || (uAdBottomShe.s != null || (uAdBottomShe.q == b || (uCoordinator.C(obj2, (int)p2.getX(), (int)p2.getY()) || (uAdBottomShe.r == null || Math.abs(((float)uAdBottomShe.D - p2.getY())) - (float)uAdBottomShe.r.getTouchSlop() <= 0)))))) {
             b = 0;
          }
          b3 = b;
          goto label_0155 ;
       }
    }
    public boolean onLayoutChild(CoordinatorLayout p0,View p1,int p2){
       if (PatchProxy.isSupport(AdBottomSheetBehavior.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, AdBottomSheetBehavior.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (i0.y(p0) && !i0.y(p1)) {
          p1.setFitsSystemWindows(true);
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, AdBottomSheetBehavior.class, "4") && this.y == null) {
          this.h = c.b(p0.getResources(), 0x7f0701a9);
          this.y = new WeakReference(p1);
          this.l();
          if (!i0.z(p1)) {
             i0.D0(p1, true);
          }
       }
       if (this.r == null) {
          this.r = ViewDragHelper.create(p0, this.H);
       }
       int top = p1.getTop();
       p0.J(p1, p2);
       this.w = p0.getWidth();
       this.x = p0.getHeight();
       int height = p1.getHeight();
       this.v = height;
       this.m = Math.max(0, (this.x - height));
       this.calculateCollapsedOffset();
       if (!PatchProxy.isSupport(AdBottomSheetBehavior.class) || !PatchProxy.applyVoidTwoRefs(p1, Integer.valueOf(top), this, AdBottomSheetBehavior.class, "5")) {
          AdBottomSheetBehavior tq = this.q;
          if (tq == 3) {
             i0.e0(p1, this.getExpandedOffset());
          }else if(this.o != null && tq == 5){
             i0.e0(p1, this.x);
          }else if(tq == 4){
             i0.e0(p1, this.n);
          }else if(tq == true || tq == 2){
             i0.e0(p1, (top - p1.getTop()));
          }
       }
       this.z = new WeakReference(this.findScrollingChild(p1));
       return true;
    }
    public boolean onNestedPreFling(CoordinatorLayout p0,View p1,View p2,float p3,float p4){
       AdBottomSheetBehavior uAdBottomShe = AdBottomSheetBehavior.class;
       int i = 1;
       if (PatchProxy.isSupport(uAdBottomShe)) {
          Object[] objArray = new Object[]{p0,p1,p2,Float.valueOf(p3),Float.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uAdBottomShe, "14");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.F = p4;
       uAdBottomShe = this.z;
       if (uAdBottomShe != null) {
          if (p2 != uAdBottomShe.get() || (this.q == 3 && !super.onNestedPreFling(p0, p1, p2, p3, p4))) {
             i = false;
          }
          return i;
       }else {
          return 0;
       }
    }
    public void onNestedPreScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int[] p5,int p6){
       if (PatchProxy.isSupport(AdBottomSheetBehavior.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),p5,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, AdBottomSheetBehavior.class, "12")) {
             return;
          }
       }
       if (p6 == 1) {
          return;
       }else {
          AdBottomSheetBehavior tz = this.z;
          View view = (tz != null)? tz.get(): null;
          if (p2 != view) {
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
                AdBottomSheetBehavior tn = this.n;
                if (p3 <= tn || this.o != null) {
                   p5[1] = p4;
                   i0.e0(p1, (- p4));
                   this.setStateInternal(1);
                }else {
                   p5[1] = top - tn;
                   i0.e0(p1, (- p5[1]));
                   this.setStateInternal(4);
                }
             }
             this.dispatchOnSlide(p1.getTop());
             this.t = p4;
             this.u = true;
             return;
          }
       }
    }
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       int i = 0;
       this.t = i;
       this.u = i;
       if (p4 & 0x02) {
          i = true;
       }
       return i;
    }
    public void onStopNestedScroll(CoordinatorLayout p0,View p1,View p2,int p3){
       if (PatchProxy.isSupport(AdBottomSheetBehavior.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, AdBottomSheetBehavior.class, "13")) {
          return;
       }
       int i = 3;
       if (p1.getTop() == this.getExpandedOffset()) {
          this.setStateInternal(i);
          return;
       }else {
          AdBottomSheetBehavior tz = this.z;
          if (tz == null || (p2 == tz.get() && this.u != null)) {
             if (this.t > null) {
                if (this.v > this.f && p1.getTop() < (this.x - this.f)) {
                   tz = this.m;
                }else {
                   tz = this.n;
                label_0056 :
                   i = 4;
                }
             }else {
                Object[] objArray = new Object[false];
                j0.a("lx24", "getYVelocity"+this.getYVelocity(), objArray);
                float yVelocity = this.getYVelocity();
                if (!yVelocity) {
                   yVelocity = this.F;
                }
                if (Math.abs(yVelocity) - 0x447a0000 > 0 || p1.getTop() > (this.x - this.f)) {
                   tz = this.x;
                   i = 5;
                }else if(this.b.booleanValue()){
                   tz = this.m;
                }else {
                   tz = this.n;
                   goto label_0056 ;
                }
             }
             this.k(p1, i, tz, false);
             this.u = false;
          }
       label_00ab :
          return;
       }
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AdBottomSheetBehavior.class, "10");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (!p1.isShown()) {
          return false;
       }
       int actionMasked = p2.getActionMasked();
       if (this.q == true && !actionMasked) {
          return true;
       }
       AdBottomSheetBehavior tr = this.r;
       if (tr != null) {
          tr.processTouchEvent(p2);
       }
       if (!actionMasked) {
          this.reset();
       }
       if (this.B == null) {
          this.B = VelocityTracker.obtain();
       }
       this.B.addMovement(p2);
       if (this.r != null && (actionMasked == 0.00f && (this.s == null && Math.abs(((float)this.D - p2.getY())) - (float)this.r.getTouchSlop() > 0))) {
          this.r.captureChildView(p1, p2.getPointerId(p2.getActionIndex()));
       }
    label_0075 :
       return (this.s ^ true);
    }
    public final void reset(){
       if (PatchProxy.applyVoid(null, this, AdBottomSheetBehavior.class, "28")) {
          return;
       }
       this.C = -1;
       AdBottomSheetBehavior tB = this.B;
       if (tB != null) {
          tB.recycle();
          this.B = null;
       }
       return;
    }
    public void setState(int p0){
       AdBottomSheetBehavior uAdBottomShe = AdBottomSheetBehavior.class;
       if (PatchProxy.isSupport(uAdBottomShe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAdBottomShe, "22")) {
          return;
       }
       if (p0 == this.q) {
          return;
       }
       if (this.y == null) {
          if (p0 != 4 && (p0 == 3 || (this.o != null && p0 == 5))) {
             this.q = p0;
          }
          return;
       }else {
          this.j(p0);
          return;
       }
    }
    public void setStateInternal(int p0){
       AdBottomSheetBehavior uAdBottomShe = AdBottomSheetBehavior.class;
       if (PatchProxy.isSupport(uAdBottomShe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAdBottomShe, "24")) {
          return;
       }
       if (this.q == p0) {
          return;
       }
       this.q = p0;
       uAdBottomShe = this.y;
       if (uAdBottomShe == null) {
          return;
       }
       View view = uAdBottomShe.get();
       if (view == null) {
          return;
       }
       int i = 0;
       boolean b = (this.b.booleanValue() || p0 == 3)? true: false;
       this.b = Boolean.valueOf(b);
       if (p0 == 3) {
          this.updateImportantForAccessibility(true);
       }else if(p0 == 5 || p0 == 4){
          this.updateImportantForAccessibility(i);
       }
       this.m(p0);
       for (; i < this.A.size(); i = i + 1) {
          this.A.get(i).b(view, p0);
       }
       this.l();
       return;
    }
    public final void updateImportantForAccessibility(boolean p0){
       AdBottomSheetBehavior uAdBottomShe = AdBottomSheetBehavior.class;
       if (PatchProxy.isSupport(uAdBottomShe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAdBottomShe, "35")) {
          return;
       }
       uAdBottomShe = this.y;
       if (uAdBottomShe == null) {
          return;
       }
       ViewParent parent = uAdBottomShe.get().getParent();
       if (!parent instanceof CoordinatorLayout) {
          return;
       }
       int childCount = parent.getChildCount();
       if (p0) {
          if (this.G == null) {
             this.G = new HashMap(childCount);
          }else {
             return;
          }
       }
       for (int i = 0; i < childCount; i = i + 1) {
          this.h(p0, parent.getChildAt(i));
       }
       if (!p0) {
          this.G = null;
       }
       return;
    }
}
