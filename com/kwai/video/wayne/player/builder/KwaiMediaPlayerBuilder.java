package com.kwai.video.wayne.player.builder.KwaiMediaPlayerBuilder;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import java.lang.Object;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface;
import com.kwai.video.wayne.player.config.impl.WaynePlayerConfigImpl;
import com.kwai.video.wayne.player.InjectInitor;
import com.kwai.video.player.kwai_player.KwaiPlayerVodBuilder;
import com.kwai.video.wayne.player.WaynePlayerInitor;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import ai7.d;
import com.kwai.video.wayne.player.config.inerface.InjectConfigInterface;
import com.kwai.video.wayne.player.config.inerface.RenderConfigInterface;
import com.kwai.video.wayne.player.config.inerface.AbTestConfigInterface;
import com.kwai.video.player.kwai_player.KwaiPlayerBaseBuilder;
import com.kwai.video.player.kwai_player.AspectAwesomeCache;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import com.kwai.video.wayne.player.config.inerface.CommonConfigInterface;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.wayne.player.datasource.IDatasource;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import com.kwai.video.wayne.player.config.ks_sub.DccOptConfig;
import com.kwai.video.wayne.player.config.ks_sub.UnifiedDccAlgConfig;
import com.kwai.video.wayne.player.config.ks_sub.DccAlgSubConfig;
import java.lang.IllegalArgumentException;
import com.kwai.video.cache.AwesomeCache$VodAdaptive;
import com.kwai.video.wayne.player.util.ViewUtil;
import com.kwai.video.wayne.player.config.inerface.SegmentConfigInterface;
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.player.misc.IMediaDataSource;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.video.wayne.player.InjectHelper;
import com.kwai.video.wayne.player.decision.IDecisionFilter;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kwai.video.wayne.player.decision.DecisionParams;
import java.util.Map;
import com.kwai.video.wayne.player.config.hw_codec.VodMediaCodecConfig;
import com.kwai.video.wayne.player.KpMidLocalDebugConfig;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.video.hodor.util.Timber;
import android.os.Build$VERSION;
import org.json.JSONObject;
import java.lang.Exception;
import com.kwai.video.player.kwai_player.ProductContext$Builder;
import com.kwai.video.player.kwai_player.ProductContext;
import java.util.Locale;
import com.kwai.video.wayne.player.PlayerIndexInfo;
import com.kwai.video.wayne.player.config.inerface.VodP2spConfigInterface;
import com.kwai.video.player.mid.manifest.v2.PlayInfo;
import com.kwai.video.player.kwai_player.AspectKwaiVodAdaptive;
import java.lang.Float;
import com.kwai.video.wayne.player.util.MiscUtil;
import com.kwai.video.wayne.player.config.module.StartPlayConfigModule;
import com.kwai.video.wayne.player.config.module.StartPlayConfigModule$StartPlayConfigModuleGetter;
import com.kwai.video.wayne.player.builder.StartPlayBlockInfo;
import com.kwai.video.wayne.player.main.KSVodPlayHistoryManager;
import com.kwai.video.wayne.player.config.inerface.SlideConfigInterface;
import com.kwai.video.player.mid.manifest.v2.filter.PhotoInfo;
import java.util.List;
import com.kwai.video.wayne.player.config.ks_sub.AzerothCommonConfig;
import java.lang.Boolean;

public class KwaiMediaPlayerBuilder	// class@000cba
{
    public PlayerIndexInfo indexInfo;
    public KSConfigGetInterface ksConfigGet;
    public final KwaiPlayerVodBuilder mInnerVodBuilder;
    public boolean mInnerVodBuilderPrepared;
    public boolean mUseKpmidPlayer;
    public final WayneBuildData mWayneBuildData;

