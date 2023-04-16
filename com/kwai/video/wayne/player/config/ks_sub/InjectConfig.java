package com.kwai.video.wayne.player.config.ks_sub.InjectConfig;
import com.kwai.video.wayne.player.config.inerface.InjectConfigInterface;
import com.kwai.video.wayne.player.config.ks_sub.UnifiedDccAlgConfig;
import com.kwai.video.wayne.player.config.ks_sub.AtlasKitConfig;
import com.kwai.video.wayne.player.config.ks_sub.HlsAtlasKitConfig;
import com.kwai.video.wayne.player.config.ks_sub.VodP2spConfig;
import com.kwai.video.wayne.player.config.ks_sub.SegmentConfig;
import com.kwai.video.wayne.player.config.ks_sub.DccOptConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.kwai_player.KwaiBatteryInfoUtil;
import com.kwai.video.wayne.player.config.ks_sub.StartPlayConfig;
import com.kwai.robust.PatchProxyResult;
import ai7.d;
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig$1;

public class InjectConfig implements InjectConfigInterface	// class@000cf8
{
    public static final AtlasKitConfig ATLAS_KIT_CONFIG_DEFAULT;
    public static final DccOptConfig DCCOPT_CONFIG_DEFAULT;
    public static final InjectConfig DEFAULT_CONFIG;
    public static final HlsAtlasKitConfig HLS_ATLAS_KIT_CONFIG_DEFAULT;
    public static InjectConfig INJECTED_CONFIG;
    public static final SegmentConfig SEGMENT_CONFIG_DEFAULT;
    public static final UnifiedDccAlgConfig UNIFIED_DCC_ALG_CONFIG_DEFAULT;
    public static final VodP2spConfig VOD_P2SP_CONFIG_DEFAULT;

