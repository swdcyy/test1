package com.kwai.performance.overhead.thread.monitor.ThreadMonitor$b;
import java.lang.Runnable;
import com.kwai.performance.overhead.thread.monitor.ThreadMonitor;
import java.lang.Object;
import com.kwai.performance.overhead.thread.monitor.NativeHandler;

public final class ThreadMonitor$b implements Runnable	// class@001171
{
    public final ThreadMonitor b;

    public void ThreadMonitor$b(ThreadMonitor p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (this.b.mIsRunning != null && this.b.mIsNativeInit != null) {
          NativeHandler.getInstance().endCollect();
       }
       return;
    }
}
