package ekd.s1;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Handler;
import android.os.Looper;
import java.lang.Runnable;
import java.lang.UnsupportedOperationException;

public class s1 extends HandlerThread	// class@00156b
{
    public static s1 b;
    public static Handler c;

    public void s1(){
       super("worker-handler", 10);
    }
    public static void a(){
       if (s1.b == null) {
          s1 os1 = new s1();
          s1.b = os1;
          os1.start();
          s1.c = new Handler(s1.b.getLooper());
       }
       return;
    }
    public static s1 b(){
       _monitor_enter(s1.class);
       s1.a();
       _monitor_exit(s1.class);
       return s1.b;
    }
    public static Handler c(){
       _monitor_enter(s1.class);
       s1.a();
       _monitor_exit(s1.class);
       return s1.c;
    }
    public static void d(Runnable p0){
       s1.c().post(p0);
    }
    public static void e(Runnable p0,long p1){
       s1.c().postDelayed(p0, p1);
    }
    public boolean quit(){
       throw new UnsupportedOperationException();
    }
    public boolean quitSafely(){
       throw new UnsupportedOperationException();
    }
}
