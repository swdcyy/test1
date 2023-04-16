package com.kwai.yoda.slide.a;
import com.kwai.yoda.slide.a$a;
import android.content.Context;
import android.view.ViewGroup;
import com.kwai.yoda.slide.a$c;
import java.lang.Object;
import com.kwai.yoda.slide.a$b;
import android.view.ViewConfiguration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.view.animation.Interpolator;
import e2.g;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Arrays;
import android.view.VelocityTracker;
import java.lang.Float;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import java.util.Objects;
import android.view.View;
import java.lang.Number;
import a2.h0;
import java.lang.System;
import android.view.MotionEvent;
import a2.q;
import java.lang.Runnable;
import java.lang.IllegalStateException;
import android.view.ViewParent;
import java.lang.StringBuilder;

public class a	// class@0012ea
{
    public final a$c a;
    public final ViewGroup b;
    public int c;
    public int d;
    public int e;
    public float[] f;
    public float[] g;
    public float[] h;
    public float[] i;
    public int[] j;
    public int[] k;
    public int[] l;
    public int m;
    public VelocityTracker n;
    public float o;
    public float p;
    public int q;
    public int r;
    public g s;
    public View t;
    public final Runnable u;
    public boolean v;
    public static final Interpolator w;

    static {
       a.w = new a$a();
    }
    public void a(Context p0,ViewGroup p1,a$c p2){
       super();
       this.e = -1;
       this.u = new a$b(this);
       if (p2 == null) {
          throw new IllegalArgumentException("Callback may not be null");
       }
       this.b = p1;
       this.a = p2;
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
       this.q = (int)((c.c(p0.getResources()).density * 20.00f) + 0x3f000000);
       this.d = viewConfigur.getScaledTouchSlop();
       this.o = (float)viewConfigur.getScaledMaximumFlingVelocity();
       this.p = (float)viewConfigur.getScaledMinimumFlingVelocity();
       this.s = g.d(p0, a.w);
       return;
    }
    public void a(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "4")) {
          return;
       }
       this.e = -1;
       if (!PatchProxy.applyVoid(null, this, uoa, "17")) {
          uoa = this.f;
          if (uoa != null) {
             Arrays.fill(uoa, 0);
             Arrays.fill(this.g, 0);
             Arrays.fill(this.h, 0);
             Arrays.fill(this.i, 0);
             Arrays.fill(this.j, 0);
             Arrays.fill(this.k, 0);
             Arrays.fill(this.l, 0);
             this.m = 0;
          }
       }
       uoa = this.n;
       if (uoa != null) {
          uoa.recycle();
          this.n = null;
       }
       return;
    }
    public final boolean b(float p0,float p1,int p2,int p3){
       a obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(Float.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0 = Math.abs(p0);
       p1 = Math.abs(p1);
       boolean b = false;
       if ((this.j[p2] & p3) == p3 && ((this.r & p3) && ((this.l[p2] & p3) != p3 && (this.k[p2] & p3) != p3))) {
          obj = this.d;
          if (p0 - (float)obj > 0 || p1 - (float)obj > 0) {
             if (p0 - (p1 * 0x3f000000) < 0) {
                Objects.requireNonNull(this.a);
             }
             if (!(this.k[p2] & p3) && p0 - (float)this.d > 0) {
                b = true;
             }
          }
       }
    label_0078 :
       return b;
    }
    public final boolean c(View p0,float p1,float p2){
       float f;
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, a.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }else if(this.a.b(p0) > 0){
          f = Float.MIN_VALUE;
       }else {
          f = 0;
       }
       Objects.requireNonNull(this.a);
       if (f && Math.abs(p1) - (float)this.d > 0) {
          b = true;
       }
       return b;
    }
    public final float d(float p0,float p1,float p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, a.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       float f = Math.abs(p0);
       if (f - p1 < 0) {
          return 0;
       }else if(f - p2 > 0){
          if (p0 <= 0) {
             p2 = - p2;
          }
          return p2;
       }else {
          return p0;
       }
    }
    public final int e(int p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = Math.abs(p0);
       if (i < p1) {
          return 0;
       }else if(i > p2){
          if (p0 <= 0) {
             p2 = - p2;
          }
          return p2;
       }else {
          return p0;
       }
    }
    public final void f(int p0){
       a tf = this.f;
       if (tf == null) {
          return;
       }
       tf[p0] = 0;
       this.g[p0] = 0;
       this.h[p0] = 0;
       this.i[p0] = 0;
       this.j[p0] = 0;
       this.k[p0] = 0;
       this.l[p0] = 0;
       this.m = (~ (1 << p0)) & this.m;
       return;
    }
    public final int g(int p0,int p1,int p2){
       float f2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "10");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       if (!p0) {
          return 0;
       }else {
          int width = this.b.getWidth();
          int i = width / 2;
          float f = Math.min(0x3f800000, ((float)Math.abs(p0) / (float)width));
          float f1 = (float)i;
          if (PatchProxy.isSupport(uoa)) {
             Object obj1 = PatchProxy.applyOneRefs(Float.valueOf(f), this, uoa, "13");
             if (obj1 != patchProxyRe) {
                f2 = obj1.floatValue();
             label_006d :
                f1 = f1 + (f2 * f1);
                p1 = Math.abs(p1);
                p0 = (p1 > 0)? Math.round((Math.abs((f1 / (float)p1)) * 1000.00f)) * 4: (int)((((float)Math.abs(p0) / (float)p2) + 0x3f800000) * 256.00f);
                return Math.min(p0, 600);
             }
          }
          f2 = (float)Math.sin((double)(float)((double)(f - 0x3f000000) * 0x3fde28c7460698c7));
          goto label_006d ;
       }
    }
    public final void h(float p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uoa, "16")) {
          return;
       }
       this.v = true;
       this.a.e(this.t, p0, p1);
       this.v = false;
       if (this.c == true) {
          this.p(false);
       }
       return;
    }
    public View i(int p0,int p1){
       View childAt;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "37");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = this.b.getChildCount() - 1;
       while (true) {
          if (i < 0) {
             return null;
          }
          Objects.requireNonNull(this.a);
          childAt = this.b.getChildAt(i);
          if (p0 >= childAt.getLeft() && (p0 < childAt.getRight() && (p1 >= childAt.getTop() && p1 < childAt.getBottom()))) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return childAt;
    }
    public boolean j(int p0){
       int i = 1;
       if ((i << p0) & this.m) {
       }else {
          i = false;
       }
       return i;
    }
    public final boolean k(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "39");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!this.j(p0)) {
          return false;
       }else {
          return true;
       }
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "33")) {
          return;
       }
       this.n.computeCurrentVelocity(1000, this.o);
       this.h(this.d(h0.a(this.n, this.e), this.p, this.o), this.d(h0.b(this.n, this.e), this.p, this.o));
       return;
    }
    public final void m(float p0,float p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, a.class, "26")) {
          return;
       }
       boolean b = this.b(p0, p1, p2, 1);
       if (this.b(p1, p0, p2, 4)) {
          b = b | 0x04;
       }
       if (this.b(p0, p1, p2, 2)) {
          b = b | 0x02;
       }
       if (this.b(p1, p0, p2, 8)) {
          b = b | 0x08;
       }
       if (b) {
          a tk = this.k;
          tk[p2] = tk[p2] | b;
          Objects.requireNonNull(this.a);
       }
       return;
    }
    public final void n(float p0,float p1,int p2){
       a tj;
       float[] this;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, a.class, "19")) {
          return;
       }
       int i = 0;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), this, uoa, "18")) {
          tj = this.f;
          if (tj == null || tj.length <= p2) {
             int i3 = p2 + 1;
             float[] uofloatArray = new float[i3];
             this = new float[i3];
             float[] uofloatArray1 = new float[i3];
             float[] uofloatArray2 = new float[i3];
             int[] ointArray = new int[i3];
             int[] ointArray1 = new int[i3];
             int[] ointArray2 = new int[i3];
             if (tj != null) {
                System.arraycopy(tj, i, uofloatArray, i, tj.length);
                tj = this.g;
                System.arraycopy(tj, i, this, i, tj.length);
                tj = this.h;
                System.arraycopy(tj, i, uofloatArray1, i, tj.length);
                tj = this.i;
                System.arraycopy(tj, i, uofloatArray2, i, tj.length);
                tj = this.j;
                System.arraycopy(tj, i, ointArray, i, tj.length);
                tj = this.k;
                System.arraycopy(tj, i, ointArray1, i, tj.length);
                tj = this.l;
                System.arraycopy(tj, i, ointArray2, i, tj.length);
             }
             this.f = uofloatArray;
             this.g = this;
             this.h = uofloatArray1;
             this.i = uofloatArray2;
             this.j = ointArray;
             this.k = ointArray1;
             this.l = ointArray2;
          }
       }
       this.h[p2] = p0;
       this.f[p2] = p0;
       this.i[p2] = p1;
       this.g[p2] = p1;
       tj = this.j;
       int i1 = (int)p0;
       int i2 = (int)p1;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(i1), Integer.valueOf(i2), this, uoa, "38");
          if (obj != PatchProxyResult.class) {
             i1 = obj.intValue();
          }else if(i1 < (this.b.getLeft() + this.q)){
             i = 1;
          }
          if (i2 < (this.b.getTop() + this.q)) {
             i = i | 0x04;
          }
          if (i1 > (this.b.getRight() - this.q)) {
             i = i | 0x02;
          }
          if (i2 > (this.b.getBottom() - this.q)) {
             i1 = i | 0x08;
          }else {
             i1 = i;
          }
       }else {
          goto label_00b7 ;
       }
       tj[p2] = i1;
       this.m = this.m | (1 << p2);
       return;
    }
    public final void o(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "20")) {
          return;
       }
       int i = q.d(p0);
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          int i2 = q.e(p0, i1);
          this.h[i2] = q.f(p0, i1);
          this.i[i2] = q.g(p0, i1);
       }
       return;
    }
    public void p(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "21")) {
          return;
       }
       this.b.removeCallbacks(this.u);
       if (this.c != p0) {
          this.c = p0;
          this.a.c(p0);
          if (this.c == null) {
             this.t = null;
          }
       }
       return;
    }
    public boolean q(int p0,int p1){
       Object obj1;
       int this;
       int i4;
       float f;
       float f1;
       float f2;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), obj, uoa, "7");
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       if (obj.v != null) {
          int i = (int)h0.a(obj.n, obj.e);
          int i1 = (int)h0.b(obj.n, obj.e);
          int b = true;
          if (PatchProxy.isSupport(uoa)) {
             obj1 = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(i), Integer.valueOf(i1), this, a.class, "8");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else {
             label_0064 :
                int left = obj.t.getLeft();
                int top = obj.t.getTop();
                this = p0 - left;
                int i2 = p1 - top;
                int i3 = 0;
                if (!this && !i2) {
                   obj.s.a();
                   obj.p(i3);
                   b = false;
                }else {
                   a t = obj.t;
                   if (PatchProxy.isSupport(uoa)) {
                      Object[] objArray = new Object[]{t,Integer.valueOf(this),Integer.valueOf(i2),Integer.valueOf(i),Integer.valueOf(i1)};
                      Object obj2 = PatchProxy.apply(objArray, obj, uoa, "9");
                      if (obj2 != patchProxyRe) {
                         i3 = obj2.intValue();
                      label_00ba :
                         i4 = i3;
                         obj.s.k(left, top, this, i2, i4);
                         obj.p(2);
                         b = true;
                      }
                   }
                   i4 = obj.e(i, (int)obj.p, (int)obj.o);
                   int i5 = obj.e(i1, (int)obj.p, (int)obj.o);
                   int i6 = Math.abs(this);
                   i = Math.abs(i2);
                   i1 = Math.abs(i4);
                   int i7 = Math.abs(i5);
                   int i8 = i1 + i7;
                   b = i6 + i;
                   if (i4) {
                      f = (float)i1;
                      f1 = (float)i8;
                   }else {
                      f = (float)i6;
                      f1 = (float)b;
                   }
                   f = f / f1;
                   if (i5) {
                      f2 = (float)i7;
                      f1 = (float)i8;
                   }else {
                      f2 = (float)i;
                      f1 = (float)b;
                   }
                   Objects.requireNonNull(obj.a);
                   i3 = (int)(((float)obj.g(this, i4, obj.a.b(t)) * f) + ((float)obj.g(i2, i5, i3) * (f2 / f1)));
                   goto label_00ba ;
                }
             }
          }else {
             goto label_0064 ;
          }
          return b;
       }else {
          throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
       }
    }
    public boolean r(MotionEvent p0){
       float f;
       View obj = PatchProxy.applyOneRefs(p0, this, a.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = q.c(p0);
       int i1 = q.b(p0);
       if (!i) {
          this.a();
       }
       if (this.n == null) {
          this.n = VelocityTracker.obtain();
       }
       this.n.addMovement(p0);
       int i2 = 2;
       boolean b = false;
       if (i) {
          if (i != 1) {
             if (i != i2) {
                if (i != 3) {
                   if (i != 0.00f) {
                      if (i == 6) {
                         this.f(q.e(p0, i1));
                      }
                   }else {
                      i = q.e(p0, i1);
                      f = q.f(p0, i1);
                      float f1 = q.g(p0, i1);
                      this.n(f, f1, i);
                      a tc = this.c;
                      if (tc == null) {
                         if (this.j[i] & this.r) {
                            Objects.requireNonNull(this.a);
                         }
                      }else if(tc == i2){
                         View view = this.i((int)f, (int)f1);
                         if (view == this.t) {
                            this.s(view, i);
                         }
                      }
                   }
                }
             }else if(this.f == null || this.g == null){
                i = q.d(p0);
                i1 = 0;
                while (i1 < i) {
                   i2 = q.e(p0, i1);
                   if (this.k(i2)) {
                      f = q.f(p0, i1);
                      float f2 = q.g(p0, i1);
                      float f3 = f - this.f[i2];
                      float f4 = f2 - this.g[i2];
                      View view1 = this.i((int)f, (int)f2);
                      f2 = (view1 != null && this.c(view1, f3, f4))? Float.MIN_VALUE: 0;
                      if (f2) {
                         int left = view1.getLeft();
                         int i3 = (int)f3;
                         int i4 = left + i3;
                         i3 = this.a.a(view1, i4, i3);
                         view1.getTop();
                         Objects.requireNonNull(this.a);
                         i4 = this.a.b(view1);
                         Objects.requireNonNull(this.a);
                         if (!i4 || (i4 > 0 && i3 == left)) {
                            break ;
                         }
                      }
                      this.m(f3, f4, i2);
                      if (this.c == 1 || (f2 && this.s(view1, i2))) {
                         break ;
                      }
                   }
                label_00fb :
                   i1 = i1 + 1;
                }
             label_00fe :
                this.o(p0);
             }
          }
          this.a();
       }else {
          float x = p0.getX();
          float y = p0.getY();
          int i5 = q.e(p0, b);
          this.n(x, y, i5);
          obj = this.i((int)x, (int)y);
          if (obj == this.t && this.c == i2) {
             this.s(obj, i5);
          }
          if (this.j[i5] & this.r) {
             Objects.requireNonNull(this.a);
          }
       }
    label_0134 :
       if (this.c == 1) {
          b = true;
       }
       return b;
    }
    public boolean s(View p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "22");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == this.t && this.e == p1) {
          return true;
       }else if(p0 != null && this.a.f(p0, p1)){
          this.e = p1;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3")) {
             if (p0.getParent() == this.b) {
                this.t = p0;
                this.e = p1;
                Objects.requireNonNull(this.a);
                this.p(true);
             }else {
                throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view \("+this.b+"\)");
             }
          }
          return true;
       }else {
          return false;
       }
    }
}
