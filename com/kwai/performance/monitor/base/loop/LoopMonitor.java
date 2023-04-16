package com.kwai.performance.monitor.base.loop.LoopMonitor;
import java.util.concurrent.Callable;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.monitor.base.loop.LoopMonitor$a;
import nsd.u;
import com.kwai.performance.monitor.base.loop.LoopMonitor$c;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import android.os.Handler;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import java.lang.Runnable;

public abstract class LoopMonitor extends Monitor implements Callable	// class@000dcb
{
    public boolean mIsLoopStopped;
    public final LoopMonitor$c mLoopRunnable;
    public static final LoopMonitor$a Companion;

    static {
       LoopMonitor.Companion = new LoopMonitor$a(null);
    }
    public void LoopMonitor(){
       super();
       this.mIsLoopStopped = true;
       this.mLoopRunnable = new LoopMonitor$c(this);
    }
    public static void startLoop$default(LoopMonitor p0,boolean p1,boolean p2,long p3,int p4,Object p5){
       if (p5 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startLoop");
       }
       if (p4 & 0x01) {
          p1 = true;
       }
       if (p4 & 0x02) {
          p2 = false;
       }
       if (p4 & 0x04) {
          p3 = 0;
       }
       p0.startLoop(p1, p2, p3);
       return;
    }
    public Handler getLoopHandler(){
       return Monitor_ThreadKt.c();
    }
    public long getLoopInterval(){
       return 1000;
    }
    public void startLoop(boolean p0,boolean p1,long p2){
       if (p0) {
          this.getLoopHandler().removeCallbacks(this.mLoopRunnable);
       }
       if (p1) {
          this.getLoopHandler().postAtFrontOfQueue(this.mLoopRunnable);
       }else {
          this.getLoopHandler().postDelayed(this.mLoopRunnable, p2);
       }
       this.mIsLoopStopped = false;
       return;
    }
    public void stopLoop(){
       this.mIsLoopStopped = true;
       this.getLoopHandler().removeCallbacks(this.mLoopRunnable);
    }
}
