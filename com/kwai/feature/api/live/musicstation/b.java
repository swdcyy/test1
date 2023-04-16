package com.kwai.feature.api.live.musicstation.b;
import joc.z;
import o56.a;
import android.content.res.Resources;
import android.app.Application;
import cw9.c;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.kwai.feature.api.live.musicstation.a;
import lnc.a1;
import ns5.d;
import o56.c;
import android.content.Context;
import android.view.ViewConfiguration;
import android.util.DisplayMetrics;
import java.util.ArrayList;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.VelocityTracker;
import java.lang.Math;
import java.lang.Float;
import java.lang.Number;
import ns5.a;
import android.animation.ValueAnimator;
import android.animation.TimeInterpolator;
import ns5.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.feature.api.live.musicstation.b$a;
import android.animation.Animator$AnimatorListener;

public class b extends z	// class@000feb
{
    public int e;
    public int f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public VelocityTracker k;
    public long l;
    public int m;
    public int n;
    public float o;
    public boolean p;
    public boolean q;
    public boolean r;
    public a s;
    public List t;
    public final a u;
    public static final int v;
    public static final Interpolator w;
    public static final Interpolator x;

    static {
       b.v = c.b(a.B.getResources(), 0x7f070c56);
       b.w = new AccelerateDecelerateInterpolator();
       b.x = a.a;
    }
    public void b(){
       super();
       this.e = a1.h();
       this.f = b.v;
       this.j = 0x3f800000;
       this.r = true;
       this.u = new d(this);
       this.m = (int)(c.c(a.a().a().getResources()).density * 400.00f);
       this.n = ViewConfiguration.get(a.a().a()).getScaledMaximumFlingVelocity();
       this.o = (float)ViewConfiguration.get(a.a().a()).getScaledTouchSlop();
       this.t = new ArrayList();
    }
    public boolean d(View p0,MotionEvent p1){
       boolean b;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "8");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       b = (this.r != null && this.k(p1))? true: false;
       return b;
    }
    public boolean f(View p0,MotionEvent p1){
       boolean b;
       int b1;
       b tk;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, uob, "9");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       b = false;
       if (this.r != null) {
          p0 = PatchProxy.applyOneRefs(p1, this, uob, "11");
          if (p0 != patchProxyRe) {
             b1 = p0.booleanValue();
          }else if(this.k == null){
             this.k = VelocityTracker.obtain();
          }
          this.k.addMovement(p1);
          b1 = p1.getAction();
          float f = 0x3f000000;
          float f1 = 0;
          if (b1 != 1) {
             if (b1 != 2) {
                if (b1 == 3) {
                label_00cc :
                   if (this.g != null && !PatchProxy.applyVoid(null, this, uob, "12")) {
                      b1 = PatchProxy.apply(null, this, uob, "18");
                      if (b1 != patchProxyRe) {
                         b1 = b1.intValue();
                      }else {
                         tk = this.k;
                         tk.computeCurrentVelocity(1000, (float)this.n);
                         b1 = (int)tk.getXVelocity();
                      }
                      if (Math.abs(b1) >= this.m) {
                         if (b1 < 0) {
                            this.l(this.j, f1, true);
                         }else {
                            this.l(this.j, 0x3f800000, true);
                         }
                      }else {
                         tk = this.j;
                         if (tk - f > 0) {
                            this.l(tk, 0x3f800000, true);
                         }else {
                            this.l(tk, f1, true);
                         }
                      }
                   }
                   this.p = b;
                   this.q = b;
                   tk = this.k;
                   if (tk != null) {
                      tk.recycle();
                      this.k = null;
                   }
                }
             }else if(this.p != null){
                float f2 = p1.getX() - this.h;
                float f3 = Math.abs(f2);
                float f4 = Math.abs((p1.getY() - this.i));
                if (this.g == null && (this.s != null && (f3 - this.o > 0 && (f3 * f) - f4 > 0))) {
                   if (!this.j - f1) {
                      b2 = (f2 - f1 > 0)? true: false;
                      this.g = b2;
                   }else if(f2 - f1 < 0){
                      b2 = true;
                   }else {
                      b2 = false;
                   }
                   this.g = b2;
                }
                if (this.g != null) {
                   if (PatchProxy.isSupport(uob)) {
                      b2 = PatchProxy.applyOneRefs(Float.valueOf(f2), this, uob, "16");
                      if (b2 != patchProxyRe) {
                         f1 = b2.floatValue();
                      }else {
                      label_00af :
                         b ts = this.s;
                         if (ts != null) {
                            f1 = ts.d(f2);
                         }
                      }
                   }else {
                      goto label_00af ;
                   }
                   tk = this.s;
                   if (tk != null) {
                      this.j = f1;
                      if (this.q == null) {
                         this.q = true;
                         tk.b(f1);
                      }
                      this.s.c(f1);
                   }
                }
             }
          }else {
             goto label_00cc ;
          }
          b1 = this.g;
          if (b1 != null) {
             b = true;
          }
       }
       return b;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       b tj = this.j;
       if (tj - 0x3f800000) {
          this.l(tj, 0x3f800000, false);
       }
       return;
    }
    public boolean k(MotionEvent p0){
       boolean b;
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       b = false;
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                label_005b :
                   this.g = b;
                   obj = this.k;
                   if (obj != null) {
                      obj.recycle();
                      this.k = null;
                   }
                }
             }else {
                float f = p0.getX() - this.h;
                float f1 = Math.abs(f);
                float f2 = Math.abs((p0.getY() - this.i));
                if (this.s != null && f1 - f2 > 0) {
                   if (this.j - 0x3f800000 < 0) {
                      if (f > 0) {
                         b = true;
                      }
                      this.g = b;
                   }else if(f < 0){
                      b = true;
                   }
                   this.g = b;
                }
             }
          }else {
             goto label_005b ;
          }
       }else {
          this.g = b;
          this.h = p0.getX();
          this.i = p0.getY();
          this.p = b;
          this.l = 0;
          this.q = b;
       }
    label_007e :
       if (this.k == null) {
          this.k = VelocityTracker.obtain();
       }
       this.k.addMovement(p0);
       return this.g;
    }
    public final void l(float p0,float p1,boolean p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, b.class, "13")) {
          return;
       }
       b ts = this.s;
       if (ts != null) {
          ts.e(p1);
       }
       float[] uofloatArray = new float[]{p0,p1};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       valueAnimato.setDuration(350);
       Interpolator x = (p2)? b.x: b.w;
       valueAnimato.setInterpolator(x);
       valueAnimato.addUpdateListener(new c(this));
       valueAnimato.addListener(new b$a(this, p1));
       valueAnimato.start();
       return;
    }
}
