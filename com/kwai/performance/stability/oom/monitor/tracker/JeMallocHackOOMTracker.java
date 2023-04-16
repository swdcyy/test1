package com.kwai.performance.stability.oom.monitor.tracker.JeMallocHackOOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.OOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.JeMallocHackOOMTracker$a;
import nsd.u;
import com.kwai.performance.stability.oom.monitor.tracker.JeMallocHackOOMTracker$mIsCpu64bit$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.performance.stability.oom.monitor.tracker.JeMallocHackOOMTracker$mPurgeVssThreshold$2;
import com.kwai.performance.stability.oom.monitor.tracker.JeMallocHackOOMTracker$mChunkHooksThreshold$2;
import com.kwai.performance.stability.jemalloc.JeMallocStat;
import java.lang.Object;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.performance.stability.hprof.dump.NativeHandler;
import yf7.h;
import java.lang.StringBuilder;
import mh7.a;
import mh7.a$d;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.stability.oom.monitor.OOMMonitorConfig;
import com.kwai.performance.stability.jemalloc.NativeHandler;
import yg7.a;

public final class JeMallocHackOOMTracker extends OOMTracker	// class@001270
{
    public final p mChunkHooksThreshold$delegate;
    public final p mIsCpu64bit$delegate;
    public int mLastPurgeLoopCount;
    public int mLoopCount;
    public JeMallocStat mMallocStat;
    public int mPurgeTimes;
    public final p mPurgeVssThreshold$delegate;
    public static final JeMallocHackOOMTracker$a Companion;

    static {
       JeMallocHackOOMTracker.Companion = new JeMallocHackOOMTracker$a(null);
    }
    public void JeMallocHackOOMTracker(){
       super();
       this.mIsCpu64bit$delegate = s.c(JeMallocHackOOMTracker$mIsCpu64bit$2.INSTANCE);
       this.mPurgeVssThreshold$delegate = s.c(new JeMallocHackOOMTracker$mPurgeVssThreshold$2(this));
       this.mChunkHooksThreshold$delegate = s.c(new JeMallocHackOOMTracker$mChunkHooksThreshold$2(this));
       this.mMallocStat = new JeMallocStat();
    }
    public final int getMChunkHooksThreshold(){
       return this.mChunkHooksThreshold$delegate.getValue().intValue();
    }
    public final boolean getMIsCpu64bit(){
       return this.mIsCpu64bit$delegate.getValue().booleanValue();
    }
    public final int getMPurgeVssThreshold(){
       return this.mPurgeVssThreshold$delegate.getValue().intValue();
    }
    public String reason(){
       return "";
    }
    public void reset(){
    }
    public boolean track(){
       if (!NativeHandler.load()) {
          h.b("JeMallocHackTracker", "load so error");
          return false;
       }else if(NativeHandler.isARM64()){
          return false;
       }else {
          this.mLoopCount = this.mLoopCount + 1;
          String str = ", ";
          h.d("JeMallocHackTracker", "track vss:"+a.i.c()+str+"isCpu64bit:"+this.getMIsCpu64bit()+str+"purge vssThreshold:"+this.getMPurgeVssThreshold()+str+"chunk hooks vssThreshold:"+this.getMChunkHooksThreshold());
          if (a.i.c() > this.getMPurgeVssThreshold()) {
             h.d("JeMallocHackTracker", "over purge threshold:"+this.getMPurgeVssThreshold());
             JeMallocHackOOMTracker tmLastPurgeL = this.mLastPurgeLoopCount;
             if (tmLastPurgeL == null || ((this.mLoopCount - tmLastPurgeL) > this.getMonitorConfig().q && this.mPurgeTimes < this.getMonitorConfig().r)) {
                boolean fragmentatio = NativeHandler.getInstance().getFragmentationStatus(this.getMonitorConfig().s, this.getMonitorConfig().t, this.mMallocStat);
                h.d("JeMallocHackTracker", "needPurge:"+fragmentatio+' '+"allocated:"+this.mMallocStat.allocated+str+"active:"+this.mMallocStat.active+str+"resident:"+this.mMallocStat.resident+str+"mapped:"+this.mMallocStat.mapped+str+"retained:"+this.mMallocStat.retained);
                if (fragmentatio) {
                   this.mLastPurgeLoopCount = this.mLoopCount;
                   this.mPurgeTimes = this.mPurgeTimes + 1;
                   h.d("JeMallocHackTracker", "do manually purge");
                   a.b.a();
                   NativeHandler.getInstance().forceJeMallocPurge();
                }else {
                   h.d("JeMallocHackTracker", "no purge, not over retained threshold");
                }
             }else if(this.mPurgeTimes >= this.getMonitorConfig().r){
                h.d("JeMallocHackTracker", "no purge, beacausw purge times bigger than max purge times");
             }else if((this.mLoopCount - this.mLastPurgeLoopCount) < this.getMonitorConfig().q && this.mLastPurgeLoopCount != null){
                h.d("JeMallocHackTracker", "no purge, because less than min purge loop count threshold");
             }
          }else if(a.i.c() > this.getMChunkHooksThreshold()){
             h.d("JeMallocHackTracker", "over chunk hooks threshold:"+this.getMChunkHooksThreshold());
             a.b.a();
          }
          return false;
       }
    }
}
