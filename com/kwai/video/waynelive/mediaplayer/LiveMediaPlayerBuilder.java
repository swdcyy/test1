package com.kwai.video.waynelive.mediaplayer.LiveMediaPlayerBuilder;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.waynelive.debug.Logger;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import pkd.a;
import com.kwai.video.player.KsMediaPlayer;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.kwai.video.waynelive.LivePlayerInitModule;
import com.kwai.video.player.kwai_player.KwaiPlayerLiveBuilder;
import com.kwai.video.waynelive.mediaplayer.LivePlayerConfigProvider;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;
import com.kwai.video.waynelive.mediaplayer.LiveMediaPlayerBuildListener;
import com.kwai.video.player.kwai_player.KwaiPlayerBaseBuilder;
import android.os.Build$VERSION;
import com.kwai.video.waynelive.LivePlayerUtils;
import com.kwai.player.KwaiPlayerConfig$a;
import com.kwai.player.KwaiPlayerConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.video.waynelive.wayneplayer.WayneLiveInject;
import java.lang.Boolean;
import com.kwai.video.player.IMediaPlayer;
import org.json.JSONObject;
import java.lang.Throwable;
import com.kwai.video.player.kwai_player.AspectKFlv;
import lnc.i3;
import com.kwai.player.KwaiPlayerConfig$EnumBufferStrategy;
import ai7.d;
import com.kuaishou.android.live.model.AdaptationSet;
import java.util.List;
import com.kuaishou.android.live.model.AdaptationUrl;
import java.util.Collection;
import ekd.q;
import java.util.Map;
import androidx.collection.ArrayMap;
import com.kwai.video.waynelive.util.CommonUtil;
import zk.d;
import com.google.gson.Gson;
import com.kwai.video.player.kwai_player.AspectAwesomeCache;
import java.lang.Exception;
import java.lang.Integer;

public class LiveMediaPlayerBuilder	// class@000e07
{
    public Map extraHeaders;
    public String mBizExtra;
    public String mBizFt;
    public String mBizType;
    public LiveAdaptiveManifest mDataSourceManifest;
    public boolean mEnableDummySurface;
    public boolean mEnableMultiSurface;
    public boolean mEnableOesSurface;
    public boolean mEnableQos;
    public boolean mEnableReusePlayerOptimize;
    public boolean mEnableSmallWindow;
    public boolean mEnableWebRTCManifest;
    public boolean mForceSystemPlayer;
    public KwaiPlayerConfig mLiveKwaiPlayerConfig;
    public Logger mLogger;
    public String mNetworkRetryScene;
    public boolean mPaidLive;
    public boolean mPrivateLive;
    public JSONObject mQosJson;
    public String mQualityType;
    public boolean mShouldStartOnPrepared;
    public boolean mShouldUseHardwareDecoding;
    public boolean mUseMediaCodecSurfaceView;
    public int mViewHeight;
    public int mViewWidth;
    public String mWebRTCConfig;
    public static boolean sPlayerLogHandled;

