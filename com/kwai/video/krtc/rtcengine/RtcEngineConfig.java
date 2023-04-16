package com.kwai.video.krtc.rtcengine.RtcEngineConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class RtcEngineConfig	// class@0007f0
{
    public long activeSpeakerForceNotifyInterval;
    public long dumpEnableFlag;
    public String dumpPath;
    public boolean enableNetState;
    public int httpRequestTimeout;
    public int httpRetryCount;
    public String mAppId;
    public String mAppName;
    public String mAppToken;
    public String mAppVersion;
    public Context mContext;
    public String mDeviceId;
    public boolean mEnableDebugMode;
    public boolean mEnableNeedleLog;
    public boolean mEnableOpenApi;
    public IRtcEngineEventHandler mHandler;
    public String mUserId;
    public int userNetworkType;

    public void RtcEngineConfig(){
       super();
       this.mContext = null;
       this.dumpEnableFlag = 0;
       this.dumpPath = "";
       this.mEnableOpenApi = true;
       this.mEnableNeedleLog = false;
       this.mEnableDebugMode = false;
       this.userNetworkType = 0;
       this.httpRequestTimeout = 10;
       this.httpRetryCount = 1;
       this.enableNetState = false;
       this.activeSpeakerForceNotifyInterval = 0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RtcEngineConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RtcEngineConfig{mAppId=\'"+this.mAppId+'''+", mUserId=\'"+this.mUserId+'''+", mAppName=\'"+this.mAppName+'''+", mAppVersion=\'"+this.mAppVersion+'''+", mDeviceId=\'"+this.mDeviceId+'''+", mDumpFlag="+this.dumpEnableFlag+", dumpPath="+this.dumpPath+", mEnableOpenApi="+this.mEnableOpenApi+", userNetworkType="+this.userNetworkType+", httpRequestTimeout="+this.httpRequestTimeout+", httpRetryCount="+this.httpRetryCount+", enableNetState="+this.enableNetState+", activeSpeakerForceNotifyInterval="+this.activeSpeakerForceNotifyInterval+'}';
    }
}
