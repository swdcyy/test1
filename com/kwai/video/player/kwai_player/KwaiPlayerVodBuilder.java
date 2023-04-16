package com.kwai.video.player.kwai_player.KwaiPlayerVodBuilder;
import com.kwai.video.player.kwai_player.KwaiPlayerBaseBuilder;
import android.content.Context;
import com.kwai.video.player.kwai_player.IBuildKwaiPlayer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.hodor.util.Timber;
import com.kwai.player.KwaiPlayerConfig;
import com.kwai.video.player.kwai_player.AspectAwesomeCache;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.player.kwai_player.KwaiSystemMediaPlayer;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.PlayerLibraryLoader$FindBestParam;
import ai7.d;
import com.kwai.video.player.kwai_player.KwaiPlayerCreator;
import com.kwai.video.player.kwai_player.KwaiPlayerCreator$InternalKwaiPlayer;
import java.lang.Boolean;

public final class KwaiPlayerVodBuilder extends KwaiPlayerBaseBuilder	// class@000b45
{
    public int mAbLoopCount;
    public long mAbLoopEndMs;
    public long mAbLoopStartMs;
    public long mAppPredictedWatchTimeMs;
    public long mAppStartTime;
    public String mAudioStr;
    public int mBufferAdjustRatioTh_100;
    public int mBufferLowRatioTh_100;
    public int mBwAdjustRatioTh_100;
    public String mCacheKey;
    public int mClarityScore;
    public Context mContext;
    public int mDataSourceAbortMode;
    public boolean mDccAlgEnable;
    public int mDccAlgPreReadMs;
    public int mDccBufferLowRatioTh_10;
    public boolean mDisableSeekAtStart;
    public boolean mDisableVodAudio;
    public boolean mEnableAPJoySound;
    public boolean mEnableAPSpeedChanger;
    public boolean mEnableAccurateSeek;
    public int mEnableAegonNetSpeed;
    public boolean mEnableAudioGain;
    public boolean mEnableCacheSeek;
    public boolean mEnableDccOpt;
    public boolean mEnableDecisionJointStrategy;
    public boolean mEnableLowVVPlayOpt;
    public boolean mEnableManifestRetry;
    public boolean mEnableNewRefluxOpt;
    public boolean mEnablePlayListCache;
    public boolean mEnableSeekForwardOffset;
    public boolean mEnableSwForLowVV;
    public boolean mEnableUnifiedAlg;
    public boolean mEnableVodAdaptive;
    public int mFirstHighDynamicBufferMs;
    public int mFirstHighWaterMarkMs;
    public int mForceEnableSr;
    public int mHdrAdaptiveMode;
    public boolean mIsHls;
    public boolean mIsSeekContinuous;
    public int mLastHighWaterMarkMs;
    public int mManifestType;
    public int mMaxInitBufferDurMs;
    public int mMinInitBufferDurMs;
    public int mNextHighWaterMarkMs;
    public int mPlayerType;
    public long mPreLoadDurationMs;
    public int mPreLoadVer;
    public long mSeekAtStart;
    public int mSeekHighWaterMarkMs;
    public int mSegmentCacheCount;
    public long mServerPredictedWatchTimeMs;
    public int mSf21WarmupPercent;
    public int mSpbBufferMs;
    public int mSpbMaxBufferCostMs;
    public String mSrConfigJson;
    public int mSwitchCode;
    public int mTh_10;
    public boolean mUseSpbBuffer;
    public boolean mUseVodAdaptive;
    public boolean mVodManifestEnable;
    public long mVodManifestHeight;
    public int mVodManifestLowDevice;
    public int mVodManifestMaxResolution;
    public int mVodManifestNetType;
    public String mVodManifestRateConfig;
    public int mVodManifestSignalStrength;
    public long mVodManifestWidth;
    public int mVodMaxBufferStrategy;
    public int mVodStartPlayBlockStrategy;

