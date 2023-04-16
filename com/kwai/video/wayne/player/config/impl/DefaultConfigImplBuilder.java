package com.kwai.video.wayne.player.config.impl.DefaultConfigImplBuilder;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface;
import java.lang.Object;
import com.kwai.video.wayne.player.config.module.StartPlayConfigModule;
import com.kwai.video.wayne.player.config.impl.DefaultConfigImplBuilder$1;
import com.kwai.video.wayne.player.config.ks_sub.VodP2spConfig;
import com.kwai.video.wayne.player.config.ks_sub.AzerothCommonConfig;
import java.lang.String;
import com.kwai.video.wayne.player.config.ks_sub.DccAlgSubConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.impl.DefaultConfigImplBuilder$DccAlgSubConfigGetter;
import com.kwai.video.wayne.player.config.ks_sub.DccOptConfig;
import com.kwai.video.wayne.player.config.impl.DefaultConfigImplBuilder$DccOptConfigGetter;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.config.hw_codec.VodMediaCodecConfig;
import java.lang.Boolean;
import com.kwai.video.wayne.player.config.impl.DefaultConfigImplBuilder$HwConfigGetter;
import java.lang.Number;
import com.kwai.video.wayne.player.config.inerface.VodP2spConfigInterface;
import java.util.List;
import com.kwai.video.wayne.player.config.module.StartPlayConfigModule$StartPlayConfigModuleGetter;
import ai7.d;
import com.kwai.video.wayne.player.config.ks_sub.UnifiedDccAlgConfig;
import com.kwai.video.wayne.player.config.impl.DefaultConfigImplBuilder$UnifiedDccAlgConfigGetter;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface$KSUserFeature;
import java.lang.CharSequence;
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig;
import com.kwai.video.wayne.player.config.ks_sub.SlideConfig;
import com.google.gson.Gson;
import com.kwai.video.wayne.player.config.impl.DefaultConfigImplBuilder$2;
import java.lang.reflect.Type;
import el.a;
import java.util.HashMap;
import java.lang.Double;

public class DefaultConfigImplBuilder implements KSConfigGetInterface	// class@000cd4
{
    public int audioLatencyMS;
    public String audioStr;
    public int bufferedDataSourceSizeKB;
    public int cacheDownloadConnectTimeoutMs;
    public int cacheDownloadReadTimeoutMs;
    public int cacheSocketBufKB;
    public int clarityScore;
    public boolean clipHls264EnableMediacodec;
    public boolean clipHls265EnableMediacodec;
    public boolean disableFallbackSwDecInStop;
    public boolean enableAccurateSeekForHls;
    public boolean enableAsyncStreamClose;
    public boolean enableAsyncStreamOpen;
    public boolean enableAudioConvert;
    public boolean enableAudioMix;
    public boolean enableBatteryInfo;
    public boolean enableBrightnessInfo;
    public boolean enableBuffingOptimize;
    public boolean enableBulletScreenCache;
    public int enableClipVodH264CheckSlideConfig;
    public int enableClipVodH265CheckSlideConfig;
    public boolean enableCollectBatteryInfoNew;
    public boolean enableDecisionJointStrategy;
    public boolean enableFirstFrameForceRendered;
    public boolean enableGsonTypeAdapter;
    public boolean enableHlsAutoSwitch;
    public boolean enableIndependentCacheScope;
    public boolean enableManifestRetryForHls;
    public boolean enableMediaCodecDummySurface;
    public boolean enableMultiAudioDetector;
    public boolean enablePlayerInstanceManager;
    public boolean enablePlayerPipelineV2;
    public boolean enablePlayerWindowDisconnect;
    public boolean enableQuickStart;
    public boolean enableSoftwareDecodeLimit;
    public boolean enableThreadWakeupOptimize;
    public boolean enableViewUtilNewMethod;
    public int fadeinEndTimeMs;
    public int fadeinEndTimeMs_slide;
    public int firstHighWaterMarkMs;
    public double hardDecodeKvcHevcBitrateThres;
    public double hardDecodeKvcHevcBitrateThresForCharging;
    public int hlsP2spMode;
    public String hlsSwitchConfig;
    public boolean isEnablePlaylistCache;
    public boolean kw265UsePthread;
    public d kwaiSwitchProvider;
    public String kwaivppJson;
    public int lastHighWaterMarkMs;
    public AzerothCommonConfig mAzerothCommonConfig;
    public DefaultConfigImplBuilder$DccAlgSubConfigGetter mDccAlgSubConfigGetter;
    public DefaultConfigImplBuilder$DccOptConfigGetter mDccOptConfigGetter;
    public int mEnableAdPlcType;
    public DefaultConfigImplBuilder$HwConfigGetter mHwConfigGetter;
    public int mHwDecPlayScene;
    public String mPlayerKwaiSrConfig;
    public List mQualityLive;
    public StartPlayConfigModule$StartPlayConfigModuleGetter mStartPlayConfigModuleGetter;
    public int mSwDecodeMaxResolution;
    public DefaultConfigImplBuilder$UnifiedDccAlgConfigGetter mUnifiedDccAlgConfigGetter;
    public KSConfigGetInterface$KSUserFeature mUserFeature;
    public int maxBufferDurMs;
    public int maxBufferSize;
    public int mediaCodecOesCompatType;
    public String mediacodecDecodeTypeStr;
    public int minSeekReopenThresoldSizeKb;
    public int nextHighWaterMarkMs;
    public int overlayOutputPixelFormat;
    public VodP2spConfigInterface p2spConfig;
    public VodP2spConfigInterface p2spConfig_slide;
    public int seekHighWaterMarkMs;
    public int segmentCacheCount;
    public int slidePlayPreLoadType;
    public int softwareDecodeFpsLimit;
    public int softwareDecodeHeightLimit;
    public int softwareDecodeWidthLimit;
    public boolean useAudioGain;
    public boolean useMediaCodecAutoSwitcher;
    public int useMediaCodecInvalidateVer;
    public boolean useNoNetWorkInterruptByHodor;
    public int videoPictureQueueSize;
    public String vodAdaptiveRateConfigJson;
    public boolean vodEnableAvSyncOpt;
    public String vodKs265Params;
    public int vodLowDevice;
    public int vodOverlayOutputPixelFormat;
    public static DefaultConfigImplBuilder mKsConfigImpl;

