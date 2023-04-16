package com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.video.waynelive.datasource.ILiveDatasource;
import com.kwai.video.waynelive.LivePlayerParam;
import com.kwai.video.waynelive.LivePlayUrlInfo;
import android.util.SparseIntArray;
import androidx.collection.ArraySet;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$PreparedListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$1;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$CompletionListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$InfoListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$LiveEventListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$VideoSizeChangedListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$LiveInterActiveListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$SurfaceTextureListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$SurfaceViewShowListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$UrlSwitchListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$QosListener;
import com.kwai.video.waynelive.mediaplayer.LivePlayerRuntimeParams;
import java.util.UUID;
import java.lang.String;
import mw7.g;
import com.kwai.video.waynelive.wayneplayer.WayneTrace;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$3;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.view.View;
import com.kwai.video.waynelive.listeners.LivePlayerErrorListener;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.wayneplayer.ErrorRetryProcessor;
import com.kwai.video.waynelive.listeners.LivePlayerRenderAfterBufferStartListener;
import java.util.List;
import com.kwai.video.waynelive.quality.LiveQualityChangeListener;
import com.kwai.video.waynelive.wayneplayer.RepresentationProcessor;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.wayneplayer.PlayerStateProcessor;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView$b;
import com.kwai.video.player.IKwaiMediaPlayer;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;
import com.kwai.video.player.IMediaPlayer;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import com.kwai.video.waynelive.mediaplayer.LiveMediaPlayerBuilder;
import com.kwai.player.KwaiPlayerConfig;
import org.json.JSONObject;
import com.kwai.video.waynelive.mediaplayer.LivePlayerWebRTCParams;
import java.util.Map;
import com.kwai.video.waynelive.wayneplayer.StaticsProcessor;
import java.lang.IllegalArgumentException;
import com.kwai.video.waynelive.wayneplayer.AbsWayneProcessor;
import com.kwai.video.waynelive.wayneplayer.DebugViewProcessor;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import com.kwai.video.waynelive.LivePlayerState;
import android.view.View$OnLayoutChangeListener;
import android.widget.FrameLayout;
import java.lang.Boolean;
import com.kwai.video.waynelive.LiveRestartReason;
import java.lang.Throwable;
import com.kuaishou.android.live.model.AdaptationSet;
import com.kuaishou.android.live.model.AdaptationUrl;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import com.kwai.video.waynelive.wayneplayer.LiveDataSourceProvider;
import com.kwai.video.waynelive.LivePlayerUtils;
import ci7.a;
import com.kwai.video.waynelive.util.SeiExtraData;
import java.lang.System;
import android.os.Handler;
import android.os.Looper;
import com.kwai.video.waynelive.LivePlayerInitModule;
import com.kwai.video.waynelive.wayneplayer.WayneDebug;
import com.kwai.video.waynelive.wayneplayer.WayneDebug$Companion;
import com.kwai.video.waynelive.wayneplayer.CmdExecutor;
import com.kwai.video.waynelive.debug.Logger;
import com.kwai.video.waynelive.datasource.LiveUrlSwitchListener;
import com.kwai.video.waynelive.mediaplayer.LivePlayerConfigProvider;
import com.kwai.video.waynelive.qosmoniter.QosMonitorConfig;
import com.kwai.video.waynelive.qosmoniter.LivePlayerQosMonitor;
import com.kwai.video.waynelive.qosmoniter.LivePlayerQosListener;
import android.view.Surface;
import java.util.Set;
import com.kwai.video.waynelive.LivePlayerRegisterListenerHelper;
import com.kwai.video.waynelive.cache.LivePlayerCacheControllerManager;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$4;
import java.lang.Enum;
import java.util.HashMap;
import org.json.JSONArray;
import java.lang.Integer;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$2;
import java.lang.Runnable;
import android.util.Log;
import java.lang.Exception;
import java.util.Objects;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView$a;
import com.kwai.video.waynelive.cache.LivePlayerCacheType;
import com.kwai.video.waynelive.cache.LivePlayerCacheController;
import android.graphics.SurfaceTexture;
import ekd.k1;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import com.kwai.video.player.IMediaPlayer$OnLiveVoiceCommentListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;
import com.kwai.video.player.KsMediaPlayer$OnAudioProcessPCMListener;
import com.kwai.video.player.kwai_player.AspectAwesomeCache;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSrvTsptInfoListener;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.yxcorp.utility.SystemUtil;
import android.view.TextureView$SurfaceTextureListener;
import com.kwai.video.waynelive.datasource.LiveDataSourceFetcher$DataSourceFetchCallback;
import com.kwai.video.waynelive.datasource.LiveDataSourceFetcher;
import com.kwai.player.debuginfo.IDebugView;
import java.lang.Long;
import com.kwai.video.waynelive.LivePlayerExtOption;
import java.lang.Float;
import com.kwai.video.waynelive.mediaplayer.LiveExtSurfaceCropParams;
import com.kwai.video.waynelive.listeners.LivePlayerQosLogListener;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.player.IMediaPlayer$OnLiveEventListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType;
import com.kwai.video.waynelive.listeners.OnLiveRtcSpeakerChangedListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import java.lang.StackTraceElement;
import org.json.JSONException;
import com.kwai.video.waynelive.listeners.QosExtraInterface;
import ekd.q;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kwai.video.waynelive.datasource.LiveDataSource;

public class WayneLivePlayer extends LivePlayerStatusMonitorImpl implements LivePlayerController	// class@000e50
{
    public CmdExecutor mCmdExecutor;
    public final IMediaPlayer$OnCompletionListener mCompletionListener;
    public final LivePlayUrlInfo mCurrentPlayUrlInfo;
    public final SparseIntArray mExtOptions;
    public String mFallbackDomain;
    public final IMediaPlayer$OnInfoListener mInfoListener;
    public boolean mIsInAudioOnlyMode;
    public boolean mIsMute;
    public boolean mIsNeedUpdateFallbackDomain;
    public boolean mIsSurfaceViewShow;
    public boolean mIsVideoRenderingStarted;
    public WayneTrace mKPMidTrace;
    public int mLastRetryCount;
    public byte[] mLatestAACExtraData;
    public byte[] mLatestTsptExtraData;
    public final View$OnLayoutChangeListener mLayoutChangeListener;
    public LiveDataSourceProvider mLiveDataSourceManager;
    public final IMediaPlayer$OnLiveEventListener mLiveEventListener;
    public final IKwaiMediaPlayer$OnLiveInterActiveListener mLiveInterActiveListener;
    public LivePlayQualityStatistics mLivePlayQualityStatistics;
    public final LivePlayerQosListener mLivePlayerQosListener;
    public LivePlayerQosMonitor mLivePlayerQosMonitor;
    public final LivePlayerRuntimeParams mLivePlayerRuntimeParams;
    public OnLiveRtcSpeakerChangedListener mLiveRtcActiveSpeakerChangedListener;
    public final WayneLivePlayer$UrlSwitchListener mLiveUrlSwitchListener;
    public IMediaPlayer$OnLiveVoiceCommentListener mLiveVoiceCommentListener;
    public Logger mLogger;
    public Handler mMainHandler;
    public final Set mPausePlayTokenSet;
    public long mPlayDurationMs;
    public final String mPlaySessionId;
    public LivePlayTextureView mPlayTextureView;
    public int mPlayerId;
    public LivePlayerParam mPlayerParam;
    public float mPlayerVolumeLeft;
    public float mPlayerVolumeRight;
    public final IMediaPlayer$OnPreparedListener mPreparedListener;
    public Surface mPreviousSurface;
    public ConcurrentHashMap mProcessors;
    public String mRecreateReason;
    public int mRetryReason;
    public long mStartPlayTimeMs;
    public Surface mSurface;
    public final TextureView$SurfaceTextureListener mSurfaceTextureListener;
    public final LivePlayTextureView$c mSurfaceViewShowListener;
    public int mTotalRetryCount;
    public final IMediaPlayer$OnVideoSizeChangedListener mVideoSizeChangedListener;
    public int playerIndex;
    public static AtomicInteger sNextGeneratedId;

