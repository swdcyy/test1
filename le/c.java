package le.c;
import com.facebook.react.modules.core.a$a;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import le.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import vd.c;
import java.lang.Integer;
import java.util.List;
import od.a;
import le.c$a;
import java.lang.Number;
import java.lang.System;
import java.util.TreeMap;
import com.facebook.react.modules.core.a;

public class c extends a$a	// class@00254d
{
    public a c;
    public final ReactContext d;
    public final UIManagerModule e;
    public final a f;
    public boolean g;
    public long h;
    public long i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public TreeMap o;
    public int p;
    public int q;
    public int r;
    public int s;
    public List t;
    public List u;

    public void c(ReactContext p0){
       super();
       this.g = false;
       this.h = -1;
       this.i = -1;
       this.j = 0;
       this.k = 0;
       this.l = 0;
       this.m = 0;
       this.n = false;
       this.p = 0;
       this.q = 0;
       this.r = 0;
       this.s = 0;
       this.t = new ArrayList();
       this.u = new ArrayList();
       this.d = p0;
       this.e = p0.getNativeModule(UIManagerModule.class);
       this.f = new a();
    }
    public void a(long p0){
       boolean b;
       int i1;
       boolean i2;
       double d2;
       double d3;
       double d4;
       double d5;
       c c;
       float f1;
       long l = this;
       long l1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), l, uoc, "1")) {
          return;
       }
       if (l.g != null) {
          return;
       }
       c uoc1 = -1;
       if (!l.h - uoc1) {
          l.h = l1;
       }
       c i = l.i;
       l.i = l1;
       c f = l.f;
       a uoa = a.class;
       _monitor_enter(f);
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(i), Long.valueOf(p0), f, uoa, "5");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
             _monitor_exit(f);
          label_00bc :
             if (b) {
                l.m = l.m + 1;
                i1 = 1;
             }else {
                i1 = 0;
             }
             l.j = l.j + 1;
             if (!i - uoc1) {
                i = l1;
             }
             uoc1 = l.h;
             i2 = 0;
             Integer integer = Integer.valueOf(i2);
             int i3 = 4;
             if (PatchProxy.isSupport(uoc)) {
                Object[] objArray = new Object[]{Long.valueOf(uoc1),Long.valueOf(i),Long.valueOf(p0),Integer.valueOf(1),Integer.valueOf(i1)};
                if (!PatchProxy.applyVoid(objArray, l, uoc, "2")) {
                label_010a :
                   f1 = 1000000000.00f;
                   int i7 = (int)((float)(l1 - uoc1) / f1);
                   for (b = (int)((float)(i - uoc1) / f1); b < i7; b = b + 1) {
                      l.t.add(integer);
                      l.u.add(integer);
                   }
                   if (l.t.size() <= i7) {
                      l.t.add(Integer.valueOf(1));
                      l.u.add(Integer.valueOf(i1));
                   }else {
                      c t = l.t;
                      t.set(i7, Integer.valueOf((t.get(i7).intValue() + 1)));
                      t = l.u;
                      t.set(i7, Integer.valueOf((t.get(i7).intValue() + i1)));
                   }
                }
             }else {
                goto label_010a ;
             }
             l1 = (l1 - i) / 0xf4240;
             double d = (double)l1;
             uoc1 = 0x405f000000000000;
             if (d - 0x4055000000000000 > 0 && d - uoc1 < 0) {
                l.p = l.p + 1;
                l.q = (int)((long)l.q + l1);
             }else if(d - uoc1 > 0 && l1 - 0x7fffffff < 0){
                l.r = l.r + 1;
                l.s = (int)((long)l.s + l1);
             }
             int i4 = this.c();
             if (((i4 - l.k) - 1) >= i3) {
                l.l = l.l + 1;
             }
             if (l.n != null) {
                a.c(l.o);
                int i5 = this.d();
                int i6 = this.e();
                i = l.l;
                Object obj1 = PatchProxy.apply(null, l, uoc, "6");
                double d1 = 1000000000.00f;
                if (obj1 != patchProxyRe) {
                   d2 = obj1.doubleValue();
                }else if(!l.i - l.h){
                   d3 = 0;
                label_01f5 :
                   Object obj2 = PatchProxy.apply(null, l, uoc, "7");
                   if (obj2 != patchProxyRe) {
                      d4 = obj2.doubleValue();
                   }else if(!l.i - l.h){
                      d5 = 0;
                   label_0220 :
                      c$a uoa1 = new c$a(i5, i6, i4, i, d3, d5, this.f());
                      l.o.put(Long.valueOf(System.currentTimeMillis()), v3);
                   }else {
                      d4 = ((double)this.e() * d1) / (double)(l.i - l.h);
                   }
                   d5 = d4;
                   goto label_0220 ;
                }else {
                   d2 = ((double)this.d() * d1) / (double)(l.i - l.h);
                }
                d3 = d2;
                goto label_01f5 ;
             }
             l.k = i4;
             c = l.c;
             if (c != null) {
                c.b(l);
             }
             return;
          }
       }
       i2 = a.e(f.d, i, l1);
       if (PatchProxy.isSupport(uoa)) {
          Object obj3 = PatchProxy.applyTwoRefs(Long.valueOf(i), Long.valueOf(p0), f, uoa, "8");
          if (obj3 != patchProxyRe) {
             b = obj3.booleanValue();
          }else {
          label_0076 :
             long l2 = a.d(f.a, i, l1);
             long l3 = a.d(f.b, i, l1);
             if (!l2 - uoc1 && !l3 - uoc1) {
                uoa = f.e;
             }else if(l2 - l3 > 0){
                b = true;
             }else {
                b = false;
             }
          }
       }else {
          goto label_0076 ;
       }
       f1 = (i2 || (b && !a.e(f.c, i, l1)))? 1: 0;
       a.c(f.a, l1);
       a.c(f.b, l1);
       a.c(f.c, l1);
       a.c(f.d, l1);
       f.e = b;
       _monitor_exit(f);
       b = f1;
       goto label_00bc ;
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)(((double)this.f() / 16.90f) + 0x3ff0000000000000);
    }
    public int d(){
       return (this.j - 1);
    }
    public int e(){
       return (this.m - 1);
    }
    public int f(){
       return (int)(((double)this.i - (double)this.h) / 1000000.00f);
    }
}
