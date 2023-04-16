package com.kwai.performance.stability.oom.monitor.tracker.JeMallocHackOOMTracker$mPurgeVssThreshold$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.stability.oom.monitor.tracker.JeMallocHackOOMTracker;
import java.lang.Object;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.stability.oom.monitor.OOMMonitorConfig;
import java.lang.Integer;

public final class JeMallocHackOOMTracker$mPurgeVssThreshold$2 extends Lambda implements a	// class@00126f
{
    public final JeMallocHackOOMTracker this$0;

    public void JeMallocHackOOMTracker$mPurgeVssThreshold$2(JeMallocHackOOMTracker p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       OOMMonitorConfig p = (this.this$0.getMIsCpu64bit())? this.this$0.getMonitorConfig().p: (int)((float)this.this$0.getMonitorConfig().p * 0x3f400000);
       return p;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
