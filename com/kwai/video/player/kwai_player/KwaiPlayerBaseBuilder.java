package com.kwai.video.player.kwai_player.KwaiPlayerBaseBuilder;
import android.content.Context;
import java.lang.Object;
import com.kwai.video.player.kwai_player.KwaiPlayerBaseBuilder$1;
import ai7.d;
import com.kwai.video.player.KsMediaPlayerInitConfig;
import com.kwai.video.player.kwai_player.IBuildKwaiPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.hodor.util.Timber;
import com.kwai.video.aemonplayer.surface.EGLCompat;
import com.kwai.video.aemonplayer.MediaCodecLimit;
import java.lang.Integer;
import com.kwai.video.player.kwai_player.ProductContext;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.player.kwai_player.KwaiBatteryInfoUtil;
import com.kwai.video.player.kwai_player.KwaiBrightnessUtil;
import bi7.d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import com.kwai.video.hodor.util.FileUtils;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import bi7.b;
import org.json.JSONObject;
import org.json.JSONException;
import java.lang.Boolean;
import android.os.Build$VERSION;
import java.lang.Float;

public abstract class KwaiPlayerBaseBuilder	// class@000b3d
{
    public boolean isFakeManifest;
    public String mAemonConfig;
    public boolean mAsyncStreamClose;
    public boolean mAsyncStreamComponentOpen;
    public int mAudioLatency;
    public int mAzerothHwConfigStatus;
    public String mBizExtra;
    public String mBizFt;
    public Context mContext;
    public boolean mDisableFallbackSwDecInStop;
    public boolean mEnableAudioMix;
    public boolean mEnableAutoRetry;
    public boolean mEnableAvSyncOpt;
    public boolean mEnableAvSyncOpt2;
    public boolean mEnableAvSyncOpt3;
    public boolean mEnableAvSyncOpt4;
    public boolean mEnableBatteryInfo;
    public boolean mEnableBrightnessInfo;
    public boolean mEnableBuffingOptimize;
    public boolean mEnableBulletScreenCache;
    public boolean mEnableDisconnectWindow;
    public boolean mEnableEglReleaseOnVout;
    public int mEnableFFmpegConnectionTimeout;
    public boolean mEnableForceRendered;
    public boolean mEnableLutRender;
    public boolean mEnableMultiAudioDetector;
    public boolean mEnableNativeCdnRetry;
    public boolean mEnableQuickStart;
    public boolean mEnableSegmentCache;
    public boolean mEnableSoftwareDecodeLimit;
    public boolean mEnableThreadWakeupOptimize;
    public boolean mEnableVodAdaptive;
    public boolean mEnableVppRawDump;
    public boolean mEnbleAudioConvert;
    public int mFFmpegConnectionTimeoutSec;
    public int mFFmpegDataReadTimeoutSec;
    public int mFFmpegSocketRecvBufferSize;
    public int mFFmpegSocketSendBufferSize;
    public int mFadeinEndTimeMs;
    public boolean mForceVppAvsyncOpt2;
    public int mHardwareVppBits;
    public String mHevcDcoderName;
    public int mInteractiveMode;
    public boolean mIsMultiSurface;
    public boolean mIsVR;
    public String mKVCDecExtraParams;
    public String mKs265DecExtraParams;
    public String mLibKwaivppFilters;
    public String mLibKwaivppJson;
    public int mMaxBufferSizeBspBytes;
    public int mMaxBufferSizeBytes;
    public int mMaxBufferTimeBspMs;
    public int mMaxBufferTimeMs;
    public int mMediaCodecAvcHeightLimit;
    public int mMediaCodecAvcResolutionLimit;
    public int mMediaCodecAvcWidthLimit;
    public int mMediaCodecHevcHeightLimit;
    public int mMediaCodecHevcResolutionLimit;
    public int mMediaCodecHevcWidthLimit;
    public int mMediaCodecInvalidateVer;
    public int mMediaCodecMaxNum;
    public String mNetworkRetryScene;
    public int mOesCompatType;
    public Integer mOverlayFormat;
    public String mOverlayFormatString;
    public boolean mPostprocessOpt;
    public ProductContext mProductContext;
    public int mSoftwareDecodeFpsLimit;
    public int mSoftwareDecodeHeightLimit;
    public int mSoftwareDecodeWidthLimit;
    public boolean mStartOnPrepared;
    public int mStereoType;
    public d mSwitchProvider;
    public int mUseHardwareDcoderFlag;
    public boolean mUseLibfdkForAac;
    public boolean mUseMediaCodecAutoSwitcher;
    public boolean mUseMediaCodecByteBuffer;
    public boolean mUseMediaCodecDummySurface;
    public boolean mUseMediaCodecOesSurface;
    public boolean mUseMediaCodecOnly;
    public boolean mUseMediaCodecSetSurfaceWithoutReconfig;
    public boolean mUseMediaCodecWithSurfaceView;
    public boolean mUseNatvieCache;
    public boolean mUseOpenSLES;
    public int mVideoAlphaType;
    public int mVideoPictureQueueSize;
    public int mViewHeight;
    public float mViewPixelRatio;
    public int mViewWidth;
    public boolean mVisionEngineLibLoaded;

