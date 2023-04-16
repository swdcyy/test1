package nsd.u0;
import vsd.s;
import nsd.u0$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.reflect.KVariance;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.lang.Class;
import vsd.r;
import nsd.m0;
import trd.t;

public final class u0 implements s	// class@001edf
{
    public List b;
    public final Object c;
    public final String d;
    public final KVariance e;
    public final boolean f;
    public static final u0$a g;

    static {
       u0.g = new u0$a(null);
    }
    public void u0(Object p0,String p1,KVariance p2,boolean p3){
       a.p(p1, "name");
       a.p(p2, "variance");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
    }
    public static void e(){
    }
    public boolean d(){
       return this.f;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof u0 && (a.g(this.c, p0.c) && a.g(this.getName(), p0.getName())))? true: false;
       return b;
    }
    public final void f(List p0){
       a.p(p0, "upperBounds");
       if (this.b != null) {
          throw new IllegalStateException("Upper bounds of type parameter \'"+this+"\' have already been initialized.".toString());
       }
       this.b = p0;
       return;
    }
    public String getName(){
       return this.d;
    }
    public List getUpperBounds(){
       u0 tb = this.b;
       if (tb != null) {
       }else {
          tb = t.k(m0.l(Object.class));
          this.b = tb;
       }
       return tb;
    }
    public int hashCode(){
       u0 tc = this.c;
       int i = (tc != null)? tc.hashCode(): 0;
       return ((i * 31) + (this.getName()).hashCode());
    }
    public KVariance m(){
       return this.e;
    }
    public String toString(){
       return u0.g.a(this);
    }
}
