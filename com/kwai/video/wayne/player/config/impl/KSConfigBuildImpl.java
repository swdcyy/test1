package com.kwai.video.wayne.player.config.impl.KSConfigBuildImpl;
import com.kwai.video.wayne.player.config.impl.DefaultConfigImplBuilder;
import java.lang.Object;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.impl.KSConfigBuildImpl$1;
import com.kwai.video.wayne.player.config.impl.DefaultConfigImplBuilder$HwConfigGetter;
import com.kwai.video.wayne.player.config.ks_sub.AbTestConfig;
import com.kwai.video.wayne.player.config.ks_sub.CommonConfig;
import com.kwai.video.wayne.player.config.ks_sub.SlideConfig;
import com.kwai.video.wayne.player.config.ks_sub.RenderConfig;
import com.kwai.video.wayne.player.config.ks_sub.AzerothCommonConfig;
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig;
import com.kwai.video.wayne.player.config.ks_sub.SegmentConfig;
import com.kwai.video.wayne.player.config.ks_sub.AtlasKitConfig;
import com.kwai.video.wayne.player.config.ks_sub.VodP2spConfig;
import com.kwai.video.wayne.player.config.inerface.VodP2spConfigInterface;
import ai7.d;
import com.kwai.video.wayne.player.config.module.StartPlayConfigModule;
import com.kwai.video.wayne.player.config.module.StartPlayConfigModule$StartPlayConfigModuleGetter;
import com.kwai.video.wayne.player.config.ks_sub.DccAlgSubConfig;
import com.kwai.video.wayne.player.config.impl.DefaultConfigImplBuilder$DccAlgSubConfigGetter;
import com.kwai.video.wayne.player.config.ks_sub.UnifiedDccAlgConfig;
import com.kwai.video.wayne.player.config.impl.DefaultConfigImplBuilder$UnifiedDccAlgConfigGetter;
import com.kwai.video.wayne.player.config.ks_sub.DccOptConfig;
import com.kwai.video.wayne.player.config.impl.DefaultConfigImplBuilder$DccOptConfigGetter;

public class KSConfigBuildImpl	// class@000cd6
{
    public static final DefaultConfigImplBuilder defaultConfigImplBuilder;

