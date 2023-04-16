package com.kwai.video.waynelive.qosmoniter.LivePlayerQosMonitor;
import com.kwai.video.waynelive.qosmoniter.QosMonitorConfig;
import java.lang.Object;
import com.kwai.video.waynelive.qosmoniter.LivePlayerQosMonitor$QosTimer;
import com.kwai.video.waynelive.debug.Logger;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.player.qos.KwaiQosInfo;
import android.os.SystemClock;
import com.kwai.video.waynelive.qosmoniter.QosLowReason;
import com.kwai.video.waynelive.LivePlayerUtils;
import java.lang.Long;
import com.kwai.video.waynelive.qosmoniter.LivePlayerQosListener;
import ekd.b;

public class LivePlayerQosMonitor	// class@000e0f
{
    public b mCustomTimer;
    public long mEmptyDataDurationMs;
    public long mLastBufferEmptyDurationMs;
    public long mLastCollectTime;
    public long mLastTickTime;
    public long mLastTotalDataSize;
    public IKwaiMediaPlayer mLiveMediaPlayer;
    public LivePlayerQosListener mLivePlayerQosListener;
    public Logger mLogger;
    public QosMonitorConfig mQosMonitorConfig;

    public void LivePlayerQosMonitor(QosMonitorConfig p0){
       super();
       this.mCustomTimer = new LivePlayerQosMonitor$QosTimer(this, 1000);
       this.mLogger = new Logger("LivePlayerQosMonitor");
       if (p0 != null) {
       }else {
          p0 = new QosMonitorConfig();
       }
       this.mQosMonitorConfig = p0;
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, LivePlayerQosMonitor.class, "3")) {
          return;
       }
       this.stopMonitor();
       this.mLivePlayerQosListener = null;
       return;
    }
    public final long getBufferEmptyDurationMs(){
       LivePlayerQosMonitor obj = PatchProxy.apply(null, this, LivePlayerQosMonitor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mLiveMediaPlayer;
       long l = (obj != null)? obj.bufferEmptyDuration(): 0;
       return l;
    }
    public void monitorQosInfo(KwaiQosInfo p0,QosMonitorConfig p1){
       long l = this;
       Object obj = p0;
       LivePlayerQosMonitor obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, l, LivePlayerQosMonitor.class, "4")) {
          return;
       }
       if (!l.mLastTickTime) {
          l.mLastTickTime = SystemClock.elapsedRealtime();
          return;
       }else {
          long l1 = SystemClock.elapsedRealtime() - l.mLastTickTime;
          l.mLastTickTime = SystemClock.elapsedRealtime();
          l.mEmptyDataDurationMs = (!l.mLastTotalDataSize - obj.totalDataSize)? l.mEmptyDataDurationMs + l1: 0;
          int i = 0;
          QosLowReason qosLowReason = new QosLowReason();
          LivePlayerQosMonitor mEmptyDataDu = l.mEmptyDataDurationMs;
          int i1 = 1;
          if (mEmptyDataDu - (long)(obj1.mEmptyReadSizeDurationSec * 1000) >= 0) {
             qosLowReason.mReason = i1;
             qosLowReason.mEmptyDataDurationMs = mEmptyDataDu;
          }else if((LivePlayerUtils.getBufferEmptyDurationSec(l.mLiveMediaPlayer) - (float)l.mLastBufferEmptyDurationMs) - (float)(obj1.mStalledDurationSecInOneMinute * 1000) > 0){
             qosLowReason.mReason = 2;
             qosLowReason.mEmptyDataDurationMs = l.mEmptyDataDurationMs;
          }else if(i){
             l.mLogger.i("QosMonitor check player qos", "mEmptyDataDurationMs:", Long.valueOf(l.mEmptyDataDurationMs), "mLastTotalDataSize:", Long.valueOf(l.mLastTotalDataSize), "totalDataSize:", Long.valueOf(obj.totalDataSize), " elapse:", Long.valueOf(l1));
             l.mEmptyDataDurationMs = 0;
             l.mLastBufferEmptyDurationMs = 0;
             l.mLastCollectTime = 0;
             obj1 = l.mLivePlayerQosListener;
             if (obj1 != null) {
                obj1.qosTooLow(qosLowReason);
             }
          }
          if ((SystemClock.elapsedRealtime() - l.mLastCollectTime) - 0xea60 >= 0) {
             l.mLastBufferEmptyDurationMs = this.getBufferEmptyDurationMs();
             l.mLastCollectTime = SystemClock.elapsedRealtime();
          }
          l.mLastTotalDataSize = obj.totalDataSize;
          return;
          i = 1;
          goto label_0070 ;
       }
    }
    public void setLivePlayerQosListener(LivePlayerQosListener p0){
       this.mLivePlayerQosListener = p0;
    }
    public void setLogger(Logger p0){
       this.mLogger = p0;
    }
    public void startMonitor(IKwaiMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerQosMonitor.class, "1")) {
          return;
       }
       this.stopMonitor();
       this.mLogger.i("QosMonitor start");
       this.mLiveMediaPlayer = p0;
       this.mCustomTimer.start();
       KwaiQosInfo streamQosInf = LivePlayerUtils.getStreamQosInfo(this.mLiveMediaPlayer);
       if (streamQosInf != null) {
          this.mLastTotalDataSize = streamQosInf.totalDataSize;
          this.mEmptyDataDurationMs = 0;
          this.mLastBufferEmptyDurationMs = this.getBufferEmptyDurationMs();
       }
       return;
    }
    public void stopMonitor(){
       if (PatchProxy.applyVoid(null, this, LivePlayerQosMonitor.class, "2")) {
          return;
       }
       this.mLogger.i("QosMonitor stop");
       this.mLiveMediaPlayer = null;
       this.mCustomTimer.stop();
       this.mLastCollectTime = 0;
       this.mLastTotalDataSize = 0;
       this.mEmptyDataDurationMs = 0;
       this.mLastTickTime = 0;
       return;
    }
}
