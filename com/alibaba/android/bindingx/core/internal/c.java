package com.alibaba.android.bindingx.core.internal.c;
import com.alibaba.android.bindingx.core.internal.c$k;
import com.alibaba.android.bindingx.core.internal.c$s;
import com.alibaba.android.bindingx.core.internal.c$t;
import com.alibaba.android.bindingx.core.internal.c$u;
import com.alibaba.android.bindingx.core.internal.c$v;
import com.alibaba.android.bindingx.core.internal.c$w;
import com.alibaba.android.bindingx.core.internal.c$x;
import com.alibaba.android.bindingx.core.internal.c$y;
import com.alibaba.android.bindingx.core.internal.c$z;
import com.alibaba.android.bindingx.core.internal.c$a;
import com.alibaba.android.bindingx.core.internal.c$b;
import com.alibaba.android.bindingx.core.internal.c$c;
import com.alibaba.android.bindingx.core.internal.c$d;
import com.alibaba.android.bindingx.core.internal.c$e;
import com.alibaba.android.bindingx.core.internal.c$f;
import com.alibaba.android.bindingx.core.internal.c$g;
import com.alibaba.android.bindingx.core.internal.c$h;
import com.alibaba.android.bindingx.core.internal.c$i;
import com.alibaba.android.bindingx.core.internal.c$j;
import java.lang.Double;
import com.alibaba.android.bindingx.core.internal.c$l;
import com.alibaba.android.bindingx.core.internal.c$m;
import com.alibaba.android.bindingx.core.internal.c$n;
import com.alibaba.android.bindingx.core.internal.c$o;
import com.alibaba.android.bindingx.core.internal.c$p;
import android.animation.ArgbEvaluator;
import com.alibaba.android.bindingx.core.internal.c$q;
import com.alibaba.android.bindingx.core.internal.c$r;
import java.util.Map;
import java.lang.Object;
import x5.i$c;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Color;
import java.lang.IllegalArgumentException;

public class c	// class@000dfb
{
    public static ArgbEvaluator A;
    public static Object B;
    public static Object C;
    public static Object a;
    public static Object b;
    public static Object c;
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
       c.a = new c$k();
       c.b = new c$s();
       c.c = new c$t();
       c.d = new c$u();
       c.e = new c$v();
       c.f = new c$w();
       c.g = new c$x();
       c.h = new c$y();
       c.i = new c$z();
       c.j = new c$a();
       c.k = new c$b();
       c.l = new c$c();
       c.m = new c$d();
       c.n = new c$e();
       c.o = new c$f();
       c.p = new c$g();
       c.q = new c$h();
       c.r = new c$i();
       c.s = new c$j();
       c.t = Double.valueOf(0x400921fb54442d18);
       c.u = Double.valueOf(0x4005bf0a8b145769);
       c.v = new c$l();
       c.w = new c$m();
       c.x = new c$n();
       c.y = new c$o();
       c.z = new c$p();
       c.A = new ArgbEvaluator();
       c.B = new c$q();
       c.C = new c$r();
    }
    public static void a(Map p0,double p1,double p2,double p3,double p4,double p5,double p6,double p7,double p8,double p9){
       p0.put("alpha", Double.valueOf(p1));
       p0.put("beta", Double.valueOf(p2));
       p0.put("gamma", Double.valueOf(p3));
       p0.put("dalpha", Double.valueOf((p1 - p4)));
       p0.put("dbeta", Double.valueOf((p2 - p5)));
       p0.put("dgamma", Double.valueOf((p3 - p6)));
       p0.put("x", Double.valueOf(p7));
       p0.put("y", Double.valueOf(p8));
       p0.put("z", Double.valueOf(p9));
    }
    public static void b(Map p0,double p1,double p2,double p3,double p4,double p5,double p6,i$c p7){
       i$c uoc = p7;
       Object[] objArray = new Object[0];
       p0.put("x", Double.valueOf(uoc.b(p1, objArray)));
       objArray = new Object[0];
       p0.put("y", Double.valueOf(uoc.b(p2, objArray)));
       objArray = new Object[0];
       p0.put("dx", Double.valueOf(uoc.b(p3, objArray)));
       objArray = new Object[0];
       p0.put("dy", Double.valueOf(uoc.b(p4, objArray)));
       objArray = new Object[0];
       p0.put("tdx", Double.valueOf(uoc.b(p5, objArray)));
       Object[] objArray1 = new Object[0];
       p0.put("tdy", Double.valueOf(uoc.b(p6, objArray1)));
       p0.put("internal_x", Double.valueOf(p1));
       p0.put("internal_y", Double.valueOf(p2));
    }
    public static void c(Map p0,double p1){
       p0.put("t", Double.valueOf(p1));
    }
    public static void d(Map p0){
       p0.put("sin", c.a);
       p0.put("cos", c.b);
       p0.put("tan", c.c);
       p0.put("asin", c.d);
       p0.put("acos", c.e);
       p0.put("atan", c.f);
       p0.put("atan2", c.g);
       p0.put("pow", c.h);
       p0.put("exp", c.i);
       p0.put("sqrt", c.j);
       p0.put("cbrt", c.k);
       p0.put("log", c.l);
       p0.put("abs", c.m);
       p0.put("sign", c.n);
       p0.put("ceil", c.o);
       p0.put("floor", c.p);
       p0.put("round", c.q);
       p0.put("max", c.r);
       p0.put("min", c.s);
       p0.put("PI", c.t);
       p0.put("E", c.u);
       p0.put("translate", c.v);
       p0.put("scale", c.w);
       p0.put("matrix", c.x);
       p0.put("rgb", c.y);
       p0.put("rgba", c.z);
       p0.put("evaluateColor", c.B);
       p0.put("asArray", c.C);
    }
    public static void e(Map p0,double p1,double p2,i$c p3){
       Object[] objArray = new Object[0];
       p0.put("x", Double.valueOf(p3.b(p1, objArray)));
       Object[] objArray1 = new Object[0];
       p0.put("y", Double.valueOf(p3.b(p2, objArray1)));
       p0.put("internal_x", Double.valueOf(p1));
       p0.put("internal_y", Double.valueOf(p2));
    }
    public static int f(String p0){
       int i;
       if (TextUtils.isEmpty(p0)) {
          throw new IllegalArgumentException("Unknown color");
       }
       if (p0.startsWith("\'") || p0.startsWith("\"")) {
          i = 1;
          p0 = p0.substring(i, (p0.length() - i));
       }
       int i1 = Color.parseColor(p0);
       i = Color.red(i1);
       int i2 = Color.green(i1);
       return Color.argb(255, i, i2, Color.blue(i1));
    }
}
