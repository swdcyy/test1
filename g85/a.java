package g85.a;
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

public class a implements ThreadFactory	// class@0016be
{
    public final ThreadGroup b;
    public final AtomicInteger c;
    public final String d;
    public static final AtomicInteger e;

    static {
       a.e = new AtomicInteger(1);
    }
    public void a(String p0){
       super();
       this.c = new AtomicInteger(1);
       SecurityManager securityMana = System.getSecurityManager();
       ThreadGroup threadGroup = (securityMana != null)? securityMana.getThreadGroup(): Thread.currentThread().getThreadGroup();
       this.b = threadGroup;
       this.d = p0+'-'+a.e.getAndIncrement()+'-';
       return;
    }
    public Thread newThread(Runnable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Thread thread = new Thread(this.b, p0, this.d+this.c.getAndIncrement(), 0);
       if (obj.isDaemon()) {
          obj.setDaemon(false);
       }
       if (obj.getPriority() != 5) {
          obj.setPriority(5);
       }
       return obj;
    }
}
