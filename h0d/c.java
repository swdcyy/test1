package h0d.c;
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
import h0d.b;
import h0d.c$a;

public class c implements ThreadFactory	// class@00171f
{
    public final AtomicInteger b;
    public final ThreadGroup c;
    public final String d;
    public static final AtomicInteger e;

    static {
       c.e = new AtomicInteger(1);
    }
    public void c(String p0){
       super();
       this.b = new AtomicInteger(1);
       SecurityManager securityMana = System.getSecurityManager();
       ThreadGroup threadGroup = (securityMana != null)? securityMana.getThreadGroup(): Thread.currentThread().getThreadGroup();
       this.c = threadGroup;
       this.d = p0+'-'+c.e.getAndIncrement()+'-';
       return;
    }
    public Thread newThread(Runnable p0){
       Thread obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          b b = b.b;
       }
       obj = new Thread(this.c, new c$a(this, p0, 10), this.d+this.b.getAndIncrement(), 0);
       if (p0.isDaemon()) {
          p0.setDaemon(false);
       }
       if (p0.getPriority() != 5) {
          p0.setPriority(5);
       }
       return p0;
    }
}
