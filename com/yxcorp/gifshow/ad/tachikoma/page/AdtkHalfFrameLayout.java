package com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import c59.k;
import android.util.SparseArray;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout$a;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout$b;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.util.Objects;
import kotlin.jvm.internal.a;
import c59.e;
import c59.n;
import ky8.a;
import android.view.View;
import a2.m0;
import a2.i0;
import a2.n0;
import android.view.animation.Interpolator;
import c59.i;
import a2.p0;
import java.lang.Integer;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout$d;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout$e;
import c59.g;
import java.lang.Float;
import java.lang.Boolean;
import c59.h;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import bh5.b;
import java.lang.Number;
import java.util.LinkedList;
import java.lang.Math;
import c59.o;

public class AdtkHalfFrameLayout extends FrameLayout	// class@001843
{
    public float b;
    public final k c;
    public final SparseArray d;
    public o e;
    public final AdtkHalfFrameLayout$e f;
    public final AdtkHalfFrameLayout$e g;
    public final AdtkHalfFrameLayout$e h;
    public int i;
    public int j;
    public static final float k;

    static {
       AdtkHalfFrameLayout.k = (float)a1.e(0x41f00000);
    }
    public void AdtkHalfFrameLayout(Context p0){
       super(p0, null);
    }
    public void AdtkHalfFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void AdtkHalfFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       k ok = new k();
       this.c = ok;
       this.d = new SparseArray();
       this.f = new AdtkHalfFrameLayout$a(this);
       this.g = new AdtkHalfFrameLayout$b(this);
       this.h = new AdtkHalfFrameLayout$c(this);
       this.i = 1;
       this.j = 1;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdtkHalfFrameLayout.class, "1")) {
       }else {
          this.b = (float)n.j(p0) * 0x3f4ccccd;
       }
       Objects.requireNonNull(ok);
       if (!PatchProxy.applyVoidOneRefs(this, ok, k.class, "1")) {
          a.p(this, "target");
          ok.f = this;
          if (ok.g == null) {
             ok.g = new e(this, (float)a1.e(0x41f00000));
          }
       }
       return;
    }
    public void a(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdtkHalfFrameLayout.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.d.put(p0.hashCode(), p0);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, AdtkHalfFrameLayout.class, "7")) {
          return;
       }
       this.clearAnimation();
       m0 om0 = i0.c(this);
       om0.k(0);
       om0.f(this.h);
       om0.d(300);
       om0.e(new a(0, 0, 0x3f147ae1, 0x3f800000));
       om0.i(new i(this));
       om0.j();
       return;
    }
    public void c(int p0){
       if (PatchProxy.isSupport(AdtkHalfFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AdtkHalfFrameLayout.class, "9")) {
          return;
       }
       AdtkHalfFrameLayout$d uod = new AdtkHalfFrameLayout$d(this, p0);
       if (!PatchProxy.applyVoidOneRefs(uod, this, AdtkHalfFrameLayout.class, "4")) {
          this.clearAnimation();
          p0.a = uod;
          m0 om0 = i0.c(this);
          om0.d(350);
          om0.e(this.e());
          om0.k((float)this.f(this.getContext()));
          om0.f(this.f);
          om0.i(new g(this));
          om0.j();
       }
       return;
    }
    public void d(float p0,boolean p1){
       if (PatchProxy.isSupport(AdtkHalfFrameLayout.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Boolean.valueOf(p1), this, AdtkHalfFrameLayout.class, "6")) {
          return;
       }
       this.clearAnimation();
       this.setTranslationY(p0);
       long l = 300;
       if (p1) {
          l = 350;
       }
       a uoa = new a(0.42f, 0, 0x3f800000, 0x3f800000);
       if (p1) {
          uoa = this.e();
       }
       m0 om0 = i0.c(this);
       om0.k(this.getAnchorTranslationY());
       om0.f(this.g);
       om0.d(l);
       om0.e(uoa);
       om0.i(new h(this));
       om0.j();
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdtkHalfFrameLayout.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.dispatchTouchEvent(p0);
    }
    public final Interpolator e(){
       b obj = PatchProxy.apply(null, this, AdtkHalfFrameLayout.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       b uob = obj;
       uob.a(0, 0, 0x3df1a9fc, 0.05f, 0.33f, 0.35f, 0.44f, 0x3f26a7f0);
       uob.a(0.44f, 0x3f26a7f0, 0x3f0ccccd, 0x3f743958, 0x3f2d9168, 0x3f7c6a7f, 0x3f800000, 0x3f800000);
       return obj;
    }
    public int f(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdtkHalfFrameLayout.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n.j(p0);
    }
    public void g(int p0){
       if (PatchProxy.isSupport(AdtkHalfFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AdtkHalfFrameLayout.class, "11")) {
          return;
       }
       int i = this.d.size();
       if (i < 1) {
          return;
       }
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.d.valueAt(i1).a(p0);
       }
       return;
    }
    public float getAnchorTranslationY(){
       return this.b;
    }
    public int getDragStatus(){
       return this.i;
    }
    public int getPreDragStatus(){
       return this.j;
    }
    public final void h(float p0){
       int i;
       if (PatchProxy.isSupport(AdtkHalfFrameLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, AdtkHalfFrameLayout.class, "12")) {
          return;
       }
       AdtkHalfFrameLayout tb = this.b;
       float f = 0;
       Context uContext = 1;
       if ((v3 = p0 - tb) >= 0 && p0 - (AdtkHalfFrameLayout.k + tb) < 0) {
          i = 3;
          this.setDragStatus(i);
          this.setPreDragStatus(i);
       }else if(p0 - f <= 0){
          i = 5;
          this.setDragStatus(i);
          this.setPreDragStatus(i);
       }else if(p0 - tb < 0){
          this.setDragStatus(4);
       }else if(v3 > 0){
          this.setDragStatus(2);
       }else if(p0 - (float)this.getHeight() <= 0){
          this.setDragStatus(uContext);
          this.setPreDragStatus(uContext);
       }
       if (this.d.size() < uContext) {
          return;
       }else {
          float f1 = (float)this.f(this.getContext());
          if (p0 - tb < 0) {
             f = 0x3f800000 - (p0 / tb);
          }else if(!v3){
             f = (- (p0 - tb)) / (f1 - tb);
          }
          int i1 = 0;
          while (i1 < this.d.size()) {
             n on = this.d.valueAt(i1);
             if (on != null) {
                on.b(p0, f);
             }
             i1 = i1 + 1;
          }
          return;
       }
    }
    public void i(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdtkHalfFrameLayout.class, "3")) {
          return;
       }
       if (p0 != null) {
          this.d.remove(p0.hashCode());
       }
       return;
    }
    public boolean j(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdtkHalfFrameLayout.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.onInterceptTouchEvent(p0);
    }
    public boolean k(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdtkHalfFrameLayout.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          return super.onTouchEvent(p0);
       }catch(java.lang.Exception e0){
          return false;
       }
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       int b1;
       k f;
       k ok1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdtkHalfFrameLayout obj = PatchProxy.applyOneRefs(p0, this, AdtkHalfFrameLayout.class, "17");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.c;
       if (obj == null) {
          return this.j(p0);
       }
       Objects.requireNonNull(obj);
       k ok = k.class;
       Object[] obj1 = PatchProxy.applyOneRefs(p0, obj, ok, "2");
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, "event");
          obj1 = null;
          if (!PatchProxy.applyVoid(obj1, obj, ok, "7")) {
             k f5 = obj.f;
             if (f5 != null) {
                float f6 = (f5.getChildCount() > 0 && obj.a == null)? Float.MIN_VALUE: 0;
                if (f6) {
                   ok1 = f5;
                }
                if (ok1 != null && (!PatchProxy.applyVoidOneRefs(ok1, obj, ok, "8") && obj.a == null)) {
                   LinkedList linkedList = new LinkedList();
                   linkedList.offer(ok1);
                   while (!linkedList.isEmpty()) {
                      View view = linkedList.poll();
                      Object obj3 = PatchProxy.applyOneRefs(view, obj, ok, "9");
                      if (obj3 != patchProxyRe) {
                         b2 = obj3.booleanValue();
                      }else if(!obj.a(view)){
                         obj3 = PatchProxy.applyOneRefs(view, obj, ok, "11");
                         if (obj3 != patchProxyRe) {
                            b2 = obj3.booleanValue();
                         }else if(view != null){
                            b2 = view.canScrollVertically(b);
                         }else {
                            b2 = false;
                         }
                         if (!b2) {
                            b2 = false;
                         }
                      }
                      b2 = true;
                      if (b2) {
                         obj.a = view;
                         break ;
                      }else if(view instanceof ViewGroup){
                         b2 = view.getChildCount();
                         for (int i = 0; i < b2; i = i + 1) {
                            linkedList.offer(view.getChildAt(i));
                         }
                      }
                   }
                }
             }
          }
          Object obj2 = PatchProxy.applyOneRefs(p0, obj, ok, "6");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else {
             b1 = p0.getAction();
             float f1 = 0;
             if (b1) {
                if (b1 == 2) {
                   float f2 = obj.b - p0.getY();
                   if (Math.abs(f2) - Math.abs((obj.c - p0.getX())) > 0 && Math.abs(f2) - (float)obj.d > 0) {
                      float f3 = (float)0;
                      f = (f2 - f3 > 0)? 1: null;
                      if (f) {
                         k f4 = obj.f;
                         if (f4 != null) {
                            f1 = f4.getTranslationY();
                         }
                         if (f1 - f3 > 0) {
                            if (obj.h == 2) {
                            label_012f :
                               b1 = true;
                            }
                         }
                      }
                      if (f == null && !obj.a(obj.a)) {
                         goto label_012f ;
                      }
                   }
                }
             }else {
                obj.b = p0.getY();
                obj.c = p0.getX();
                f = obj.f;
                if (f != null) {
                   f1 = f.getTranslationY();
                }
                obj.e = f1;
             }
          label_0147 :
             b1 = false;
          }
          if (!b1) {
             f = obj.f;
             if (f != null) {
                b = f.j(p0);
             }else {
                b = false;
             }
          }
       }
       return b;
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b;
       boolean b2;
       k f;
       e a;
       boolean b3;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdtkHalfFrameLayout obj2 = PatchProxy.applyOneRefs(obj1, obj, AdtkHalfFrameLayout.class, "16");
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       obj2 = obj.c;
       if (obj2 == null) {
          return this.k(p0);
       }
       Objects.requireNonNull(obj2);
       k ok = k.class;
       String str = "3";
       k obj3 = PatchProxy.applyOneRefs(obj1, obj2, ok, str);
       if (obj3 != patchProxyRe) {
          b = obj3.booleanValue();
       }else {
          a.p(obj1, "event");
          obj3 = PatchProxy.applyOneRefs(obj1, obj2, ok, "4");
          int b1 = true;
          if (obj3 != patchProxyRe) {
             b2 = obj3.booleanValue();
          }else {
             int i = p0.getAction() & 0x00ff;
             String str1 = "5";
             if (i != b1) {
                if (i != 0.00f) {
                   b2 = false;
                }else {
                   Object obj4 = PatchProxy.applyOneRefs(obj1, obj2, ok, str1);
                   if (obj4 != patchProxyRe) {
                      obj4.booleanValue();
                   }else {
                      f = obj2.f;
                      if (f != null) {
                         float f1 = f.getTranslationY() - (obj2.b - p0.getY());
                         if (f1 - null < 0) {
                            f1 = 0;
                         }
                         ok = obj2.e;
                         float f2 = (ok - (float)0 >= 0 && ok - f.getAnchorTranslationY() < 0)? Float.MIN_VALUE: 0;
                         if (f2 && f1 - f.getAnchorTranslationY() >= 0) {
                            f1 = Math.min(f1, f.getAnchorTranslationY());
                         }
                         if (!PatchProxy.isSupport(AdtkHalfFrameLayout.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f1), f, AdtkHalfFrameLayout.class, "21")) {
                            f.setTranslationY(f1);
                         }
                      }
                   }
                }
             }else {
                ok = obj2.g;
                if (ok != null) {
                   obj3 = obj2.e;
                   if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(obj3), ok, e.class, "1")) {
                      float translationY = ok.a.getTranslationY();
                      float f3 = Math.abs((translationY - obj3));
                      if (f3 - ok.b < 0) {
                         if (!PatchProxy.applyVoid(null, ok, e.class, "6")) {
                            b2 = ok.a.getDragStatus();
                            if (b2 != b1) {
                               if (b2 != 3) {
                                  if (b2 != 5) {
                                     ok.b("currentTransY < slop => ¶µµ× auto scroll container animateExpand");
                                     a = ok.a;
                                     a.d(a.getTranslationY(), 0);
                                  }else {
                                     ok.b("currentTransY < slop => auto scroll container animateExpand");
                                     ok.a.b();
                                  }
                               }else {
                                  ok.b("currentTransY < slop => auto scroll container animateShowAnchor");
                                  a = ok.a;
                                  a.d(a.getTranslationY(), 0);
                               }
                            }else {
                               ok.b("currentTransY < slop => auto scroll container close");
                               ok.a.c(3);
                            }
                         }
                      }else {
                         Object obj5 = PatchProxy.apply(null, ok, e.class, str1);
                         if (obj5 != patchProxyRe) {
                            b3 = obj5.booleanValue();
                         }else if(ok.a.getTranslationY() - (ok.a.getAnchorTranslationY() + ok.b) > 0){
                            b3 = true;
                         }else {
                            b3 = false;
                         }
                         if (b3) {
                            ok.a.c(3);
                         }else if(ok.a()){
                            ok.a.b();
                         }else if(PatchProxy.isSupport(e.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(translationY), Float.valueOf(f3), ok, e.class, "2")){
                            b1 = ok.a.getPreDragStatus();
                            if (b1 == 5) {
                               if (ok.a()) {
                                  ok.a.b();
                               }else {
                                  ok.a.d(translationY, 0);
                               }
                            }else if(b1 == 3){
                               Object obj6 = PatchProxy.apply(null, ok, e.class, str);
                               if (obj6 != patchProxyRe) {
                                  b2 = obj6.booleanValue();
                               }else if(ok.a.getTranslationY() - (ok.a.getAnchorTranslationY() - ok.b) >= 0 && ok.a.getTranslationY() - (ok.a.getAnchorTranslationY() + ok.b) <= 0){
                                  b2 = true;
                               }else {
                                  b2 = false;
                               }
                               if (b2) {
                                  ok.a.d(translationY, 0);
                               }else if(f3 - ok.b >= 0){
                                  ok.a.b();
                               }else {
                                  ok.a.c(3);
                               }
                            }else {
                               ok.a.c(3);
                            }
                         }
                      }
                   }
                }
             }
             b2 = true;
          }
          if (b2) {
             b = true;
          }else {
             f = obj2.f;
             if (f != null) {
                b = f.k(obj1);
             }else {
                b = false;
             }
          }
       }
       return b;
    }
    public void setAnchorTranslationY(float p0){
       if (p0 >= 0) {
          this.b = p0;
       }
       return;
    }
    public void setDragStatus(int p0){
       this.i = p0;
    }
    public void setDragStyle(int p0){
       if (PatchProxy.isSupport(AdtkHalfFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AdtkHalfFrameLayout.class, "13")) {
          return;
       }
       this.c.h = p0;
       return;
    }
    public void setOnHalfPageHiddenListener(o p0){
       this.e = p0;
    }
    public final void setPreDragStatus(int p0){
       this.j = p0;
    }
    public void setTranslationY(float p0){
       if (PatchProxy.isSupport(AdtkHalfFrameLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, AdtkHalfFrameLayout.class, "14")) {
          return;
       }
       super.setTranslationY(p0);
       this.h(p0);
       return;
    }
}
