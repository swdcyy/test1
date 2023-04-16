package com.yxcorp.gifshow.camera.record.intelligentidentify.ui.FlashPointsView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.FlashPointsView$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Random;
import android.graphics.Canvas;
import java.util.List;
import java.lang.System;
import java.util.ArrayList;
import android.graphics.Point;
import java.lang.Boolean;
import java.util.Iterator;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.FlashPointsView$c;
import java.lang.Math;
import xyb.a;
import q87.c;
import java.util.Objects;
import java.lang.Long;
import android.graphics.Paint;
import java.lang.Runnable;
import vd9.a;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.FlashPointsView$b;

public class FlashPointsView extends View	// class@000e06
{
    public List b;
    public Random c;
    public Paint d;
    public boolean e;
    public FlashPointsView$b f;
    public long g;
    public Runnable h;
    public static int i = 2500;
    public static int j = 300;

    public void FlashPointsView(Context p0){
       super(p0, null, -1);
    }
    public void FlashPointsView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void FlashPointsView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = 0;
       this.h = new FlashPointsView$a(this);
    }
    public final int a(int p0,int p1){
       int i;
       if (PatchProxy.isSupport(FlashPointsView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FlashPointsView.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       do {
          i = this.c.nextInt(p1);
       } while (i >= p0);
       return i;
    }
    public void onDraw(Canvas p0){
       FlashPointsView b;
       Iterator iterator;
       int i;
       FlashPointsView$c uoc1;
       Iterator iterator1;
       FlashPointsView uFlashPoints;
       Point obj1;
       int b2;
       Long longx;
       boolean b3;
       Object obj2;
       int i2;
       FlashPointsView$c a;
       float f;
       float f1;
       float f2;
       long l2;
       boolean b4;
       int i6;
       int i7;
       int i8;
       List list = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, list, FlashPointsView.class, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, list, FlashPointsView.class, "2")) {
          b = list.b;
          if (b == null || (b.size() > 0 || (this.getWidth() && this.getHeight()))) {
             i = (list.e != null)? 50: 80;
             long l4 = System.currentTimeMillis();
             list.b = new ArrayList(i);
             int i3 = this.getWidth() / 7;
             int i4 = i3 * 6;
             b2 = this.getHeight() / 6;
             i2 = b2 * 5;
             FlashPointsView$c uoc2 = null;
             while (uoc2 < i) {
                obj1 = new Point();
                int i5 = 10;
                while (true) {
                   obj1.x = list.a(i3, i4);
                   obj1.y = list.a(b2, i2);
                   String obj4 = PatchProxy.applyOneRefs(obj1, list, FlashPointsView.class, "6");
                   if (obj4 != PatchProxyResult.class) {
                      b4 = obj4.booleanValue();
                      uoc1 = uoc2;
                      i6 = b2;
                      i7 = i2;
                      i8 = i4;
                   label_00e6 :
                      if (!b4) {
                         i5 = i5 - 1;
                         if (i5 > 0) {
                            uoc2 = uoc1;
                            b2 = i6;
                            i2 = i7;
                            i4 = i8;
                            obj4 = null;
                         }
                      }
                      if (!i5) {
                         Object[] objArray = new Object[0];
                         a.D().w("FlashPoints", "Cannot find enough valid point", objArray);
                      }else {
                         FlashPointsView$c uoc3 = uoc1;
                         FlashPointsView$c uoc4 = new FlashPointsView$c(this, l4, uoc3, obj1);
                         list.b.add(v12);
                         uoc2 = uoc3 + 1;
                         b2 = i6;
                         i2 = i7;
                         i4 = i8;
                         i3 = i3;
                         obj4 = null;
                      }
                   }else {
                      iterator = list.b.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            FlashPointsView$c uoc5 = iterator.next();
                            uoc1 = uoc2;
                            int i9 = obj1.x - uoc5.a.x;
                            i6 = b2;
                            double d3 = (double)i9;
                            i7 = i2;
                            i2 = obj1.y - uoc5.a.y;
                            i8 = i4;
                            d3 = Math.pow(d3, 2.00f) + Math.pow((double)i2, 2.00f);
                            if (Math.abs(d3) - (double)FlashPointsView.i <= 0) {
                               b4 = false;
                               goto label_00e6 ;
                            }else {
                               uoc2 = uoc1;
                               b2 = i6;
                               i2 = i7;
                               i4 = i8;
                            }
                         }else {
                            uoc1 = uoc2;
                            i6 = b2;
                            i7 = i2;
                            i8 = i4;
                            b4 = true;
                            goto label_00e6 ;
                         }
                      }
                   }
                }
             }
          }
       }
       b = list.b;
       if (b == null || !b.size()) {
          return;
       }else {
          long l = System.currentTimeMillis();
          iterator = list.b.iterator();
          i = 0;
          while (iterator.hasNext()) {
             boolean b1 = iterator.next();
             FlashPointsView d = list.d;
             Objects.requireNonNull(b1);
             FlashPointsView$c uoc = FlashPointsView$c.class;
             if (PatchProxy.isSupport(uoc)) {
                uoc1 = uoc;
                iterator1 = iterator;
                uFlashPoints = d;
                obj1 = PatchProxy.applyThreeRefs(p0, Long.valueOf(l), d, b1, FlashPointsView$c.class, "1");
                if (obj1 != PatchProxyResult.class) {
                   b2 = obj1.booleanValue();
                   longx = 1;
                }else {
                label_018e :
                   long l1 = 0;
                   if (PatchProxy.isSupport(uoc1)) {
                      uoc = uoc1;
                      obj1 = PatchProxy.applyOneRefs(Long.valueOf(l), b1, uoc, "5");
                      if (obj1 != PatchProxyResult.class) {
                         b3 = obj1.booleanValue();
                      }else if(l - b1.a() < 0){
                         d = b1.k.g;
                         if (!d - l1) {
                            obj2 = PatchProxy.apply(null, b1, uoc, "7");
                            if (obj2 != PatchProxyResult.class) {
                               l2 = obj2.longValue();
                            }else {
                               l2 = b1.a() + 400;
                               l2 = l2 + (long)b1.f;
                               l2 = l2 + 300;
                            }
                            if (l - l2 >= 0) {
                            label_01f1 :
                               b3 = false;
                            }
                         }else if(b1.i == null){
                            goto label_01f1 ;
                         }else {
                            long l3 = l - d;
                            if (l3 - (long)FlashPointsView.j > 0) {
                            }
                         }
                         b3 = true;
                      }
                   }else {
                      uoc = uoc1;
                      goto label_01ae ;
                   }
                   if (!b3) {
                      if (b1.i != null && b1.k.e == null) {
                         int i1 = b1.j + 1;
                         b1.j = i1;
                      }else {
                         longx = 1;
                      }
                      b1.i = false;
                      b2 = false;
                   }else {
                      b1.i = true;
                      if (!b1.k.g - false || (!b1.h - null && (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), b1, uoc, "4")))) {
                         f1 = b1.b(l) * b1.d;
                         b1.g = f1;
                         f1 = b1.b(l) * (float)b1.e;
                         b1.h = f1;
                      }
                   label_0249 :
                      FlashPointsView d1 = b1.k.d;
                      if (PatchProxy.isSupport(uoc)) {
                         obj2 = PatchProxy.applyOneRefs(Long.valueOf(l), b1, uoc, "2");
                         if (obj2 != PatchProxyResult.class) {
                            i2 = obj2.intValue();
                         label_027e :
                            d1.setAlpha(i2);
                            a = b1.a;
                            f = (float)a.x;
                            f1 = (float)a.y;
                            if (PatchProxy.isSupport(uoc)) {
                               Object obj3 = PatchProxy.applyOneRefs(Long.valueOf(l), b1, uoc, "3");
                               if (obj3 != PatchProxyResult.class) {
                                  f2 = obj3.floatValue();
                               label_02b8 :
                                  obj.drawCircle(f, f1, f2, uFlashPoints);
                                  b2 = true;
                               }
                            }
                            f2 = b1.c(l);
                            float f3 = (!b1.k.g - null)? (float)b1.e: b1.h;
                            f2 = f2 * f3;
                            goto label_02b8 ;
                         }
                      }
                      f = b1.c(l);
                      FlashPointsView$c d2 = (!b1.k.g - null)? b1.d: b1.g;
                      f = f * d2;
                      f = f * 0x437f0000;
                      i2 = (int)f;
                      goto label_027e ;
                   }
                }
             }else {
                uoc1 = uoc;
                iterator1 = iterator;
                uFlashPoints = d;
                goto label_018e ;
             }
             if (b2) {
                i = 1;
             }
             list = this;
             iterator = iterator1;
          }
          b = this;
          if (!i) {
             b.removeCallbacks(b.h);
             FlashPointsView f4 = b.f;
             if (f4 != null) {
                b.post(new a(b, f4));
                b.f = null;
             }
          }
          return;
       }
    }
    public void setEndCallBack(FlashPointsView$b p0){
       this.f = p0;
    }
}
