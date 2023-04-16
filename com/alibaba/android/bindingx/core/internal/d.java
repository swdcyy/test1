package com.alibaba.android.bindingx.core.internal.d;
import com.alibaba.android.bindingx.core.internal.d$k;
import com.alibaba.android.bindingx.core.internal.d$v;
import com.alibaba.android.bindingx.core.internal.d$h0;
import com.alibaba.android.bindingx.core.internal.d$z;
import com.alibaba.android.bindingx.core.internal.d$a0;
import com.alibaba.android.bindingx.core.internal.d$b0;
import com.alibaba.android.bindingx.core.internal.d$c0;
import com.alibaba.android.bindingx.core.internal.d$d0;
import com.alibaba.android.bindingx.core.internal.d$e0;
import com.alibaba.android.bindingx.core.internal.d$f0;
import com.alibaba.android.bindingx.core.internal.d$a;
import com.alibaba.android.bindingx.core.internal.d$b;
import com.alibaba.android.bindingx.core.internal.d$c;
import com.alibaba.android.bindingx.core.internal.d$d;
import com.alibaba.android.bindingx.core.internal.d$e;
import com.alibaba.android.bindingx.core.internal.d$f;
import com.alibaba.android.bindingx.core.internal.d$g;
import com.alibaba.android.bindingx.core.internal.d$h;
import com.alibaba.android.bindingx.core.internal.d$i;
import com.alibaba.android.bindingx.core.internal.d$j;
import com.alibaba.android.bindingx.core.internal.d$l;
import com.alibaba.android.bindingx.core.internal.d$m;
import com.alibaba.android.bindingx.core.internal.d$n;
import com.alibaba.android.bindingx.core.internal.d$o;
import com.alibaba.android.bindingx.core.internal.d$p;
import com.alibaba.android.bindingx.core.internal.d$q;
import com.alibaba.android.bindingx.core.internal.d$r;
import com.alibaba.android.bindingx.core.internal.d$s;
import com.alibaba.android.bindingx.core.internal.d$t;
import com.alibaba.android.bindingx.core.internal.d$u;
import com.alibaba.android.bindingx.core.internal.d$w;
import com.alibaba.android.bindingx.core.internal.d$x;
import com.alibaba.android.bindingx.core.internal.d$y;
import java.util.Map;
import java.lang.Object;
import com.alibaba.android.bindingx.core.internal.d$g0;
import java.util.Deque;
import java.util.Iterator;
import java.lang.Float;

public class d	// class@000e1e
{
    public static Object A;
    public static Object B;
    public static Object C;
    public static Object D;
    public static Object E;
    public static Object F;
    public static Object G;
    public static Object a;
    public static Object b;
    public static final d$h0 c;
    public static Object d;
    public static Object e;
    public static Object f;
    public static Object g;
    public static Object h;
    public static Object i;
    public static Object j;
    public static Object k;
    public static Object l;
    public static Object m;
    public static Object n;
    public static Object o;
    public static Object p;
    public static Object q;
    public static Object r;
    public static Object s;
    public static Object t;
    public static Object u;
    public static Object v;
    public static Object w;
    public static Object x;
    public static Object y;
    public static Object z;

    static {
       d.a = new d$k();
       d.b = new d$v();
       d.c = new d$h0(4);
       d.d = new d$z();
       d.e = new d$a0();
       d.f = new d$b0();
       d.g = new d$c0();
       d.h = new d$d0();
       d.i = new d$e0();
       d.j = new d$f0();
       d.k = new d$a();
       d.l = new d$b();
       d.m = new d$c();
       d.n = new d$d();
       d.o = new d$e();
       d.p = new d$f();
       d.q = new d$g();
       d.r = new d$h();
       d.s = new d$i();
       d.t = new d$j();
       d.u = new d$l();
       d.v = new d$m();
       d.w = new d$n();
       d.x = new d$o();
       d.y = new d$p();
       d.z = new d$q();
       d.A = new d$r();
       d.B = new d$s();
       d.C = new d$t();
       d.D = new d$u();
       d.E = new d$w();
       d.F = new d$x();
       d.G = new d$y();
    }
    public static void a(Map p0){
       p0.put("linear", d.a);
       p0.put("easeInQuad", d.d);
       p0.put("easeOutQuad", d.e);
       p0.put("easeInOutQuad", d.f);
       p0.put("easeInCubic", d.g);
       p0.put("easeOutCubic", d.h);
       p0.put("easeInOutCubic", d.i);
       p0.put("easeInQuart", d.j);
       p0.put("easeOutQuart", d.k);
       p0.put("easeInOutQuart", d.l);
       p0.put("easeInQuint", d.m);
       p0.put("easeOutQuint", d.n);
       p0.put("easeInOutQuint", d.o);
       p0.put("easeInSine", d.p);
       p0.put("easeOutSine", d.q);
       p0.put("easeInOutSine", d.r);
       p0.put("easeInExpo", d.s);
       p0.put("easeOutExpo", d.t);
       p0.put("easeInOutExpo", d.u);
       p0.put("easeInCirc", d.v);
       p0.put("easeOutCirc", d.w);
       p0.put("easeInOutCirc", d.x);
       p0.put("easeInElastic", d.y);
       p0.put("easeOutElastic", d.z);
       p0.put("easeInOutElastic", d.A);
       p0.put("easeInBack", d.B);
       p0.put("easeOutBack", d.C);
       p0.put("easeInOutBack", d.D);
       p0.put("easeInBounce", d.E);
       p0.put("easeOutBounce", d.F);
       p0.put("easeInOutBounce", d.G);
       p0.put("cubicBezier", d.b);
    }
    public static double b(double p0,double p1,double p2,double p3){
       return ((p2 - d.c((p3 - p0), 0, p2, p3)) + p1);
    }
    public static double c(double p0,double p1,double p2,double p3){
       p0 = p0 / p3;
       p3 = 7.56f;
       if (p0 - 0x3fd745d1745d1746 < 0) {
          p3 = (p3 * p0) * p0;
       }else if(p0 - 0x3fe745d1745d1746 < 0){
          p0 = p0 - 0x3fe1745d1745d174;
          p3 = (p3 * p0) * p0;
          p0 = 0x3fe8000000000000;
       }else if(p0 - 0x3fed1745d1745d17 < 0){
          p0 = p0 - 0x3fea2e8ba2e8ba2f;
          p3 = (p3 * p0) * p0;
          p0 = 0x3fee000000000000;
       }else {
          p0 = p0 - 0x3fee8ba2e8ba2e8c;
          p3 = (p3 * p0) * p0;
          p0 = 0x3fef800000000000;
       }
       p3 = p3 + p0;
       return ((p2 * p3) + p1);
    }
    public static d$g0 d(float p0,float p1,float p2,float p3){
       d$g0 og0;
       Iterator iterator = d.c.b().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          og0 = iterator.next();
          if (!Float.compare(og0.a, p0) && (!Float.compare(og0.c, p2) && (!Float.compare(og0.b, p1) && !Float.compare(og0.d, p3)))) {
             break ;
          }
       }
       return og0;
    }
}