    static {
       DefaultConfigImplBuilder.mKsConfigImpl = new DefaultConfigImplBuilder();
    }
    public void DefaultConfigImplBuilder(){
       super();
       this.mStartPlayConfigModuleGetter = StartPlayConfigModule.DefaultStartPlayConfigModuleGetter;
       this.vodKs265Params = "";
       this.audioStr = "0";
       this.enableClipVodH265CheckSlideConfig = -1;
       this.enableClipVodH264CheckSlideConfig = -1;
       this.enableMediaCodecDummySurface = false;
       this.videoPictureQueueSize = 3;
       this.enableSoftwareDecodeLimit = false;
       this.softwareDecodeWidthLimit = 1600;
       this.softwareDecodeHeightLimit = 1600;
       this.softwareDecodeFpsLimit = 30;
       this.vodEnableAvSyncOpt = false;
       this.hardDecodeKvcHevcBitrateThres = 0;
       this.hardDecodeKvcHevcBitrateThresForCharging = 0;
       this.mediacodecDecodeTypeStr = "";
       this.vodLowDevice = 0;
       this.maxBufferDurMs = 0xea60;
       this.fadeinEndTimeMs = -1;
       this.cacheSocketBufKB = 64;
       this.enableAsyncStreamOpen = false;
       this.useAudioGain = false;
       this.enableAudioConvert = false;
       this.enableHlsAutoSwitch = true;
       this.kw265UsePthread = false;
       this.enablePlayerWindowDisconnect = false;
       this.clipHls265EnableMediacodec = false;
       this.clipHls264EnableMediacodec = false;
       this.enablePlayerPipelineV2 = true;
       this.enableAsyncStreamClose = false;
       this.disableFallbackSwDecInStop = false;
       this.enableThreadWakeupOptimize = false;
       this.enableBuffingOptimize = false;
       this.enableQuickStart = false;
       this.enableManifestRetryForHls = false;
       this.enableMultiAudioDetector = false;
       this.enableFirstFrameForceRendered = false;
       this.enableViewUtilNewMethod = false;
       this.enableCollectBatteryInfoNew = false;
       this.enableBrightnessInfo = false;
       this.enableGsonTypeAdapter = true;
       this.enablePlayerInstanceManager = false;
       this.useMediaCodecAutoSwitcher = false;
       this.kwaivppJson = "";
       this.useMediaCodecInvalidateVer = 0;
       this.enableBulletScreenCache = false;
       this.enableAudioMix = false;
       this.enableAccurateSeekForHls = false;
       this.enableDecisionJointStrategy = false;
       this.useNoNetWorkInterruptByHodor = false;
       this.vodAdaptiveRateConfigJson = "";
       this.hlsSwitchConfig = "";
       this.hlsP2spMode = 0;
       this.mediaCodecOesCompatType = 0;
       this.audioLatencyMS = -1;
       this.clarityScore = 0;
       this.kwaiSwitchProvider = new DefaultConfigImplBuilder$1(this);
       this.enableBatteryInfo = true;
       this.vodOverlayOutputPixelFormat = 0;
       this.overlayOutputPixelFormat = 0x32335652;
       this.segmentCacheCount = 1;
       this.isEnablePlaylistCache = false;
       this.fadeinEndTimeMs_slide = 600;
       this.slidePlayPreLoadType = 3;
       this.p2spConfig = new VodP2spConfig();
       this.p2spConfig_slide = new VodP2spConfig();
       this.firstHighWaterMarkMs = 100;
       this.nextHighWaterMarkMs = 1000;
       this.lastHighWaterMarkMs = 5000;
       this.seekHighWaterMarkMs = -1;
       this.cacheDownloadConnectTimeoutMs = 3000;
       this.cacheDownloadReadTimeoutMs = 5000;
       this.bufferedDataSourceSizeKB = 64;
       this.minSeekReopenThresoldSizeKb = 160;
       this.mSwDecodeMaxResolution = 0x151800;
       this.mHwDecPlayScene = 1;
       this.maxBufferSize = -1;
       this.mAzerothCommonConfig = new AzerothCommonConfig();
       this.mEnableAdPlcType = -1;
    }
    public KSConfigGetInterface bulid(){
       return this;
    }
    public boolean disableFallbackSwDecInStop(){
       return this.disableFallbackSwDecInStop;
    }
    public boolean enableAccurateSeekForHls(){
       return this.enableAccurateSeekForHls;
    }
    public boolean enableAsyncStreamClose(){
       return this.enableAsyncStreamClose;
    }
    public boolean enableAsyncStreamOpen(){
       return this.enableAsyncStreamOpen;
    }
    public boolean enableAudioConvert(){
       return this.enableAudioConvert;
    }
    public boolean enableAudioMix(){
       return this.enableAudioMix;
    }
    public boolean enableBatteryInfo(){
       return this.enableBatteryInfo;
    }
    public boolean enableBrightnessInfo(){
       return this.enableBrightnessInfo;
    }
    public boolean enableBuffingOptimize(){
       return this.enableBuffingOptimize;
    }
    public boolean enableBulletScreenCache(){
       return this.enableBulletScreenCache;
    }
    public boolean enableClipsCheckSlideConfig(int p0,int p1){
       boolean b = false;
       if (p0 == 1) {
          if (p1 == 1) {
             if (this.enableClipVodH264CheckSlideConfig > null) {
                b = true;
             }
             return b;
          }else if(p1 == 2){
             if (this.enableClipVodH265CheckSlideConfig > null) {
                b = true;
             }
             return b;
          }
       }else if(p0 == 2){
          if (p1 == 1) {
             return this.clipHls264EnableMediacodec;
          }else if(p1 == 2){
             return this.clipHls265EnableMediacodec;
          }
       }
       return b;
    }
    public boolean enableCollectBatteryInfoNew(){
       return this.enableCollectBatteryInfoNew;
    }
    public boolean enableDecisionJointStrategy(){
       return this.enableDecisionJointStrategy;
    }
    public boolean enableFirstFrameForceRendered(){
       return this.enableFirstFrameForceRendered;
    }
    public boolean enableGsonTypeAdapter(){
       return this.enableGsonTypeAdapter;
    }
    public boolean enableHlsAutoSwitch(){
       return this.enableHlsAutoSwitch;
    }
    public boolean enableIndependentCacheScope(){
       return this.enableIndependentCacheScope;
    }
    public boolean enableManifestRetryForHls(){
       return this.enableManifestRetryForHls;
    }
    public boolean enableMultiAudioDetector(){
       return this.enableMultiAudioDetector;
    }
    public boolean enablePlayerInstanceManager(){
       return this.enablePlayerInstanceManager;
    }
    public boolean enablePlayerPipelineV2(){
       return this.enablePlayerPipelineV2;
    }
    public boolean enablePlayerWindowDisconnect(){
       return this.enablePlayerWindowDisconnect;
    }
    public boolean enableQuickStart(){
       return this.enableQuickStart;
    }
    public boolean enableThreadWakeupOptimize(){
       return this.enableThreadWakeupOptimize;
    }
    public boolean enableViewUtilNewMethod(){
       return this.enableViewUtilNewMethod;
    }
    public int getAudioLatencyMS(){
       return this.audioLatencyMS;
    }
    public String getAudioStr(){
       return this.audioStr;
    }
    public AzerothCommonConfig getAzerothCommonConfig(){
       return this.mAzerothCommonConfig;
    }
    public int getBufferedDataSourceSizeKB(){
       return this.bufferedDataSourceSizeKB;
    }
    public int getCacheDownloadConnectTimeoutMs(){
       return this.cacheDownloadConnectTimeoutMs;
    }
    public int getCacheDownloadReadTimeoutMs(){
       return this.cacheDownloadReadTimeoutMs;
    }
    public int getCacheSocketBufKB(){
       return this.cacheSocketBufKB;
    }
    public int getClarityScore(){
       return this.clarityScore;
    }
    public boolean getClipHls264EnableMediacodec(){
       return this.clipHls264EnableMediacodec;
    }
    public boolean getClipHls265EnableMediacodec(){
       return this.clipHls265EnableMediacodec;
    }
    public DccAlgSubConfig getDccAlgConfig(int p0){
       DefaultConfigImplBuilder uDefaultConf = DefaultConfigImplBuilder.class;
       if (PatchProxy.isSupport(uDefaultConf)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uDefaultConf, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uDefaultConf = this.mDccAlgSubConfigGetter;
       if (uDefaultConf != null) {
          return uDefaultConf.getDccAlgSubConfig(p0);
       }else {
          return null;
       }
    }
    public DccOptConfig getDccOptConfig(int p0){
       DefaultConfigImplBuilder uDefaultConf = DefaultConfigImplBuilder.class;
       if (PatchProxy.isSupport(uDefaultConf)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uDefaultConf, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uDefaultConf = this.mDccOptConfigGetter;
       if (uDefaultConf != null) {
          return uDefaultConf.getDccOptConfig(p0);
       }else {
          return null;
       }
    }
    public int getEnableAdPlcType(){
       return this.mEnableAdPlcType;
    }
    public int getEnableClipVodH264CheckSlideConfig(){
       return this.enableClipVodH264CheckSlideConfig;
    }
    public int getEnableClipVodH265CheckSlideConfig(){
       return this.enableClipVodH265CheckSlideConfig;
    }
    public int getFadeinEndTimeMs(){
       return this.fadeinEndTimeMs;
    }
    public int getFadeinEndTimeMs_slide(){
       return this.fadeinEndTimeMs_slide;
    }
    public int getFirstHighWaterMarkMs(){
       return this.firstHighWaterMarkMs;
    }
    public double getHardDecodeKvcHevcBitrateThres(){
       return this.hardDecodeKvcHevcBitrateThres;
    }
    public double getHardDecodeKvcHevcBitrateThresForCharging(){
       return this.hardDecodeKvcHevcBitrateThresForCharging;
    }
    public int getHlsP2spMode(){
       return this.hlsP2spMode;
    }
    public String getHlsSwitchConfig(){
       return this.hlsSwitchConfig;
    }
    public VodMediaCodecConfig getHwCodecConfig(WayneBuildData p0,boolean p1,boolean p2){
       DefaultConfigImplBuilder obj;
       if (PatchProxy.isSupport(DefaultConfigImplBuilder.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, DefaultConfigImplBuilder.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.mHwConfigGetter;
       if (obj != null) {
          return obj.getHwConfig(p0, p1, p2);
       }else {
          VodMediaCodecConfig vodMediaCode = new VodMediaCodecConfig(false, true, 1920, 1920, true, 1920, 1920, 3);
          return p0;
       }
    }
    public int getHwDecPlayScene(){
       return this.mHwDecPlayScene;
    }
    public boolean getKw265UsePthread(){
       return this.kw265UsePthread;
    }
    public String getKwaivppJson(String p0){
       return this.kwaivppJson;
    }
    public int getLastHighWaterMarkMs(){
       return this.lastHighWaterMarkMs;
    }
    public int getMaxBufBspMs(){
       return 0;
    }
    public int getMaxBufStrategy(){
       return 0;
    }
    public int getMaxBufStrategyForSlide(){
       return 0;
    }
    public int getMaxBufferDurMs(){
       return this.maxBufferDurMs;
    }
    public int getMaxBufferSize(){
       return this.maxBufferSize;
    }
    public int getMediaCodecOesCompatType(){
       return this.mediaCodecOesCompatType;
    }
    public String getMediacodecDecodeTypeStr(){
       return this.mediacodecDecodeTypeStr;
    }
    public int getMinSeekReopenThresoldSizeKb(){
       return this.minSeekReopenThresoldSizeKb;
    }
    public int getNextHighWaterMarkMs(){
       return this.nextHighWaterMarkMs;
    }
    public int getOverlayOutputPixelFormat(){
       return this.overlayOutputPixelFormat;
    }
    public int getP2spCdnRequestInitialSize(boolean p0){
       DefaultConfigImplBuilder uDefaultConf = DefaultConfigImplBuilder.class;
       if (PatchProxy.isSupport(uDefaultConf)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uDefaultConf, "13");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.getP2spConfigBySlide(p0).getP2spCdnRequestInitialSize(p0);
    }
    public int getP2spCdnRequestMaxSize(boolean p0){
       DefaultConfigImplBuilder uDefaultConf = DefaultConfigImplBuilder.class;
       if (PatchProxy.isSupport(uDefaultConf)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uDefaultConf, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.getP2spConfigBySlide(p0).getP2spCdnRequestMaxSize(p0);
    }
    public final VodP2spConfigInterface getP2spConfigBySlide(boolean p0){
       DefaultConfigImplBuilder tp2spConfig_ = (p0)? this.p2spConfig_slide: this.p2spConfig;
       return tp2spConfig_;
    }
    public int getP2spOffThreshold(boolean p0){
       DefaultConfigImplBuilder uDefaultConf = DefaultConfigImplBuilder.class;
       if (PatchProxy.isSupport(uDefaultConf)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uDefaultConf, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.getP2spConfigBySlide(p0).getP2spOffThreshold(p0);
    }
    public int getP2spOnThreshold(boolean p0){
       DefaultConfigImplBuilder uDefaultConf = DefaultConfigImplBuilder.class;
       if (PatchProxy.isSupport(uDefaultConf)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uDefaultConf, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.getP2spConfigBySlide(p0).getP2spOnThreshold(p0);
    }
    public String getP2spParams(boolean p0){
       DefaultConfigImplBuilder uDefaultConf = DefaultConfigImplBuilder.class;
       if (PatchProxy.isSupport(uDefaultConf)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uDefaultConf, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.getP2spConfigBySlide(p0).getP2spParams(p0);
    }
    public String getP2spPolicy(boolean p0){
       DefaultConfigImplBuilder uDefaultConf = DefaultConfigImplBuilder.class;
       if (PatchProxy.isSupport(uDefaultConf)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uDefaultConf, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.getP2spConfigBySlide(p0).getP2spPolicy(p0);
    }
    public int getP2spTaskMaxSize(boolean p0){
       DefaultConfigImplBuilder uDefaultConf = DefaultConfigImplBuilder.class;
       if (PatchProxy.isSupport(uDefaultConf)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uDefaultConf, "11");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.getP2spConfigBySlide(p0).getP2spTaskMaxSize(p0);
    }
    public String getP2spTaskVersion(boolean p0){
       DefaultConfigImplBuilder uDefaultConf = DefaultConfigImplBuilder.class;
       if (PatchProxy.isSupport(uDefaultConf)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uDefaultConf, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.getP2spConfigBySlide(p0).getP2spTaskVersion(p0);
    }
    public int getPdStartPlayMaxMs(){
       return 0;
    }
    public int getPdStartPlayMaxMsSlide(){
       return 0;
    }
    public int getPdStartPlayTh(){
       return 0;
    }
    public int getPdStartPlayThSlide(){
       return 0;
    }
    public List getQualityList(){
       return this.mQualityLive;
    }
    public int getSeekHighWaterMarkMs(){
       return this.seekHighWaterMarkMs;
    }
    public int getSegmentCacheCount(){
       return this.segmentCacheCount;
    }
    public int getSoftwareDecodeFpsLimit(){
       return this.softwareDecodeFpsLimit;
    }
    public int getSoftwareDecodeHeightLimit(){
       return this.softwareDecodeHeightLimit;
    }
    public int getSoftwareDecodeWidthLimit(){
       return this.softwareDecodeWidthLimit;
    }
    public StartPlayConfigModule getStartPlayConfig(int p0,boolean p1){
       DefaultConfigImplBuilder uDefaultConf = DefaultConfigImplBuilder.class;
       if (PatchProxy.isSupport(uDefaultConf)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uDefaultConf, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uDefaultConf = this.mStartPlayConfigModuleGetter;
       if (uDefaultConf != null) {
          return uDefaultConf.getStartPlayConfig(p0, p1);
       }else {
          return null;
       }
    }
    public int getSwDecodeMaxResolution(){
       return this.mSwDecodeMaxResolution;
    }
    public d getSwitchProvider(){
       return this.kwaiSwitchProvider;
    }
    public UnifiedDccAlgConfig getUnifiedDccAlgConfig(int p0){
       DefaultConfigImplBuilder uDefaultConf = DefaultConfigImplBuilder.class;
       if (PatchProxy.isSupport(uDefaultConf)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uDefaultConf, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uDefaultConf = this.mUnifiedDccAlgConfigGetter;
       if (uDefaultConf != null) {
          return uDefaultConf.getUnifiedDccAlgConfig(p0);
       }else {
          return null;
       }
    }
    public KSConfigGetInterface$KSUserFeature getUserFeature(){
       return this.mUserFeature;
    }
    public int getVideoPictureQueueSize(){
       return this.videoPictureQueueSize;
    }
    public String getVodAdaptiveRateConfigJson(){
       return this.vodAdaptiveRateConfigJson;
    }
    public String getVodKs265Params(){
       return this.vodKs265Params;
    }
    public int getVodLowDevice(){
       return this.vodLowDevice;
    }
    public int getVodOverlayOutputPixelFormat(){
       return this.vodOverlayOutputPixelFormat;
    }
    public boolean isEnableMediaCodecDummySurface(){
       return this.enableMediaCodecDummySurface;
    }
    public boolean isEnablePlaylistCache(){
       return this.isEnablePlaylistCache;
    }
    public boolean isEnableSoftwareDecodeLimit(){
       return this.enableSoftwareDecodeLimit;
    }
    public boolean isEnabledByMediaCodecType(int p0,int p1){
       DefaultConfigImplBuilder uDefaultConf = DefaultConfigImplBuilder.class;
       if (PatchProxy.isSupport(uDefaultConf)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uDefaultConf, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == 1 || p0 == 2) {
          if (p1 == 1) {
             return (this.mediacodecDecodeTypeStr).contains("v264");
          }else if(p1 == 2){
             return (this.mediacodecDecodeTypeStr).contains("v265");
          }
       }else if(p0 == 3){
          if (p1 == 1) {
             return (this.mediacodecDecodeTypeStr).contains("v264");
          }else if(p1 == 2){
             return (this.mediacodecDecodeTypeStr).contains("v265");
          }
       }
       return false;
    }
    public boolean isP2spHoleIgnoreSpeedcal(boolean p0){
       DefaultConfigImplBuilder uDefaultConf = DefaultConfigImplBuilder.class;
       if (PatchProxy.isSupport(uDefaultConf)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uDefaultConf, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return InjectConfig.getConfig().getVodP2spConfig(p0).isP2spHoleIgnoreSpeedcal(p0);
    }
    public boolean isUseHw(int p0,int p1){
       DefaultConfigImplBuilder uDefaultConf = DefaultConfigImplBuilder.class;
       if (PatchProxy.isSupport(uDefaultConf)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uDefaultConf, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return SlideConfig.getConfig().isUseHw(p0, p1);
    }
    public boolean isVodEnableAvSyncOpt(){
       return this.vodEnableAvSyncOpt;
    }
    public final void parseSrConfig(){
       if (PatchProxy.applyVoid(null, this, DefaultConfigImplBuilder.class, "18")) {
          return;
       }
       int i = 0;
       this.mEnableAdPlcType = i;
       if (!(this.mPlayerKwaiSrConfig).equals("")) {
          HashMap hashMap = new Gson().i(this.mPlayerKwaiSrConfig, new DefaultConfigImplBuilder$2(this).getType()).get("sr");
          if (hashMap != null) {
             Object obj = hashMap.get("enableAdPlcType");
             if (obj != null) {
                i = (int)Double.parseDouble(obj.toString());
             }
             this.mEnableAdPlcType = i;
          }
       }
       return;
    }
    public DefaultConfigImplBuilder seEenableBatteryInfo(boolean p0){
       this.enableBatteryInfo = p0;
       return this;
    }
    public DefaultConfigImplBuilder setAudioLatencyMS(int p0){
       this.audioLatencyMS = p0;
       return this;
    }
    public DefaultConfigImplBuilder setAudioStr(String p0){
       this.audioStr = p0;
       return this;
    }
    public DefaultConfigImplBuilder setAzerothCommonConfig(AzerothCommonConfig p0){
       this.mAzerothCommonConfig = p0;
       return this;
    }
    public DefaultConfigImplBuilder setBufferedDataSourceSizeKB(int p0){
       this.bufferedDataSourceSizeKB = p0;
       return this;
    }
    public DefaultConfigImplBuilder setCacheDownloadConnectTimeoutMs(int p0){
       this.cacheDownloadConnectTimeoutMs = p0;
       return this;
    }
    public DefaultConfigImplBuilder setCacheDownloadReadTimeoutMs(int p0){
       this.cacheDownloadReadTimeoutMs = p0;
       return this;
    }
    public DefaultConfigImplBuilder setCacheSocketBufKB(int p0){
       this.cacheSocketBufKB = p0;
       return this;
    }
    public DefaultConfigImplBuilder setClarityScore(int p0){
       this.clarityScore = p0;
       return this;
    }
    public DefaultConfigImplBuilder setClipHls264EnableMediacodec(boolean p0){
       this.clipHls264EnableMediacodec = p0;
       return this;
    }
    public DefaultConfigImplBuilder setClipHls265EnableMediacodec(boolean p0){
       this.clipHls265EnableMediacodec = p0;
       return this;
    }
    public DefaultConfigImplBuilder setDccAlgSubConfigGetter(DefaultConfigImplBuilder$DccAlgSubConfigGetter p0){
       this.mDccAlgSubConfigGetter = p0;
       return this;
    }
    public DefaultConfigImplBuilder setDccOptConfigGetter(DefaultConfigImplBuilder$DccOptConfigGetter p0){
       this.mDccOptConfigGetter = p0;
       return this;
    }
    public DefaultConfigImplBuilder setDisableFallbackSwDecInStop(boolean p0){
       this.disableFallbackSwDecInStop = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableAccurateSeekForHls(boolean p0){
       this.enableAccurateSeekForHls = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableAsyncStreamClose(boolean p0){
       this.enableAsyncStreamClose = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableAsyncStreamOpen(boolean p0){
       this.enableAsyncStreamOpen = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableAudioConvert(boolean p0){
       this.enableAudioConvert = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableAudioMix(boolean p0){
       this.enableAudioMix = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableBrightnessInfo(boolean p0){
       this.enableBrightnessInfo = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableBuffingOptimize(boolean p0){
       this.enableBuffingOptimize = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableBulletScreenCache(boolean p0){
       this.enableBulletScreenCache = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableClipVodH264CheckSlideConfig(int p0){
       this.enableClipVodH264CheckSlideConfig = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableClipVodH265CheckSlideConfig(int p0){
       this.enableClipVodH265CheckSlideConfig = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableCollectBatteryInfoNew(boolean p0){
       this.enableCollectBatteryInfoNew = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableDecisionJointStrategy(boolean p0){
       this.enableDecisionJointStrategy = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableFirstFrameForceRendered(boolean p0){
       this.enableFirstFrameForceRendered = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableGsonTypeAdapter(boolean p0){
       this.enableGsonTypeAdapter = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableHlsAutoSwitch(boolean p0){
       this.enableHlsAutoSwitch = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableIndependentCacheScope(boolean p0){
       this.enableIndependentCacheScope = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableManifestRetryForHls(boolean p0){
       this.enableManifestRetryForHls = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableMediaCodecDummySurface(boolean p0){
       this.enableMediaCodecDummySurface = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableMultiAudioDetector(boolean p0){
       this.enableMultiAudioDetector = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnablePlayerInstanceManager(boolean p0){
       this.enablePlayerInstanceManager = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnablePlayerPipelineV2(boolean p0){
       this.enablePlayerPipelineV2 = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnablePlayerWindowDisconnect(boolean p0){
       this.enablePlayerWindowDisconnect = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnablePlaylistCache(boolean p0){
       this.isEnablePlaylistCache = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableQuickStart(boolean p0){
       this.enableQuickStart = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableSoftwareDecodeLimit(boolean p0){
       this.enableSoftwareDecodeLimit = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableThreadWakeupOptimize(boolean p0){
       this.enableThreadWakeupOptimize = p0;
       return this;
    }
    public DefaultConfigImplBuilder setEnableViewUtilNewMethod(boolean p0){
       this.enableViewUtilNewMethod = p0;
       return this;
    }
    public DefaultConfigImplBuilder setFadeinEndTimeMs(int p0){
       this.fadeinEndTimeMs = p0;
       return this;
    }
    public DefaultConfigImplBuilder setFadeinEndTimeMs_slide(int p0){
       this.fadeinEndTimeMs_slide = p0;
       return this;
    }
    public DefaultConfigImplBuilder setFirstHighWaterMarkMs(int p0){
       this.firstHighWaterMarkMs = p0;
       return this;
    }
    public DefaultConfigImplBuilder setHardDecodeKvcHevcBitrateThres(double p0){
       this.hardDecodeKvcHevcBitrateThres = p0;
       return this;
    }
    public DefaultConfigImplBuilder setHardDecodeKvcHevcBitrateThresForCharging(double p0){
       this.hardDecodeKvcHevcBitrateThresForCharging = p0;
       return this;
    }
    public DefaultConfigImplBuilder setHlsP2spMode(int p0){
       this.hlsP2spMode = p0;
       return this;
    }
    public DefaultConfigImplBuilder setHlsSwitchConfig(String p0){
       this.hlsSwitchConfig = p0;
       return this;
    }
    public DefaultConfigImplBuilder setHwCodecConfigGetter(DefaultConfigImplBuilder$HwConfigGetter p0){
       this.mHwConfigGetter = p0;
       return this;
    }
    public DefaultConfigImplBuilder setHwDecPlayScene(int p0){
       this.mHwDecPlayScene = p0;
       return this;
    }
    public DefaultConfigImplBuilder setKw265UsePthread(boolean p0){
       this.kw265UsePthread = p0;
       return this;
    }
    public DefaultConfigImplBuilder setKwaivppJson(String p0){
       this.kwaivppJson = p0;
       return this;
    }
    public DefaultConfigImplBuilder setLastHighWaterMarkMs(int p0){
       this.lastHighWaterMarkMs = p0;
       return this;
    }
    public DefaultConfigImplBuilder setMaxBufferDurMs(int p0){
       this.maxBufferDurMs = p0;
       return this;
    }
    public DefaultConfigImplBuilder setMaxBufferSize(int p0){
       this.maxBufferSize = p0;
       return this;
    }
    public DefaultConfigImplBuilder setMediaCodecOesCompatType(int p0){
       this.mediaCodecOesCompatType = p0;
       return this;
    }
    public DefaultConfigImplBuilder setMediacodecDecodeTypeStr(String p0){
       this.mediacodecDecodeTypeStr = p0;
       return this;
    }
    public DefaultConfigImplBuilder setMinSeekReopenThresoldSizeKb(int p0){
       this.minSeekReopenThresoldSizeKb = p0;
       return this;
    }
    public DefaultConfigImplBuilder setNextHighWaterMarkMs(int p0){
       this.nextHighWaterMarkMs = p0;
       return this;
    }
    public DefaultConfigImplBuilder setOverlayOutputPixelFormat(int p0){
       this.overlayOutputPixelFormat = p0;
       return this;
    }
    public DefaultConfigImplBuilder setP2spConfig(VodP2spConfigInterface p0){
       this.p2spConfig = p0;
       return this;
    }
    public DefaultConfigImplBuilder setP2spConfigSlide(VodP2spConfigInterface p0){
       this.p2spConfig_slide = p0;
       return this;
    }
    public DefaultConfigImplBuilder setPlayerKwaiSrConfig(String p0){
       DefaultConfigImplBuilder obj = PatchProxy.applyOneRefs(p0, this, DefaultConfigImplBuilder.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPlayerKwaiSrConfig;
       if (obj == null || !obj.equals(p0)) {
          this.mPlayerKwaiSrConfig = p0;
          this.parseSrConfig();
       }
       return this;
    }
    public void setQualityList(List p0){
       this.mQualityLive = p0;
    }
    public DefaultConfigImplBuilder setSeekHighWaterMarkMs(int p0){
       this.seekHighWaterMarkMs = p0;
       return this;
    }
    public DefaultConfigImplBuilder setSegmentCacheCount(int p0){
       this.segmentCacheCount = p0;
       return this;
    }
    public DefaultConfigImplBuilder setSlidePlayPreLoadType(int p0){
       this.slidePlayPreLoadType = p0;
       return this;
    }
    public DefaultConfigImplBuilder setSoftwareDecodeFpsLimit(int p0){
       this.softwareDecodeFpsLimit = p0;
       return this;
    }
    public DefaultConfigImplBuilder setSoftwareDecodeHeightLimit(int p0){
       this.softwareDecodeHeightLimit = p0;
       return this;
    }
    public DefaultConfigImplBuilder setSoftwareDecodeWidthLimit(int p0){
       this.softwareDecodeWidthLimit = p0;
       return this;
    }
    public DefaultConfigImplBuilder setStartPlayConfigGetter(StartPlayConfigModule$StartPlayConfigModuleGetter p0){
       this.mStartPlayConfigModuleGetter = p0;
       return this;
    }
    public DefaultConfigImplBuilder setSwDecodeMaxResolution(int p0){
       this.mSwDecodeMaxResolution = p0;
       return this;
    }
    public DefaultConfigImplBuilder setSwitchProvider(d p0){
       this.kwaiSwitchProvider = p0;
       return this;
    }
    public DefaultConfigImplBuilder setUnifiedDccAlgConfigGetter(DefaultConfigImplBuilder$UnifiedDccAlgConfigGetter p0){
       this.mUnifiedDccAlgConfigGetter = p0;
       return this;
    }
    public DefaultConfigImplBuilder setUseAudioGain(boolean p0){
       this.useAudioGain = p0;
       return this;
    }
    public DefaultConfigImplBuilder setUseMediaCodecAutoSwitcher(boolean p0){
       this.useMediaCodecAutoSwitcher = p0;
       return this;
    }
    public DefaultConfigImplBuilder setUseMediaCodecInvalidateVer(int p0){
       this.useMediaCodecInvalidateVer = p0;
       return this;
    }
    public DefaultConfigImplBuilder setUseNoNetWorkInterruptByHodor(boolean p0){
       this.useNoNetWorkInterruptByHodor = p0;
       return this;
    }
    public KSConfigGetInterface$KSUserFeature setUserFeature(KSConfigGetInterface$KSUserFeature p0){
       this.mUserFeature = p0;
       return p0;
    }
    public DefaultConfigImplBuilder setVideoPictureQueueSize(int p0){
       this.videoPictureQueueSize = p0;
       return this;
    }
    public DefaultConfigImplBuilder setVodAdaptiveRateConfigJson(String p0){
       this.vodAdaptiveRateConfigJson = p0;
       return this;
    }
    public DefaultConfigImplBuilder setVodEnableAvSyncOpt(boolean p0){
       this.vodEnableAvSyncOpt = p0;
       return this;
    }
    public DefaultConfigImplBuilder setVodKs265Params(String p0){
       this.vodKs265Params = p0;
       return this;
    }
    public DefaultConfigImplBuilder setVodLowDevice(int p0){
       this.vodLowDevice = p0;
       return this;
    }
    public DefaultConfigImplBuilder setVodOverlayOutputPixelFormat(int p0){
       this.vodOverlayOutputPixelFormat = p0;
       return this;
    }
    public boolean slidePlayUsePreDecode(){
       boolean b = (this.slidePlayPreLoadType == 3)? true: false;
       return b;
    }
    public boolean useAudioGain(){
       return this.useAudioGain;
    }
    public boolean useMediaCodecAutoSwitcher(){
       return this.useMediaCodecAutoSwitcher;
    }
    public int useMediaCodecInvalidateVer(){
       return this.useMediaCodecInvalidateVer;
    }
    public boolean useNoNetWorkInterruptByHodor(){
       return this.useNoNetWorkInterruptByHodor;
    }
}
