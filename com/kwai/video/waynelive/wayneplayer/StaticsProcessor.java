package com.kwai.video.waynelive.wayneplayer.StaticsProcessor;
import com.kwai.video.waynelive.wayneplayer.AbsWayneProcessor;
import com.kwai.video.waynelive.wayneplayer.StaticsProcessor$Companion;
import nsd.u;
import com.kwai.video.waynelive.wayneplayer.logger.LivePlayQualityStatistics;
import com.kwai.video.waynelive.wayneplayer.logger.KSLiveVideoContext;
import org.json.JSONObject;
import com.kwai.video.waynelive.mediaplayer.LivePlayerConfigProvider;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.player.qos.KwaiQosInfo;
import java.lang.Math;
import java.lang.Exception;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.waynelive.LivePlayerParam;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Long;
import java.lang.System;
import java.lang.Integer;
import com.kwai.video.waynelive.wayneplayer.StaticsProcessor$onKernelPlayerCreated$1;
import com.kwai.video.player.IMediaPlayer$OnQosStatListener;
import com.kwai.video.player.kwai_player.AspectAwesomeCache;
import com.kwai.video.waynelive.wayneplayer.StaticsProcessor$AwesomeCacheCallbackInner;
import com.kwai.video.player.IMediaPlayer$OnLiveAdaptiveQosStatListener;
import com.kwai.video.player.IMediaPlayer$OnLogEventListener;
import com.kwai.video.player.IMediaPlayer;
import org.json.JSONException;
import com.google.gson.JsonObject;
import com.kwai.video.waynelive.listeners.QosExtraInterface;
import com.google.gson.JsonElement;
import com.kwai.video.waynelive.wayneplayer.logger.KSLivePlayerLogUploader;
import com.kwai.video.waynelive.util.CommonUtil;
import com.kwai.player.KwaiPlayerConfig$a;
import com.kwai.player.KwaiPlayerConfig;
import com.kwai.video.waynelive.listeners.LivePlayerQosLogListener;
import com.kwai.video.waynelive.datasource.ILiveDatasource;
import java.util.List;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;

public final class StaticsProcessor extends AbsWayneProcessor	// class@000e3b
{
    public final String KEY_QOS_EXTRA;
    public AwesomeCacheCallback mCdnLoggerCallback;
    public boolean mIsPlayerConsumed;
    public boolean mIsPreload;
    public boolean mIsVoiceLive;
    public LivePlayQualityStatistics mLivePlayQualityStatistics;
    public LivePlayerQosLogListener mLivePlayerQosLogListener;
    public KSLiveVideoContext mLiveVideoContext;
    public long mPlayStartTimeMs;
    public String mQosExtraData;
    public QosExtraInterface mQosExtraInterface;
    public boolean mVideoRenderHasCalled;
    public static final StaticsProcessor$Companion Companion;

