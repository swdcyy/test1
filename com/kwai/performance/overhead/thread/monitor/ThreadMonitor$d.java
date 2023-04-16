package com.kwai.performance.overhead.thread.monitor.ThreadMonitor$d;
import java.lang.Runnable;
import com.kwai.performance.overhead.thread.monitor.ThreadMonitor;
import java.lang.Object;

public final class ThreadMonitor$d implements Runnable	// class@001173
{
    public final ThreadMonitor b;

    public void ThreadMonitor$d(ThreadMonitor p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (this.b.mIsRunning != null) {
          this.b.doReportThread();
       }
       return;
    }
}
