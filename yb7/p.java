package yb7.p;
import android.os.Handler;
import android.os.Looper;
import java.util.Random;
import java.lang.System;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Runnable;
import android.os.Message;

public class p	// class@00287e
{
    public static final Handler a;
    public static final Random b;

    static {
       p.a = new Handler(Looper.getMainLooper());
       p.b = new Random(System.currentTimeMillis());
    }
    public static Object a(Object p0,String p1){
       Objects.requireNonNull(p0, p1);
       return p0;
    }
    public static void b(Runnable p0){
       p.a.removeCallbacks(p0);
    }
    public static void c(Object p0){
       p.a.removeCallbacksAndMessages(p0);
    }
    public static void d(Runnable p0){
       if (Looper.getMainLooper() == Looper.myLooper()) {
          p0.run();
       }else {
          p.a.post(p0);
       }
       return;
    }
    public static void e(Runnable p0,long p1){
       p.a.postDelayed(p0, p1);
    }
    public static void f(Runnable p0,Object p1,long p2){
       Handler a = p.a;
       Message message = Message.obtain(a, p0);
       message.obj = p1;
       a.sendMessageDelayed(message, p2);
    }
}
