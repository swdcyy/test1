package com.kuaishou.webkit.internal.ThreadUtils;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.lang.Runnable;

public class ThreadUtils	// class@001322
{
    public static final Object sLock;
    public static Handler sUiThreadHandler;

    static {
       ThreadUtils.sLock = new Object();
    }
    public void ThreadUtils(){
       super();
    }
    public static Handler getUiThreadHandler(){
       Object sLock = ThreadUtils.sLock;
       _monitor_enter(sLock);
       if (ThreadUtils.sUiThreadHandler == null) {
          ThreadUtils.sUiThreadHandler = new Handler(Looper.getMainLooper());
       }
       _monitor_exit(sLock);
       return ThreadUtils.sUiThreadHandler;
    }
    public static void postOnUiThread(Runnable p0){
       ThreadUtils.getUiThreadHandler().post(p0);
    }
    public static void postOnUiThreadDelayed(Runnable p0,long p1){
       ThreadUtils.getUiThreadHandler().postDelayed(p0, p1);
    }
    public static void runOnUiThread(Runnable p0){
       if (ThreadUtils.runningOnUiThread()) {
          p0.run();
       }else {
          ThreadUtils.getUiThreadHandler().post(p0);
       }
       return;
    }
    public static boolean runningOnUiThread(){
       boolean b = (ThreadUtils.getUiThreadHandler().getLooper() == Looper.myLooper())? true: false;
       return b;
    }
}