    static {
       WayneLivePlayer.sNextGeneratedId = new AtomicInteger(1);
    }
    public void WayneLivePlayer(ILiveDatasource p0,LivePlayerParam p1){
       super();
       this.mPlayerId = this.generatePlayerId();
       this.mCurrentPlayUrlInfo = new LivePlayUrlInfo();
       this.mPlayerVolumeLeft = 0x3f800000;
       this.mPlayerVolumeRight = 0x3f800000;
       this.mIsMute = false;
       this.mExtOptions = new SparseIntArray();
       this.mPlayDurationMs = 0;
       this.mStartPlayTimeMs = 0;
       this.mPausePlayTokenSet = new ArraySet();
       this.playerIndex = -1;
       this.mFallbackDomain = "";
       this.mIsVideoRenderingStarted = false;
       this.mIsSurfaceViewShow = false;
       this.mPreparedListener = new WayneLivePlayer$PreparedListener(this, null);
       this.mCompletionListener = new WayneLivePlayer$CompletionListener(this, null);
       this.mInfoListener = new WayneLivePlayer$InfoListener(this, null);
       this.mLiveEventListener = new WayneLivePlayer$LiveEventListener(this, null);
       this.mVideoSizeChangedListener = new WayneLivePlayer$VideoSizeChangedListener(this, null);
       this.mLiveInterActiveListener = new WayneLivePlayer$LiveInterActiveListener(this, null);
       this.mSurfaceTextureListener = new WayneLivePlayer$SurfaceTextureListener(this, null);
       this.mSurfaceViewShowListener = new WayneLivePlayer$SurfaceViewShowListener(this, null);
       this.mLiveUrlSwitchListener = new WayneLivePlayer$UrlSwitchListener(this, null);
       this.mLivePlayerQosListener = new WayneLivePlayer$QosListener(this, null);
       this.mLivePlayerRuntimeParams = new LivePlayerRuntimeParams();
       this.mPlaySessionId = UUID.randomUUID().toString();
       this.mLayoutChangeListener = new g(this);
       this.mKPMidTrace = new WayneTrace();
       this.mProcessors = new ConcurrentHashMap();
       this.mCmdExecutor = new WayneLivePlayer$3(this);
       this.init(p0, p1);
    }
    public void WayneLivePlayer(LivePlayTextureView p0,ILiveDatasource p1,LivePlayerParam p2){
       super();
       this.mPlayerId = this.generatePlayerId();
       this.mCurrentPlayUrlInfo = new LivePlayUrlInfo();
       this.mPlayerVolumeLeft = 0x3f800000;
       this.mPlayerVolumeRight = 0x3f800000;
       this.mIsMute = false;
       this.mExtOptions = new SparseIntArray();
       this.mPlayDurationMs = 0;
       this.mStartPlayTimeMs = 0;
       this.mPausePlayTokenSet = new ArraySet();
       this.playerIndex = -1;
       this.mFallbackDomain = "";
       this.mIsVideoRenderingStarted = false;
       this.mIsSurfaceViewShow = false;
       this.mPreparedListener = new WayneLivePlayer$PreparedListener(this, null);
       this.mCompletionListener = new WayneLivePlayer$CompletionListener(this, null);
       this.mInfoListener = new WayneLivePlayer$InfoListener(this, null);
       this.mLiveEventListener = new WayneLivePlayer$LiveEventListener(this, null);
       this.mVideoSizeChangedListener = new WayneLivePlayer$VideoSizeChangedListener(this, null);
       this.mLiveInterActiveListener = new WayneLivePlayer$LiveInterActiveListener(this, null);
       this.mSurfaceTextureListener = new WayneLivePlayer$SurfaceTextureListener(this, null);
       this.mSurfaceViewShowListener = new WayneLivePlayer$SurfaceViewShowListener(this, null);
       this.mLiveUrlSwitchListener = new WayneLivePlayer$UrlSwitchListener(this, null);
       this.mLivePlayerQosListener = new WayneLivePlayer$QosListener(this, null);
       this.mLivePlayerRuntimeParams = new LivePlayerRuntimeParams();
       this.mPlaySessionId = UUID.randomUUID().toString();
       this.mLayoutChangeListener = new g(this);
       this.mKPMidTrace = new WayneTrace();
       this.mProcessors = new ConcurrentHashMap();
       this.mCmdExecutor = new WayneLivePlayer$3(this);
       this.init(p1, p2);
       this.setTextureView(p0);
    }
    public static void e(WayneLivePlayer p0,View p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8,int p9){
       p0.lambda$new$0(p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }
    private void lambda$new$0(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       this.setViewPixelSize((p3 - p1), (p4 - p2));
    }
    public void addLivePlayerErrorListener(LivePlayerErrorListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "49")) {
          return;
       }
       if (p0 != null) {
          this.getProcessor(ErrorRetryProcessor.class).addErrorListener(p0);
       }
       return;
    }
    public void addOnVideoRendingStartAfterBufferingListener(LivePlayerRenderAfterBufferStartListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "73")) {
          return;
       }
       if (p0 != null) {
          this.mRenderAfterBufferStartList.add(p0);
       }
       return;
    }
    public void addQualityChangeListener(LiveQualityChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "51")) {
          return;
       }
       if (p0 != null) {
          this.getProcessor(RepresentationProcessor.class).addOnQualityChangedListener(p0);
       }
       return;
    }
    public void addStateChangeListener(LivePlayerStateChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "75")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.getProcessor(PlayerStateProcessor.class).registerPlayerStateChangedListener(p0);
       return;
    }
    public final void adoptSurfaceView(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "66")) {
          return;
       }
       boolean b = this.getCurrentPlayUrlInfo().isHDR();
       WayneLivePlayer tmPlayTextur = this.mPlayTextureView;
       if (tmPlayTextur != null) {
          LivePlayerParam mUseSurfaceV = this.mPlayerParam.mUseSurfaceView;
          if (mUseSurfaceV != -1) {
             boolean b1 = true;
             if (b || mUseSurfaceV == b1) {
                tmPlayTextur.h(LivePlayTextureView$b.class);
                this.mLiveMediaPlayer.enableMediacodecDummy(b1);
             }
          }
       }
       DebugLog.i(this.getTag(), "adoptSurfaceViewisHDR"+b+"mUseSurfaceView"+this.mPlayerParam.mUseSurfaceView);
       return;
    }
    public final void applyMediaPlayerVolume(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "37")) {
          return;
       }
       LivePlayerStatusMonitorImpl tmLiveMediaP = this.mLiveMediaPlayer;
       if (tmLiveMediaP != null) {
          tmLiveMediaP.setVolume(this.mPlayerVolumeLeft, this.mPlayerVolumeRight);
          this.mLiveMediaPlayer.setPlayerMute(this.mIsMute);
       }
       return;
    }
    public final IKwaiMediaPlayer buildMediaPlayer(LiveAdaptiveManifest p0){
       LiveQualityItem obj = PatchProxy.applyOneRefs(p0, this, WayneLivePlayer.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DebugLog.i(this.getTag(), "buildMediaPlayer");
       if (p0 == null) {
          throw new IllegalArgumentException("playUrl and adaptiveManifest can\'t be both null");
       }
       obj = this.getCurrentLiveQualityItem();
       LiveMediaPlayerBuilder liveMediaPla = new LiveMediaPlayerBuilder(p0, obj.mQualityType);
       DebugLog.i(this.getTag(), "buildMediaPlayer use AdaptiveManifest "+p0+" qualityType: "+obj.mQualityType);
       WayneLivePlayer tmLivePlayer = this.mLivePlayerRuntimeParams;
       liveMediaPla.setShouldStartOnPrepared(true).setLiveKwaiPlayerConfig(this.mPlayerParam.mMediaPlayerConfig).setIsPaidLive(this.mPlayerParam.mPaidLive).setIsPrivateLive(this.mPlayerParam.mPrivateLive).setShouldUseHardwareDecoding(this.mPlayerParam.mShouldUseHardwareDecoding).setEnableReusePlayerOptimize(this.mPlayerParam.mEnableReusePlayerOptimize).setUseMediaCodecSurfaceView(this.mPlayerParam.mUseMediaCodecSurfaceView).setAppQosStatJson(this.mPlayerParam.mQosJson).setEnableSmallWindow(this.mPlayerParam.mEnableSmallWindow).setEnableWebRTC(this.mLivePlayerRuntimeParams.mPlayerWebRTCParams.isEnableWebRTCManifest()).setWebRTCConfig(this.mLivePlayerRuntimeParams.mPlayerWebRTCParams.getConfigWebRTC()).setViewPixelSize(tmLivePlayer.mViewWidth, tmLivePlayer.mViewHeight).setNetworkRetryScene(this.mLivePlayerRuntimeParams.mNetworkRetryScene).setEnableOesSurface(this.mPlayerParam.mEnableOesSurface).setEnableDummySurface(this.mPlayerParam.mEnableDummySurface).setEnableMultiSurface(this.mPlayerParam.mEnableMultiSurface).setExtraHeader(this.mPlayerParam.mHeaders).setForceSystemPlayer(this.mPlayerParam.mForceSystemPlayer).setEnableQos(this.getProcessor(StaticsProcessor.class).enableQos()).setBizFt(this.mPlayerParam.mBizFt).setBizType(this.mPlayerParam.mBizType).setBizExtra@005887(this.mPlayerParam@001ce5.mBizExtra@001bb0);
       IKwaiMediaPlayer iKwaiMediaPl = liveMediaPla.build();
       this.setMediaPlayerListeners(iKwaiMediaPl);
       this.mLivePlayerRuntimeParams.applyTo(iKwaiMediaPl);
       return iKwaiMediaPl;
    }
    public final void configProcessors(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "6")) {
          return;
       }
       ErrorRetryProcessor uErrorRetryP = new ErrorRetryProcessor();
       uErrorRetryP.attach(this);
       this.mProcessors.put(ErrorRetryProcessor.class, uErrorRetryP);
       PlayerStateProcessor playerStateP = new PlayerStateProcessor();
       playerStateP.attach(this);
       this.mProcessors.put(PlayerStateProcessor.class, playerStateP);
       RepresentationProcessor representati = new RepresentationProcessor();
       representati.attach(this);
       this.mProcessors.put(RepresentationProcessor.class, representati);
       StaticsProcessor staticsProce = new StaticsProcessor();
       staticsProce.attach(this);
       this.mProcessors.put(StaticsProcessor.class, staticsProce);
       DebugViewProcessor uDebugViewPr = new DebugViewProcessor();
       uDebugViewPr.attach(this);
       this.mProcessors.put(DebugViewProcessor.class, uDebugViewPr);
       return;
    }
    public final void createKwaiMediaPlayer(LiveAdaptiveManifest p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "64")) {
          return;
       }
       this.updateCurrentPlayUrlInfo(p0);
       if (this.mIsNeedUpdateFallbackDomain != null) {
          this.mFallbackDomain = this.getCurrentPlayUrlInfo().getHost();
          this.mIsNeedUpdateFallbackDomain = false;
       }
       this.mKPMidTrace.initTrace();
       this.mLiveMediaPlayer = this.buildMediaPlayer(p0);
       this.mKPMidTrace.addStamp("createKwaiPlayer");
       this.playerIndex = this.playerIndex + 1;
       Iterator iterator = this.mProcessors.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onKernelPlayerCreated();
       }
       this.getProcessor(RepresentationProcessor.class).updateAdaptiveLiveQuality();
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "32")) {
          return;
       }
       this.moveToState(new ArrayList(), LivePlayerState.DESTROY);
       return;
    }
    public final void disableAutoUpdateViewSize(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "95")) {
          return;
       }
       this.setViewPixelSize(0, 0);
       WayneLivePlayer tmPlayTextur = this.mPlayTextureView;
       if (tmPlayTextur != null) {
          tmPlayTextur.removeOnLayoutChangeListener(this.mLayoutChangeListener);
       }
       return;
    }
    public final boolean doStartPlay(LiveAdaptiveManifest p0){
       String str = "doStartPlay";
       Object obj = PatchProxy.applyOneRefs(p0, this, WayneLivePlayer.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mPlayerParam.mIsCdnOverload != null) {
          DebugLog.i(this.getTag(), "can\'t doStartPlay, cdnOverload");
          return false;
       }else if(p0 == null){
          DebugLog.i(this.getTag(), "can\'t doStartPlay, no available data, restart");
          this.restartPlay(LiveRestartReason.DEFAULT);
          return false;
       }else if(this.getInnerState() != LivePlayerState.INIT){
          if (this.mLiveMediaPlayer != null) {
             this.stopPlay();
          }
          this.createKwaiMediaPlayer(p0);
       }
       this.mKPMidTrace.addStamp(str);
       DebugLog.i(this.getTag(), "initPlayer");
       this.initPlayer();
       this.mKPMidTrace.addStamp("setSurface");
       this.moveToState(new ArrayList(), LivePlayerState.CREATED);
       this.moveToState(new ArrayList(), LivePlayerState.PREPARING);
       this.mKPMidTrace.addStamp("prepareAsync");
       DebugLog.i(this.getTag(), str);
       DebugLog.i(this.getTag(), this.mKPMidTrace.getStrTrace());
       return true;
    }
    public final void enableAutoUpdateViewSize(LivePlayTextureView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "94")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p0.getWidth() > 0 && p0.getHeight() > 0) {
          this.setViewPixelSize(p0.getWidth(), p0.getHeight());
       }
       p0.addOnLayoutChangeListener(this.mLayoutChangeListener);
       return;
    }
    public LiveQualityItem fillRealResolutionName(LiveQualityItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WayneLivePlayer.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.isAutoQuality()) {
          int currentLiveM = this.getCurrentLiveManifestRepId();
          LiveAdaptiveManifest currentAdapt = this.getCurrentAdaptiveManifest();
          if (currentAdapt != null) {
             currentAdapt = currentAdapt.mAdaptationSet;
             if (currentAdapt != null) {
                AdaptationSet mRepresentat = currentAdapt.mRepresentation;
                if (mRepresentat != null) {
                   Iterator iterator = mRepresentat.iterator();
                   while (iterator.hasNext()) {
                      AdaptationUrl uAdaptationU = iterator.next();
                      if (uAdaptationU != null && (!uAdaptationU.mId - (long)currentLiveM && !TextUtils.x(uAdaptationU.mName))) {
                         p0.setRealResolutionName(uAdaptationU.mName);
                      }
                   }
                }
             }
          }
       }
       return p0;
    }
    public final int generatePlayerId(){
       int i;
       int i1;
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       do {
          i = WayneLivePlayer.sNextGeneratedId.get();
          i1 = i + 1;
          if (i1 > 0xffffff) {
             i1 = 1;
          }
       } while (WayneLivePlayer.sNextGeneratedId.compareAndSet(i, i1));
       return i;
    }
    public LiveAdaptiveManifest getCurrentAdaptiveManifest(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "88");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mLiveDataSourceManager.getAdaptiveManifest();
    }
    public int getCurrentLiveManifestRepId(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LivePlayerUtils.getLiveManifestRepId(this.mLiveMediaPlayer);
    }
    public LiveQualityItem getCurrentLiveQualityItem(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getProcessor(RepresentationProcessor.class).getCurrentLiveQualityItem();
    }
    public int getCurrentLiveStreamType(){
       return this.mCurrentLiveStreamType;
    }
    public LivePlayUrlInfo getCurrentPlayUrlInfo(){
       return this.mCurrentPlayUrlInfo;
    }
    public String getCurrentPlayingUrl(){
       LivePlayerStatusMonitorImpl obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLiveMediaPlayer;
       if (obj != null) {
          return obj.getCurPlayingUrl();
       }
       return "";
    }
    public long getCurrentVideoPosition(){
       LivePlayerStatusMonitorImpl obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "96");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mLiveMediaPlayer;
       if (obj == null) {
          return 0;
       }
       return obj.getCurrentVideoPosition();
    }
    public LivePlayerState getInnerState(){
       PlayerStateProcessor playerStateP = PlayerStateProcessor.class;
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getProcessor(playerStateP) != null) {
          return this.getProcessor(playerStateP).getInnerState();
       }
       return LivePlayerState.IDLE;
    }
    public long getLastVideoPts(){
       LivePlayerStatusMonitorImpl obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "97");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mLiveMediaPlayer;
       if (obj == null) {
          return 0;
       }
       return obj.getLastVideoPts();
    }
    public byte[] getLatestAACExtraData(){
       return this.mLatestAACExtraData;
    }
    public SeiExtraData getLatestSeiExtraData(){
       return this.mLatestSeiExtraData;
    }
    public byte[] getLatestTsptExtraData(){
       return this.mLatestTsptExtraData;
    }
    public IKwaiMediaPlayer getLiveMediaPlayer(){
       return this.mLiveMediaPlayer;
    }
    public List getLiveQualityList(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getProcessor(RepresentationProcessor.class).getLiveQualityList();
    }
    public int getPkLiveStreamType(){
       return this.mPkLiveStreamTypeCache;
    }
    public SeiExtraData getPkSeiCache(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "98");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DebugLog.i(this.getTag(), "getPkSeiCache--"+this.mPkSeiCache);
       return this.mPkSeiCache;
    }
    public long getPlayDuration(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.mStartPlayTimeMs) {
          return ((this.mPlayDurationMs + System.currentTimeMillis()) - this.mStartPlayTimeMs);
       }
       return this.mPlayDurationMs;
    }
    public Object getProcessor(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WayneLivePlayer.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mProcessors.get(p0);
    }
    public String getTag(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "WayneLivePlayer[";
       if (this.mLiveMediaPlayer != null) {
          return str+this.mPlayerId+"]["+this.mLiveMediaPlayer.getPlayerId()+"]";
       }
       return str+this.mPlayerId+"][]";
    }
    public int getTotalRetryCount(){
       return this.mTotalRetryCount;
    }
    public int getVideoHeight(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.getVideoHeight();
    }
    public float getVideoSizeRatio(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       int videoHeight = this.getVideoHeight();
       float f = (videoHeight > 0)? ((float)this.getVideoWidth() * 0x3f800000) / (float)videoHeight: 0xbf800000;
       return f;
    }
    public int getVideoWidth(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.getVideoWidth();
    }
    public final void init(ILiveDatasource p0,LivePlayerParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WayneLivePlayer.class, "3")) {
          return;
       }
       this.generatePlayerId();
       this.mMainHandler = new Handler(Looper.getMainLooper());
       this.mPlayerParam = p1;
       this.configProcessors();
       this.initQualityStatics(p1);
       this.initData(p0, p1);
       if (LivePlayerInitModule.isApkInDebug()) {
          DebugLog.i(this.getTag(), "debugmode");
          WayneDebug.Companion.getInstance().registerCmdExecutor("invoke_error", this.mCmdExecutor);
       }
       return;
    }
    public final void initData(ILiveDatasource p0,LivePlayerParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WayneLivePlayer.class, "60")) {
          return;
       }
       this.mLogger = new Logger(String.valueOf(this.hashCode()));
       WayneLivePlayer tmPlayerPara = this.mPlayerParam;
       this.updateWebRTCParams(tmPlayerPara.mEnableWebRTCManifest, tmPlayerPara.mWebRTCConfig);
       tmPlayerPara = this.mLivePlayerRuntimeParams;
       WayneLivePlayer tmPlayerPara1 = this.mPlayerParam;
       tmPlayerPara.mEnableAutoUpdateViewSize = tmPlayerPara1.mEnableAutoUpdateViewSize;
       tmPlayerPara.mNetworkRetryScene = tmPlayerPara1.mNetworkRetryScene;
       this.setViewPixelSize(tmPlayerPara1.mViewWidth, tmPlayerPara1.mViewHeight);
       this.initDataSourceManager(p0);
       this.initLivePlayerQosMonitor();
       return;
    }
    public final void initDataSourceManager(ILiveDatasource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "62")) {
          return;
       }
       LiveDataSourceProvider liveDataSour = new LiveDataSourceProvider(this.mLivePlayerRuntimeParams.mPlayerWebRTCParams);
       this.mLiveDataSourceManager = liveDataSour;
       liveDataSour.setAnchorId(this.mPlayerParam.mAnchorId);
       this.updateDataSourceInternal(p0);
       this.mLiveDataSourceManager.setLiveUrlSwitchListener(this.mLiveUrlSwitchListener);
       return;
    }
    public final void initLivePlayerQosMonitor(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "61")) {
          return;
       }
       LivePlayerParam mQosMonitorC = this.mPlayerParam.mQosMonitorConfig;
       if (mQosMonitorC == null) {
          mQosMonitorC = LivePlayerInitModule.getConfig().getQosMonitorConfig();
       }
       LivePlayerQosMonitor livePlayerQo = new LivePlayerQosMonitor(mQosMonitorC);
       this.mLivePlayerQosMonitor = livePlayerQo;
       livePlayerQo.setLivePlayerQosListener(this.mLivePlayerQosListener);
       return;
    }
    public final void initPlayer(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "65")) {
          return;
       }
       this.applyMediaPlayerVolume();
       int i = this.mExtOptions.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.mLiveMediaPlayer.setExtOption(this.mExtOptions.keyAt(i1), this.mExtOptions.valueAt(i1));
       }
       this.adoptSurfaceView();
       this.mLiveMediaPlayer.setSurface(this.mSurface);
       return;
    }
    public final void initQualityStatics(LivePlayerParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "4")) {
          return;
       }
       this.getProcessor(StaticsProcessor.class).initQualityStatics(p0);
       return;
    }
    public final void internalDestroy(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "33")) {
          return;
       }
       this.stopPlay();
       DebugLog.i(this.getTag(), "destroy");
       boolean b = false;
       this.mIsInAudioOnlyMode = b;
       this.mStartPlayTimeMs = 0;
       this.mPlayDurationMs = 0;
       this.mLivePlayerQosMonitor.destroy();
       this.mLiveDataSourceManager.destroy();
       this.mPausePlayTokenSet.clear();
       this.mRegisterListenerHelper.destroy();
       if (this.mLivePlayerCacheControllerManager.isStarted()) {
          this.stopCache();
       }
       this.clearAllListener();
       this.releaseSurface(b, b);
       this.releaseExtSurface();
       Iterator iterator = this.mProcessors.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().detach();
       }
       if (LivePlayerInitModule.isApkInDebug()) {
          WayneDebug.Companion.getInstance().unregisterCmdExecutor(this.mCmdExecutor);
       }
       return;
    }
    public boolean isBuffering(){
       return this.mIsBuffering;
    }
    public boolean isDestroyed(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getInnerState() == LivePlayerState.DESTROY)? true: false;
       return b;
    }
    public boolean isEnableReusePlayerOptimize(){
       return this.mPlayerParam.mEnableReusePlayerOptimize;
    }
    public boolean isEnableWebRTCManifest(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "91");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mLivePlayerRuntimeParams.mPlayerWebRTCParams.isEnableWebRTCManifest();
    }
    public boolean isLiveDataSourceContainsWebRTC(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "90");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mLiveDataSourceManager.getDatasourceType() == 4)? true: false;
       return b;
    }
    public boolean isPlayerMute(){
       return this.mIsMute;
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getInnerState() == LivePlayerState.PLAYING)? true: false;
       return b;
    }
    public boolean isPreparing(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getInnerState() == LivePlayerState.PREPARING)? true: false;
       return b;
    }
    public boolean isSideBySideStream(){
       boolean b = (this.mCurrentLiveStreamType == 2)? true: false;
       return b;
    }
    public boolean isStop(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getInnerState() == LivePlayerState.STOP || this.getInnerState() == LivePlayerState.DESTROY)? true: false;
       return b;
    }
    public boolean isSupportAudioOnlyMode(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "86");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       boolean b1 = (LivePlayerInitModule.getConfig().isLiveH264SupportMediacodec() || LivePlayerInitModule.getConfig().isLiveH265SupportMediacodec())? true: false;
       boolean b2 = (this.mPlayerParam.mShouldUseHardwareDecoding != null && (LivePlayerInitModule.getConfig().getUseLive264HwForPcPush() || LivePlayerInitModule.getConfig().getUseLive265HwForPcPush()))? true: false;
       boolean b3 = this.getCurrentAdaptiveManifest().isManifestHLS();
       boolean b4 = (this.getCurrentPlayUrlInfo().getUrl()).startsWith("https");
       this.mLogger.i("isSupportAudioOnlyMode, isSupportHwForMediaCodec: "+b1+", isSupportHwForPcPush: "+b2+", isHlsType: "+b3+", isHttpsUrl: "+b4);
       if (LivePlayerInitModule.getConfig().getLiveHwSupportAudioOnlyMode()) {
          if (!b3 && !b4) {
             b = true;
          }
          return b;
       }else if(!b1 && (!b2 && (!b3 && !b4))){
          b = true;
       }
    label_00a8 :
       return b;
    }
    public boolean isUsingSurfaceView(){
       WayneLivePlayer obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mPlayTextureView;
       boolean b = (obj != null && obj.d())? true: false;
       return b;
    }
    public void moveToState(List p0,LivePlayerState p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WayneLivePlayer.class, "78")) {
          return;
       }
       DebugLog.i(this.getTag(), "moveToState : "+p1);
       LivePlayerState innerState = this.getInnerState();
       if (!p0.isEmpty() && !p0.contains(innerState)) {
          DebugLog.e("WayneLivePlayer", "state move to $targetState, but current state:$currentState illegal!!!");
          return;
       }else {
          int i = WayneLivePlayer$4.$SwitchMap$com$kwai$video$waynelive$LivePlayerState[p1.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   this.getProcessor(PlayerStateProcessor.class).notifyStateChanged(p1, false);
                }else {
                   this.internalDestroy();
                   this.getProcessor(PlayerStateProcessor.class).notifyStateChanged(p1, false);
                }
             }else {
                this.mLiveMediaPlayer.prepareAsync();
                this.getProcessor(PlayerStateProcessor.class).notifyStateChanged(p1, false);
             }
          }else {
             this.getProcessor(PlayerStateProcessor.class).notifyStateChanged(p1, false);
             this.releasePlayer();
          }
          return;
       }
    }
    public void mute(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "34")) {
          return;
       }
       this.mIsMute = true;
       this.applyMediaPlayerVolume();
       DebugLog.i(this.getTag(), "mute");
       return;
    }
    public void onReceiveLiveData(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "104")) {
          return;
       }
       try{
          HashMap hashMap = new HashMap();
          JSONArray jSONArray = new JSONObject(new String(p0)).optJSONArray("as");
          if (jSONArray == null) {
             return;
          }
          int i = 0;
          while (i < jSONArray.length()) {
             JSONObject jSONObject = jSONArray.optJSONObject(i);
             Iterator iterator = jSONObject.keys();
             if (iterator.hasNext()) {
                String str = iterator.next();
                hashMap.put(str, Integer.valueOf(jSONObject.optInt(str)));
             }
             i = i + 1;
          }
          this.mMainHandler.post(new WayneLivePlayer$2(this, hashMap));
          return;
       }catch(java.lang.Exception e6){
          DebugLog.e("WayneLivePlayer", Log.getStackTraceString(e6));
          e6.printStackTrace();
          return;
       }
    }
    public boolean preInit(){
       LiveAdaptiveManifest obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mPlayerParam.mIsCdnOverload != null) {
          DebugLog.i(this.getTag(), "can\'t prepare, cdnOverload");
          return false;
       }else {
          obj = this.getCurrentAdaptiveManifest();
          if (obj == null) {
             DebugLog.i(this.getTag(), "can\'t prepare, no available data");
             return false;
          }else {
             this.createKwaiMediaPlayer(obj);
             this.moveToState(new ArrayList(), LivePlayerState.INIT);
             DebugLog.i(this.getTag(), "preInit");
             return true;
          }
       }
    }
    public void prepareForStartAnim(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, WayneLivePlayer.class, "23")) {
          return;
       }
       WayneLivePlayer tmPlayTextur = this.mPlayTextureView;
       if (tmPlayTextur != null) {
          Objects.requireNonNull(tmPlayTextur);
          if (!PatchProxy.applyVoid(objArray, tmPlayTextur, LivePlayTextureView.class, "21")) {
             tmPlayTextur.d.prepareForStartAnim();
          }
       }
       return;
    }
    public void prepareForStopAnim(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, WayneLivePlayer.class, "24")) {
          return;
       }
       WayneLivePlayer tmPlayTextur = this.mPlayTextureView;
       if (tmPlayTextur != null) {
          Objects.requireNonNull(tmPlayTextur);
          if (!PatchProxy.applyVoid(objArray, tmPlayTextur, LivePlayTextureView.class, "22")) {
             tmPlayTextur.d.prepareForStopAnim();
          }
       }
       return;
    }
    public void registerCacheController(LivePlayerCacheType p0,LivePlayerCacheController p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WayneLivePlayer.class, "13")) {
          return;
       }
       this.mLivePlayerCacheControllerManager.registerCacheController(p0, p1);
       return;
    }
    public final void releaseExtSurface(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "81")) {
          return;
       }
       if (this.mLivePlayerRuntimeParams.mExtSurfaceTexture != null) {
          LivePlayerStatusMonitorImpl tmLiveMediaP = this.mLiveMediaPlayer;
          if (tmLiveMediaP != null) {
             tmLiveMediaP.setExtSurfaceTexture(null);
          }
          this.mLivePlayerRuntimeParams.mExtSurfaceTexture = null;
       }
       return;
    }
    public final void releasePlayer(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "83")) {
          return;
       }
       DebugLog.i(this.getTag(), "releaseMediaPlayer");
       this.mLivePlayerQosMonitor.stopMonitor();
       if (this.mLiveMediaPlayer != null) {
          Iterator iterator = this.mProcessors.values().iterator();
          while (iterator.hasNext()) {
             iterator.next().onKernelPlayerDestroy();
          }
          this.mLiveMediaPlayer.stopLiveStatTimerImmediately();
          this.releasePlayer(this.mLiveMediaPlayer);
          this.mLiveMediaPlayer = null;
          this.updatePlayDuration();
       }
       this.mIsBuffering = false;
       this.mIsVideoRenderingStarted = false;
       this.mIsSurfaceViewShow = false;
       this.mPkSeiCache = null;
       this.mPkLiveStreamTypeCache = 0;
       k1.n(this);
       return;
    }
    public final void releasePlayer(IKwaiMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "84")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setVolume(0, 0);
       p0.setSurface(null);
       p0.setOnCompletionListener(null);
       p0.setOnPreparedListener(null);
       p0.setOnInfoListener(null);
       p0.setOnSeekCompleteListener(null);
       p0.setOnBufferingUpdateListener(null);
       p0.setOnLiveVoiceCommentListener(null);
       p0.setOnLiveInterActiveListener(null);
       p0.setOnAudioProcessPCMAvailableListener(null);
       p0.getAspectAwesomeCache().setAwesomeCacheCallback(null);
       p0.setOnLiveSrvTsptInfoListener(null);
       p0.setOnErrorListener(null);
       p0.releaseAsync();
       return;
    }
    public void releasePreviousSurface(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "82")) {
          return;
       }
       WayneLivePlayer tmPreviousSu = this.mPreviousSurface;
       if (tmPreviousSu != null) {
          tmPreviousSu.release();
          this.mPreviousSurface = null;
       }
       return;
    }
    public final void releaseSurface(boolean p0,boolean p1){
       WayneLivePlayer tmSurfaceVie;
       WayneLivePlayer wayneLivePla = WayneLivePlayer.class;
       if (PatchProxy.isSupport(wayneLivePla) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, wayneLivePla, "80")) {
          return;
       }
       DebugLog.i(this.getTag(), "releaseSurface");
       this.releasePreviousSurface();
       if (p1) {
          this.mPreviousSurface = this.mSurface;
          this.mSurface = null;
       }else {
          LivePlayerStatusMonitorImpl tmLiveMediaP = this.mLiveMediaPlayer;
          if (tmLiveMediaP != null) {
             tmLiveMediaP.setSurface(null);
          }
          tmSurfaceVie = this.mSurface;
          if (tmSurfaceVie != null) {
             tmSurfaceVie.release();
             this.mSurface = null;
          }
       }
       if (this.mPlayTextureView != null) {
          if (p0 && SystemUtil.a(20)) {
             this.mPlayTextureView.f();
          }
          this.mPlayTextureView.g(this.mSurfaceTextureListener);
          WayneLivePlayer tmPlayTextur = this.mPlayTextureView;
          tmSurfaceVie = this.mSurfaceViewShowListener;
          Objects.requireNonNull(tmPlayTextur);
          if (!PatchProxy.applyVoidOneRefs(tmSurfaceVie, tmPlayTextur, LivePlayTextureView.class, "19")) {
             tmPlayTextur.c.remove(tmSurfaceVie);
          }
       }
       this.mPlayTextureView = null;
       return;
    }
    public void removeLivePlayerErrorListener(LivePlayerErrorListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "50")) {
          return;
       }
       if (p0 != null) {
          this.getProcessor(ErrorRetryProcessor.class).removeErrorListener(p0);
       }
       return;
    }
    public void removeOnVideoRendingStartAfterBufferingListener(LivePlayerRenderAfterBufferStartListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "74")) {
          return;
       }
       if (p0 != null) {
          this.mRenderAfterBufferStartList.remove(p0);
       }
       return;
    }
    public void removeQualityChangeListener(LiveQualityChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "52")) {
          return;
       }
       if (p0 != null) {
          this.getProcessor(RepresentationProcessor.class).removeOnQualityChangedListener(p0);
       }
       return;
    }
    public void removeStateChangeListener(LivePlayerStateChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "76")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.getProcessor(PlayerStateProcessor.class).unregisterPlayerStateChangedListener(p0);
       return;
    }
    public void removeStopPlayToken(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "31")) {
          return;
       }
       DebugLog.i(this.getTag(), "removeTokentoken"+p0);
       this.mPausePlayTokenSet.remove(p0);
       return;
    }
    public void resetRetryCount(){
       this.mTotalRetryCount = 0;
       this.mLastRetryCount = 0;
    }
    public void restartPlay(LiveRestartReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "68")) {
          return;
       }
       DebugLog.i(this.getTag(), "restartPlay");
       this.mRecreateReason = "restartPlay-"+p0;
       this.stopPlay();
       LivePlayerStatusMonitorImpl tmLiveDataSo = this.mLiveDataSourceFetcher;
       if (tmLiveDataSo == null) {
          DebugLog.i(this.getTag(), "restartPlay fail fetcher is null");
          this.getProcessor(ErrorRetryProcessor.class).disPatchError(0, 0);
          return;
       }else {
          tmLiveDataSo.fetchDataSource(p0, new WayneLivePlayer$1(this, p0));
          return;
       }
    }
    public void setCdnLoggerCallback(AwesomeCacheCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "72")) {
          return;
       }
       this.getProcessor(StaticsProcessor.class).setCdnLoggerCallback(p0);
       return;
    }
    public void setDebugView(IDebugView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "79")) {
          return;
       }
       this.getProcessor(DebugViewProcessor.class).setVodDebugView(p0);
       return;
    }
    public void setEnableAutoUpdateViewSize(boolean p0){
       WayneLivePlayer wayneLivePla = WayneLivePlayer.class;
       if (PatchProxy.isSupport(wayneLivePla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, wayneLivePla, "93")) {
          return;
       }
       wayneLivePla = this.mLivePlayerRuntimeParams;
       if (wayneLivePla.mEnableAutoUpdateViewSize == p0) {
          return;
       }
       wayneLivePla.mEnableAutoUpdateViewSize = p0;
       if (p0) {
          this.enableAutoUpdateViewSize(this.mPlayTextureView);
       }else {
          this.disableAutoUpdateViewSize();
       }
       return;
    }
    public void setEnterTimeForPreload(long p0){
       WayneLivePlayer wayneLivePla = WayneLivePlayer.class;
       if (PatchProxy.isSupport(wayneLivePla) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, wayneLivePla, "5")) {
          return;
       }
       this.getProcessor(StaticsProcessor.class).setEnterTimeForPreload(p0);
       return;
    }
    public void setExtOption(LivePlayerExtOption p0,int p1){
       WayneLivePlayer wayneLivePla = WayneLivePlayer.class;
       if (PatchProxy.isSupport(wayneLivePla) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, wayneLivePla, "48")) {
          return;
       }
       this.mExtOptions.put(p0.mKey, p1);
       LivePlayerStatusMonitorImpl tmLiveMediaP = this.mLiveMediaPlayer;
       if (tmLiveMediaP != null) {
          tmLiveMediaP.setExtOption(p0.mKey, p1);
       }
       return;
    }
    public void setExtSurfaceCrop(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(WayneLivePlayer.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, WayneLivePlayer.class, "20")) {
          return;
       }
       this.mLivePlayerRuntimeParams.mLiveExtSurfaceCropParams.setLeft(p0);
       this.mLivePlayerRuntimeParams.mLiveExtSurfaceCropParams.setTop(p1);
       this.mLivePlayerRuntimeParams.mLiveExtSurfaceCropParams.setRight(p2);
       this.mLivePlayerRuntimeParams.mLiveExtSurfaceCropParams.setBottom(p3);
       this.mLivePlayerRuntimeParams.mLiveExtSurfaceCropParams.setIsPercent(true);
       this.mLivePlayerRuntimeParams.mLiveExtSurfaceCropParams.applyTo(this.mLiveMediaPlayer);
       return;
    }
    public void setExtSurfaceCrop(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(WayneLivePlayer.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, WayneLivePlayer.class, "19")) {
          return;
       }
       this.mLivePlayerRuntimeParams.mLiveExtSurfaceCropParams.setX(p0);
       this.mLivePlayerRuntimeParams.mLiveExtSurfaceCropParams.setY(p1);
       this.mLivePlayerRuntimeParams.mLiveExtSurfaceCropParams.setWidth(p2);
       this.mLivePlayerRuntimeParams.mLiveExtSurfaceCropParams.setHeight(p3);
       this.mLivePlayerRuntimeParams.mLiveExtSurfaceCropParams.setIsPercent(false);
       this.mLivePlayerRuntimeParams.mLiveExtSurfaceCropParams.applyTo(this.mLiveMediaPlayer);
       return;
    }
    public void setExtSurfaceTexture(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "18")) {
          return;
       }
       this.mLivePlayerRuntimeParams.mExtSurfaceTexture = p0;
       LivePlayerStatusMonitorImpl tmLiveMediaP = this.mLiveMediaPlayer;
       if (tmLiveMediaP != null) {
          tmLiveMediaP.setExtSurfaceTexture(p0);
       }
       return;
    }
    public void setKwaivppExtJson(int p0,String p1){
       WayneLivePlayer wayneLivePla = WayneLivePlayer.class;
       if (PatchProxy.isSupport(wayneLivePla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, wayneLivePla, "100")) {
          return;
       }
       wayneLivePla = this.mLivePlayerRuntimeParams;
       wayneLivePla.mVppRequestId = p0;
       wayneLivePla.mVppExtJson = p1;
       LivePlayerStatusMonitorImpl tmLiveMediaP = this.mLiveMediaPlayer;
       if (tmLiveMediaP != null) {
          tmLiveMediaP.setKwaivppExtJson(p0, p1);
       }
       return;
    }
    public void setLiveDataSourceFetcher(LiveDataSourceFetcher p0){
       this.mLiveDataSourceFetcher = p0;
    }
    public void setLivePlayerQosLogListener(LivePlayerQosLogListener p0){
       StaticsProcessor staticsProce = StaticsProcessor.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "70")) {
          return;
       }
       if (this.getProcessor(staticsProce) != null) {
          this.getProcessor(staticsProce).setLivePlayerQosLogListener(p0);
       }else {
          DebugLog.e(this.getTag(), "StaticsProcessor is null setLivePlayerQosLogListener");
       }
       return;
    }
    public void setLiveQualityItem(LiveQualityItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "55")) {
          return;
       }
       this.getProcessor(RepresentationProcessor.class).setLiveQualityItem(p0);
       return;
    }
    public void setMediaPlayerListeners(IKwaiMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "71")) {
          return;
       }
       DebugLog.i(this.getTag(), "setMediaPlayerListeners");
       if (p0 == null) {
          return;
       }
       super.setMediaPlayerListeners(p0);
       p0.setOnCompletionListener(this.mCompletionListener);
       p0.setOnInfoListener(this.mInfoListener);
       p0.setOnVideoSizeChangedListener(this.mVideoSizeChangedListener);
       p0.setOnLiveEventListener(this.mLiveEventListener);
       p0.setOnPreparedListener(this.mPreparedListener);
       p0.setOnLiveVoiceCommentListener(this.mLiveVoiceCommentListener);
       p0.setOnLiveInterActiveListener(this.mLiveInterActiveListener, IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType.KwaiLiveListenerTypeTsptInfo);
       return;
    }
    public void setNetworkRetryScene(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "101")) {
          return;
       }
       this.mLivePlayerRuntimeParams.mNetworkRetryScene = p0;
       LivePlayerStatusMonitorImpl tmLiveMediaP = this.mLiveMediaPlayer;
       if (tmLiveMediaP != null) {
          tmLiveMediaP.setNetworkRetryScene(p0);
       }
       return;
    }
    public void setOnLiveRtcSpeakerChangedListener(OnLiveRtcSpeakerChangedListener p0){
       this.mLiveRtcActiveSpeakerChangedListener = p0;
    }
    public void setPkSeiListener(IKwaiMediaPlayer$OnLiveSeiInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "99")) {
          return;
       }
       DebugLog.i(this.getTag(), "setPkSeiListener--"+p0);
       this.mPkSeiListener = p0;
       return;
    }
    public void setPkStreamTypeChangeListener(LivePlayerTypeChangeListener p0){
       this.mPkStreamTypeChangeListener = p0;
    }
    public void setPlayerReleaseReason(int p0){
       WayneLivePlayer wayneLivePla = WayneLivePlayer.class;
       if (PatchProxy.isSupport(wayneLivePla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, wayneLivePla, "58")) {
          return;
       }
       LivePlayerStatusMonitorImpl tmLiveMediaP = this.mLiveMediaPlayer;
       if (tmLiveMediaP != null && tmLiveMediaP.isPlaying()) {
          try{
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("live_player_release_reason", p0);
             this.mLiveMediaPlayer.setAppQosStatJson(jSONObject);
             DebugLog.i(this.getTag(), "setPlayerReleaseReasonreason "+p0);
          }catch(org.json.JSONException e4){
             DebugLog.e(this.getTag(), "setPlayerReleaseReason fail"+e4.getStackTrace());
          }
       }
    }
    public void setPriorLowQuality(int p0){
       WayneLivePlayer wayneLivePla = WayneLivePlayer.class;
       if (PatchProxy.isSupport(wayneLivePla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, wayneLivePla, "53")) {
          return;
       }
       this.getProcessor(RepresentationProcessor.class).setPriorLowQuality(p0);
       return;
    }
    public void setQosExtraData(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "22")) {
          return;
       }
       this.getProcessor(StaticsProcessor.class).setQosExtraData(p0);
       return;
    }
    public void setQosExtraInterface(QosExtraInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "21")) {
          return;
       }
       this.getProcessor(StaticsProcessor.class).setQosExtraInterface(p0);
       return;
    }
    public void setSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "17")) {
          return;
       }
       this.mSurface = p0;
       LivePlayerStatusMonitorImpl tmLiveMediaP = this.mLiveMediaPlayer;
       if (tmLiveMediaP != null) {
          tmLiveMediaP.setSurface(p0);
       }
       return;
    }
    public void setTextureView(LivePlayTextureView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "14")) {
          return;
       }
       this.setTextureView(p0, true);
       return;
    }
    public void setTextureView(LivePlayTextureView p0,boolean p1){
       WayneLivePlayer wayneLivePla = WayneLivePlayer.class;
       if (PatchProxy.isSupport(wayneLivePla) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, wayneLivePla, "15")) {
          return;
       }
       this.setTextureView(p0, p1, false);
       return;
    }
    public void setTextureView(LivePlayTextureView p0,boolean p1,boolean p2){
       WayneLivePlayer tmPlayTextur;
       if (PatchProxy.isSupport(WayneLivePlayer.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, WayneLivePlayer.class, "16")) {
          return;
       }
       if (p0 == this.mPlayTextureView) {
          return;
       }
       this.releaseSurface(p1, p2);
       if (this.mLivePlayerRuntimeParams.mEnableAutoUpdateViewSize != null) {
          tmPlayTextur = this.mPlayTextureView;
          if (tmPlayTextur != null) {
             tmPlayTextur.removeOnLayoutChangeListener(this.mLayoutChangeListener);
          }
          this.enableAutoUpdateViewSize(p0);
       }
       this.mPlayTextureView = p0;
       if (p0 != null) {
          p0.a(this.mSurfaceTextureListener);
          tmPlayTextur = this.mPlayTextureView;
          WayneLivePlayer tmSurfaceVie = this.mSurfaceViewShowListener;
          Objects.requireNonNull(tmPlayTextur);
          if (!PatchProxy.applyVoidOneRefs(tmSurfaceVie, tmPlayTextur, LivePlayTextureView.class, "18")) {
             tmPlayTextur.c.add(tmSurfaceVie);
          }
          this.mSurface = this.mPlayTextureView.b(false);
       }
       DebugLog.i(this.getTag(), "setTextureViewtextureView"+p0+"mSurface"+this.mSurface);
       LivePlayerStatusMonitorImpl tmLiveMediaP = this.mLiveMediaPlayer;
       if (tmLiveMediaP != null) {
          tmLiveMediaP.setScreenOnWhilePlaying(true);
          if (!p2) {
             this.mLiveMediaPlayer.setSurface(this.mSurface);
          }else {
             WayneLivePlayer tmSurface = this.mSurface;
             if (tmSurface != null) {
                this.mLiveMediaPlayer.setSurface(tmSurface);
                this.releasePreviousSurface();
             }
          }
       }
       return;
    }
    public void setViewPixelSize(int p0,int p1){
       WayneLivePlayer wayneLivePla = WayneLivePlayer.class;
       if (PatchProxy.isSupport(wayneLivePla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, wayneLivePla, "92")) {
          return;
       }
       if (p0 >= 0 && p1 >= 0) {
          wayneLivePla = this.mLivePlayerRuntimeParams;
          if (wayneLivePla.mViewWidth == p0 && wayneLivePla.mViewHeight == p1) {
             return;
          }else {
             DebugLog.i(this.getTag(), "setViewPixelSizewidth"+p0+" height "+p1);
             wayneLivePla = this.mLivePlayerRuntimeParams;
             wayneLivePla.mViewWidth = p0;
             wayneLivePla.mViewHeight = p1;
             if (this.getLiveMediaPlayer() != null) {
                this.getLiveMediaPlayer().setViewSize(p0, p1);
             }
          }
       }
       return;
    }
    public void setVolume(float p0,float p1){
       WayneLivePlayer wayneLivePla = WayneLivePlayer.class;
       if (PatchProxy.isSupport(wayneLivePla) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, wayneLivePla, "36")) {
          return;
       }
       this.mPlayerVolumeLeft = p0;
       this.mPlayerVolumeRight = p1;
       this.applyMediaPlayerVolume();
       return;
    }
    public void startAudioOnlyMode(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "38")) {
          return;
       }
       if (this.mIsInAudioOnlyMode != null) {
          DebugLog.i(this.getTag(), "startAudioOnlyMode fail allReady in AudioOnlyMode");
          return;
       }else if(!this.isSupportAudioOnlyMode()){
          DebugLog.i(this.getTag(), "startAudioOnlyMode fail not support");
          return;
       }else {
          boolean b = true;
          this.mIsInAudioOnlyMode = b;
          LivePlayerStatusMonitorImpl tmLiveMediaP = this.mLiveMediaPlayer;
          if (tmLiveMediaP != null) {
             tmLiveMediaP.audioOnly(b);
             if (!q.f(this.mRenderListenerList)) {
                Iterator iterator = this.mRenderListenerList.iterator();
                while (iterator.hasNext()) {
                   iterator.next().onSwitchToAudioStreamFromVideoStream();
                }
             }
          }
          DebugLog.i(this.getTag(), "startAudioOnlyMode");
          return;
       }
    }
    public void startCache(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "11")) {
          return;
       }
       if (this.mLivePlayerCacheControllerManager.isStarted()) {
          this.mLogger.i("startCache intercepted, cache already started");
       }else {
          this.mLogger.i("startCache");
          this.mLivePlayerCacheControllerManager.start();
       }
       return;
    }
    public boolean startPlay(){
       Object obj = PatchProxy.apply(null, this, WayneLivePlayer.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.isDestroyed()) {
          DebugLog.i(this.getTag(), "startPlay fail destroyed");
          return b;
       }else if(!this.mPausePlayTokenSet.isEmpty()){
          DebugLog.i(this.getTag(), "startPlay fail token existmPausePlayTokenSet"+this.mPausePlayTokenSet);
          return b;
       }else {
          DebugLog.i(this.getTag(), "startPlay");
          return this.doStartPlay(this.getCurrentAdaptiveManifest());
       }
    }
    public boolean startPlay(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WayneLivePlayer.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       DebugLog.i(this.getTag(), "startPlay with tokentoken"+p0);
       this.mPausePlayTokenSet.remove(p0);
       return this.startPlay();
    }
    public void stopAudioOnlyMode(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "39")) {
          return;
       }
       if (this.mIsInAudioOnlyMode == null) {
          DebugLog.i(this.getTag(), "stopAudioOnlyMode fail not in audioOnlyMode");
          return;
       }else {
          boolean b = false;
          this.mIsInAudioOnlyMode = b;
          LivePlayerStatusMonitorImpl tmLiveMediaP = this.mLiveMediaPlayer;
          if (tmLiveMediaP != null) {
             tmLiveMediaP.audioOnly(b);
          }
          DebugLog.i(this.getTag(), "startAudioOnlyMode");
          return;
       }
    }
    public void stopCache(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "12")) {
          return;
       }
       if (!this.mLivePlayerCacheControllerManager.isStarted()) {
          this.mLogger.i("stopCache intercepted, cache already stopped");
       }else {
          this.mLogger.i("stopCache");
          this.mLivePlayerCacheControllerManager.end();
       }
       return;
    }
    public void stopPlay(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "29")) {
          return;
       }
       DebugLog.i(this.getTag(), "stopPlay");
       this.moveToState(new ArrayList(), LivePlayerState.STOP);
       return;
    }
    public void stopPlay(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "30")) {
          return;
       }
       DebugLog.i(this.getTag(), "stopPlay with token "+p0);
       this.mPausePlayTokenSet.add(p0);
       this.stopPlay();
       return;
    }
    public void tryCallOnLivePlayViewShow(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "103")) {
          return;
       }
       if (this.mIsVideoRenderingStarted != null) {
          WayneLivePlayer tmPlayTextur = this.mPlayTextureView;
          if (tmPlayTextur != null && (!tmPlayTextur.d() || this.mIsSurfaceViewShow != null)) {
             Iterator iterator = this.mRenderListenerList.iterator();
             while (iterator.hasNext()) {
                iterator.next().onLivePlayViewShow();
             }
          }
       }
       return;
    }
    public void trySwitchUrlWhenPlayerCriticalError(int p0,int p1){
       WayneLivePlayer wayneLivePla = WayneLivePlayer.class;
       if (PatchProxy.isSupport(wayneLivePla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, wayneLivePla, "102")) {
          return;
       }
       wayneLivePla = this.mLiveDataSourceManager;
       if (wayneLivePla != null) {
          wayneLivePla.trySwitchUrlWhenPlayerCriticalError(p0, p1);
       }
       return;
    }
    public void unMute(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "35")) {
          return;
       }
       this.mIsMute = false;
       this.applyMediaPlayerVolume();
       DebugLog.i(this.getTag(), "unMute");
       return;
    }
    public final void updateCurrentPlayUrlInfo(LiveAdaptiveManifest p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "87")) {
          return;
       }
       if (p0 != null) {
          LivePlayerUtils.updatePlayUrlInfo(this.mCurrentPlayUrlInfo, p0, this.getCurrentLiveQualityItem().mQualityType);
          DebugLog.i(this.getTag(), " updateCurrentPlayUrlInfo "+this.mCurrentPlayUrlInfo.toString());
       }
       return;
    }
    public void updateDataSource(ILiveDatasource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "8")) {
          return;
       }
       this.updateDataSourceInternal(p0);
       return;
    }
    public void updateDataSource(LiveDataSource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "9")) {
          return;
       }
       this.updateDataSource(p0.tranforms2ILiveDatasource(this.isEnableWebRTCManifest()));
       return;
    }
    public void updateDataSourceInternal(ILiveDatasource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer.class, "10")) {
          return;
       }
       DebugLog.i(this.getTag(), "updateDataSource, "+p0);
       if (p0 == null) {
          DebugLog.e(this.getTag(), "liveDataSource is null");
          return;
       }else {
          this.getProcessor(RepresentationProcessor.class).initLiveQuality(p0);
          this.mLiveDataSourceManager.updateDataSource(p0, this.getCurrentLiveQualityItem().mQualityType);
          this.getProcessor(StaticsProcessor.class).updateSource(p0);
          this.mIsNeedUpdateFallbackDomain = true;
          return;
       }
    }
    public void updatePlayDuration(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer.class, "85")) {
          return;
       }
       if (this.mStartPlayTimeMs) {
          this.mPlayDurationMs = (this.mPlayDurationMs + System.currentTimeMillis()) - this.mStartPlayTimeMs;
          this.mStartPlayTimeMs = 0;
       }
       return;
    }
    public void updateWebRTCParams(boolean p0,String p1){
       WayneLivePlayer wayneLivePla = WayneLivePlayer.class;
       if (PatchProxy.isSupport(wayneLivePla) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, wayneLivePla, "89")) {
          return;
       }
       this.mLivePlayerRuntimeParams.mPlayerWebRTCParams.setEnableWebRTCManifest(p0);
       this.mLivePlayerRuntimeParams.mPlayerWebRTCParams.setConfigWebRTC(p1);
       return;
    }
}
