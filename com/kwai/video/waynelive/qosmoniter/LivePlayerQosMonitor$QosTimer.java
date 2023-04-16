package com.kwai.video.waynelive.qosmoniter.LivePlayerQosMonitor$QosTimer;
import ekd.b;
import com.kwai.video.waynelive.qosmoniter.LivePlayerQosMonitor;
import com.kwai.player.qos.KwaiQosInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.waynelive.LivePlayerUtils;
import com.kwai.video.waynelive.qosmoniter.LivePlayerQosListener;
import com.kwai.video.waynelive.qosmoniter.QosMonitorConfig;

public final class LivePlayerQosMonitor$QosTimer extends b	// class@000e0e
{
    public final LivePlayerQosMonitor this$0;

    public void LivePlayerQosMonitor$QosTimer(LivePlayerQosMonitor p0,long p1){
       this.this$0 = p0;
       super(p1);
    }
    public KwaiQosInfo prepareData(long p0){
       if (PatchProxy.isSupport(LivePlayerQosMonitor$QosTimer.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, LivePlayerQosMonitor$QosTimer.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return LivePlayerUtils.getStreamQosInfo(this.this$0.mLiveMediaPlayer);
    }
    public Object prepareData(long p0){
       return this.prepareData(p0);
    }
    public void run(long p0,KwaiQosInfo p1){
       LivePlayerQosMonitor$QosTimer qosTimer = LivePlayerQosMonitor$QosTimer.class;
       if (PatchProxy.isSupport(qosTimer) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, qosTimer, "2")) {
          return;
       }
       LivePlayerQosMonitor mLivePlayerQ = this.this$0.mLivePlayerQosListener;
       if (mLivePlayerQ != null) {
          mLivePlayerQ.onTickQosInfo(p1);
       }
       if (p1 != null) {
          LivePlayerQosMonitor$QosTimer tthis$0 = this.this$0;
          LivePlayerQosMonitor mQosMonitorC = tthis$0.mQosMonitorConfig;
          if (mQosMonitorC.mEnableAutoSwitchCDN != null) {
             tthis$0.monitorQosInfo(p1, mQosMonitorC);
          }
       }
       return;
    }
    public void run(long p0,Object p1){
       this.run(p0, p1);
    }
}
