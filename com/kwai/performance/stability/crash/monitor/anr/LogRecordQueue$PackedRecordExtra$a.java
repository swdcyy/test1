package com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$PackedRecordExtra$a;
import com.kwai.performance.stability.crash.monitor.anr.d$d;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$PackedRecordExtra;
import com.kwai.performance.stability.crash.monitor.anr.extra.ThreadHolder;
import java.lang.String;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import java.lang.Object;
import com.kwai.apm.message.FastUnwindBacktrace;
import java.util.List;
import com.kwai.performance.stability.crash.monitor.util.BacktraceUtil$ThreadStateAndLockInfo;
import com.kwai.performance.stability.crash.monitor.util.BacktraceUtil;
import pg7.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$StackHolder;

public class LogRecordQueue$PackedRecordExtra$a implements d$d	// class@00119f
{
    public final ThreadHolder a;
    public final boolean b;
    public final String c;
    public final String d;
    public final AnrMonitorConfig e;
    public final LogRecordQueue$PackedRecordExtra f;

    public void LogRecordQueue$PackedRecordExtra$a(LogRecordQueue$PackedRecordExtra p0,ThreadHolder p1,boolean p2,String p3,String p4,AnrMonitorConfig p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void a(long p0,Object[] p1){
       if (this.b == null) {
          this.f.updateNoMainThread(this.c, this.d, p1, this.e);
       }else {
          this.f.updateMainStackDiff(this.c, this.d, p1, this.e);
       }
       return;
    }
    public void b(long p0){
    }
    public List c(FastUnwindBacktrace p0){
       BacktraceUtil$ThreadStateAndLockInfo threadStateA = BacktraceUtil.c(p0);
       ThreadHolder lockChecker = this.a.lockChecker;
       if (lockChecker != null) {
          lockChecker.a(threadStateA);
       }
       ArrayList uArrayList = new ArrayList();
       if (p0 != null) {
          uArrayList.addAll(p0.backtraces);
       }
       Object[] objArray = uArrayList.toArray();
       if (this.b == null) {
          this.f.updateNoMainThread(this.c, this.d, objArray, this.e);
          LogRecordQueue$StackHolder stackHolder = this.f.threadStackDiff.get(this.c);
          if (stackHolder == null) {
             return null;
          }else if(threadStateA != null){
             threadStateA.updateTime = (long)stackHolder.updateTimes;
             stackHolder.threadStateInfo.add(threadStateA);
          }
          return new ArrayList(stackHolder.stackDiff);
       }else {
          this.f.updateMainStackDiff(this.c, this.d, objArray, this.e);
          if (threadStateA != null) {
             LogRecordQueue$PackedRecordExtra$a tf = this.f;
             threadStateA.updateTime = tf.stackUpdateAt;
             tf.threadStateInfo.add(threadStateA);
          }
          return new ArrayList(this.f.stackTraceDiff);
       }
    }
}
