package im8.e;
import java.lang.Object;
import java.util.Set;
import im8.d;
import java.lang.Class;
import java.lang.String;
import im8.f;

public final class e	// class@0026ac
{
    public static d a;

    public static Set a(Object p0){
       return e.a.a(p0);
    }
    public static Object b(Object p0,Class p1){
       return e.a.d(p0, p1);
    }
    public static Object c(Object p0,String p1){
       return e.a.e(p0, p1);
    }
    public static boolean d(Object p0,Class p1){
       p0 = e.a.c(p0);
       boolean b = (p0 != null && p0.contains(p1))? true: false;
       return b;
    }
    public static boolean e(Object p0,String p1){
       p0 = e.a.b(p0);
       boolean b = (p0 != null && p0.contains(p1))? true: false;
       return b;
    }
    public static f f(Object p0,String p1,Class p2){
       return e.a.f(p0, p1, p2);
    }
    public static void g(d p0){
       e.a = p0;
    }
}
