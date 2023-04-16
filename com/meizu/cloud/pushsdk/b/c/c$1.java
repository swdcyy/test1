package com.meizu.cloud.pushsdk.b.c.c$1;
import java.util.concurrent.ThreadFactory;
import java.lang.String;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.Long;

public final class c$1 implements ThreadFactory	// class@0014aa
{
    public final ThreadFactory a;
    public final String b;
    public final AtomicLong c;
    public final Boolean d;
    public final Integer e;
    public final Thread$UncaughtExceptionHandler f;

    public void c$1(ThreadFactory p0,String p1,AtomicLong p2,Boolean p3,Integer p4,Thread$UncaughtExceptionHandler p5){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public Thread newThread(Runnable p0){
       Thread thread = this.a.newThread(p0);
       c$1 tb = this.b;
       if (tb != null) {
          Object[] objArray = new Object[]{Long.valueOf(this.c.getAndIncrement())};
          thread.setName(String.format(tb, objArray));
       }
       tb = this.d;
       if (tb != null) {
          thread.setDaemon(tb.booleanValue());
       }
       tb = this.e;
       if (tb != null) {
          thread.setPriority(tb.intValue());
       }
       tb = this.f;
       if (tb != null) {
          thread.setUncaughtExceptionHandler(tb);
       }
       return thread;
    }
}
