package com.kwai.video.player.kwai_player.KwaiSystemMediaPlayer;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.player.AbstractMediaPlayer;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.video.player.surface.KwaiSurfaceManager;
import com.kwai.player.debuginfo.model.KwaiPlayerDebugInfo;
import android.media.MediaPlayer;
import com.kwai.video.player.kwai_player.KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder;
import com.kwai.video.player.kwai_player.DummyAspectAwesomeCache;
import com.kwai.video.player.kwai_player.KwaiSystemPlayerQos;
import com.kwai.video.player.kwai_player.KwaiSystemMediaPlayer$PlayerState;
import ai7.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnBufferingUpdateListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnSeekCompleteListener;
import android.media.MediaPlayer$OnVideoSizeChangedListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnInfoListener;
import com.kwai.player.qos.KwaiPlayerResultQos;
import com.kwai.player.qos.AppLiveAdaptiveRealtimeInfo;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import com.kwai.player.debuginfo.model.AppLiveQosDebugInfo;
import com.kwai.video.player.kwai_player.AspectAwesomeCache;
import com.kwai.video.player.kwai_player.AspectKFlv;
import com.kwai.video.player.kwai_player.AspectKwaiVodAdaptive;
import java.lang.Number;
import java.lang.Throwable;
import com.kwai.video.player.pragma.DebugLog;
import com.kwai.player.KwaiRepresentation;
import com.kwai.video.player.MediaInfo;
import com.kwai.player.debuginfo.model.AppVodQosDebugInfoNew;
import com.kwai.player.debuginfo.model.PlayerConfigDebugInfo;
import java.util.Map;
import com.kwai.video.player.kwai_player.ProductContext;
import android.graphics.Bitmap;
import java.lang.Float;
import android.os.Build$VERSION;
import android.media.PlaybackParams;
import com.kwai.player.qos.KwaiQosInfo;
import android.view.Surface;
import com.kwai.video.player.misc.ITrackInfo;
import com.kwai.video.player.misc.AndroidTrackInfo;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.lang.Integer;
import ai7.e;
import com.kwai.video.player.kwai_player.KwaiSystemMediaPlayer$1;
import java.lang.Runnable;
import ai7.c;
import android.media.MediaDataSource;
import java.io.IOException;
import java.lang.Long;
import org.json.JSONObject;
import android.content.Context;
import android.net.Uri;
import com.kwai.video.player.misc.IMediaDataSource;
import com.kwai.video.player.kwai_player.KwaiSystemMediaPlayer$MediaDataSourceProxy;
import java.io.FileDescriptor;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.graphics.SurfaceTexture;
import com.kwai.video.player.IKwaiRepresentationListener;
import com.kwai.video.player.IKwaiBulletScreenListener;
import com.kwai.video.player.IKwaiInjectHttpCallback;
import com.kwai.video.player.IKwaiSubtitleListener;
import com.kwai.video.player.IKwaiVodDrmCallback;
import com.kwai.video.player.IMediaPlayer$OnLiveAdaptiveQosStatListener;
import com.kwai.video.player.IMediaPlayer$OnQosStatListener;
import com.kwai.video.player.IMediaPlayer$OnABLoopEndOfCounterListener;
import com.kwai.video.player.KsMediaPlayer$OnAudioProcessPCMListener;
import com.kwai.video.player.IMediaPlayer$OnLiveEventListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveExtraInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSrvTsptInfoListener;
import com.kwai.video.player.IMediaPlayer$OnLiveVoiceCommentListener;
import com.kwai.video.player.OnQosEventInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnVideoRenderListener;
import com.kwai.video.player.IMediaPlayer$OnVideoRawDataListener;
import com.kwai.player.KwaiPlayerConfig;

public class KwaiSystemMediaPlayer extends AbstractMediaPlayer implements IKwaiMediaPlayer	// class@000b4a
{
    public AspectAwesomeCache mAspectAwesomeCache;
    public Context mContext;
    public String mDataSource;
    public final Object mInitLock;
    public final KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder mInternalListenerAdapter;
    public final MediaPlayer mInternalMediaPlayer;
    public boolean mIsReleased;
    public KwaiPlayerDebugInfo mKwaiPlayerDebugInfo;
    public KwaiSystemPlayerQos mKwaiQos;
    public String mManifest;
    public MediaDataSource mMediaDataSource;
    public AtomicBoolean mOnPrepared;
    public KwaiSystemMediaPlayer$PlayerState mPlayerState;
    public long mSeekAtStart;
    public float mSpeed;
    public final KwaiSurfaceManager mSurfaceManager;
    public AspectKwaiVodAdaptive mVodAdaptive;
    public static final String TAG = "com.kwai.video.player.kwai_player.KwaiSystemMediaPlayer";
    public static MediaInfo sMediaInfo;

