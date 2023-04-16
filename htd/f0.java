package htd.f0;
import htd.f0$b;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import htd.f0$a;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.StringBuilder;

public final class f0	// class@000fc8
{
    public final Object a;
    public static final f0$b b;

    static {
       f0.b = new f0$b(null);
    }
    public void f0(Object p0){
       super();
       this.a = p0;
    }
    public static final f0 a(Object p0){
       return new f0(p0);
    }
    public static void b(){
    }
    public static Object c(Object p0){
       return p0;
    }
    public static boolean d(Object p0,Object p1){
       if (p1 instanceof f0 && a.g(p0, p1.l())) {
          return true;
       }
       return false;
    }
    public static final boolean e(Object p0,Object p1){
       return a.g(p0, p1);
    }
    public static final Throwable f(Object p0){
       if (p0 instanceof f0$a) {
          return p0.a;
       }
       throw new IllegalStateException("Channel was not closed".toString());
    }
    public static final Object g(Object p0){
       if (!p0 instanceof f0$a) {
          return p0;
       }
       throw new IllegalStateException("Channel was closed".toString());
    }
    public static final Object h(Object p0){
       if (p0 instanceof f0$a) {
          p0 = null;
       }
       return p0;
    }
    public static int i(Object p0){
       int i = (p0 != null)? p0.hashCode(): 0;
       return i;
    }
    public static final boolean j(Object p0){
       return p0 instanceof f0$a;
    }
    public static String k(Object p0){
       p0 = (p0 instanceof f0$a)? p0.toString(): "Value\("+p0+')';
       return p0;
    }
    public static void m(){
    }
    public static void n(){
    }
    public boolean equals(Object p0){
       return f0.d(this.a, p0);
    }
    public int hashCode(){
       return f0.i(this.a);
    }
    public final Object l(){
       return this.a;
    }
    public String toString(){
       return f0.k(this.a);
    }
}
