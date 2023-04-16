package com.kuaishou.android.security.base.thread.b;
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
import com.kuaishou.android.security.base.thread.b$a;

public class b implements ThreadFactory	// class@000f14
{
    public final AtomicInteger a;
    public final ThreadGroup b;
    public final String c;
    public static final AtomicInteger d;

    static {
       b.d = new AtomicInteger(1);
    }
    public void b(String p0){
       super();
       this.a = new AtomicInteger(1);
       SecurityManager securityMana = System.getSecurityManager();
       ThreadGroup threadGroup = (securityMana != null)? securityMana.getThreadGroup(): Thread.currentThread().getThreadGroup();
       this.b = threadGroup;
       this.c = p0+'-'+b.d.getAndIncrement()+'-';
       return;
    }
    public Thread newThread(Runnable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Thread thread = new Thread(this.b, new b$a(this, p0, 10), this.c+this.a.getAndIncrement(), 0);
       if (p0.isDaemon()) {
          p0.setDaemon(false);
       }
       if (p0.getPriority() != 5) {
          p0.setPriority(5);
       }
       return p0;
    }
}
