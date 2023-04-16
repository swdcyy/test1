package com.yxcorp.gifshow.camera.record.widget.i;
import com.yxcorp.gifshow.camera.record.widget.i$a;
import android.content.Context;
import android.view.ViewGroup;
import com.yxcorp.gifshow.camera.record.widget.i$c;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.widget.i$b;
import android.view.ViewConfiguration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.widget.OverScroller;
import android.view.animation.Interpolator;
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
import j8c.a;
import q87.c;
import java.lang.System;
import android.view.MotionEvent;
import java.lang.Runnable;

public class i	// class@000fee
{
    public int a;
    public int b;
    public int c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public float m;
    public float n;
    public int o;
    public int p;
    public OverScroller q;
    public final i$c r;
    public View s;
    public boolean t;
    public final ViewGroup u;
    public Context v;
    public final Runnable w;
    public static final Interpolator x;

    static {
       i.x = new i$a();
    }
    public void i(Context p0,ViewGroup p1,i$c p2){
       super();
       this.c = -1;
       this.w = new i$b(this);
       if (p2 == null) {
          throw new IllegalArgumentException("Callback may not be null");
       }
       this.u = p1;
       this.r = p2;
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
       this.o = (int)((c.c(p0.getResources()).density * 20.00f) + 0x3f000000);
       this.b = viewConfigur.getScaledTouchSlop();
       this.m = (float)viewConfigur.getScaledMaximumFlingVelocity();
       this.n = (float)viewConfigur.getScaledMinimumFlingVelocity();
       this.q = new OverScroller(p0, i.x);
       this.v = p0;
       return;
    }
    public void a(){
       i oi = i.class;
       if (PatchProxy.applyVoid(null, this, oi, "4")) {
          return;
       }
       this.c = -1;
       if (!PatchProxy.applyVoid(null, this, oi, "18")) {
          oi = this.d;
          if (oi != null) {
             Arrays.fill(oi, 0);
             Arrays.fill(this.e, 0);
             Arrays.fill(this.f, 0);
             Arrays.fill(this.g, 0);
             Arrays.fill(this.h, 0);
             Arrays.fill(this.i, 0);
             Arrays.fill(this.j, 0);
             this.k = 0;
          }
       }
       oi = this.l;
       if (oi != null) {
          oi.recycle();
          this.l = null;
       }
       return;
    }
    public void b(View p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oi, "3")) {
          return;
       }
       if (p0.getParent() != this.u) {
          throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view \("+this.u+"\)");
       }
       this.s = p0;
       this.c = p1;
       Objects.requireNonNull(this.r);
       this.s(1);
       return;
    }
    public final boolean c(float p0,float p1,int p2,int p3){
       i obj;
       if (PatchProxy.isSupport(i.class)) {
          obj = PatchProxy.applyFourRefs(Float.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, i.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0 = Math.abs(p0);
       p1 = Math.abs(p1);
       boolean b = false;
       if ((this.h[p2] & p3) == p3 && ((this.p & p3) && ((this.j[p2] & p3) != p3 && (this.i[p2] & p3) != p3))) {
          obj = this.b;
          if (p0 - (float)obj > 0 || p1 - (float)obj > 0) {
             if (p0 - (p1 * 0x3f000000) < 0) {
                Objects.requireNonNull(this.r);
             }
             if (!(this.i[p2] & p3) && p0 - (float)this.b > 0) {
                b = true;
             }
          }
       }
    label_0078 :
       return b;
    }
    public final boolean d(View p0,float p1,float p2){
       if (PatchProxy.isSupport(i.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, i.class, "30");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }else {
          Objects.requireNonNull(this.r);
          float f = (this.r.c(p0) > 0)? Float.MIN_VALUE: 0;
          if (f && Math.abs(p2) - (float)this.b > 0) {
             b = true;
          }
          return b;
       }
    }
    public final float e(float p0,float p1,float p2){
       if (PatchProxy.isSupport(i.class)) {
          Object obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, i.class, "13");
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
       int i;
       if (PatchProxy.isSupport(i.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, i.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       i = Math.abs(p0);
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
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "19")) {
          return;
       }
       if (this.d != null && this.m(p0)) {
          this.d[p0] = 0;
          this.e[p0] = 0;
          this.f[p0] = 0;
          this.g[p0] = 0;
          this.h[p0] = 0;
          this.i[p0] = 0;
          this.j[p0] = 0;
          this.k = (~ (1 << p0)) & this.k;
       }
       return;
    }
    public final int h(int p0,int p1,int p2){
       int i;
       float f2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, i.class, "11");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       if (!p0) {
          return 0;
       }else {
          int width = this.u.getWidth();
          i = width / 2;
          float f = Math.min(0x3f800000, ((float)Math.abs(p0) / (float)width));
          float f1 = (float)i;
          if (PatchProxy.isSupport(oi)) {
             Object obj1 = PatchProxy.applyOneRefs(Float.valueOf(f), this, oi, "14");
             if (obj1 != patchProxyRe) {
                f2 = obj1.floatValue();
             label_0069 :
                f1 = f1 + (f2 * f1);
                p1 = Math.abs(p1);
                p0 = (p1 > 0)? Math.round((Math.abs((f1 / (float)p1)) * 1000.00f)) * 4: (int)((((float)Math.abs(p0) / (float)p2) + 0x3f800000) * 256.00f);
                return Math.min(p0, 300);
             }
          }
          f2 = (float)Math.sin((double)((f - 0x3f000000) * 0x3ef1463b));
          goto label_0069 ;
       }
    }
    public final void i(float p0,float p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, oi, "17")) {
          return;
       }
       this.t = true;
       this.r.f(this.s, p0, p1);
       this.t = false;
       if (this.a == true) {
          this.s(false);
       }
       return;
    }
    public View j(int p0,int p1){
       int i;
       View childAt;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oi, "40");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       i = this.u.getChildCount() - 1;
       while (true) {
          if (i < 0) {
             return null;
          }
          Objects.requireNonNull(this.r);
          childAt = this.u.getChildAt(i);
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
       int i;
       int i3;
       float f;
       float f1;
       float f2;
       float f3;
       i oi = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi1 = i.class;
       if (PatchProxy.isSupport(oi1)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, i.class, "9");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       int left = oi.s.getLeft();
       int top = oi.s.getTop();
       this = p0 - left;
       i = p1 - top;
       int i1 = 0;
       if (!this && !i) {
          oi.q.abortAnimation();
          oi.s(i1);
          return i1;
       }else {
          i s = oi.s;
          int i2 = 1;
          if (PatchProxy.isSupport(oi1)) {
             Object[] objArray = new Object[]{s,Integer.valueOf(this),Integer.valueOf(i),Integer.valueOf(p2),Integer.valueOf(p3)};
             Object obj1 = PatchProxy.apply(objArray, oi, oi1, "10");
             if (obj1 != patchProxyRe) {
                i1 = obj1.intValue();
             label_0084 :
                i3 = i1;
                oi.q.startScroll(left, top, this, i, i3);
                oi.s(2);
                return true;
             }
          }
          i3 = oi.f(p2, (int)oi.n, (int)oi.m);
          int i4 = oi.f(p3, (int)oi.n, (int)oi.m);
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
          Objects.requireNonNull(oi.r);
          i1 = (int)(((float)oi.h(this, i3, i1) * f) + ((float)oi.h(i, i4, oi.r.c(s)) * (f2 / f3)));
          goto label_0084 ;
       }
    }
    public int l(){
       return this.b;
    }
    public boolean m(int p0){
       int i = 1;
       if ((i << p0) & this.k) {
       }else {
          i = false;
       }
       return i;
    }
    public final boolean n(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oi, "42");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!this.m(p0)) {
          Object[] objArray = new Object[0];
          a.D().A("ViewDragHelper", "Ignoring pointerId="+p0+" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.", objArray);
          return 0;
       }else {
          return true;
       }
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, i.class, "35")) {
          return;
       }
       this.l.computeCurrentVelocity(1000, this.m);
       this.i(this.e(this.l.getXVelocity(this.c), this.n, this.m), this.e(this.l.getYVelocity(this.c), this.n, this.m));
       return;
    }
    public final void p(float p0,float p1,int p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, i.class, "28")) {
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
          i ti = this.i;
          ti[p2] = ti[p2] | b;
          Objects.requireNonNull(this.r);
       }
       return;
    }
    public final void q(float p0,float p1,int p2){
       int i;
       i th;
       float[] this;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, i.class, "21")) {
          return;
       }
       i = 0;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), this, oi, "20")) {
          th = this.d;
          if (th == null || th.length <= p2) {
             int i3 = p2 + 1;
             float[] uofloatArray = new float[i3];
             this = new float[i3];
             float[] uofloatArray1 = new float[i3];
             float[] uofloatArray2 = new float[i3];
             int[] ointArray = new int[i3];
             int[] ointArray1 = new int[i3];
             int[] ointArray2 = new int[i3];
             if (th != null) {
                System.arraycopy(th, i, uofloatArray, i, th.length);
                th = this.e;
                System.arraycopy(th, i, this, i, th.length);
                th = this.f;
                System.arraycopy(th, i, uofloatArray1, i, th.length);
                th = this.g;
                System.arraycopy(th, i, uofloatArray2, i, th.length);
                th = this.h;
                System.arraycopy(th, i, ointArray, i, th.length);
                th = this.i;
                System.arraycopy(th, i, ointArray1, i, th.length);
                th = this.j;
                System.arraycopy(th, i, ointArray2, i, th.length);
             }
             this.d = uofloatArray;
             this.e = this;
             this.f = uofloatArray1;
             this.g = uofloatArray2;
             this.h = ointArray;
             this.i = ointArray1;
             this.j = ointArray2;
          }
       }
       this.f[p2] = p0;
       this.d[p2] = p0;
       this.g[p2] = p1;
       this.e[p2] = p1;
       th = this.h;
       int i1 = (int)p0;
       int i2 = (int)p1;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(i1), Integer.valueOf(i2), this, oi, "41");
          if (obj != PatchProxyResult.class) {
             i1 = obj.intValue();
          }else if(i1 < (this.u.getLeft() + this.o)){
             i = 1;
          }
          if (i2 < (this.u.getTop() + this.o)) {
             i = i | 0x04;
          }
          if (i1 > (this.u.getRight() - this.o)) {
             i = i | 0x02;
          }
          if (i2 > (this.u.getBottom() - this.o)) {
             i1 = i | 0x08;
          }else {
             i1 = i;
          }
       }else {
          goto label_00b7 ;
       }
       th[p2] = i1;
       this.k = this.k | (1 << p2);
       return;
    }
    public final void r(MotionEvent p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "22")) {
          return;
       }
       int pointerCount = p0.getPointerCount();
       i = 0;
       while (i < pointerCount) {
          int pointerId = p0.getPointerId(i);
          if (this.n(pointerId)) {
             this.f[pointerId] = p0.getX(i);
             this.g[pointerId] = p0.getY(i);
          }
          i = i + 1;
       }
       return;
    }
    public void s(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "23")) {
          return;
       }
       this.u.removeCallbacks(this.w);
       if (this.a != p0) {
          this.a = p0;
          this.r.d(p0);
          if (this.a == null) {
             this.s = null;
          }
       }
       return;
    }
    public boolean t(View p0,int p1,int p2){
       if (PatchProxy.isSupport(i.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, i.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.s = p0;
       this.c = -1;
       boolean b = this.k(p1, p2, 0, 0);
       if (!b && (this.a == null && this.s != null)) {
          this.s = null;
       }
    label_003c :
       return b;
    }
    public boolean u(View p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oi, "24");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == this.s && this.c == p1) {
          return true;
       }else if(p0 != null && this.r.g(p0, p1)){
          this.c = p1;
          this.b(p0, p1);
          return true;
       }else {
          return false;
       }
    }
}