    public void KwaiPlayerVodBuilder(Context p0){
       super(p0);
       this.mSrConfigJson = "";
       this.mPreLoadVer = 1;
       this.mPreLoadDurationMs = 0;
       this.mEnablePlayListCache = false;
       this.mSegmentCacheCount = 1;
       this.mEnableManifestRetry = false;
       this.mAbLoopStartMs = 0;
       this.mAbLoopEndMs = 0;
       this.mAbLoopCount = -1;
       this.mDisableSeekAtStart = false;
       this.mAppStartTime = 0;
       this.mSeekAtStart = 0;
       this.mEnableAccurateSeek = false;
       this.mEnableSeekForwardOffset = true;
       this.mEnableCacheSeek = false;
       this.mEnableAudioGain = false;
       this.mAudioStr = "0";
       this.mDisableVodAudio = false;
       this.mEnableVodAdaptive = false;
       this.mUseSpbBuffer = false;
       this.mSpbBufferMs = 1000;
       this.mSpbMaxBufferCostMs = 500;
       this.mDccAlgEnable = false;
       this.mTh_10 = 100;
       this.mDccAlgPreReadMs = 5000;
       this.mEnableUnifiedAlg = false;
       this.mBufferLowRatioTh_100 = 50;
       this.mBufferAdjustRatioTh_100 = 500;
       this.mBwAdjustRatioTh_100 = 0;
       this.mMaxInitBufferDurMs = 0x2710;
       this.mMinInitBufferDurMs = 3000;
       this.mEnableDccOpt = false;
       this.mFirstHighDynamicBufferMs = 5000;
       this.mDccBufferLowRatioTh_10 = 5;
       this.mUseVodAdaptive = false;
       this.mFirstHighWaterMarkMs = 100;
       this.mNextHighWaterMarkMs = 1000;
       this.mLastHighWaterMarkMs = 5000;
       this.mSeekHighWaterMarkMs = 100;
       this.mVodManifestEnable = false;
       this.mVodManifestWidth = 0;
       this.mVodManifestHeight = 0;
       this.mVodManifestNetType = 0;
       this.mVodManifestRateConfig = "";
       this.mVodManifestLowDevice = 0;
       this.mVodManifestSignalStrength = 0;
       this.mSwitchCode = 0;
       this.mVodManifestMaxResolution = 0;
       this.mManifestType = 0;
       this.mEnableAegonNetSpeed = 0;
       this.mSf21WarmupPercent = -1;
       this.mHdrAdaptiveMode = 0;
       this.mDataSourceAbortMode = 0;
       this.mClarityScore = 0;
       this.mVodMaxBufferStrategy = -1;
       this.mVodStartPlayBlockStrategy = -1;
       this.mEnableDecisionJointStrategy = false;
       this.mPlayerType = 1;
       this.mEnableAPSpeedChanger = false;
       this.mEnableAPJoySound = false;
       this.mIsSeekContinuous = false;
       this.mServerPredictedWatchTimeMs = -1;
       this.mAppPredictedWatchTimeMs = -1;
       this.mIsHls = false;
       this.mForceEnableSr = 0;
       this.mEnableLowVVPlayOpt = false;
       this.mEnableSwForLowVV = false;
       this.mEnableNewRefluxOpt = false;
       this.mUseNatvieCache = false;
       this.mContext = p0.getApplicationContext();
    }
    public void applyTo(IBuildKwaiPlayer p0){
       long l2;
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPlayerVodBuilder.class, "3")) {
          return;
       }
       super.applyTo(p0);
       Object[] objArray = new Object[0];
       Timber.d("applyTo", objArray);
       p0.setupAspectLiveRealTimeReporter(0, null);
       p0.getAspectAwesomeCache().setCacheKey(this.mCacheKey);
       KwaiPlayerVodBuilder tmPreLoadDur = this.mPreLoadDurationMs;
       long l = 0;
       if (tmPreLoadDur - l > 0) {
          p0.enablePreDemux(this.mPreLoadVer, tmPreLoadDur);
       }
       KwaiPlayerVodBuilder tmAbLoopEndM = this.mAbLoopEndMs;
       if (tmAbLoopEndM - l > 0) {
          p0.setAbLoop(this.mAbLoopStartMs, tmAbLoopEndM, this.mAbLoopCount, this.mDisableSeekAtStart);
       }
       tmPreLoadDur = this.mSeekAtStart;
       if (tmPreLoadDur - l > 0) {
          p0.setOption(4, "seek-at-start", tmPreLoadDur);
       }
       if (this.mDisableVodAudio != null) {
          p0.setOption(4, "an", 1);
       }
       long l1 = (this.mDccAlgEnable != null)? 1: l;
       p0.setOption(4, "dcc-alg.config_enabled", l1);
       if (this.mDccAlgEnable != null) {
          p0.setOption(4, "dcc-alg.config_mark_bitrate_th_10", (long)this.mTh_10);
          p0.setOption(4, "dcc-alg.config_dcc_pre_read_ms", (long)this.mDccAlgPreReadMs);
          l1 = (this.mEnableUnifiedAlg != null)? 1: l;
          p0.setOption(4, "dcc-alg.enable_unified_alg", l1);
          p0.setOption(4, "dcc-alg.buffer_low_ratio_th_100", (long)this.mBufferLowRatioTh_100);
          p0.setOption(4, "dcc-alg.buffer_adjust_ratio_th_100", (long)this.mBufferAdjustRatioTh_100);
          p0.setOption(4, "dcc-alg.bw_adjust_ratio_th_100", (long)this.mBwAdjustRatioTh_100);
          p0.setOption(4, "dcc-alg.max_init_buffer_dur_ms", (long)this.mMaxInitBufferDurMs);
          p0.setOption(4, "dcc-alg.min_init_buffer_dur_ms", (long)this.mMinInitBufferDurMs);
       }
       l1 = (this.mEnableDccOpt != null)? 1: l;
       p0.setOption(4, "dcc.enable-dcc-opt", l1);
       p0.setOption(4, "dcc.first-high-dynamic-buffer-ms", (long)this.mFirstHighDynamicBufferMs);
       p0.setOption(4, "dcc.buffer-low-ratio-th-10", (long)this.mDccBufferLowRatioTh_10);
       l1 = (this.mUseVodAdaptive != null)? 1: l;
       p0.setOption(4, "dcc.use-vod-adaptive", l1);
       p0.setOption(4, "first-high-water-mark-ms", (long)this.mFirstHighWaterMarkMs);
       p0.setOption(4, "next-high-water-mark-ms", (long)this.mNextHighWaterMarkMs);
       p0.setOption(4, "last-high-water-mark-ms", (long)this.mLastHighWaterMarkMs);
       p0.setOption(4, "seek-high-water-mark-ms", (long)this.mSeekHighWaterMarkMs);
       l1 = (this.mIsSeekContinuous != null)? 1: l;
       p0.setOption(4, "enable-seek-continuous", l1);
       tmPreLoadDur = this.mEnablePlayListCache;
       if (tmPreLoadDur != null) {
          p0.setEnablePlaylistCache(tmPreLoadDur);
       }
       if (this.mEnableSegmentCache != null) {
          p0.setSegmentCacheCount(this.mSegmentCacheCount);
       }
       tmPreLoadDur = this.mEnableManifestRetry;
       if (tmPreLoadDur != null) {
          p0.setEnableManifestRetry(tmPreLoadDur);
       }
       if (this.mUseSpbBuffer != null) {
          p0.setStartPlayBlockBufferMs(this.mSpbBufferMs, this.mSpbMaxBufferCostMs);
       }
       tmPreLoadDur = this.mVodMaxBufferStrategy;
       if (tmPreLoadDur > null) {
          p0.setOption(4, "dcc.max-buffer-strategy", (long)tmPreLoadDur);
       }
       tmPreLoadDur = this.mVodStartPlayBlockStrategy;
       if (tmPreLoadDur > null) {
          p0.setStartPlayBlockBufferStrategy(tmPreLoadDur);
       }
       p0.setOption(4, "app-start-time", this.mAppStartTime);
       p0.setOption(4, "islive", l);
       p0.setOption(4, "framedrop", 8);
       l1 = (this.mEnableAccurateSeek != null)? 1: l;
       p0.setOption(4, "enable-accurate-seek", l1);
       l1 = (this.mEnableSeekForwardOffset != null)? 1: l;
       p0.setOption(4, "enable-seek-forward-offset", l1);
       l1 = (this.mEnableCacheSeek != null)? 1: l;
       p0.setOption(4, "enable-cache-seek", l1);
       l1 = (this.mEnableAPSpeedChanger != null)? 1: l;
       p0.setOption(4, "ap-speed-changer.enable", l1);
       l1 = (this.mEnableAPJoySound != null)? 1: l;
       p0.setOption(4, "ap-joysound.enable", l1);
       String str = "hdr-adaptive-mode";
       int i = 1;
       if (this.mVodManifestEnable != null) {
          p0.setOption(4, "enable-vod-manifest", 1);
          p0.setOption(i, "device-resolution-width", this.mVodManifestWidth);
          p0.setOption(i, "device-resolution-height", this.mVodManifestHeight);
          p0.setOption(i, "device-network-type", (long)this.mVodManifestNetType);
          p0.setOption(i, "abr-config-string", this.mVodManifestRateConfig);
          p0.setOption(i, "low-device", (long)this.mVodManifestLowDevice);
          p0.setOption(i, "signal-strength", (long)this.mVodManifestSignalStrength);
          p0.setOption(i, "clarity-score", (long)this.mClarityScore);
          p0.setOption(i, "switch-code", (long)this.mSwitchCode);
          p0.setOption(i, "adaptive-max-resolution", (long)this.mVodManifestMaxResolution);
          p0.setOption(i, "manifest_type", (long)this.mManifestType);
          p0.setOption(i, "enable-aegon-net-speed", (long)this.mEnableAegonNetSpeed);
          tmPreLoadDur = this.mSf21WarmupPercent;
          if (tmPreLoadDur > null && tmPreLoadDur <= 100) {
             p0.setOption(i, "sf21-warmup-percent", (long)tmPreLoadDur);
          }
          p0.setOption(i, str, (long)this.mHdrAdaptiveMode);
          p0.setIsVodAdaptive(i);
       }
       tmPreLoadDur = this.mEnableAudioGain;
       if (tmPreLoadDur != null) {
          l2 = (tmPreLoadDur != null)? 1: l;
          p0.setOption(4, "audio-gain.enable", l2);
          p0.setOption(4, "audio-gain.audio_str", this.mAudioStr);
       }
       l2 = (this.mEnableDecisionJointStrategy != null)? 1: l;
       p0.setOption(i, "enable_joint_strategy", l2);
       l2 = (this.mEnableVodAdaptive != null)? 1: l;
       p0.setOption(i, "enable-adaptive", l2);
       if (this.mEnableVodAdaptive != null) {
          p0.setOption(i, str, (long)this.mHdrAdaptiveMode);
       }
       p0.setupAspectKwaiVodAdaptive(this.mEnableVodAdaptive);
       tmPreLoadDur = this.mServerPredictedWatchTimeMs;
       if (tmPreLoadDur - l >= 0) {
          p0.setOption(4, "server-predicted-watch-time-ms", tmPreLoadDur);
       }
       tmPreLoadDur = this.mAppPredictedWatchTimeMs;
       if (tmPreLoadDur - l >= 0) {
          p0.setOption(4, "app-predicted-watch-time-ms", tmPreLoadDur);
       }
       if (!TextUtils.isEmpty(this.mSrConfigJson)) {
          p0.setOption(4, "ve-sr-kswitch-json", this.mSrConfigJson);
       }
       p0.setOption(4, "ve-sr-force-enable", (long)this.mForceEnableSr);
       l1 = (this.mEnableLowVVPlayOpt != null)? 1: l;
       p0.setOption(4, "enable-low-vv-play-opt", l1);
       if (this.mEnableNewRefluxOpt != null) {
          l = 1;
       }
       p0.setOption(4, "enable-new-reflux-play-opt", l);
       return;
    }
    public void applyToSystemMediaPlayer(KwaiSystemMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPlayerVodBuilder.class, "2")) {
          return;
       }
       KwaiPlayerVodBuilder tmSeekAtStar = this.mSeekAtStart;
       if (tmSeekAtStar > 0) {
          p0.seekAtStart(tmSeekAtStar);
       }
       return;
    }
    public IKwaiMediaPlayer build(){
       KwaiSystemMediaPlayer obj = PatchProxy.apply(null, this, KwaiPlayerVodBuilder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mPlayerType != 2) {
          PlayerLibraryLoader$FindBestParam uFindBestPar = new PlayerLibraryLoader$FindBestParam();
          uFindBestPar.mAemonConfig = this.getAemonConfig();
          uFindBestPar.mIsLive = false;
          uFindBestPar.mIsHls = this.mIsHls;
          uFindBestPar.mProvider = this.getSwitchProvider();
          KwaiPlayerCreator$InternalKwaiPlayer internalKwai = KwaiPlayerCreator.newCreator(uFindBestPar).create();
          internalKwai.getBuildKwaiPlayer().setIsLive(false);
          this.applyTo(internalKwai.getBuildKwaiPlayer());
          internalKwai.getBuildKwaiPlayer().setExtOption(4, uFindBestPar.mOutputNoAemonReason);
          return internalKwai.getIKwaiMediaPlayer();
       }else {
          obj = new KwaiSystemMediaPlayer();
          obj.setContext(this.mContext);
          this.applyToSystemMediaPlayer(obj);
          return obj;
       }
    }
    public KwaiPlayerVodBuilder enableDccOpt(boolean p0){
       this.mEnableDccOpt = p0;
       return this;
    }
    public KwaiPlayerVodBuilder enableUnifiedAlg(boolean p0){
       this.mEnableUnifiedAlg = p0;
       return this;
    }
    public KwaiPlayerVodBuilder seekAtStart(long p0){
       this.mSeekAtStart = p0;
       return this;
    }
    public KwaiPlayerBaseBuilder self(){
       return this.self();
    }
    public KwaiPlayerVodBuilder self(){
       return this;
    }
    public KwaiPlayerVodBuilder setAbLoop(long p0,long p1){
       this.mAbLoopStartMs = p0;
       this.mAbLoopEndMs = p1;
       this.mAbLoopCount = -1;
       return this;
    }
    public KwaiPlayerVodBuilder setAbLoopCount(long p0,long p1,int p2){
       this.mAbLoopStartMs = p0;
       this.mAbLoopEndMs = p1;
       this.mAbLoopCount = p2;
       return this;
    }
    public KwaiPlayerVodBuilder setAbLoopCount(long p0,long p1,int p2,boolean p3){
       this.mAbLoopStartMs = p0;
       this.mAbLoopEndMs = p1;
       this.mAbLoopCount = p2;
       this.mDisableSeekAtStart = p3;
       return this;
    }
    public KwaiPlayerVodBuilder setAppPredictedWatchTimeMs(long p0){
       this.mAppPredictedWatchTimeMs = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setBufferAdjustRatioTh_100(int p0){
       this.mBufferAdjustRatioTh_100 = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setBufferLowRatioTh_100(int p0){
       this.mBufferLowRatioTh_100 = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setBwAdjustRatioTh_100(int p0){
       this.mBwAdjustRatioTh_100 = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setCacheKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPlayerVodBuilder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          Object[] objArray = new Object[0];
          Timber.e("[setCacheKey] invalid input, cacheKey is empty", objArray);
          return this;
       }else {
          this.mCacheKey = p0;
          return this;
       }
    }
    public void setConfigFromSwitchProvider(d p0,IBuildKwaiPlayer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiPlayerVodBuilder.class, "4")) {
          return;
       }
       super.setConfigFromSwitchProvider(p0, p1);
       int i = 0;
       int i1 = 1;
       p1.setOption(i1, "async_data_source_type", (long)p0.getInt("asyncDataSourceType", i));
       p1.setOption(i1, "async_data_source_type_for_hls", (long)p0.getInt("asyncDataSourceTypeForHls", i));
       long l = 1;
       long l1 = (p0.getBoolean("enableForceReconfigCodec", i))? l: 0;
       p1.setOption(4, "enable-force-reconfig-codec", l1);
       p1.setOption(4, "enable-retry-resume-codec", (long)p0.getInt("enableRetryResumeCodec", i));
       p1.setHlsSegmentAlignThreshold(p0.getInt("hlsSegmentAlignThreshold", -1));
       p1.setUseSegmentPreload(p0.getBoolean("hlsSegmentUsePreload", i));
       p1.setDisableHlsAbr(p0.getBoolean("disableHlsAbr", i));
       p1.setHlsEnableMediaCodecBytebuffer(p0.getBoolean("enableHlsMediaCodecByteBuffer", i));
       p1.setOption(i1, "hls_max_scope_size", (long)p0.getInt("hlsMaxScopeSize", i));
       p1.setOption(i1, "hls_scope_config_json", p0.getJSON("hlsScopeConfigJson", ""));
       p1.setOption(i1, "playlist_max_valid_time", (long)p0.getInt("hlsPlaylistMaxValidTime", i));
       p1.setOption(i1, "hls-spb-config-string", p0.getJSON("hlsSpbConfigJson", ""));
       p1.setOption(i1, "hls-player-buffer-config-string", p0.getJSON("hlsPlayerBufferConfig", ""));
       p1.setOption(4, "dcc.array-of-bsp-buf-json", p0.getJSON("BspBufWithNetSpeed", ""));
       p1.setOption(4, "dcc.bsp-buffer-optimize", (long)p0.getInt("BspBufferStrategy", i));
       p1.setOption(4, "dcc-alg.config-json-bsp", p0.getJSON("unifiedDccAlgConfigBsp", ""));
       p1.setOption(4, "dcc.enable_buffer_increase_opt", (long)p0.getInt("enableBufferIncreaseOpt", i));
       p1.setOption(4, "dcc-alg.config_json_buffer_peak_time", p0.getJSON("vodDccAlgPeakTimeConfig", ""));
       p1.setOption(4, "min-bsp-buffer-for-low-vv", (long)p0.getInt("minBspBufferForLowVV", 1000));
       int i2 = 3000;
       p1.setOption(4, "min-player-buffer-for-low-vv", (long)p0.getInt("minPlayerBufferForLowVV", i2));
       p1.setOption(4, "max-player-buffer-for-low-vv", (long)p0.getInt("maxPlayerBufferForLowVV", 0x2710));
       p1.setOption(4, "buffer-adjust-ratio-for-low-vv", (long)p0.getInt("bufferAdjustRatioForLowVV", 500));
       long l2 = (p0.getBoolean("enableAbrForNewReflux", i))? l: 0;
       p1.setOption(4, "enable-abr-for-new-reflux", l2);
       p1.setOption(4, "min-bsp-buffer-for-new-reflux", (long)p0.getInt("minBspBufferForNewReflux", 1000));
       p1.setOption(4, "min-player-buffer-for-new-reflux", (long)p0.getInt("minPlayerBufferForNewReflux", i2));
       if (!p0.getBoolean("enableReviseErrorReport", i)) {
          l = 0;
       }
       p1.setOption(4, "enable-revise-error-report", l);
       p1.setOption(4, "buffer-config-for-ad", p0.getJSON("bufferConfigForAd", ""));
       if (this.mIsHls == null) {
          p1.setOption(4, "probe-size-threshold", (long)p0.getInt("probeSizeThreshold", -1));
       }
       this.mSrConfigJson = p0.getJSON("playerKwaiSrConfig", "");
       return;
    }
    public KwaiPlayerVodBuilder setDccAlgMBTh_10(int p0){
       this.mTh_10 = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setDccAlgPreReadMs(int p0){
       this.mDccAlgPreReadMs = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setDccAlgorithm(boolean p0){
       this.mDccAlgEnable = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setDccBufferLowRatioTh_10(int p0){
       this.mDccBufferLowRatioTh_10 = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setDisableVodAudio(boolean p0){
       this.mDisableVodAudio = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setEnableAPJoySound(boolean p0){
       this.mEnableAPJoySound = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setEnableAPSpeedChanger(boolean p0){
       this.mEnableAPSpeedChanger = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setEnableAccurateSeek(boolean p0){
       this.mEnableAccurateSeek = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setEnableAegonNetSpeed(int p0){
       this.mEnableAegonNetSpeed = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setEnableAudioGain(boolean p0,String p1){
       KwaiPlayerVodBuilder kwaiPlayerVo = KwaiPlayerVodBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerVo)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, kwaiPlayerVo, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableAudioGain = p0;
       this.mAudioStr = (TextUtils.isEmpty(p1))? "0": p1;
       return this;
    }
    public KwaiPlayerVodBuilder setEnableCacheSeek(boolean p0){
       this.mEnableCacheSeek = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setEnableDecisionJointStrategy(boolean p0){
       this.mEnableDecisionJointStrategy = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setEnableLowVVPlayOpt(boolean p0){
       this.mEnableLowVVPlayOpt = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setEnableManifestRetry(boolean p0){
       this.mEnableManifestRetry = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setEnableNewRefluxOpt(boolean p0){
       this.mEnableNewRefluxOpt = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setEnablePlaylistCache(boolean p0){
       this.mEnablePlayListCache = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setEnableSeekContinuous(boolean p0){
       this.mIsSeekContinuous = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setEnableSeekForwardOffset(boolean p0){
       this.mEnableSeekForwardOffset = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setEnableSwForLowVV(boolean p0){
       this.mEnableSwForLowVV = p0;
       return this;
    }
    public KwaiPlayerBaseBuilder setEnableVodAdaptive(boolean p0){
       return this.setEnableVodAdaptive(p0);
    }
    public KwaiPlayerVodBuilder setEnableVodAdaptive(boolean p0){
       this.mEnableVodAdaptive = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setFirstHighDynamicBufferMs(int p0){
       this.mFirstHighDynamicBufferMs = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setFirstHighWaterMarkMs(int p0){
       this.mFirstHighWaterMarkMs = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setForceEnableSr(int p0){
       this.mForceEnableSr = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setIsHls(boolean p0){
       this.mIsHls = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setLastHighWaterMarkMs(int p0){
       this.mLastHighWaterMarkMs = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setManifestType(int p0){
       this.mManifestType = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setMaxBufferStrategy(int p0){
       if (p0 >= 1 && p0 <= 3) {
          this.mVodMaxBufferStrategy = p0;
       }
       return this;
    }
    public KwaiPlayerVodBuilder setMaxInitBufferDurMs(int p0){
       this.mMaxInitBufferDurMs = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setMinInitBufferDurMs(int p0){
       this.mMinInitBufferDurMs = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setNextHighWaterMarkMs(int p0){
       this.mNextHighWaterMarkMs = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setPlayerType(int p0){
       this.mPlayerType = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setPreLoadDurationMs(int p0,long p1){
       this.mPreLoadVer = p0;
       this.mPreLoadDurationMs = p1;
       return this;
    }
    public KwaiPlayerVodBuilder setSeekHighWaterMarkMs(int p0){
       this.mSeekHighWaterMarkMs = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setSegmentCacheCount(int p0){
       this.mSegmentCacheCount = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setServerPredictedWatchTimeMs(long p0){
       this.mServerPredictedWatchTimeMs = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setStartPlayBlockBufferMs(int p0,int p1){
       this.mUseSpbBuffer = true;
       this.mSpbBufferMs = p0;
       this.mSpbMaxBufferCostMs = p1;
       return this;
    }
    public KwaiPlayerVodBuilder setStartPlayBlockStrategy(int p0){
       if (p0 >= 0 && p0 <= 2) {
          this.mVodStartPlayBlockStrategy = p0;
       }
       return this;
    }
    public KwaiPlayerVodBuilder setStartTime(long p0){
       this.mAppStartTime = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setVodManifest(int p0,long p1,long p2,String p3,int p4,int p5,int p6){
       this.mVodManifestEnable = true;
       this.mVodManifestHeight = p2;
       this.mVodManifestWidth = p1;
       this.mVodManifestNetType = p0;
       this.mVodManifestRateConfig = p3;
       this.mVodManifestLowDevice = p4;
       this.mVodManifestSignalStrength = p5;
       this.mClarityScore = p6;
       return this;
    }
    public KwaiPlayerVodBuilder setVodManifestHdrAdaptiveMode(int p0){
       this.mHdrAdaptiveMode = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setVodManifestMaxResolution(int p0){
       this.mVodManifestMaxResolution = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setVodManifestSwitchCode(int p0){
       this.mSwitchCode = p0;
       return this;
    }
    public KwaiPlayerVodBuilder setVodManifestWarmupPercentThreshold(int p0){
       this.mSf21WarmupPercent = p0;
       return this;
    }
    public KwaiPlayerVodBuilder useVodAdaptive(boolean p0){
       this.mUseVodAdaptive = p0;
       return this;
    }
}
