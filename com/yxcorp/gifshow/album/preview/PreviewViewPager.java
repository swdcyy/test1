package com.yxcorp.gifshow.album.preview.PreviewViewPager;
import com.yxcorp.gifshow.album.preview.AlbumViewPager;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$c;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.utility.n;
import j79.n0;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager;
import u79.o;
import java.lang.Float;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$a;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$b;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$e;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import usd.q;
import android.graphics.Color;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Math;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.animation.ValueAnimator;
import j79.o0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import j79.p0;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$d;

public final class PreviewViewPager extends AlbumViewPager	// class@001a46
{
    public int c;
    public int d;
    public float e;
    public float f;
    public int g;
    public float h;
    public float i;
    public float j;
    public boolean k;
    public boolean l;
    public PreviewViewPager$a m;
    public PreviewViewPager$b n;
    public boolean o;
    public PreviewViewPager$e p;
    public o q;
    public View r;
    public Float s;
    public VelocityTracker t;
    public PreviewViewPager$d u;
    public boolean v;
    public boolean w;
    public HashMap x;
    public static final String A = "DragViewPager";
    public static final float B = 0.000000;
    public static final float C = 0.000000;
    public static final float D = 0.300000;
    public static final long E = 0xfa;
    public static final int F = 5;
    public static final PreviewViewPager$c G;
    public static final int y;
    public static final int z;