    public void LiveMediaPlayerBuilder(LiveAdaptiveManifest p0,String p1){
       super();
       this.mLogger = new Logger("LiveMediaPlayerBuilder");
       this.mEnableQos = true;
       this.mUseMediaCodecSurfaceView = false;
       this.mDataSourceManifest = p0;
       this.mQualityType = p1;
    }
    public static void checkPlayerLogConfig(){
       if (PatchProxy.applyVoid(null, null, LiveMediaPlayerBuilder.class, "7")) {
          return;
       }
       if (LiveMediaPlayerBuilder.sPlayerLogHandled) {
          return;
       }
       LiveMediaPlayerBuilder.sPlayerLogHandled = true;
       if (a.a || a.f) {
          KsMediaPlayer.native_setLogLevel(4);
          KsMediaPlayer.native_setKwaiLogLevel(3);
       }else {
          KsMediaPlayer.native_setLogLevel(5);
          KsMediaPlayer.native_setKwaiLogLevel(4);
       }
       return;
    }
    public IKwaiMediaPlayer build(){
       IKwaiMediaPlayer obj = PatchProxy.apply(null, this, LiveMediaPlayerBuilder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveMediaPlayerBuilder.checkPlayerLogConfig();
       obj = this.buildKwaiMediaPlayer();
       this.setMediaPlayerDataSource(obj);
       return obj;
    }
    public final IKwaiMediaPlayer buildKwaiMediaPlayer(){
       KwaiPlayerConfig$a defaultKwaiP;
       KwaiPlayerLiveBuilder obj = PatchProxy.apply(null, this, LiveMediaPlayerBuilder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getDefaultLiveConfigBuilder(LivePlayerInitModule.getContext());
       obj.setSystemPlayer(this.mForceSystemPlayer);
       LivePlayerConfigProvider config = LivePlayerInitModule.getConfig();
       LiveMediaPlayerBuilder tmDataSource = this.mDataSourceManifest;
       boolean b = false;
       boolean b1 = true;
       boolean b2 = (tmDataSource != null && (tmDataSource.isManifestFlv() && (!this.mDataSourceManifest.isTransformed() || !this.isDisableFakeManifest())))? true: false;
       LiveMediaPlayerBuilder tmDataSource1 = this.mDataSourceManifest;
       if (tmDataSource1 != null && tmDataSource1.isManifestWebRTC()) {
          b = true;
       }
       DebugLog.i("buildKwaiMediaPlayer", "enableAdaptiveManifests "+b2+" mEnableWebRTCManifest "+this.mEnableWebRTCManifest+" enableWebRTCAdaptiveManifest "+b);
       LivePlayerInitModule.getLiveMediaPlayerBuildListener().onBuildMediaPlayer(obj);
       if (this.mShouldUseHardwareDecoding != null) {
          this.setLiveHwForPcPush(obj);
       }else {
          this.setLiveHw(obj);
       }
       if (this.mEnableSmallWindow != null) {
          this.setSmallWindowConfig(obj);
       }
       if (this.mEnableDummySurface != null) {
          obj.setUseMediaCodecDummySurface(b1);
       }
       if (this.mEnableOesSurface != null && Build$VERSION.SDK_INT > 21) {
          obj.setUseMediaCodecOesSurface(b1);
       }
       if (config.enableStartPlayForLive()) {
          obj.setStartPlayBlockBufferMs(config.getStartPlayThForLive(), config.getStartPlayMaxCostMsForLive());
       }
       obj.setAdaptiveNetType(LivePlayerUtils.getAdaptiveNetType());
       if (b2) {
          obj.setIsLiveManifest(b1);
          defaultKwaiP = this.getDefaultKwaiPlayerConfigBuilder();
          defaultKwaiP.e(config.getLiveAdaptiveQosDuration());
          defaultKwaiP.c(config.getEnableLiveAdaptiveQos());
          defaultKwaiP.b(config.getEnableLiveAdaptiveAdditionalQos());
          obj.setKwaiPlayerConfig(defaultKwaiP.a());
       }else if(b){
          obj.setIsWebRTCLiveManifest(b1);
          defaultKwaiP = this.getDefaultKwaiPlayerConfigBuilder();
          defaultKwaiP.e(config.getLiveAdaptiveQosDuration());
          defaultKwaiP.c(config.getEnableLiveAdaptiveQos());
          defaultKwaiP.b(config.getEnableLiveAdaptiveAdditionalQos());
          obj.setKwaiPlayerConfig(defaultKwaiP.a());
          this.buildWebRTC(obj);
       }else {
          obj.setKwaiPlayerConfig(this.getDefaultKwaiPlayerConfigBuilder().a());
       }
       obj.setModifiedManifest(this.mDataSourceManifest.isTransformed());
       if (this.isPanoramicStream()) {
          obj.setIsVR(b1);
          obj.setStereoType(b1);
          obj.setInteractiveMode(2);
          obj.setEnableAudioConvert(config.enableAudioConvert());
          this.mLogger.i("build mediaPlayer set panoramicStream config");
       }else {
          tmDataSource = this.mEnableMultiSurface;
          if (tmDataSource != null) {
             obj.setEnableMultiSurface(tmDataSource);
          }
       }
       obj.setViewSize(this.mViewWidth, this.mViewHeight);
       String kwaiVPPKSwit = config.getKwaiVPPKSwitch();
       if (!TextUtils.x(kwaiVPPKSwit)) {
          obj.setLibKwaivppJson(kwaiVPPKSwit);
       }
       obj.setBatteryInfo(config.getLiveEnableBatteryInfo());
       b2 = this.isHlsTypeUrl(this.mDataSourceManifest);
       if (b2) {
          obj.setBufferTimeMaxSec((float)config.getBufferTimeMaxSecForHlsLive());
       }else {
          obj.setBufferTimeMaxSec(config.getBufferTimeSizeMs());
       }
       obj.setUseNatvieCache(this.getUseNativeCache());
       obj.setFunctionOption((long)config.getKwaiplayerFunctionOption());
       obj.setNetworkRetryScene(this.mNetworkRetryScene);
       obj.setMediaCodecInvalidateVer(config.getMediaCodecInvalidateVersion());
       obj.setVisionEngineLibLoaded(WayneLiveInject.getWayneLiveInject().isVisionEngineLibLoaded());
       IKwaiMediaPlayer iKwaiMediaPl = obj.build();
       this.mLogger.i("build mediaPlayer", "isHlsTypeUrl", Boolean.valueOf(b2));
       try{
          iKwaiMediaPl.setScreenOnWhilePlaying(b1);
          if (this.mQosJson == null && (!TextUtils.x(this.mBizFt) && !TextUtils.x(this.mBizType))) {
             JSONObject jSONObject = new JSONObject();
             this.mQosJson = jSONObject;
             jSONObject.put("biz_ft", this.mBizFt);
             this.mQosJson.put("biz_type", this.mBizType);
             if (!TextUtils.x(this.mBizExtra)) {
                this.mQosJson.put("biz_extra", this.mBizExtra);
             }
          }
       }catch(org.json.JSONException e2){
          this.mLogger.e("build mediaPlayer biz JSONException", e2);
       }
       tmDataSource = this.mQosJson;
       if (tmDataSource != null) {
          iKwaiMediaPl.setAppQosStatJson(tmDataSource);
       }
       this.mLogger.i("build mediaPlayer useNativeCache:"+this.getUseNativeCache());
       if (this.getUseNativeCache()) {
          this.setMediaPlayerDefaultAwesomeCache(iKwaiMediaPl, this.mDataSourceManifest);
       }
       AspectKFlv aspectKFlv = iKwaiMediaPl.getAspectKFlv();
       aspectKFlv.setLiveAdaptiveConfig(config.getLiveAdaptiveConfig());
       aspectKFlv.setDeviceGeneralScore(config.getDeviceGeneralScore());
       LivePlayerInitModule.getLiveMediaPlayerBuildListener().onCreatedMediaPlayer(iKwaiMediaPl);
       return iKwaiMediaPl;
    }
    public final void buildWebRTC(KwaiPlayerLiveBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMediaPlayerBuilder.class, "14")) {
          return;
       }
       i3 oi3 = i3.f();
       if (!TextUtils.x(this.mWebRTCConfig)) {
          oi3.d("ext", this.mWebRTCConfig);
       }
       p0.setWebRTCConfigJson(oi3.toString());
       return;
    }
    public final KwaiPlayerConfig$a getDefaultKwaiPlayerConfigBuilder(){
       LivePlayerConfigProvider obj = PatchProxy.apply(null, this, LiveMediaPlayerBuilder.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LivePlayerInitModule.getConfig();
       KwaiPlayerConfig$a uoa = new KwaiPlayerConfig$a();
       boolean b = (obj.getEnableLiveGuestRtQosLog() && this.mEnableQos != null)? true: false;
       uoa.d(b);
       uoa.f(obj.getLiveGuestRtQosInterval());
       uoa.l = obj.getLivePlayerBufferStrategy();
       uoa.f = obj.getLivePlayerFirstBufferTime();
       uoa.g = obj.getLivePlayerMinBufferTime();
       uoa.i = obj.getLivePlayerBufferIncrementStep();
       uoa.j = obj.getLivePlayerBufferSmoothTime();
       uoa.h = obj.getLiveMaxBufferTime();
       return uoa;
    }
    public final KwaiPlayerLiveBuilder getDefaultLiveConfigBuilder(Context p0){
       KwaiPlayerLiveBuilder obj = PatchProxy.applyOneRefs(p0, this, LiveMediaPlayerBuilder.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KwaiPlayerLiveBuilder(p0);
       LivePlayerConfigProvider config = LivePlayerInitModule.getConfig();
       obj.setStartOnPrepared(this.mShouldStartOnPrepared);
       obj.setUseMediaCodecSetSurfaceWithoutReconfig(this.mEnableReusePlayerOptimize);
       obj.setUseMediaCodecSurfaceView(this.mUseMediaCodecSurfaceView);
       obj.setOverlayFormat(config.getOverlayOutputPixelFormat());
       obj.setAsyncStreamOpen(config.isEnableAsyncStreamOpen());
       obj.setLiveLowDelayConfigJson(config.getLowDelayConfig());
       obj.setFFmpegConnectionTimeout(config.getFFmpegConnectionTimeoutSec());
       obj.setHevcDcoderName(config.getLiveHevcCodecName());
       obj.setKs265DecExtraParams(config.getKs265DecExtraParams());
       obj.enableAvSyncOpt(config.isLiveEnableAvSyncOpt());
       obj.setEnableAvSyncOpt4(config.isLiveEnableAvSyncOpt4());
       obj.setEnableMultiAudioDetector(config.isLiveEnableMultiAudioDetector());
       obj.setEnableFFmpegConnectionTimeout(config.isEnableHttpConnectTimeout());
       obj.setUseAlignedPts(config.enableAlignedPts());
       obj.setConfigJson(config.getMediaPlayerConfig());
       obj.setAemonConfig(config.getAemonConfig());
       obj.setSwitchProvider(config.getSwitchProvider());
       obj.setIsPaidLive(this.mPaidLive);
       obj.setIsPrivateLive(this.mPrivateLive);
       return obj;
    }
    public final boolean getUseNativeCache(){
       Object obj = PatchProxy.apply(null, this, LiveMediaPlayerBuilder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.mDataSourceManifest.isManifestHLS()) {
       label_001e :
          b = true;
       }else if(this.mDataSourceManifest.isManifestWebRTC()){
          if ((this.mDataSourceManifest.mAdaptationSet.mRepresentation.get(b).mUrl).contains(".slice")) {
             goto label_001e ;
          }else {
             b = LivePlayerInitModule.getConfig().isLiveAdaptiveEnableCache();
          }
       }
       return b;
    }
    public final boolean isDisableFakeManifest(){
       Object obj = PatchProxy.apply(null, this, LiveMediaPlayerBuilder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return LivePlayerInitModule.getConfig().getSwitchProvider().getBoolean("disableFakeManifest", false);
    }
    public final boolean isHlsTypeUrl(LiveAdaptiveManifest p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMediaPlayerBuilder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.isTransformed() && p0.isManifestHLS())? true: false;
       return b;
    }
    public final boolean isPanoramicStream(){
       LiveMediaPlayerBuilder obj = PatchProxy.apply(null, this, LiveMediaPlayerBuilder.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mDataSourceManifest;
       if (obj != null) {
          LiveAdaptiveManifest mAdaptationS = obj.mAdaptationSet;
          if (mAdaptationS != null && !q.f(mAdaptationS.mRepresentation)) {
             return LivePlayerUtils.isPanoramicType(this.mDataSourceManifest.mAdaptationSet.mRepresentation.get(0).mUrlType);
          }
       }
       return 0;
    }
    public LiveMediaPlayerBuilder setAppQosStatJson(JSONObject p0){
       this.mQosJson = p0;
       return this;
    }
    public LiveMediaPlayerBuilder setBizExtra(String p0){
       this.mBizExtra = p0;
       return this;
    }
    public LiveMediaPlayerBuilder setBizFt(String p0){
       this.mBizFt = p0;
       return this;
    }
    public LiveMediaPlayerBuilder setBizType(String p0){
       this.mBizType = p0;
       return this;
    }
    public LiveMediaPlayerBuilder setEnableDummySurface(boolean p0){
       this.mEnableDummySurface = p0;
       return this;
    }
    public LiveMediaPlayerBuilder setEnableMultiSurface(boolean p0){
       this.mEnableMultiSurface = p0;
       return this;
    }
    public LiveMediaPlayerBuilder setEnableOesSurface(boolean p0){
       this.mEnableOesSurface = p0;
       return this;
    }
    public LiveMediaPlayerBuilder setEnableQos(boolean p0){
       this.mEnableQos = p0;
       return this;
    }
    public LiveMediaPlayerBuilder setEnableReusePlayerOptimize(boolean p0){
       this.mEnableReusePlayerOptimize = p0;
       return this;
    }
    public LiveMediaPlayerBuilder setEnableSmallWindow(boolean p0){
       this.mEnableSmallWindow = p0;
       return this;
    }
    public LiveMediaPlayerBuilder setEnableWebRTC(boolean p0){
       this.mEnableWebRTCManifest = p0;
       return this;
    }
    public LiveMediaPlayerBuilder setExtraHeader(Map p0){
       this.extraHeaders = p0;
       return this;
    }
    public LiveMediaPlayerBuilder setForceSystemPlayer(boolean p0){
       this.mForceSystemPlayer = p0;
       return this;
    }
    public LiveMediaPlayerBuilder setIsPaidLive(boolean p0){
       this.mPaidLive = p0;
       return this;
    }
    public LiveMediaPlayerBuilder setIsPrivateLive(boolean p0){
       this.mPrivateLive = p0;
       return this;
    }
    public final void setLiveHw(KwaiPlayerLiveBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMediaPlayerBuilder.class, "9")) {
          return;
       }
       LivePlayerConfigProvider config = LivePlayerInitModule.getConfig();
       int i = 0;
       if (config.isLiveH264SupportMediacodec()) {
          i = 1;
          p0.setMediaCodecAvcHeightLimit(config.getHeightLimit264Hw());
          p0.setMediaCodecAvcWidthLimit(config.getWidthLimit264Hw());
       }
       if (config.isLiveH265SupportMediacodec()) {
          i = i | 0x02;
          p0.setMediaCodecHevcHeightLimit(config.getHeightLimit265Hw());
          p0.setMediaCodecHevcWidthLimit(config.getWidthLimit265Hw());
       }
       if (i) {
          p0.setUseHardwareDcoderFlag(i);
          p0.setMediaCodecMaxNum(config.getLiveMaxCnt());
          p0.setUseMediaCodecDummySurface(config.getUseMediaCodecDummySurface());
       }
       return;
    }
    public final void setLiveHwForPcPush(KwaiPlayerLiveBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMediaPlayerBuilder.class, "10")) {
          return;
       }
       LivePlayerConfigProvider config = LivePlayerInitModule.getConfig();
       int i = 0;
       if (LivePlayerInitModule.getConfig().getUseLive264HwForPcPush()) {
          i = 1;
          p0.setMediaCodecAvcHeightLimit(config.getHeightLimit264Hw());
          p0.setMediaCodecAvcWidthLimit(config.getWidthLimit264Hw());
       }
       if (LivePlayerInitModule.getConfig().getUseLive265HwForPcPush()) {
          i = i | 0x02;
          p0.setMediaCodecHevcHeightLimit(config.getHeightLimit265Hw());
          p0.setMediaCodecHevcWidthLimit(config.getWidthLimit265Hw());
       }
       if (i) {
          p0.setUseHardwareDcoderFlag(i);
          p0.setMediaCodecMaxNum(config.getLiveMaxCnt());
          p0.setUseMediaCodecDummySurface(config.getUseMediaCodecDummySurface());
       }
       return;
    }
    public LiveMediaPlayerBuilder setLiveKwaiPlayerConfig(KwaiPlayerConfig p0){
       this.mLiveKwaiPlayerConfig = p0;
       return this;
    }
    public final void setMediaPlayerDataSource(IKwaiMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMediaPlayerBuilder.class, "11")) {
          return;
       }
       if (this.mDataSourceManifest != null) {
          ArrayMap uArrayMap = new ArrayMap();
          if (!TextUtils.x(this.mDataSourceManifest.mHost)) {
             uArrayMap.put("Host", this.mDataSourceManifest.mHost);
          }
          if (this.mDataSourceManifest.isTransformed() && (this.isDisableFakeManifest() || !this.mDataSourceManifest.isManifestFlv())) {
             LiveMediaPlayerBuilder textraHeader = this.extraHeaders;
             if (textraHeader != null && !textraHeader.isEmpty()) {
                uArrayMap.putAll(this.extraHeaders);
             }
             String manifestURLB = CommonUtil.getManifestURLByQualityType(this.mDataSourceManifest, this.mQualityType);
             if (!uArrayMap.isEmpty()) {
                p0.setDataSource(manifestURLB, uArrayMap);
             }else {
                p0.setDataSource(manifestURLB);
             }
             this.mLogger.i("setMediaPlayerDataSource url"+manifestURLB);
          }else {
             d uod = new d();
             uod.c();
             Gson gson = uod.b();
             if (!uArrayMap.isEmpty()) {
                p0.setDataSource(gson.q(this.mDataSourceManifest), uArrayMap);
             }else {
                p0.setDataSource(gson.q(this.mDataSourceManifest));
             }
             this.mLogger.i("setMediaPlayerDataSource manifest");
          }
          this.mLogger.i("setMediaPlayerDataSource headers"+uArrayMap);
       }
       return;
    }
    public final void setMediaPlayerDefaultAwesomeCache(IKwaiMediaPlayer p0,LiveAdaptiveManifest p1){
       Exception uException;
       int i3;
       Object obj = this;
       Object obj1 = p1;
       String str = "liveEnableRetryForForbiddenError";
       String str1 = "liveCacheConnectTimeout";
       String str2 = "liveCacheReadTimeout";
       if (PatchProxy.applyVoidTwoRefs(p0, obj1, obj, LiveMediaPlayerBuilder.class, "8")) {
          return;
       }
       LivePlayerConfigProvider config = LivePlayerInitModule.getConfig();
       AspectAwesomeCache aspectAwesom = p0.getAspectAwesomeCache();
       if (obj.isHlsTypeUrl(obj.mDataSourceManifest)) {
          obj.mLogger.i("setMediaPlayerDefaultAwesomeCache hls");
          aspectAwesom.setCacheMode(4);
          aspectAwesom.setCacheUpstreamType(4);
       }else {
          obj.mLogger.i("setMediaPlayerDefaultAwesomeCache not hls");
          aspectAwesom.setCacheMode(3);
          aspectAwesom.setCacheUpstreamType(config.getLiveCacheUpstreamType());
          String liveNetDownC = config.getLiveNetDownConfig();
          int i = 0x7530;
          int i1 = 5000;
          try{
             boolean i2 = 0;
             JSONObject jSONObject = new JSONObject(liveNetDownC);
             if (jSONObject.has(str2)) {
                i = jSONObject.getInt(str2);
             }
             if (jSONObject.has(str1)) {
                i1 = jSONObject.getInt(str1);
             }
             try{
                if (jSONObject.has(str)) {
                   i2 = jSONObject.getBoolean(str);
                }
                obj.mLogger.i("set netDownConfig: ", "ReadTimeout: ", Integer.valueOf(i), "ConnectTimeout: ", Integer.valueOf(i1));
                aspectAwesom.setCacheDownloadConnectTimeoutMs(i1);
                aspectAwesom.setCacheDownloadReadTimeoutMs(i);
                aspectAwesom.setEnableRetryForForbiddenError(i2);
                aspectAwesom.setHodorTaskRetryType(config.getHodorTaskRetryType());
                LiveAdaptiveManifest mCdnFeature = obj1.mCdnFeature;
             }catch(java.lang.Exception e0){
                uException = e0;
                i3 = i1;
             }
             obj.mLogger.i("exception to parse netDownConfig: ", "netDownConfig", liveNetDownC, "exception: ", uException.getLocalizedMessage());
             i1 = i3;
             goto label_008f ;
          }catch(java.lang.Exception e0){
             uException = e0;
             i3 = 5000;
             goto label_007f ;
          }
       }
       return;
    }
    public LiveMediaPlayerBuilder setNetworkRetryScene(String p0){
       this.mNetworkRetryScene = p0;
       return this;
    }
    public LiveMediaPlayerBuilder setShouldStartOnPrepared(boolean p0){
       this.mShouldStartOnPrepared = p0;
       return this;
    }
    public LiveMediaPlayerBuilder setShouldUseHardwareDecoding(boolean p0){
       this.mShouldUseHardwareDecoding = p0;
       return this;
    }
    public final void setSmallWindowConfig(KwaiPlayerLiveBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMediaPlayerBuilder.class, "13")) {
          return;
       }
       p0.setLibKwaivppBits(0x8000);
       p0.setLibKwaivppLimitFpsMaxInput(0x477fff00);
       p0.enableAvSyncOpt2(true);
       p0.enableEglReleaseOnVout(true);
       p0.enableUsePipelineV2(true);
       if (Build$VERSION.SDK_INT > 21) {
          p0.setUseMediaCodecOesSurface(true);
       }
       return;
    }
    public LiveMediaPlayerBuilder setUseMediaCodecSurfaceView(boolean p0){
       this.mUseMediaCodecSurfaceView = p0;
       return this;
    }
    public LiveMediaPlayerBuilder setViewPixelSize(int p0,int p1){
       this.mViewWidth = p0;
       this.mViewHeight = p1;
       return this;
    }
    public LiveMediaPlayerBuilder setWebRTCConfig(String p0){
       this.mWebRTCConfig = p0;
       return this;
    }
}
