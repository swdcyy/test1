package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$j;
import zq6.i;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import zq6.p;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import bo5.a;
import co5.e;
import android.view.ViewPropertyAnimator;
import android.view.View;
import co5.e$b;
import java.lang.Runnable;
import co5.n;
import wq6.h;
import lnc.a1;
import com.kwai.library.widget.textview.IconifyTextViewNew;
import tkd.b;
import tkd.d;
import hn5.n;
import com.kwai.kcube.TabIdentifier;
import on5.a;
import co5.m;
import co5.m$a;
import android.graphics.Typeface;
import co5.j;
import co5.j$a;
import android.graphics.Bitmap;
import co5.p;
import com.kwai.library.widget.textview.IconifyRadioButtonNew;
import java.lang.Boolean;
import com.kwai.library.widget.textview.IconifyTextViewNew$a;
import android.animation.ValueAnimator;
import com.kwai.library.widget.textview.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import h27.f;
import com.kwai.library.widget.textview.b;
import h27.g;
import java.lang.Float;
import co5.c;
import java.lang.Integer;

public final class a$j implements i	// class@00171d
{
    public final a a;

    public void a$j(a p0){
       this.a = p0;
       super();
    }
    public void a(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$j.class, "1")) {
          return;
       }
       a.p(p0, "values");
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          p key = uEntry.getKey();
          this.d(key, uEntry.getValue());
       }
       return;
    }
    public void b(p p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$j.class, "2")) {
          return;
       }
       a.p(p0, "stateId");
       a.p(p1, "value");
       this.d(p0, p1);
       return;
    }
    public final Object c(p p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a$j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.d().cast(p1);
       Objects.requireNonNull(p0);
       a.o(p0, "Objects.requireNonNull\(s¡­d.valueClass.cast\(value\)\)");
       return p0;
    }
    public final void d(p p0,Object p1){
       e$b a;
       a b;
       n on1;
       j$a a1;
       long l;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$j.class, "3")) {
          return;
       }
       p x = a.x;
       String str = "2";
       String str1 = "1";
       if (a.g(x, p0)) {
          a.o(x, "HomeTopStateId.TAB_ANIMATE");
          e uoe = this.c(x, p1);
          p1 = this.a.B;
          Objects.requireNonNull(uoe);
          if (!PatchProxy.applyVoidOneRefs(p1, uoe, e.class, str)) {
             if (uoe.a != null) {
                uoe = uoe.b;
                if (uoe != null) {
                   p1 = p1.animate();
                   if (!PatchProxy.applyVoidOneRefs(p1, uoe, e$b.class, str1)) {
                      a = uoe.a;
                      if (a - Long.MIN_VALUE) {
                         p1.setDuration(a);
                      }
                      a = uoe.b;
                      if (a - 0xff800000) {
                         p1.alpha(a);
                      }
                      e$b c = uoe.c;
                      if (c != null) {
                         p1.withEndAction(c);
                      }
                      p1.start();
                   }
                }
             }
             p1.animate().cancel();
          }
       }else {
          x = a.y;
          if (a.g(x, p0)) {
             a.o(x, "HomeTopStateId.TAB_RED_DOT_NOTIFY");
             n on = this.c(x, p1);
             p1 = this.a;
             b = p1.B;
             p1 = a.S8(p1);
             Objects.requireNonNull(on);
             if (!PatchProxy.applyVoidTwoRefs(b, p1, on, n.class, str1)) {
                if (on.a != null) {
                   b.setRedPointTopMargin(a1.e(0x3fc00000));
                   b.h();
                }else {
                   b.c();
                }
                d.a(-1883158055).dh(on.a, a.c(p1.M2()));
             }
          }else {
             x = a.z;
             int i = 1;
             if (a.g(x, p0)) {
                a.o(x, "HomeTopStateId.TAB_NUMBER_NOTIFY");
                m om = this.c(x, p1);
                p1 = this.a;
                b = p1.B;
                p1 = a.S8(p1);
                Objects.requireNonNull(om);
                if (!PatchProxy.applyVoidTwoRefs(b, p1, om, m.class, str)) {
                   if (om.a != null) {
                      m c1 = om.c;
                      if (c1 != null) {
                         if (!PatchProxy.applyVoidOneRefs(b, c1, m$a.class, str1)) {
                            b.I = c1.b;
                            m$a c2 = c1.c;
                            if (c2 > null) {
                               b.setNumberBgResId(c2);
                            }
                            c2 = c1.d;
                            if (c2 > 0) {
                               b.setNumberTextSize(c2);
                            }
                            b.setCircleNumberBg(c1.e);
                            c2 = c1.f;
                            if (c2 != Integer.MIN_VALUE) {
                               m$a g = c1.g;
                               if (g != Integer.MIN_VALUE) {
                                  b.A = c2;
                                  b.B = g;
                               }
                            }
                            c2 = c1.h;
                            if (c2 != Integer.MIN_VALUE) {
                               b.setRedPointLeftMargin((float)c2);
                            }
                            c2 = c1.i;
                            if (c2 != Integer.MIN_VALUE) {
                               b.setRedPointTopMargin(c2);
                            }
                            c2 = c1.k;
                            if (c2 > null) {
                               b.setNumberGravity(c2);
                            }
                            b.setNumberTypeFace(c1.j);
                            b.g();
                         }
                         b.g();
                      label_0150 :
                         on1 = d.a(-1883158055);
                         c1 = om.a;
                         if (om.c == null) {
                            i = 0;
                         }
                         on1.dh((c1 & i), a.c(p1.M2()));
                      }
                   }
                   b.b();
                   goto label_0150 ;
                }
             }else {
                x = a.A;
                if (a.g(x, p0)) {
                   a.o(x, "HomeTopStateId.TAB_IMAGE_NOTIFY");
                   j oj = this.c(x, p1);
                   p1 = this.a;
                   b = p1.B;
                   p1 = a.S8(p1);
                   Objects.requireNonNull(oj);
                   if (!PatchProxy.applyVoidTwoRefs(b, p1, oj, j.class, str)) {
                      if (oj.a != null) {
                         j b1 = oj.b;
                         if (b1 != null) {
                            if (!PatchProxy.applyVoidOneRefs(b, b1, j$a.class, str1)) {
                               a1 = b1.a;
                               if (a1 != Integer.MIN_VALUE) {
                                  b.setImageResourceId(a1);
                               }else {
                                  b.U = 5;
                                  b.V = 5;
                                  b.setImageBitmap(b1.b);
                               }
                            }
                            b.e();
                         label_01bf :
                            on1 = d.a(-1883158055);
                            b1 = oj.a;
                            if (oj.b == null) {
                               i = 0;
                            }
                            on1.dh((b1 & i), a.c(p1.M2()));
                         }
                      }
                      b.a();
                      goto label_01bf ;
                   }
                }else {
                   x = a.B;
                   if (a.g(x, p0)) {
                      a.o(x, "HomeTopStateId.TAB_TRIANGLE_NOTIFY");
                      this.c(x, p1).a(this.a.B);
                   }else {
                      x = a.D;
                      if (a.g(x, p0)) {
                         a.o(x, "HomeTopStateId.TAB_ROTATE_DEGREES");
                         p0 = this.c(x, p1);
                         a.o(p0, "castTo\(HomeTopStateId.TAB_ROTATE_DEGREES, value\)");
                         if (p0.booleanValue()) {
                            a b2 = this.a.B;
                            if (b2.w == null) {
                               p1 = b2.v;
                               if (p1 == IconifyTextViewNew$a.a) {
                                  p1 = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
                                  l = (long)0;
                                  p1.setDuration(l);
                                  p1.start();
                                  p1.addUpdateListener(new a(b2));
                                  p1 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                                  p1.setDuration(l);
                                  p1.start();
                                  p1.addUpdateListener(new f(b2));
                               }else if(p1 == IconifyTextViewNew$a.b){
                                  p1 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                                  l = (long)0;
                                  p1.setDuration(l);
                                  p1.start();
                                  p1.addUpdateListener(new b(b2));
                                  p1 = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
                                  p1.setDuration(l);
                                  p1.start();
                                  p1.addUpdateListener(new g(b2));
                               }
                            }
                         }
                      }else {
                         x = a.E;
                         if (a.g(x, p0)) {
                            a.o(x, "HomeTopStateId.TAB_TRIANGLE_ALPHA");
                            Float uFloat = this.c(x, p1);
                            if (a.e(uFloat, 0x3f800000)) {
                               this.a.B.setUpTriangleAlpha(0);
                               this.a.B.setTriangleDirection(IconifyTextViewNew$a.a);
                            }
                            a.o(uFloat, "alpha");
                            this.a.B.setTriangleAlpha(uFloat.floatValue());
                            this.a.B.invalidate();
                         }else {
                            x = a.F;
                            if (a.g(x, p0)) {
                               a.o(x, "HomeTopStateId.TAB_TRIANGLE_ALPHA_WITH_DIRECTION");
                               c uoc = this.c(x, p1);
                               this.a.B.setTriangleDirection(uoc.b);
                               if (uoc.b == IconifyTextViewNew$a.b) {
                                  this.a.B.setUpTriangleAlpha(uoc.a);
                                  this.a.B.setTriangleAlpha(0);
                               }else {
                                  this.a.B.setTriangleAlpha(uoc.a);
                                  this.a.B.setUpTriangleAlpha(0);
                               }
                               this.a.B.invalidate();
                            }else {
                               x = a.C;
                               if (a.g(x, p0)) {
                                  a.o(x, "HomeTopStateId.TAB_TRIANGLE_COLOR");
                                  Integer integer = this.c(x, p1);
                                  a.o(integer, "color");
                                  this.a.B.setTriangleColor(integer.intValue());
                                  this.a.B.invalidate();
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