    static {
       PreviewViewPager.G = new PreviewViewPager$c(null);
       PreviewViewPager.y = 1;
       PreviewViewPager.z = 2;
       PreviewViewPager.A = "DragViewPager";
       PreviewViewPager.B = 0x3f000000;
       PreviewViewPager.C = 0x3f800000;
       PreviewViewPager.D = 0.30f;
       PreviewViewPager.E = 250;
       PreviewViewPager.F = 5;
    }
    public void PreviewViewPager(Context p0,AttributeSet p1){
       a.q(p0, "context");
       super(p0, p1);
       this.c = 0;
       this.h = PreviewViewPager.C;
       this.k = true;
       this.v = true;
       this.w = true;
       if (PatchProxy.applyVoidOneRefs(p0, this, PreviewViewPager.class, "2")) {
       }else {
          a.q(p0, "context");
          this.g = n.t(p0);
          this.addOnPageChangeListener(new n0(this));
       }
       return;
    }
    public static void p(PreviewViewPager p0,o p1,Float p2,int p3,Object p4){
       p0.o(p1, null);
    }
    public final PreviewViewPager$a getAttachmentDismissListener(){
       return this.m;
    }
    public final PreviewViewPager$b getBackgroundTransListener(){
       return this.n;
    }
    public final PreviewViewPager$e getMoveViewListener(){
       return this.p;
    }
    public final boolean getShouldAttachmentDismiss(){
       return this.o;
    }
    public final boolean getShowBackground(){
       return this.k;
    }
    public final void i(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PreviewViewPager.class, "16")) {
          return;
       }
       if (this.t == null) {
          this.t = VelocityTracker.obtain();
       }
       PreviewViewPager tt = this.t;
       if (tt != null) {
          tt.addMovement(p0);
       }
       return;
    }
    public final void j(float p0){
       PreviewViewPager obj;
       int i;
       if (PatchProxy.isSupport(PreviewViewPager.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PreviewViewPager.class, "5")) {
          return;
       }
       if (this.k != null) {
          if (PatchProxy.isSupport(PreviewViewPager.class)) {
             obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, PreviewViewPager.class, "15");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             label_0050 :
                this.setBackgroundColor(i);
             }
          }
          i = Color.argb((int)(q.t(q.m(p0, 0), 0x3f800000) * (float)255), 0, 0, 0);
          goto label_0050 ;
       }
       obj = this.n;
       if (obj != null) {
          obj.K7(p0);
       }
       return;
    }
    public final void k(float p0){
       if (PatchProxy.isSupport(PreviewViewPager.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PreviewViewPager.class, "3")) {
          return;
       }
       if (!p0 - 0x3f800000) {
          PreviewViewPager tm = this.m;
          if (tm != null) {
             tm.a(p0, false);
          }
       }
       this.j((p0 * PreviewViewPager.C));
       return;
    }
    public final void l(float p0){
       if (PatchProxy.isSupport(PreviewViewPager.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PreviewViewPager.class, "4")) {
          return;
       }
       this.j((p0 * this.h));
       return;
    }
    public final void m(boolean p0){
       this.v = p0;
    }
    public final void n(float p0,float p1){
       float f;
       float f1;
       PreviewViewPager tp;
       if (PatchProxy.isSupport(PreviewViewPager.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, PreviewViewPager.class, "11")) {
          return;
       }
       PreviewViewPager tq = this.q;
       if (tq != null) {
          View view = tq.getView();
          if (view != null) {
             this.c = PreviewViewPager.y;
             p0 = p0 - this.e;
             p1 = p1 - this.f;
             float c = PreviewViewPager.C;
             if (p1 - (float)0 > 0) {
                f = (Math.abs(p1) * (float)2) / (float)this.g;
                q.t(f, 0x3f800000);
                f1 = (float)1;
                f1 = f1 - ((f1 - PreviewViewPager.B) * f);
                f = c - ((c - PreviewViewPager.D) * f);
             }else {
                f = c;
                f1 = 0x3f800000;
             }
             view.setTranslationX(p0);
             view.setTranslationY(p1);
             if (!PatchProxy.isSupport(PreviewViewPager.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f1), this, PreviewViewPager.class, "12")) {
                tp = this.q;
                if (tp != null) {
                   View view1 = tp.getView();
                   if (view1 != null) {
                      float f2 = q.t(q.m(f1, PreviewViewPager.B), 0x3f800000);
                      view1.setScaleX(f2);
                      view1.setScaleY(f2);
                   }
                }
             }
             p0 = q.t(q.m(f, PreviewViewPager.D), c);
             this.h = p0;
             this.j(p0);
             tp = this.p;
             if (tp != null) {
                tp.c(p1);
             }
          }
       }
       return;
    }
    public final void o(o p0,Float p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PreviewViewPager.class, "6")) {
          return;
       }
       this.q = p0;
       View view = (p0 != null)? p0.getView(): null;
       this.r = view;
       this.s = p1;
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, PreviewViewPager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "ev");
       obj = "onInterceptTouchEvent: "+p0;
       boolean b = false;
       if (this.v == null) {
          try{
             if (this.w != null) {
                b = super.onInterceptTouchEvent(p0);
             }
          }catch(java.lang.IllegalArgumentException e5){
             Log.k(e5);
          }
          return b;
       }else {
          int action = p0.getAction();
          if (action) {
             if (action == 2) {
                action = Math.abs((int)(p0.getRawX() - this.e));
                int i = (int)(p0.getRawY() - this.f);
                if (i > 0 && Math.abs(i) > action) {
                   return true;
                }
             }
          }else {
             this.e = p0.getRawX();
             this.f = p0.getRawY();
             this.l = b;
          }
          try{
             if (this.w != null) {
                b = super.onInterceptTouchEvent(p0);
             }
          }catch(java.lang.IllegalArgumentException e5){
             Log.k(e5);
          }
          return b;
       }
    }
    public boolean onTouchEvent(MotionEvent p0){
       float f1;
       PreviewViewPager tu;
       float[] uofloatArray;
       ValueAnimator valueAnimato;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, PreviewViewPager.class, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.q(p0, "ev");
       obj = "onTouchEvent: "+p0;
       int z = PreviewViewPager.z;
       boolean b = false;
       if (this.c == z) {
          return b;
       }
       int actionMasked = p0.getActionMasked();
       if (actionMasked) {
          int i = 2;
          float f = 0;
          if (actionMasked != 1) {
             if (actionMasked != i) {
                if (actionMasked == 3) {
                label_0087 :
                   if (this.c != PreviewViewPager.y) {
                      if (this.w != null) {
                         b = super.onTouchEvent(p0);
                      }
                      return b;
                   }else {
                      float rawX = p0.getRawX();
                      float rawY = p0.getRawY();
                      Object[] objArray = null;
                      Object obj1 = PatchProxy.apply(objArray, this, PreviewViewPager.class, "17");
                      if (obj1 != patchProxyRe) {
                         f1 = obj1.floatValue();
                      }else {
                         tu = this.t;
                         if (tu != null) {
                            tu.computeCurrentVelocity(1000);
                            tu.clear();
                            tu.recycle();
                            f1 = tu.getYVelocity();
                         }else {
                            valueAnimato = 0;
                         }
                         this.t = objArray;
                      }
                      if (f1 - (float)1200 >= 0 || (rawY - this.f) - (float)(this.g / PreviewViewPager.F) > 0) {
                         this.c = z;
                         if (!PatchProxy.applyVoid(objArray, this, PreviewViewPager.class, "9")) {
                            tu = this.q;
                            View view = (tu != null)? tu.getView(): objArray;
                            this.r = view;
                            f1 = (view != null)? view.getTranslationX(): 0;
                            this.i = f1;
                            tu = this.r;
                            if (tu != null) {
                               f = tu.getTranslationY();
                            }
                            this.j = f;
                         }
                         tu = this.u;
                         if (tu != null) {
                            PreviewViewPager tq = this.q;
                            if (tq != null) {
                               objArray = tq.getView();
                            }
                            tu.a(objArray, this.s);
                         }
                      }else if(PatchProxy.isSupport(PreviewViewPager.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(rawX), Float.valueOf(rawY), this, PreviewViewPager.class, "10")){
                         this.c = z;
                         tu = this.f;
                         String str = "valueAnimator";
                         if (rawY - tu) {
                            uofloatArray = new float[i];
                            uofloatArray[b] = rawY;
                            uofloatArray[1] = tu;
                            valueAnimato = ValueAnimator.ofFloat(uofloatArray);
                            a.h(valueAnimato, str);
                            valueAnimato.setDuration(PreviewViewPager.E);
                            valueAnimato.addUpdateListener(new o0(this, rawY, rawX));
                            valueAnimato.start();
                         }else {
                            tu = this.e;
                            if (rawX - tu) {
                               uofloatArray = new float[i];
                               uofloatArray[b] = rawX;
                               uofloatArray[1] = tu;
                               valueAnimato = ValueAnimator.ofFloat(uofloatArray);
                               a.h(valueAnimato, str);
                               valueAnimato.setDuration(PreviewViewPager.E);
                               valueAnimato.addUpdateListener(new p0(this, rawX, rawY));
                               valueAnimato.start();
                            }
                         }
                      }
                      tu = this.p;
                      if (tu != null) {
                         tu.a();
                      }
                   }
                }
             }else {
                this.i(p0);
                int i1 = (int)(p0.getRawY() - this.f);
                if (i1 <= 0 && this.c != PreviewViewPager.y) {
                   if (this.w != null) {
                      b = super.onTouchEvent(p0);
                   }
                   return b;
                }else if(this.d != 1 && (i1 > 0 || this.c == PreviewViewPager.y)){
                   if (this.l == null) {
                      tu = this.p;
                      if (tu != null) {
                         tu.b();
                      }
                      this.l = true;
                   }
                   this.n(p0.getRawX(), p0.getRawY());
                   PreviewViewPager tm = this.m;
                   if (tm != null) {
                      tm.a(f, 1);
                   }
                   return 1;
                }
             }
          }else {
             goto label_0087 ;
          }
       }else if(this.c != PreviewViewPager.y){
          if (this.w != null) {
             b = super.onTouchEvent(p0);
          }
          return b;
       }else {
          this.e = p0.getRawX();
          this.f = p0.getRawY();
          this.i(p0);
       }
    label_01a9 :
       if (this.w != null) {
          b = super.onTouchEvent(p0);
       }
       return b;
    }
    public final void setAttachmentDismissListener(PreviewViewPager$a p0){
       this.m = p0;
    }
    public final void setBackgroundTransListener(PreviewViewPager$b p0){
       this.n = p0;
    }
    public final void setIAnimClose(PreviewViewPager$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PreviewViewPager.class, "1")) {
          return;
       }
       a.q(p0, "iAnimClose");
       this.u = p0;
       return;
    }
    public final void setMoveViewListener(PreviewViewPager$e p0){
       this.p = p0;
    }
    public final void setShouldAttachmentDismiss(boolean p0){
       this.o = p0;
    }
    public final void setShowBackground(boolean p0){
       this.k = p0;
    }
}
