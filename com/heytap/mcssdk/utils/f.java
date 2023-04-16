package com.heytap.mcssdk.utils.f;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import android.os.Handler;
import android.os.Looper;
import java.lang.Object;
import java.lang.Runnable;

public class f	// class@000546
{
    public static final ExecutorService a;
    public static Handler b;

    static {
       f.a = Executors.newSingleThreadExecutor();
       f.b = new Handler(Looper.getMainLooper());
    }
    public void f(){
       super();
    }
    public static void a(Runnable p0){
       f.a.execute(p0);
    }
    public static void b(Runnable p0){
       f.b.post(p0);
    }
}
