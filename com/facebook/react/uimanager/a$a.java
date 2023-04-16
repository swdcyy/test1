package com.facebook.react.uimanager.a$a;
import com.facebook.react.uimanager.f$b;
import com.facebook.react.uimanager.a;
import java.lang.Object;
import gf.e;
import gf.b;
import ze.x;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.graphics.Rect;
import gf.h;
import gf.d;
import java.util.ArrayList;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.f;
import java.lang.Integer;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Double;
import java.lang.Number;
import java.lang.Math;

public class a$a implements f$b	// class@001336
{
    public e a;
    public b b;
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
       this.a = new e();
       this.b = new b();
    }
    public void a(x p0,boolean p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (this.c.a() && (!this.c.e.hasValue() && (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "3") && p1)))) {
          Rect rect1 = a.e(this.b);
          rect1.union(a.d(p0));
          this.b.b(rect1);
          a$a tb = this.b;
          tb.e = tb.c * tb.d;
          tb.g = tb.g + (a.c() - a.c());
       }
    label_0067 :
       if (this.c.a() && (!this.c.d.hasValue() && (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "4")))) {
          long l = a.c();
          if (this.c.a.a.contains(p0.getViewClass())) {
             a$a tc = this.c;
             if (p0.getRootTag() == tc.c) {
                UIManagerModule uIManagerMod = tc.b();
                if (uIManagerMod != null) {
                   x ox = uIManagerMod.getUIImplementation().x(p0.getRootTag());
                   if (ox != null) {
                      e uoe = new e();
                      Rect rect = new Rect();
                      if (rect.setIntersect(a.d(p0), new Rect(0, 0, (int)ox.getLayoutWidth(), (int)ox.getLayoutHeight()))) {
                         uoe.m = p0.getReactTag();
                         uoe.e = p0.getViewClass();
                         uoe.b(rect);
                      }
                      if (this.a.d(uoe)) {
                         p0.n = true;
                      }
                      a$a ta = this.a;
                      ta.g = ta.g + (a.c() - l);
                   }
                }
             }
          }
       }
       return;
    }
    public void b(x p0,int p1){
       a d;
       boolean b;
       long l2;
       b uob = this;
       Object obj = p0;
       String str = "2";
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidTwoRefs(obj, Integer.valueOf(p1), uob, a$a.class, str)) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(obj, uob, a$a.class, "5")) {
          long l1 = a.c();
          if (uob.b.hasValue()) {
             int i = 0;
             Rect rect = a.e(uob.b);
             rect.setIntersect(rect, new Rect(i, i, (int)p0.getLayoutWidth(), (int)p0.getLayoutHeight()));
             a$a b1 = uob.b;
             Rect left = rect.left;
             b1.a = left;
             Rect top = rect.top;
             b1.b = top;
             int i1 = rect.right - left;
             b1.c = i1;
             int i2 = rect.bottom - top;
             b1.d = i2;
             b1.e = i1 * i2;
             a e = uob.c.e;
             Objects.requireNonNull(e);
             Object obj1 = PatchProxy.applyOneRefs(b1, e, b.class, "1");
             if (obj1 != PatchProxyResult.class) {
                i = obj1.booleanValue();
                l2 = l1;
             }else {
                double d1 = 0x3ff0000000000000;
                if (e.h) {
                   l2 = l1;
                   double d2 = (double)(a.c() - e.h);
                   if (PatchProxy.isSupport(b.class)) {
                      Object obj2 = PatchProxy.applyOneRefs(Double.valueOf(d2), null, b.class, "4");
                      if (obj2 != PatchProxyResult.class) {
                         d1 = obj2.doubleValue();
                      }
                   }
                   d1 = ((d1 / Math.sqrt(0x41239cb4f3eb2d62)) * Math.exp(((- Math.pow((d2 - 242.00f), 2.00f)) / 0x4108f89000000000))) / 0x3f4b4008a8dba6a3;
                }else {
                   l2 = l1;
                }
                if (((double)b1.e * d1) - (double)e.e > 0) {
                   if (!PatchProxy.applyVoidOneRefs(b1, e, b.class, str)) {
                      e.a = b1.a;
                      e.b = b1.b;
                      e.c = b1.c;
                      e.d = b1.d;
                      e.e = b1.e;
                      if (!e.f) {
                         e.h = a.c();
                      }
                      e.f = a.c();
                   }
                   e.e = (int)((double)b1.e * d1);
                   i = true;
                }
             }
             if (i) {
                uob.c.e.k = true;
             }
             d = uob.c.e;
             d.g = d.g + (uob.a.g + (a.c() - l2));
             uob.b = new b();
          }
       }
       if (!PatchProxy.applyVoidOneRefs(obj, uob, a$a.class, "6")) {
          long l = a.c();
          if (uob.a.hasValue()) {
             if (uob.c.d.hasValue()) {
                UIManagerModule uIManagerMod = uob.c.b();
                if (uIManagerMod != null) {
                   if (uIManagerMod.getUIImplementation().x(uob.c.d.m) == null) {
                      uob.c.d.c(uob.a);
                      uob.c.d.n = true;
                   }else {
                      b = true;
                      if (uob.c.d.d(uob.a)) {
                         uob.c.d.n = b;
                      }
                   }
                }
             }else {
                b = true;
                if (uob.c.d.d(uob.a)) {
                   uob.c.d.n = b;
                }
             }
             d = uob.c.d;
             d.g = d.g + (uob.a.g + (a.c() - l));
             uob.a = new e();
          }
       }
       return;
    }
    public void c(x p0){
    }
}
