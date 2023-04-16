package com.kwai.performance.stability.crash.monitor.anr.d$a;
import java.lang.Thread;
import java.util.LinkedList;
import java.lang.String;
import java.util.Collection;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.anr.d$b;
import android.os.SystemClock;
import java.util.List;
import com.kwai.performance.stability.crash.monitor.util.BacktraceUtil;
import com.kwai.performance.stability.crash.monitor.message.BackTraceStatistics;

public class d$a extends Thread	// class@0011c1
{
    public final LinkedList b;
    public long c;

    public void d$a(){
       super();
       this.c = 0;
       this.b = new LinkedList();
       this.setName("AnrPrettyFrame");
    }
    public void run(){
       while (!this.b.isEmpty()) {
          d$a tb = this.b;
          _monitor_enter(tb);
          LinkedList linkedList = new LinkedList(this.b);
          this.b.clear();
          _monitor_exit(tb);
          while (!linkedList.isEmpty()) {
             d$b uob = linkedList.poll();
             if (uob == null || uob.a - this.c < 0) {
                continue ;
             }else {
                BacktraceUtil.f(uob.b);
                long l = SystemClock.elapsedRealtimeNanos() - SystemClock.elapsedRealtimeNanos();
                BackTraceStatistics.getQualityStatistics().updateUnwindTaskTime(l);
             }
          }
       }
       _monitor_enter(this);
       try{
          this.wait();
          _monitor_exit(this);
          goto label_0000 ;
       }catch(java.lang.InterruptedException e0){
       }
    }
}
