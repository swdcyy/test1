package com.yxcorp.gifshow.widget.SwipeLayout;
import android.widget.FrameLayout;
import android.content.Context;
import java.util.ArrayList;
import java.util.BitSet;
import com.yxcorp.gifshow.widget.SwipeLayout$Direction;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import joc.c;
import tyc.a5;
import lnc.c3$a;
import lnc.c3;
import joc.z;
import java.lang.Integer;
import joc.a0;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import java.lang.Number;
import java.lang.Math;
import java.lang.Boolean;
import joc.c0;
import ekd.p1;
import android.graphics.Canvas;
import android.view.ViewGroup;
import tyc.n0;
import tyc.k0;
import java.lang.Exception;
import com.yxcorp.gifshow.osbug.IgnorableOSBugException;
import android.view.ViewConfiguration;
import ekd.e0;
import com.yxcorp.utility.n;
import tyc.z4;
import java.util.Iterator;
import com.yxcorp.gifshow.widget.SwipeLayout$b;
import android.graphics.Rect;
import lnc.d3;
import com.yxcorp.gifshow.widget.SwipeLayout$a;
import a2.q;
import tyc.b5;
import java.lang.IllegalStateException;
import android.view.ViewParent;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.util.Objects;

public class SwipeLayout extends FrameLayout	// class@0018d1
{
    public FrameLayout A;
    public z B;
    public n0 C;
    public BitSet D;
    public z4 E;
    public final List F;
    public boolean G;
    public boolean H;
    public float b;
    public int c;
    public View d;
    public float e;
    public float f;
    public int g;
    public float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public SwipeLayout$b m;
    public List n;
    public SwipeLayout$Direction o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;
    public static final int I;

