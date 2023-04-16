package com.kuaishou.live.playeradapter.config.LivePlayerConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LivePlayerConfig	// class@000d44
{
    public boolean mEnableRealtimeQosLog;
    public LivePlayerConfig$LiveConfig mLiveConfig;
    public long mLivePlayTrafficReportIntervalMs;

    public void LivePlayerConfig(){
       super();
       this.mLivePlayTrafficReportIntervalMs = 0xea60;
       this.mEnableRealtimeQosLog = false;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePlayerConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveSimpleConfig{mLivePlayTrafficReportIntervalMs="+this.mLivePlayTrafficReportIntervalMs+", mEnableRealtimeQosLog="+this.mEnableRealtimeQosLog+", mLiveConfig="+this.mLiveConfig+'}';
    }
}
