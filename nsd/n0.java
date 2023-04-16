package nsd.n0;
import java.lang.Object;
import java.lang.Class;
import vsd.d;
import nsd.s;
import java.lang.String;
import kotlin.jvm.internal.FunctionReference;
import vsd.i;
import vsd.h;
import nsd.k0;
import kotlin.jvm.internal.MutablePropertyReference0;
import vsd.k;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import kotlin.jvm.internal.MutablePropertyReference2;
import vsd.m;
import kotlin.jvm.internal.PropertyReference0;
import vsd.o;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import kotlin.jvm.internal.PropertyReference2;
import vsd.q;
import kotlin.jvm.internal.Lambda;
import nsd.b0;
import java.lang.reflect.Type;
import vsd.s;
import java.util.List;
import nsd.u0;
import vsd.g;
import vsd.r;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KVariance;

public class n0	// class@001f72
{

    public void n0(){
       super();
    }
    public d a(Class p0){
       return new s(p0);
    }
    public d b(Class p0,String p1){
       return new s(p0);
    }
    public i c(FunctionReference p0){
       return p0;
    }
    public d d(Class p0){
       return new s(p0);
    }
    public d e(Class p0,String p1){
       return new s(p0);
    }
    public h f(Class p0,String p1){
       return new k0(p0, p1);
    }
    public k g(MutablePropertyReference0 p0){
       return p0;
    }
    public l h(MutablePropertyReference1 p0){
       return p0;
    }
    public m i(MutablePropertyReference2 p0){
       return p0;
    }
    public o j(PropertyReference0 p0){
       return p0;
    }
    public p k(PropertyReference1 p0){
       return p0;
    }
    public q l(PropertyReference2 p0){
       return p0;
    }
    public String m(Lambda p0){
       return this.n(p0);
    }
    public String n(b0 p0){
       String str = p0.getClass().getGenericInterfaces()[0].toString();
       if (str.startsWith("kotlin.jvm.functions.")) {
          str = str.substring(21);
       }
       return str;
    }
    public void o(s p0,List p1){
       p0.f(p1);
    }
    public r p(g p0,List p1,boolean p2){
       return new TypeReference(p0, p1, p2);
    }
    public s q(Object p0,String p1,KVariance p2,boolean p3){
       return new u0(p0, p1, p2, p3);
    }
}
