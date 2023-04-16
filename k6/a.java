package k6.a;
import android.content.Context;
import s6.a;
import java.lang.String;
import k6.c;
import k6.a$a;
import java.lang.Throwable;
import u6.c;
import java.lang.Object;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.Class;
import k6.a$b;

public class a	// class@00248d
{

    public static synchronized void a(Context p0,a p1,String p2,String p3){
       _monitor_enter(a.class);
       if (p0 == null || p1 == null) {
          _monitor_exit(a.class);
          return;
       }else {
          a$a.b(p0, p1.j.b(p2), p3);
          _monitor_exit(a.class);
          return;
       }
    }
    public static void b(a p0,String p1,String p2){
       if (p0 == null) {
          return;
       }
       p0.j.g("", p1, p2);
       return;
    }
    public static void c(a p0,String p1,String p2,String p3){
       if (p0 == null) {
          return;
       }
       p0 = p0.j;
       Objects.requireNonNull(p0);
       p0.g("", p1, p2+"|"+p3);
       return;
    }
    public static void d(a p0,String p1,String p2,Throwable p3){
       if (p0 == null) {
          return;
       }
       p0.j.d(p1, p2, p3);
       return;
    }
    public static void e(a p0,String p1,String p2,Throwable p3,String p4){
       if (p0 == null) {
          return;
       }
       p0 = p0.j;
       Objects.requireNonNull(p0);
       p0.i(p1, p2, p4+": "+c.c(p3));
       return;
    }
    public static void f(a p0,String p1,Throwable p2){
       if (p0 != null) {
          p0.j.d(p1, p2.getClass().getSimpleName(), p2);
       }
       return;
    }
    public static synchronized void g(Context p0,a p1,String p2,String p3){
       _monitor_enter(a.class);
       if (p0 != null) {
          a$b.a(p0, p1.j, p2, p3);
          _monitor_exit(a.class);
          return;
       }else {
          _monitor_exit(a.class);
          return;
       }
    }
    public static void h(a p0,String p1,String p2,String p3){
       if (p0 == null) {
          return;
       }
       p0.j.i(p1, p2, p3);
       return;
    }
}
