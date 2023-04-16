package com.kwai.video.player.kwai_player.KwaiPlayerLiveBuilder;
import com.kwai.video.player.kwai_player.KwaiPlayerBaseBuilder;
import android.content.Context;
import java.lang.Integer;
import com.kwai.video.player.kwai_player.IBuildKwaiPlayer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.hodor.util.Timber;
import com.kwai.player.KwaiPlayerConfig;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.player.kwai_player.AspectAwesomeCache;
import com.kwai.video.player.kwai_player.Util;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.kwai_player.KwaiSystemMediaPlayer;
import com.kwai.video.player.PlayerLibraryLoader$FindBestParam;
import ai7.d;
import com.kwai.video.player.kwai_player.KwaiPlayerCreator;
import com.kwai.video.player.kwai_player.KwaiPlayerCreator$InternalKwaiPlayer;
import org.json.JSONObject;
import org.json.JSONException;

public final class KwaiPlayerLiveBuilder extends KwaiPlayerBaseBuilder	// class@000b44
{
    public Integer mBufferDeclineRate;
    public Integer mBufferIncrementStep;
    public Integer mBufferLastHWM;
    public float mBufferTimeMaxSec;
    public String mConfigJson;
    public boolean mEnableAemonBufferConfig;
    public boolean mEnableAvSyncOpt4;
    public boolean mEnableMultiAudioDetector;
    public boolean mEnableNetTypeOptimize;
    public long mFunctionOption;
    public boolean mIsLiveManifest;
    public boolean mIsPaidLive;
    public boolean mIsPrivateLive;
    public boolean mIsWebRTCManifest;
    public long mKsecurityFunPtr;
    public KwaiPlayerConfig mKwaiPlayerConfig;
    public String mLiveLowDelayConfigJson;
    public String mLiveSrConfigJson;
    public int mNetType;
    public int mSpbBufferMs;
    public int mSpbConfigForLive;
    public String mSpbLiveConfigJson;
    public int mSpbMaxBufferCostMs;
    public Integer mStartPlayBuffer;
    public boolean mSystemPlayer;
    public boolean mUseAlignedPts;
    public boolean mUseSpbBuffer;
    public String mWebRTCConfigJson;