    static {
       KSConfigBuildImpl.defaultConfigImplBuilder = new DefaultConfigImplBuilder();
    }
    public void KSConfigBuildImpl(){
       super();
    }
    public static KSConfigGetInterface getInstance(){
       Object obj = PatchProxy.apply(null, null, KSConfigBuildImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KSConfigBuildImpl.updateConfigImpl();
       return KSConfigBuildImpl.defaultConfigImplBuilder.setHwCodecConfigGetter(new KSConfigBuildImpl$1());
    }
    public static void updateConfigImpl(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, KSConfigBuildImpl.class, "2")) {
          return;
       }
       KSConfigBuildImpl.defaultConfigImplBuilder.setAudioStr(AbTestConfig.getConfig().getAudioStr()).setEnableClipVodH264CheckSlideConfig(AbTestConfig.getConfig().getEnableClipVodH264CheckSlideConfig()).setEnableClipVodH265CheckSlideConfig(AbTestConfig.getConfig().getEnableClipVodH265CheckSlideConfig()).setEnableMediaCodecDummySurface(AbTestConfig.getConfig().isEnableMediaCodecDummySurface()).setVideoPictureQueueSize(AbTestConfig.getConfig().getVideoPictureQueueSize()).setVodEnableAvSyncOpt(AbTestConfig.getConfig().isVodEnableAvSyncOpt()).setVodKs265Params(AbTestConfig.getConfig().getVodKs265Params()).setCacheSocketBufKB(CommonConfig.getConfig().getCacheSocketBufKB()).setEnableAsyncStreamOpen(CommonConfig.getConfig().enableAsyncStreamOpen()).setFadeinEndTimeMs(CommonConfig.getConfig().getFadeinEndTimeMs()).setMaxBufferDurMs(CommonConfig.getConfig().getMaxBufferDurMs()).setMediacodecDecodeTypeStr(CommonConfig.getConfig().getMediacodecDecodeTypeStr()).setUseAudioGain(CommonConfig.getConfig().useAudioGain()).setVodLowDevice(CommonConfig.getConfig().getVodLowDevice()).setFadeinEndTimeMs_slide(SlideConfig.getConfig().getFadeinEndTimeMs_slide()).setSlidePlayPreLoadType(SlideConfig.getConfig().getSlidePlayPreLoadType()).setOverlayOutputPixelFormat(RenderConfig.getConfig().getOverlayOutputPixelFormat()).setVodOverlayOutputPixelFormat(RenderConfig.getConfig().getVodOverlayOutputPixelFormat()).setAzerothCommonConfig(AzerothCommonConfig.getConfig()).setAudioLatencyMS(InjectConfig.getConfig().getAudioLatencyMS()).setClipHls264EnableMediacodec(InjectConfig.getConfig().getClipHls264EnableMediacodec()).setClipHls265EnableMediacodec(InjectConfig.getConfig@0051b0().getClipHls265EnableMediacodec@0051af()).setDisableFallbackSwDecInStop@005036(InjectConfig.getConfig@0051b0().disableFallbackSwDecInStop@00518c()).setEnableAccurateSeekForHls@005037(InjectConfig.getConfig@0051b0().enableAccurateSeekForHls@00518e()).setEnableAsyncStreamClose@005038(InjectConfig.getConfig@0051b0().enableAsyncStreamClose@00518f()).setEnableAudioConvert@00503a(InjectConfig.getConfig@0051b0().enableAudioConvert@005190()).setEnableAudioMix@00503b(InjectConfig.getConfig@0051b0().enableAudioMix@005191()).setEnableBrightnessInfo@00503c(InjectConfig.getConfig@0051b0().enableBrightnessInfo@005195()).setEnableBuffingOptimize@00503d(InjectConfig.getConfig@0051b0().enableBuffingOptimize@005196()).setEnableBulletScreenCache@00503e(InjectConfig.getConfig@0051b0().enableBulletScreenCache@005197()).setEnableCollectBatteryInfoNew@005041(InjectConfig.getConfig@0051b0().enableCollectBatteryInfoNew@005198()).setEnableDecisionJointStrategy@005042(InjectConfig.getConfig@0051b0().enableDecisionJointStrategy@005199()).setEnableFirstFrameForceRendered@005043(InjectConfig.getConfig@0051b0().enableFirstFrameForceRendered@00519a()).setEnableGsonTypeAdapter@005044(InjectConfig.getConfig@0051b0().enableGsonTypeAdapter@00519c()).setEnableHlsAutoSwitch@005045(InjectConfig.getConfig@0051b0().enableHlsAutoSwitch@00519d()).setEnableManifestRetryForHls@005047(InjectConfig.getConfig@0051b0().enableManifestRetryForHls@0051a0()).setEnableMultiAudioDetector@005049(InjectConfig.getConfig@0051b0().enableMultiAudioDetector@0051a1()).setEnablePlayerInstanceManager@00504a(InjectConfig.getConfig@0051b0().enablePlayerInstanceManager@0051a3()).setEnablePlayerPipelineV2@00504b(InjectConfig.getConfig@0051b0().enablePlayerPipelineV2@0051a4()).setEnablePlayerWindowDisconnect@00504c(InjectConfig.getConfig@0051b0().enablePlayerWindowDisconnect@0051a5()).setEnablePlaylistCache@00504d(InjectConfig.getConfig@0051b0().getSegmentConfig@0051bf().isEnablePlaylistCache@0051e3()).setEnableQuickStart@00504e(InjectConfig.getConfig@0051b0().enableQuickStart@0051a7()).setEnableThreadWakeupOptimize@005050(InjectConfig.getConfig@0051b0().enableThreadWakeupOptimize@0051a8()).setEnableViewUtilNewMethod@005051(InjectConfig.getConfig@0051b0().enableViewUtilNewMethod@0051aa()).setHardDecodeKvcHevcBitrateThres@005055(InjectConfig.getConfig@0051b0().getAtlasKitConfig@0051ab().getHardDecodeKvcHevcBitrateThres@005139()).setHardDecodeKvcHevcBitrateThresForCharging@005056(InjectConfig.getConfig@0051b0().getAtlasKitConfig@0051ab().getHardDecodeKvcHevcBitrateThresForCharging@00513a()).setHlsP2spMode@005057(InjectConfig.getConfig@0051b0().getHlsP2spMode@0051b6()).setHlsSwitchConfig@005058(InjectConfig.getConfig@0051b0().getHlsSwitchConfig@0051b7()).setKw265UsePthread@00505b(InjectConfig.getConfig@0051b0().getKw265UsePthread@0051b9()).setKwaivppJson@00505c(InjectConfig.getConfig@0051b0().getKwaivppJson@0051ba(objArray)).setMediaCodecOesCompatType@005060(InjectConfig.getConfig@0051b0().getMediaCodecOesCompatType@0051bd()).setSegmentCacheCount@00506a(InjectConfig.getConfig@0051b0().getSegmentConfig@0051bf().getSegmentCacheCount@0051e2()).setUseMediaCodecAutoSwitcher@005074(InjectConfig.getConfig@0051b0().useMediaCodecAutoSwitcher@0051c9()).setUseMediaCodecInvalidateVer@005075(InjectConfig.getConfig@0051b0().useMediaCodecInvalidateVer@0051ca()).setUseNoNetWorkInterruptByHodor@005076(InjectConfig.getConfig@0051b0().useNoNetWorkInterruptByHodor@0051cb()).setVodAdaptiveRateConfigJson@005079(InjectConfig.getConfig@0051b0().getVodAdaptiveRateConfigJson@0051c5()).setP2spConfig@005065(InjectConfig.getConfig@0051b0().getVodP2spConfig@0051c6(false)).setP2spConfigSlide@005066(InjectConfig.getConfig@0051b0().getVodP2spConfig@0051c6(true)).setClarityScore@005031(InjectConfig.getConfig@0051b0().getClarityScore@0051ad()).setEnableIndependentCacheScope@005046(InjectConfig.getConfig@0051b0().enableIndependentCacheScope@00519e()).setSwitchProvider@005071(InjectConfig.getConfig@0051b0().getSwitchProvider@0051c3()).setSeekHighWaterMarkMs@005069(InjectConfig.getConfig@0051b0().getSwitchProvider@0051c3().getInt@000195("seekHighWaterMarkMs"
    , 100)).setPlayerKwaiSrConfig@005067(InjectConfig.getConfig@0051b0().getSwitchProvider@0051c3().getJSON@000196("playerKwaiSrConfig", "")).setStartPlayConfigGetter@00506f(StartPlayConfigModule.KsStartPlayConfigModuleGetter@001984).setDccAlgSubConfigGetter@005034(DccAlgSubConfig.KsDccAlgSubConfigGetter@001903).setUnifiedDccAlgConfigGetter@005072(UnifiedDccAlgConfig.KsUnifiedDccAlgConfigGetter@001943).setDccOptConfigGetter@005035(DccOptConfig.KsDccOptConfigGetter@001907);
       return;
    
    
    }
}
