package com.kwai.player.qos.AppLiveAdaptiveRealtimeInfo;
import java.lang.Object;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class AppLiveAdaptiveRealtimeInfo	// class@0012f8
{
    public long audioBufferTime;
    public int bandwidthCurrent;
    public int bandwidthFragment;
    public int bitrateDownloading;
    public int bitratePlaying;
    public long cachedTagDurationMs;
    public long cachedTotalDurationMs;
    public long curRepFirstDataTime;
    public long curRepReadStartTime;
    public long curRepStartTime;
    public int currentBufferMs;
    public int estimateBufferMs;
    public int predictedBufferMs;
    public int repSwitchCnt;
    public long repSwitchGapTime;
    public int repSwitchPointVideoBufferTime;
    public long videoBufferTime;
    public static final String LiveAdaptiveRealtimeInfo_audioBufferTime = "audioBufferTime";
    public static final String LiveAdaptiveRealtimeInfo_bandwidthCurrent = "bandwidthCurrent";
    public static final String LiveAdaptiveRealtimeInfo_bandwidthFragment = "bandwidthFragment";
    public static final String LiveAdaptiveRealtimeInfo_bitrateDownloading = "bitrateDownloading";
    public static final String LiveAdaptiveRealtimeInfo_bitratePlaying = "bitratePlaying";
    public static final String LiveAdaptiveRealtimeInfo_cachedTagDurationMs = "cachedTagDurationMs";
    public static final String LiveAdaptiveRealtimeInfo_cachedTotalDurationMs = "cachedTotalDurationMs";
    public static final String LiveAdaptiveRealtimeInfo_curRepFirstDataTime = "curRepFirstDataTime";
    public static final String LiveAdaptiveRealtimeInfo_curRepReadStartTime = "curRepReadStartTime";
    public static final String LiveAdaptiveRealtimeInfo_curRepStartTime = "curRepStartTime";
    public static final String LiveAdaptiveRealtimeInfo_currentBufferMs = "currentBufferMs";
    public static final String LiveAdaptiveRealtimeInfo_estimateBufferMs = "estimateBufferMs";
    public static final String LiveAdaptiveRealtimeInfo_predictedBufferMs = "predictedBufferMs";
    public static final String LiveAdaptiveRealtimeInfo_repSwitchCnt = "repSwitchCnt";
    public static final String LiveAdaptiveRealtimeInfo_repSwitchGapTime = "repSwitchGapTime";
    public static final String LiveAdaptiveRealtimeInfo_repSwitchPointVideoBufferTime = "repSwitchPointVideoBufferTime";
    public static final String LiveAdaptiveRealtimeInfo_videoBufferTime = "videoBufferTime";

    public void AppLiveAdaptiveRealtimeInfo(){
       super();
    }
    public static AppLiveAdaptiveRealtimeInfo from(Bundle p0){
       Object obj = null;
       AppLiveAdaptiveRealtimeInfo obj1 = PatchProxy.applyOneRefs(p0, obj, AppLiveAdaptiveRealtimeInfo.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new AppLiveAdaptiveRealtimeInfo();
       obj1.videoBufferTime = p0.getLong("videoBufferTime", 0);
       obj1.audioBufferTime = p0.getLong("audioBufferTime", 0);
       obj1.bandwidthCurrent = p0.getInt("bandwidthCurrent", 0);
       obj1.bandwidthFragment = p0.getInt("bandwidthFragment", 0);
       obj1.bitrateDownloading = p0.getInt("bitrateDownloading", 0);
       obj1.bitratePlaying = p0.getInt("bitratePlaying", 0);
       obj1.currentBufferMs = p0.getInt("currentBufferMs", 0);
       obj1.estimateBufferMs = p0.getInt("estimateBufferMs", 0);
       obj1.predictedBufferMs = p0.getInt("predictedBufferMs", 0);
       obj1.curRepReadStartTime = p0.getLong("curRepReadStartTime", 0);
       obj1.curRepFirstDataTime = p0.getLong("curRepFirstDataTime", 0);
       obj1.curRepStartTime = p0.getLong("curRepStartTime", 0);
       obj1.repSwitchGapTime = p0.getLong("repSwitchGapTime", 0);
       obj1.repSwitchCnt = p0.getInt("repSwitchCnt", 0);
       obj1.repSwitchPointVideoBufferTime = p0.getInt("repSwitchPointVideoBufferTime", 0);
       obj1.cachedTagDurationMs = p0.getLong("cachedTagDurationMs", 0);
       obj1.cachedTotalDurationMs = p0.getLong("cachedTotalDurationMs", 0);
       return obj1;
    }
}