    static {
       InjectConfig.DEFAULT_CONFIG = new InjectConfig();
       InjectConfig.UNIFIED_DCC_ALG_CONFIG_DEFAULT = new UnifiedDccAlgConfig();
       InjectConfig.ATLAS_KIT_CONFIG_DEFAULT = new AtlasKitConfig();
       InjectConfig.HLS_ATLAS_KIT_CONFIG_DEFAULT = new HlsAtlasKitConfig();
       InjectConfig.VOD_P2SP_CONFIG_DEFAULT = new VodP2spConfig();
       InjectConfig.SEGMENT_CONFIG_DEFAULT = new SegmentConfig();
       InjectConfig.DCCOPT_CONFIG_DEFAULT = new DccOptConfig();
    }
    public void InjectConfig(){
       super();
    }
    public static InjectConfig getConfig(){
       InjectConfig iNJECTED_CON = InjectConfig.INJECTED_CONFIG;
       if (iNJECTED_CON != null) {
          return iNJECTED_CON;
       }
       return InjectConfig.DEFAULT_CONFIG;
    }
    public static void inject(InjectConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, InjectConfig.class, "1")) {
          return;
       }
       if (p0.enableCollectBatteryInfoNew()) {
          KwaiBatteryInfoUtil.enableCollectionBatteryNew();
       }
       InjectConfig.INJECTED_CONFIG = p0;
       return;
    }
    public boolean disableFallbackSwDecInStop(){
       return false;
    }
    public boolean disableHodorCache(){
       return false;
    }
    public boolean enableAccurateSeekForHls(){
       return false;
    }
    public boolean enableAsyncStreamClose(){
       return false;
    }
    public boolean enableAudioConvert(){
       return false;
    }
    public boolean enableAudioMix(){
       return false;
    }
    public boolean enableAvsyncOpt3(){
       return false;
    }
    public boolean enableAvsyncOpt4(){
       return true;
    }
    public boolean enableBatteryInfo(){
       return true;
    }
    public boolean enableBrightnessInfo(){
       return false;
    }
    public boolean enableBuffingOptimize(){
       return false;
    }
    public boolean enableBulletScreenCache(){
       return false;
    }
    public boolean enableCollectBatteryInfoNew(){
       return false;
    }
    public boolean enableDecisionJointStrategy(){
       return false;
    }
    public boolean enableFirstFrameForceRendered(){
       return false;
    }
    public boolean enableForceVppAvsyncOpt2(){
       return false;
    }
    public boolean enableGsonTypeAdapter(){
       return true;
    }
    public boolean enableHlsAutoSwitch(){
       return true;
    }
    public boolean enableIndependentCacheScope(){
       return false;
    }
    public boolean enableManifestRetry(){
       return false;
    }
    public boolean enableManifestRetryForHls(){
       return false;
    }
    public boolean enableMultiAudioDetector(){
       return false;
    }
    public boolean enablePlayerCacheSeek(){
       return false;
    }
    public boolean enablePlayerInstanceManager(){
       return false;
    }
    public boolean enablePlayerPipelineV2(){
       return true;
    }
    public boolean enablePlayerWindowDisconnect(){
       return false;
    }
    public boolean enablePostProcessOpt(){
       return false;
    }
    public boolean enableQuickStart(){
       return false;
    }
    public boolean enableThreadWakeupOptimize(){
       return false;
    }
    public String enableUseAemon(){
       return "";
    }
    public boolean enableViewUtilNewMethod(){
       return true;
    }
    public AtlasKitConfig getAtlasKitConfig(){
       return InjectConfig.ATLAS_KIT_CONFIG_DEFAULT;
    }
    public int getAudioLatencyMS(){
       return -1;
    }
    public int getClarityScore(){
       return 0;
    }
    public boolean getClipHls264EnableMediacodec(){
       return false;
    }
    public boolean getClipHls265EnableMediacodec(){
       return false;
    }
    public int getCronetMTRequestDelayTime(){
       return -1;
    }
    public DccOptConfig getDccOptConfig(){
       return InjectConfig.DCCOPT_CONFIG_DEFAULT;
    }
    public HlsAtlasKitConfig getHlsAtlasKitConfig(){
       return InjectConfig.HLS_ATLAS_KIT_CONFIG_DEFAULT;
    }
    public boolean getHlsEnableSegmentCache(){
       return true;
    }
    public String getHlsHevcDecoderName(){
       return "libks265dec";
    }
    public int getHlsP2spMode(){
       return 0;
    }
    public String getHlsSwitchConfig(){
       return "";
    }
    public int getHodorTaskRetryType(){
       return 2;
    }
    public boolean getKw265UsePthread(){
       return false;
    }
    public String getKwaivppJson(String p0){
       return null;
    }
    public int getMaxBufBspBytesForSlide(){
       return 0xf00000;
    }
    public int getMaxBufBspMsForSlide(){
       return 3000;
    }
    public int getMediaCodecOesCompatType(){
       return 0;
    }
    public int getPlayerMaxBufferStrategyForHls(){
       return 0;
    }
    public SegmentConfig getSegmentConfig(){
       return InjectConfig.SEGMENT_CONFIG_DEFAULT;
    }
    public int getStartPlayBlockStrategyForHls(){
       return 1;
    }
    public int getStartPlayBlockStrategyForMp4(){
       return 1;
    }
    public StartPlayConfig getStartPlayConfigForHls(){
       StartPlayConfig obj = PatchProxy.apply(null, this, InjectConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StartPlayConfig();
       obj.startPlayTh = 600;
       obj.startPlayMaxMs = 1200;
       return obj;
    }
    public d getSwitchProvider(){
       Object obj = PatchProxy.apply(null, this, InjectConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new InjectConfig$1(this);
    }
    public UnifiedDccAlgConfig getUnifiedDccAlgConfig(){
       return InjectConfig.UNIFIED_DCC_ALG_CONFIG_DEFAULT;
    }
    public String getVodAdaptiveRateConfigJson(){
       return "";
    }
    public VodP2spConfig getVodP2spConfig(boolean p0){
       return InjectConfig.VOD_P2SP_CONFIG_DEFAULT;
    }
    public boolean isVisionEngineLibLoaded(){
       return false;
    }
    public boolean useMediaCodecAutoSwitcher(){
       return false;
    }
    public int useMediaCodecInvalidateVer(){
       return 0;
    }
    public boolean useNoNetWorkInterruptByHodor(){
       return true;
    }
}
