package com.kwai.video.wayne.player.config.inerface.InjectConfigInterface;
import java.lang.String;
import ai7.d;

public interface abstract InjectConfigInterface	// class@000cdd
{

    boolean disableFallbackSwDecInStop();
    boolean enableAccurateSeekForHls();
    boolean enableAsyncStreamClose();
    boolean enableAudioConvert();
    boolean enableAudioMix();
    boolean enableBatteryInfo();
    boolean enableBrightnessInfo();
    boolean enableBuffingOptimize();
    boolean enableBulletScreenCache();
    boolean enableCollectBatteryInfoNew();
    boolean enableDecisionJointStrategy();
    boolean enableFirstFrameForceRendered();
    boolean enableGsonTypeAdapter();
    boolean enableHlsAutoSwitch();
    boolean enableIndependentCacheScope();
    boolean enableManifestRetryForHls();
    boolean enableMultiAudioDetector();
    boolean enablePlayerInstanceManager();
    boolean enablePlayerPipelineV2();
    boolean enablePlayerWindowDisconnect();
    boolean enableQuickStart();
    boolean enableThreadWakeupOptimize();
    boolean enableViewUtilNewMethod();
    int getAudioLatencyMS();
    int getClarityScore();
    boolean getClipHls264EnableMediacodec();
    boolean getClipHls265EnableMediacodec();
    int getHlsP2spMode();
    String getHlsSwitchConfig();
    boolean getKw265UsePthread();
    String getKwaivppJson(String p0);
    int getMediaCodecOesCompatType();
    d getSwitchProvider();
    String getVodAdaptiveRateConfigJson();
    boolean useMediaCodecAutoSwitcher();
    int useMediaCodecInvalidateVer();
    boolean useNoNetWorkInterruptByHodor();
}
