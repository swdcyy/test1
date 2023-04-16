package k3.h;
import java.lang.Object;
import k3.h$a;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Throwable;

public abstract class h	// class@002475
{
    public static h a;
    public static final int b;

    public void h(int p0){
       super();
    }
    public static synchronized h c(){
       _monitor_enter(h.class);
       if (h.a == null) {
          h.a = new h$a(3);
       }
       _monitor_exit(h.class);
       return h.a;
    }
    public static synchronized void e(h p0){
       _monitor_enter(h.class);
       h.a = p0;
       _monitor_exit(h.class);
    }
    public static String f(String p0){
       StringBuilder str = new StringBuilder(23)+"WM-";
       int b = h.b;
       str = (p0.length() >= b)? str+p0.substring(0, b): str+p0;
       return str;
    }
    public abstract void a(String p0,String p1,Throwable[] p2);
    public abstract void b(String p0,String p1,Throwable[] p2);
    public abstract void d(String p0,String p1,Throwable[] p2);
    public abstract void g(String p0,String p1,Throwable[] p2);
    public abstract void h(String p0,String p1,Throwable[] p2);
}
