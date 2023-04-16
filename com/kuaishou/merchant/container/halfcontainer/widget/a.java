package com.kuaishou.merchant.container.halfcontainer.widget.a;
import com.kuaishou.merchant.container.halfcontainer.widget.a$a;
import android.content.Context;
import android.view.ViewGroup;
import com.kuaishou.merchant.container.halfcontainer.widget.a$c;
import java.lang.Object;
import com.kuaishou.merchant.container.halfcontainer.widget.a$b;
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
import android.view.View;
import java.lang.Integer;
import android.view.ViewParent;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import java.lang.Number;
import a2.h0;
import java.lang.System;
import android.view.MotionEvent;
import a2.q;
import com.kwai.sdk.switchconfig.a;
import du3.a;
import java.lang.Runnable;

public class a	// class@00163e
{
    public int a;
    public final a$c b;
    public final ViewGroup c;
    public int d;
    public int e;
    public int f;
    public float[] g;
    public float[] h;
    public float[] i;
    public float[] j;
    public int[] k;
    public int[] l;
    public int[] m;
    public int n;
    public VelocityTracker o;
    public float p;
    public float q;
    public int r;
    public int s;
    public g t;
    public View u;
    public final Runnable v;
    public boolean w;
    public static final Interpolator x;

    static {
       a.x = new a$a();
    }
    public void a(Context p0,ViewGroup p1,a$c p2){
       super();
       this.a = 0;
       this.f = -1;
       this.v = new a$b(this);
       if (p2 == null) {
          throw new IllegalArgumentException("Callback may not be null");
       }
       this.c = p1;
       this.b = p2;
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
       this.r = (int)((c.c(p0.getResources()).density * 20.00f) + 0x3f000000);
       this.e = viewConfigur.getScaledTouchSlop();
       this.p = (float)viewConfigur.getScaledMaximumFlingVelocity();
       this.q = (float)viewConfigur.getScaledMinimumFlingVelocity();
       this.t = g.d(p0, a.x);
       return;
    }
    public void a(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "4")) {
          return;
       }
       this.f = -1;
       if (!PatchProxy.applyVoid(null, this, uoa, "17")) {
          uoa = this.g;
          if (uoa != null) {
             Arrays.fill(uoa, 0);
             Arrays.fill(this.h, 0);
             Arrays.fill(this.i, 0);
             Arrays.fill(this.j, 0);
             Arrays.fill(this.k, 0);
             Arrays.fill(this.l, 0);
             Arrays.fill(this.m, 0);
             this.n = 0;
          }
       }
       uoa = this.o;
       if (uoa != null) {
          uoa.recycle();
          this.o = null;
       }
       return;
    }
    public void b(View p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3")) {
          return;
       }
       if (p0.getParent() != this.c) {
          throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view \("+this.c+"\)");
       }
       this.u = p0;
       this.f = p1;
       Objects.requireNonNull(this.b);
       this.r(1);
       return;
    }
    public final boolean c(float p0,float p1,int p2,int p3){
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
       if ((this.k[p2] & p3) == p3 && ((this.s & p3) && ((this.m[p2] & p3) != p3 && (this.l[p2] & p3) != p3))) {
          obj = this.e;
          if (p0 - (float)obj > 0 || p1 - (float)obj > 0) {
             if (p0 - (p1 * 0x3f000000) < 0) {
                Objects.requireNonNull(this.b);
             }
             if (!(this.l[p2] & p3) && p0 - (float)this.e > 0) {
                b = true;
             }
          }
       }
    label_0078 :
       return b;
    }
    public final boolean d(View p0,float p1,float p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, a.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }else {
          Objects.requireNonNull(this.b);
          float f = (this.b.c(p0) > 0)? Float.MIN_VALUE: 0;
          if (f && Math.abs(p2) - (float)this.e > 0) {
             b = true;
          }
          return b;
       }
    }
    public final float e(float p0,float p1,float p2){
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
    public final int f(int p0,int p1,int p2){
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
    public final void g(int p0){
       a tg = this.g;
       if (tg == null) {
          return;
       }
       tg[p0] = 0;
       this.h[p0] = 0;
       this.i[p0] = 0;
       this.j[p0] = 0;
       this.k[p0] = 0;
       this.l[p0] = 0;
       this.m[p0] = 0;
       this.n = (~ (1 << p0)) & this.n;
       return;
    }
    public final int h(int p0,int p1,int p2){
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
          int width = this.c.getWidth();
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
    public final void i(float p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uoa, "16")) {
          return;
       }
       this.w = true;
       this.b.f(this.u, p0, p1);
       this.w = false;
       if (this.d == true) {
          this.r(false);
       }
       return;
    }
    public View j(int p0,int p1){
       View childAt;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "37");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = this.c.getChildCount() - 1;
       while (true) {
          if (i < 0) {
             return null;
          }
          Objects.requireNonNull(this.b);
          childAt = this.c.getChildAt(i);
          if (p0 >= childAt.getLeft() && (p0 < childAt.getRight() && (p1 >= childAt.getTop() && p1 < childAt.getBottom()))) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return childAt;
    }
    public final boolean k(int p0,int p1,int p2,int p3){
       int this;
       a a;
       int i3;
       float f;
       float f1;
       float f2;
       float f3;
       a uoa = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa1 = a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "8");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       int left = uoa.u.getLeft();
       int top = uoa.u.getTop();
       this = p0 - left;
       int i = p1 - top;
       int i1 = 0;
       if (!this && !i) {
          uoa.t.a();
          uoa.r(i1);
          return i1;
       }else {
          a = uoa.a;
          int i2 = 1;
          if (a == null) {
             a = uoa.u;
             if (PatchProxy.isSupport(uoa1)) {
                Object[] objArray = new Object[]{a,Integer.valueOf(this),Integer.valueOf(i),Integer.valueOf(p2),Integer.valueOf(p3)};
                Object obj1 = PatchProxy.apply(objArray, uoa, uoa1, "9");
                if (obj1 != patchProxyRe) {
                   i1 = obj1.intValue();
                label_00e5 :
                   i3 = i1;
                }
             }
             i3 = uoa.f(p2, (int)uoa.q, (int)uoa.p);
             int i4 = uoa.f(p3, (int)uoa.q, (int)uoa.p);
             int i5 = Math.abs(this);
             int i6 = Math.abs(i);
             int i7 = Math.abs(i3);
             int i8 = Math.abs(i4);
             int i9 = i7 + i8;
             i2 = i5 + i6;
             if (i3) {
                f = (float)i7;
                f1 = (float)i9;
             }else {
                f = (float)i5;
                f1 = (float)i2;
             }
             f = f / f1;
             if (i4) {
                f2 = (float)i8;
                f3 = (float)i9;
             }else {
                f3 = (float)i2;
                f2 = (float)i6;
             }
             Objects.requireNonNull(uoa.b);
             i1 = (int)(((float)uoa.h(this, i3, i1) * f) + ((float)uoa.h(i, i4, uoa.b.c(a)) * (f2 / f3)));
             goto label_00e5 ;
          }else {
             i3 = a;
          }
          uoa.t.k(left, top, this, i, i3);
          uoa.r(2);
          return true;
       }
    }
    public int l(){
       return this.e;
    }
    public final boolean m(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "39");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0 = ((1 << p0) & this.n)? 1: 0;
       if (!p0) {
          return false;
       }else {
          return 1;
       }
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, a.class, "33")) {
          return;
       }
       this.o.computeCurrentVelocity(1000, this.p);
       this.i(this.e(h0.a(this.o, this.f), this.q, this.p), this.e(h0.b(this.o, this.f), this.q, this.p));
       return;
    }
    public final void o(float p0,float p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, a.class, "26")) {
          return;
       }
       boolean b = this.c(p0, p1, p2, 1);
       if (this.c(p1, p0, p2, 4)) {
          b = b | 0x04;
       }
       if (this.c(p0, p1, p2, 2)) {
          b = b | 0x02;
       }
       if (this.c(p1, p0, p2, 8)) {
          b = b | 0x08;
       }
       if (b) {
          a tl = this.l;
          tl[p2] = tl[p2] | b;
          Objects.requireNonNull(this.b);
       }
       return;
    }
    public final void p(float p0,float p1,int p2){
       a tk;
       float[] this;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, a.class, "19")) {
          return;
       }
       int i = 0;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), this, uoa, "18")) {
          tk = this.g;
          if (tk == null || tk.length <= p2) {
             int i3 = p2 + 1;
             float[] uofloatArray = new float[i3];
             this = new float[i3];
             float[] uofloatArray1 = new float[i3];
             float[] uofloatArray2 = new float[i3];
             int[] ointArray = new int[i3];
             int[] ointArray1 = new int[i3];
             int[] ointArray2 = new int[i3];
             if (tk != null) {
                System.arraycopy(tk, i, uofloatArray, i, tk.length);
                tk = this.h;
                System.arraycopy(tk, i, this, i, tk.length);
                tk = this.i;
                System.arraycopy(tk, i, uofloatArray1, i, tk.length);
                tk = this.j;
                System.arraycopy(tk, i, uofloatArray2, i, tk.length);
                tk = this.k;
                System.arraycopy(tk, i, ointArray, i, tk.length);
                tk = this.l;
                System.arraycopy(tk, i, ointArray1, i, tk.length);
                tk = this.m;
                System.arraycopy(tk, i, ointArray2, i, tk.length);
             }
             this.g = uofloatArray;
             this.h = this;
             this.i = uofloatArray1;
             this.j = uofloatArray2;
             this.k = ointArray;
             this.l = ointArray1;
             this.m = ointArray2;
          }
       }
       this.i[p2] = p0;
       this.g[p2] = p0;
       this.j[p2] = p1;
       this.h[p2] = p1;
       tk = this.k;
       int i1 = (int)p0;
       int i2 = (int)p1;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(i1), Integer.valueOf(i2), this, uoa, "38");
          if (obj != PatchProxyResult.class) {
             i1 = obj.intValue();
          }else if(i1 < (this.c.getLeft() + this.r)){
             i = 1;
          }
          if (i2 < (this.c.getTop() + this.r)) {
             i = i | 0x04;
          }
          if (i1 > (this.c.getRight() - this.r)) {
             i = i | 0x02;
          }
          if (i2 > (this.c.getBottom() - this.r)) {
             i1 = i | 0x08;
          }else {
             i1 = i;
          }
       }else {
          goto label_00b7 ;
       }
       tk[p2] = i1;
       this.n = this.n | (1 << p2);
       return;
    }
    public final void q(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "20")) {
          return;
       }
       int i = q.d(p0);
       int i1 = 0;
       while (i1 < i) {
          int i2 = q.e(p0, i1);
          if (!a.t().d(a.a, false) || this.m(i2)) {
             this.i[i2] = q.f(p0, i1);
             this.j[i2] = q.g(p0, i1);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void r(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "21")) {
          return;
       }
       this.c.removeCallbacks(this.v);
       if (this.d != p0) {
          this.d = p0;
          this.b.d(p0);
          if (this.d == null) {
             this.u = null;
          }
       }
       return;
    }
    public boolean s(View p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.u = p0;
       this.f = -1;
       boolean b = this.k(p1, p2, 0, 0);
       if (!b && (this.d == null && this.u != null)) {
          this.u = null;
       }
    label_003c :
       return b;
    }
    public boolean t(View p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "22");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == this.u && this.f == p1) {
          return true;
       }else if(p0 != null && this.b.g(p0, p1)){
          this.f = p1;
          this.b(p0, p1);
          return true;
       }else {
          return false;
       }
    }
}
