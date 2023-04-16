package com.kwai.video.wayne.player.logreport.PlayerLogReportProcessor;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.main.WaynePlayer;
import java.lang.String;
import com.kwai.video.wayne.player.logreport.KSTimeSliceCollection;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import ew7.e;
import ew7.c;
import ew7.b;
import ew7.d;
import com.kwai.video.wayne.player.logreport.PlayerLogReportProcessor$1;
import ew7.a;
import com.kwai.player.qos.KwaiPlayerResultQos;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.video.wayne.player.main.LoadingType;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.main.KSVodPlayHistoryManager;
import java.lang.System;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.wayne.player.builder.WayneVideoContext;
import com.kwai.video.wayne.player.logreport.LaunchReport;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Character;
import com.kwai.video.wayne.player.datasource.IDatasource;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import com.kwai.video.wayne.player.util.GsonUtil;
import com.kwai.video.wayne.player.logreport.RetryPlayerStat$RetryPlayerStatItem;
import com.google.gson.Gson;
import org.json.JSONObject;
import com.kwai.video.wayne.player.util.DebugLog;
import com.kwai.video.wayne.player.logreport.PlayerLogReportProcessor$VideoContext;
import com.kwai.video.wayne.player.logreport.KPMidTrace;
import com.kwai.video.wayne.player.InjectHelper;
import com.kwai.video.wayne.player.prefetcher.IPrefetchReporterInfo;
import com.kwai.video.wayne.player.WaynePlayerInitor;
import android.content.Context;
import com.kwai.video.wayne.player.util.VodPlayerUtils;
import com.kwai.video.wayne.player.KSActionEventCollector;
import com.kwai.video.wayne.player.logreport.LogReport;
import com.kwai.video.wayne.player.logreport.IKSLogReport;
import com.kwai.video.wayne.player.WayneContext;
import java.lang.Enum;
import java.lang.NullPointerException;
import org.json.JSONException;
import com.kwai.video.wayne.player.listeners.OnPauseListener;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate;
import com.kwai.video.wayne.player.listeners.OnStartListener;
import com.kwai.video.wayne.player.listeners.OnSeekListener;
import com.kwai.video.wayne.player.listeners.OnPlayerLoadingChangedListener;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.wayne.player.logreport.DataReporter;
import java.lang.Long;

public class PlayerLogReportProcessor extends AbsKpMidProcessor	// class@000d45
{
    public String TAG;
    public AtomicInteger mBlockExit;
    public DataReporter mDataReporter;
    public long mEnterTime;
    public long mLeaveTime;
    public KSTimeSliceCollection mPauseBeforeFirstScreenCost;
    public ArrayList mRetryPlayerStatItemList;
    public AtomicInteger mSeekExit;
    public ArrayList mUpdateVideoContextTimestamp;
    public AtomicInteger mVodError;
    public IMediaPlayer$OnErrorListener onErrorListener;
    public OnPauseListener onPauseListener;
    public OnPlayerLoadingChangedListener onPlayerLoadingChangedListener;
    public OnSeekListener onSeekListener;
    public OnStartListener onStartListener;

