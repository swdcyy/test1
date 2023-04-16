package com.kuaishou.live.lite.recommendsidebar.b;
import joc.z;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.kuaishou.live.lite.recommendsidebar.a;
import java.util.concurrent.CopyOnWriteArrayList;
import xc3.n;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.view.ViewConfiguration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.view.View;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Math;
import z1.k;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.os.SystemClock;
import java.lang.Float;
import java.lang.Number;
import ns5.a;
import jta.c;
import java.util.List;
import java.util.Iterator;
import android.animation.ValueAnimator;
import android.animation.TimeInterpolator;
import xc3.m;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.lite.recommendsidebar.b$a;
import android.animation.Animator$AnimatorListener;

public class b extends z	// class@000aeb
{
    public final int e;
    public final int f;
    public final int g;
    public long h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public VelocityTracker q;
    public Rect r;
    public k s;
    public a t;
    public final List u;
    public final a v;
    public static final Interpolator w;
    public static final Interpolator x;

    static {
       b.w = new AccelerateDecelerateInterpolator();
       b.x = a.a;
    }
    public void b(){
       super();
       this.k = 0x3f800000;
       this.l = false;
       this.u = new CopyOnWriteArrayList();
       this.v = new n(this);
       ViewConfiguration viewConfigur = ViewConfiguration.get(a.b());
       this.e = (int)(c.c(a.b().getResources()).density * 400.00f);
       this.f = viewConfigur.getScaledMaximumFlingVelocity();
       this.g = viewConfigur.getScaledPagingTouchSlop();
    }
    public boolean d(View p0,MotionEvent p1){
       boolean b;
       b tq;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, uob, "8");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       p0 = PatchProxy.applyOneRefs(p1, this, uob, "10");
       b = false;
       if (p0 != patchProxyRe) {
          b = p0.booleanValue();
       }else if(this.t == null){
          boolean action = p1.getAction();
          if (action) {
             b uob1 = 0x3f800000;
             if (action != 1) {
                if (action != 2) {
                   if (action == 3) {
                   label_007f :
                      this.m = b;
                      if (this.k - uob1 < 0 && (Math.abs((p1.getX() - this.i)) - 0x41200000 < 0 && Math.abs((p1.getY() - this.j)) - 0x41200000 < 0)) {
                         action = PatchProxy.apply(null, this, uob, "17");
                         if (action != patchProxyRe) {
                            action = action.booleanValue();
                         }else if(this.r == null || this.r()){
                            tq = this.s;
                            if (tq == null || (tq.get() == null || !this.s.get().contains((int)this.i, (int)this.j))) {
                               action = this.r.contains((int)this.i, (int)this.j);
                            }
                         }
                         action = false;
                         if (action) {
                            this.n = true;
                            this.k();
                         }
                      }
                   label_00f6 :
                      tq = this.q;
                      if (tq != null) {
                         tq.recycle();
                         this.q = null;
                      }
                   }
                }else {
                   float f = p1.getX() - this.i;
                   float f1 = Math.abs(f);
                   float f2 = Math.abs((p1.getY() - this.j));
                   if (f1 - (float)this.g > 0 && f1 - f2 > 0) {
                      if (this.k - uob1 < 0) {
                         action = (f > 0)? true: false;
                         this.m = action;
                      }else if(f < 0 && this.l != null){
                         action = true;
                      }else {
                         action = false;
                      }
                      this.m = action;
                   }
                }
             }else {
                goto label_007f ;
             }
          }else {
             this.n = b;
             this.m = b;
             this.i = p1.getX();
             this.j = p1.getY();
             this.o = b;
             this.h = 0;
             this.p = b;
          }
       label_0118 :
          if (this.q == null) {
             this.q = VelocityTracker.obtain();
          }
          this.q.addMovement(p1);
          if (this.n != null || this.m != null) {
             b = true;
          }
       }
       return b;
    }
    public boolean f(View p0,MotionEvent p1){
       boolean b;
       b tq;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, uob, "9");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       p0 = PatchProxy.applyOneRefs(p1, this, uob, "11");
       b = false;
       if (p0 != patchProxyRe) {
          b = p0.booleanValue();
       }else if(this.t == null){
          if (this.q == null) {
             this.q = VelocityTracker.obtain();
          }
          this.q.addMovement(p1);
          int action = p1.getAction();
          float f = 0x3f000000;
          float f1 = 0;
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                label_010c :
                   if (this.m != null && !PatchProxy.applyVoid(null, this, uob, "12")) {
                      action = this.q();
                      if (Math.abs(action) >= this.e) {
                         if (action < 0) {
                            this.t(this.k, f1, true);
                         }else {
                            this.t(this.k, 0x3f800000, true);
                         }
                      }else {
                         tq = this.k;
                         if (tq - f > 0) {
                            this.t(tq, 0x3f800000, true);
                         }else {
                            this.t(tq, f1, true);
                         }
                      }
                   }
                   this.o = b;
                   this.p = b;
                   tq = this.q;
                   if (tq != null) {
                      tq.recycle();
                      this.q = null;
                   }
                }
             }else if(this.o != null){
                float f2 = p1.getX() - this.i;
                float f3 = Math.abs(f2);
                float f4 = Math.abs((p1.getY() - this.j));
                if (this.m == null && (f3 - (float)this.g > 0 && (f3 * f) - f4 > 0)) {
                   if (!this.k - f1) {
                      b1 = (f2 - f1 > 0)? true: false;
                      this.m = b1;
                   }else if(f2 - f1 < 0 && this.l != null){
                      b1 = true;
                   }else {
                      b1 = false;
                   }
                   this.m = b1;
                }
                if (this.m != null) {
                   Object obj = PatchProxy.applyOneRefs(p1, this, uob, "15");
                   if (obj != patchProxyRe) {
                      b = obj.booleanValue();
                   }else if(!this.h - null){
                      this.h = SystemClock.elapsedRealtime();
                   }
                   if ((SystemClock.elapsedRealtime() - this.h) - 80 < 0 && Math.abs(this.q()) >= this.e) {
                      this.i = p1.getX();
                      b = true;
                   }
                   if (!b) {
                      if (this.p == null) {
                         this.p = true;
                         this.p(this.k);
                      }
                      if (PatchProxy.isSupport(uob)) {
                         p1 = PatchProxy.applyOneRefs(Float.valueOf(f2), this, uob, "14");
                         if (p1 != patchProxyRe) {
                            f1 = p1.floatValue();
                         }else {
                         label_00fe :
                            b tt = this.t;
                            if (tt != null) {
                               f1 = tt.d(f2);
                            }
                         }
                      }else {
                         goto label_00fe ;
                      }
                      this.k = f1;
                      this.o(f1);
                   }
                }
             }
          }else {
             goto label_010c ;
          }
          b = this.m;
       }
       return b;
    }
    public void j(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       this.u.add(p0);
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       b tk = this.k;
       if (tk - 0x3f800000) {
          this.p = false;
          this.t(tk, 0x3f800000, false);
       }
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       b tk = this.k;
       if (tk - 0x3f800000) {
          if (this.t != null) {
             this.p(tk);
             this.m(0x3f800000);
             this.o(0x3f800000);
             this.n(0x3f800000);
          }
          this.k = 0x3f800000;
       }
       return;
    }
    public final void m(float p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "19")) {
          return;
       }
       uob = this.t;
       if (uob == null) {
          return;
       }
       uob.e(p0);
       Iterator iterator = this.u.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public void n(float p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "21")) {
          return;
       }
       uob = this.t;
       if (uob == null) {
          return;
       }
       uob.a(p0);
       Iterator iterator = this.u.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public final void o(float p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "20")) {
          return;
       }
       uob = this.t;
       if (uob == null) {
          return;
       }
       uob.c(p0);
       Iterator iterator = this.u.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       return;
    }
    public final void p(float p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "18")) {
          return;
       }
       uob = this.t;
       if (uob == null) {
          return;
       }
       uob.b(p0);
       Iterator iterator = this.u.iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0);
       }
       return;
    }
    public final int q(){
       b obj = PatchProxy.apply(null, this, b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.q;
       obj.computeCurrentVelocity(1000, (float)this.f);
       return (int)obj.getXVelocity();
    }
    public boolean r(){
       boolean b = (!this.k - 0x3f800000)? true: false;
       return b;
    }
    public boolean s(){
       boolean b = (!this.k)? true: false;
       return b;
    }
    public final void t(float p0,float p1,boolean p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, b.class, "13")) {
          return;
       }
       if (this.p == null) {
          this.p = true;
          if (this.t != null) {
             this.p(p0);
          }
       }
       if (this.t != null) {
          this.m(p1);
       }
       float[] uofloatArray = new float[]{p0,p1};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       valueAnimato.setDuration(250);
       Interpolator x = (p2)? b.x: b.w;
       valueAnimato.setInterpolator(x);
       valueAnimato.addUpdateListener(new m(this));
       valueAnimato.addListener(new b$a(this, p1));
       valueAnimato.start();
       return;
    }
    public void u(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       this.u.remove(p0);
       return;
    }
    public void v(k p0){
       this.s = p0;
    }
    public void w(a p0){
       this.t = p0;
    }
}
