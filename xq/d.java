package xq.d;
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
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xq.d$a;
import xq.d$b;

public class d implements ThreadFactory	// class@00281c
{
    public final ThreadGroup b;
    public final AtomicInteger c;
    public final String d;
    public static final AtomicInteger e;

    static {
       d.e = new AtomicInteger(1);
    }
    public void d(String p0){
       super();
       this.c = new AtomicInteger(1);
       SecurityManager securityMana = System.getSecurityManager();
       ThreadGroup threadGroup = (securityMana != null)? securityMana.getThreadGroup(): Thread.currentThread().getThreadGroup();
       this.b = threadGroup;
       this.d = p0+"-"+d.e.getAndIncrement()+"-";
       return;
    }
    public Thread newThread(Runnable p0){
       Thread obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          d$a uoa = new d$a(this);
       }
       obj = new Thread(this.b, new d$b(this, p0, 10), this.d+this.c.getAndIncrement(), 0);
       if (p0.isDaemon()) {
          p0.setDaemon(false);
       }
       if (p0.getPriority() != 5) {
          p0.setPriority(5);
       }
       return p0;
    }
}
