package com.alipay.android.phone.mrpc.core.l;
import com.alipay.android.phone.mrpc.core.ab;
import com.alipay.android.phone.mrpc.core.n;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import com.alipay.android.phone.mrpc.core.b;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.RejectedExecutionHandler;
import com.kuaishou.webkit.CookieSyncManager;
import com.kuaishou.webkit.CookieManager;
import com.alipay.android.phone.mrpc.core.t;
import java.util.concurrent.Future;
import com.alipay.android.phone.mrpc.core.s;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.Long;
import com.alipay.android.phone.mrpc.core.o;
import com.alipay.android.phone.mrpc.core.q;
import com.alipay.android.phone.mrpc.core.m;
import java.util.concurrent.Callable;
import java.lang.Runnable;

public final class l implements ab	// class@000e52
{
    public Context a;
    public ThreadPoolExecutor c;
    public b d;
    public long e;
    public long f;
    public long g;
    public int h;
    public static l b;
    public static final ThreadFactory i;

    static {
       l.i = new n();
    }
    public void l(Context p0){
       super();
       this.a = p0;
       this.d = b.a("android");
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(10, 11, 3, TimeUnit.SECONDS, new ArrayBlockingQueue(20), l.i, new ThreadPoolExecutor$CallerRunsPolicy());
       this.c = b.a("android");
       try{
          threadPoolEx = 1;
          b.a("android").allowCoreThreadTimeOut(threadPoolEx);
          CookieSyncManager.createInstance(this.a);
          CookieManager.getInstance().setAcceptCookie(e0);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static final l a(Context p0){
       l b = l.b;
       if (b != null) {
          return b;
       }
       return l.b(p0);
    }
    public static synchronized final l b(Context p0){
       _monitor_enter(l.class);
       l b = l.b;
       if (b != null) {
          _monitor_exit(l.class);
          return b;
       }else {
          b = new l(p0);
          l.b = b;
          _monitor_exit(l.class);
          return b;
       }
    }
    public final b a(){
       return this.d;
    }
    public final Future a(t p0){
       if (s.a(this.a)) {
          String str = "HttpManager"+this.hashCode()+": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times";
          Object[] objArray = new Object[9];
          objArray[0] = Integer.valueOf(this.c.getActiveCount());
          objArray[1] = Long.valueOf(this.c.getCompletedTaskCount());
          objArray[2] = Long.valueOf(this.c.getTaskCount());
          int i = 3;
          l tg = this.g;
          long l = 0;
          long l1 = (!tg - l)? l: ((this.e * 1000) / tg) >> 10;
          objArray[i] = Long.valueOf(l1);
          i = 4;
          tg = this.h;
          if (tg != null) {
             l = this.f / (long)tg;
          }
          objArray[i] = Long.valueOf(l);
          objArray[5] = Long.valueOf(this.e);
          objArray[6] = Long.valueOf(this.f);
          objArray[7] = Long.valueOf(this.g);
          objArray[8] = Integer.valueOf(this.h);
          String.format(str, objArray);
       }
       m om = new m(this, new q(this, p0), new q(this, p0));
       this.c.execute(om);
       return om;
    }
    public final void a(long p0){
       this.e = this.e + p0;
    }
    public final void b(long p0){
       this.f = this.f + p0;
       this.h = this.h + 1;
    }
    public final void c(long p0){
       this.g = this.g + p0;
    }
}
