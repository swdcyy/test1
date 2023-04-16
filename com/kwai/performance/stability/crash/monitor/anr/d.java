package com.kwai.performance.stability.crash.monitor.anr.d;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv;
import java.lang.Object;
import java.lang.Thread;
import com.kwai.performance.stability.crash.monitor.anr.d$c;
import android.os.SystemClock;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.performance.stability.crash.monitor.util.BacktraceUtil;
import com.kwai.performance.stability.crash.monitor.message.BackTraceStatistics;
import com.kwai.performance.stability.crash.monitor.anr.b;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.lang.StackTraceElement;
import vg7.d;
import com.kwai.apm.message.FastUnwindBacktrace;
import java.lang.Class;
import com.google.gson.Gson;
import com.kwai.performance.stability.crash.monitor.anr.d$a;

public class d	// class@0011c5
{
    public final AnrMonitorConfigAdv a;
    public static d$a b;

    public void d(AnrMonitorConfigAdv p0){
       super();
       this.a = p0;
    }
    public d$c a(Thread p0){
       d$c uoc = new d$c();
       d ta = this.a;
       if (ta.enableFastStack == null || ta.unwindStackSafeMode != null) {
          uoc.d(p0.getStackTrace());
          return uoc;
       }else {
          String str = BacktraceUtil.b(p0, Boolean.FALSE, Boolean.valueOf(this.a.enableGetThreadLockInfo), Boolean.valueOf(this.a.enableGetNativeFrames));
          BackTraceStatistics.getQualityStatistics().updateGetTraceTime(str, (SystemClock.elapsedRealtimeNanos() - SystemClock.elapsedRealtimeNanos()));
          FastUnwindBacktrace uFastUnwindB = null;
          if (str == null) {
             BackTraceStatistics.getQualityStatistics().updateGetTraceFailTimes();
          }else if(str.equals("ERROR_SYSTEM_CALL")){
             b.c().b(new RuntimeException("BacktraceUtil.getThreadFrameInfo fail:"+str));
          }else if(str.equals("ERROR_THREAD_TIMEOUT")){
             b.c().b(new RuntimeException("BacktraceUtil.getThreadFrameInfo fail:"+str));
          }else if(str == null){
             uoc.d(p0.getStackTrace());
             return uoc;
          }else {
             uoc.c = str;
             try{
                uoc.d = d.j.h(str, FastUnwindBacktrace.class);
             }catch(java.lang.Exception e0){
                b.c().b(new RuntimeException("FastUnwindBacktrace fromJson fail"));
             }
             if (this.a.unwindInGetThread()) {
                if (e0.b == null) {
                   d$c c = e0.c;
                   if (c != null && !e0.a - -1) {
                      e0.b = BacktraceUtil.a(c);
                   }
                }
             }else if(this.a.unwindInNewThread()){
                e0.b(SystemClock.elapsedRealtimeNanos());
                if (d.b == null) {
                   _monitor_enter(d$c.class);
                   if (d.b == null) {
                      d$a uoa = new d$a();
                      d.b = uoa;
                      uoa.start();
                   }
                   _monitor_exit(d$c.class);
                }
             }
             return e0;
          }
          str = uFastUnwindB;
          goto label_008d ;
       }
    }
}
