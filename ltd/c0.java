package ltd.c0;
import java.lang.Object;
import kotlin.jvm.internal.a;
import ltd.b0;
import ltd.f;
import kotlin.TypeCastException;
import java.lang.String;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public final class c0	// class@001cc2
{
    public final Object a;

    public void c0(Object p0){
       super();
       this.a = p0;
    }
    public static final c0 a(Object p0){
       return new c0(p0);
    }
    public static Object b(Object p0){
       return p0;
    }
    public static boolean c(Object p0,Object p1){
       if (p1 instanceof c0 && a.g(p0, p1.j())) {
          return true;
       }
       return false;
    }
    public static final boolean d(Object p0,Object p1){
       return a.g(p0, p1);
    }
    public static final b0 e(Object p0){
       if (p0 == f.a) {
          throw new IllegalStateException("Does not contain segment".toString());
       }
       if (p0 != null) {
          return p0;
       }
       throw new TypeCastException("null cannot be cast to non-null type S");
    }
    public static int f(Object p0){
       int i = (p0 != null)? p0.hashCode(): 0;
       return i;
    }
    public static final boolean g(Object p0){
       boolean b = (p0 == f.a)? true: false;
       return b;
    }
    public static void h(){
    }
    public static String i(Object p0){
       return "SegmentOrClosed\(value="+p0+"\)";
    }
    public boolean equals(Object p0){
       return c0.c(this.a, p0);
    }
    public int hashCode(){
       return c0.f(this.a);
    }
    public final Object j(){
       return this.a;
    }
    public String toString(){
       return c0.i(this.a);
    }
}
