package com.kwai.performance.overhead.thread.monitor.ThreadMonitor$e;
import java.lang.Runnable;
import com.kwai.performance.overhead.thread.monitor.ThreadMonitor;
import java.lang.String;
import java.lang.Object;
import com.kwai.performance.overhead.thread.monitor.NativeHandler;

public final class ThreadMonitor$e implements Runnable	// class@001174
{
    public final ThreadMonitor b;
    public final String c;

    public void ThreadMonitor$e(ThreadMonitor p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (this.b.mIsRunning != null && this.b.mIsNativeInit != null) {
          NativeHandler.getInstance().startCollect(this.c);
       }
       return;
    }
}
