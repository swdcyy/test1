package com.facebook.cache.disk.c$a;
import java.lang.Runnable;
import com.facebook.cache.disk.c;
import java.lang.Object;
import java.util.concurrent.CountDownLatch;

public class c$a implements Runnable	// class@000434
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void run(){
       c p = this.b.p;
       _monitor_enter(p);
       this.b.n();
       _monitor_exit(p);
       c$a tb = this.b;
       tb.q = true;
       tb.c.countDown();
    }
}
