package com.kuaishou.aryainstance.config.SnowConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class SnowConfig implements Serializable	// class@000fa7
{
    public Long activeSpeakerForceNotifyIntervalMs;
    public String appId;
    public String appName;
    public String appToken;
    public String appUserId;
    public String appVersion;
    public String aryaConfig;
    public int captureHeight;
    public int captureWidth;
    public String debugFilesPath;
    public String debugInfoInMeta;
    public String deviceId;
    public String documentRootPath;
    public long dumpEnableFlag;
    public String dumpPath;
    public boolean enableAudioPreProcess;
    public boolean enableAudioVad;
    public boolean enableDebugInfo;
    public boolean enableFrameRateDynAdapt;
    public boolean enableLowMemory;
    public boolean enableNeedleLog;
    public boolean enableNetState;
    public boolean enableSimulcast;
    public boolean enableVEncTest;
    public boolean enableVideoFrameByteBufferObjectPoolOpt;
    public boolean enableVideoRequest;
    public String freeTrafficType;
    public boolean isAnchor;
    public boolean isTargetToB;
    public boolean keepAspectRatioWithInput;
    public int ktpFlowMode;
    public float liveStreamEffectiveAreaX;
    public float liveStreamEffectiveAreaY;
    public boolean liveStreamKeepAspectRatio;
    public boolean localLoopback;
    public int makeCallTimeoutMs;
    public int momentsCapacityMs;
    public boolean offlineRecordDropFrame;
    public int offlineRecordMediaMode;
    public boolean offlineRecordNeedMux;
    public String packageName;
    public int previewHeight;
    public int previewWidth;
    public int qosEnableFlag;
    public int qosUploadInterval;
    public boolean requestAllVideos;
    public long rtcConnectTimeOutDurationMs;
    public int rtcMediaMode;
    public int speakerInactiveMinIntervalMs;
    public boolean useExternalAudioDevice;
    public boolean useOfflineRecord;
    public int userNetworkType;
    public int videoDropBefEncAvgFpsToNotify;
    public int videoDropBefEncStatPeriodMs;
    public boolean videoEnableCrop;
    public boolean videoEnableCutForVoiceParty;
    public boolean videoEnableHevc;
    public boolean videoEnableHwDec;
    public boolean videoEnableHwEnc;
    public boolean videoEnableInnerMix;
    public boolean videoEnableInsertFrameForChat;
    public String videoEncConfig;
    public float videoGuestPositionHeight;
    public float videoGuestPositionLeft;
    public float videoGuestPositionTop;
    public float videoGuestPositionWidth;
    public int videoInitBitrateKbps;
    public int videoKeyFrameInterval;
    public int videoMaxBitrateKbps;
    public int videoMinBitrateKbps;
    public int videoMinFpsForAdapt;
    public int videoPoolCapacity;
    public int videoTargetFps;
    public int videoTargetHeight;
    public int videoTargetWidth;
    public static final long serialVersionUID = 0xbc5837c534fbe13e;

    public void SnowConfig(){
       super();
       this.packageName = null;
       this.appName = null;
       this.appVersion = null;
       this.appUserId = null;
       this.deviceId = null;
       this.isAnchor = false;
       this.isTargetToB = false;
       this.appId = "qmsegc1ybxwgmochfalg5aklxyqckfkjf0mhgd9r";
       this.appToken = "k9m6axcmu9bnljuujydxxun3or11melgjk4tpand";
       this.qosEnableFlag = 3;
       this.qosUploadInterval = 0x2710;
       this.makeCallTimeoutMs = 5000;
       this.ktpFlowMode = 1;
       this.videoEnableHevc = false;
       this.videoEnableHwEnc = false;
       this.videoEnableHwDec = false;
       this.videoEncConfig = "";
       this.aryaConfig = "";
       this.videoTargetFps = 15;
       this.videoMinFpsForAdapt = 10;
       this.videoTargetWidth = 360;
       this.videoTargetHeight = 640;
       this.videoEnableCrop = false;
       this.videoEnableCutForVoiceParty = true;
       this.videoEnableInsertFrameForChat = true;
       this.videoEnableInnerMix = true;
       this.videoInitBitrateKbps = 450;
       this.videoMinBitrateKbps = 200;
       this.videoMaxBitrateKbps = 550;
       this.videoKeyFrameInterval = 4;
       this.videoDropBefEncStatPeriodMs = 1500;
       this.videoDropBefEncAvgFpsToNotify = 5;
       this.videoGuestPositionLeft = 0x3f333333;
       this.videoGuestPositionTop = 0x3f333333;
       this.videoGuestPositionWidth = 0.25f;
       this.videoGuestPositionHeight = 0.25f;
       this.speakerInactiveMinIntervalMs = 500;
       this.localLoopback = false;
       this.enableFrameRateDynAdapt = false;
       this.dumpEnableFlag = 0;
       this.dumpPath = "";
       this.documentRootPath = "";
       this.debugFilesPath = "";
       this.enableAudioVad = true;
       this.enableNeedleLog = false;
       this.enableVEncTest = false;
       this.useOfflineRecord = false;
       this.offlineRecordNeedMux = true;
       this.offlineRecordDropFrame = false;
       this.enableLowMemory = false;
       this.offlineRecordMediaMode = 2;
       this.rtcMediaMode = 2;
       this.videoPoolCapacity = 2;
       this.enableNetState = false;
       this.previewWidth = 0;
       this.previewHeight = 0;
       this.captureWidth = 0;
       this.captureHeight = 0;
       this.useExternalAudioDevice = false;
       this.enableAudioPreProcess = true;
       this.debugInfoInMeta = "";
       this.momentsCapacityMs = 0;
       this.enableVideoRequest = false;
       this.requestAllVideos = true;
       this.liveStreamKeepAspectRatio = false;
       this.liveStreamEffectiveAreaX = 0;
       this.liveStreamEffectiveAreaY = 0;
       this.userNetworkType = 0;
       this.freeTrafficType = "";
       this.enableDebugInfo = false;
       this.enableSimulcast = false;
       this.keepAspectRatioWithInput = false;
       this.enableVideoFrameByteBufferObjectPoolOpt = false;
       this.activeSpeakerForceNotifyIntervalMs = Long.valueOf(5000);
       this.rtcConnectTimeOutDurationMs = 0x3a98;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SnowConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SnowConfig{packageName=\'"+this.packageName+'''+", appName=\'"+this.appName+'''+", appVersion=\'"+this.appVersion+'''+", appUserId=\'"+this.appUserId+'''+", deviceId=\'"+this.deviceId+'''+", isAnchor="+this.isAnchor+", isTargetToB="+this.isTargetToB+", appId=\'"+this.appId+'''+", appToken=\'"+this.appToken+'''+", qosEnableFlag="+this.qosEnableFlag+", qosUploadInterval="+this.qosUploadInterval+", makeCallTimeoutMs="+this.makeCallTimeoutMs+", ktpFlowMode="+this.ktpFlowMode+", videoEnableHevc="+this.videoEnableHevc+", videoEnableHwEnc="+this.videoEnableHwEnc+", videoEnableHwDec="+this.videoEnableHwDec+", videoEncConfig=\'"+this.videoEncConfig+'''+", videoTargetFps="+this.videoTargetFps+", videoMinFpsForAdapt="+this.videoMinFpsForAdapt+", videoTargetWidth="+this.videoTargetWidth+", videoTargetHeight="+this.videoTargetHeight+", videoEnableCrop="+this.videoEnableCrop+", videoEnableCutForVoiceParty="+this.videoEnableCutForVoiceParty+", videoEnableInsertFrameForChat="+this.videoEnableInsertFrameForChat+", videoEnableInnerMix="+this.videoEnableInnerMix+", videoInitBitrateKbps="+this.videoInitBitrateKbps+", videoMinBitrateKbps="+this.videoMinBitrateKbps+", videoMaxBitrateKbps="+this.videoMaxBitrateKbps+", videoKeyFrameInterval="+this.videoKeyFrameInterval+", videoDropBefEncStatPeriodMs="+this.videoDropBefEncStatPeriodMs+", videoDropBefEncAvgFpsToNotify="+this.videoDropBefEncAvgFpsToNotify+", videoGuestPositionLeft="+this.videoGuestPositionLeft+", videoGuestPositionTop="+this.videoGuestPositionTop+", videoGuestPositionWidth="+this.videoGuestPositionWidth+", videoGuestPositionHeight="+this.videoGuestPositionHeight+", speakerInactiveMinIntervalMs="+this.speakerInactiveMinIntervalMs+", localLoopback="+this.localLoopback+", enableFrameRateDynAdapt="+this.enableFrameRateDynAdapt+", dumpEnableFlag="+this.dumpEnableFlag+", dumpPath=\'"+this.dumpPath+'''+", documentRootPath=\'"+this.documentRootPath+'''+", debugFilesPath=\'"+this.debugFilesPath+'''+", enableAudioVad="+this.enableAudioVad+"
    , enableNeedleLog="+this.enableNeedleLog+", enableVEncTest="+this.enableVEncTest+", useOfflineRecord="+this.useOfflineRecord+", offlineRecordNeedMux="+this.offlineRecordNeedMux+", offlineRecordDropFrame="+this.offlineRecordDropFrame+", enableLowMemory="+this.enableLowMemory+", offlineRecordMediaMode="+this.offlineRecordMediaMode+", rtcMediaMode="+this.rtcMediaMode+", videoPoolCapacity="+this.videoPoolCapacity+", enableNetState="+this.enableNetState+", previewWidth="+this.previewWidth+", previewHeight="+this.previewHeight+", captureWidth="+this.captureWidth+", captureHeight="+this.captureHeight+", useExternalAudioDevice="+this.useExternalAudioDevice+", enableAudioPreProcess="+this.enableAudioPreProcess+", debugInfoInMeta=\'"+this.debugInfoInMeta+'''+", momentsCapacityMs="+this.momentsCapacityMs+", enableVideoRequest="+this.enableVideoRequest+", requestAllVideos="+this.requestAllVideos+", liveStreamKeepAspectRatio="+this.liveStreamKeepAspectRatio+", liveStreamEffectiveAreaX="+this.liveStreamEffectiveAreaX@002a0d+", liveStreamEffectiveAreaY="+this.liveStreamEffectiveAreaY@002a0e+", userNetworkType="+this.userNetworkType@002a22+", freeTrafficType=\'"+this.freeTrafficType@002a08+'''+", enableDebugInfo="+this.enableDebugInfo@0029ff+", enableSimulcast="+this.enableSimulcast@002a04+", enableVideoFrameByteBufferObjectPoolOpt="+this.enableVideoFrameByteBufferObjectPoolOpt@002a06+", activeSpeakerForceNotifyIntervalMs="+this.activeSpeakerForceNotifyIntervalMs@0029ee+'}';
    }
}