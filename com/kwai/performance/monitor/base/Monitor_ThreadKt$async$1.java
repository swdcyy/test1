package com.kwai.performance.monitor.base.Monitor_ThreadKt$async$1;
import java.lang.Runnable;
import msd.a;
import java.lang.Object;
import yf7.k;
import com.kwai.performance.monitor.base.d;
import java.util.concurrent.ExecutorService;
import yf7.v;
import java.util.concurrent.Future;
import com.kwai.performance.monitor.base.Monitor_ThreadKt$async$1$1;
import java.lang.ClassLoader;
import java.lang.String;
import java.lang.Thread;
import yrd.b;

public final class Monitor_ThreadKt$async$1 implements Runnable	// class@001105
{
    public final a b;

    public void Monitor_ThreadKt$async$1(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       a uoa = k.c.c().b();
       if (uoa != null) {
          ExecutorService uExecutorSer = uoa.invoke();
          if (uExecutorSer != null) {
             Monitor_ThreadKt$async$1 tb = this.b;
             if (tb != null) {
                tb = new v(tb);
             }
             if (uExecutorSer.submit(tb) != null) {
             label_0037 :
                return;
             }
          }
       }
       b.c(false, false, null, null, 0, new Monitor_ThreadKt$async$1$1(this), 31, null);
       goto label_0037 ;
    }
}
