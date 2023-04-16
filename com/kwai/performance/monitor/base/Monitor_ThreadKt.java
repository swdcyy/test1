package com.kwai.performance.monitor.base.Monitor_ThreadKt;
import android.os.Handler;
import android.os.Looper;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt$async$1;
import java.lang.Runnable;
import yf7.k;
import com.kwai.performance.monitor.base.d;
import java.util.concurrent.ExecutorService;
import yf7.v;
import java.util.concurrent.Future;
import com.kwai.performance.monitor.base.Monitor_ThreadKt$async$2;
import java.lang.ClassLoader;
import java.lang.Thread;
import yrd.b;

public final class Monitor_ThreadKt	// class@000dc1
{
    public static final Handler a;

    static {
       Monitor_ThreadKt.a = new Handler(Looper.getMainLooper());
    }
    public static final void a(long p0,a p1){
       a.q(p1, "block");
       if (p0 - null) {
          Monitor_ThreadKt.a.postDelayed(new Monitor_ThreadKt$async$1(p1), p0);
       }else {
          a uoa = k.c.c().b();
          if (uoa != null) {
             ExecutorService uExecutorSer = uoa.invoke();
             if (uExecutorSer == null || uExecutorSer.submit(new v(p1)) == null) {
             }
          }else {
          }
       }
       return;
    }
    public static void b(long p0,a p1,int p2,Object p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       Monitor_ThreadKt.a(p0, p1);
       return;
    }
    public static final Handler c(){
       return k.c.c().t.invoke();
    }
    public static final void d(long p0,a p1){
       a.q(p1, "block");
       Monitor_ThreadKt.a.postDelayed(new v(p1), p0);
    }
    public static void e(long p0,a p1,int p2,Object p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       Monitor_ThreadKt.d(p0, p1);
       return;
    }
    public static final void f(a p0){
       a.q(p0, "block");
       if (a.g(Looper.myLooper(), Looper.getMainLooper())) {
          p0.invoke();
       }else {
          Monitor_ThreadKt.a.post(new v(p0));
       }
       return;
    }
}
