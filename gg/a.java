package gg.a;
import java.lang.Object;
import gg.b;
import java.lang.IllegalStateException;
import java.lang.String;

public class a	// class@0016e1
{
    public static b a;

    public void a(){
       super();
    }
    public static synchronized void a(b p0){
       _monitor_enter(a.class);
       if (a.a != null) {
          throw new IllegalStateException("Cannot re-initialize NativeLoader.");
       }
       a.a = p0;
       _monitor_exit(a.class);
       return;
    }
    public static synchronized boolean b(){
       _monitor_enter(a.class);
       boolean b = (a.a != null)? true: false;
       _monitor_exit(a.class);
       return b;
    }
    public static boolean c(String p0){
       return a.d(p0, 0);
    }
    public static boolean d(String p0,int p1){
       b a;
       _monitor_enter(a.class);
       a = a.a;
       if (a == null) {
          throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init\(new SystemDelegate\(\)\).");
       }
       _monitor_exit(a.class);
       return a.b(p0, p1);
    }
}
