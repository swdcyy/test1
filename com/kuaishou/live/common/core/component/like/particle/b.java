package com.kuaishou.live.common.core.component.like.particle.b;
import java.lang.Object;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.like.particle.LiveHeartParticleBubbleView$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.common.core.component.like.particle.LiveHeartParticleBubbleView;
import android.content.Context;
import java.util.Objects;
import java.lang.Boolean;
import ekd.j;
import android.view.ViewParent;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Rect;
import java.lang.Number;
import java.util.Random;
import com.kuaishou.live.common.core.component.like.particle.LiveHeartParticleBubbleView$a;
import android.view.animation.Interpolator;
import com.kuaishou.live.common.core.component.like.particle.LiveHeartParticleBubbleView$b;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.content.res.Resources;
import lnc.a1;
import android.graphics.BitmapFactory;
import java.io.File;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.util.List;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$d;
import java.lang.Math;
import java.lang.Runnable;
import a2.i0;

public class b	// class@001474
{

    public void b(){
       super();
    }
    public static void a(int p0,int p1,int p2,int p3,ViewGroup p4,LiveHeartParticleBubbleView$c p5){
       String str;
       LiveHeartParticleBubbleView$a uoa1;
       LiveHeartParticleBubbleView$a n1;
       int i8;
       LiveHeartParticleBubbleView obj2;
       float f;
       LiveHeartParticleBubbleView c;
       LiveHeartParticleBubbleView j;
       Bitmap uBitmap;
       LiveHeartParticleBubbleView$c b;
       int i = p1;
       object oobject = p4;
       object oobject1 = p5;
       b uob = b.class;
       Object[] objArray = null;
       int i1 = 3;
       int i2 = 2;
       int i3 = 0;
       int i4 = 1;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray1 = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),oobject,oobject1};
          if (PatchProxy.applyVoid(objArray1, objArray, uob, "1")) {
             return;
          }
       }
       int[] obj = PatchProxy.applyTwoRefs(oobject, oobject1, objArray, uob, "3");
       int i5 = -1;
       if (obj != PatchProxyResult.class) {
       }else {
          boolean i9 = 0x7f0a2005;
          j = oobject.getTag(i9);
          if (j != null) {
          }else {
             j = new LiveHeartParticleBubbleView(p4.getContext());
             oobject.setTag(i9, j);
             Objects.requireNonNull(p5);
             obj = PatchProxy.apply(objArray, oobject1, LiveHeartParticleBubbleView$c.class, "6");
             if (obj != PatchProxyResult.class) {
                i9 = obj.booleanValue();
             }else if(j.g(oobject1.a) && j.h(oobject1.b)){
                i9 = false;
             }else {
                i9 = true;
             }
             if (!i9) {
                obj = new int[i4];
                obj[i3] = 0x7f0810b6;
                oobject1.a = obj;
                oobject1.b = objArray;
             }
             j.setBubbleDrawable(oobject1);
          }
          i9 = j;
          if (i9.getParent() == null) {
             oobject.addView(i9, new ViewGroup$LayoutParams(i5, i5));
          }
       }
       Objects.requireNonNull(obj);
       if (!PatchProxy.isSupport(LiveHeartParticleBubbleView.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), obj, LiveHeartParticleBubbleView.class, "1")) {
          obj.l = i3;
          int i6 = p0 + (p2 >> 1);
          int n = LiveHeartParticleBubbleView.n;
          int i7 = i6 - (n >> 1);
          obj.b.set(i7, i, (i7 + n), (i + n));
          i3 = LiveHeartParticleBubbleView.o;
          i4 = i6 - (i3 >> 1);
          i = i - LiveHeartParticleBubbleView.q;
          obj.c.set(i4, i, (i3 + i4), (LiveHeartParticleBubbleView.p + i));
          i = LiveHeartParticleBubbleView.r;
          i6 = i6 - (i >> 1);
          Rect bottom = obj.c.bottom;
          i4 = bottom + n;
          obj.d.set(i6, i4, (i + i6), (((obj.b.top + i4) - bottom) - (n * 2)));
          Object obj1 = PatchProxy.apply(objArray, obj, LiveHeartParticleBubbleView.class, "2");
          i = (obj1 != PatchProxyResult.class)? obj1.intValue(): obj.i.nextInt(i2) + i2;
          LiveHeartParticleBubbleView$a uoa = LiveHeartParticleBubbleView$a.class;
          if (!PatchProxy.isSupport(LiveHeartParticleBubbleView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), obj, LiveHeartParticleBubbleView.class, "7")) {
             i4 = 0;
             while (i4 < i) {
                LiveHeartParticleBubbleView liveHeartPar = PatchProxy.apply(objArray, obj, LiveHeartParticleBubbleView.class, "18");
                if (liveHeartPar != PatchProxyResult.class) {
                }else {
                   liveHeartPar = obj.h;
                   if (liveHeartPar != null) {
                      obj.h = liveHeartPar.d;
                      liveHeartPar.d = objArray;
                   }else {
                      liveHeartPar = new LiveHeartParticleBubbleView$a(obj.e);
                   }
                   j = obj.j;
                   if (j != null) {
                      LiveHeartParticleBubbleView$c obj3 = PatchProxy.apply(objArray, j, LiveHeartParticleBubbleView$b.class, "1");
                      if (obj3 != PatchProxyResult.class) {
                      }else {
                         i1 = j.c.nextInt(j.a.b());
                         obj3 = j.b.get(j.a.a(i1));
                         if (obj3 == null) {
                            LiveHeartParticleBubbleView$b a = j.a;
                            Objects.requireNonNull(a);
                            if (PatchProxy.isSupport(LiveHeartParticleBubbleView$c.class)) {
                               obj3 = PatchProxy.applyOneRefs(Integer.valueOf(i1), a, LiveHeartParticleBubbleView$c.class, "1");
                               if (obj3 != PatchProxyResult.class) {
                               }else if(a.a != null){
                                  if (PatchProxy.isSupport(LiveHeartParticleBubbleView$c.class)) {
                                     obj3 = PatchProxy.applyOneRefs(Integer.valueOf(i1), a, LiveHeartParticleBubbleView$c.class, "2");
                                     if (obj3 != PatchProxyResult.class) {
                                     }
                                  }
                                  obj3 = a.a;
                                  if (obj3 != null && (i1 >= obj3.length || i1 < 0)) {
                                  label_0201 :
                                     obj3 = objArray;
                                  }else {
                                     uBitmap = BitmapFactory.decodeResource(a1.m(), a.a[i1]);
                                  }
                               }else if(PatchProxy.isSupport(LiveHeartParticleBubbleView$c.class)){
                                  obj3 = PatchProxy.applyOneRefs(Integer.valueOf(i1), a, LiveHeartParticleBubbleView$c.class, "3");
                                  if (obj3 != PatchProxyResult.class) {
                                  }
                               }
                               b = a.b;
                               if (b != null && (i1 >= b.length || i1 < 0)) {
                                  goto label_0201 ;
                               }else {
                                  uBitmap = BitmapUtil.q(b[i1]);
                               }
                               obj3 = uBitmap;
                            }else {
                               goto label_01ae ;
                            }
                            j.b.put(j.a.a(i1), obj3);
                         }
                      }
                      if (!PatchProxy.applyVoidOneRefs(obj3, liveHeartPar, uoa, "1")) {
                         liveHeartPar.e = obj3;
                         float f2 = 2.00f;
                         float f3 = (float)liveHeartPar.a() / f2;
                         liveHeartPar.r = f3;
                         Object obj4 = PatchProxy.apply(objArray, liveHeartPar, uoa, "3");
                         if (obj4 != PatchProxyResult.class) {
                            i1 = obj4.intValue();
                         }else {
                            n1 = liveHeartPar.e;
                            i1 = (n1 == null)? 0: n1.getHeight();
                         }
                         f3 = (float)i1 / f2;
                         liveHeartPar.s = f3;
                      }
                   }
                }
                i4 = i4 + 1;
                if (PatchProxy.isSupport(LiveHeartParticleBubbleView.class) && PatchProxy.applyVoidTwoRefs(liveHeartPar, Integer.valueOf(i4), obj, LiveHeartParticleBubbleView.class, "13")) {
                   LiveHeartParticleBubbleView$b uob1 = 3;
                }else {
                   i1 = i4 % 3;
                   Rect rect = 2;
                   i2 = obj.d.width() * 2;
                   i7 = 3;
                   i2 = i2 / i7;
                   if (i1 == 1) {
                      i8 = 0;
                   }else if(i1 == rect){
                      i8 = obj.d.width() / i7;
                   }else {
                      i8 = obj.d.width() * 2;
                      i8 = i8 / i7;
                   }
                   obj2 = obj.d;
                   n = obj2.left + i8;
                   i1 = obj2.width() - i2;
                   n = n + obj.i.nextInt(i1);
                   liveHeartPar.n = n;
                   c = obj.d;
                   i1 = c.top + obj.i.nextInt(c.height());
                   liveHeartPar.o = i1;
                }
                if (!PatchProxy.applyVoidOneRefs(liveHeartPar, obj, LiveHeartParticleBubbleView.class, "11")) {
                   if (liveHeartPar.n < obj.b.centerX()) {
                      c = obj.b;
                      i8 = c.width() >> 1;
                      i1 = c.left + obj.i.nextInt(i8);
                      liveHeartPar.j = i1;
                   }else {
                      i2 = obj.b.width() >> 1;
                      i8 = obj.b.centerX() + obj.i.nextInt(i2);
                      liveHeartPar.j = i8;
                   }
                   c = obj.b;
                   i1 = c.top + obj.i.nextInt(c.height());
                   liveHeartPar.k = i1;
                }
                if (!PatchProxy.applyVoidOneRefs(liveHeartPar, obj, LiveHeartParticleBubbleView.class, "12")) {
                   if (liveHeartPar.n < obj.c.centerX()) {
                      c = obj.c;
                      i8 = c.width() >> 1;
                      i1 = c.left + obj.i.nextInt(i8);
                      liveHeartPar.l = i1;
                   }else {
                      i2 = obj.c.width() >> 1;
                      i8 = obj.c.centerX() + obj.i.nextInt(i2);
                      liveHeartPar.l = i8;
                   }
                   c = obj.c;
                   i1 = c.top + obj.i.nextInt(c.height());
                   liveHeartPar.m = i1;
                }
                if (PatchProxy.isSupport(LiveHeartParticleBubbleView.class) && PatchProxy.applyVoidTwoRefs(liveHeartPar, Integer.valueOf(i4), obj, LiveHeartParticleBubbleView.class, "8")) {
                   p1 = i;
                   str = -1;
                }else {
                   i8 = obj.i.nextBoolean() ^ 1;
                   if (PatchProxy.isSupport(LiveHeartParticleBubbleView.class)) {
                      obj2 = PatchProxy.applyTwoRefs(Integer.valueOf(i8), Integer.valueOf(i4), obj, LiveHeartParticleBubbleView.class, "9");
                      if (obj2 != PatchProxyResult.class) {
                         i1 = obj2.intValue();
                      }else {
                      label_0385 :
                         i1 = i4 % obj.m.size();
                         if (i8 == 1) {
                            i2 = obj.m.size() - i1;
                            i2 = i2 - 1;
                            i1 = i2;
                         }
                         if (obj.m.get(i1) == null) {
                            i1 = 0;
                         }else {
                            i1 = a1.e(obj.m.get(i1).s);
                         }
                      }
                   }else {
                      goto label_0385 ;
                   }
                   if (PatchProxy.isSupport(LiveHeartParticleBubbleView.class)) {
                      p1 = i;
                      obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(i8), Integer.valueOf(i4), obj, LiveHeartParticleBubbleView.class, "10");
                      if (obj1 != PatchProxyResult.class) {
                         i = obj1.intValue();
                         str = -1;
                      }else {
                      label_03d9 :
                         i = i4 % obj.m.size();
                         if (i8 == 1) {
                            i8 = obj.m.size() - i;
                            i = i8 - 1;
                         }else {
                            str = -1;
                         }
                         if (obj.m.get(i) == null) {
                            i = 0;
                         }else {
                            i = a1.e(obj.m.get(i).e);
                         }
                      }
                   }else {
                      p1 = i;
                      goto label_03d9 ;
                   }
                   i = i - i1;
                   i1 = i1 + obj.i.nextInt(i);
                   if (liveHeartPar.a() > 0) {
                      f = (float)i1 * 0x3f800000;
                      f = f / (float)liveHeartPar.a();
                      liveHeartPar.t = f;
                   }
                   f = liveHeartPar.t * 0.40f;
                   liveHeartPar.u = f;
                   float f1 = obj.i.nextFloat() * 0x3f333333;
                   f1 = f1 + 0.30f;
                   liveHeartPar.B = f1;
                   f1 = obj.getAlphaFactor() * 0x437f0000;
                   i = (int)f1;
                   liveHeartPar.z = i;
                   liveHeartPar.A = i;
                   i8 = 600;
                   i = obj.i.nextInt(i8) + i8;
                   liveHeartPar.h = i;
                }
                Objects.requireNonNull(liveHeartPar);
                objArray = null;
                if (PatchProxy.applyVoid(objArray, liveHeartPar, uoa, "4")) {
                   uoa1 = uoa;
                }else {
                   i = Math.min(liveHeartPar.j, liveHeartPar.k);
                   n1 = liveHeartPar.n;
                   uoa1 = uoa;
                   double d = (n1 < i)? -45.00f: 45.00f;
                   liveHeartPar.x = d;
                   double d1 = (n1 < i)? 45.00f: -45.00f;
                   liveHeartPar.w = d1;
                }
                if (obj.f == null) {
                   obj.f = liveHeartPar;
                   obj.g = liveHeartPar;
                }else {
                   obj.g.d = liveHeartPar;
                   obj.g = liveHeartPar;
                }
                i = p1;
                uoa = uoa1;
                LiveHeartParticleBubbleView liveHeartPar1 = 2;
             }
          }
          obj.removeCallbacks(obj);
          i0.k0(obj, obj);
       }
       b.b(obj, oobject);
       return;
    }
    public static void b(LiveHeartParticleBubbleView p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "2")) {
          return;
       }
       int i = (p0.f != null)? 1: 0;
       if (!i) {
          p1.setTag(R.id.like_bubble_anim_view, null);
          p1.removeView(p0);
       }else {
          p0.setDetachOnFinish(p1);
       }
       return;
    }
}
