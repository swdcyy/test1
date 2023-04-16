package am8.d;
import java.lang.Runnable;
import java.lang.String;
import am8.c;
import am8.a;
import java.util.concurrent.ExecutorService;
import java.lang.CharSequence;
import android.text.TextUtils;
import am8.b;
import java.lang.IllegalArgumentException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import hkd.b;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;

public class d	// class@0000f6
{

    public static void a(Runnable p0,String p1,int p2,long p3){
       c.c(p0, p1, p2, p3);
    }
    public static a b(String p0,int p1){
       return new c(p0, p1);
    }
    public static ExecutorService c(String p0){
       if (TextUtils.isEmpty(p0) && b.b) {
          throw new IllegalArgumentException("can\'t accept an empty executor name");
       }
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(p0));
       v0.allowCoreThreadTimeOut(true);
       return v0;
    }
    public static void d(Runnable p0,String p1,int p2){
       c.d(p0, p1, p2);
    }
}