    public void SwipeLayout(Context p0){
       super(p0);
       this.b = 0x3f800000;
       this.c = 50;
       this.h = 0xbf800000;
       this.l = -1;
       this.n = new ArrayList();
       this.q = true;
       this.u = true;
       this.v = false;
       this.z = 0;
       this.D = new BitSet();
       this.F = new ArrayList();
       this.o = SwipeLayout$Direction.RIGHT;
       this.p = false;
       this.r = false;
       this.g();
    }
    public void SwipeLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SwipeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0x3f800000;
       this.c = 50;
       this.h = 0xbf800000;
       this.l = -1;
       this.n = new ArrayList();
       this.q = true;
       this.u = true;
       this.v = false;
       this.z = 0;
       this.D = new BitSet();
       this.F = new ArrayList();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.A5, p2, false);
       String str = typedArray.getString(false);
       if (("left").equals(str)) {
          this.o = SwipeLayout$Direction.LEFT;
       }else if(("right").equals(str)){
          this.o = SwipeLayout$Direction.RIGHT;
       }else {
          this.o = SwipeLayout$Direction.RIGHT;
       }
       this.p = typedArray.getBoolean(true, false);
       this.r = typedArray.getBoolean(2, true);
       typedArray.recycle();
       this.g();
       return;
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwipeLayout.class, "18")) {
          return;
       }
       this.n.add(p0);
       c3.c(this.getGenericGestureDetector(), new a5(p0));
       return;
    }
    public void b(int p0,z p1){
       if (PatchProxy.isSupport(SwipeLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, SwipeLayout.class, "14")) {
          return;
       }
       SwipeLayout tB = this.B;
       if (tB instanceof a0) {
          tB.j(p0, p1);
       }else {
          a0 uoa0 = new a0();
          SwipeLayout tB1 = this.B;
          if (tB1 != null) {
             uoa0.k(tB1);
          }
          int i = 1;
          if (p0 < i) {
             uoa0.j(p0, p1);
          }else {
             uoa0.k(p1);
             if (p0 > i) {
                Log.j("SwipeLayout", new IllegalArgumentException("index is"+p0));
             }
          }
          this.B = uoa0;
       }
       return;
    }
    public void c(z p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwipeLayout.class, "15")) {
          return;
       }
       SwipeLayout tB = this.B;
       if (tB == null) {
          this.B = p0;
       }else if(tB instanceof a0){
          tB.k(p0);
       }else {
          a0 uoa0 = new a0();
          SwipeLayout tB1 = this.B;
          if (tB1 != null) {
             uoa0.k(tB1);
          }
          uoa0.k(p0);
          this.B = uoa0;
       }
       return;
    }
    public final int d(float p0,float p1,MotionEvent p2){
       boolean b;
       SwipeLayout to1;
       SwipeLayout$Direction uDirection;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(SwipeLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Float.valueOf(p1), p2, this, SwipeLayout.class, "26");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       float f = Math.abs(p0);
       p1 = Math.abs(p1);
       if (this.m != null) {
          if (PatchProxy.isSupport(SwipeLayout.class)) {
             Object obj1 = PatchProxy.applyTwoRefs(p2, Float.valueOf(p0), this, SwipeLayout.class, "23");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(this.u == null){
                int i = -1;
                if (this.v != null) {
                   if (PatchProxy.isSupport(SwipeLayout.class)) {
                      obj1 = PatchProxy.applyTwoRefs(p2, Float.valueOf(p0), this, SwipeLayout.class, "24");
                      if (obj1 != patchProxyRe) {
                         b = obj1.booleanValue();
                      }
                   }
                   if (p0 > 0) {
                      to1 = this.o;
                      if (to1 == SwipeLayout$Direction.RIGHT || to1 == SwipeLayout$Direction.BOTH) {
                         uDirection = 1;
                      label_009b :
                         if (uDirection != i) {
                            b = c0.a(this, 0, uDirection, (int)p2.getX(), (int)p2.getY());
                         }
                      }
                   }else if(p0 < 0){
                      to1 = this.o;
                      if (to1 == SwipeLayout$Direction.LEFT || to1 == SwipeLayout$Direction.BOTH) {
                         uDirection = 2;
                         goto label_009b ;
                      }
                   }
                   uDirection = -1;
                   goto label_009b ;
                }else if(this.o == SwipeLayout$Direction.RIGHT){
                   i = 0;
                }
                b = p1.a(this.d, i, (int)p2.getX(), (int)p2.getY());
             }
             b = false;
          }else {
             goto label_0053 ;
          }
          if (!b) {
             SwipeLayout to = this.o;
             if (to == SwipeLayout$Direction.RIGHT || (to == SwipeLayout$Direction.BOTH && (p0 > 0 && (f - this.h > 0 && (this.b * p1) - f < 0)))) {
                return 1;
             }else if(to == SwipeLayout$Direction.LEFT || (to == SwipeLayout$Direction.BOTH && (p0 < 0 && (f - this.h >= 0 && p1 - f < 0)))){
                return 2;
             }
          }
       }
    label_00fd :
       return 0;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwipeLayout.class, "9")) {
          return;
       }
       super.dispatchDraw(p0);
       if (this.r != null) {
          this.C.a(this, p0);
       }
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwipeLayout.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       try{
          if (p0.getActionIndex() && this.G != null) {
             return b;
          }
          if (this.H != null) {
             k0.a(this, p0);
          }
          this.H = b;
          this.H = false;
          return super.dispatchTouchEvent(p0);
       }catch(java.lang.NullPointerException e3){
       }catch(java.lang.IllegalArgumentException e3){
       }
       IgnorableOSBugException.ignoreOrThrowIt(this.getClass().getName(), e3);
       return b;
    }
    public void e(boolean p0){
       this.v = p0;
    }
    public boolean f(int p0){
       if (PatchProxy.isSupport(SwipeLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SwipeLayout.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return (this.D.get(p0) ^ 0x01);
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, SwipeLayout.class, "1")) {
          return;
       }
       this.e = (float)ViewConfiguration.get(this.getContext()).getScaledTouchSlop();
       this.f = p1.d(this.getContext());
       int i = n.y(e0.b);
       this.g = i;
       this.E = new z4((float)(i / 2));
       if (this.r != null) {
          this.C = new n0(this.getContext());
       }
       this.setWillNotDraw(true);
       return;
    }
    public boolean getAdjustChildScrollHorizontally(){
       return this.u;
    }
    public SwipeLayout$Direction getDirection(){
       return this.o;
    }
    public int getDragState(){
       return this.z;
    }
    public boolean getEnableSwipeFlagIntercept(){
       return this.y;
    }
    public boolean getEnabled(){
       Object obj = PatchProxy.apply(null, this, SwipeLayout.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.D.get(1) ^ 1);
    }
    public final c getGenericGestureDetector(){
       SwipeLayout obj = PatchProxy.apply(null, this, SwipeLayout.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.B;
       if (obj instanceof c) {
          return obj;
       }
       if (obj instanceof a0) {
          Iterator iterator = obj.l().iterator();
          while (iterator.hasNext()) {
             z oz = iterator.next();
             if (oz instanceof c) {
                return oz;
             }
          }
       }
       return null;
    }
    public SwipeLayout$b getOnSwipedListener(){
       return this.m;
    }
    public boolean getRestrictDirection(){
       return this.w;
    }
    public z4 getSwipeEvaluator(){
       return this.E;
    }
    public z getTouchDetector(){
       return this.B;
    }
    public boolean h(MotionEvent p0){
       View view;
       Rect obj = PatchProxy.applyOneRefs(p0, this, SwipeLayout.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new Rect();
       Iterator iterator = this.n.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          view = iterator.next();
          view.getGlobalVisibleRect(obj);
          if (obj.contains((int)p0.getRawX(), (int)p0.getRawY())) {
             if (!view instanceof d3) {
                return true;
             }
             break ;
          }
       }
       return view.a();
    }
    public final void i(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwipeLayout.class, "4")) {
          return;
       }
       for (int i = 0; i < this.F.size(); i = i + 1) {
          this.F.get(i).a(p0);
       }
       return;
    }
    public final void j(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwipeLayout.class, "25")) {
          return;
       }
       int i = q.b(p0);
       if (q.e(p0, i) == this.l) {
          i = (!i)? 1: 0;
          this.l = q.e(p0, i);
       }
       return;
    }
    public void k(){
       this.B = null;
    }
    public void l(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwipeLayout.class, "19")) {
          return;
       }
       this.n.remove(p0);
       c3.c(this.getGenericGestureDetector(), new b5(p0));
       return;
    }
    public void m(z p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwipeLayout.class, "16")) {
          return;
       }
       SwipeLayout tB = this.B;
       if (tB instanceof a0) {
          tB.m(p0);
       }else if(tB == p0){
          this.B = null;
       }
       return;
    }
    public void n(boolean p0,int p1){
       if (PatchProxy.isSupport(SwipeLayout.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, SwipeLayout.class, "13")) {
          return;
       }
       Log.g("SwipeLayout", this+";enable:"+p0+";flag:"+p1);
       if (p0) {
          this.D.clear(p1);
       }else {
          this.D.set(p1);
       }
       Log.g("SwipeLayout", this+";set:"+this.D);
       v5 = (!this.D.cardinality())? true: false;
       super.setEnabled(v5);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, SwipeLayout.class, "8")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.r != null) {
          this.C.b(this);
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       boolean i1;
       float f;
       SwipeLayout obj = PatchProxy.applyOneRefs(p0, this, SwipeLayout.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!PatchProxy.applyVoid(null, this, SwipeLayout.class, "22")) {
          if (this.d == null) {
             if (this.getChildCount() <= b || this.isInEditMode()) {
                this.d = this.getChildAt(false);
             }else {
                throw new IllegalStateException("SwipeLayout can host only one direct child");
             }
          }
          if (!this.h - 0xbf800000 && (this.getParent() != null && this.getParent().getWidth() > 0)) {
             this.h = (float)(int)Math.min(((float)this.getParent().getWidth() * 0.20f), ((float)this.c * c.c(this.getResources()).density));
          }
       label_0082 :
          if (this.A == null && this.getParent() != null) {
             this.A = this.getParent().findViewById(0x1020002);
          }
       }
    label_009d :
       boolean i = q.c(p0);
       if (!i) {
          this.x = this.h(p0);
          this.G = false;
       }
       if (this.x != null) {
          return false;
       }else {
          SwipeLayout tB = this.B;
          if (tB != null && tB.c(this, p0)) {
             return b;
          }else if(!this.isEnabled()){
             return false;
          }else if(!i){
             this.E.a();
          }
          tB = 3;
          if (i != b && i != tB) {
             this.E.b(p0.getX(), p0.getY(), p0.getEventTime());
          }
          if (i) {
             i1 = -1;
             if (i != b) {
                if (i != 2) {
                   if (i != tB) {
                      if (i == 6) {
                         this.j(p0);
                      }
                   }
                }else {
                   obj = this.l;
                   if (obj == i1) {
                      return false;
                   }else {
                      i = q.a(p0, obj);
                      if (i < 0) {
                         return false;
                      }else if(this.p != null){
                         SwipeLayout to = this.o;
                         if (to == SwipeLayout$Direction.RIGHT && this.i - this.f > 0) {
                            return false;
                         }else if(to == SwipeLayout$Direction.LEFT && this.i - ((float)this.g - this.f) < 0){
                            return false;
                         }
                      }
                      f = q.g(p0, i) - this.j;
                      this.z = this.d((q.f(p0, i) - this.i), f, p0);
                      this.i(p0);
                      if (this.z == tB && (this.A.getScrollY() >= 0 && f < 0)) {
                         this.z = 0;
                      }
                   }
                }
             }
             this.i(p0);
             this.z = 0;
             this.l = i1;
             this.s = false;
             this.t = false;
             this.x = false;
             this.E.a();
          }else {
             this.i = p0.getX();
             f = p0.getY();
             this.j = f;
             this.k = (int)f;
             this.l = q.e(p0, false);
             obj = this.i;
             tB = this.f;
             i1 = (obj - tB <= 0)? true: false;
             this.s = i1;
             i = (obj - ((float)this.g - tB) >= 0)? true: false;
             this.t = i;
             this.z = 0;
             this.i(p0);
          }
       label_0195 :
          if (this.z == null) {
             b = false;
          }
          return b;
       }
    }
    public boolean onTouchEvent(MotionEvent p0){
       SwipeLayout tl;
       boolean i2;
       float f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SwipeLayout obj = PatchProxy.applyOneRefs(p0, this, SwipeLayout.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int i = q.c(p0);
       if (this.x != null) {
          return false;
       }
       SwipeLayout tB = this.B;
       if (tB != null && tB.e(this, p0)) {
          return true;
       }
       if (!this.isEnabled() || this.h(p0)) {
          return false;
       }
       if (!i) {
          this.E.a();
       }
       z4 oz4 = 3;
       if (i != 1 && i != oz4) {
          this.E.b(p0.getX(), p0.getY(), p0.getEventTime());
       }
       if (i) {
          int i1 = -1;
          SwipeLayout swipeLayout = 2;
          if (i != 1) {
             if (i != swipeLayout) {
                if (i != oz4) {
                   if (i != 5) {
                      if (i == 6) {
                         this.j(p0);
                      }
                   }else {
                      this.l = q.e(p0, q.b(p0));
                   }
                }
             }else {
                tl = this.l;
                if (tl == i1) {
                   return false;
                }else {
                   i2 = q.a(p0, tl);
                   if (i2 < 0) {
                      return false;
                   }else if(this.p != null){
                      obj = this.o;
                      if (obj == SwipeLayout$Direction.RIGHT && this.i - this.f > 0) {
                         return false;
                      }else if(obj == SwipeLayout$Direction.LEFT && this.i - ((float)this.g - this.f) < 0){
                         return false;
                      }
                   }
                   f = q.g(p0, i2);
                   float f1 = q.f(p0, i2) - this.i;
                   float f2 = f - this.j;
                   i2 = (int)f;
                   int i3 = this.k - i2;
                   this.k = i2;
                   if (this.z == null) {
                      this.z = this.d(f1, f2, p0);
                   }
                   this.i(p0);
                   if (this.z == oz4) {
                      if ((this.A.getScrollY() + i3) > 0) {
                         i3 = - this.A.getScrollY();
                      }
                      this.A.scrollBy(false, i3);
                   }
                }
             }
          }else {
             obj = this.z;
             if (obj == swipeLayout || obj == true) {
                if (this.w != null) {
                   obj = this.E;
                   Objects.requireNonNull(obj);
                   Object obj1 = PatchProxy.apply(null, obj, z4.class, "2");
                   if (obj1 != patchProxyRe) {
                      i2 = obj1.booleanValue();
                   }else if(obj.k != null && (obj.l == null && Math.abs(obj.a) - 0x3f800000 > 0)){
                      i2 = true;
                   }else {
                      i2 = false;
                   }
                   if (i2) {
                   label_011e :
                      if (!PatchProxy.applyVoidOneRefs(p0, this, SwipeLayout.class, "29")) {
                         tl = this.m;
                         if (tl != null) {
                            obj = this.z;
                            if (obj == true) {
                               if (this.s != null && this.q == null) {
                                  tl.c();
                               }else {
                                  tl.d();
                               }
                            }else if(obj == swipeLayout){
                               if (this.t != null && this.q == null) {
                                  tl.b();
                               }else {
                                  tl.a();
                               }
                            }
                         }
                      }
                   }
                }else {
                   goto label_011e ;
                }
             label_0152 :
                this.i(p0);
                this.z = 0;
                this.l = i1;
             }
          }
          this.i(p0);
          this.z = 0;
          this.l = i1;
          this.s = false;
          this.t = false;
          this.x = false;
          this.E.a();
          return false;
       }else {
          this.i = p0.getX();
          f = p0.getY();
          this.j = f;
          this.k = (int)f;
          tl = this.i;
          obj = this.f;
          boolean b = (tl - obj <= 0)? true: false;
          this.s = b;
          i2 = (tl - ((float)this.g - obj) >= 0)? true: false;
          this.t = i2;
          this.l = q.e(p0, false);
          this.z = 0;
          this.i(p0);
       }
       return true;
    }
    public void setAdjustChildScrollHorizontally(boolean p0){
       if (PatchProxy.isSupport(SwipeLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SwipeLayout.class, "21")) {
          return;
       }
       Log.g("SwipeLayout", "setAdjustChildScrollHorizontally="+p0);
       this.u = p0;
       return;
    }
    public void setDirection(SwipeLayout$Direction p0){
       this.o = p0;
    }
    public void setDirectionTriggerSensitivity(float p0){
       if (p0 - 0x3f800000 >= 0) {
          this.b = p0;
       }
       return;
    }
    public void setEnableInterceptPointerAction(boolean p0){
       this.G = p0;
    }
    public void setEnableSwipeFlagIntercept(boolean p0){
       this.y = p0;
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(SwipeLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SwipeLayout.class, "10")) {
          return;
       }
       this.n(p0, 1);
       return;
    }
    public void setFromEdge(boolean p0){
       this.p = p0;
    }
    public void setIgnoreEdge(boolean p0){
       this.q = p0;
    }
    public void setOnSwipedListener(SwipeLayout$b p0){
       this.m = p0;
    }
    public void setRestrictDirection(boolean p0){
       this.w = p0;
    }
    public void setSwipeEvaluator(z4 p0){
       this.E = p0;
    }
    public void setSwipeTriggerDistance(int p0){
       if (PatchProxy.isSupport(SwipeLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SwipeLayout.class, "27")) {
          return;
       }
       this.c = p0;
       if (this.h - null > 0 && (this.getParent() != null && this.getParent().getWidth() > 0)) {
          this.h = (float)(int)Math.min(((float)this.getParent().getWidth() * 0.20f), ((float)this.c * c.c(this.getResources()).density));
       }
    label_0059 :
       return;
    }
}