    public void KwaiSystemMediaPlayer(){
       super();
       Object obj = new Object();
       this.mInitLock = obj;
       this.mIsReleased = false;
       this.mSpeed = 0x3f800000;
       this.mOnPrepared = new AtomicBoolean(false);
       this.mSurfaceManager = new KwaiSurfaceManager();
       this.mKwaiPlayerDebugInfo = new KwaiPlayerDebugInfo();
       this.mSeekAtStart = 0;
       _monitor_enter(obj);
       MediaPlayer mediaPlayer = new MediaPlayer();
       this.mInternalMediaPlayer = mediaPlayer;
       _monitor_exit(obj);
       mediaPlayer.setAudioStreamType(3);
       this.mInternalListenerAdapter = new KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder(this, this);
       this.mAspectAwesomeCache = new DummyAspectAwesomeCache(this);
       this.mKwaiQos = new KwaiSystemPlayerQos(this);
       this.attachInternalListeners();
       this.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_IDLE;
    }
    public int addBulletScreen(b p0){
       return -1;
    }
    public int addBulletScreenWithParam(int p0,int p1,int p2,String p3){
       return -1;
    }
    public int addSubtitle(String p0,boolean p1){
       return -1;
    }
    public void addVideoRawBuffer(byte[] p0){
    }
    public final void attachInternalListeners(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemMediaPlayer.class, "1")) {
          return;
       }
       this.mInternalMediaPlayer.setOnPreparedListener(this.mInternalListenerAdapter);
       this.mInternalMediaPlayer.setOnBufferingUpdateListener(this.mInternalListenerAdapter);
       this.mInternalMediaPlayer.setOnCompletionListener(this.mInternalListenerAdapter);
       this.mInternalMediaPlayer.setOnSeekCompleteListener(this.mInternalListenerAdapter);
       this.mInternalMediaPlayer.setOnVideoSizeChangedListener(this.mInternalListenerAdapter);
       this.mInternalMediaPlayer.setOnErrorListener(this.mInternalListenerAdapter);
       this.mInternalMediaPlayer.setOnInfoListener(this.mInternalListenerAdapter);
       return;
    }
    public void audioOnly(boolean p0){
    }
    public int bufferEmptyCount(){
       return 0;
    }
    public int bufferEmptyCountOld(){
       return 0;
    }
    public long bufferEmptyDuration(){
       return 0;
    }
    public long bufferEmptyDurationOld(){
       return 0;
    }
    public boolean checkCanStartPlay(){
       return true;
    }
    public void disableSoftVideoDecode(boolean p0){
    }
    public void dumpDebugInfo(KwaiPlayerResultQos p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiSystemMediaPlayer.class, "43")) {
          return;
       }
       return;
    }
    public void enableAudioMono(int p0){
    }
    public void enableLoopOnBlock(int p0,int p1,long p2){
    }
    public void enableMediacodecDummy(boolean p0){
    }
    public boolean getAPJoySoundSwitchStatus(){
       return false;
    }
    public AppLiveAdaptiveRealtimeInfo getAppLiveAdaptiveRealtimeInfo(){
       Object obj = PatchProxy.apply(null, this, KwaiSystemMediaPlayer.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AppLiveAdaptiveRealtimeInfo.from(null);
    }
    public AppLiveQosDebugInfo getAppLiveQosDebugInfo(){
       Object obj = PatchProxy.apply(null, this, KwaiSystemMediaPlayer.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AppLiveQosDebugInfo.from(null);
    }
    public AspectAwesomeCache getAspectAwesomeCache(){
       return this.mAspectAwesomeCache;
    }
    public AspectKFlv getAspectKFlv(){
       return null;
    }
    public AspectKwaiVodAdaptive getAspectVodAdaptive(){
       return null;
    }
    public long getAudioCachedDuration(){
       return 0;
    }
    public float getAudioRawLatencySeconds(){
       return 0;
    }
    public int getAudioSessionId(){
       Object obj = PatchProxy.apply(null, this, KwaiSystemMediaPlayer.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mInternalMediaPlayer.getAudioSessionId();
    }
    public float getAverageDisplayFps(){
       return 25.00f;
    }
    public long getBitrate(){
       return 0;
    }
    public String getBriefVodStatJson(){
       Object obj = PatchProxy.apply(null, this, KwaiSystemMediaPlayer.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mKwaiQos.getBriefVodStatJson();
    }
    public float getBufferTimeMax(){
       return 0;
    }
    public long getCurAbsTime(){
       return 0;
    }
    public int getCurPlayingId(){
       return 0;
    }
    public String getCurPlayingUrl(){
       return null;
    }
    public int getCurrentAudioRepresentationId(){
       return -1;
    }
    public long getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, KwaiSystemMediaPlayer.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       try{
          return (long)this.mInternalMediaPlayer.getCurrentPosition();
       }catch(java.lang.IllegalStateException e0){
          DebugLog.printStackTrace(e0);
          return 0;
       }
    }
    public KwaiRepresentation getCurrentRepresentation(){
       return null;
    }
    public int getCurrentRepresentationId(){
       return -1;
    }
    public String getCurrentTranscodeType(){
       return null;
    }
    public long getCurrentVideoPosition(){
       return 0;
    }
    public String getDataSource(){
       return this.mDataSource;
    }
    public KwaiPlayerDebugInfo getDebugInfo(){
       KwaiSystemMediaPlayer obj = PatchProxy.apply(null, this, KwaiSystemMediaPlayer.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mKwaiPlayerDebugInfo.mAppVodQosDebugInfo.metaAudioDecoderInfo = this.getMediaInfo().mAudioDecoder;
       this.mKwaiPlayerDebugInfo.mAppVodQosDebugInfo.metaVideoDecoderInfo = this.getMediaInfo().mVideoDecoder;
       this.mKwaiPlayerDebugInfo.mAppVodQosDebugInfo.metaDurationMs = this.getDuration();
       this.mKwaiPlayerDebugInfo.mAppVodQosDebugInfo.currentPositionMs = this.getCurrentPosition();
       this.mKwaiPlayerDebugInfo.mAppVodQosDebugInfo.metaFps = this.getVideoAvgFps();
       this.mKwaiPlayerDebugInfo.mAppVodQosDebugInfo.bitrate = this.getBitrate();
       this.mKwaiPlayerDebugInfo.mAppVodQosDebugInfo.metaHeight = this.getVideoHeight();
       this.mKwaiPlayerDebugInfo.mAppVodQosDebugInfo.metaWidth = this.getVideoWidth();
       obj = this.mKwaiPlayerDebugInfo;
       obj.mPlayerApplyConfig.inputUrl = this.mDataSource;
       return obj;
    }
    public long getDecodeVideoFrameCount(){
       return 0;
    }
    public long getDecodedDataSize(){
       return 0;
    }
    public long getDecodedVideoHeight(){
       return 720;
    }
    public long getDecodedVideoWidth(){
       return 1280;
    }
    public long getDisplayFrameCount(){
       return 0;
    }
    public long getDownloadDataSize(){
       return 0;
    }
    public int getDownloadedPercent(){
       return 0;
    }
    public long getDroppedDuration(){
       return 0;
    }
    public long getDtsDuration(){
       return 0;
    }
    public long getDuration(){
       Object obj = PatchProxy.apply(null, this, KwaiSystemMediaPlayer.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       int i = 0;
       try{
          KwaiSystemMediaPlayer tmPlayerStat = this.mPlayerState;
          if (tmPlayerStat != KwaiSystemMediaPlayer$PlayerState.STATE_PREPARED && (tmPlayerStat != KwaiSystemMediaPlayer$PlayerState.STATE_STARTED && (tmPlayerStat != KwaiSystemMediaPlayer$PlayerState.STATE_PAUSED && (tmPlayerStat == KwaiSystemMediaPlayer$PlayerState.STATE_STOPPED || tmPlayerStat == KwaiSystemMediaPlayer$PlayerState.STATE_COMPLETE)))) {
             return (long)this.mInternalMediaPlayer.getDuration();
          }
          return i;
       }catch(java.lang.IllegalStateException e2){
          DebugLog.printStackTrace(e2);
          return i;
       }
    }
    public Map getExtraQosInfo(){
       return null;
    }
    public long getFirstVideoPts(){
       return 0;
    }
    public String getKflvVideoPlayingUrl(){
       return null;
    }
    public String getKwaiLiveVoiceComment(long p0){
       return "";
    }
    public KwaiSystemPlayerQos getKwaiQos(){
       return this.mKwaiQos;
    }
    public String getKwaiSign(){
       return null;
    }
    public String getKwaivppFilters(){
       return "";
    }
    public long getLastVideoPts(){
       return 0;
    }
    public String getLiveRealTimeQosJson(int p0,int p1,long p2,long p3,long p4){
       return "";
    }
    public String getLiveStatJson(){
       return "";
    }
    public MediaInfo getMediaInfo(){
       MediaInfo obj = PatchProxy.apply(null, this, KwaiSystemMediaPlayer.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (KwaiSystemMediaPlayer.sMediaInfo == null) {
          obj = new MediaInfo();
          obj.mVideoDecoder = "android";
          obj.mVideoDecoderImpl = "HW";
          obj.mAudioDecoder = "android";
          obj.mAudioDecoderImpl = "HW";
          KwaiSystemMediaPlayer.sMediaInfo = obj;
       }
       return KwaiSystemMediaPlayer.sMediaInfo;
    }
    public Bundle getMediaMeta(){
       return null;
    }
    public int getOrientationDegrees(){
       return 0;
    }
    public long getPlayerId(){
       return -1;
    }
    public ProductContext getPlayerProductContext(){
       return null;
    }
    public String getPlayerTsJson(){
       return null;
    }
    public float getProbeFps(){
       return 25.00f;
    }
    public long getReadVideoFrameCount(){
       return 0;
    }
    public Bitmap getScreenShot(){
       return null;
    }
    public long getSeekAtStart(){
       return this.mSeekAtStart;
    }
    public String getServerAddress(){
       return null;
    }
    public long getSourceDeviceType(){
       return 0;
    }
    public float getSpeed(float p0){
       PlaybackParams obj;
       KwaiSystemMediaPlayer kwaiSystemMe = KwaiSystemMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiSystemMe)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, kwaiSystemMe, "34");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       if (!this.mOnPrepared.get()) {
          return 0x3f800000;
       }else if(Build$VERSION.SDK_INT >= 23){
          try{
             obj = this.mInternalMediaPlayer.getPlaybackParams();
             if (obj != null) {
                return obj.getSpeed();
             }
          }catch(java.lang.Exception e0){
          }
       }
       return e0;
    }
    public String getStreamId(){
       return null;
    }
    public KwaiQosInfo getStreamQosInfo(){
       Object obj = PatchProxy.apply(null, this, KwaiSystemMediaPlayer.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiQosInfo.fromBundle(null);
    }
    public Surface getSurface(){
       Object obj = PatchProxy.apply(null, this, KwaiSystemMediaPlayer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mSurfaceManager.getSurface();
    }
    public int getTotalPlayBackDuration(){
       return 0;
    }
    public ITrackInfo[] getTrackInfo(){
       Object obj = PatchProxy.apply(null, this, KwaiSystemMediaPlayer.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AndroidTrackInfo.fromMediaPlayer(this.mInternalMediaPlayer);
    }
    public int getVideoAlphaType(){
       return 0;
    }
    public float getVideoAvgFps(){
       return 25.00f;
    }
    public long getVideoCachedDuration(){
       return 0;
    }
    public long getVideoDecErrorCount(){
       return 0;
    }
    public int getVideoDecoder(){
       return 0;
    }
    public int getVideoHeight(){
       Object obj = PatchProxy.apply(null, this, KwaiSystemMediaPlayer.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mInternalMediaPlayer.getVideoHeight();
    }
    public float getVideoOutputFramesPerSecond(){
       return 0;
    }
    public int getVideoSarDen(){
       return 1;
    }
    public int getVideoSarNum(){
       return 1;
    }
    public int getVideoWidth(){
       Object obj = PatchProxy.apply(null, this, KwaiSystemMediaPlayer.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mInternalMediaPlayer.getVideoWidth();
    }
    public String getVodAdaptiveCacheKey(){
       return null;
    }
    public String getVodAdaptiveHdrType(){
       return null;
    }
    public String getVodAdaptiveHostName(){
       return null;
    }
    public int getVodAdaptiveRepID(){
       return 0;
    }
    public String getVodAdaptiveUrl(){
       return null;
    }
    public String getVodStatJson(){
       Object obj = PatchProxy.apply(null, this, KwaiSystemMediaPlayer.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mKwaiQos.getVodStatJson();
    }
    public String getXksCache(){
       return null;
    }
    public boolean handleTouchEvent(MotionEvent p0){
       return false;
    }
    public boolean hasNativeCdnRetry(){
       return false;
    }
    public boolean isAudioOnly(){
       return false;
    }
    public boolean isLiveManifest(){
       return false;
    }
    public boolean isLooping(){
       Object obj = PatchProxy.apply(null, this, KwaiSystemMediaPlayer.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mInternalMediaPlayer.isLooping();
    }
    public boolean isMediaPlayerValid(){
       return true;
    }
    public boolean isPlayable(){
       return true;
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, KwaiSystemMediaPlayer.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          boolean b = this.mInternalMediaPlayer.isPlaying();
          KwaiSystemMediaPlayer tmPlayerStat = this.mPlayerState;
          KwaiSystemMediaPlayer$PlayerState sTATE_STARTE = KwaiSystemMediaPlayer$PlayerState.STATE_STARTED;
          if (tmPlayerStat == sTATE_STARTE && !b) {
             this.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_PAUSED;
          }else if(tmPlayerStat == KwaiSystemMediaPlayer$PlayerState.STATE_PAUSED && b){
             this.mPlayerState = sTATE_STARTE;
          }
          return b;
       }catch(java.lang.IllegalStateException e0){
          DebugLog.printStackTrace(e0);
          return false;
       }
    }
    public boolean isRepresentationEnableAdaptive(int p0){
       return false;
    }
    public void notifyKwaiOnInfo(int p0,int p1){
       KwaiSystemMediaPlayer kwaiSystemMe = KwaiSystemMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiSystemMe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, kwaiSystemMe, "32")) {
          return;
       }
       this.notifyOnInfo(p0, p1);
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemMediaPlayer.class, "23")) {
          return;
       }
       if (this.mPlayerState == KwaiSystemMediaPlayer$PlayerState.STATE_STARTED) {
          this.mInternalMediaPlayer.pause();
          this.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_PAUSED;
       }
       return;
    }
    public void prepareAsync(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemMediaPlayer.class, "26")) {
          return;
       }
       KwaiSystemMediaPlayer tmPlayerStat = this.mPlayerState;
       if (tmPlayerStat == KwaiSystemMediaPlayer$PlayerState.STATE_INITIALIZED || tmPlayerStat == KwaiSystemMediaPlayer$PlayerState.STATE_STOPPED) {
          this.mKwaiQos.onPrepareStart();
          this.mInternalMediaPlayer.prepareAsync();
          this.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_PREPARING;
       }
       return;
    }
    public void realSetSpeed(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemMediaPlayer.class, "42")) {
          return;
       }
       try{
          if (Build$VERSION.SDK_INT >= 23) {
             if (this.mPlayerState == KwaiSystemMediaPlayer$PlayerState.STATE_STOPPED) {
                return;
             }else {
                PlaybackParams playbackPara = this.mInternalMediaPlayer.getPlaybackParams();
                if (playbackPara != null) {
                   playbackPara.setSpeed(this.mSpeed);
                }else {
                   playbackPara = new PlaybackParams().setSpeed(this.mSpeed);
                }
                this.mInternalMediaPlayer.setPlaybackParams(playbackPara);
                KwaiSystemMediaPlayer tmSpeed = this.mSpeed;
                KwaiSystemMediaPlayer$PlayerState playerState = null;
                if (!tmSpeed - playerState && this.mPlayerState == KwaiSystemMediaPlayer$PlayerState.STATE_STARTED) {
                   this.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_PAUSED;
                }else if(tmSpeed - playerState){
                   tmSpeed = this.mPlayerState;
                   if (tmSpeed != KwaiSystemMediaPlayer$PlayerState.STATE_PREPARED && (tmSpeed == KwaiSystemMediaPlayer$PlayerState.STATE_PAUSED || tmSpeed == KwaiSystemMediaPlayer$PlayerState.STATE_COMPLETE)) {
                      this.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_STARTED;
                   }
                }
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void registerSensorEvent(){
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemMediaPlayer.class, "15")) {
          return;
       }
       this.mIsReleased = true;
       this.mInternalMediaPlayer.release();
       this.releaseMediaDataSource();
       this.resetListeners();
       this.attachInternalListeners();
       return;
    }
    public void releaseAsync(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemMediaPlayer.class, "40")) {
          return;
       }
       this.release();
       return;
    }
    public void releaseAsync(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiSystemMediaPlayer.class, "41")) {
          return;
       }
       c.a(new KwaiSystemMediaPlayer$1(this, p0));
       return;
    }
    public final void releaseMediaDataSource(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemMediaPlayer.class, "14")) {
          return;
       }
       KwaiSystemMediaPlayer tmMediaDataS = this.mMediaDataSource;
       if (tmMediaDataS != null) {
          try{
             tmMediaDataS.close();
          }catch(java.io.IOException e0){
             e0.printStackTrace();
          }
          this.mMediaDataSource = null;
       }
       return;
    }
    public int removeBulletScreen(int p0){
       return -1;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemMediaPlayer.class, "13")) {
          return;
       }
       try{
          this.mInternalMediaPlayer.reset();
       }catch(java.lang.IllegalStateException e0){
          DebugLog.printStackTrace(e0);
       }
       this.releaseMediaDataSource();
       this.resetListeners();
       this.attachInternalListeners();
       this.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_IDLE;
       return;
    }
    public void seekAtStart(long p0){
       this.mSeekAtStart = p0;
    }
    public void seekTo(long p0){
       KwaiSystemMediaPlayer kwaiSystemMe = KwaiSystemMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiSystemMe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, kwaiSystemMe, "18")) {
          return;
       }
       kwaiSystemMe = this.mPlayerState;
       if (kwaiSystemMe != KwaiSystemMediaPlayer$PlayerState.STATE_PREPARED && (kwaiSystemMe != KwaiSystemMediaPlayer$PlayerState.STATE_STARTED && (kwaiSystemMe == KwaiSystemMediaPlayer$PlayerState.STATE_PAUSED || kwaiSystemMe == KwaiSystemMediaPlayer$PlayerState.STATE_COMPLETE))) {
          this.mKwaiQos.onSeekStart();
          this.mInternalMediaPlayer.seekTo((int)p0);
       }
       return;
    }
    public void setAPJoySoundSwitchStatus(boolean p0){
    }
    public void setAbLoop(long p0,long p1,int p2){
    }
    public void setAbLoop(long p0,long p1,int p2,boolean p3){
    }
    public void setAppQosStatJson(JSONObject p0){
    }
    public void setAudioRepresentation(int p0){
    }
    public void setAudioStreamType(int p0){
       KwaiSystemMediaPlayer kwaiSystemMe = KwaiSystemMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiSystemMe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiSystemMe, "9")) {
          return;
       }
       kwaiSystemMe = this.mPlayerState;
       if (kwaiSystemMe == KwaiSystemMediaPlayer$PlayerState.STATE_PREPARED || (kwaiSystemMe == KwaiSystemMediaPlayer$PlayerState.STATE_STARTED || (kwaiSystemMe != KwaiSystemMediaPlayer$PlayerState.STATE_PAUSED && kwaiSystemMe != KwaiSystemMediaPlayer$PlayerState.STATE_COMPLETE))) {
          this.mInternalMediaPlayer.setAudioStreamType(p0);
       }
    label_002d :
       return;
    }
    public void setCencKey(String p0){
    }
    public void setClickCoordForOpaque(float p0,float p1){
    }
    public void setContext(Context p0){
       this.mContext = p0;
    }
    public void setDataSource(Context p0,Uri p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiSystemMediaPlayer.class, "27")) {
          return;
       }
       this.mDataSource = p1.toString();
       this.mInternalMediaPlayer.setDataSource(p0, p1);
       this.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_INITIALIZED;
       return;
    }
    public void setDataSource(Context p0,Uri p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KwaiSystemMediaPlayer.class, "28")) {
          return;
       }
       this.mDataSource = p1.toString();
       this.mInternalMediaPlayer.setDataSource(p0, p1, p2);
       this.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_INITIALIZED;
       return;
    }
    public void setDataSource(IMediaDataSource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiSystemMediaPlayer.class, "31")) {
          return;
       }
       this.releaseMediaDataSource();
       KwaiSystemMediaPlayer$MediaDataSourceProxy mediaDataSou = new KwaiSystemMediaPlayer$MediaDataSourceProxy(p0);
       this.mMediaDataSource = mediaDataSou;
       this.mInternalMediaPlayer.setDataSource(mediaDataSou);
       this.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_INITIALIZED;
       return;
    }
    public void setDataSource(FileDescriptor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiSystemMediaPlayer.class, "29")) {
          return;
       }
       this.mInternalMediaPlayer.setDataSource(p0);
       this.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_INITIALIZED;
       return;
    }
    public void setDataSource(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiSystemMediaPlayer.class, "30")) {
          return;
       }
       this.mDataSource = p0;
       Uri uri = Uri.parse(p0);
       String scheme = uri.getScheme();
       if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase("file")) {
          this.mInternalMediaPlayer.setDataSource(uri.getPath());
       }else {
          this.mInternalMediaPlayer.setDataSource(p0);
       }
       this.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_INITIALIZED;
       return;
    }
    public void setDataSource(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiSystemMediaPlayer.class, "46")) {
          return;
       }
       this.mDataSource = p0;
       this.mInternalMediaPlayer.setDataSource(this.mContext, Uri.parse(p0), p1);
       this.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_INITIALIZED;
       return;
    }
    public void setDisplay(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiSystemMediaPlayer.class, "33")) {
          return;
       }
       KwaiSystemMediaPlayer tmInitLock = this.mInitLock;
       _monitor_enter(tmInitLock);
       if (this.mIsReleased == null) {
          this.mSurfaceManager.asSurfaceHolder(p0);
          this.mInternalMediaPlayer.setDisplay(p0);
       }
       _monitor_exit(tmInitLock);
       return;
    }
    public void setDrmKeyInfo(String p0,int p1,int p2){
    }
    public void setEnableAudioSpectrum(boolean p0){
    }
    public void setExtOption(int p0,int p1){
    }
    public void setExtOption(int p0,String p1){
    }
    public void setExtSurface(Surface p0){
    }
    public void setExtSurfaceCrop(float p0,float p1,float p2,float p3){
    }
    public void setExtSurfaceCrop(int p0,int p1,int p2,int p3){
    }
    public void setExtSurfaceTexture(SurfaceTexture p0){
    }
    public void setIndexContent(String p0,String p1,String p2,Map p3){
    }
    public void setInteractiveMode(int p0){
    }
    public void setKeepInBackground(boolean p0){
    }
    public void setKwaiAudioRepresentationListener(IKwaiRepresentationListener p0){
    }
    public void setKwaiBulletScreenListener(IKwaiBulletScreenListener p0){
    }
    public void setKwaiInjectHttpCallback(IKwaiInjectHttpCallback p0){
    }
    public void setKwaiManifest(String p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KwaiSystemMediaPlayer.class, "45")) {
          return;
       }
       this.mDataSource = p0;
       this.mManifest = p1;
       this.mInternalMediaPlayer.setDataSource(this.mContext, Uri.parse(p0), p2);
       this.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_INITIALIZED;
       return;
    }
    public void setKwaiRepresentationListener(IKwaiRepresentationListener p0){
    }
    public void setKwaiSubtitleListener(IKwaiSubtitleListener p0){
    }
    public void setKwaiVodDrmCallback(IKwaiVodDrmCallback p0){
    }
    public void setKwaivppExtJson(int p0,String p1){
    }
    public void setKwaivppFilters(int p0,String p1){
    }
    public void setKwaivppKswitchJson(int p0,String p1){
    }
    public void setLastTryFlag(boolean p0){
    }
    public void setLiveManifestSwitchMode(int p0){
    }
    public void setLiveOnPeriodicalLiveAdaptiveQosStatListener(IMediaPlayer$OnLiveAdaptiveQosStatListener p0){
    }
    public void setLiveOnQosStatListener(IMediaPlayer$OnQosStatListener p0){
    }
    public void setLooping(boolean p0){
       KwaiSystemMediaPlayer kwaiSystemMe = KwaiSystemMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiSystemMe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiSystemMe, "7")) {
          return;
       }
       this.mInternalMediaPlayer.setLooping(p0);
       return;
    }
    public void setNetworkRetryScene(String p0){
    }
    public void setOnABLoopEndOfCounterListener(IMediaPlayer$OnABLoopEndOfCounterListener p0){
    }
    public void setOnAudioProcessPCMAvailableListener(KsMediaPlayer$OnAudioProcessPCMListener p0){
    }
    public void setOnLiveEventListener(IMediaPlayer$OnLiveEventListener p0){
    }
    public void setOnLiveExtraInfoListener(IKwaiMediaPlayer$OnLiveExtraInfoListener p0){
    }
    public void setOnLiveInterActiveListener(IKwaiMediaPlayer$OnLiveInterActiveListener p0){
    }
    public void setOnLiveInterActiveListener(IKwaiMediaPlayer$OnLiveInterActiveListener p0,IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType p1){
    }
    public void setOnLiveSeiInfoListener(IKwaiMediaPlayer$OnLiveSeiInfoListener p0){
    }
    public void setOnLiveSrvTsptInfoListener(IKwaiMediaPlayer$OnLiveSrvTsptInfoListener p0){
    }
    public void setOnLiveVoiceCommentListener(IMediaPlayer$OnLiveVoiceCommentListener p0){
    }
    public void setOnQosEventInfoListener(OnQosEventInfoListener p0){
    }
    public void setOnVideoRenderListener(IKwaiMediaPlayer$OnVideoRenderListener p0){
    }
    public void setOption(int p0,String p1,long p2){
    }
    public void setOption(int p0,String p1,String p2){
    }
    public void setPlayerMute(boolean p0){
    }
    public void setRepresentation(int p0){
    }
    public void setScreenOnWhilePlaying(boolean p0){
       KwaiSystemMediaPlayer kwaiSystemMe = KwaiSystemMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiSystemMe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiSystemMe, "22")) {
          return;
       }
       this.mInternalMediaPlayer.setScreenOnWhilePlaying(p0);
       return;
    }
    public void setSpeed(float p0){
       KwaiSystemMediaPlayer kwaiSystemMe = KwaiSystemMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiSystemMe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, kwaiSystemMe, "39")) {
          return;
       }
       this.mSpeed = p0;
       if (this.mOnPrepared.get() && this.isPlaying()) {
          this.realSetSpeed();
       }
       return;
    }
    public void setSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiSystemMediaPlayer.class, "2")) {
          return;
       }
       this.mSurfaceManager.asSurface(p0);
       this.mInternalMediaPlayer.setSurface(this.mSurfaceManager.getSurface());
       return;
    }
    public void setSurfaceTexture(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiSystemMediaPlayer.class, "4")) {
          return;
       }
       this.mSurfaceManager.asSurfaceTexture(p0);
       this.mInternalMediaPlayer.setSurface(this.mSurfaceManager.getSurface());
       return;
    }
    public void setSutitleSelected(int p0,boolean p1){
    }
    public void setTag1(int p0){
    }
    public void setTone(int p0){
    }
    public void setVideoRawDataListener(IMediaPlayer$OnVideoRawDataListener p0){
    }
    public void setVideoScalingMode(int p0){
    }
    public void setViewSize(int p0,int p1){
    }
    public void setViewSize(int p0,int p1,float p2){
    }
    public void setVolume(float p0,float p1){
       KwaiSystemMediaPlayer kwaiSystemMe = KwaiSystemMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiSystemMe) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, kwaiSystemMe, "12")) {
          return;
       }
       this.mInternalMediaPlayer.setVolume(p0, p1);
       return;
    }
    public void setWakeMode(Context p0,int p1){
       KwaiSystemMediaPlayer kwaiSystemMe = KwaiSystemMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiSystemMe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, kwaiSystemMe, "8")) {
          return;
       }
       this.mInternalMediaPlayer.setWakeMode(p0, p1);
       return;
    }
    public void setupAspectKwaiVodAdaptive(boolean p0){
    }
    public void shutdownWaitStop(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemMediaPlayer.class, "44")) {
          return;
       }
       this.stop();
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemMediaPlayer.class, "25")) {
          return;
       }
       KwaiSystemMediaPlayer tmPlayerStat = this.mPlayerState;
       if (tmPlayerStat != KwaiSystemMediaPlayer$PlayerState.STATE_PREPARED && (tmPlayerStat == KwaiSystemMediaPlayer$PlayerState.STATE_COMPLETE || tmPlayerStat == KwaiSystemMediaPlayer$PlayerState.STATE_PAUSED)) {
          tmPlayerStat = this.mSeekAtStart;
          if (tmPlayerStat > 0) {
             this.seekTo(tmPlayerStat);
             this.mSeekAtStart = 0;
          }
          this.realSetSpeed();
          this.mInternalMediaPlayer.start();
          this.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_STARTED;
       }
       return;
    }
    public void startLiveStatTimer(KwaiPlayerConfig p0){
    }
    public void stepFrame(){
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemMediaPlayer.class, "24")) {
          return;
       }
       KwaiSystemMediaPlayer tmPlayerStat = this.mPlayerState;
       if (tmPlayerStat != KwaiSystemMediaPlayer$PlayerState.STATE_STARTED && (tmPlayerStat != KwaiSystemMediaPlayer$PlayerState.STATE_PREPARED && (tmPlayerStat == KwaiSystemMediaPlayer$PlayerState.STATE_PAUSED || tmPlayerStat == KwaiSystemMediaPlayer$PlayerState.STATE_COMPLETE))) {
          this.mInternalMediaPlayer.stop();
          this.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_STOPPED;
       }
       return;
    }
    public void stopLiveStatTimerImmediately(){
    }
    public void unRegisterSensorEvent(){
    }
    public void updateAdaptiveMode(int p0){
    }
    public void updateCurrentMaxWallClockOffset(long p0){
    }
    public void updateCurrentWallClock(long p0){
    }
    public int updateKwaiManfiest(String p0){
       return 0;
    }
    public void updateRepresentationAdaptiveFlag(int p0,boolean p1){
    }
}