    public void PlayerLogReportProcessor(){
       super();
       String str = "::PlayerLogReportProcessor";
       if (this.isAttach()) {
          str = this.getMediaPlayer().getLogTag()+str;
       }
       this.TAG = str;
       this.mPauseBeforeFirstScreenCost = new KSTimeSliceCollection();
       this.mRetryPlayerStatItemList = new ArrayList();
       this.mUpdateVideoContextTimestamp = new ArrayList();
       this.mEnterTime = -1;
       this.mLeaveTime = -1;
       this.mBlockExit = new AtomicInteger();
       this.mSeekExit = new AtomicInteger();
       this.mVodError = new AtomicInteger();
       this.mDataReporter = new e(this);
       this.onPlayerLoadingChangedListener = new c(this);
       this.onPauseListener = new b(this);
       this.onStartListener = new d(this);
       this.onSeekListener = new PlayerLogReportProcessor$1(this);
       this.onErrorListener = new a(this);
       return;
    }
    public static void a(PlayerLogReportProcessor p0){
       p0.lambda$new$3();
    }
    public static void b(PlayerLogReportProcessor p0,KwaiPlayerResultQos p1){
       p0.lambda$new$0(p1);
    }
    public static boolean c(PlayerLogReportProcessor p0,IMediaPlayer p1,int p2,int p3){
       return p0.lambda$new$4(p1, p2, p3);
    }
    public static void d(PlayerLogReportProcessor p0,boolean p1,LoadingType p2){
       p0.lambda$new$1(p1, p2);
    }
    public static void e(PlayerLogReportProcessor p0){
       p0.lambda$new$2();
    }
    private void lambda$new$0(KwaiPlayerResultQos p0){
       this.logVideoStatJson(p0);
    }
    private void lambda$new$1(boolean p0,LoadingType p1){
       if (p1 == LoadingType.STATE_BUFFERSTART) {
          this.mBlockExit.set(1);
       }else if(p1 == LoadingType.STATE_BUFFEREND){
          this.mBlockExit.set(0);
       }else if(p1 == LoadingType.STATE_FIRSTFRAME){
          if (this.getMediaPlayer().getBuildData().mVideoContext != null && (!this.getMediaPlayer().isVideoRenderingStart() && KSVodPlayHistoryManager.getInstance().getLaunchPlayCount().get() == 1)) {
             long l = System.currentTimeMillis();
             String vodStatJson = (this.getMediaPlayer().getKernelPlayer() != null)? this.getMediaPlayer().getKernelPlayer().getVodStatJson(): null;
             LaunchReport.logVpLaunchPlay(false, -1, l, vodStatJson, this.getMediaPlayer().getBuildData().mVideoContext);
          }
       label_006b :
          this.resetLogParam();
       }
       return;
    }
    private void lambda$new$2(){
       if (!this.getMediaPlayer().isVideoRenderingStart()) {
          this.mPauseBeforeFirstScreenCost.start();
       }
       return;
    }
    private void lambda$new$3(){
       if (!this.getMediaPlayer().isVideoRenderingStart()) {
          this.mPauseBeforeFirstScreenCost.end();
       }
       return;
    }
    private boolean lambda$new$4(IMediaPlayer p0,int p1,int p2){
       this.mVodError.set(p1);
       return false;
    }
    public static String removeSurrogates(String p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, PlayerLogReportProcessor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       int i = 0;
       while (i < p0.length()) {
          char c = p0.charAt(i);
          if (!Character.isHighSurrogate(c) && !Character.isLowSurrogate(c)) {
             obj = obj+c;
          }
          i = i + 1;
       }
       return obj;
    }
    public final String getCacheKeyConfusionState(){
       String obj = PatchProxy.apply(null, this, PlayerLogReportProcessor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (TextUtils.isEmpty(this.getMediaPlayer().getBuildData().getDataSourceModule().getCacheKey()))? "0": "1";
       return obj;
    }
    public void inflateRetryPlayerStats(IKwaiMediaPlayer p0,int p1){
       PlayerLogReportProcessor playerLogRep = PlayerLogReportProcessor.class;
       if (PatchProxy.isSupport(playerLogRep) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, playerLogRep, "8")) {
          return;
       }
       if (p0 != null && !TextUtils.isEmpty(p0.getVodStatJson())) {
          RetryPlayerStat$RetryPlayerStatItem retryPlayerS = GsonUtil.KP_MID_GSON.h(p0.getVodStatJson(), RetryPlayerStat$RetryPlayerStatItem.class);
          if (retryPlayerS != null) {
             retryPlayerS.volume = this.getMediaPlayer().getBuildData().mLeftVolume+"-"+this.getMediaPlayer().getBuildData().mRightVolume;
             retryPlayerS.vodError = this.mVodError.get();
             retryPlayerS.refreshType = p1;
             this.mRetryPlayerStatItemList.add(retryPlayerS);
          }
       }
       return;
    }
    public final void logVideoStatJson(KwaiPlayerResultQos p0){
       int i;
       String str = "VP_PLAYFINISHED";
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLogReportProcessor.class, "3")) {
          return;
       }
       p0 = p0.videoStatJson;
       JSONObject jSONObject = new JSONObject();
       try{
          i = 1;
          if (this.getMediaPlayer() == null) {
             DebugLog.e(this.TAG, "player null when logVideoStatJson ");
             return;
          }else {
             jSONObject.put("qos", p0);
             KSVodPlayHistoryManager kSVodPlayHis = null;
             if (this.getMediaPlayer().getBuildData().mVideoContext != null) {
                WayneBuildData mVideoContex = this.getMediaPlayer().getBuildData().mVideoContext;
                PlayerLogReportProcessor$VideoContext videoContext = new PlayerLogReportProcessor$VideoContext();
                videoContext.mVideoId = mVideoContex.mVideoId;
                videoContext.mEnterAction = mVideoContex.mEnterAction;
                videoContext.mVideoProfile = mVideoContex.mVideoProfile;
                videoContext.mExtra = mVideoContex.mExtra;
                videoContext.mPrepareTimestamp = this.getMediaPlayer().getMKPMidTrace().getMCallPrepareTimestamp();
                videoContext.mClickToFirstFrame = (this.getMediaPlayer().getBuildData().mVideoContext.mClickTime - kSVodPlayHis > 0)? this.getMediaPlayer().getMKPMidTrace().getMCallFirstFrameTimestamp() - this.getMediaPlayer().getBuildData().mVideoContext.mClickTime: 1;
                videoContext.mCallFirstFrameTimestamp = this.getMediaPlayer().getMKPMidTrace().getMCallFirstFrameTimestamp();
                videoContext.mStartTimestamp = this.getMediaPlayer().getMKPMidTrace().getMCallStartTimestamp();
                videoContext.mPageName = mVideoContex.mPageName;
                videoContext.mClickTimeStamp = mVideoContex.mClickTime;
                videoContext.mCallUpdateVideoContextTimestamp = this.mUpdateVideoContextTimestamp;
                videoContext.mCallOnPreparedTimestamp = this.getMediaPlayer().getMKPMidTrace().getMCallOnPreparedTimestamp();
                WayneVideoContext mClickTime = mVideoContex.mClickTime;
                this.mEnterTime = mClickTime;
                videoContext.mEnterTime = mClickTime;
                long l = System.currentTimeMillis();
                this.mLeaveTime = l;
                videoContext.mLeaveTime = l;
                PlayerLogReportProcessor tmRetryPlaye = this.mRetryPlayerStatItemList;
                videoContext.mRetryPlayer = tmRetryPlaye;
                videoContext.mRetryCnt = String.valueOf(tmRetryPlaye.size());
                videoContext.mBlockExit = String.valueOf(this.mBlockExit.get());
                videoContext.mVodError = String.valueOf(this.mVodError.get());
                videoContext.volume = this.getMediaPlayer().getBuildData().mLeftVolume+"-"+this.getMediaPlayer().getBuildData().mRightVolume;
                videoContext.mSeekExit = String.valueOf(this.mSeekExit.get());
                videoContext.mCacheKeyConfusion = this.getCacheKeyConfusionState();
                DebugLog.e(this.TAG, "cacheKey confusion: "+videoContext.mCacheKeyConfusion);
                jSONObject.put("prefetch", InjectHelper.getInstance().getPrefetchInfoImpl().getPrefetchReporterInfo(mVideoContex.mVideoId));
                jSONObject.put("stats", GsonUtil.KP_MID_GSON.q(videoContext));
             }
             JSONObject jSONObject1 = new JSONObject();
             jSONObject1.put("soc_name", VodPlayerUtils.getSocName(WaynePlayerInitor.APP_CONTEXT));
             jSONObject1.put("board_platform", VodPlayerUtils.getBoardPlatform());
             jSONObject.put("device_info", jSONObject1);
             long launchTimeSt = KSActionEventCollector.getInstance().getLaunchTimeStamp();
             if (!launchTimeSt - kSVodPlayHis && KSVodPlayHistoryManager.getInstance().getLaunchPlayCount().get() == i) {
                launchTimeSt = this.mEnterTime;
             }
             jSONObject.put("launch_start_time", launchTimeSt);
             jSONObject.put("launch_play_rank", KSVodPlayHistoryManager.getInstance().getLaunchPlayCount().get());
             jSONObject.put("session_id", KSActionEventCollector.getInstance().getLaunchSessionId());
             DebugLog.i(this.TAG, "logVideoStatJson VP_PLAYFINISHED£»"+jSONObject.toString());
             LogReport.get().getLogger().logEvent(WayneContext.app.name(), str, jSONObject.toString(), i);
          }
       }catch(org.json.JSONException e11){
          DebugLog.e(this.TAG, "JSONException "+e11.getMessage());
       }catch(java.lang.NullPointerException e11){
          DebugLog.e(this.TAG, "NullPointerException "+e11.getMessage());
       }catch(java.lang.IllegalArgumentException e0){
          LogReport.get().getLogger().logEvent(WayneContext.app.name(), e0, PlayerLogReportProcessor.removeSurrogates(jSONObject.toString()), i);
       }
       return;
    }
    public void onAttach(){
       if (PatchProxy.applyVoid(null, this, PlayerLogReportProcessor.class, "1")) {
          return;
       }
       this.getMediaPlayer().addOnPauseListener(this.onPauseListener);
       this.getMediaPlayer().addOnStartListener(this.onStartListener);
       this.getMediaPlayer().addOnSeekListener(this.onSeekListener);
       this.getMediaPlayer().addOnPlayerLoadingChangedListener(this.onPlayerLoadingChangedListener);
       this.getMediaPlayer().addOnErrorListener(this.onErrorListener);
       this.getMediaPlayer().addVseDataReporter(this.mDataReporter);
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, PlayerLogReportProcessor.class, "2")) {
          return;
       }
       this.getMediaPlayer().removeOnPauseListener(this.onPauseListener);
       this.getMediaPlayer().removeOnSeekListener(this.onSeekListener);
       this.getMediaPlayer().removeOnStartListener(this.onStartListener);
       this.getMediaPlayer().removeOnPlayerLoadingChangedListener(this.onPlayerLoadingChangedListener);
       this.getMediaPlayer().removeOnErrorListener(this.onErrorListener);
       this.getMediaPlayer().removeVseDataReporter(this.mDataReporter);
       return;
    }
    public final void resetLogParam(){
       if (PatchProxy.applyVoid(null, this, PlayerLogReportProcessor.class, "7")) {
          return;
       }
       this.mBlockExit.set(0);
       this.mSeekExit.set(0);
       return;
    }
    public void updateVideoContext(WayneVideoContext p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLogReportProcessor.class, "6")) {
          return;
       }
       this.mUpdateVideoContextTimestamp.add(Long.valueOf(System.currentTimeMillis()));
       if (this.getMediaPlayer().getBuildData() != null && (this.getMediaPlayer().getBuildData().mVideoContext != null && p0 != null)) {
          if (this.getMediaPlayer().getBuildData().mVideoContext.mClickTime - p0.mClickTime) {
             this.mPauseBeforeFirstScreenCost.reset();
          }
       }else {
          this.mPauseBeforeFirstScreenCost.reset();
       }
       if (p0 != null) {
          DebugLog.d(this.TAG, "updateVideoContext mClickTime is£º"+p0.mClickTime);
       }else {
          DebugLog.d(this.TAG, "updateVideoContext mClickTime is null");
       }
       this.getMediaPlayer().getBuildData().mVideoContext = p0;
       return;
    }
}
