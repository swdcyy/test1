package hkd.b;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.String;
import java.lang.Object;
import java.lang.SecurityManager;
import java.lang.System;
import java.lang.ThreadGroup;
import java.lang.Thread;
import java.lang.StringBuilder;
import java.lang.Runnable;
import hkd.a;
import hkd.b$a;

public class b implements ThreadFactory	// class@001762
{
    public final AtomicInteger b;
    public final ThreadGroup c;
    public final String d;
    public static final AtomicInteger e;

    static {
       b.e = new AtomicInteger(1);
    }
    public void b(String p0){
       super();
       this.b = new AtomicInteger(1);
       SecurityManager securityMana = System.getSecurityManager();
       ThreadGroup threadGroup = (securityMana != null)? securityMana.getThreadGroup(): Thread.currentThread().getThreadGroup();
       this.c = threadGroup;
       this.d = p0+'-'+b.e.getAndIncrement()+'-';
       return;
    }
    public Thread newThread(Runnable p0){
       if (p0 != null) {
       }else {
          a b = a.b;
       }
       Thread thread = new Thread(this.c, new b$a(this, p0, 10), this.d+this.b.getAndIncrement(), 0);
       if (p0.isDaemon()) {
          p0.setDaemon(false);
       }
       if (p0.getPriority() != 5) {
          p0.setPriority(5);
       }
       return p0;
    }
}