    public void KwaiPlayerLiveBuilder(Context p0){
       super(p0);
       this.mEnableNetTypeOptimize = false;
       this.mEnableAemonBufferConfig = false;
       this.mStartPlayBuffer = Integer.valueOf(700);
       this.mBufferIncrementStep = Integer.valueOf(500);
       this.mBufferDeclineRate = Integer.valueOf(875);
       this.mBufferLastHWM = Integer.valueOf(4000);
       this.mSystemPlayer = false;
       this.mBufferTimeMaxSec = 5.00f;
       this.mNetType = 0;
       this.mIsLiveManifest = false;
       this.mKsecurityFunPtr = 0;
       this.mIsWebRTCManifest = false;
       this.mEnableAvSyncOpt4 = true;
       this.mEnableMultiAudioDetector = false;
       this.mUseAlignedPts = true;
       this.mUseSpbBuffer = false;
       this.mSpbBufferMs = 500;
       this.mSpbMaxBufferCostMs = 1000;
       this.mSpbConfigForLive = 0;
       this.mSpbLiveConfigJson = "";
       this.mLiveSrConfigJson = "";
       this.mFunctionOption = 0;
       this.mIsPaidLive = false;
       this.mIsPrivateLive = false;
       this.mUseNatvieCache = false;
    }
    public void applyTo(IBuildKwaiPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPlayerLiveBuilder.class, "2")) {
          return;
       }
       super.applyTo(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       Timber.d("applyTo", objArray);
       KwaiPlayerLiveBuilder tmKwaiPlayer = this.mKwaiPlayerConfig;
       boolean b = true;
       if (tmKwaiPlayer != null) {
          p0.setupAspectLiveRealTimeReporter(b, tmKwaiPlayer);
          p0.setConfig(this.mKwaiPlayerConfig);
       }else {
          p0.setupAspectLiveRealTimeReporter(i, null);
       }
       if (!TextUtils.isEmpty(this.mConfigJson)) {
          p0.setConfigJson(this.mConfigJson);
       }
       if (!TextUtils.isEmpty(this.mLiveLowDelayConfigJson)) {
          p0.setLiveLowDelayConfigJson(this.mLiveLowDelayConfigJson);
       }
       if (!TextUtils.isEmpty(this.mWebRTCConfigJson)) {
          p0.setOption(b, "webrtc-config", this.mWebRTCConfigJson);
       }
       p0.setupAspectNativeCache(this.mUseNatvieCache);
       if (this.mUseNatvieCache != null) {
          if (this.mIsLiveManifest != null) {
             p0.getAspectAwesomeCache().setCacheMode(3);
          }else {
             p0.getAspectAwesomeCache().setCacheMode(2);
          }
       }
       long l = 1;
       if (this.mUseAlignedPts != null) {
          p0.setOption(4, "use-aligned-pts", l);
       }
       if (this.mUseSpbBuffer != null) {
          p0.setStartPlayBlockBufferMs(this.mSpbBufferMs, this.mSpbMaxBufferCostMs);
       }
       KwaiPlayerLiveBuilder tmSpbConfigF = this.mSpbConfigForLive;
       if (tmSpbConfigF > null) {
          p0.setStartPlayBlockBufferStrategy(tmSpbConfigF);
          p0.setOption(4, "spb-live-config-json", this.mSpbLiveConfigJson);
       }
       p0.setOption(4, "islive", l);
       p0.setOption(4, "framedrop", 150);
       KwaiPlayerLiveBuilder tmKsecurityF = this.mKsecurityFunPtr;
       if (tmKsecurityF) {
          p0.setOption(4, "ksecurity-fun-ptr", tmKsecurityF);
       }
       p0.setPropertyFloat(0x753d, this.mBufferTimeMaxSec);
       tmSpbConfigF = this.mNetType;
       if (tmSpbConfigF > null) {
          p0.setOption(b, "device-network-type", (long)tmSpbConfigF);
       }
       p0.setupAspectKlv(this.mIsLiveManifest);
       p0.setOption(4, "kwai_player_function_option", this.mFunctionOption);
       long l1 = (this.mIsWebRTCManifest != null)? l: 0;
       p0.setOption(4, "enable-webrtc-manifest", l1);
       l1 = (Util.isHardWareVendorQualcomm())? 0: l;
       p0.setOption(b, "webrtc_enable_fake_extradata", l1);
       p0.setOption(4, "enable-av-sync-opt4", l);
       tmSpbConfigF = this.mEnableMultiAudioDetector;
       if (tmSpbConfigF != null) {
          if (tmSpbConfigF == null) {
             l = 0;
          }
          p0.setOption(4, "enable-multi-audio-detector", l);
       }
       if (this.mEnableNetTypeOptimize != null) {
          if (this.mUseSpbBuffer != null) {
             p0.setStartPlayBlockBufferMs(this.mStartPlayBuffer.intValue(), this.mSpbMaxBufferCostMs);
          }
          p0.setOption(4, "buffer-increment-step", (long)this.mBufferIncrementStep.intValue());
          p0.setOption(4, "buffer-decline-rate", (long)this.mBufferDeclineRate.intValue());
          p0.setOption(4, "last-high-water-mark-ms", (long)this.mBufferLastHWM.intValue());
       }
       if (!TextUtils.isEmpty(this.mLiveSrConfigJson)) {
          p0.setOption(4, "ve-sr-kswitch-json", this.mLiveSrConfigJson);
       }
       return;
    }
    public IKwaiMediaPlayer build(){
       KwaiSystemMediaPlayer obj = PatchProxy.apply(null, this, KwaiPlayerLiveBuilder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mSystemPlayer != null) {
          obj = new KwaiSystemMediaPlayer();
          obj.setContext(this.mContext);
          return obj;
       }else {
          this.getAemonConfig();
          PlayerLibraryLoader$FindBestParam uFindBestPar = new PlayerLibraryLoader$FindBestParam();
          uFindBestPar.mProvider = this.getSwitchProvider();
          uFindBestPar.mAemonConfig = this.getAemonConfig();
          uFindBestPar.mIsPaidLive = this.mIsPaidLive;
          uFindBestPar.mIsPrivateLive = this.mIsPrivateLive;
          uFindBestPar.mIsWebRTC = this.mIsWebRTCManifest;
          uFindBestPar.mIsLive = true;
          KwaiPlayerCreator$InternalKwaiPlayer internalKwai = KwaiPlayerCreator.newCreator(uFindBestPar).create();
          internalKwai.getBuildKwaiPlayer().setIsLive(true);
          this.applyTo(internalKwai.getBuildKwaiPlayer());
          internalKwai.getBuildKwaiPlayer().setExtOption(4, uFindBestPar.mOutputNoAemonReason);
          return internalKwai.getIKwaiMediaPlayer();
       }
    }
    public KwaiPlayerBaseBuilder self(){
       return this.self();
    }
    public KwaiPlayerLiveBuilder self(){
       return this;
    }
    public KwaiPlayerLiveBuilder setAdaptiveNetType(int p0){
       this.mNetType = p0;
       return this;
    }
    public KwaiPlayerLiveBuilder setBufferTimeMaxSec(float p0){
       this.mBufferTimeMaxSec = p0;
       return this;
    }
    public void setConfigFromSwitchProvider(d p0,IBuildKwaiPlayer p1){
       String str1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiPlayerLiveBuilder.class, "3")) {
          return;
       }
       super.setConfigFromSwitchProvider(p0, p1);
       boolean b = false;
       long l = 1;
       String str = null;
       long l1 = (p0.getBoolean("enableLiveBuffingOptimize", b))? l: str;
       p1.setOption(4, "enable-buffing-optimize", l1);
       l1 = (p0.getBoolean("considerSinglePipeline", true))? l: str;
       p1.setOption(4, "consider-single-pipeline", l1);
       p1.setOption(4, "enable-rollback-force-drop", (long)p0.getInt("playerRollbackForceDrop", b));
       if (!p0.getBoolean("enableLivePlayerDataSourceAbort", b)) {
          l = str;
       }
       p1.setOption(4, "enable-live-data-source-abort", l);
       this.setLiveNetTypeOptimizeConfig(p0.getJSON("liveNetTypeOptimizeConfig", ""));
       int intx = p0.getInt("playerOverlayFormatLive", b);
       if (intx) {
          p1.setOption(4, "overlay-format", (long)intx);
       }
       this.mSpbConfigForLive = p0.getInt("playerSpbConfigForLive", b);
       this.mSpbLiveConfigJson = p0.getJSON("playerSpbConfigJsonForLive", "");
       this.mLiveSrConfigJson = p0.getJSON("playerKwaiLiveSrConfig", "");
       p1.setOption(4, "enable-low-latency", (long)p0.getInt("playerEnableLowLatency", b));
       return;
    }
    public KwaiPlayerLiveBuilder setConfigJson(String p0){
       this.mConfigJson = p0;
       return this;
    }
    public KwaiPlayerLiveBuilder setEnableAvSyncOpt4(boolean p0){
       return this;
    }
    public KwaiPlayerLiveBuilder setEnableMultiAudioDetector(boolean p0){
       this.mEnableMultiAudioDetector = p0;
       return this;
    }
    public KwaiPlayerLiveBuilder setFunctionOption(long p0){
       this.mFunctionOption = p0;
       return this;
    }
    public KwaiPlayerLiveBuilder setIsLiveManifest(boolean p0){
       this.mIsLiveManifest = p0;
       return this;
    }
    public KwaiPlayerLiveBuilder setIsPaidLive(boolean p0){
       this.mIsPaidLive = p0;
       return this;
    }
    public KwaiPlayerLiveBuilder setIsPrivateLive(boolean p0){
       this.mIsPrivateLive = p0;
       return this;
    }
    public KwaiPlayerLiveBuilder setIsWebRTCLiveManifest(boolean p0){
       this.mIsWebRTCManifest = p0;
       return this;
    }
    public KwaiPlayerLiveBuilder setKsecurityFunPtr(long p0){
       this.mKsecurityFunPtr = p0;
       return this;
    }
    public KwaiPlayerLiveBuilder setKwaiPlayerConfig(KwaiPlayerConfig p0){
       this.mKwaiPlayerConfig = p0;
       return this;
    }
    public KwaiPlayerLiveBuilder setLiveLowDelayConfigJson(String p0){
       this.mLiveLowDelayConfigJson = p0;
       return this;
    }
    public final void setLiveNetTypeOptimizeConfig(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPlayerLiveBuilder.class, "4")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          try{
             JSONObject jSONObject = new JSONObject(p0);
             boolean b = jSONObject.optBoolean("enable", false);
             this.mEnableNetTypeOptimize = b;
             if (b) {
                KwaiPlayerLiveBuilder tmNetType = this.mNetType;
                if (tmNetType != 1) {
                   if (tmNetType != 2) {
                      if (tmNetType != 5) {
                         this.mStartPlayBuffer = Integer.valueOf(jSONObject.optInt("liveSpbDefault", this.mStartPlayBuffer.intValue()));
                         this.mBufferIncrementStep = Integer.valueOf(jSONObject.optInt("liveIncStepDefault", this.mBufferIncrementStep.intValue()));
                         this.mBufferDeclineRate = Integer.valueOf(jSONObject.optInt("liveDecRateDefault", this.mBufferDeclineRate.intValue()));
                         this.mBufferLastHWM = Integer.valueOf(jSONObject.optInt("liveLastHWMDefault", this.mBufferLastHWM.intValue()));
                      }else {
                         this.mStartPlayBuffer = Integer.valueOf(jSONObject.optInt("liveSpb5G", this.mStartPlayBuffer.intValue()));
                         this.mBufferIncrementStep = Integer.valueOf(jSONObject.optInt("liveIncStep5G", this.mBufferIncrementStep.intValue()));
                         this.mBufferDeclineRate = Integer.valueOf(jSONObject.optInt("liveDecRate5G", this.mBufferDeclineRate.intValue()));
                         this.mBufferLastHWM = Integer.valueOf(jSONObject.optInt("liveLastHWM5G", this.mBufferLastHWM.intValue()));
                      }
                   }else {
                      this.mStartPlayBuffer = Integer.valueOf(jSONObject.optInt("liveSpb4G", this.mStartPlayBuffer.intValue()));
                      this.mBufferIncrementStep = Integer.valueOf(jSONObject.optInt("liveIncStep4G", this.mBufferIncrementStep.intValue()));
                      this.mBufferDeclineRate = Integer.valueOf(jSONObject.optInt("liveDecRate4G", this.mBufferDeclineRate.intValue()));
                      this.mBufferLastHWM = Integer.valueOf(jSONObject.optInt("liveLastHWM4G", this.mBufferLastHWM.intValue()));
                   }
                }else {
                   this.mStartPlayBuffer = Integer.valueOf(jSONObject.optInt("liveSpbWifi", this.mStartPlayBuffer.intValue()));
                   this.mBufferIncrementStep = Integer.valueOf(jSONObject.optInt("liveIncStepWifi", this.mBufferIncrementStep.intValue()));
                   this.mBufferDeclineRate = Integer.valueOf(jSONObject.optInt("liveDecRateWifi", this.mBufferDeclineRate.intValue()));
                   this.mBufferLastHWM = Integer.valueOf(jSONObject.optInt("liveLastHWMWifi", this.mBufferLastHWM.intValue()));
                }
             }
          }catch(org.json.JSONException e3){
             e3.printStackTrace();
          }
       }
    }
    public KwaiPlayerLiveBuilder setStartPlayBlockBufferMs(int p0,int p1){
       this.mUseSpbBuffer = true;
       this.mSpbBufferMs = p0;
       this.mSpbMaxBufferCostMs = p1;
       return this;
    }
    public KwaiPlayerLiveBuilder setSystemPlayer(boolean p0){
       this.mSystemPlayer = p0;
       return this;
    }
    public KwaiPlayerLiveBuilder setUseAlignedPts(boolean p0){
       this.mUseAlignedPts = p0;
       return this;
    }
    public KwaiPlayerLiveBuilder setWebRTCConfigJson(String p0){
       this.mWebRTCConfigJson = p0;
       return this;
    }
}