    public void KwaiMediaPlayerBuilder(WayneBuildData p0){
       super();
       this.mInnerVodBuilderPrepared = false;
       this.ksConfigGet = WaynePlayerConfigImpl.getConfigGet();
       this.mWayneBuildData = p0;
       InjectInitor.getInstance().initRun();
       this.mInnerVodBuilder = new KwaiPlayerVodBuilder(WaynePlayerInitor.APP_CONTEXT);
    }
    public final int chooseOverlayFormat(){
       int intx;
       Integer obj = PatchProxy.apply(null, this, KwaiMediaPlayerBuilder.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mWayneBuildData.getOverlayFormat();
       if (obj != null) {
          return obj.intValue();
       }
       d switchProvid = this.ksConfigGet.getSwitchProvider();
       if (switchProvid != null) {
          intx = switchProvid.getInt("playerOverlayFormatVod", 0);
          if (intx) {
             return intx;
          }
       }
       intx = this.ksConfigGet.getVodOverlayOutputPixelFormat();
       if (intx) {
          return intx;
       }else {
          return this.ksConfigGet.getOverlayOutputPixelFormat();
       }
    }
    public final void configAvSync(KwaiPlayerVodBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "20")) {
          return;
       }
       p0.enableAvSyncOpt(this.ksConfigGet.isVodEnableAvSyncOpt());
       return;
    }
    public final void configAwesomeCacheCommonConfig(AspectAwesomeCache p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "10")) {
          return;
       }
       p0.setBufferedDataSourceSizeKB(this.ksConfigGet.getBufferedDataSourceSizeKB());
       p0.setDataSourceSeekReopenThresholdKB(1024);
       String str = "KwaiMediaPlayerBuilder";
       DebugLog.i(str, "timeout_"+this.ksConfigGet.getCacheDownloadConnectTimeoutMs());
       p0.setCacheDownloadConnectTimeoutMs(this.ksConfigGet.getCacheDownloadConnectTimeoutMs());
       p0.setCacheDownloadReadTimeoutMs(this.ksConfigGet.getCacheDownloadReadTimeoutMs());
       p0.setCacheSocketBufferSizeKb(this.ksConfigGet.getCacheSocketBufKB());
       if (this.mWayneBuildData.mEnableLowPerfMode != null) {
          p0.setDataSourceSeekReopenThresholdKB((this.ksConfigGet.getMinSeekReopenThresoldSizeKb() / 2));
       }
       p0.setDisableHodorCache(this.mWayneBuildData.isDisableHodorCache());
       p0.setHodorCdnLogExtraMsg("");
       if (!TextUtils.isEmpty(this.mWayneBuildData.mCacheKey)) {
          DebugLog.i(str, " bizset cachekey "+this.mWayneBuildData.mCacheKey);
          p0.setCacheKey(this.mWayneBuildData.mCacheKey);
       }else if(!TextUtils.isEmpty(this.mWayneBuildData.getDataSourceModule().getCacheKey())){
          DebugLog.i(str, " use midware cachekey "+this.mWayneBuildData.getDataSourceModule().getCacheKey());
          p0.setCacheKey(this.mWayneBuildData.getDataSourceModule().getCacheKey());
       }
       String cdnLogExtraM = this.mWayneBuildData.getCdnLogExtraMsg();
       if (!TextUtils.isEmpty(cdnLogExtraM)) {
          p0.setHodorCdnLogExtraMsg(cdnLogExtraM);
       }
       if (this.mWayneBuildData.getMediaType() == 1) {
          p0.setCacheMode(5);
       }else if(this.mWayneBuildData.getMediaType() == 2){
          p0.setCacheMode(4);
       }
       p0.setCacheUpstreamType(4);
       p0.setMaxSpeedKbps(this.mWayneBuildData.mMaxSpeedKbps);
       return;
    }
    public final void configBufferControl(KwaiPlayerVodBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "14")) {
          return;
       }
       PlayerCommonBuildData mMaxBufferTi = this.mWayneBuildData.mMaxBufferTimeMs;
       if (mMaxBufferTi > null) {
          p0.setMaxBufferTimeMs(mMaxBufferTi);
       }else {
          p0.setMaxBufferTimeMs(this.ksConfigGet.getMaxBufferDurMs());
       }
       if (this.ksConfigGet.getMaxBufferSize() > 0) {
          p0.setMaxBufferSizeBytes(this.ksConfigGet.getMaxBufferSize());
       }
       p0.setFirstHighWaterMarkMs(this.ksConfigGet.getFirstHighWaterMarkMs());
       p0.setNextHighWaterMarkMs(this.ksConfigGet.getNextHighWaterMarkMs());
       p0.setLastHighWaterMarkMs(this.ksConfigGet.getLastHighWaterMarkMs());
       if (this.ksConfigGet.getSeekHighWaterMarkMs() > 0) {
          p0.setSeekHighWaterMarkMs(this.ksConfigGet.getSeekHighWaterMarkMs());
       }
       DccOptConfig dccOptConfig = this.ksConfigGet.getDccOptConfig(this.mWayneBuildData.getMediaType());
       if (this.mWayneBuildData.getMediaType() == 2) {
          if (dccOptConfig != null) {
             p0.enableDccOpt(dccOptConfig.enableHlsDccOpt);
             p0.setDccBufferLowRatioTh_10(dccOptConfig.bufferLowRatioTh_10_ForHls);
             p0.setFirstHighDynamicBufferMs(dccOptConfig.firstHighBufferMsForHls);
          }
       }else if(dccOptConfig != null){
          p0.enableDccOpt(dccOptConfig.enableVodDccOpt);
          p0.setDccBufferLowRatioTh_10(dccOptConfig.bufferLowRatioTh_10);
          p0.setFirstHighDynamicBufferMs(dccOptConfig.firstHighBufferMs);
          p0.useVodAdaptive(dccOptConfig.useVodAdaptive);
       }
       UnifiedDccAlgConfig unifiedDccAl = this.ksConfigGet.getUnifiedDccAlgConfig(this.mWayneBuildData.getMediaType());
       if (unifiedDccAl != null) {
          p0.enableUnifiedAlg(unifiedDccAl.isEnableUnifiedAlg());
          p0.setBufferLowRatioTh_100(unifiedDccAl.getBufferLowRatioTh_100());
          p0.setBufferAdjustRatioTh_100(unifiedDccAl.getBufferAdjustRatioTh_100());
          p0.setBwAdjustRatioTh_100(unifiedDccAl.getBwAdjustRatioTh_100());
          p0.setMaxInitBufferDurMs(unifiedDccAl.getMaxInitBufferDurMs());
          p0.setMinInitBufferDurMs(unifiedDccAl.getMinInitBufferDurMs());
       }
       KwaiMediaPlayerBuilder tmWayneBuild = this.mWayneBuildData;
       if (tmWayneBuild.mEnableDccAlg != null) {
          DccAlgSubConfig dccAlgConfig = this.ksConfigGet.getDccAlgConfig(tmWayneBuild.getMediaType());
          if (dccAlgConfig != null) {
             p0.setDccAlgorithm(dccAlgConfig.enableDccAlg);
             p0.setDccAlgMBTh_10(dccAlgConfig.dccMBTh_10);
             p0.setDccAlgPreReadMs(dccAlgConfig.dccPreReadMs);
          }
       }else {
          p0.setDccAlgorithm(false);
       }
       p0.setSeekHighWaterMarkMs(WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getInt("seekHighWaterMarkMs", 100));
       return;
    }
    public final void configDataSourceToBuilder(KwaiPlayerVodBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "18")) {
          return;
       }
       boolean wayneDataSou = this.mWayneBuildData.getWayneDataSourceType();
       int i = 1;
       if (wayneDataSou != i) {
          if (wayneDataSou != 6) {
             if (wayneDataSou != 7) {
                if (wayneDataSou != 8) {
                   throw new IllegalArgumentException("invalid mPlayerVodBuildData.getVodDataSourceType\(\):"+this.mWayneBuildData.getWayneDataSourceType());
                }
             }
          }
          if (this.mWayneBuildData.getMediaType() == i) {
             String vodAdaptiveR = this.ksConfigGet.getVodAdaptiveRateConfigJson();
             if (TextUtils.isEmpty(vodAdaptiveR)) {
                vodAdaptiveR = "{}";
             }
             p0.setVodManifest(AwesomeCache$VodAdaptive.getAdaptiveNetType(WaynePlayerInitor.APP_CONTEXT), (long)ViewUtil.getScreenWidth(), (long)ViewUtil.getScreenRealHeight(), vodAdaptiveR, this.ksConfigGet.getVodLowDevice(), 0, this.ksConfigGet.getClarityScore());
             p0.setVodManifestSwitchCode(this.mWayneBuildData.getSelectManifestRepId());
             p0.setVodManifestWarmupPercentThreshold(this.mWayneBuildData.mPrefetchedFileSizePercent);
             p0.setManifestType(i);
             p0.setEnableManifestRetry(i);
          }else if(this.mWayneBuildData.getMediaType() == 2){
             wayneDataSou = this.mWayneBuildData.getPlaylistCachePolicy();
             if (wayneDataSou) {
                wayneDataSou = (wayneDataSou != i)? false: true;
             }else {
                wayneDataSou = this.ksConfigGet.isEnablePlaylistCache();
             }
             p0.setEnablePlaylistCache(wayneDataSou);
             p0.setEnableSegmentCache(InjectConfig.getConfig().getHlsEnableSegmentCache());
             p0.setSegmentCacheCount(this.ksConfigGet.getSegmentCacheCount());
             p0.setEnableManifestRetry(this.ksConfigGet.enableManifestRetryForHls());
          }
          if (this.mWayneBuildData.getSwitchStrategy() < 0) {
             i = false;
          }
          p0.enableNativeCdnRetry(i);
          p0.enableAutoRetry(this.mWayneBuildData.enableAutoRetry());
       }
       return;
    }
    public final void configDataSourceToPlayer(IKwaiMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "19")) {
          return;
       }
       int wayneDataSou = this.mWayneBuildData.getWayneDataSourceType();
       KwaiMediaPlayerBuilder kwaiMediaPla = 1;
       String str = "setDatasource:";
       if (wayneDataSou != kwaiMediaPla) {
          if (wayneDataSou != 6) {
             if (wayneDataSou != 7) {
                if (wayneDataSou == 8) {
                label_0131 :
                   DebugLog.i("normalUrl", str+this.mWayneBuildData.getDataSource());
                   p0.setDataSource(this.mWayneBuildData.getDataSource());
                }else {
                   throw new IllegalArgumentException("invalid mPlayerVodBuildData.getVodDataSourceType\(\):"+this.mWayneBuildData.getWayneDataSourceType());
                }
             }else {
                IMediaDataSource mediaDatasSo = this.mWayneBuildData.getDataSourceModule().getMediaDatasSource();
                if (mediaDatasSo != null) {
                   DebugLog.i("MEDIA_DATA_SOURCE", "setDatasource");
                   p0.setDataSource(mediaDatasSo);
                }else {
                   throw new IllegalArgumentException("source_type is MEDIA_DATA_SOURCE but mediaDataSource is null");
                }
             }
          }else if(this.mWayneBuildData.mDecisionParams != null){
             if (InjectHelper.getInstance().getDecisionFilter() != null) {
                KwaiMediaPlayerBuilder tmWayneBuild = this.mWayneBuildData;
                InjectHelper.getInstance().getDecisionFilter().filterV2DataSource(tmWayneBuild.mDecisionParams, tmWayneBuild.getDataSourceModule().getKwaiManifest(), this.mWayneBuildData.getDataSourceModule().getVideoId());
             }
             DebugLog.d("KwaiMediaPlayerBuilder", "mVideoId— "+this.mWayneBuildData.getDataSourceModule().getVideoId()+"Decision strategy start");
          }
          if (this.mWayneBuildData.getMediaType() == kwaiMediaPla) {
             DebugLog.i("vodManifest", str+this.mWayneBuildData.getDataSourceModule().getKwaiManifest().getManifestString());
             p0.setDataSource(this.mWayneBuildData.getDataSourceModule().getKwaiManifest().getManifestString());
          }else if(this.mWayneBuildData.getMediaType() == 2){
             DebugLog.i("HlsManifest", str+this.mWayneBuildData.getDataSourceModule().getKwaiManifest().getManifestString());
             p0.setKwaiManifest("www.KpMidVodHlsBuilder.com", this.mWayneBuildData.getDataSourceModule().getKwaiManifest().getManifestString(), null);
          }
       }else {
          goto label_0131 ;
       }
       return;
    }
    public final void configHardwareDecoder(KwaiPlayerVodBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "12")) {
          return;
       }
       DebugLog.d("KwaiMediaPlayerBuilder", "MediaCodecPolicy "+this.mWayneBuildData.mMediaCodecPolicy);
       if (this.mWayneBuildData.mMediaCodecPolicy == 2) {
          p0.setVodManifestMaxResolution(this.ksConfigGet.getSwDecodeMaxResolution());
       }else {
          KwaiMediaPlayerBuilder tmWayneBuild = this.mWayneBuildData;
          if (!(this.ksConfigGet.getHwDecPlayScene() & tmWayneBuild.mPlayerScene)) {
             p0.setVodManifestMaxResolution(this.ksConfigGet.getSwDecodeMaxResolution());
          }else {
             KwaiMediaPlayerBuilder tksConfigGet = this.ksConfigGet;
             boolean b = (tmWayneBuild.getDataSourceModule().getKpmidMediaType() == 2)? true: false;
             boolean b1 = (this.mWayneBuildData.mMediaCodecPolicy == null)? true: false;
             VodMediaCodecConfig hwCodecConfi = tksConfigGet.getHwCodecConfig(tmWayneBuild, b, b1);
             if (hwCodecConfi != null) {
                p0.setUseMediaCodecByteBuffer(hwCodecConfi.useMediaCodecByteBuffer);
                if (hwCodecConfi.supportAvcMediaCodec != null) {
                   p0.setMediaCodecAvcHeightLimit(hwCodecConfi.mediaCodecAvcHeightLimit);
                   p0.setMediaCodecAvcWidthLimit(hwCodecConfi.mediaCodecAvcWidthLimit);
                   p0.setMediaCodecAvcResolutionLimit(hwCodecConfi.mediaCodecAvcResolutionLimit);
                   p0.setUseHardwareDcoderFlag(1);
                }
                if (hwCodecConfi.supportHevcMediaCodec != null) {
                   p0.setMediaCodecHevcHeightLimit(hwCodecConfi.mediaCodecHevcHeightLimit);
                   p0.setMediaCodecHevcWidthLimit(hwCodecConfi.mediaCodecHevcWidthLimit);
                   p0.setMediaCodecHevcResolutionLimit(hwCodecConfi.mediaCodecHevcResolutionLimit);
                   p0.setUseHardwareDcoderFlag(2);
                }
                if (hwCodecConfi.supportAvcMediaCodec != null && hwCodecConfi.supportHevcMediaCodec != null) {
                   p0.setUseHardwareDcoderFlag(4096);
                }else {
                   p0.setVodManifestMaxResolution(this.ksConfigGet.getSwDecodeMaxResolution());
                }
                hwCodecConfi = hwCodecConfi.mediaCodecMaxNum;
                if (hwCodecConfi > null) {
                   p0.setMediaCodecMaxNum(hwCodecConfi);
                }
                p0.setUseMediaCodecDummySurface(this.mWayneBuildData.mEnableMediaCodecDummySurface);
                p0.setVideoPictureQueueSize(this.ksConfigGet.getVideoPictureQueueSize());
                p0.setUseMediaCodecSetSurfaceWithoutReconfig(this.mWayneBuildData.useMediaCodecSetSurfaceWithoutReconfig());
                p0.setUseMediaCodecSurfaceView(this.mWayneBuildData.useMediaCodecSurfaceView());
                p0.setUseMediaCodecAutoSwitcher(this.ksConfigGet.useMediaCodecAutoSwitcher());
                p0.setAzerothHwConfigStatus(WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getBoolean("wayne_use_azeroth_hwconfig", 0));
             }
          }
       }
       if (KpMidLocalDebugConfig.getVodHwDecode() == 1) {
          DebugLog.i("KwaiMediaPlayerBuilder", "摇一摇强制硬解");
          p0.setUseHardwareDcoderFlag(4096);
       }else if(KpMidLocalDebugConfig.getVodHwDecode() == 2){
          DebugLog.i("KwaiMediaPlayerBuilder", "摇一摇强制软解");
          p0.setUseHardwareDcoderFlag(0);
       }
       p0.setMediaCodecInvalidateVer(this.ksConfigGet.useMediaCodecInvalidateVer());
       return;
    }
    public final void configHttpHeaders(IKwaiMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "17")) {
          return;
       }
       WayneBuildData mHttpHeaders = this.mWayneBuildData.mHttpHeaders;
       StringBuilder str = "";
       if (mHttpHeaders != null && !mHttpHeaders.isEmpty()) {
          Iterator iterator = mHttpHeaders.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             str = str+uEntry.getKey()+": ";
             if (!TextUtils.isEmpty(uEntry.getValue())) {
                str = str+uEntry.getValue();
             }
             str = str+"\r\n";
          }
          DebugLog.e("KwaiMediaPlayerBuilder", "player configHttpHeaders");
          p0.setOption(1, "headers", str);
          return;
       }else {
          Object[] objArray = new Object[0];
          Timber.e("[configHttpHeaders] is empty", objArray);
          return;
       }
    }
    public final void configKwaiManifestReleated(KwaiPlayerVodBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "5")) {
          return;
       }
       KwaiManifest kwaiManifest = this.mWayneBuildData.getDataSourceModule().getKwaiManifest();
       if (kwaiManifest != null) {
          this.configVR(this.mInnerVodBuilder, kwaiManifest);
          this.configPlayInfo(this.mInnerVodBuilder, kwaiManifest);
       }
       p0.setVodManifestHdrAdaptiveMode(this.mWayneBuildData.mHdrAdaptiveMode);
       WayneBuildData mVodManifest = this.mWayneBuildData.mVodManifestMaxResolution;
       if (mVodManifest > null) {
          p0.setVodManifestMaxResolution(mVodManifest);
       }
       return;
    }
    public final void configKwaiVPP(KwaiPlayerVodBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "24")) {
          return;
       }
       if (KpMidLocalDebugConfig.getKwaivppBits() > 0) {
          p0.enableAvSyncOpt2(true);
          if (Build$VERSION.SDK_INT > 21) {
             p0.setUseMediaCodecOesSurface(true);
          }
          return;
       }else if(this.mWayneBuildData.mUseMediaCodecOesSurface != null){
          p0.setUseMediaCodecOesSurface(true);
       }
       String kwaivppJson = this.ksConfigGet.getKwaivppJson(this.mWayneBuildData.getBizType());
       if (!TextUtils.isEmpty(kwaivppJson)) {
          String str = "hardware_bits";
          if (kwaivppJson.contains(str)) {
             try{
                p0.setHardwareVppBits(new JSONObject(kwaivppJson).getInt(str));
             }catch(java.lang.Exception e2){
                e2.printStackTrace();
             }
          }
       }
    }
    public final void configMisc(KwaiPlayerVodBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "26")) {
          return;
       }
       p0.setSwitchProvider(this.ksConfigGet.getSwitchProvider());
       boolean b = true;
       p0.setUseNatvieCache(b);
       ProductContext productConte = new ProductContext$Builder().setBizType(this.mWayneBuildData.getBizType()).setPlayIndex(this.mWayneBuildData.mPlayIndex).build();
       productConte.isPreloadPlayer = this.mWayneBuildData.isPreload();
       KwaiMediaPlayerBuilder tindexInfo = this.indexInfo;
       if (tindexInfo != null) {
          Locale uS = Locale.US;
          Object[] objArray = new Object[]{Integer.valueOf(tindexInfo.getMActiveRetryCount()),Integer.valueOf(this.indexInfo.getMPassiveRetryCount())};
          int i = 0;
          String str = String.format(uS, "[active: %d][inactive: %d]", objArray);
          if (!TextUtils.isEmpty(this.indexInfo.getMDebugIndexDetail())) {
             Object[] objArray1 = new Object[b];
             objArray1[i] = this.indexInfo.getMDebugIndexDetail();
             str = str+String.format(uS, "\n%s", objArray1);
          }
          productConte.retryInfo = str;
       }
       p0.setProductContext(productConte);
       p0.setBizFt(this.mWayneBuildData.mBizFt);
       p0.setBizExtra(this.mWayneBuildData.mBizExtra);
       p0.setServerPredictedWatchTimeMs(this.mWayneBuildData.getServerPredictedWatchTimeMs());
       p0.setAppPredictedWatchTimeMs(this.mWayneBuildData.getAppPredictedWatchTimeMs());
       p0.setEnableLowVVPlayOpt(this.mWayneBuildData.enableLowVVPlayOpt());
       p0.setEnableNewRefluxOpt(this.mWayneBuildData.enableNewRefluxOpt());
       p0.setAsyncStreamOpen(this.ksConfigGet.enableAsyncStreamOpen());
       p0.setAsyncStreamClose(this.ksConfigGet.enableAsyncStreamClose());
       p0.setDisableFallbackSwDecInStop(this.ksConfigGet.disableFallbackSwDecInStop());
       p0.setEnableThreadWakeupOptimize(this.ksConfigGet.enableThreadWakeupOptimize());
       p0.setEnableBuffingOptimize(this.ksConfigGet.enableBuffingOptimize());
       p0.setEnableQuickStart(this.ksConfigGet.enableQuickStart());
       p0.setEnableAudioGain(this.ksConfigGet.useAudioGain(), this.ksConfigGet.getAudioStr());
       p0.setFFmpegSocketRecvBufferSize(0x10000);
       p0.setFFmpegSocketSendBufferSize(0x10000);
       p0.setEnableAccurateSeek(this.mWayneBuildData.mEnableAccurateSeek);
       if (this.mWayneBuildData.getWayneDataSourceType() != 6 || (this.mWayneBuildData.getMediaType() == 2 || this.mWayneBuildData.getWayneDataSourceType() == 8)) {
          p0.setEnableVodAdaptive(this.ksConfigGet.enableHlsAutoSwitch());
       }
       KwaiMediaPlayerBuilder tmWayneBuild = this.mWayneBuildData;
       p0.setAbLoopCount(tmWayneBuild.mAbLoopStartMs, tmWayneBuild.mAbLoopEndMs, tmWayneBuild.mAbLoopCount, tmWayneBuild.mDisableSeekAtStart);
       p0.enableUsePipelineV2(this.ksConfigGet.enablePlayerPipelineV2());
       p0.setAudioLatency(this.ksConfigGet.getAudioLatencyMS());
       p0.setEnableBulletScreenCache(this.ksConfigGet.enableBulletScreenCache());
       p0.setEnableAudioMix(this.ksConfigGet.enableAudioMix());
       p0.setEnableSeekContinuous(this.mWayneBuildData.isEnableSeekContinuous());
       p0.setVisionEngineLibLoaded(InjectConfig.getConfig().isVisionEngineLibLoaded());
       return;
    }
    public final void configP2sp(AspectAwesomeCache p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "9")) {
          return;
       }
       KwaiMediaPlayerBuilder tmWayneBuild = this.mWayneBuildData;
       if (tmWayneBuild.mForceDisableVodP2sp != null) {
          p0.setVodP2spDisable();
          p0.setHlsP2spMode(0);
          return;
       }else {
          p0.setVodP2spPolicy(this.ksConfigGet.getP2spPolicy(tmWayneBuild.mIsSlideMode));
          p0.setVodP2spParams(this.ksConfigGet.getP2spParams(this.mWayneBuildData.mIsSlideMode));
          p0.setVodP2spTaskVersion(this.ksConfigGet.getP2spTaskVersion(this.mWayneBuildData.mIsSlideMode));
          p0.setVodP2spTaskMaxSize(this.ksConfigGet.getP2spTaskMaxSize(this.mWayneBuildData.mIsSlideMode));
          p0.setVodP2spCdnRequestMaxSize(this.ksConfigGet.getP2spCdnRequestMaxSize(this.mWayneBuildData.mIsSlideMode));
          p0.setVodP2spCdnRequestInitialSize(this.ksConfigGet.getP2spCdnRequestInitialSize(this.mWayneBuildData.mIsSlideMode));
          p0.setVodP2spOnThreshold(this.ksConfigGet.getP2spOnThreshold(this.mWayneBuildData.mIsSlideMode));
          p0.setVodP2spOffThreshold(this.ksConfigGet.getP2spOffThreshold(this.mWayneBuildData.mIsSlideMode));
          p0.setVodP2spHoleIgnoreSpeedcal(this.ksConfigGet.isP2spHoleIgnoreSpeedcal(this.mWayneBuildData.mIsSlideMode));
          if (this.mWayneBuildData.getWayneDataSourceType() == 6) {
             if (this.mWayneBuildData.getMediaType() == 1) {
                if (this.shouldUseVodP2sp()) {
                   p0.setCacheUpstreamType(3);
                }
             }else if(this.mWayneBuildData.getMediaType() == 2){
                if (this.shouldUseVodP2sp()) {
                   p0.setHlsP2spMode(2);
                }else {
                   p0.setHlsP2spMode(this.ksConfigGet.getHlsP2spMode());
                }
             }
          }else if(this.mWayneBuildData.getWayneDataSourceType() == 1 && this.shouldUseVodP2sp()){
             p0.setCacheUpstreamType(3);
          }
          return;
       }
    }
    public final void configPlayInfo(KwaiPlayerVodBuilder p0,KwaiManifest p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiMediaPlayerBuilder.class, "6")) {
          return;
       }
       if (p1 != null) {
          PlayInfo playInfo = p1.getPlayInfo();
          if (playInfo != null && playInfo.isAllAudioDisabled()) {
             p0.setDisableVodAudio(true);
          }
       }
       return;
    }
    public final void configPlayerAfterBuilt(IKwaiMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "15")) {
          return;
       }
       p0.setLooping(true);
       int i = 4;
       p0.setOption(i, "is-build-by-kpmid", 1);
       if (this.mUseKpmidPlayer != null) {
          p0.setOption(i, "use-kpmid-player", 1);
       }
       this.configAwesomeCacheCommonConfig(p0.getAspectAwesomeCache());
       this.configP2sp(p0.getAspectAwesomeCache());
       this.configVodAdaptive(p0.getAspectVodAdaptive());
       this.configHttpHeaders(p0);
       this.configDataSourceToPlayer(p0);
       this.configPlayerOptions(p0);
       return;
    }
    public final void configPlayerOptions(IKwaiMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "16")) {
          return;
       }
       WayneBuildData mSpeed = this.mWayneBuildData.mSpeed;
       if (mSpeed > 0) {
          p0.setSpeed(mSpeed);
       }
       p0.setVolume(this.mWayneBuildData.mLeftVolume.floatValue(), this.mWayneBuildData.mRightVolume.floatValue());
       return;
    }
    public final void configRender(KwaiPlayerVodBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "22")) {
          return;
       }
       p0.setOverlayFormat(this.chooseOverlayFormat());
       boolean b = true;
       p0.enableEglReleaseOnVout(b);
       p0.enableDisconnectWindow(this.ksConfigGet.enablePlayerWindowDisconnect());
       this.configKwaiVPP(p0);
       p0.enableFirstFrameForceRendered(this.ksConfigGet.enableFirstFrameForceRendered());
       int mediaCodecOe = this.ksConfigGet.getMediaCodecOesCompatType();
       if (!mediaCodecOe && (MiscUtil.isHardWareVendorMediaTek() && Build$VERSION.SDK_INT < 23)) {
          mediaCodecOe = 2;
       }
    label_0040 :
       p0.setMediaCodecOesCompatType(mediaCodecOe);
       if (this.ksConfigGet.enableBatteryInfo()) {
          p0.setBatteryInfo(b);
       }
       if (this.ksConfigGet.enableBrightnessInfo()) {
          p0.setBrightnessInfo(b);
       }
       p0.setVideoAlphaType(this.mWayneBuildData.mVideoAlphaType);
       p0.enableAvSyncOpt3(false);
       p0.enableAvSyncOpt4(b);
       p0.enableMultiAudioDetector(this.ksConfigGet.enableMultiAudioDetector());
       p0.setEnableLutRender(this.mWayneBuildData.isLutRenderEnable());
       this.configVeSr(p0);
       return;
    }
    public final void configSoftwareDecoder(KwaiPlayerVodBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "13")) {
          return;
       }
       p0.setHevcDcoderName("libks265dec");
       String vodKs265Para = this.ksConfigGet.getVodKs265Params();
       String str = "use_pthread=1";
       if (this.ksConfigGet.getKw265UsePthread()) {
          vodKs265Para = (vodKs265Para.isEmpty())? str: vodKs265Para+":use_pthread=1";
       }else {
          str = "";
       }
       p0.setKs265DecExtraParams(vodKs265Para);
       p0.setKVCDecExtraParams(str);
       d switchProvid = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider();
       int i = 0;
       int intx = switchProvid.getInt("softwareDecodeLimitMode", i);
       boolean b = true;
       if (intx != b || (!this.mWayneBuildData.isPreload() || intx == 2)) {
          i = 1;
       }
       if (this.mWayneBuildData.isEnableSoftwareDecodeLimit() && i) {
          p0.setEnableSoftwareDecodeLimit(b);
          p0.setSoftwareDecodeLimit(switchProvid.getInt("softwareDecodeWidthLimit", -1), switchProvid.getInt("softwareDecodeHeightLimit", -1), switchProvid.getInt("softwareDecodeFpsLimit", -1));
       }
       return;
    }
    public final void configStartPlay(KwaiPlayerVodBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "25")) {
          return;
       }
       StartPlayConfigModule startPlayCon = this.ksConfigGet.getStartPlayConfig(this.mWayneBuildData.getMediaType(), this.mWayneBuildData.mIsSlideMode);
       p0.setStartPlayBlockBufferMs(startPlayCon.startPlayBlockMs, startPlayCon.startPlayBlockCostMs);
       StartPlayBlockInfo startPlayBlo = this.mWayneBuildData.getStartPlayBlockInfo();
       if (startPlayBlo != null && startPlayBlo.disable != null) {
          p0.setStartPlayBlockBufferMs(startPlayBlo.bufferMs, startPlayBlo.maxBufferCostMs);
       }
       StartPlayConfigModule startPlayMax = startPlayCon.startPlayMaxBufferStrategy;
       if (startPlayMax > null) {
          p0.setMaxBufferStrategy(startPlayMax);
       }
       startPlayMax = startPlayCon.startPlayMaxBufferMS;
       if (startPlayMax > null) {
          p0.setMaxBufferTimeBspMs(startPlayMax);
       }
       startPlayMax = startPlayCon.startPlayMaxBufferBytes;
       if (startPlayMax > null) {
          p0.setMaxBufferSizeBspBytes(startPlayMax);
       }
       startPlayMax = startPlayCon.startPlayBlockStrategy;
       if (startPlayMax > null) {
          p0.setStartPlayBlockStrategy(startPlayMax);
       }
       if (this.mWayneBuildData.mStartPlayType == 1) {
          p0.setPreLoadDurationMs(1, (long)startPlayCon.preloadMs);
       }
       int b = (this.mWayneBuildData.mStartPlayType == 2)? true: false;
       p0.setStartOnPrepared(b);
       KwaiMediaPlayerBuilder tmWayneBuild = this.mWayneBuildData;
       WayneBuildData mStartPositi = tmWayneBuild.mStartPosition;
       if (mStartPositi >= 0) {
          p0.seekAtStart(mStartPositi);
       }else if(tmWayneBuild.mPlayFromHistory != null){
          p0.seekAtStart(KSVodPlayHistoryManager.getInstance().getPlayPositionWithKey(this.mWayneBuildData.getDataSourceModule().getResourceKey()));
       }
       tmWayneBuild = this.mWayneBuildData;
       WayneBuildData mViewHeight = tmWayneBuild.mViewHeight;
       if (mViewHeight > null && mViewHeight > null) {
          p0.setViewSize(tmWayneBuild.mViewWidth, mViewHeight);
       }
       tmWayneBuild = this.mWayneBuildData;
       mViewHeight = tmWayneBuild.mPlayerAudioFadeInMs;
       if (mViewHeight > null) {
          p0.setFadeinEndTimeMs(mViewHeight);
       }else if(tmWayneBuild.mIsSlideMode != null){
          b = this.ksConfigGet.getFadeinEndTimeMs_slide();
       }else {
          b = this.ksConfigGet.getFadeinEndTimeMs();
       }
       if (b > 0) {
          p0.setFadeinEndTimeMs(b);
       }
       if (this.mWayneBuildData.mEnableAPJoySound != null) {
          p0.setEnableAPJoySound(1);
       }
       p0.setEnableDecisionJointStrategy(this.ksConfigGet.enableDecisionJointStrategy());
       return;
    }
    public final void configUseAemon(KwaiPlayerVodBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "4")) {
          return;
       }
       boolean booleanx = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getBoolean("enableAemonHLS", false);
       if (this.mWayneBuildData.getMediaType() == 1) {
          p0.setAemonConfig(InjectConfig.getConfig().enableUseAemon());
       }else if(this.mWayneBuildData.getMediaType() == 2){
          DebugLog.i("KwaiMediaPlayerBuilder", "aemon-hls enabled:"+booleanx);
          String str = (booleanx)? InjectConfig.getConfig().enableUseAemon(): "unset";
          p0.setAemonConfig(str);
       }
       return;
    }
    public final void configVR(KwaiPlayerVodBuilder p0,KwaiManifest p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiMediaPlayerBuilder.class, "7")) {
          return;
       }
       if (p1 != null && p1.mStereoType != null) {
          p0.setIsVR(true);
          p0.setStereoType(p1.mStereoType);
          p0.setEnableAudioConvert(this.ksConfigGet.enableAudioConvert());
       }
       return;
    }
    public final void configVeSr(KwaiPlayerVodBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "23")) {
          return;
       }
       KwaiManifest kwaiManifest = this.mWayneBuildData.getDataSourceModule().getKwaiManifest();
       String str = "KwaiMediaPlayerBuilder";
       if (kwaiManifest == null) {
          DebugLog.e(str, "configVeSr manifest is null");
          return;
       }else {
          PhotoInfo photoInfo = kwaiManifest.getPhotoInfo();
          if (photoInfo == null) {
             DebugLog.e(str, "configVeSr photoInfo is null");
             return;
          }else {
             int enableAdPlcT = this.ksConfigGet.getEnableAdPlcType();
             int i = 0;
             if (photoInfo.getShouldUseVip()) {
                i = (!enableAdPlcT)? -1: 1;
             }
          label_003f :
             p0.setForceEnableSr(i);
             return;
          }
       }
    }
    public final void configVodAdaptive(AspectKwaiVodAdaptive p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayerBuilder.class, "11")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (this.mWayneBuildData.getWayneDataSourceType() == 6 && (this.mWayneBuildData.getMediaType() == 2 && this.ksConfigGet.enableHlsAutoSwitch())) {
          p0.setAbrConfig(this.ksConfigGet.getHlsSwitchConfig());
          p0.setDeviceResolution(ViewUtil.getScreenWidth(), ViewUtil.getScreenRealHeight());
          p0.setNetworkType(AwesomeCache$VodAdaptive.getAdaptiveNetType(WaynePlayerInitor.APP_CONTEXT));
          p0.setModelPath(this.mWayneBuildData.mModelPath);
          p0.setRepQualityTypeBlackList(this.mWayneBuildData.getQualityTypeAdaptiveBlackList());
          p0.setRepQualityTypeWhiteList(this.mWayneBuildData.getQualityTypeAdaptiveWhiteList());
       }else {
          p0.setMp4AbrModelPath(this.mWayneBuildData.mMp4AbrModelPath);
          p0.setAbrDeviceInfoFactor((long)this.ksConfigGet.getAzerothCommonConfig().abrDeviceInfoFactor, (long)(int)(this.ksConfigGet.getAzerothCommonConfig().deviceGeneralScore * 0x408f400000000000));
       }
       return;
    }
    public IKwaiMediaPlayer createPlayer(){
       IKwaiMediaPlayer obj = PatchProxy.apply(null, this, KwaiMediaPlayerBuilder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getInnerVodBuilder().build();
       this.configPlayerAfterBuilt(obj);
       DebugLog.i("KwaiMediaPlayerBuilder", "KpMidVodHlsBuilder.createPlayer");
       return obj;
    }
    public KwaiPlayerVodBuilder getInnerVodBuilder(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayerBuilder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.prepareInnerVodBuilderOnce();
       return this.mInnerVodBuilder;
    }
    public synchronized void prepareInnerVodBuilderOnce(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayerBuilder.class, "3")) {
          return;
       }
       if (this.mInnerVodBuilderPrepared != null) {
          return;
       }
       this.mInnerVodBuilder.setPlayerType(this.mWayneBuildData.mPlayerType);
       this.mInnerVodBuilder.setEnableAPSpeedChanger(this.mWayneBuildData.mEnableAPSpeedChanger);
       KwaiMediaPlayerBuilder tmInnerVodBu = this.mInnerVodBuilder;
       boolean b = (this.mWayneBuildData.getMediaType() == 2)? true: false;
       tmInnerVodBu.setIsHls(b);
       this.configMisc(this.mInnerVodBuilder);
       this.configDataSourceToBuilder(this.mInnerVodBuilder);
       this.configStartPlay(this.mInnerVodBuilder);
       this.configBufferControl(this.mInnerVodBuilder);
       this.configRender(this.mInnerVodBuilder);
       this.configAvSync(this.mInnerVodBuilder);
       this.configSoftwareDecoder(this.mInnerVodBuilder);
       this.configHardwareDecoder(this.mInnerVodBuilder);
       this.configKwaiManifestReleated(this.mInnerVodBuilder);
       this.configUseAemon(this.mInnerVodBuilder);
       this.mInnerVodBuilderPrepared = true;
       return;
    }
    public void setIndexInfo(PlayerIndexInfo p0){
       this.indexInfo = p0;
    }
    public void setUseKpmidPlayer(boolean p0){
       this.mUseKpmidPlayer = p0;
    }
    public final boolean shouldUseVodP2sp(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayerBuilder.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int vodP2spSwitc = KpMidLocalDebugConfig.getVodP2spSwitch();
       boolean b = true;
       if (vodP2spSwitc == b) {
          return b;
       }
       if (vodP2spSwitc != 2) {
          return this.mWayneBuildData.mUseVodP2sp;
       }
       return false;
    }
}