    static {
       StaticsProcessor.Companion = new StaticsProcessor$Companion(null);
    }
    public void StaticsProcessor(){
       super();
       this.KEY_QOS_EXTRA = "qos_extra";
       this.mLivePlayQualityStatistics = new LivePlayQualityStatistics();
       this.mLiveVideoContext = new KSLiveVideoContext();
    }
    public final void addHwConfig(JSONObject p0,LivePlayerConfigProvider p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StaticsProcessor.class, "14")) {
          return;
       }
       if (p0 != null && p1 != null) {
          JSONObject jSONObject = new JSONObject();
          JSONObject jSONObject1 = new JSONObject();
          jSONObject1.put("widthLimitH264", p1.getWidthLimit264Hw());
          jSONObject1.put("heightLimitH264", p1.getHeightLimit264Hw());
          jSONObject1.put("widthLimitH265", p1.getWidthLimit265Hw());
          jSONObject1.put("heightLimitH265", p1.getHeightLimit265Hw());
          jSONObject1.put("isLiveH264SupportMediacodec", p1.isLiveH264SupportMediacodec());
          jSONObject1.put("isLiveH265SupportMediacodec", p1.isLiveH265SupportMediacodec());
          jSONObject.put("mediacodec", jSONObject1);
          p0.put("hw_decode", jSONObject);
       }
       return;
    }
    public final void addLivePlayQualityStatSlice(){
       if (PatchProxy.applyVoid(null, this, StaticsProcessor.class, "10")) {
          return;
       }
       if (this.getMediaPlayer().getLiveMediaPlayer() != null) {
          this.mLivePlayQualityStatistics.addTraffic(this.getMediaPlayer().getLiveMediaPlayer().getDownloadDataSize()).fillDroppedFieldsWithStreamQosInfo(this.getMediaPlayer().getLiveMediaPlayer().getStreamQosInfo()).addBufferTime(this.getMediaPlayer().getLiveMediaPlayer().bufferEmptyDuration()).addBlockCount(this.getMediaPlayer().getLiveMediaPlayer().bufferEmptyCount());
       }
       return;
    }
    public final void addRetryInfo(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StaticsProcessor.class, "16")) {
          return;
       }
       try{
          WayneLivePlayer mTotalRetryC = this.getMediaPlayer().mTotalRetryCount;
          int i = Math.max(0, (mTotalRetryC - this.getMediaPlayer().mLastRetryCount));
          this.getMediaPlayer().mLastRetryCount = mTotalRetryC;
          p0.put("retry_cnt", i);
          if (i > 0) {
             p0.put("retry_reason", this.getMediaPlayer().mRetryReason);
          }
          p0.put("reCreate_reason", this.getMediaPlayer().mRecreateReason);
          p0.put("player_index_wayne", this.getMediaPlayer().playerIndex);
          p0.mRetryReason = 0;
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
       }
       return;
    }
    public final boolean enableQos(){
       Object obj = PatchProxy.apply(null, this, StaticsProcessor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mIsPreload == null || this.mIsPlayerConsumed != null)? true: false;
       DebugLog.i(this.getLogTag(), "enableQos: "+b);
       return b;
    }
    public final String getLogTag(){
       String obj = PatchProxy.apply(null, this, StaticsProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.isAttach() && this.getMediaPlayer() != null)? this.getMediaPlayer().getTag()+"::StaticsProcessor": "StaticsProcessor";
       return obj;
    }
    public final AwesomeCacheCallback getMCdnLoggerCallback(){
       return this.mCdnLoggerCallback;
    }
    public final void initQualityStatics(LivePlayerParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StaticsProcessor.class, "3")) {
          return;
       }
       a.p(p0, "livePlayerParam");
       LivePlayerParam mIsPreload = p0.mIsPreload;
       this.mIsPreload = mIsPreload;
       this.mIsPlayerConsumed = mIsPreload ^ 0x01;
       this.mIsVoiceLive = p0.mIsVoiceLive;
       LivePlayQualityStatistics livePlayQual = new LivePlayQualityStatistics();
       this.mLivePlayQualityStatistics = livePlayQual;
       livePlayQual.setIsPreload(this.mIsPreload);
       mIsPreload = p0.mKSLiveVideoContext;
       if (mIsPreload != null) {
          a.o(mIsPreload, "livePlayerParam.mKSLiveVideoContext");
          this.mLiveVideoContext = mIsPreload;
       }
       if (!TextUtils.isEmpty(p0.mLiveStreamId) && TextUtils.isEmpty(this.mLiveVideoContext.liveStreamId)) {
          this.mLiveVideoContext.liveStreamId = p0.mLiveStreamId;
       }
       StaticsProcessor tmLiveVideoC = this.mLiveVideoContext;
       Long longx = (tmLiveVideoC != null)? Long.valueOf(tmLiveVideoC.clickTimeMs): null;
       if (longx.longValue() <= 0) {
          tmLiveVideoC = this.mLiveVideoContext;
          if (tmLiveVideoC != null) {
             tmLiveVideoC.clickTimeMs = System.currentTimeMillis();
          }
       }
       tmLiveVideoC = this.mLiveVideoContext;
       this.mPlayStartTimeMs = tmLiveVideoC.clickTimeMs;
       this.mLivePlayQualityStatistics.logStart(tmLiveVideoC);
       this.mLivePlayQualityStatistics.setHost(this.mLiveVideoContext.liveStreamHost);
       this.mLivePlayQualityStatistics.setLiveStreamId(this.mLiveVideoContext.liveStreamId);
       return;
    }
    public void onAttach(){
    }
    public final void onBeforRetry(int p0){
       StaticsProcessor staticsProce = StaticsProcessor.class;
       if (PatchProxy.isSupport(staticsProce) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, staticsProce, "15")) {
          return;
       }
       this.mVideoRenderHasCalled = false;
       this.mLivePlayQualityStatistics.addRetryCount();
       if (!this.mLivePlayQualityStatistics.getRetryReason()) {
          this.mLivePlayQualityStatistics.setRetryReason(p0);
       }
       this.addLivePlayQualityStatSlice();
       this.mLivePlayQualityStatistics.logEndBufferTimeThenAddIfNeed();
       this.mLivePlayQualityStatistics.logStartBufferTime();
       return;
    }
    public void onDetach(){
       this.mQosExtraInterface = null;
    }
    public void onKernelPlayerCreated(){
       if (PatchProxy.applyVoid(null, this, StaticsProcessor.class, "13")) {
          return;
       }
       super.onKernelPlayerCreated();
       IKwaiMediaPlayer liveMediaPla = this.getMediaPlayer().getLiveMediaPlayer();
       a.o(liveMediaPla, "mediaPlayer.liveMediaPlayer");
       this.setLivePlayerJsonToKwaiPlayer(liveMediaPla);
       this.getMediaPlayer().getLiveMediaPlayer().setLiveOnQosStatListener(new StaticsProcessor$onKernelPlayerCreated$1(this));
       liveMediaPla = this.getMediaPlayer().getLiveMediaPlayer();
       a.o(liveMediaPla, "mediaPlayer.liveMediaPlayer");
       liveMediaPla.getAspectAwesomeCache().setAwesomeCacheCallback(new StaticsProcessor$AwesomeCacheCallbackInner(this));
       return;
    }
    public void onKernelPlayerDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, StaticsProcessor.class, "12")) {
          return;
       }
       try{
          super.onKernelPlayerDestroy();
          if (this.mIsPlayerConsumed != null) {
             this.uploadLivePlayQualityStat();
          }
          this.getMediaPlayer().getLiveMediaPlayer().setLiveOnPeriodicalLiveAdaptiveQosStatListener(objArray);
          this.getMediaPlayer().getLiveMediaPlayer().setLiveOnQosStatListener(objArray);
          this.getMediaPlayer().getLiveMediaPlayer().setOnLogEventListener(objArray);
       }catch(java.lang.Exception e0){
          DebugLog.e("VSE Exception", e0.getMessage());
       }
       return;
    }
    public final void onRenderStart(){
       if (PatchProxy.applyVoid(null, this, StaticsProcessor.class, "6")) {
          return;
       }
       if (this.mIsPreload == null) {
          this.mLivePlayQualityStatistics.logRenderEndTimeIfNeed();
          this.mLivePlayQualityStatistics.logEndBufferTimeThenAddIfNeed();
       }
       return;
    }
    public final void onVideoFrameRenderInterActive(){
       if (PatchProxy.applyVoid(null, this, StaticsProcessor.class, "7")) {
          return;
       }
       if (this.mIsPreload != null && (this.mIsPlayerConsumed != null && this.mVideoRenderHasCalled == null)) {
          this.mVideoRenderHasCalled = true;
          this.mLivePlayQualityStatistics.logRenderEndTimeIfNeed();
          this.mLivePlayQualityStatistics.logEndBufferTimeThenAddIfNeed();
       }
    label_0025 :
       return;
    }
    public final void postLivePlayerQos(JSONObject p0,boolean p1){
       String qosExtra;
       StaticsProcessor staticsProce = StaticsProcessor.class;
       if (PatchProxy.isSupport(staticsProce) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, staticsProce, "11")) {
          return;
       }
       String logTag = this.getLogTag();
       String str = "postLivePlayerQos";
       try{
          DebugLog.i(logTag, str);
          p0.put("is_preload", this.mIsPreload);
          p0.put("voice_live", this.mIsVoiceLive);
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("qos", p0.toString());
       StaticsProcessor tmQosExtraIn = this.mQosExtraInterface;
       if (tmQosExtraIn != null) {
          qosExtra = (tmQosExtraIn != null)? tmQosExtraIn.getQosExtra(): null;
       }else {
          qosExtra = this.mQosExtraData;
       }
       if (qosExtra != null && !TextUtils.isEmpty(qosExtra)) {
          jsonObject.c0(this.KEY_QOS_EXTRA, qosExtra);
       }else {
          DebugLog.i(this.getLogTag(), "QosExtra data is null  or empty");
       }
       qosExtra = (p1)? "VP_LIVE_PLAYER_ADAPTIVE_QOS": "VP_KWAI_PLAYER_QOS";
       try{
          KSLivePlayerLogUploader.logEvent(qosExtra, jsonObject.toString());
       }catch(java.lang.IllegalArgumentException e0){
          String str1 = CommonUtil.removeSurrogates(e0.toString());
          a.o(str1, "CommonUtil.removeSurrogates\(jsonObject.toString\(\)\)");
          KSLivePlayerLogUploader.logEvent(qosExtra, str1);
       }
       return;
    }
    public final void setCdnLoggerCallback(AwesomeCacheCallback p0){
       this.mCdnLoggerCallback = p0;
    }
    public final void setEnterTimeForPreload(long p0){
       StaticsProcessor staticsProce = StaticsProcessor.class;
       if (PatchProxy.isSupport(staticsProce) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, staticsProce, "4")) {
          return;
       }
       String logTag = this.getLogTag();
       StringBuilder str = "player: ";
       String str1 = "null";
       String str2 = (this.getMediaPlayer() == null)? str1: Integer.valueOf(this.getMediaPlayer().hashCode());
       str = str+str2+" setEnterTimeForPreload stream id: ";
       StaticsProcessor tmLiveVideoC = this.mLiveVideoContext;
       if (tmLiveVideoC != null) {
          str1 = tmLiveVideoC.liveStreamId;
       }
       DebugLog.i(logTag, str+str1+" timestamp: "+p0+" isPreload: "+this.mIsPreload+" isConsumed: "+this.mIsPlayerConsumed);
       if (this.mIsPlayerConsumed == null && this.mIsPreload != null) {
          if (p0 - null <= 0) {
             p0 = System.currentTimeMillis();
          }
          staticsProce = this.mLiveVideoContext;
          staticsProce.clickTimeMs = p0;
          this.mPlayStartTimeMs = p0;
          this.mLivePlayQualityStatistics.logStart(staticsProce);
          if (this.getMediaPlayer().getLiveMediaPlayer() != null) {
             IKwaiMediaPlayer liveMediaPla = this.getMediaPlayer().getLiveMediaPlayer();
             a.o(liveMediaPla, "mediaPlayer.liveMediaPlayer");
             this.setLivePlayerJsonToKwaiPlayer(liveMediaPla);
          }
          boolean b = true;
          this.mIsPlayerConsumed = b;
          if (this.getMediaPlayer().getLiveMediaPlayer() != null && this.mIsPreload != null) {
             KwaiPlayerConfig$a uoa = new KwaiPlayerConfig$a();
             uoa.k = 0x2710;
             uoa.f((long)0x2710);
             uoa.d(b);
             this.getMediaPlayer().getLiveMediaPlayer().startLiveStatTimer(uoa.a());
          }
       }
    label_00d6 :
       return;
    }
    public final void setLivePlayerJsonToKwaiPlayer(IKwaiMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StaticsProcessor.class, "8")) {
          return;
       }
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("play_start_time", this.mPlayStartTimeMs);
          jSONObject.put("stream_id", this.mLiveVideoContext.liveStreamId);
          jSONObject.put("domain", this.mLivePlayQualityStatistics.getHost());
          p0.setAppQosStatJson(jSONObject);
          return;
       }catch(org.json.JSONException e0){
       }
    }
    public final void setLivePlayerQosLogListener(LivePlayerQosLogListener p0){
       this.mLivePlayerQosLogListener = p0;
    }
    public final void setMCdnLoggerCallback(AwesomeCacheCallback p0){
       this.mCdnLoggerCallback = p0;
    }
    public final void setQosExtraData(String p0){
       this.mQosExtraData = p0;
    }
    public final void setQosExtraInterface(QosExtraInterface p0){
       this.mQosExtraInterface = p0;
    }
    public final void updateSource(ILiveDatasource p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, StaticsProcessor.class, "2")) {
          return;
       }
       a.p(p0, "liveDataSource");
       if (p0.getCurrentDatasource().size() > 0) {
          StaticsProcessor tmLivePlayQu = this.mLivePlayQualityStatistics;
          LiveAdaptiveManifest liveAdaptive = p0.getCurrentDatasource().get(0);
          liveAdaptive = (liveAdaptive != null)? liveAdaptive.mHost: null;
          tmLivePlayQu.setHost(liveAdaptive);
       }
       return;
    }
    public final void uploadLivePlayQualityStat(){
       if (PatchProxy.applyVoid(null, this, StaticsProcessor.class, "9")) {
          return;
       }
       this.mLivePlayQualityStatistics.logEnd();
       if (this.getMediaPlayer().getLiveMediaPlayer() != null) {
          this.mLivePlayQualityStatistics.addTraffic(this.getMediaPlayer().getLiveMediaPlayer().getDownloadDataSize()).fillDroppedFieldsWithStreamQosInfo(this.getMediaPlayer().getLiveMediaPlayer().getStreamQosInfo()).setPlayerQosJson(this.getMediaPlayer().getLiveMediaPlayer().getLiveStatJson()).addBufferTime(this.getMediaPlayer().getLiveMediaPlayer().bufferEmptyDuration()).addBlockCount(this.getMediaPlayer().getLiveMediaPlayer().bufferEmptyCount()).logEndBufferTimeThenAddIfNeed().logPlayerStartTime(this.mPlayStartTimeMs).logPlayerStopTime().upload();
       }
       return;
    }
}
