package com.kwai.performance.stability.crash.monitor.anr.async.a;
import java.lang.Runnable;
import com.kwai.performance.stability.crash.monitor.anr.async.b;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.util.Objects;
import android.os.SystemClock;
import java.lang.String;
import yf7.h;
import java.lang.StringBuilder;
import java.lang.Long;
import com.kwai.performance.stability.crash.monitor.util.e;
import com.kwai.performance.stability.crash.monitor.anr.async.MessageUtils;
import java.lang.System;
import ng7.c;
import com.kwai.performance.stability.crash.monitor.anr.async.d;

public final class a implements Runnable	// class@0011a5
{
    public final b b;
    public final CountDownLatch c;

    public void a(b p0,CountDownLatch p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       String str;
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       try{
          str = "AsyncSchedule";
          h.d(str, "wait for main thread notify");
          tc.await();
          long l = SystemClock.uptimeMillis() - SystemClock.uptimeMillis();
          h.d(str, "sync schedule can process task \(await main cost = "+l+"\)");
          e.v("AsyncSchedule.AwaitMainCost", Long.valueOf(l));
       }catch(java.lang.InterruptedException e1){
          h.g(str, "lock.await error, "+e1);
       }
       e.v("AsyncSchedule.History", MessageUtils.k);
       e.v("AsyncSchedule.InitTime", Long.valueOf(System.currentTimeMillis()));
       e.v("AsyncSchedule.Delegate", String.valueOf(tb.h));
       d.a = new c(tb);
       return;
    }
}
