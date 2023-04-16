package kd.b;
import kd.b$c;
import kd.b$a;
import java.lang.Object;
import java.lang.String;
import kd.b$d;
import kd.a;

public class b	// class@001bfc
{
    public static final b$b a;
    public static b$d b;

    static {
       b.a = new b$c(null);
       b.b = null;
    }
    public void b(){
       super();
    }
    public static void a(String p0){
       b.c().a(p0);
    }
    public static void b(){
       b.c().c();
    }
    public static b$d c(){
       if (b.b == null) {
          b uob = b.class;
          _monitor_enter(uob);
          if (b.b == null) {
             b.b = new a();
          }
          _monitor_exit(uob);
       }
       return b.b;
    }
    public static boolean d(){
       return b.c().b();
    }
}
