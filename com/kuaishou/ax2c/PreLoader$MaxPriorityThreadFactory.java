package com.kuaishou.ax2c.PreLoader$MaxPriorityThreadFactory;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import java.lang.SecurityManager;
import java.lang.System;
import java.lang.ThreadGroup;
import java.lang.Thread;
import java.lang.Runnable;
import java.lang.String;

public class PreLoader$MaxPriorityThreadFactory implements ThreadFactory	// class@000fbc
{
    public final ThreadGroup group;
    public final String name;

    public void PreLoader$MaxPriorityThreadFactory(){
       super();
       SecurityManager securityMana = System.getSecurityManager();
       ThreadGroup threadGroup = (securityMana != null)? securityMana.getThreadGroup(): Thread.currentThread().getThreadGroup();
       this.group = threadGroup;
       this.name = "ax2c-thread-pool";
       return;
    }
    public Thread newThread(Runnable p0){
       Thread thread = new Thread(this.group, p0, this.name, 0);
       if (v6.isDaemon()) {
          v6.setDaemon(false);
       }
       if (v6.getPriority() != 10) {
          v6.setPriority(10);
       }
       return v6;
    }
}
