package com.kwai.performance.stability.crash.monitor.anr.b$b;
import pg7.b;
import com.kwai.performance.stability.crash.monitor.anr.b;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import rg7.f;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv;

public class b$b implements b	// class@0011b2
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       b r;
       b$b ta = this.a;
       if (ta.j.enableSamplingPauseAndResume != null) {
          r = ta.r;
          if (r != null) {
             r.e();
          }
       }
       ta = this.a;
       if (ta.j.enableCheckTimePauseAndResume != null) {
          r = ta.t;
          if (r != null) {
             r.e();
          }
       }
       ta = this.a;
       if (ta.j.enableSyncBarrierPauseAndResume != null) {
          r = ta.u;
          if (r != null) {
             r.e();
          }
       }
       ta = this.a;
       if (ta.j.mAdvConfig.enableSamplingPauseResume != null) {
          r = ta.s;
          if (r != null) {
             r.e();
          }
       }
       return;
    }
    public void onBackground(){
       b r;
       b$b ta = this.a;
       if (ta.j.enableSamplingPauseAndResume != null) {
          r = ta.r;
          if (r != null) {
             r.d();
          }
       }
       ta = this.a;
       if (ta.j.enableCheckTimePauseAndResume != null) {
          r = ta.t;
          if (r != null) {
             r.d();
          }
       }
       ta = this.a;
       if (ta.j.enableSyncBarrierPauseAndResume != null) {
          r = ta.u;
          if (r != null) {
             r.d();
          }
       }
       ta = this.a;
       if (ta.j.mAdvConfig.enableSamplingPauseResume != null) {
          r = ta.s;
          if (r != null) {
             r.d();
          }
       }
       return;
    }
    public void onForeground(){
       b r;
       b$b ta = this.a;
       if (ta.j.enableSamplingPauseAndResume != null) {
          r = ta.r;
          if (r != null) {
             r.e();
          }
       }
       ta = this.a;
       if (ta.j.enableCheckTimePauseAndResume != null) {
          r = ta.t;
          if (r != null) {
             r.e();
          }
       }
       ta = this.a;
       if (ta.j.enableSyncBarrierPauseAndResume != null) {
          r = ta.u;
          if (r != null) {
             r.e();
          }
       }
       ta = this.a;
       if (ta.j.mAdvConfig.enableSamplingPauseResume != null) {
          r = ta.s;
          if (r != null) {
             r.e();
          }
       }
       return;
    }
    public void onHomeActivityDestroy(){
       b r;
       b$b ta = this.a;
       if (ta.j.enableSamplingPauseAndResume != null) {
          r = ta.r;
          if (r != null) {
             r.d();
          }
       }
       ta = this.a;
       if (ta.j.enableCheckTimePauseAndResume != null) {
          r = ta.t;
          if (r != null) {
             r.d();
          }
       }
       ta = this.a;
       if (ta.j.enableSyncBarrierPauseAndResume != null) {
          r = ta.u;
          if (r != null) {
             r.d();
          }
       }
       ta = this.a;
       if (ta.j.mAdvConfig.enableSamplingPauseResume != null) {
          r = ta.s;
          if (r != null) {
             r.d();
          }
       }
       return;
    }
}
