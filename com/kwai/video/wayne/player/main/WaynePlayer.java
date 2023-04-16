package com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate;
import com.kwai.video.wayne.player.main.WaynePlayer$Companion;
import nsd.u;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface;
import com.kwai.video.wayne.player.config.impl.WaynePlayerConfigImpl;
import ai7.d;
import com.kwai.video.wayne.player.config.inerface.InjectConfigInterface;
import com.kwai.video.wayne.player.logreport.KPMidTrace;
import com.kwai.video.wayne.player.PlayerIndexInfo;
import android.os.Handler;
import android.os.Looper;
import com.kwai.video.wayne.player.main.WaynePlayer$mOnPlayerReleaseListener$1;
import com.kwai.video.wayne.player.main.WaynePlayer$mOnRenderStartListener$1;
import com.kwai.video.wayne.player.main.WaynePlayer$mPlayerInstanceHandler$1;
import com.kwai.video.wayne.player.main.WaynePlayer$mCmdExecutor$1;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import com.kwai.video.wayne.player.InstancePriority;
import com.kwai.video.wayne.player.KwaiMediaPlayerInstanceManager;
import com.kwai.video.wayne.player.OnPlayerInstanceHandler;
import com.kwai.video.wayne.player.WaynePlayerInitor;
import com.kwai.video.wayne.debug.WayneDebug;
import com.kwai.video.wayne.debug.WayneDebug$Companion;
import com.kwai.video.wayne.debug.CmdExecutor;
import com.kwai.video.wayne.player.main.WaynePlayer$1;
import com.kwai.video.wayne.player.listeners.OnPlayerLoadingChangedListener;
import com.kwai.video.wayne.player.main.KSVodPlayHistoryManager;
import com.kwai.video.wayne.player.logreport.DataReporter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.kwai.video.wayne.player.listeners.OnPlayerActualPlayingChangedListener;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import com.kwai.video.wayne.player.listeners.OnBuildDataChangedListener;
import com.kwai.video.wayne.player.listeners.OnQualityChangeListener;
import com.kwai.video.wayne.player.main.RepresentationProcessor;
import com.kwai.video.wayne.player.listeners.OnSurfaceChangedListener;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.wayne.player.subtitle.SubtitleProcessor;
import java.lang.Integer;
import com.kwai.video.wayne.player.main._0_AbstractPlayerHolder;
import android.view.SurfaceHolder;
import com.kwai.video.player.IMediaPlayer;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import com.kwai.video.wayne.player.multisource.switcher.DataSourceFetcher;
import com.kwai.video.wayne.player.main.PlayerState;
import com.kwai.video.wayne.player.util.DebugLog;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor;
import java.util.Map;
import com.kwai.video.wayne.player.main.RetryStrategy;
import com.kwai.video.wayne.player.main.PlayerStateProcessor;
import com.kwai.video.wayne.player.main.ProgressProcessor;
import com.kwai.video.wayne.player.main.AwesomeCacheProcessor;
import com.kwai.video.wayne.player.danmakumask.DanmakuProcessor;
import android.content.Context;
import com.kwai.video.wayne.player.debugview.DebugViewProcessor;
import com.kwai.video.wayne.player.WayneContext;
import com.kwai.video.wayne.player.WaynePlayerInitor$APP;
import com.kwai.video.wayne.player.logreport.PlayerLogReportProcessor;
import com.kwai.video.player.CdnEventLogCallback;
import com.kwai.video.hodor.logEvent.CdnStatEvent;
import com.kwai.video.player.kwai_player.AspectAwesomeCache;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.wayne.player.datasource.WayneDatasourceProvider;
import com.kwai.video.wayne.player.main.WaynePlayer$createPlayer$fetchCallback$1;
import com.kwai.video.wayne.player.main.RetryInfo;
import com.kwai.video.wayne.player.main.FetchDataError;
import java.lang.Throwable;
import com.kwai.video.wayne.player.multisource.switcher.FetchReason;
import com.kwai.video.wayne.player.multisource.switcher.DataSourceFetchCallback;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import com.kwai.video.wayne.player.main.DatasourceInvalidError;
import com.kwai.video.player.KsMediaPlayerInitConfig;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface$KSUserFeature;
import com.kwai.video.wayne.player.main.LoadingType;
import com.kwai.video.wayne.player.builder.KwaiMediaPlayerBuilder;
import com.kwai.video.wayne.player.listeners.InnerPlayerLifeCycleListener;
import com.kwai.video.player.kwai_player.KwaiPlayerVodBuilder;
import android.os.SystemClock;
import com.kwai.video.wayne.player.main._1_AbstractMediaPlayerApiDelegate;
import com.kwai.video.player.IMediaPlayer$OnRenderingStartListener;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Iterable;
import com.kwai.player.KwaiRepresentation;
import com.kwai.video.wayne.player.datasource.IDatasource;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.wayne.player.main.IWaynePlayer$DataSourceFrom;
import ci7.a;
import com.kwai.video.wayne.player.util.CacheKeyUtil;
import com.kwai.video.cache.AwesomeCache;
import com.kwai.player.debuginfo.model.KwaiPlayerDebugInfo;
import com.kwai.player.debuginfo.KwaiPlayerDebugInfoProvider;
import com.kwai.player.debuginfo.model.AppVodQosDebugInfoNew;
import java.lang.Long;
import com.kwai.video.player.kwai_player.ProductContext;
import android.net.Uri;
import java.util.Collection;
import com.kwai.video.wayne.player.main.WaynePlayer$WhenMappings;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import java.lang.System;
import com.kwai.video.wayne.player.builder.WayneVideoContext;
import com.kwai.video.wayne.player.logreport.LaunchReport;
import com.kwai.video.wayne.player.listeners.OnPlayerStateChangedListener;
import com.kwai.player.qos.KwaiPlayerResultQos;
import ai7.e;
import com.kwai.video.wayne.player.listeners.CacheListener;
import com.kwai.video.wayne.player.main.OnErrorRetryListener;
import com.kwai.video.wayne.player.main.IWaynePlayer$DefaultImpls;
import java.lang.Float;
import com.kwai.player.debuginfo.IDebugView;
import com.kwai.video.wayne.player.subtitle.IVodSubtitleListener;
import java.lang.Math;
import android.graphics.RectF;
import com.kwai.video.wayne.player.danmakumask.KSRenderType;

public final class WaynePlayer extends _2_AbstractPlayerListenerDelegate implements IWaynePlayer	// class@000da2
{
    public boolean autoStart;
    public final Handler handler;
    public boolean isCancelDataSource;
    public WayneBuildData mBuildData;
    public CdnEventLogCallback mCdnEventLogCallback;
    public CmdExecutor mCmdExecutor;
    public final boolean mEnableSeekOnBuffering;
    public final boolean mEnableSeekOnError;
    public final boolean mEnableSurfaceReleaseOpt;
    public final Map mExtras;
    public boolean mIsActiveRelease;
    public boolean mIsRelease;
    public final KPMidTrace mKPMidTrace;
    public Set mOnBuildDataChangedListeners;
    public final e mOnPlayerReleaseListener;
    public final IMediaPlayer$OnRenderingStartListener mOnRenderStartListener;
    public String mOuterLogTag;
    public boolean mPendingCreatePlayer;
    public final int mPlayerId;
    public PlayerIndexInfo mPlayerIndexInfo;
    public final WaynePlayer$mPlayerInstanceHandler$1 mPlayerInstanceHandler;
    public final boolean mPlayerInstanceManagerEnable;
    public long mPositionWhenRelease;
    public final Map mProcessors;
    public Set mQosDataReporters;
    public List mQualityList;
    public long mStForStartCall;
    public long mStartToFirstScreenAudioFirstFrameCT;
    public long mStartToFirstScreenVideoFirstFrameCT;
    public boolean mStartedWhenRelease;
    public Surface mSurface;
    public final Set mSurfaceChangedListeners;
    public SurfaceHolder mSurfaceHolder;
    public SurfaceTexture mSurfaceTexture;
    public Set mVseDataReporters;
    public boolean shouldPrepareAfterInitFetchSource;
    public static final WaynePlayer$Companion Companion;
    public static final AtomicInteger sNextGeneratedId;

