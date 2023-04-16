package nsd.m0;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import nsd.n0;
import vsd.d;
import vsd.t;
import vsd.r;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import vsd.g;
import java.util.Collections;
import kotlin.reflect.KVariance;
import vsd.s;
import kotlin.jvm.internal.FunctionReference;
import vsd.i;
import vsd.h;
import kotlin.jvm.internal.MutablePropertyReference0;
import vsd.k;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import kotlin.jvm.internal.MutablePropertyReference2;
import vsd.m;
import java.util.Arrays;
import kotlin.jvm.internal.PropertyReference0;
import vsd.o;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import kotlin.jvm.internal.PropertyReference2;
import vsd.q;
import kotlin.jvm.internal.Lambda;
import nsd.b0;

public class m0	// class@001f71
{
    public static final n0 a;
    public static final d[] b;

    static {
       n0 on0;
       int i = 0;
       try{
          on0 = Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
       }catch(java.lang.ClassCastException e0){
       }catch(java.lang.ClassNotFoundException e0){
       }catch(java.lang.InstantiationException e0){
       }catch(java.lang.IllegalAccessException e0){
       }
       if (e0 == null) {
          on0 = new n0();
       }
       m0.a = e0;
       d[] uodArray = new d[0];
       m0.b = uodArray;
    }
    public void m0(){
       super();
    }
    public static r A(Class p0,t[] p1){
       return m0.a.p(m0.d(p0), ArraysKt___ArraysKt.uy(p1), false);
    }
    public static r B(g p0){
       return m0.a.p(p0, Collections.emptyList(), false);
    }
    public static s C(Object p0,String p1,KVariance p2,boolean p3){
       return m0.a.q(p0, p1, p2, p3);
    }
    public static d a(Class p0){
       return m0.a.a(p0);
    }
    public static d b(Class p0,String p1){
       return m0.a.b(p0, p1);
    }
    public static i c(FunctionReference p0){
       return m0.a.c(p0);
    }
    public static d d(Class p0){
       return m0.a.d(p0);
    }
    public static d e(Class p0,String p1){
       return m0.a.e(p0, p1);
    }
    public static d[] f(Class[] p0){
       int len = p0.length;
       if (!len) {
          return m0.b;
       }
       d[] uodArray = new d[len];
       for (int i = 0; i < len; i = i + 1) {
          uodArray[i] = m0.d(p0[i]);
       }
       return uodArray;
    }
    public static h g(Class p0){
       return m0.a.f(p0, "");
    }
    public static h h(Class p0,String p1){
       return m0.a.f(p0, p1);
    }
    public static k i(MutablePropertyReference0 p0){
       return m0.a.g(p0);
    }
    public static l j(MutablePropertyReference1 p0){
       return m0.a.h(p0);
    }
    public static m k(MutablePropertyReference2 p0){
       return m0.a.i(p0);
    }
    public static r l(Class p0){
       return m0.a.p(m0.d(p0), Collections.emptyList(), true);
    }
    public static r m(Class p0,t p1){
       return m0.a.p(m0.d(p0), Collections.singletonList(p1), true);
    }
    public static r n(Class p0,t p1,t p2){
       t[] otArray = new t[]{p1,p2};
       return m0.a.p(m0.d(p0), Arrays.asList(otArray), 1);
    }
    public static r o(Class p0,t[] p1){
       return m0.a.p(m0.d(p0), ArraysKt___ArraysKt.uy(p1), true);
    }
    public static r p(g p0){
       return m0.a.p(p0, Collections.emptyList(), true);
    }
    public static o q(PropertyReference0 p0){
       return m0.a.j(p0);
    }
    public static p r(PropertyReference1 p0){
       return m0.a.k(p0);
    }
    public static q s(PropertyReference2 p0){
       return m0.a.l(p0);
    }
    public static String t(Lambda p0){
       return m0.a.m(p0);
    }
    public static String u(b0 p0){
       return m0.a.n(p0);
    }
    public static void v(s p0,r p1){
       m0.a.o(p0, Collections.singletonList(p1));
    }
    public static void w(s p0,r[] p1){
       m0.a.o(p0, ArraysKt___ArraysKt.uy(p1));
    }
    public static r x(Class p0){
       return m0.a.p(m0.d(p0), Collections.emptyList(), false);
    }
    public static r y(Class p0,t p1){
       return m0.a.p(m0.d(p0), Collections.singletonList(p1), false);
    }
    public static r z(Class p0,t p1,t p2){
       t[] otArray = new t[]{p1,p2};
       return m0.a.p(m0.d(p0), Arrays.asList(otArray), 0);
    }
}
