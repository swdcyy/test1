package com.yxcorp.gifshow.decoration.widget.g;
import android.content.Context;
import com.yxcorp.gifshow.decoration.widget.g$a;
import java.lang.Object;
import android.view.ViewConfiguration;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;

public class g	// class@0012c4
{
    public final Context a;
    public final g$a b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public long k;
    public long l;
    public boolean m;
    public float n;
    public int o;
    public float p;
    public float q;
    public int r;

    public void g(Context p0,g$a p1){
       super();
       this.a = p0;
       this.b = p1;
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
       this.r = viewConfigur.getScaledTouchSlop() * viewConfigur.getScaledTouchSlop();
       this.o = viewConfigur.getScaledTouchSlop() * 2;
    }
    public float a(){
       return (this.c - this.e);
    }
    public float b(){
       return (this.d - this.f);
    }
    public float c(){
       return (this.i - this.j);
    }
    public float d(){
       g th = this.h;
       float f = (th > 0)? this.g / th: 0x3f800000;
       return f;
    }
    public boolean e(MotionEvent p0){
       float f7;
       float f8;
       long l = this;
       Object obj = p0;
       Object obj1 = PatchProxy.applyOneRefs(obj, l, g.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       l.k = p0.getEventTime();
       int actionMasked = p0.getActionMasked();
       int pointerCount = p0.getPointerCount();
       boolean b = false;
       boolean b1 = true;
       int i = (actionMasked == b1 || actionMasked == 3)? 1: 0;
       g og = (!actionMasked)? 1: null;
       if (og || i) {
          if (l.m != null) {
             l.b.e(l);
             l.m = b;
          }
          if (i) {
             return b1;
          }
       }
       i = 6;
       og = (actionMasked && (actionMasked == i || actionMasked == 5))? 1: 0;
       i = (actionMasked == i)? 1: 0;
       int actionIndex = (i)? p0.getActionIndex(): -1;
       i = (i)? pointerCount - 1: pointerCount;
       int i1 = 0;
       float f = 0;
       float f1 = 0;
       while (i1 < pointerCount) {
          if (actionIndex != i1) {
             f = f + obj.getX(i1);
             f1 = f1 + obj.getY(i1);
          }
          i1 = i1 + 1;
       }
       float f2 = (float)i;
       f = f / f2;
       f1 = f1 / f2;
       i1 = 0;
       float f3 = 0;
       float f4 = 0;
       while (i1 < pointerCount) {
          if (actionIndex != i1) {
             float f5 = obj.getX(i1) - f;
             f3 = f3 + Math.abs(f5);
             f5 = obj.getY(i1) - f1;
             f4 = f4 + Math.abs(f5);
          }
          i1 = i1 + 1;
       }
       float f6 = (float)Math.hypot((double)((f3 / f2) * 2.00f), (double)((f4 / f2) * 2.00f));
       i = 0;
       while (true) {
          if (i < pointerCount) {
             if (actionIndex != i) {
                int i2 = i + 1;
                while (true) {
                   if (i2 < pointerCount) {
                      if (actionIndex == i2) {
                         i2 = i2 + 1;
                      }else {
                         f3 = f;
                         f7 = f6;
                         f8 = (float)((double)0 + ((Math.toDegrees(Math.atan2((double)(obj.getY(i) - obj.getY(i2)), (double)(obj.getX(i) - obj.getX(i2)))) + 360.00f) % 360.00f));
                      label_00f4 :
                         g m = l.m;
                         if (m != null && og) {
                            l.b.e(l);
                            l.m = false;
                         }
                         float f9 = f7;
                         if (og) {
                            l.g = f9;
                            l.h = f9;
                            l.n = f9;
                            l.c = f3;
                            l.e = f3;
                            l.p = f3;
                            l.d = f1;
                            l.f = f1;
                            l.q = f1;
                            l.i = f8;
                            l.j = f8;
                         }
                         if (l.m == null && (m == null && (Math.abs((f9 - l.n)) - (float)l.o > 0 || (Math.pow((double)(l.c - l.p), 2.00f) + Math.pow((double)(l.d - l.q), 2.00f)) - (double)l.r > 0))) {
                            l.g = f9;
                            l.h = f9;
                            l.l = l.k;
                            l.c = f3;
                            l.e = f3;
                            l.d = f1;
                            l.f = f1;
                            l.i = f8;
                            l.j = f8;
                            l.m = l.b.b(l);
                         }
                         if (actionMasked == 2) {
                            l.g = f9;
                            l.c = f3;
                            l.d = f1;
                            l.i = f8;
                            if (l.m != null) {
                               if (this.d() - 0x3f800000) {
                                  l.b.a(l);
                               }
                               if (this.c()) {
                                  l.b.d(l);
                               }
                               if (this.a() || this.b()) {
                                  l.b.c(l);
                               }
                            }
                            l.h = l.g;
                            l.e = l.c;
                            l.f = l.d;
                            l.j = l.i;
                            l.l = l.k;
                            break ;
                         }
                         break ;
                      }
                   }
                }
                return true;
             }
             f7 = f6;
             f3 = f;
             i = i + 1;
             f = f3;
             f6 = f7;
             double d = 0;
          }else {
             f7 = f6;
             f3 = f;
             f8 = 0;
             goto label_00f4 ;
          }
       }
    }
}