    public void KwaiPlayerBaseBuilder(Context p0){
       super();
       this.mAudioLatency = -1;
       this.mUseOpenSLES = false;
       this.mEnableBatteryInfo = false;
       this.mOverlayFormat = null;
       this.mOverlayFormatString = null;
       this.mUseMediaCodecDummySurface = false;
       this.mUseMediaCodecSetSurfaceWithoutReconfig = false;
       this.mUseMediaCodecWithSurfaceView = false;
       this.mUseMediaCodecOesSurface = false;
       this.isFakeManifest = false;
       this.mOesCompatType = 0;
       this.mLibKwaivppJson = "";
       this.mHardwareVppBits = 0;
       this.mEnableEglReleaseOnVout = false;
       this.mEnableDisconnectWindow = false;
       this.mEnableVppRawDump = false;
       this.mUseHardwareDcoderFlag = 0;
       this.mUseLibfdkForAac = false;
       this.mHevcDcoderName = "libqy265dec";
       this.mStartOnPrepared = true;
       this.mAsyncStreamComponentOpen = false;
       this.mAsyncStreamClose = false;
       this.mDisableFallbackSwDecInStop = false;
       this.mEnableThreadWakeupOptimize = false;
       this.mEnableBuffingOptimize = false;
       this.mEnableQuickStart = false;
       this.mEnableVodAdaptive = false;
       this.mUseNatvieCache = false;
       this.mEnableSegmentCache = false;
       this.mEnableBulletScreenCache = false;
       this.mEnableAudioMix = false;
       this.mVideoPictureQueueSize = 3;
       this.mEnableSoftwareDecodeLimit = false;
       this.mSoftwareDecodeWidthLimit = -1;
       this.mSoftwareDecodeHeightLimit = -1;
       this.mSoftwareDecodeFpsLimit = -1;
       this.mMediaCodecMaxNum = -1;
       this.mMediaCodecAvcHeightLimit = -1;
       this.mMediaCodecHevcHeightLimit = -1;
       this.mMediaCodecAvcWidthLimit = -1;
       this.mMediaCodecHevcWidthLimit = -1;
       this.mMediaCodecAvcResolutionLimit = -1;
       this.mMediaCodecHevcResolutionLimit = -1;
       this.mUseMediaCodecByteBuffer = false;
       this.mUseMediaCodecOnly = false;
       this.mMaxBufferSizeBytes = -1;
       this.mMaxBufferTimeMs = 0x1d4c0;
       this.mMaxBufferTimeBspMs = -1;
       this.mMaxBufferSizeBspBytes = -1;
       this.mEnableFFmpegConnectionTimeout = 0;
       this.mFFmpegConnectionTimeoutSec = 5;
       this.mFFmpegDataReadTimeoutSec = 30;
       this.mFFmpegSocketSendBufferSize = -1;
       this.mFFmpegSocketRecvBufferSize = -1;
       this.mFadeinEndTimeMs = 0;
       this.mKs265DecExtraParams = null;
       this.mKVCDecExtraParams = null;
       this.mEnableAvSyncOpt = false;
       this.mEnableNativeCdnRetry = false;
       this.mEnableAutoRetry = false;
       this.mEnableAvSyncOpt2 = false;
       this.mEnableAvSyncOpt3 = false;
       this.mEnableAvSyncOpt4 = true;
       this.mEnableMultiAudioDetector = false;
       this.mEnableForceRendered = false;
       this.mIsMultiSurface = false;
       this.mIsVR = false;
       this.mInteractiveMode = 0;
       this.mStereoType = 0;
       this.mEnbleAudioConvert = false;
       this.mPostprocessOpt = false;
       this.mVideoAlphaType = 0;
       this.mForceVppAvsyncOpt2 = false;
       this.mMediaCodecInvalidateVer = 0;
       this.mEnableBrightnessInfo = false;
       this.mEnableLutRender = false;
       this.mUseMediaCodecAutoSwitcher = false;
       this.mViewPixelRatio = 0;
       this.mAemonConfig = "";
       this.mSwitchProvider = new KwaiPlayerBaseBuilder$1(this);
       this.mAzerothHwConfigStatus = 0;
       this.mVisionEngineLibLoaded = false;
       this.mNetworkRetryScene = "";
       this.mContext = p0.getApplicationContext();
       if (KsMediaPlayerInitConfig.getPlayerSwitchProvider() != null) {
          this.mSwitchProvider = KsMediaPlayerInitConfig.getPlayerSwitchProvider();
       }
       return;
    }
    public void applyTo(IBuildKwaiPlayer p0){
       long l2;
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPlayerBaseBuilder.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       Timber.d("applyTo", objArray);
       KwaiPlayerBaseBuilder tmContext = this.mContext;
       if (tmContext != null) {
          p0.setQy265Context(tmContext);
          p0.setContext(this.mContext);
          EGLCompat.setup(this.mContext);
       }
       p0.setupAspectNativeCache(this.mUseNatvieCache);
       p0.setEnableSegmentCache(this.mEnableSegmentCache);
       p0.setEnableBulletScreenCache(this.mEnableBulletScreenCache);
       p0.setEnableAudioMix(this.mEnableAudioMix);
       long l = 0;
       long l1 = (this.mUseOpenSLES != null)? 1: l;
       int i1 = 4;
       p0.setOption(i1, "opensles", l1);
       l1 = (this.mStartOnPrepared != null)? 1: l;
       p0.setOption(i1, "start-on-prepared", l1);
       l1 = (this.mAsyncStreamComponentOpen != null)? 1: l;
       p0.setOption(i1, "async-stream-component-open", l1);
       l1 = (this.mAsyncStreamClose != null)? 1: l;
       p0.setOption(i1, "async-stream-close", l1);
       l1 = (this.mDisableFallbackSwDecInStop != null)? 1: l;
       p0.setOption(i1, "disable-fallback-sw-dec-in-stop", l1);
       l1 = (this.mEnableThreadWakeupOptimize != null)? 1: l;
       p0.setOption(i1, "enable-thread-wakeup-optimize", l1);
       l1 = (this.mEnableBuffingOptimize != null)? 1: l;
       p0.setOption(i1, "enable-buffing-optimize", l1);
       l1 = (this.mEnableQuickStart != null)? 1: l;
       p0.setOption(i1, "enable-quick-start", l1);
       KwaiPlayerBaseBuilder tmVideoPictu = this.mVideoPictureQueueSize;
       int i2 = 3;
       if (tmVideoPictu > i2 && tmVideoPictu <= 16) {
          p0.setOption(i1, "video-pictq-size", (long)tmVideoPictu);
       }
       tmVideoPictu = this.mMediaCodecMaxNum;
       if (tmVideoPictu > null) {
          MediaCodecLimit.SetMax(tmVideoPictu);
          p0.setOption(i1, "mediacodec-max-cnt", (long)this.mMediaCodecMaxNum);
       }
       tmVideoPictu = this.mMediaCodecAvcHeightLimit;
       if (tmVideoPictu > null) {
          p0.setOption(i1, "mediacodec-avc-height-limit", (long)tmVideoPictu);
       }
       tmVideoPictu = this.mMediaCodecHevcHeightLimit;
       if (tmVideoPictu > null) {
          p0.setOption(i1, "mediacodec-hevc-height-limit", (long)tmVideoPictu);
       }
       tmVideoPictu = this.mMediaCodecAvcWidthLimit;
       if (tmVideoPictu > null) {
          p0.setOption(i1, "mediacodec-avc-width-limit", (long)tmVideoPictu);
       }
       tmVideoPictu = this.mMediaCodecHevcWidthLimit;
       if (tmVideoPictu > null) {
          p0.setOption(i1, "mediacodec-hevc-width-limit", (long)tmVideoPictu);
       }
       tmVideoPictu = this.mMediaCodecAvcResolutionLimit;
       if (tmVideoPictu > null) {
          p0.setOption(i1, "mediacodec-avc-resolution-limit", (long)tmVideoPictu);
       }
       tmVideoPictu = this.mMediaCodecHevcResolutionLimit;
       if (tmVideoPictu > null) {
          p0.setOption(i1, "mediacodec-hevc-resolution-limit", (long)tmVideoPictu);
       }
       if (this.mUseMediaCodecByteBuffer != null) {
          p0.setOption(i1, "use-mediacodec-bytebuffer", 1);
       }
       if (this.mUseMediaCodecOnly != null) {
          p0.setOption(i1, "create-mediacodec-only", 1);
       }
       if (this.mEnableSoftwareDecodeLimit != null) {
          p0.setOption(i1, "enable-software-decode-limitation", 1);
          tmVideoPictu = this.mSoftwareDecodeWidthLimit;
          if (tmVideoPictu > null) {
             p0.setOption(i1, "software-decode-width-limit", (long)tmVideoPictu);
          }
          tmVideoPictu = this.mSoftwareDecodeHeightLimit;
          if (tmVideoPictu > null) {
             p0.setOption(i1, "software-decode-height-limit", (long)tmVideoPictu);
          }
          tmVideoPictu = this.mSoftwareDecodeFpsLimit;
          if (tmVideoPictu > null) {
             p0.setOption(i1, "software-decode-fps-limit", (long)tmVideoPictu);
          }
       }
       tmVideoPictu = this.mOverlayFormat;
       String str = "overlay-format";
       if (tmVideoPictu != null) {
          p0.setOption(i1, str, (long)tmVideoPictu.intValue());
       }else {
          tmVideoPictu = this.mOverlayFormatString;
          if (tmVideoPictu != null) {
             p0.setOption(i1, str, tmVideoPictu);
          }
       }
       tmVideoPictu = this.mProductContext;
       if (tmVideoPictu != null && !(tmVideoPictu.productContextJson).isEmpty()) {
          p0.setProductContext(this.mProductContext);
          p0.setOption(1, "product-context", this.mProductContext.productContextJson);
       }
       if (!TextUtils.isEmpty(this.mBizFt)) {
          p0.setOption(1, "biz-ft", this.mBizFt);
       }
       if (!TextUtils.isEmpty(this.mBizExtra)) {
          p0.setOption(1, "biz-extra", this.mBizExtra);
       }
       if (this.isFakeManifest != null) {
          p0.setOption(1, "fake_manifest", 1);
       }
       if (this.mEnableBatteryInfo != null) {
          KwaiBatteryInfoUtil.collectBatteryInfo(this.mContext);
          p0.setOption(i1, "battery_info.enable_battery_info", 1);
          p0.setOption(i1, "battery-info.battery_level", (long)KwaiBatteryInfoUtil.getBatteryLevel());
          p0.setOption(i1, "battery-info.battery_temperature", (long)KwaiBatteryInfoUtil.getBatteryTemperature());
          l2 = (KwaiBatteryInfoUtil.getIsCharging())? 1: l;
          p0.setOption(i1, "battery-info.is_charging", l2);
          l2 = (KwaiBatteryInfoUtil.getIsPowerSaveMode())? 1: l;
          p0.setOption(i1, "battery-info.is_low_power_mode", l2);
          p0.setOption(i1, "device-thermal-state", (long)KwaiBatteryInfoUtil.getCurrentThermalStatus());
       }
       tmVideoPictu = this.mAudioLatency;
       if (tmVideoPictu != -1) {
          p0.setAudioLatency(tmVideoPictu);
       }
       if (this.mEnableBrightnessInfo != null) {
          KwaiBrightnessUtil.collectBrightnessInfo(this.mContext);
          p0.setOption(i1, "brightness-info.enable_brightness_info", 1);
          p0.setOption(i1, "brightness-info.brightness", (long)KwaiBrightnessUtil.getSystemBrightnessPercent());
          p0.setOption(i1, "brightness-info.mode", (long)KwaiBrightnessUtil.getSystemBrightAutoMode());
       }
       if (this.mUseLibfdkForAac != null) {
          p0.setOption(i1, "aac-libfdk", 1);
       }
       tmVideoPictu = this.mFadeinEndTimeMs;
       if (tmVideoPictu > null) {
          p0.setOption(i1, "fade-in-end-time-ms", (long)tmVideoPictu);
       }
       tmVideoPictu = this.mEnableAvSyncOpt;
       if (tmVideoPictu != null) {
          l2 = (tmVideoPictu != null)? 1: l;
          p0.setOption(i1, "enable-av-sync-opt", l2);
       }
       if (this.mEnableNativeCdnRetry != null) {
          p0.setOption(i1, "enable-cdn-retry", 1);
       }
       if (this.mEnableAutoRetry != null) {
          p0.setOption(i1, "enable-auto-retry", 1);
       }
       tmVideoPictu = this.mEnableAvSyncOpt2;
       if (tmVideoPictu != null) {
          l2 = (tmVideoPictu != null)? 1: l;
          p0.setOption(i1, "enable-av-sync-opt2", l2);
       }
       p0.setOption(i1, "enable-av-sync-opt3", l);
       p0.setOption(i1, "enable-av-sync-opt4", 1);
       tmVideoPictu = this.mEnableMultiAudioDetector;
       if (tmVideoPictu != null) {
          l2 = (tmVideoPictu != null)? 1: l;
          p0.setOption(i1, "enable-multi-audio-detector", l2);
       }
       tmVideoPictu = this.mEnableForceRendered;
       if (tmVideoPictu != null) {
          l2 = (tmVideoPictu != null)? 1: l;
          p0.setOption(i1, "enable-first-frame-force-rendered", l2);
       }
       p0.setHevcCodecName(this.mHevcDcoderName);
       p0.setCodecFlag(this.mUseHardwareDcoderFlag);
       if (this.mUseMediaCodecDummySurface != null) {
          p0.setOption(i1, "use-mediacodec-dummy-surface", 1);
       }
       if (this.mUseMediaCodecSetSurfaceWithoutReconfig != null) {
          p0.setOption(i1, "use-mediacodec-set-output-surface", 1);
       }
       if (this.mUseMediaCodecWithSurfaceView != null) {
          p0.setOption(i1, "use-mediacodec-surfaceview", 1);
       }
       tmVideoPictu = this.mHardwareVppBits;
       if (tmVideoPictu > null) {
          p0.setOption(i1, "hardware-vpp-bits", (long)tmVideoPictu);
       }
       if (this.mUseMediaCodecOesSurface != null) {
          p0.setOption(i1, "use-mediacodec-oes-surface", 1);
          p0.setupGpuContext();
       }
       if (this.mUseMediaCodecAutoSwitcher != null) {
          p0.setOption(i1, "use-mediacodec-auto-switcher", 1);
       }
       tmVideoPictu = this.mVideoAlphaType;
       if (tmVideoPictu > null) {
          p0.setOption(i1, "video-alpha-type", (long)tmVideoPictu);
          p0.setupGpuContext();
       }
       if (this.mForceVppAvsyncOpt2 != null) {
          p0.setOption(i1, "force-vpp-avsync-opt2", 1);
       }
       p0.setOption(i1, "mediacodec-invalidate-ver", (long)this.mMediaCodecInvalidateVer);
       l2 = (this.mEnableEglReleaseOnVout != null)? 1: l;
       p0.setOption(i1, "enable-egl-release-on-vout", l2);
       l2 = (this.mEnableDisconnectWindow != null)? 1: l;
       p0.setOption(i1, "enable-window-disconnect", l2);
       l2 = (EGLCompat.isEnableOpenGlEs30())? 1: l;
       p0.setOption(i1, "enable-opengles-30", l2);
       p0.setOption(i1, "mediacodec-oes-compat-type", (long)this.mOesCompatType);
       if (!TextUtils.isEmpty(this.mLibKwaivppJson)) {
          d uod = d.c();
          KwaiPlayerBaseBuilder tmContext1 = this.mContext;
          KwaiPlayerBaseBuilder tmLibKwaivpp = this.mLibKwaivppJson;
          Objects.requireNonNull(uod);
          String obj = PatchProxy.applyTwoRefs(tmContext1, tmLibKwaivpp, uod, d.class, "3");
          if (obj != PatchProxyResult.class) {
             tmLibKwaivpp = obj;
          }else if(TextUtils.isEmpty(tmLibKwaivpp)){
             if (uod.a == null) {
                File defaultCache = FileUtils.getDefaultCacheDir(tmContext1, i);
                if (defaultCache != null) {
                   uod.a = new File(defaultCache, "kwaivpp");
                }
             }
             Iterator iterator = uod.c.keySet().iterator();
             try{
                while (iterator.hasNext()) {
                   obj = iterator.next();
                   if (tmLibKwaivpp.contains(obj)) {
                      b uob = uod.c.get(obj);
                      JSONObject jSONObject = new JSONObject(tmLibKwaivpp);
                      if (uob.b(uod, uod.a, jSONObject.getJSONObject(obj))) {
                         tmLibKwaivpp = jSONObject.toString();
                         break ;
                      }
                   }
                }
             }catch(org.json.JSONException e6){
                e6.printStackTrace();
             }
          }
       }
       if (!TextUtils.isEmpty(this.mLibKwaivppFilters)) {
          p0.setKwaivppFilters(i, this.mLibKwaivppFilters);
       }
       KwaiPlayerBaseBuilder tmEnableLutR = this.mEnableLutRender;
       if (tmEnableLutR != null) {
          l2 = (tmEnableLutR != null)? 1: l;
          p0.setOption(i1, "watch-video-as-guest", l2);
       }
       p0.enablePipenodeV2(1);
       int i3 = 2;
       p0.setExtOption(i3, this.mViewWidth);
       p0.setExtOption(i2, this.mViewHeight);
       p0.setExtOption(6, (int)(this.mViewPixelRatio * 100.00f));
       l2 = (this.mEnableVppRawDump != null)? 1: l;
       p0.setOption(i1, "enable-vpp-raw-dump", l2);
       if (!TextUtils.isEmpty(this.mKs265DecExtraParams)) {
          p0.setOption(i3, "ks265_params", this.mKs265DecExtraParams);
       }
       if (!TextUtils.isEmpty(this.mKVCDecExtraParams)) {
          p0.setOption(i3, "kvc_params", this.mKVCDecExtraParams);
       }
       tmEnableLutR = this.mMaxBufferSizeBytes;
       if (tmEnableLutR > null) {
          p0.setOption(i1, "max-buffer-size", (long)tmEnableLutR);
       }
       tmEnableLutR = this.mMaxBufferTimeMs;
       if (tmEnableLutR > null) {
          p0.setOption(i1, "max-buffer-dur-ms", (long)tmEnableLutR);
       }
       tmEnableLutR = this.mMaxBufferTimeBspMs;
       if (tmEnableLutR > null) {
          p0.setOption(i1, "dcc.max-buffer-dur-bsp-ms", (long)tmEnableLutR);
       }
       tmEnableLutR = this.mMaxBufferSizeBspBytes;
       if (tmEnableLutR > null) {
          p0.setOption(i1, "dcc.max-buffer-size-bsp-bytes", (long)tmEnableLutR);
       }
       if (this.mEnableFFmpegConnectionTimeout > null) {
          p0.setOption(i1, "enable-connect-timeout", 1);
       }
       if (this.mPostprocessOpt != null) {
          l = 1;
       }
       p0.setOption(i1, "post-process-opt", l);
       p0.setConnectionTimeout(this.mFFmpegConnectionTimeoutSec);
       p0.setReadTimeout(this.mFFmpegDataReadTimeoutSec);
       tmEnableLutR = this.mFFmpegSocketRecvBufferSize;
       if (tmEnableLutR > null) {
          p0.setOption(1, "recv_buffer_size", (long)tmEnableLutR);
       }
       tmEnableLutR = this.mFFmpegSocketSendBufferSize;
       if (tmEnableLutR > null) {
          p0.setOption(1, "send_buffer_size", (long)tmEnableLutR);
       }
       if (this.mIsVR != null) {
          p0.setInteractiveMode(this.mInteractiveMode);
          p0.setStereoType(this.mStereoType);
          p0.setEnableAudioConvert(this.mEnbleAudioConvert);
          p0.setIsVR(this.mIsVR);
       }else if(this.mIsMultiSurface != null){
          p0.enableMultiSurface();
       }
       tmEnableLutR = this.mAzerothHwConfigStatus;
       if (tmEnableLutR > null) {
          p0.setOption(i1, "azeroth-hw-config-status", (long)tmEnableLutR);
       }
       tmEnableLutR = this.mSwitchProvider;
       if (tmEnableLutR != null) {
          this.setConfigFromSwitchProvider(tmEnableLutR, p0);
       }
       if (this.mVisionEngineLibLoaded != null) {
          p0.setOption(i1, "ve-lib-loaded", 1);
       }
       if (!TextUtils.isEmpty(this.mNetworkRetryScene)) {
          p0.setExtOption(5, this.mNetworkRetryScene);
       }
       return;
    }
    public KwaiPlayerBaseBuilder enableAutoRetry(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "60");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableAutoRetry = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder enableAvSyncOpt(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "61");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableAvSyncOpt = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder enableAvSyncOpt2(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "62");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableAvSyncOpt2 = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder enableAvSyncOpt3(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "63");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.self();
    }
    public KwaiPlayerBaseBuilder enableAvSyncOpt4(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "64");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.self();
    }
    public KwaiPlayerBaseBuilder enableDisconnectWindow(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableDisconnectWindow = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder enableEglReleaseOnVout(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableEglReleaseOnVout = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder enableFirstFrameForceRendered(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "66");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableForceRendered = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder enableMultiAudioDetector(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "65");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableMultiAudioDetector = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder enableNativeCdnRetry(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "59");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableNativeCdnRetry = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder enableUsePipelineV2(boolean p0){
       return this.self();
    }
    public KwaiPlayerBaseBuilder enableVppRawDump(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableVppRawDump = p0;
       return this.self();
    }
    public String getAemonConfig(){
       return this.mAemonConfig;
    }
    public d getSwitchProvider(){
       return this.mSwitchProvider;
    }
    public abstract KwaiPlayerBaseBuilder self();
    public KwaiPlayerBaseBuilder setAemonConfig(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPlayerBaseBuilder.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mAemonConfig = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setAsyncStreamClose(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mAsyncStreamClose = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setAsyncStreamOpen(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mAsyncStreamComponentOpen = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setAudioLatency(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mAudioLatency = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setAzerothHwConfigStatus(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "83");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mAzerothHwConfigStatus = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setBatteryInfo(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableBatteryInfo = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setBizExtra(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPlayerBaseBuilder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mBizExtra = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setBizFt(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPlayerBaseBuilder.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mBizFt = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setBrightnessInfo(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "76");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableBrightnessInfo = p0;
       return this.self();
    }
    public void setConfigFromSwitchProvider(d p0,IBuildKwaiPlayer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiPlayerBaseBuilder.class, "2")) {
          return;
       }
       int intx = p0.getInt("playerDataSourceAbortMode", 0);
       if (intx > 0 && intx <= 3) {
          p1.setOption(4, "data-source-abort-mode", (long)intx);
       }
       p1.setOption(4, "frame-drop-report-time-interval", (long)p0.getInt("playerFrameDropReportTimeInterval", 200));
       p1.setOption(4, "enable-mediacodec-soc-config", (long)p0.getInt("enableMediacodecSocConfig", 0));
       p1.setOption(4, "enable-hwdecoder-for-4k", (long)p0.getInt("enableHWDecoderFor4K", 0));
       p1.setOption(4, "enable-retry-resume-codec", (long)p0.getInt("enableRetryResumeCodec", 0));
       p1.setOption(4, "enable-retry-exception-codec", (long)p0.getInt("enableRetryExceptionCodec", 0));
       p1.setOption(4, "enable-retry-special-codec", (long)p0.getInt("enableRetrySpecialCodec", 0));
       long l = 1;
       long l1 = (p0.getBoolean("enableNotifyFormatChangedForIDR", 0))? l: 0;
       p1.setOption(4, "enable-notify-format-changed-for-IDR", l1);
       p1.setOption(4, "enable-drop-nonref-frame", (long)p0.getInt("enableDropNonRefFrame", 1));
       p1.setOption(4, "enable-buffer-opt-for-cdn-retry", (long)p0.getInt("enableBufferOptForCdnRetry", 0));
       p1.setOption(4, "enable-force-use-xx-decoder", (long)p0.getInt("enableForceUseXXDecoder", 0));
       p1.setOption(4, "mediacodec-limit-ver", (long)p0.getInt("playerAMCLimitVer", 0));
       p1.setOption(4, "network-scene-config-json", p0.getJSON("playerNetworkSceneJson", ""));
       if (!p0.getBoolean("enableHdrSoftRenderer", 0)) {
          l = 0;
       }
       p1.setOption(4, "enable-hdr-soft-renderer", l);
       return;
    }
    public KwaiPlayerBaseBuilder setDisableFallbackSwDecInStop(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "28");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mDisableFallbackSwDecInStop = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setEnableAudioConvert(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "71");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnbleAudioConvert = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setEnableAudioMix(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "36");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableAudioMix = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setEnableBuffingOptimize(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "30");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableBuffingOptimize = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setEnableBulletScreenCache(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "35");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableBulletScreenCache = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setEnableFFmpegConnectionTimeout(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "53");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableFFmpegConnectionTimeout = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setEnableLutRender(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "77");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableLutRender = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setEnableMultiSurface(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "67");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mIsMultiSurface = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setEnableQuickStart(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "31");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableQuickStart = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setEnableSegmentCache(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "34");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableSegmentCache = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setEnableSoftwareDecodeLimit(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "38");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableSoftwareDecodeLimit = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setEnableThreadWakeupOptimize(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableThreadWakeupOptimize = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setEnableVodAdaptive(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "32");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableVodAdaptive = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setFFmpegConnectionTimeout(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "54");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mFFmpegConnectionTimeoutSec = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setFFmpegDataReadTimeout(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "55");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mFFmpegDataReadTimeoutSec = p0;
       return this.self();
    }
    public void setFFmpegSocketRecvBufferSize(int p0){
       this.mFFmpegSocketRecvBufferSize = p0;
    }
    public void setFFmpegSocketSendBufferSize(int p0){
       this.mFFmpegSocketSendBufferSize = p0;
    }
    public KwaiPlayerBaseBuilder setFadeinEndTimeMs(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "56");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mFadeinEndTimeMs = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setForceVppAvsyncOpt2(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "74");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mForceVppAvsyncOpt2 = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setHardwareVppBits(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mHardwareVppBits = p0;
       return this.self();
    }
    public void setHevcDcoderName(String p0){
       this.mHevcDcoderName = p0;
    }
    public KwaiPlayerBaseBuilder setInteractiveMode(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "69");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mInteractiveMode = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setIsVR(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "68");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mIsVR = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setKVCDecExtraParams(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPlayerBaseBuilder.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mKVCDecExtraParams = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setKs265DecExtraParams(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPlayerBaseBuilder.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mKs265DecExtraParams = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setLibKwaivppBits(int p0){
       return this.self();
    }
    public KwaiPlayerBaseBuilder setLibKwaivppFilters(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPlayerBaseBuilder.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mLibKwaivppFilters = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setLibKwaivppJson(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPlayerBaseBuilder.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mLibKwaivppJson = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setLibKwaivppLimitBatteryCharging(int p0){
       return this.self();
    }
    public KwaiPlayerBaseBuilder setLibKwaivppLimitBatteryLevel(int p0){
       return this.self();
    }
    public KwaiPlayerBaseBuilder setLibKwaivppLimitFpsMaxInput(float p0){
       return this.self();
    }
    public KwaiPlayerBaseBuilder setLibKwaivppLimitResolutionVideo(long p0){
       return this.self();
    }
    public KwaiPlayerBaseBuilder setLibKwaivppLimitResolutionViewport(long p0){
       return this.self();
    }
    public KwaiPlayerBaseBuilder setLibKwaivppSrAlpha(float p0){
       return this.self();
    }
    public KwaiPlayerBaseBuilder setLibfdkForAac(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mUseLibfdkForAac = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setMaxBufferSizeBspBytes(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "52");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mMaxBufferSizeBspBytes = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setMaxBufferSizeBytes(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "49");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mMaxBufferSizeBytes = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setMaxBufferTimeBspMs(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "51");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mMaxBufferTimeBspMs = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setMaxBufferTimeMs(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "50");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mMaxBufferTimeMs = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setMediaCodecAvcHeightLimit(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "41");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mMediaCodecAvcHeightLimit = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setMediaCodecAvcResolutionLimit(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "45");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mMediaCodecAvcResolutionLimit = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setMediaCodecAvcWidthLimit(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "43");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mMediaCodecAvcWidthLimit = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setMediaCodecHevcHeightLimit(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "42");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mMediaCodecHevcHeightLimit = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setMediaCodecHevcResolutionLimit(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "46");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mMediaCodecHevcResolutionLimit = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setMediaCodecHevcWidthLimit(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "44");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mMediaCodecHevcWidthLimit = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setMediaCodecInvalidateVer(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "75");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mMediaCodecInvalidateVer = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setMediaCodecMaxNum(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "40");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mMediaCodecMaxNum = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setMediaCodecOesCompatType(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mOesCompatType = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setModifiedManifest(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.isFakeManifest = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setNetworkRetryScene(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPlayerBaseBuilder.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mNetworkRetryScene = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setOverlayFormat(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mOverlayFormat = Integer.valueOf(p0);
       return this.self();
    }
    public KwaiPlayerBaseBuilder setOverlayFormatString(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPlayerBaseBuilder.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mOverlayFormatString = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setPostprocessOpt(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "72");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mPostprocessOpt = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setProductContext(ProductContext p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPlayerBaseBuilder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mProductContext = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setSoftwareDecodeLimit(int p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiPlayerBaseBuilder.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, KwaiPlayerBaseBuilder.class, "39");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mSoftwareDecodeWidthLimit = p0;
       this.mSoftwareDecodeHeightLimit = p1;
       this.mSoftwareDecodeFpsLimit = p2;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setStartOnPrepared(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mStartOnPrepared = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setStereoType(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "70");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mStereoType = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setSwitchProvider(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPlayerBaseBuilder.class, "82");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mSwitchProvider = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setUseHardwareDcoderFlag(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mUseHardwareDcoderFlag = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setUseMediaCodecAutoSwitcher(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "78");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mUseMediaCodecAutoSwitcher = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setUseMediaCodecByteBuffer(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "47");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mUseMediaCodecByteBuffer = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setUseMediaCodecDummySurface(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mUseMediaCodecDummySurface = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setUseMediaCodecOesSurface(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mUseMediaCodecOesSurface = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setUseMediaCodecOnly(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "48");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mUseMediaCodecOnly = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setUseMediaCodecSetSurfaceWithoutReconfig(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (Build$VERSION.SDK_INT >= 23) {
          this.mUseMediaCodecSetSurfaceWithoutReconfig = p0;
       }
       return this.self();
    }
    public KwaiPlayerBaseBuilder setUseMediaCodecSurfaceView(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (Build$VERSION.SDK_INT >= 23) {
          this.mUseMediaCodecWithSurfaceView = p0;
       }
       return this.self();
    }
    public KwaiPlayerBaseBuilder setUseNatvieCache(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mUseNatvieCache = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setUseOpenSLES(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mUseOpenSLES = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setUseVppFrc(int p0){
       this.setHardwareVppBits(p0);
       return this.self();
    }
    public KwaiPlayerBaseBuilder setVideoAlphaType(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "73");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mVideoAlphaType = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setVideoPictureQueueSize(int p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiPlayerBa, "37");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mVideoPictureQueueSize = p0;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setViewSize(int p0,int p1){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, kwaiPlayerBa, "79");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.setViewSize(p0, p1, 0);
    }
    public KwaiPlayerBaseBuilder setViewSize(int p0,int p1,float p2){
       if (PatchProxy.isSupport(KwaiPlayerBaseBuilder.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), this, KwaiPlayerBaseBuilder.class, "80");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mViewWidth = p0;
       this.mViewHeight = p1;
       this.mViewPixelRatio = p2;
       return this.self();
    }
    public KwaiPlayerBaseBuilder setVisionEngineLibLoaded(boolean p0){
       KwaiPlayerBaseBuilder kwaiPlayerBa = KwaiPlayerBaseBuilder.class;
       if (PatchProxy.isSupport(kwaiPlayerBa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kwaiPlayerBa, "84");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mVisionEngineLibLoaded = p0;
       return this.self();
    }
}