    static {
       WaynePlayer.Companion = new WaynePlayer$Companion(null);
       WaynePlayer.sNextGeneratedId = new AtomicInteger(1);
    }
    public void WaynePlayer(WayneBuildData p0){
       InstancePriority priorityFore;
       a.p(p0, "buildDataWayne");
       super();
       this.mProcessors = new HashMap();
       this.mBuildData = p0;
       this.mPlayerId = WaynePlayer.Companion.generatePlayerId();
       this.mOnBuildDataChangedListeners = new CopyOnWriteArraySet();
       this.mOuterLogTag = "";
       boolean b = InjectConfig.getConfig().enablePlayerInstanceManager();
       this.mPlayerInstanceManagerEnable = b;
       this.mExtras = new HashMap();
       this.mSurfaceChangedListeners = new CopyOnWriteArraySet();
       this.mEnableSurfaceReleaseOpt = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getBoolean("enableSurfaceReleaseOpt", false);
       this.mEnableSeekOnError = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getBoolean("enableSeekOnError", false);
       this.mEnableSeekOnBuffering = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getBoolean("enableSeekOnBuffering", false);
       KPMidTrace kPMidTrace = new KPMidTrace();
       this.mKPMidTrace = kPMidTrace;
       this.mPlayerIndexInfo = new PlayerIndexInfo();
       this.handler = new Handler(Looper.getMainLooper());
       this.mQosDataReporters = new CopyOnWriteArraySet();
       this.mVseDataReporters = new CopyOnWriteArraySet();
       this.mOnPlayerReleaseListener = new WaynePlayer$mOnPlayerReleaseListener$1(this);
       this.mOnRenderStartListener = new WaynePlayer$mOnRenderStartListener$1(this);
       WaynePlayer$mPlayerInstanceHandler$1 omPlayerInst = new WaynePlayer$mPlayerInstanceHandler$1(this);
       this.mPlayerInstanceHandler = omPlayerInst;
       this.mCmdExecutor = new WaynePlayer$mCmdExecutor$1(this);
       kPMidTrace.initTrace();
       kPMidTrace.initVseTrace();
       int startPlayTyp = this.mBuildData.getStartPlayType();
       boolean b1 = true;
       if (startPlayTyp) {
          if (startPlayTyp != b1) {
             priorityFore = (startPlayTyp != 2)? InstancePriority.PriorityForeground: InstancePriority.PriorityFocus;
          }else {
             priorityFore = InstancePriority.PriorityDecode;
          }
       }else {
          priorityFore = InstancePriority.PriorityDecode;
       }
       this.mPendingCreatePlayer = b1;
       if (b) {
          KwaiMediaPlayerInstanceManager.INSTANCE.addMediaPlayerInstance(this.hashCode(), omPlayerInst, priorityFore);
       }
       this.configProcessors();
       if (this.mPendingCreatePlayer != null) {
          this.createPlayer(false);
          this.mPendingCreatePlayer = false;
       }
       if (WaynePlayerInitor.isApkInDebug()) {
          WayneDebug.Companion.getInstance().registerCmdExecutor("invoke_error", this.mCmdExecutor);
       }
       this.addOnPlayerLoadingChangedListener(new WaynePlayer$1(this));
       KSVodPlayHistoryManager instance = KSVodPlayHistoryManager.getInstance();
       a.o(instance, "KSVodPlayHistoryManager.getInstance\(\)");
       instance.getLaunchPlayCount().incrementAndGet();
       return;
    }
    public void addDataReporter(DataReporter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "56")) {
          return;
       }
       a.p(p0, "reporter");
       this.mQosDataReporters.add(p0);
       return;
    }
    public void addOnPlayerActualPlayingChangedListener(OnPlayerActualPlayingChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "46")) {
          return;
       }
       a.p(p0, "listener");
       PlayerLoadingProcessor processor = this.getProcessor(PlayerLoadingProcessor.class);
       if (processor != null) {
          processor.addOnPlayerActualPlayingChangedListener(p0);
       }
       return;
    }
    public void addOnPlayerLoadingChangedListener(OnPlayerLoadingChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "54")) {
          return;
       }
       a.p(p0, "listener");
       PlayerLoadingProcessor processor = this.getProcessor(PlayerLoadingProcessor.class);
       if (processor != null) {
          processor.addOnPlayerLoadingChangedListener(p0);
       }
       return;
    }
    public void addOnPlayerVodBuildDataChangedListener(OnBuildDataChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "52")) {
          return;
       }
       a.p(p0, "listener");
       this.mOnBuildDataChangedListeners.add(p0);
       return;
    }
    public void addOnQualityChangedListener(OnQualityChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "63")) {
          return;
       }
       a.p(p0, "listener");
       RepresentationProcessor processor = this.getProcessor(RepresentationProcessor.class);
       if (processor != null) {
          processor.addOnQualityChangedListener(p0);
       }
       return;
    }
    public void addOnSurfaceChangedListener(OnSurfaceChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "74")) {
          return;
       }
       a.p(p0, "listener");
       this.mSurfaceChangedListeners.add(p0);
       return;
    }
    public int addSubtitle(String p0,boolean p1){
       SubtitleProcessor obj;
       WaynePlayer waynePlayer = WaynePlayer.class;
       if (PatchProxy.isSupport(waynePlayer)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, waynePlayer, "77");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.getProcessor(SubtitleProcessor.class);
       Integer integer = (obj != null)? Integer.valueOf(obj.addSubtitle(p0, p1)): null;
       a.m(integer);
       return integer.intValue();
    }
    public void addVseDataReporter(DataReporter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "58")) {
          return;
       }
       a.p(p0, "reporter");
       this.mVseDataReporters.add(p0);
       return;
    }
    public final void attachVideoOut(){
       if (PatchProxy.applyVoid(null, this, WaynePlayer.class, "18")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          WaynePlayer tmSurfaceHol = this.mSurfaceHolder;
          if (tmSurfaceHol != null) {
             tmKwaiMediaP.setDisplay(tmSurfaceHol);
             this.mSurface = null;
             this.mSurfaceTexture = null;
          }else {
             tmSurfaceHol = this.mSurface;
             if (tmSurfaceHol != null) {
                tmKwaiMediaP.setSurface(tmSurfaceHol);
                this.mSurfaceTexture = null;
                this.mSurfaceHolder = null;
             }else {
                tmSurfaceHol = this.mSurfaceTexture;
                if (tmSurfaceHol != null) {
                   tmKwaiMediaP.setSurfaceTexture(tmSurfaceHol);
                   this.mSurface = null;
                   this.mSurfaceHolder = null;
                }else {
                   this.detachVideoOut();
                }
             }
          }
       }
       return;
    }
    public final void cancelFetchDataSource(){
       if (PatchProxy.applyVoid(null, this, WaynePlayer.class, "7")) {
          return;
       }
       if (this.isCancelDataSource == null) {
          DataSourceFetcher mfetcher = this.getMfetcher();
          if (mfetcher != null) {
             mfetcher.cancel();
          }
          this.isCancelDataSource = true;
       }
       return;
    }
    public final boolean checkHasReleased(){
       Object obj = PatchProxy.apply(null, this, WaynePlayer.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.getInnerState() != PlayerState.Released) {
          return false;
       }
       DebugLog.e(this.getLogTag(), "player has released return");
       return true;
    }
    public final void configProcessors(){
       ErrorRetryProcessor uErrorRetryP = ErrorRetryProcessor.class;
       if (PatchProxy.applyVoid(null, this, WaynePlayer.class, "27")) {
          return;
       }
       ErrorRetryProcessor uErrorRetryP1 = new ErrorRetryProcessor();
       uErrorRetryP1.attach(this);
       this.mProcessors.put(uErrorRetryP, uErrorRetryP1);
       this.setFetcher(this.getMfetcher());
       uErrorRetryP = this.getProcessor(uErrorRetryP);
       if (uErrorRetryP != null) {
          uErrorRetryP.setRetryStrategy(new RetryStrategy(this.mBuildData.getSwitchStrategy(), 2));
       }
       PlayerStateProcessor playerStateP = new PlayerStateProcessor();
       playerStateP.attach(this);
       this.mProcessors.put(PlayerStateProcessor.class, playerStateP);
       PlayerLoadingProcessor playerLoadin = new PlayerLoadingProcessor();
       playerLoadin.attach(this);
       this.mProcessors.put(PlayerLoadingProcessor.class, playerLoadin);
       RepresentationProcessor representati = new RepresentationProcessor();
       representati.attach(this);
       this.mProcessors.put(RepresentationProcessor.class, representati);
       ProgressProcessor progressProc = new ProgressProcessor();
       progressProc.attach(this);
       this.mProcessors.put(ProgressProcessor.class, progressProc);
       AwesomeCacheProcessor uAwesomeCach = new AwesomeCacheProcessor();
       uAwesomeCach.attach(this);
       this.mProcessors.put(AwesomeCacheProcessor.class, uAwesomeCach);
       if (DanmakuProcessor.isIncludeDanmakuMaskFeat()) {
          DanmakuProcessor uDanmakuProc = new DanmakuProcessor(WaynePlayerInitor.APP_CONTEXT);
          uDanmakuProc.attach(this);
          this.mProcessors.put(DanmakuProcessor.class, uDanmakuProc);
       }
       if (WaynePlayerInitor.isApkInDebug()) {
          DebugViewProcessor uDebugViewPr = new DebugViewProcessor();
          uDebugViewPr.attach(this);
          this.mProcessors.put(DebugViewProcessor.class, uDebugViewPr);
       }
       SubtitleProcessor subtitleProc = new SubtitleProcessor();
       subtitleProc.attach(this);
       this.mProcessors.put(SubtitleProcessor.class, subtitleProc);
       if (WayneContext.app != WaynePlayerInitor$APP.KWAISHOU && WayneContext.app != WaynePlayerInitor$APP.PLATFORM_TOB) {
          PlayerLogReportProcessor playerLogRep = new PlayerLogReportProcessor();
          playerLogRep.attach(this);
          this.mProcessors.put(PlayerLogReportProcessor.class, playerLogRep);
       }
       return;
    }
    public final void configUnifyHodorCdnLog(){
       if (PatchProxy.applyVoid(null, this, WaynePlayer.class, "103")) {
          return;
       }
       WaynePlayer tmCdnEventLo = this.mCdnEventLogCallback;
       if (tmCdnEventLo != null) {
          a.m(tmCdnEventLo);
          if (tmCdnEventLo.isUnifyCdnLog() && this.mKwaiMediaPlayer != null) {
             tmCdnEventLo = this.mCdnEventLogCallback;
             a.m(tmCdnEventLo);
             CdnStatEvent uCdnStatEven = tmCdnEventLo.creatCdnStatEvent();
             if (uCdnStatEven != null) {
                _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
                a.o(tmKwaiMediaP, "mKwaiMediaPlayer");
                tmKwaiMediaP.getAspectAwesomeCache().setCdnStatEvent(uCdnStatEven);
             }
             if (this.mBuildData != null) {
                tmCdnEventLo = this.mCdnEventLogCallback;
                a.m(tmCdnEventLo);
                tmCdnEventLo.setBizFt(this.mBuildData.mBizFt);
                tmCdnEventLo = this.mCdnEventLogCallback;
                a.m(tmCdnEventLo);
                tmCdnEventLo.setBizExtra(this.mBuildData.mBizExtra);
             }
          }
       }
       return;
    }
    public final boolean createPlayer(int p0){
       WaynePlayer$createPlayer$fetchCallback$1 obj;
       WaynePlayer waynePlayer = WaynePlayer.class;
       if (PatchProxy.isSupport(waynePlayer)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, waynePlayer, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.mBuildData.getProvider().shouldFetchBeforePlay()) {
          DebugLog.i(this.getLogTag(), "fetch datasource before createPlayer");
          obj = new WaynePlayer$createPlayer$fetchCallback$1(this, p0);
          if (this.getMfetcher() == null) {
             RetryInfo retryInfo = new RetryInfo();
             retryInfo.setWhat(1002);
             retryInfo.setError(new FetchDataError());
             this.notifyWaynePlayerError(retryInfo);
          }else {
             this.isCancelDataSource = false;
             DataSourceFetcher mfetcher = this.getMfetcher();
             if (mfetcher != null) {
                mfetcher.fetch(obj, FetchReason.FetchReason_INITSOURCE);
             }
          }
          return false;
       }else {
          return this.createPlayerInternal(p0);
       }
    }
    public final boolean createPlayerInternal(int p0){
       ErrorRetryProcessor obj;
       WaynePlayer mBuildData;
       boolean b = this;
       int i = p0;
       PlayerLoadingProcessor playerLoadin = PlayerLoadingProcessor.class;
       PlayerStateProcessor playerStateP = PlayerStateProcessor.class;
       WaynePlayer waynePlayer = WaynePlayer.class;
       if (PatchProxy.isSupport(waynePlayer)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), b, waynePlayer, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       DebugLog.i(this.getLogTag(), "createPlayertype :"+i);
       b.mKPMidTrace.addStamp("kernalCreate");
       b.mKPMidTrace.addKV("createType", String.valueOf(p0));
       b.mKPMidTrace.addVseKV("isPreload", String.valueOf(b.mBuildData.isPreload()));
       WayneBuildData mBizFt = b.mBuildData.mBizFt;
       a.o(mBizFt, "mBuildData.mBizFt");
       b.mKPMidTrace.addVseKV("biz_ft", mBizFt);
       mBizFt = b.mBuildData.mBizExtra;
       a.o(mBizFt, "mBuildData.mBizExtra");
       b.mKPMidTrace.addVseKV("biz_extra", mBizFt);
       b.mKPMidTrace.addVseKV("pause_when_init", String.valueOf(b.mBuildData.shouldPauseWhenInit()));
       obj = b.getProcessor(ErrorRetryProcessor.class);
       if (obj != null) {
          obj.clearErrorCode();
       }
       obj = 5;
       if (i != 1 && (i != 3 && (i == 4 || i == obj))) {
          mBuildData = b.mBuildData;
          mBuildData.setPlayIndex((mBuildData.getPlayIndex() + 1));
       }
       b.mKPMidTrace.addKV("createIndex", String.valueOf(b.mBuildData.getPlayIndex()));
       if (b.mKwaiMediaPlayer != null) {
          if (!WaynePlayerInitor.isApkInDebug()) {
             DebugLog.e(this.getLogTag(), "mKwaiMediaPlayer is not null");
             return false;
          }else {
             throw new IllegalStateException("mKwaiMediaPlayer is not null");
          }
       }else if(!b.mBuildData.isPlayable()){
          RetryInfo retryInfo = new RetryInfo();
          retryInfo.setWhat(1001);
          retryInfo.setError(new DatasourceInvalidError());
          b.notifyWaynePlayerError(retryInfo);
          DebugLog.e(this.getLogTag(), "data source invalid, do nothing!!!");
          return false;
       }else {
          boolean i1 = -1;
          int intx = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getInt("lowVVThresholdForPlayer", i1);
          boolean booleanx = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getBoolean("enableStartOnPrepareForlowVV", false);
          int intx1 = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getInt("enableSwThresholdForLowVV", i1);
          boolean booleanx1 = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getBoolean("enableSwNoPreloadForLowVV", false);
          long vVCount = KsMediaPlayerInitConfig.getVVCount();
          long l = 0;
          if (intx >= 0 && (vVCount - l >= 0 && vVCount - (long)intx <= 0)) {
             if (booleanx && (b.mBuildData.hasSetPreload() && (!b.mBuildData.isPreload() && !b.mBuildData.shouldPauseWhenInit()))) {
                b.mBuildData.setStartPlayType(2);
             }
          label_0171 :
             if (booleanx1 && (b.mBuildData.hasSetPreload() && !b.mBuildData.isPreload())) {
                b.mBuildData.setMediaCodecPolicy(2);
             }
          label_0188 :
             if (intx1 > 0) {
                mBuildData = b.mPlayerId;
                if (mBuildData > 1 && mBuildData <= intx1) {
                   b.mBuildData.setMediaCodecPolicy(2);
                }
             }
             b.mBuildData.setEnableLowVVPlayOpt(1);
          }
       label_019a :
          if (WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getBoolean("enableStartOnPrepare", false) && (b.mBuildData.hasSetPreload() && (!b.mBuildData.isPreload() && !b.mBuildData.shouldPauseWhenInit()))) {
             b.mBuildData.setStartPlayType(2);
          }
       label_01c7 :
          if (WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getBoolean("enableSwNoPreload", false) && (b.mBuildData.hasSetPreload() && !b.mBuildData.isPreload())) {
             b.mBuildData.setMediaCodecPolicy(2);
          }
       label_01ec :
          intx = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getInt("newRefluxOptThreshold", i1);
          booleanx = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getBoolean("enableSwForNewReflux", false);
          i1 = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getBoolean("disableSwForFirstNewReflux", false);
          if (WaynePlayerConfigImpl.getConfigGet().getUserFeature() == KSConfigGetInterface$KSUserFeature.KSUserFeature_NewReflux && (intx > 0 && b.mPlayerId <= intx)) {
             b.mBuildData.setEnableNewRefluxOpt(1);
             if (booleanx && (!i1 || (b.mPlayerId > 1 || !i1))) {
                b.mBuildData.setMediaCodecPolicy(2);
             }
          }
       label_023c :
          b.autoStart = false;
          if (b.mBuildData.getStartPlayType() == 2) {
             if (!WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getBoolean("useNativeStartonPrepare", false)) {
                b.mBuildData.setStartPlayType(false);
             }
             b.autoStart = true;
          }
          DebugLog.i(this.getLogTag(), "autoStart: "+b.autoStart);
          if (b.autoStart != null) {
             playerStateP = b.getProcessor(playerStateP);
             if (playerStateP != null) {
                playerStateP.setStartOnPrepared$kp_mid_release(1);
             }
             if (i == 1) {
                playerLoadin = b.getProcessor(playerLoadin);
                if (playerLoadin != null) {
                   playerLoadin.notifyPlayerLoadingChanged(LoadingType.STATE_ERRORRETRYING, 1);
                }
             }
          }else {
             playerStateP = b.getProcessor(playerStateP);
             if (playerStateP != null) {
                playerStateP.setStartOnPrepared$kp_mid_release(false);
             }
             if (i == 1) {
                playerLoadin = b.getProcessor(playerLoadin);
                if (playerLoadin != null) {
                   playerLoadin.notifyPlayerLoadingChanged(LoadingType.STATE_ERRORRETRYING, false);
                }
             }
          }
       label_02b0 :
          if (this.isShortManifestSource$kp_mid_release() && i != 5) {
             RepresentationProcessor processor = b.getProcessor(RepresentationProcessor.class);
             if (processor != null) {
                processor.setUserRepresentationId();
             }
          }
          b.mKPMidTrace.addKV("autoStart", String.valueOf(b.autoStart));
          if (b.mKwaiMediaPlayer == null) {
             KwaiMediaPlayerBuilder kwaiMediaPla = new KwaiMediaPlayerBuilder(b.mBuildData);
             kwaiMediaPla.setUseKpmidPlayer(1);
             kwaiMediaPla.setIndexInfo(b.mPlayerIndexInfo);
             InnerPlayerLifeCycleListener mInnerPlayer = this.getMInnerPlayerLifeCycleListener();
             if (mInnerPlayer != null) {
                mInnerPlayer.onPlayerCreating(kwaiMediaPla.getInnerVodBuilder());
             }
             b.mKwaiMediaPlayer = kwaiMediaPla.createPlayer();
             b.mKPMidTrace.addVseKV("createKernalCost", String.valueOf((SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime())));
             this.configKwaiMediaPlayerAfterCreate();
             if (b.mCdnEventLogCallback != null) {
                this.configUnifyHodorCdnLog();
             }
          }
          DebugLog.i(this.getLogTag(), "create mediaPlayer impl "+b.mKwaiMediaPlayer);
          b.attachListeners(b.mBuildData);
          this.attachVideoOut();
          InnerPlayerLifeCycleListener mInnerPlayer1 = this.getMInnerPlayerLifeCycleListener();
          if (mInnerPlayer1 != null) {
             mInnerPlayer1.onPlayerCreated(b.mKwaiMediaPlayer, b.mBuildData.getPlayIndex(), "");
          }
          b.mStartedWhenRelease = false;
          b.mPositionWhenRelease = 0;
          b.mOuterLogTag = "kpmidid:"+b.mPlayerId+"::kernelid:"+this.getKernelPlayerId();
          b.addOnRenderingStartListener(b.mOnRenderStartListener);
          Iterator iterator = b.mProcessors.entrySet().iterator();
          while (iterator.hasNext()) {
             iterator.next().getValue().onKernelPlayerCreated();
          }
          PlayerState[] playerStateA = new PlayerState[]{PlayerState.Idle,PlayerState.Error};
          b.moveToState(CollectionsKt__CollectionsKt.L(playerStateA), PlayerState.Initialized);
          return 1;
       }
    }
    public final void detachVideoOut(){
       if (PatchProxy.applyVoid(null, this, WaynePlayer.class, "17")) {
          return;
       }
       DebugLog.i(this.getLogTag(), "[detachVideoOut] mEnableSurfaceReleaseOpt: "+this.mEnableSurfaceReleaseOpt);
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          if (this.mEnableSurfaceReleaseOpt != null) {
             tmKwaiMediaP.setSurface(null);
          }else {
             tmKwaiMediaP.setSurfaceTexture(null);
             tmKwaiMediaP.setSurface(null);
             tmKwaiMediaP.setDisplay(null);
          }
       }
       return;
    }
    public final void dispatchSurfaceChanged(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "13")) {
          return;
       }
       Iterator iterator = this.mSurfaceChangedListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onSurfaceChanged(p0);
       }
       return;
    }
    public void enableDanmakuMask(boolean p0){
       WaynePlayer waynePlayer = WaynePlayer.class;
       if (PatchProxy.isSupport(waynePlayer) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, waynePlayer, "80")) {
          return;
       }
       DanmakuProcessor processor = this.getProcessor(DanmakuProcessor.class);
       if (processor != null) {
          processor.enableDanmakuMask(p0);
       }
       return;
    }
    public final boolean getAutoStart(){
       return this.autoStart;
    }
    public String getBriefVodStatJson(){
       Object[] objArray = null;
       _0_AbstractPlayerHolder obj = PatchProxy.apply(objArray, this, WaynePlayer.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mKwaiMediaPlayer;
       if (obj != null) {
          objArray = obj.getBriefVodStatJson();
       }
       String str = (objArray != null)? this.mKPMidTrace.appendAfterJsonStr(objArray): "";
       return str;
    }
    public final WayneBuildData getBuildData(){
       return this.mBuildData;
    }
    public String getCurrentPlayUrl(){
       Object[] objArray = null;
       _0_AbstractPlayerHolder obj = PatchProxy.apply(objArray, this, WaynePlayer.class, "91");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isShortManifestSource$kp_mid_release()) {
          objArray = this.getVodAdaptiveUrl();
       }else if(this.isHlsManifestSource()){
          obj = this.mKwaiMediaPlayer;
          if (obj != null) {
             KwaiRepresentation currentRepre = obj.getCurrentRepresentation();
             if (currentRepre != null) {
                objArray = currentRepre.url;
                if (objArray == null) {
                }
             }else {
             }
          }else {
          }
       }else {
          IDatasource dataSourceMo = this.mBuildData.getDataSourceModule();
          if (dataSourceMo != null) {
             objArray = dataSourceMo.getDatasourceStrUrl();
          }
       }
       if (TextUtils.isEmpty(objArray)) {
          return "";
       }else {
          a.m(objArray);
          return objArray;
       }
    }
    public IWaynePlayer$DataSourceFrom getDataSourceFrom(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, WaynePlayer.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mKwaiMediaPlayer;
       if (obj != null) {
          String curPlayingUr = obj.getCurPlayingUrl();
          if (curPlayingUr != null) {
             if (this.mBuildData.getWayneDataSourceType() == 7) {
                return IWaynePlayer$DataSourceFrom.FromMediaDataResource;
             }else if(this.isFile(curPlayingUr)){
                return IWaynePlayer$DataSourceFrom.FromFile;
             }else if(AwesomeCache.isFullyCached(CacheKeyUtil.getCacheKey(curPlayingUr, false))){
                return IWaynePlayer$DataSourceFrom.FromCache;
             }else {
                return IWaynePlayer$DataSourceFrom.FromNet;
             }
          }
       }
       return IWaynePlayer$DataSourceFrom.FromUnknown;
    }
    public KwaiPlayerDebugInfo getDebugInfo(){
       Object[] objArray = null;
       _0_AbstractPlayerHolder obj = PatchProxy.apply(objArray, this, WaynePlayer.class, "99");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mKwaiMediaPlayer;
       if (obj != null) {
          objArray = obj.getDebugInfo();
       }
       if (objArray != null) {
          objArray.mAppVodQosDebugInfo.activeRetryCnt = this.mPlayerIndexInfo.getMActiveRetryCount();
          objArray.mAppVodQosDebugInfo.passiveRetryCnt = this.mPlayerIndexInfo.getMPassiveRetryCount();
          objArray.mAppVodQosDebugInfo.retryDetail = this.mPlayerIndexInfo.getMDebugIndexDetail();
       }
       return objArray;
    }
    public Object getExtra(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WaynePlayer.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       p0 = this.mExtras.get(p0);
       if (!p0 instanceof Object) {
          p0 = null;
       }
       return p0;
    }
    public final Handler getHandler(){
       return this.handler;
    }
    public final PlayerState getInnerState(){
       PlayerState innerState;
       PlayerStateProcessor obj = PatchProxy.apply(null, this, WaynePlayer.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getProcessor(PlayerStateProcessor.class);
       if (obj != null) {
          innerState = obj.getInnerState();
          if (innerState != null) {
          label_0023 :
             return innerState;
          }
       }
       innerState = PlayerState.Idle;
       goto label_0023 ;
    }
    public IKwaiMediaPlayer getKernelPlayer(){
       return this.mKwaiMediaPlayer;
    }
    public long getKernelPlayerId(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, WaynePlayer.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mKwaiMediaPlayer;
       long playerId = (obj != null)? obj.getPlayerId(): 0;
       return playerId;
    }
    public final String getLogTag(){
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, WaynePlayer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "WaynePlayer["+this.mPlayerId+"][";
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          objArray = Long.valueOf(tmKwaiMediaP.getPlayerId());
       }
       return obj+objArray+']';
    }
    public final InnerPlayerLifeCycleListener getMInnerPlayerLifeCycleListener(){
       return this.mBuildData.mInnerPlayerLifeCycleListener;
    }
    public final KPMidTrace getMKPMidTrace(){
       return this.mKPMidTrace;
    }
    public final DataSourceFetcher getMfetcher(){
       Object obj = PatchProxy.apply(null, this, WaynePlayer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBuildData.getFetcher();
    }
    public String getOuterLogTag(){
       return this.mOuterLogTag;
    }
    public int getPlayerId(){
       return this.mPlayerId;
    }
    public ProductContext getPlayerProductContext(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, WaynePlayer.class, "100");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mKwaiMediaPlayer;
       a.o(obj, "mKwaiMediaPlayer");
       return obj.getPlayerProductContext();
    }
    public String getPlayerTsJson(){
       Object[] objArray = null;
       _0_AbstractPlayerHolder obj = PatchProxy.apply(objArray, this, WaynePlayer.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mKwaiMediaPlayer;
       if (obj != null) {
          objArray = obj.getPlayerTsJson();
       }
       if (objArray == null) {
          objArray = "";
       }
       return objArray;
    }
    public int getPlayerType(){
       Object obj = PatchProxy.apply(null, this, WaynePlayer.class, "86");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getBuildData().mPlayerType;
    }
    public final AbsKpMidProcessor getProcessor(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WaynePlayer.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "type");
       if (this.mIsRelease != null) {
          return null;
       }
       return this.mProcessors.get(p0);
    }
    public List getQualityList(){
       return this.mQualityList;
    }
    public int getRealRepresentationId(){
       RepresentationProcessor obj = PatchProxy.apply(null, this, WaynePlayer.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getProcessor(RepresentationProcessor.class);
       int realRepresen = (obj != null)? obj.getRealRepresentationId(): -1;
       return realRepresen;
    }
    public final String getReleaseTypeByReason(int p0){
       String str = "Rep";
       switch (p0){
           case 1:
             str = "Error";
             break;
           case 2:
             str = "SetDataSource";
             break;
           case 3:
           case 4:
           case 5:
             str = "ReStart";
             break;
           case 6:
             str = "BizRsKernel";
             break;
           default:
             str = "UnKnow";
       }
       return str;
    }
    public Integer getRepIdFromQualityType(String p0){
       RepresentationProcessor obj = PatchProxy.applyOneRefs(p0, this, WaynePlayer.class, "89");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getProcessor(RepresentationProcessor.class);
       Integer integer = (obj != null)? Integer.valueOf(obj.getRepIdFromQualityType(p0)): null;
       return integer;
    }
    public int getRetryCount(){
       ErrorRetryProcessor obj = PatchProxy.apply(null, this, WaynePlayer.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getProcessor(ErrorRetryProcessor.class);
       int retryCount = (obj != null)? obj.getRetryCount(): 0;
       return retryCount;
    }
    public String getRetryDebugInfo(){
       String retryDebugIn;
       ErrorRetryProcessor obj = PatchProxy.apply(null, this, WaynePlayer.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getProcessor(ErrorRetryProcessor.class);
       if (obj != null) {
          retryDebugIn = obj.getRetryDebugInfo();
          if (retryDebugIn != null) {
          label_0023 :
             return retryDebugIn;
          }
       }
       retryDebugIn = "";
       goto label_0023 ;
    }
    public PlayerState getState(){
       PlayerState state;
       PlayerStateProcessor obj = PatchProxy.apply(null, this, WaynePlayer.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getProcessor(PlayerStateProcessor.class);
       if (obj != null) {
          state = obj.getState();
          if (state != null) {
          label_0023 :
             return state;
          }
       }
       state = PlayerState.Idle;
       goto label_0023 ;
    }
    public int getUserRepresentationId(){
       RepresentationProcessor obj = PatchProxy.apply(null, this, WaynePlayer.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getProcessor(RepresentationProcessor.class);
       int userRepresen = (obj != null)? obj.getUserRepresentationId(): -1;
       return userRepresen;
    }
    public String getVodStatJson(){
       Object[] objArray = null;
       _0_AbstractPlayerHolder obj = PatchProxy.apply(objArray, this, WaynePlayer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mKwaiMediaPlayer;
       if (obj != null) {
          objArray = obj.getVodStatJson();
       }
       String str = (objArray != null)? this.mKPMidTrace.appendAfterJsonStr(objArray): "";
       return str;
    }
    public WayneBuildData getWaynePlayerBuildData(){
       return this.mBuildData;
    }
    public boolean isActualPlaying(){
       PlayerLoadingProcessor obj = PatchProxy.apply(null, this, WaynePlayer.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getProcessor(PlayerLoadingProcessor.class);
       boolean b = true;
       if (obj == null || obj.isActualPlaying() != b) {
          b = false;
       }
       return b;
    }
    public boolean isAudioRenderingStart(){
       PlayerLoadingProcessor obj = PatchProxy.apply(null, this, WaynePlayer.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.mKwaiMediaPlayer != null) {
          obj = this.getProcessor(PlayerLoadingProcessor.class);
          if (obj != null && obj.isAudioRenderStart() == b) {
          label_002b :
             return b;
          }
       }
       b = false;
       goto label_002b ;
    }
    public boolean isBuffering(){
       Object obj = PatchProxy.apply(null, this, WaynePlayer.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.isLoading();
    }
    public final boolean isCancelDataSource$kp_mid_release(){
       return this.isCancelDataSource;
    }
    public final boolean isFile(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WaynePlayer.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          Uri uri = Uri.parse(p0);
          a.o(uri, "uri");
          if (TextUtils.equals(uri.getScheme(), "file")) {
             return true;
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public boolean isHlsManifestSource(){
       boolean b;
       IDatasource obj = PatchProxy.apply(null, this, WaynePlayer.class, "94");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mBuildData.getDataSourceModule();
       if (obj != null && obj.getWayneDataSourceType() == 6) {
          obj = this.mBuildData.getDataSourceModule();
          if (obj != null && obj.getKpmidMediaType() == 2) {
          label_0042 :
             b = true;
          label_0045 :
             return b;
          }
       }
       obj = this.mBuildData.getDataSourceModule();
       if (obj != null && obj.getWayneDataSourceType() == 8) {
          goto label_0042 ;
       }else {
          b = false;
          goto label_0045 ;
       }
    }
    public boolean isLoading(){
       PlayerLoadingProcessor obj = PatchProxy.apply(null, this, WaynePlayer.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getProcessor(PlayerLoadingProcessor.class);
       boolean b = true;
       if (obj == null || obj.isLoading() != b) {
          b = false;
       }
       return b;
    }
    public boolean isLooping(){
       boolean b;
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, WaynePlayer.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mKwaiMediaPlayer;
       if (obj != null) {
          a.o(obj, "mKwaiMediaPlayer");
          if (obj.isLooping()) {
             b = true;
          label_0026 :
             return b;
          }
       }
       b = false;
       goto label_0026 ;
    }
    public final boolean isManifestSource$kp_mid_release(){
       Object obj = PatchProxy.apply(null, this, WaynePlayer.class, "92");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mBuildData.isManifestV2();
    }
    public boolean isNativeBuffering(){
       PlayerLoadingProcessor obj = PatchProxy.apply(null, this, WaynePlayer.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.mKwaiMediaPlayer != null) {
          obj = this.getProcessor(PlayerLoadingProcessor.class);
          if (obj != null && obj.isBuffering() == b) {
          label_002b :
             return b;
          }
       }
       b = false;
       goto label_002b ;
    }
    public boolean isPaused(){
       Object obj = PatchProxy.apply(null, this, WaynePlayer.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getState() == PlayerState.Paused)? true: false;
       return b;
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, WaynePlayer.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getState() == PlayerState.Playing)? true: false;
       return b;
    }
    public boolean isPrepared(){
       PlayerState obj = PatchProxy.apply(null, this, WaynePlayer.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getState();
       if (obj != PlayerState.Prepared && (obj != PlayerState.Playing && (obj == PlayerState.Paused || obj == PlayerState.Completion))) {
          return true;
       }
       return false;
    }
    public boolean isRetrying(){
       ErrorRetryProcessor obj = PatchProxy.apply(null, this, WaynePlayer.class, "90");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getProcessor(ErrorRetryProcessor.class);
       boolean b = true;
       if (obj == null || obj.isRetrying() != b) {
          b = false;
       }
       return b;
    }
    public final boolean isShortManifestSource$kp_mid_release(){
       IDatasource obj = PatchProxy.apply(null, this, WaynePlayer.class, "93");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mBuildData.getDataSourceModule();
       boolean b = true;
       if (obj != null && obj.getWayneDataSourceType() == 6) {
          obj = this.mBuildData.getDataSourceModule();
          if (obj != null && obj.getKpmidMediaType() == b) {
          label_0034 :
             return b;
          }
       }
       b = false;
       goto label_0034 ;
    }
    public boolean isSupportRepresentation(){
       RepresentationProcessor obj = PatchProxy.apply(null, this, WaynePlayer.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getProcessor(RepresentationProcessor.class);
       boolean b = (obj != null)? obj.isSupportRepresentation(): false;
       return b;
    }
    public boolean isVideoRenderingStart(){
       PlayerLoadingProcessor obj = PatchProxy.apply(null, this, WaynePlayer.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.mKwaiMediaPlayer != null) {
          obj = this.getProcessor(PlayerLoadingProcessor.class);
          if (obj != null && obj.isVideoRenderStart() == b) {
          label_002b :
             return b;
          }
       }
       b = false;
       goto label_002b ;
    }
    public final void moveToState(List p0,PlayerState p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WaynePlayer.class, "25")) {
          return;
       }
       DebugLog.i(this.getLogTag(), "moveToState : "+p1);
       PlayerState innerState = this.getInnerState();
       int i = 1;
       if ((p0.isEmpty() ^ i) && !p0.contains(innerState)) {
          DebugLog.e(this.getLogTag(), "state move to "+p1+", but current state:"+innerState+" illegal!!!");
          return;
       }else if(innerState == PlayerState.Preparing){
          if (p1 == PlayerState.Playing) {
             DebugLog.i(this.getLogTag(), "current state is preparing . moveTo started ,do not notify stateChanged");
          }else if(p1 == PlayerState.Paused){
             DebugLog.i(this.getLogTag(), "current state is preparing . moveTo paused ,do not notify stateChanged");
          }
       }else {
          PlayerStateProcessor processor1 = this.getProcessor(PlayerStateProcessor.class);
          if (processor1 != null) {
             processor1.notifyStateChanged$kp_mid_release(p1, false);
          }
       }
       int i1 = WaynePlayer$WhenMappings.$EnumSwitchMapping$0[p1.ordinal()];
       if (i1 != i) {
          if (i1 != 2) {
             if (i1 != 3) {
                if (i1 == 4) {
                   super.prepareAsync();
                   PlayerLoadingProcessor processor = this.getProcessor(PlayerLoadingProcessor.class);
                   if (processor != null) {
                      processor.prepareStart();
                   }
                }
             }else {
                super.pause();
             }
          }else {
             super.stop();
          }
       }else {
          super.start();
          if (this.mPlayerInstanceManagerEnable != null) {
             KwaiMediaPlayerInstanceManager.INSTANCE.updateInstancePriority(this.hashCode(), InstancePriority.PriorityFocus);
          }
       }
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, WaynePlayer.class, "24")) {
          return;
       }
       DebugLog.i(this.getLogTag(), "pause");
       this.mKPMidTrace.addStamp("pause");
       PlayerState[] playerStateA = new PlayerState[]{PlayerState.Playing,PlayerState.Prepared,PlayerState.Preparing};
       this.moveToState(CollectionsKt__CollectionsKt.L(playerStateA), PlayerState.Paused);
       return;
    }
    public void play(){
       PlayerStateProcessor playerStateP = PlayerStateProcessor.class;
       if (PatchProxy.applyVoid(null, this, WaynePlayer.class, "76")) {
          return;
       }
       DebugLog.i(this.getLogTag(), "play");
       if (this.getState() != PlayerState.Paused && (this.getState() == PlayerState.Prepared || this.getState() == PlayerState.Completion)) {
          this.start();
       }else if(this.getState() == PlayerState.Preparing){
          playerStateP = this.getProcessor(playerStateP);
          if (playerStateP != null) {
             playerStateP.setStartOnPrepared$kp_mid_release(true);
          }
       }else {
          playerStateP = this.getProcessor(playerStateP);
          if (playerStateP != null) {
             playerStateP.setStartOnPrepared$kp_mid_release(true);
          }
          this.prepareAsync();
       }
       return;
    }
    public void prepareAsync(){
       if (PatchProxy.applyVoid(null, this, WaynePlayer.class, "19")) {
          return;
       }
       String str = 2;
       if (this.mBuildData.getStartPlayType() == str && this.mStForStartCall <= 0) {
          this.mStForStartCall = SystemClock.elapsedRealtime();
       }
       if (WaynePlayerInitor.isApkInDebug() && (WaynePlayerInitor$APP.KWAISHOU != WayneContext.app || (TextUtils.isEmpty(this.mBuildData.mBizFt) ^ 1))) {
          String str1 = "prepareAsync";
          DebugLog.i(this.getLogTag(), str1);
          if (this.mBuildData.getProvider().shouldFetchBeforePlay() && this.getMfetcher() != null) {
             this.shouldPrepareAfterInitFetchSource = true;
             DebugLog.i(this.getLogTag(), "initFetchSourceIng... Will prepareAsync when initFetchSource success back");
             PlayerLoadingProcessor processor = this.getProcessor(PlayerLoadingProcessor.class);
             if (processor != null) {
                processor.notifyPlayerLoadingChanged(LoadingType.STATE_INITFETCHSOURCE, 1);
             }
             return;
          }else if(!this.mBuildData.isPlayable()){
             RetryInfo retryInfo = new RetryInfo();
             retryInfo.setWhat(1001);
             retryInfo.setError(new DatasourceInvalidError());
             this.notifyWaynePlayerError(retryInfo);
             DebugLog.e(this.getLogTag(), "data source invalid, do nothing!!!");
             return;
          }else {
             this.mKPMidTrace.addStamp(str1);
             KSVodPlayHistoryManager instance = KSVodPlayHistoryManager.getInstance();
             a.o(instance, "KSVodPlayHistoryManager.getInstance\(\)");
             if (instance.getLaunchPlayCount().get() == 1) {
                LaunchReport.logVpLaunchPlay(true, System.currentTimeMillis(), -1, null, this.mBuildData.mVideoContext);
             }
             WaynePlayer tmCdnEventLo = this.mCdnEventLogCallback;
             if (tmCdnEventLo != null && this.mBuildData != null) {
                a.m(tmCdnEventLo);
                tmCdnEventLo.setBizFt(this.mBuildData.mBizFt);
                tmCdnEventLo = this.mCdnEventLogCallback;
                a.m(tmCdnEventLo);
                tmCdnEventLo.setBizExtra(this.mBuildData.mBizExtra);
             }
             PlayerState[] playerStateA = new PlayerState[str];
             playerStateA[0] = PlayerState.Initialized;
             playerStateA[1] = PlayerState.Error;
             this.moveToState(CollectionsKt__CollectionsKt.L(playerStateA), PlayerState.Preparing);
             return;
          }
       }else {
          throw new IllegalArgumentException("must set bizft BuildConfig.PROJECT_NAME¡£@wanghongbo03".toString());
       }
    }
    public void putExtra(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WaynePlayer.class, "71")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       this.mExtras.put(p0, p1);
       return;
    }
    public void registerPlayerStateChangedListener(OnPlayerStateChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "43")) {
          return;
       }
       a.p(p0, "listener");
       PlayerStateProcessor processor = this.getProcessor(PlayerStateProcessor.class);
       if (processor != null) {
          processor.registerPlayerStateChangedListener(p0);
       }
       return;
    }
    public void releaseAsync(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, WaynePlayer.class, "30")) {
          return;
       }
       this.mKPMidTrace.addStamp("releaseAsyncStart");
       boolean b = true;
       this.mIsActiveRelease = b;
       this.cancelFetchDataSource();
       this.mKPMidTrace.addStamp("detachVideoOutStart");
       this.detachVideoOut();
       this.mKPMidTrace.addStamp("detachVideoOutEnd");
       this.releaseInternal("Release");
       this.handler.removeCallbacksAndMessages(objArray);
       if (WaynePlayerInitor.isApkInDebug()) {
          WayneDebug.Companion.getInstance().unregisterCmdExecutor(this.mCmdExecutor);
       }
       this.mIsRelease = b;
       if (this.mPlayerInstanceManagerEnable != null) {
          KwaiMediaPlayerInstanceManager.INSTANCE.removeMediaPlayerInstance(this.hashCode());
       }
       Iterator iterator = this.mProcessors.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().detach();
       }
       this.clearListeners();
       this.mKPMidTrace.addStamp("releaseAsyncEnd");
       return;
    }
    public final void releaseInternal(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "29")) {
          return;
       }
       DebugLog.i(this.getLogTag(), "releaseInternal ");
       this.mKPMidTrace.addStamp("release");
       ErrorRetryProcessor processor = this.getProcessor(ErrorRetryProcessor.class);
       StringBuilder errorCode = (processor != null)? processor.getErrorCode(): null;
       String str = String.valueOf(errorCode);
       errorCode = (str.length() > 0)? 1: null;
       if (errorCode) {
          DebugLog.i(this.getLogTag(), "releaseInternal by error "+str);
          p0 = "Error";
       }
       this.mPlayerIndexInfo.addReleasePlayer(this.mBuildData.getPlayIndex(), this.getKernelPlayerId(), p0, str);
       this.mKPMidTrace.addVseKV("wayne_id", String.valueOf(this.mPlayerId));
       this.mKPMidTrace.addVseKV("play_index", String.valueOf(this.mBuildData.getPlayIndex()));
       this.mKPMidTrace.addVseKV("retry_cnt", String.valueOf(this.mPlayerIndexInfo.getMRetryCount()));
       this.mKPMidTrace.addVseKV("active_retry_cnt", String.valueOf(this.mPlayerIndexInfo.getMActiveRetryCount()));
       this.mKPMidTrace.addVseKV("inactive_retry_cnt", String.valueOf(this.mPlayerIndexInfo.getMPassiveRetryCount()));
       this.mKPMidTrace.addVseKV("destroy_detail", this.mPlayerIndexInfo.getMDestroyIndexDetail());
       WaynePlayer tmKPMidTrace = this.mKPMidTrace;
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       Map extraQosInfo = (tmKwaiMediaP != null)? tmKwaiMediaP.getExtraQosInfo(): null;
       tmKPMidTrace.addVseKV(extraQosInfo);
       DebugLog.i(this.getLogTag(), "releaseInternal debugDetail "+this.mPlayerIndexInfo.getMDebugIndexDetail());
       this.mKPMidTrace.addStamp("playerStateChangeStart");
       this.moveToState(CollectionsKt__CollectionsKt.E(), PlayerState.Released);
       this.mKPMidTrace.addStamp("playerStateChangeEnd");
       if (this.mKwaiMediaPlayer == null) {
          this.mOnPlayerReleaseListener.onRelease(null);
       }else if(WayneContext.app == WaynePlayerInitor$APP.KWAISHOU){
          KSConfigGetInterface configGet = WaynePlayerConfigImpl.getConfigGet();
          a.o(configGet, "WaynePlayerConfigImpl\n  ¡­          .getConfigGet\(\)");
          if (!configGet.getSwitchProvider().getBoolean("qosByActiveRead", false)) {
             this.mKwaiMediaPlayer.releaseAsync(this.mOnPlayerReleaseListener);
          }
       }
       KwaiPlayerResultQos kwaiPlayerRe = new KwaiPlayerResultQos();
       tmKwaiMediaP = this.mKwaiMediaPlayer;
       a.o(tmKwaiMediaP, "mKwaiMediaPlayer");
       kwaiPlayerRe.videoAvgFps = tmKwaiMediaP.getVideoAvgFps();
       tmKwaiMediaP = this.mKwaiMediaPlayer;
       a.o(tmKwaiMediaP, "mKwaiMediaPlayer");
       kwaiPlayerRe.briefVideoStatJson = tmKwaiMediaP.getBriefVodStatJson();
       tmKwaiMediaP = this.mKwaiMediaPlayer;
       a.o(tmKwaiMediaP, "mKwaiMediaPlayer");
       kwaiPlayerRe.videoStatJson = tmKwaiMediaP.getVodStatJson();
       this.mOnPlayerReleaseListener.onRelease(kwaiPlayerRe);
       this.mKwaiMediaPlayer.releaseAsync(null);
       this.mKwaiMediaPlayer = null;
       Iterator iterator = this.mProcessors.entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().onKernelPlayerDestroy();
       }
       return;
    }
    public void releaseKernel(){
       if (PatchProxy.applyVoid(null, this, WaynePlayer.class, "96")) {
          return;
       }
       if (this.mPlayerInstanceHandler.hasInstance()) {
          this.mPlayerInstanceHandler.onRelease();
       }
       return;
    }
    public void removeDataReporter(DataReporter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "57")) {
          return;
       }
       a.p(p0, "reporter");
       this.mQosDataReporters.remove(p0);
       return;
    }
    public Object removeExtra(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WaynePlayer.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       p0 = this.mExtras.get(p0);
       if (!p0 instanceof Object) {
          p0 = null;
       }
       return p0;
    }
    public void removeOnPlayerActualPlayingChangedListener(OnPlayerActualPlayingChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "47")) {
          return;
       }
       a.p(p0, "listener");
       PlayerLoadingProcessor processor = this.getProcessor(PlayerLoadingProcessor.class);
       if (processor != null) {
          processor.removeOnPlayerActualPlayingChangedListener(p0);
       }
       return;
    }
    public void removeOnPlayerLoadingChangedListener(OnPlayerLoadingChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "55")) {
          return;
       }
       a.p(p0, "listener");
       PlayerLoadingProcessor processor = this.getProcessor(PlayerLoadingProcessor.class);
       if (processor != null) {
          processor.removeOnPlayerLoadingChangedListener(p0);
       }
       return;
    }
    public void removeOnPlayerVodBuildDataChangedListener(OnBuildDataChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "53")) {
          return;
       }
       a.p(p0, "listener");
       this.mOnBuildDataChangedListeners.remove(p0);
       return;
    }
    public void removeOnQualityChangedListener(OnQualityChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "64")) {
          return;
       }
       a.p(p0, "listener");
       RepresentationProcessor processor = this.getProcessor(RepresentationProcessor.class);
       if (processor != null) {
          processor.removeOnQualityChangedListener(p0);
       }
       return;
    }
    public void removeOnSurfaceChangedListener(OnSurfaceChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "75")) {
          return;
       }
       a.p(p0, "listener");
       this.mSurfaceChangedListeners.remove(p0);
       return;
    }
    public void removeVseDataReporter(DataReporter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "59")) {
          return;
       }
       a.p(p0, "reporter");
       this.mVseDataReporters.remove(p0);
       return;
    }
    public void resetDanmakuMask(){
       if (PatchProxy.applyVoid(null, this, WaynePlayer.class, "82")) {
          return;
       }
       DanmakuProcessor processor = this.getProcessor(DanmakuProcessor.class);
       if (processor != null) {
          processor.resetDanmakuMask();
       }
       return;
    }
    public final void resetPlayer(int p0){
       WaynePlayer waynePlayer = WaynePlayer.class;
       if (PatchProxy.isSupport(waynePlayer) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, waynePlayer, "15")) {
          return;
       }
       DebugLog.i(this.getLogTag(), "resetPlayer");
       if (this.checkHasReleased()) {
          DebugLog.e(this.getLogTag(), "player has released return");
       }
       PlayerLogReportProcessor processor = this.getProcessor(PlayerLogReportProcessor.class);
       if (processor != null) {
          processor.inflateRetryPlayerStats(this.mKwaiMediaPlayer, p0);
       }
       if (this.mKwaiMediaPlayer != null) {
          this.detachVideoOut();
          this.dettachListeners();
          this.releaseInternal(this.getReleaseTypeByReason(p0));
          this.mKwaiMediaPlayer = null;
          InnerPlayerLifeCycleListener mInnerPlayer = this.getMInnerPlayerLifeCycleListener();
          if (mInnerPlayer != null) {
             mInnerPlayer.onPlayerReleased();
          }
       }
       PlayerStateProcessor processor1 = this.getProcessor(PlayerStateProcessor.class);
       if (processor1 != null) {
          processor1.notifyStateChanged$kp_mid_release(PlayerState.Idle, true);
       }
       return;
    }
    public void restart(long p0){
       WaynePlayer waynePlayer = WaynePlayer.class;
       if (PatchProxy.isSupport(waynePlayer) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, waynePlayer, "60")) {
          return;
       }
       PlayerState state = this.getState();
       if (state != PlayerState.Stopped && state != PlayerState.Completion) {
          DebugLog.i(this.getLogTag(), "want to restart player, but current state is illegal!!!");
          return;
       }else {
          this.resetPlayer(5);
          this.mBuildData.setStartPosition(p0);
          this.mBuildData.setStartPlayType(2);
          this.createPlayer(4);
          this.prepareAsync();
          return;
       }
    }
    public void restoreKernel(){
       if (PatchProxy.applyVoid(null, this, WaynePlayer.class, "97")) {
          return;
       }
       if (!this.mPlayerInstanceHandler.hasInstance()) {
          this.mPlayerInstanceHandler.onRestore();
       }
       return;
    }
    public void retryPlayback(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "95")) {
          return;
       }
       a.p(p0, "reason");
       ErrorRetryProcessor processor = this.getProcessor(ErrorRetryProcessor.class);
       if (processor != null) {
          processor.retryPlaybackExternal(-1);
       }
       return;
    }
    public void seekTo(long p0){
       ErrorRetryProcessor uErrorRetryP = ErrorRetryProcessor.class;
       WaynePlayer waynePlayer = WaynePlayer.class;
       if (PatchProxy.isSupport(waynePlayer) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, waynePlayer, "4")) {
          return;
       }
       PlayerState innerState = this.getInnerState();
       WaynePlayer waynePlayer1 = null;
       if (p0 - waynePlayer1 < 0) {
          DebugLog.e(this.getLogTag(), "smsec: "+p0+", reset to 0");
          p0 = waynePlayer1;
       }
       if (this.mEnableSeekOnError != null && innerState == PlayerState.Error) {
          DebugLog.i(this.getLogTag(), "seek on error, seek to: "+p0);
          uErrorRetryP = this.getProcessor(uErrorRetryP);
          if (uErrorRetryP != null) {
             uErrorRetryP.retryPlaybackExternal(p0);
          }
       }else if(this.mEnableSeekOnBuffering != null && this.isBuffering()){
          DebugLog.i(this.getLogTag(), "seek on buffering, seek to: "+p0);
          uErrorRetryP = this.getProcessor(uErrorRetryP);
          if (uErrorRetryP != null) {
             uErrorRetryP.retryPlaybackExternal(p0);
          }
       }else if(innerState != PlayerState.Idle && (innerState != PlayerState.Error && (innerState == PlayerState.Released || innerState == PlayerState.Stopped))){
          DebugLog.e(this.getLogTag(), "seek Illegal when current state is "+innerState);
       }else {
          DebugLog.i(this.getLogTag(), "seek to "+p0);
          super.seekTo(p0);
       }
       return;
    }
    public final void setAutoStart(boolean p0){
       this.autoStart = p0;
    }
    public void setCacheSessionListener(CacheListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "101")) {
          return;
       }
       AwesomeCacheProcessor processor = this.getProcessor(AwesomeCacheProcessor.class);
       if (processor != null) {
          processor.setCacheSessionListener(p0);
       }
       return;
    }
    public final void setCancelDataSource$kp_mid_release(boolean p0){
       this.isCancelDataSource = p0;
    }
    public void setCdnEventLogCallBack(CdnEventLogCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "102")) {
          return;
       }
       super.setCdnEventLogCallBack(p0);
       this.mCdnEventLogCallback = p0;
       this.configUnifyHodorCdnLog();
       return;
    }
    public void setDisplay(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "12")) {
          return;
       }
       if (p0 != null) {
          DebugLog.i(this.getLogTag(), "setDisplay");
          this.mKPMidTrace.addStamp("attachVideoOut");
       }
       WaynePlayer tmSurfaceHol = this.mSurfaceHolder;
       this.mSurfaceHolder = p0;
       this.attachVideoOut();
       if (a.g(tmSurfaceHol, this.mSurfaceHolder) ^ 0x01) {
          this.dispatchSurfaceChanged(this.getSurface());
       }
       return;
    }
    public void setFetcher(DataSourceFetcher p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "48")) {
          return;
       }
       DebugLog.i(this.getLogTag(), "setFetcher "+p0);
       ErrorRetryProcessor processor = this.getProcessor(ErrorRetryProcessor.class);
       if (processor != null) {
          processor.setDatasourceFetcher(p0);
       }
       return;
    }
    public boolean setMaskVttUrl(String p0){
       DanmakuProcessor obj = PatchProxy.applyOneRefs(p0, this, WaynePlayer.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getProcessor(DanmakuProcessor.class);
       boolean b = true;
       if (obj == null || obj.setMaskVttUrl(p0) != b) {
          b = false;
       }
       return b;
    }
    public void setOnErrorRetryListener(OnErrorRetryListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "104")) {
          return;
       }
       IWaynePlayer$DefaultImpls.setOnErrorRetryListener(this, p0);
       return;
    }
    public final void setQualityList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "72")) {
          return;
       }
       a.p(p0, "reps");
       this.mQualityList = p0;
       return;
    }
    public void setRepresentation(int p0){
       WaynePlayer waynePlayer = WaynePlayer.class;
       if (PatchProxy.isSupport(waynePlayer) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, waynePlayer, "61")) {
          return;
       }
       RepresentationProcessor processor = this.getProcessor(RepresentationProcessor.class);
       if (processor != null) {
          processor.setRepresentation(p0);
       }
       return;
    }
    public void setRepresentation(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "62")) {
          return;
       }
       a.p(p0, "qualityType");
       RepresentationProcessor processor = this.getProcessor(RepresentationProcessor.class);
       if (processor != null) {
          processor.setRepresentation(p0);
       }
       return;
    }
    public void setSpeed(float p0){
       WaynePlayer waynePlayer = WaynePlayer.class;
       if (PatchProxy.isSupport(waynePlayer) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, waynePlayer, "22")) {
          return;
       }
       super.setSpeed(p0);
       this.getBuildData().setPlaySpeed(p0);
       return;
    }
    public void setSubtitleSelected(int p0,boolean p1){
       WaynePlayer waynePlayer = WaynePlayer.class;
       if (PatchProxy.isSupport(waynePlayer) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, waynePlayer, "78")) {
          return;
       }
       SubtitleProcessor processor = this.getProcessor(SubtitleProcessor.class);
       if (processor != null) {
          processor.setSubtitleSelected(p0, p1);
       }
       return;
    }
    public void setSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "10")) {
          return;
       }
       if (p0 != null) {
          DebugLog.i(this.getLogTag(), "setSurface");
          this.mKPMidTrace.addStamp("attachVideoOut");
       }
       WaynePlayer tmSurface = this.mSurface;
       this.mSurface = p0;
       this.attachVideoOut();
       if (a.g(tmSurface, this.mSurface) ^ 0x01) {
          this.dispatchSurfaceChanged(p0);
       }
       return;
    }
    public void setSurfaceTexture(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "11")) {
          return;
       }
       if (p0 != null) {
          DebugLog.i(this.getLogTag(), "setSurfaceTexture");
          this.mKPMidTrace.addStamp("attachVideoOut");
       }
       WaynePlayer tmSurfaceTex = this.mSurfaceTexture;
       this.mSurfaceTexture = p0;
       this.attachVideoOut();
       if (a.g(tmSurfaceTex, this.mSurfaceTexture) ^ 0x01) {
          this.dispatchSurfaceChanged(this.getSurface());
       }
       return;
    }
    public void setViewSize(int p0,int p1){
       WaynePlayer waynePlayer = WaynePlayer.class;
       if (PatchProxy.isSupport(waynePlayer) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, waynePlayer, "21")) {
          return;
       }
       super.setViewSize(p0, p1);
       this.getBuildData().setViewSize(p0, p1);
       return;
    }
    public void setVodDebugView(IDebugView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "88")) {
          return;
       }
       DebugViewProcessor processor = this.getProcessor(DebugViewProcessor.class);
       if (processor != null) {
          processor.setVodDebugView(p0);
       }
       return;
    }
    public void setVodSubtitleListener(IVodSubtitleListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "79")) {
          return;
       }
       SubtitleProcessor processor = this.getProcessor(SubtitleProcessor.class);
       if (processor != null) {
          processor.setVodSubtitleListener(p0);
       }
       return;
    }
    public void setVolume(float p0,float p1){
       WaynePlayer waynePlayer = WaynePlayer.class;
       if (PatchProxy.isSupport(waynePlayer) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, waynePlayer, "23")) {
          return;
       }
       super.setVolume(p0, p1);
       this.getBuildData().setVolume(Float.valueOf(p0), Float.valueOf(p1));
       return;
    }
    public void setWayneBuildData(WayneBuildData p0,String p1){
       ErrorRetryProcessor uErrorRetryP = ErrorRetryProcessor.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WaynePlayer.class, "51")) {
          return;
       }
       a.p(p0, "buildDataWayne");
       a.p(p1, "reason");
       DebugLog.i(this.getLogTag(), "set_player_vod_build_data.buildData:"+p0);
       int i = 2;
       this.resetPlayer(i);
       WaynePlayer tmBuildData = this.mBuildData;
       this.mBuildData = p0;
       ErrorRetryProcessor processor = this.getProcessor(uErrorRetryP);
       if (processor != null) {
          processor.resetErrorRetry();
       }
       uErrorRetryP = this.getProcessor(uErrorRetryP);
       if (uErrorRetryP != null) {
          uErrorRetryP.setRetryStrategy(new RetryStrategy(p0.getSwitchStrategy(), i));
       }
       this.setFetcher(p0.getFetcher());
       this.createPlayer(i);
       Iterator iterator = this.mOnBuildDataChangedListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onChanged(tmBuildData, p0);
       }
       return;
    }
    public void start(){
       PlayerState[] playerStateA;
       if (PatchProxy.applyVoid(null, this, WaynePlayer.class, "20")) {
          return;
       }
       String str = "start";
       DebugLog.i(this.getLogTag(), str);
       String str1 = 2;
       if (this.mBuildData.getStartPlayType() != str1 && this.mStForStartCall - null <= 0) {
          this.mStForStartCall = SystemClock.elapsedRealtime();
       }
       this.mKPMidTrace.addStamp(str);
       boolean b = true;
       if (this.mKwaiMediaPlayer == null) {
          DebugLog.i(this.getLogTag(), "do not has kernel player, create it first");
          this.mStartedWhenRelease = b;
          if (this.mPlayerInstanceManagerEnable != null) {
             KwaiMediaPlayerInstanceManager.INSTANCE.updateInstancePriority(this.hashCode(), InstancePriority.PriorityFocus);
          }
          return;
       }else {
          int i = 0;
          int i1 = 3;
          if (WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getBoolean("openKpmidQuickStart", b)) {
             playerStateA = new PlayerState[]{PlayerState.Prepared,PlayerState.Paused,PlayerState.Completion,PlayerState.Preparing};
             this.moveToState(CollectionsKt__CollectionsKt.L(playerStateA), PlayerState.Playing);
          }else {
             playerStateA = new PlayerState[i1];
             playerStateA[i] = PlayerState.Prepared;
             playerStateA[b] = PlayerState.Paused;
             playerStateA[str1] = PlayerState.Completion;
             this.moveToState(CollectionsKt__CollectionsKt.L(playerStateA), PlayerState.Playing);
          }
          return;
       }
    }
    public void stop(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, WaynePlayer.class, "26")) {
          return;
       }
       DebugLog.i(this.getLogTag(), "stop ");
       this.mKPMidTrace.addStamp("stop");
       this.mBuildData.setStartPosition(this.getCurrentPosition());
       this.cancelFetchDataSource();
       if (Math.abs((this.getCurrentPosition() - this.getDuration())) - (long)100 > 0) {
          KSVodPlayHistoryManager instance = KSVodPlayHistoryManager.getInstance();
          IDatasource dataSourceMo = this.mBuildData.getDataSourceModule();
          if (dataSourceMo != null) {
             objArray = dataSourceMo.getResourceKey();
          }
          instance.updatePlayPositionWithKey(objArray, this.getCurrentPosition());
       }
       this.moveToState(CollectionsKt__CollectionsKt.E(), PlayerState.Stopped);
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, WaynePlayer.class, "98");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mOuterLogTag+'@'+super.toString();
    }
    public void unregisterPlayerStateChangedListener(OnPlayerStateChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "44")) {
          return;
       }
       a.p(p0, "listener");
       PlayerStateProcessor processor = this.getProcessor(PlayerStateProcessor.class);
       if (processor != null) {
          processor.unregisterPlayerStateChangedListener(p0);
       }
       return;
    }
    public void updateDanmakuRect(RectF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "84")) {
          return;
       }
       DanmakuProcessor processor = this.getProcessor(DanmakuProcessor.class);
       if (processor != null) {
          processor.updateDanmakuRect(p0);
       }
       return;
    }
    public final void updateDataSourceForKernelPlayer(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "14")) {
          return;
       }
       DebugLog.i(this.getLogTag(), "updateDataSourceForKernelPlayer : "+p0);
       this.mKPMidTrace.addStamp("updateDataSourceForKernelPlayer");
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.updateKwaiManfiest(p0);
       }
       return;
    }
    public void updateRenderType(KSRenderType p0,KSRenderType p1,float p2){
       if (PatchProxy.isSupport(WaynePlayer.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, WaynePlayer.class, "81")) {
          return;
       }
       DanmakuProcessor processor = this.getProcessor(DanmakuProcessor.class);
       if (processor != null) {
          processor.updateRenderType(p0, p1, p2);
       }
       return;
    }
    public void updateVideoContext(WayneVideoContext p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "87")) {
          return;
       }
       PlayerLogReportProcessor processor = this.getProcessor(PlayerLogReportProcessor.class);
       if (processor != null) {
          processor.updateVideoContext(p0);
       }
       return;
    }
    public void updateVideoRect(RectF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer.class, "83")) {
          return;
       }
       DanmakuProcessor processor = this.getProcessor(DanmakuProcessor.class);
       if (processor != null) {
          processor.updateVideoRect(p0);
       }
       return;
    }
}
