package com.kwai.performance.monitor.base.loop.LoopMonitor$c;
import java.lang.Runnable;
import com.kwai.performance.monitor.base.loop.LoopMonitor;
import java.lang.Object;
import java.util.concurrent.Callable;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b$b;
import kotlin.jvm.internal.a;
import android.os.Handler;

public final class LoopMonitor$c implements Runnable	// class@001110
{
    public final LoopMonitor b;

    public void LoopMonitor$c(LoopMonitor p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (a.g(this.b.call(), LoopMonitor$b$b.a)) {
          return;
       }
       if (this.b.mIsLoopStopped != null) {
          return;
       }
       this.b.getLoopHandler().removeCallbacks(this);
       this.b.getLoopHandler().postDelayed(this, this.b.getLoopInterval());
       return;
    }
}
