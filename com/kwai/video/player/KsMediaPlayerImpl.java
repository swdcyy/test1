package com.kwai.video.player.KsMediaPlayerImpl;
import com.kwai.video.player.KsMediaPlayer;
import java.lang.String;
import java.lang.Class;
import com.kwai.video.player.KsMediaPlayer$Builder;
import com.kwai.video.player.surface.KwaiSurfaceManager;
import java.lang.Object;
import com.kwai.player.debuginfo.model.KwaiPlayerDebugInfo;
import com.kwai.video.player.KsMediaPlayerImpl$1;
import com.kwai.video.player.KsMediaPlayerImpl$PlayerState;
import android.os.Bundle;
import com.kwai.player.debuginfo.model.AppLiveQosDebugInfoNew;
import com.kwai.player.debuginfo.model.AppVodQosDebugInfoNew;
import com.kwai.player.debuginfo.model.PlayerConfigDebugInfo;
import android.graphics.Bitmap;
import com.kwai.video.player.misc.IMediaDataSource;
import java.nio.ByteBuffer;
import android.view.Surface;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.player.qos.AppLiveAdaptiveRealtimeInfo;
import com.kwai.robust.PatchProxyResult;
import com.kwai.player.debuginfo.model.AppLiveQosDebugInfo;
import java.lang.Number;
import java.lang.Long;
import com.kwai.video.player.MediaInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.player.KsMediaMeta;
import java.io.FileDescriptor;
import android.os.ParcelFileDescriptor;
import com.kwai.video.player.IMediaPlayer$OnLiveVoiceCommentListener;
import java.lang.Float;
import android.graphics.Bitmap$Config;
import com.kwai.player.qos.KwaiQosInfo;
import com.kwai.video.player.misc.ITrackInfo;
import com.kwai.video.player.misc.KsTrackInfo;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.video.player.KsMediaMeta$KSYStreamMeta;
import java.lang.ref.WeakReference;
import com.kwai.video.player.KsMediaPlayer$OnNativeInvokeListener;
import com.kwai.video.player.KsMediaPlayer$OnControlMessageListener;
import java.lang.RuntimeException;
import java.io.IOException;
import java.lang.Throwable;
import java.security.InvalidParameterException;
import android.os.Message;
import java.lang.StringBuilder;
import com.kwai.video.player.pragma.DebugLog;
import com.kwai.video.player.AbstractMediaPlayer;
import com.kwai.video.hodor.util.Timber;
import com.kwai.video.player.IMediaPlayer;
import java.lang.System;
import com.kwai.player.KwaiPlayerConfig;
import com.kwai.player.KwaiPlayerConfig$EnumBufferStrategy;
import java.lang.IllegalStateException;
import android.content.Context;
import android.net.Uri;
import java.util.Map;
import android.media.RingtoneManager;
import java.io.FileNotFoundException;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import com.kwai.video.player.KsMediaPlayerInitConfig;
import java.util.Set;
import java.util.Map$Entry;
import android.view.SurfaceHolder;
import com.kwai.video.player.IMediaPlayer$OnLiveAdaptiveQosStatListener;
import com.kwai.video.player.IMediaPlayer$OnQosStatListener;
import com.kwai.video.player.KsMediaPlayer$OnVideoTextureListener;
import android.graphics.SurfaceTexture;
import android.os.PowerManager$WakeLock;
import android.os.PowerManager;
import ci7.b;
import ci7.a;
import ci7.d;
import com.kwai.video.cache.PlayerPreferrenceUtil;

public class KsMediaPlayerImpl extends KsMediaPlayer	// class@000aee
{
    public b mAppQosLiveAdaptiveRealtime;
    public d mAppQosLiveRealtime;
    public AwesomeCacheCallback mAwesomeCacheCallback;
    public int mBufferingCount;
    public CacheSessionListener mCacheSessionListener;
    public CacheSessionListener mCacheSessionListenerInnerBridge;
    public String mDataSource;
    public boolean mEnableLiveAdaptiveAdditionalQosStat;
    public boolean mEnableLiveAdaptiveQosStat;
    public boolean mEnableQosStat;
    public boolean mEnableStatModule;
    public int mErrorCode;
    public String mHost;
    public HttpResponseErrorCallback mHttpResponseErrorCallback;
    public boolean mIsLive;
    public boolean mIsLiveAdaptiveQosTimerStarted;
    public boolean mIsQosTimerStarted;
    public boolean mIsVodAdaptive;
    public KwaiPlayerDebugInfo mKwaiPlayerDebugInfo;
    public Object mLiveAdaptiveQosObject;
    public long mLiveAdaptiveQosTickDuration;
    public KsMediaPlayer$OnControlMessageListener mOnControlMessageListener;
    public IMediaPlayer$OnLiveAdaptiveQosStatListener mOnLiveAdaptiveQosStatListener;
    public IMediaPlayer$OnLiveVoiceCommentListener mOnLiveVoiceCommentListener;
    public KsMediaPlayer$OnNativeInvokeListener mOnNativeInvokeListener;
    public IMediaPlayer$OnQosStatListener mOnQosStatListener;
    public KsMediaPlayer$OnVideoTextureListener mOnVideoTextureListener;
    public long mPcmBufferHandler;
    public long mPlayStartTime;
    public KsMediaPlayerImpl$PlayerState mPlayerState;
    public ByteBuffer mProcessPCMBuffer;
    public Object mQosObject;
    public long mQosTickDuration;
    public boolean mScreenOnWhilePlaying;
    public long mStartBufferingTime;
    public boolean mStayAwake;
    public final KwaiSurfaceManager mSurfaceManager;
    public int mTotalBufferingTime;
    public int mVideoHeight;
    public int mVideoSarDen;
    public int mVideoSarNum;
    public int mVideoWidth;
    public PowerManager$WakeLock mWakeLock;
    public static final String TAG;

    static {
       KsMediaPlayerImpl.TAG = KsMediaPlayer.class.getName();
    }
    public void KsMediaPlayerImpl(KsMediaPlayer$Builder p0){
       super(p0);
       this.mIsVodAdaptive = false;
       this.mWakeLock = null;
       this.mSurfaceManager = new KwaiSurfaceManager();
       this.mQosTickDuration = 0x2710;
       this.mLiveAdaptiveQosTickDuration = 2000;
       this.mEnableQosStat = false;
       this.mEnableLiveAdaptiveQosStat = false;
       this.mEnableLiveAdaptiveAdditionalQosStat = false;
       this.mQosObject = new Object();
       this.mLiveAdaptiveQosObject = new Object();
       this.mPlayStartTime = 0;
       this.mPcmBufferHandler = 0;
       this.mOnVideoTextureListener = null;
       this.mProcessPCMBuffer = null;
       this.mIsLive = false;
       this.mKwaiPlayerDebugInfo = new KwaiPlayerDebugInfo();
       this.mCacheSessionListenerInnerBridge = new KsMediaPlayerImpl$1(this);
       this.mBufferingCount = 0;
       this.mTotalBufferingTime = 0;
       this.mStartBufferingTime = 0;
       this.mIsQosTimerStarted = false;
       this.mIsLiveAdaptiveQosTimerStarted = false;
       this.mPlayerState = KsMediaPlayerImpl$PlayerState.STATE_IDLE;
       this.mEnableStatModule = p0.enableStatModule;
       this.initPlayer();
       long l = (p0.enablePlayerCache != null)? 1: 0;
       this.setOption(4, "cache-enabled", l);
       KsMediaPlayer$Builder awesomeCache = p0.awesomeCacheCallback;
       if (awesomeCache != null) {
          this.mAwesomeCacheCallback = awesomeCache;
          this._setAwesomeCacheCallback(awesomeCache);
       }
       awesomeCache = p0.httpResponseErrorCallback;
       if (awesomeCache != null) {
          this.mHttpResponseErrorCallback = awesomeCache;
          this._setHttpResponseErrorCallback(awesomeCache);
       }
       this.mCacheSessionListener = p0.cacheSessionListener;
       awesomeCache = p0.preLoadDurationMs;
       if (awesomeCache > 0) {
          this._enablePreDemux(p0.preLoadVer, awesomeCache);
       }
       KsMediaPlayer$Builder abLoopEndMs = p0.abLoopEndMs;
       if (abLoopEndMs > 0) {
          this._enableAbLoop(p0.abLoopStartMs, abLoopEndMs, p0.abLoopCount, p0.mDisableSeekAtStart);
       }
       awesomeCache = p0.seekAtStart;
       if (awesomeCache > 0) {
          this.setOption(4, "seek-at-start", awesomeCache);
       }
       awesomeCache = p0.fadeinEndTimeMs;
       if (awesomeCache > null) {
          this.setOption(4, "fade-in-end-time-ms", (long)awesomeCache);
       }
       if (p0.vodManifestEnable != null) {
          this.setOption(4, "enable-vod-manifest", 1);
          this.setOption(1, "device-resolution-width", p0.vodManifestWidth);
          this.setOption(1, "device-resolution-height", p0.vodManifestHeight);
          this.setOption(1, "device-network-type", (long)p0.vodManifestNetType);
          this.setOption(1, "abr-config-string", p0.vodManifestRateConfig);
          this.setOption(1, "low-device", (long)p0.vodManifestLowDevice);
          this.setOption(1, "signal-strength", (long)p0.vodManifestSignalStrength);
          this.setOption(1, "clarity-score", (long)p0.vodManifestClarityScore);
          this.setOption(1, "switch-code", (long)p0.vodManifestSwitchCode);
          this.setOption(1, "adaptive-max-resolution", (long)p0.mVodManifestMaxResolution);
          this.setOption(1, "manifest_type", (long)p0.mManifestType);
          this.setOption(1, "enable-aegon-net-speed", (long)p0.mEnableAegonNetSpeed);
          awesomeCache = p0.mSf21WarmupPercent;
          if (awesomeCache > null && awesomeCache <= 100) {
             this.setOption(1, "sf21-warmup-percent", (long)awesomeCache);
          }
          this.mIsVodAdaptive = p0.vodManifestEnable;
       }
       if (p0.enablePipenodeV2 != null) {
          this._enablePipenodeV2();
       }
       return;
    }
    public static native String _getColorFormatName(int p0);
    public static native String _getVersion();
    public static native String _getVersionExt();
    public static native void _native_init();
    public static native void _native_profileBegin(String p0);
    public static native void _native_profileEnd();
    public static native void _native_setKwaiLogLevel(int p0);
    public static native void _native_setLogLevel(int p0);
    public static native void _setKlogParam(Object p0);
    public native final void _abortNativeCacheIO();
    public native final void _addVideoRawBuffer(byte[] p0);
    public native final void _audioOnly(boolean p0);
    public native final void _disableSoftVideoDecode(boolean p0);
    public native final void _enableAbLoop(long p0,long p1,int p2,boolean p3);
    public native final void _enableMediacodecDummy(boolean p0);
    public native final void _enablePipenodeV2();
    public native final void _enablePreDemux(int p0,long p1);
    public native final void _enableVideoRawDataCallback(boolean p0);
    public native final Bundle _getAppLiveAdaptiveRealtimeInfo();
    public native final Bundle _getAppLiveQosDebugInfo();
    public native final void _getAppLiveQosDebugInfoNew(AppLiveQosDebugInfoNew p0);
    public native final void _getAppVodQosDebugInfoNew(AppVodQosDebugInfoNew p0);
    public native final String _getAudioCodecInfo();
    public native final int _getAudioSessionId();
    public native final long _getCurrentPosition();
    public native final long _getDuration();
    public native final String _getKwaiLiveVoiceComment(long p0);
    public native final String _getKwaiSign();
    public native final String _getKwaivppFilters();
    public native final String _getLiveRealTimeQosJson(int p0,int p1,long p2,long p3,long p4);
    public native final String _getLiveStatJson();
    public native final int _getLoopCount();
    public native final Bundle _getMediaMeta();
    public native final void _getPlayerConfigDebugInfo(PlayerConfigDebugInfo p0);
    public native final float _getProbeFps();
    public native final float _getPropertyFloat(int p0,float p1);
    public native final long _getPropertyLong(int p0,long p1);
    public native final String _getPropertyString(int p0);
    public native final Bundle _getQosInfo();
    public native final void _getScreenShot(Bitmap p0);
    public native final String _getVideoCodecInfo();
    public native final String _getVideoStatJson();
    public native final String _getVodAdaptiveCacheKey();
    public native final String _getVodAdaptiveHdrType();
    public native final String _getVodAdaptiveHostName();
    public native final String _getVodAdaptiveUrl();
    public native final String _getXksCache();
    public native final boolean _isCacheEnabled();
    public native final boolean _isLiveManifest();
    public native final boolean _isMediaPlayerValid();
    public native final boolean _isPlaying();
    public native final void _native_finalize();
    public native final void _native_message_loop(Object p0);
    public native final void _native_set_context(Object p0);
    public native final void _native_setup(Object p0);
    public native final void _pause();
    public native final void _prepareAsync();
    public native final void _release();
    public native final void _releasePcmBuffer(long p0);
    public native final void _reload(String p0,boolean p1);
    public native final void _reset();
    public native final void _seekTo(long p0);
    public native final void _setAwesomeCacheCallback(Object p0);
    public native final void _setCodecFlag(int p0);
    public native final void _setConfigJson(String p0);
    public native final void _setConnectionTimeout(int p0);
    public native final void _setCustomCdnEvent(Object p0);
    public native final void _setDataSource(IMediaDataSource p0);
    public native final void _setDataSource(String p0,String[] p1,String[] p2);
    public native final void _setDataSourceFd(int p0,long p1,long p2);
    public native final void _setHevcCodecName(String p0);
    public native final void _setHttpResponseErrorCallback(Object p0);
    public native final void _setKwaivppExtJson(int p0,String p1);
    public native final void _setKwaivppFilters(int p0,String p1);
    public native final void _setKwaivppKswitchJson(int p0,String p1);
    public native final void _setLiveManifestSwitchMode(int p0);
    public native final void _setLoopCount(int p0);
    public native final void _setOption(int p0,String p1,long p2);
    public native final void _setOption(int p0,String p1,String p2);
    public native final void _setPlayerMute(int p0);
    public native final void _setProcessPCMBuffer(ByteBuffer p0);
    public native final void _setPropertyFloat(int p0,float p1);
    public native final void _setPropertyLong(int p0,long p1);
    public native final void _setReadTimeout(int p0);
    public native final boolean _setRotateDegree(int p0);
    public native final void _setSpeed(float p0);
    public native final void _setStartPlayBlockBufferMs(int p0,int p1);
    public native final void _setStreamSelected(int p0,boolean p1);
    public native final void _setTone(int p0);
    public native final void _setVideoScalingMode(int p0);
    public native final void _setVideoSurface(Surface p0);
    public native final void _setVolume(float p0,float p1);
    public native final void _setupCacheSessionListener(Object p0);
    public native final void _shutdownWaitStop();
    public native final void _start();
    public native final void _step_frame();
    public native final void _stop();
    public native final void _updateCurrentMaxWallClockOffset(long p0);
    public native final void _updateCurrentWallClock(long p0);
    public void abortNativeCacheIO(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "11")) {
          return;
       }
       this._abortNativeCacheIO();
       return;
    }
    public void addVideoRawBuffer(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerImpl.class, "12")) {
          return;
       }
       this._addVideoRawBuffer(p0);
       return;
    }
    public void audioOnly(boolean p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "71")) {
          return;
       }
       this._audioOnly(p0);
       return;
    }
    public int bufferEmptyCountOld(){
       return this.mBufferingCount;
    }
    public long bufferEmptyDurationOld(){
       return (long)this.mTotalBufferingTime;
    }
    public void deselectTrack(int p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "49")) {
          return;
       }
       this._setStreamSelected(p0, false);
       return;
    }
    public void disableSoftVideoDecode(boolean p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "70")) {
          return;
       }
       this._disableSoftVideoDecode(p0);
       return;
    }
    public void enableMediacodecDummy(boolean p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "2")) {
          return;
       }
       this._enableMediacodecDummy(p0);
       return;
    }
    public void enableVideoRawDataCallback(boolean p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "13")) {
          return;
       }
       this._enableVideoRawDataCallback(p0);
       return;
    }
    public boolean getAdaptiveQosTimerStarted(){
       return this.mIsLiveAdaptiveQosTimerStarted;
    }
    public AppLiveAdaptiveRealtimeInfo getAppLiveAdaptiveRealtimeInfo(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AppLiveAdaptiveRealtimeInfo.from(this._getAppLiveAdaptiveRealtimeInfo());
    }
    public AppLiveQosDebugInfo getAppLiveQosDebugInfo(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AppLiveQosDebugInfo.from(this._getAppLiveQosDebugInfo());
    }
    public int getAudioSessionId(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this._getAudioSessionId();
    }
    public long getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getCurrentPosition();
    }
    public String getDataSource(){
       return this.mDataSource;
    }
    public KwaiPlayerDebugInfo getDebugInfo(){
       KsMediaPlayerImpl tmKwaiPlayer;
       KwaiPlayerDebugInfo obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mKwaiPlayerDebugInfo.mPlayerApplyConfig;
       if (obj.collectFinish == null) {
          this._getPlayerConfigDebugInfo(obj);
       }
       this.mKwaiPlayerDebugInfo.setIsLive(this.mIsLive);
       if (this.mIsLive != null) {
          tmKwaiPlayer = this.mKwaiPlayerDebugInfo;
          if (tmKwaiPlayer.mAppLiveQosDebugInfoNew == null) {
             tmKwaiPlayer.mAppLiveQosDebugInfoNew = new AppLiveQosDebugInfoNew();
          }
          this._getAppLiveQosDebugInfoNew(this.mKwaiPlayerDebugInfo.mAppLiveQosDebugInfoNew);
          this.mKwaiPlayerDebugInfo.mAppLiveQosDebugInfoNew.setWidth(this.getVideoWidth());
          this.mKwaiPlayerDebugInfo.mAppLiveQosDebugInfoNew.setHeight(this.getVideoHeight());
       }else {
          tmKwaiPlayer = this.mKwaiPlayerDebugInfo;
          if (tmKwaiPlayer.mAppVodQosDebugInfo == null) {
             tmKwaiPlayer.mAppVodQosDebugInfo = new AppVodQosDebugInfoNew();
          }
          this._getAppVodQosDebugInfoNew(this.mKwaiPlayerDebugInfo.mAppVodQosDebugInfo);
       }
       return this.mKwaiPlayerDebugInfo;
    }
    public long getDuration(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getDuration();
    }
    public boolean getEnableLiveAdaptiveQos(){
       return this.mEnableLiveAdaptiveQosStat;
    }
    public String getKwaiLiveVoiceComment(long p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, ksMediaPlaye, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._getKwaiLiveVoiceComment(p0);
    }
    public String getKwaiSign(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getKwaiSign();
    }
    public String getKwaivppFilters(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getKwaivppFilters();
    }
    public long getLiveAdaptiveTickDuration(){
       return this.mLiveAdaptiveQosTickDuration;
    }
    public String getLiveRealTimeQosJson(int p0,int p1,long p2,long p3,long p4){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Long.valueOf(p2),Long.valueOf(p3),Long.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, ksMediaPlaye, "32");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._getLiveRealTimeQosJson(p0, p1, p2, p3, p4);
    }
    public MediaInfo getMediaInfo(){
       String[] stringArray;
       MediaInfo obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MediaInfo();
       obj.mMediaPlayerName = "kwaiplayer";
       String str = this._getVideoCodecInfo();
       if (!TextUtils.isEmpty(str)) {
          stringArray = str.split(",");
          if (stringArray.length >= 2) {
             obj.mVideoDecoder = stringArray[0];
             obj.mVideoDecoderImpl = stringArray[1];
          }else if(stringArray.length >= 1){
             obj.mVideoDecoder = stringArray[0];
             obj.mVideoDecoderImpl = "";
          }
       }
       str = this._getAudioCodecInfo();
       if (!TextUtils.isEmpty(str)) {
          stringArray = str.split(",");
          if (stringArray.length >= 2) {
             obj.mAudioDecoder = stringArray[0];
             obj.mAudioDecoderImpl = stringArray[1];
          }else if(stringArray.length >= 1){
             obj.mAudioDecoder = stringArray[0];
             obj.mAudioDecoderImpl = "";
          }
       }
       obj.mMeta = KsMediaMeta.parse(this._getMediaMeta());
       return obj;
    }
    public Bundle getMediaMeta(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "88");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getMediaMeta();
    }
    public final int getNativeFd(FileDescriptor p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsMediaPlayerImpl.class, "76");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ParcelFileDescriptor.dup(p0).getFd();
    }
    public IMediaPlayer$OnLiveVoiceCommentListener getOnLiveVoiceCommentListener(){
       return this.mOnLiveVoiceCommentListener;
    }
    public float getProbeFps(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this._getProbeFps();
    }
    public float getPropertyFloat(int p0,float p1){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, ksMediaPlaye, "89");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this._getPropertyFloat(p0, p1);
    }
    public long getPropertyLong(int p0,long p1){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, ksMediaPlaye, "90");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this._getPropertyLong(p0, p1);
    }
    public String getPropertyString(int p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "91");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._getPropertyString(p0);
    }
    public boolean getQosTimerStarted(){
       return this.mIsQosTimerStarted;
    }
    public Bitmap getScreenShot(){
       Object[] objArray = null;
       KsMediaPlayerImpl obj = PatchProxy.apply(objArray, this, KsMediaPlayerImpl.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mVideoWidth;
       if (obj > null) {
          KsMediaPlayerImpl tmVideoHeigh = this.mVideoHeight;
          if (tmVideoHeigh > null) {
             Bitmap uBitmap = Bitmap.createBitmap(obj, tmVideoHeigh, Bitmap$Config.RGB_565);
             this._getScreenShot(uBitmap);
             return uBitmap;
          }
       }
       return objArray;
    }
    public int getSelectedTrack(int p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "47");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 != 1) {
          if (p0 != 2) {
             return -1;
          }else {
             return (int)this._getPropertyLong(0x4e22, -1);
          }
       }else {
          return (int)this._getPropertyLong(0x4e21, -1);
       }
    }
    public String getStatJson(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getLiveStatJson();
    }
    public KwaiQosInfo getStreamQosInfo(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiQosInfo.fromBundle(this._getQosInfo());
    }
    public Surface getSurface(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "84");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mSurfaceManager.getSurface();
    }
    public long getTickDuration(){
       return this.mQosTickDuration;
    }
    public ITrackInfo[] getTrackInfo(){
       return this.getTrackInfo();
    }
    public KsTrackInfo[] getTrackInfo(){
       Object[] objArray = null;
       Bundle obj = PatchProxy.apply(objArray, this, KsMediaPlayerImpl.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getMediaMeta();
       if (obj == null) {
          return objArray;
       }
       KsMediaMeta ksMediaMeta = KsMediaMeta.parse(obj);
       if (ksMediaMeta == null || ksMediaMeta.mStreams == null) {
          return objArray;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = ksMediaMeta.mStreams.iterator();
       while (iterator.hasNext()) {
          KsMediaMeta$KSYStreamMeta kSYStreamMet = iterator.next();
          KsTrackInfo ksTrackInfo = new KsTrackInfo(kSYStreamMet);
          if ((kSYStreamMet.mType).equalsIgnoreCase("video")) {
             ksTrackInfo.setTrackType(1);
          }else if((kSYStreamMet.mType).equalsIgnoreCase("audio")){
             ksTrackInfo.setTrackType(2);
          }
          uArrayList.add(ksTrackInfo);
       }
       KsTrackInfo[] ksTrackInfoA = new KsTrackInfo[uArrayList.size()];
       return uArrayList.toArray(ksTrackInfoA);
    }
    public int getVideoHeight(){
       return this.mVideoHeight;
    }
    public int getVideoSarDen(){
       return this.mVideoSarDen;
    }
    public int getVideoSarNum(){
       return this.mVideoSarNum;
    }
    public String getVideoStatJson(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getVideoStatJson();
    }
    public int getVideoWidth(){
       return this.mVideoWidth;
    }
    public String getVodAdaptiveCacheKey(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getVodAdaptiveCacheKey();
    }
    public String getVodAdaptiveHdrType(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getVodAdaptiveHdrType();
    }
    public String getVodAdaptiveHostName(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getVodAdaptiveHostName();
    }
    public String getVodAdaptiveUrl(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getVodAdaptiveUrl();
    }
    public String getXksCache(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getXksCache();
    }
    public void initPlayerInternal(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "1")) {
          return;
       }
       this._native_set_context(this.mContext);
       this._native_setup(new WeakReference(this));
       this._setupCacheSessionListener(new WeakReference(this.mCacheSessionListenerInnerBridge));
       return;
    }
    public void initProcessPCMBuffer(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "14")) {
          return;
       }
       if (this.mProcessPCMBuffer == null) {
          int i = (int)this._getPropertyLong(0x7539, 0);
          this.mProcessPCMBuffer = (i <= 0)? ByteBuffer.allocate(0x2af80): ByteBuffer.allocate((i * 2));
       }
    label_002d :
       this._setProcessPCMBuffer(this.mProcessPCMBuffer);
       return;
    }
    public boolean isCacheEnabled(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "93");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this._isCacheEnabled();
    }
    public boolean isLiveManifest(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "94");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this._isLiveManifest();
    }
    public boolean isLooping(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "97");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this._getLoopCount() == b) {
          b = false;
       }
       return b;
    }
    public boolean isMediaPlayerValid(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this._isMediaPlayerValid();
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerImpl.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this._isPlaying();
    }
    public boolean onNativeInvokeInternal(int p0,Bundle p1){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, ksMediaPlaye, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       ksMediaPlaye = this.mOnNativeInvokeListener;
       if (ksMediaPlaye != null && ksMediaPlaye.onNativeInvoke(p0, p1)) {
          return true;
       }else {
          boolean b = false;
          if (p0 != 0x10000) {
             return b;
          }else {
             KsMediaPlayerImpl tmOnControlM = this.mOnControlMessageListener;
             if (tmOnControlM == null) {
                return b;
             }else {
                int intx = p1.getInt("segment_index", -1);
                if (intx >= 0) {
                   String str = tmOnControlM.onControlResolveSegmentUrl(intx);
                   if (str != null) {
                      p1.putString("url", str);
                      return true;
                   }else {
                      throw new RuntimeException(new IOException("onNativeInvoke\(\) = <NULL newUrl>"));
                   }
                }else {
                   throw new InvalidParameterException("onNativeInvoke\(invalid segment index\)");
                }
             }
          }
       }
    }
    public void onReceivePostEvent(Message p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerImpl.class, "17")) {
          return;
       }
       Message what = p0.what;
       if (what != null) {
          int i = 1;
          if (what != i) {
             String str = 2;
             if (what != str) {
                if (what != 3) {
                   if (what != 4) {
                      if (what != 5) {
                         if (what != 99) {
                            if (what != 100) {
                               if (what != 200) {
                                  if (what != 300) {
                                     if (what != 0x2711) {
                                        if (what != 0x36b1) {
                                           DebugLog.e(KsMediaPlayerImpl.TAG, "Unknown message type "+p0.what);
                                        }
                                     }else {
                                        what = p0.arg1;
                                        this.mVideoSarNum = what;
                                        p0 = p0.arg2;
                                        this.mVideoSarDen = p0;
                                        this.notifyOnVideoSizeChanged(this.mVideoWidth, this.mVideoHeight, what, p0);
                                     }
                                  }else {
                                     long l = ((long)p0.arg1 << 32) | (long)p0.arg2;
                                     String kwaiLiveVoic = this.getKwaiLiveVoiceComment(l);
                                     objArray = new Object[str];
                                     objArray[0] = Long.valueOf(l);
                                     objArray[i] = kwaiLiveVoic;
                                     Timber.i("MEDIA_LIVE_VC_TIME, vc_time:%d, voice_comment:%s", objArray);
                                     IMediaPlayer$OnLiveVoiceCommentListener onLiveVoiceC = this.getOnLiveVoiceCommentListener();
                                     if (onLiveVoiceC != null) {
                                        onLiveVoiceC.onLiveVoiceCommentChange(this, kwaiLiveVoic);
                                     }
                                  }
                               }else {
                                  what = p0.arg1;
                                  if (what != 701) {
                                     if (what != 702) {
                                        if (what == 0x2774) {
                                           this.notifyOnSeekComplete();
                                           return;
                                        }
                                     }else {
                                        this.mTotalBufferingTime = this.mTotalBufferingTime + (int)(System.currentTimeMillis() - this.mStartBufferingTime);
                                     }
                                  }else {
                                     this.mBufferingCount = this.mBufferingCount + i;
                                     this.mStartBufferingTime = System.currentTimeMillis();
                                  }
                                  this.notifyOnInfo(p0.arg1, p0.arg2);
                                  return;
                               }
                            }else {
                               objArray = new Object[str];
                               objArray[0] = Integer.valueOf(p0.arg1);
                               objArray[i] = Integer.valueOf(p0.arg2);
                               Timber.e("MEDIA_ERROR, msg.arg1:%d, msg.arg2:%d", objArray);
                               if (!this.notifyOnError(p0.arg1, p0.arg2)) {
                                  this.notifyOnCompletion();
                               }
                               this.mErrorCode = p0.arg1;
                               this.stayAwake(0);
                               return;
                            }
                         }
                      }else {
                         what = p0.arg1;
                         this.mVideoWidth = what;
                         p0 = p0.arg2;
                         this.mVideoHeight = p0;
                         this.notifyOnVideoSizeChanged(what, p0, this.mVideoSarNum, this.mVideoSarDen);
                         return;
                      }
                   }else {
                      this.notifyOnSeekComplete();
                      return;
                   }
                }else {
                   this.notifyOnBufferingUpdate(p0.arg1);
                   return;
                }
             }else {
                this.mPlayerState = KsMediaPlayerImpl$PlayerState.STATE_COMPLETED;
                this.notifyOnCompletion();
                this.stayAwake(0);
                return;
             }
          }else {
             this.mPlayerState = KsMediaPlayerImpl$PlayerState.STATE_PREPARED;
             this.notifyOnPrepared();
          }
       }
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "65")) {
          return;
       }
       this.stayAwake(false);
       this._pause();
       Object[] objArray = new Object[]{Float.valueOf(this.getAverageDisplayFps())};
       Timber.d("KSYMeidaPlayer getAverageDisplayFps:%f", objArray);
       this.mPlayerState = KsMediaPlayerImpl$PlayerState.STATE_PAUSED;
       return;
    }
    public void prepareAsync(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "73")) {
          return;
       }
       this.mPlayStartTime = System.currentTimeMillis();
       if (this.mEnableQosStat != null) {
          this.startQosStatTimer();
       }
       if (this.mEnableLiveAdaptiveQosStat != null) {
          this.startLiveAdaptiveQosStatTimer();
       }
       this._prepareAsync();
       this.mPlayerState = KsMediaPlayerImpl$PlayerState.STATE_PREPARING;
       return;
    }
    public void reload(String p0,boolean p1){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ksMediaPlaye, "72")) {
          return;
       }
       this._reload(p0, p1);
       return;
    }
    public void resetInternal(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "56")) {
          return;
       }
       this.stayAwake(false);
       this._reset();
       this.mVideoWidth = 0;
       this.mVideoHeight = 0;
       return;
    }
    public void resetListenersInternal(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "15")) {
          return;
       }
       KsMediaPlayerImpl tmPcmBufferH = this.mPcmBufferHandler;
       if (tmPcmBufferH) {
          this._releasePcmBuffer(tmPcmBufferH);
       }
       this.mProcessPCMBuffer = null;
       this.mAwesomeCacheCallback = null;
       this.mHttpResponseErrorCallback = null;
       return;
    }
    public void seekTo(long p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ksMediaPlaye, "51")) {
          return;
       }
       this._seekTo(p0);
       return;
    }
    public void selectTrack(int p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "48")) {
          return;
       }
       this._setStreamSelected(p0, true);
       return;
    }
    public void setCodecFlag(int p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "37")) {
          return;
       }
       if (p0 <= 0) {
          p0 = 0;
       }
       this._setCodecFlag(p0);
       return;
    }
    public void setConfig(KwaiPlayerConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerImpl.class, "42")) {
          return;
       }
       if (p0 == null) {
          throw new IllegalStateException("method invoking failed pConfig ==null !");
       }
       this.mEnableQosStat = p0.f();
       this.mQosTickDuration = p0.l();
       this.mEnableLiveAdaptiveQosStat = p0.e();
       this.mEnableLiveAdaptiveAdditionalQosStat = p0.d();
       this.mLiveAdaptiveQosTickDuration = p0.h();
       this.setOption(4, "first-high-water-mark-ms", (long)p0.g());
       this.setOption(4, "next-high-water-mark-ms", (long)p0.k());
       this.setOption(4, "last-high-water-mark-ms", (long)p0.j());
       this.setOption(4, "buffer-strategy", (long)p0.c().getValue());
       this.setOption(4, "buffer-increment-step", (long)p0.a());
       this.setOption(4, "buffer-smooth-time", (long)p0.b());
       this.setOption(4, "max-buffer-dur-ms", (long)p0.i());
       return;
    }
    public void setConfigJson(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerImpl.class, "8")) {
          return;
       }
       this._setConfigJson(p0);
       return;
    }
    public void setDataReadTimeout(int p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "60")) {
          return;
       }
       if (p0 <= 0) {
          p0 = 30;
       }
       this._setReadTimeout(p0);
       return;
    }
    public void setDataSource(Context p0,Uri p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KsMediaPlayerImpl.class, "80")) {
          return;
       }
       String scheme = p1.getScheme();
       if (("file").equals(scheme)) {
          this.setDataSource(p1.getPath());
          return;
       }else if(("content").equals(scheme) && ("settings").equals(p1.getAuthority())){
          p1 = RingtoneManager.getActualDefaultRingtoneUri(p0, RingtoneManager.getDefaultType(p1));
          if (p1 == null) {
             throw new FileNotFoundException("Failed to resolve default ringtone");
          }
       }
       AssetFileDescriptor uAssetFileDe = null;
       try{
          uAssetFileDe = p0.getContentResolver().openAssetFileDescriptor(p1, "r");
          if (uAssetFileDe == null) {
             if (uAssetFileDe != null) {
                uAssetFileDe.close();
             }
             return;
          }else if(uAssetFileDe.getDeclaredLength() < 0){
             this.setDataSource(uAssetFileDe.getFileDescriptor());
          }else {
             this.setDataSource(uAssetFileDe.getFileDescriptor(), uAssetFileDe.getStartOffset(), uAssetFileDe.getDeclaredLength());
          }
          uAssetFileDe.close();
          return;
       }catch(java.lang.SecurityException e0){
          if (e0) {
          }
       }catch(java.io.IOException e0){
          if (e0) {
          }
          this.setDataSource(p1.toString(), p2);
          return;
       }
       e0.close();
       goto label_0094 ;
    }
    public void setDataSource(IMediaDataSource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerImpl.class, "74")) {
          return;
       }
       this._setDataSource(p0);
       return;
    }
    public void setDataSource(FileDescriptor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerImpl.class, "77")) {
          return;
       }
       this.mDataSource = p0.toString();
       this._setDataSourceFd(this.getNativeFd(p0), 0, 0);
       this.mPlayerState = KsMediaPlayerImpl$PlayerState.STATE_INITIALIZED;
       return;
    }
    public final void setDataSource(FileDescriptor p0,long p1,long p2){
       if (PatchProxy.isSupport(KsMediaPlayerImpl.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, KsMediaPlayerImpl.class, "75")) {
          return;
       }
       this.mDataSource = p0.toString();
       this._setDataSourceFd(this.getNativeFd(p0), p1, p2);
       this.mPlayerState = KsMediaPlayerImpl$PlayerState.STATE_INITIALIZED;
       return;
    }
    public void setDataSource(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerImpl.class, "79")) {
          return;
       }
       this.mDataSource = p0;
       Object[] objArray = new Object[]{KsMediaPlayerInitConfig.packageName,KsMediaPlayerInitConfig.packageVersion,KsMediaPlayer.getVersion()};
       String str = String.format("a/%s/%s/%s", objArray);
       this.setOption(1, "user-agent", str);
       Object[] objArray1 = new Object[]{str};
       Timber.d("user-agent:%s", objArray1);
       this._setDataSource(p0, null, null);
       this.mPlayerState = KsMediaPlayerImpl$PlayerState.STATE_INITIALIZED;
       return;
    }
    public void setDataSource(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsMediaPlayerImpl.class, "78")) {
          return;
       }
       if (p1 != null && !p1.isEmpty()) {
          StringBuilder str = p1.get("Host");
          this.mHost = str;
          if (str != null) {
             this.setOption(4, "host", str);
          }
          str = "";
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             str = str+uEntry.getKey()+": ";
             if (!TextUtils.isEmpty(uEntry.getValue())) {
                str = str+uEntry.getValue();
             }
             str = str+"\r\n";
          }
          this.setOption(1, "headers", str);
       }
       this.setDataSource(p0);
       return;
    }
    public void setDisplay(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerImpl.class, "43")) {
          return;
       }
       this.mSurfaceManager.asSurfaceHolder(p0);
       this._setVideoSurface(this.mSurfaceManager.getSurface());
       this.updateSurfaceScreenOn();
       return;
    }
    public void setEnableQosStat(boolean p0){
       this.mEnableQosStat = p0;
    }
    public void setHevcCodecName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerImpl.class, "82")) {
          return;
       }
       this._setHevcCodecName(p0);
       return;
    }
    public void setIsLive(boolean p0){
       this.mIsLive = p0;
    }
    public void setKwaivppExtJson(int p0,String p1){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ksMediaPlaye, "6")) {
          return;
       }
       this._setKwaivppExtJson(p0, p1);
       return;
    }
    public void setKwaivppFilters(int p0,String p1){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ksMediaPlaye, "3")) {
          return;
       }
       this._setKwaivppFilters(p0, p1);
       return;
    }
    public void setKwaivppKswitchJson(int p0,String p1){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ksMediaPlaye, "5")) {
          return;
       }
       this._setKwaivppKswitchJson(p0, p1);
       return;
    }
    public void setLiveManifestSwitchMode(int p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "81")) {
          return;
       }
       this._setLiveManifestSwitchMode(p0);
       return;
    }
    public void setLooping(boolean p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "98")) {
          return;
       }
       int i = p0 ^ 0x01;
       this.setOption(4, "loop", (long)i);
       this._setLoopCount(i);
       return;
    }
    public void setNetWorkConnectionTimeout(int p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "61")) {
          return;
       }
       if (p0 <= 0) {
          return;
       }
       this._setConnectionTimeout(p0);
       return;
    }
    public void setOnControlMessageListener(KsMediaPlayer$OnControlMessageListener p0){
       this.mOnControlMessageListener = p0;
    }
    public void setOnLiveVoiceCommentListener(IMediaPlayer$OnLiveVoiceCommentListener p0){
       this.mOnLiveVoiceCommentListener = p0;
    }
    public void setOnNativeInvokeListener(KsMediaPlayer$OnNativeInvokeListener p0){
       this.mOnNativeInvokeListener = p0;
    }
    public void setOnPeriodicalLiveAdaptiveQosStatListener(IMediaPlayer$OnLiveAdaptiveQosStatListener p0){
       this.mOnLiveAdaptiveQosStatListener = p0;
    }
    public void setOnPeriodicalQosStatListener(IMediaPlayer$OnQosStatListener p0){
       this.mOnQosStatListener = p0;
    }
    public void setOnVideoTextureListener(KsMediaPlayer$OnVideoTextureListener p0){
       this.mOnVideoTextureListener = p0;
    }
    public void setOption(int p0,String p1,long p2){
       if (PatchProxy.isSupport(KsMediaPlayerImpl.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Long.valueOf(p2), this, KsMediaPlayerImpl.class, "87")) {
          return;
       }
       this._setOption(p0, p1, p2);
       return;
    }
    public void setOption(int p0,String p1,String p2){
       if (PatchProxy.isSupport(KsMediaPlayerImpl.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KsMediaPlayerImpl.class, "86")) {
          return;
       }
       this._setOption(p0, p1, p2);
       return;
    }
    public void setPlayerMute(int p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "18")) {
          return;
       }
       this._setPlayerMute(p0);
       return;
    }
    public void setPropertyFloat(int p0,float p1){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, ksMediaPlaye, "92")) {
          return;
       }
       this._setPropertyFloat(p0, p1);
       return;
    }
    public void setQosTickDuration(int p0){
       this.mQosTickDuration = (long)p0;
    }
    public boolean setRotateDegree(int p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "19");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this._setRotateDegree(p0);
    }
    public void setScreenOnWhilePlaying(boolean p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "62")) {
          return;
       }
       if (this.mScreenOnWhilePlaying != p0) {
          if (p0 && !this.mSurfaceManager.isSourceSurfaceHolder()) {
             DebugLog.w(KsMediaPlayerImpl.TAG, "setScreenOnWhilePlaying\(true\) is ineffective without a SurfaceHolder");
          }
          this.mScreenOnWhilePlaying = p0;
          this.updateSurfaceScreenOn();
       }
       return;
    }
    public void setSpeed(float p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ksMediaPlaye, "95")) {
          return;
       }
       this._setSpeed(p0);
       return;
    }
    public void setStartPlayBlockBufferMs(int p0,int p1){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ksMediaPlaye, "7")) {
          return;
       }
       this._setStartPlayBlockBufferMs(p0, p1);
       return;
    }
    public void setSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerImpl.class, "85")) {
          return;
       }
       if (this.mScreenOnWhilePlaying != null && p0 != null) {
          DebugLog.w(KsMediaPlayerImpl.TAG, "setScreenOnWhilePlaying\(true\) is ineffective for Surface");
       }
       this.mSurfaceManager.asSurface(p0);
       this._setVideoSurface(p0);
       this.updateSurfaceScreenOn();
       return;
    }
    public void setSurfaceTexture(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerImpl.class, "83")) {
          return;
       }
       if (this.mScreenOnWhilePlaying != null && p0 != null) {
          DebugLog.w(KsMediaPlayerImpl.TAG, "setScreenOnWhilePlaying\(true\) is ineffective for SurfaceTexture");
       }
       this.mSurfaceManager.asSurfaceTexture(p0);
       this._setVideoSurface(this.mSurfaceManager.getSurface());
       this.updateSurfaceScreenOn();
       return;
    }
    public void setTone(int p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "96")) {
          return;
       }
       this._setTone(p0);
       return;
    }
    public void setVideoScalingMode(int p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "21")) {
          return;
       }
       this._setVideoScalingMode(p0);
       return;
    }
    public void setVolume(float p0,float p1){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, ksMediaPlaye, "58")) {
          return;
       }
       this._setVolume(p0, p1);
       return;
    }
    public void setWakeMode(Context p0,int p1){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ksMediaPlaye, "63")) {
          return;
       }
       ksMediaPlaye = this.mWakeLock;
       if (ksMediaPlaye != null) {
          if (ksMediaPlaye.isHeld()) {
             this.mWakeLock.release();
          }else {
             ksMediaPlaye = 0;
          }
          this.mWakeLock = null;
       }else {
          ksMediaPlaye = 0;
       }
       PowerManager$WakeLock wakeLock = p0.getSystemService("power").newWakeLock((p1 | 0x20000000), KsMediaPlayer.class.getName());
       this.mWakeLock = wakeLock;
       wakeLock.setReferenceCounted(false);
       if (1) {
          this.mWakeLock.acquire();
       }
       return;
    }
    public void shutdownWaitStop(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "66")) {
          return;
       }
       this.stopStatTimer();
       this.stayAwake(false);
       this._shutdownWaitStop();
       this.mPlayerState = KsMediaPlayerImpl$PlayerState.STATE_STOPPED;
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "69")) {
          return;
       }
       this.stayAwake(true);
       this._start();
       this.mPlayerState = KsMediaPlayerImpl$PlayerState.STATE_PLAYING;
       return;
    }
    public final void startLiveAdaptiveQosStatTimer(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "39")) {
          return;
       }
       KsMediaPlayerImpl tmLiveAdapti = this.mLiveAdaptiveQosObject;
       _monitor_enter(tmLiveAdapti);
       if (this.mIsLiveAdaptiveQosTimerStarted != null) {
          _monitor_exit(tmLiveAdapti);
          return;
       }else {
          this.mIsLiveAdaptiveQosTimerStarted = true;
          if (this.mAppQosLiveAdaptiveRealtime == null) {
             b uob = new b(1000, this.mLiveAdaptiveQosTickDuration, this, this.mLiveAdaptiveQosObject);
             this.mAppQosLiveAdaptiveRealtime = v1;
             v1.b(this.mPlayStartTime);
             this.mAppQosLiveAdaptiveRealtime.a(this.mEnableLiveAdaptiveAdditionalQosStat);
          }
          this.mAppQosLiveAdaptiveRealtime.c(this.mOnLiveAdaptiveQosStatListener);
          _monitor_exit(tmLiveAdapti);
          return;
       }
    }
    public final void startQosStatTimer(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "40")) {
          return;
       }
       KsMediaPlayerImpl tmQosObject = this.mQosObject;
       _monitor_enter(tmQosObject);
       if (this.mIsQosTimerStarted != null) {
          _monitor_exit(tmQosObject);
          return;
       }else {
          this.mIsQosTimerStarted = true;
          if (this.mAppQosLiveRealtime == null) {
             d uod = new d(1000, this.mQosTickDuration, this, this.mQosObject);
             this.mAppQosLiveRealtime = v1;
          }
          this.mAppQosLiveRealtime.a(this.mOnQosStatListener);
          _monitor_exit(tmQosObject);
          return;
       }
    }
    public final void stayAwake(boolean p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "44")) {
          return;
       }
       ksMediaPlaye = this.mWakeLock;
       if (ksMediaPlaye != null) {
          if (p0 && !ksMediaPlaye.isHeld()) {
             this.mWakeLock.acquire();
          }else if(!p0 && this.mWakeLock.isHeld()){
             this.mWakeLock.release();
          }
       }
       this.mStayAwake = p0;
       this.updateSurfaceScreenOn();
       return;
    }
    public void step_frame(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "64")) {
          return;
       }
       this.stayAwake(false);
       this._step_frame();
       Object[] objArray = new Object[false];
       Timber.d("step_frame", objArray);
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "67")) {
          return;
       }
       this.stopStatTimer();
       this.stayAwake(false);
       this._stop();
       this.mPlayerState = KsMediaPlayerImpl$PlayerState.STATE_STOPPED;
       return;
    }
    public final void stopLiveAdaptiveQosStatTimer(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "38")) {
          return;
       }
       KsMediaPlayerImpl tmLiveAdapti = this.mLiveAdaptiveQosObject;
       _monitor_enter(tmLiveAdapti);
       if (this.mIsLiveAdaptiveQosTimerStarted == null) {
          _monitor_exit(tmLiveAdapti);
          return;
       }else {
          this.mIsLiveAdaptiveQosTimerStarted = false;
          KsMediaPlayerImpl tmAppQosLive = this.mAppQosLiveAdaptiveRealtime;
          if (tmAppQosLive != null) {
             tmAppQosLive.d();
             this.mAppQosLiveAdaptiveRealtime = null;
          }
          _monitor_exit(tmLiveAdapti);
          return;
       }
    }
    public final void stopQosStatTimer(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "41")) {
          return;
       }
       KsMediaPlayerImpl tmQosObject = this.mQosObject;
       _monitor_enter(tmQosObject);
       if (this.mIsQosTimerStarted == null) {
          _monitor_exit(tmQosObject);
          return;
       }else {
          KsMediaPlayerImpl tmAppQosLive = this.mAppQosLiveRealtime;
          if (tmAppQosLive != null) {
             tmAppQosLive.b();
             this.mAppQosLiveRealtime = null;
          }
          this.mIsQosTimerStarted = false;
          _monitor_exit(tmQosObject);
          return;
       }
    }
    public void stopStatTimer(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "68")) {
          return;
       }
       if (this.mEnableQosStat != null) {
          this.stopQosStatTimer();
       }
       if (this.mEnableLiveAdaptiveQosStat != null) {
          this.stopLiveAdaptiveQosStatTimer();
       }
       return;
    }
    public void unInitPlayerInternal(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "55")) {
          return;
       }
       if (this.mIsVodAdaptive != null) {
          PlayerPreferrenceUtil.getInstance().saveVodAdaptiveData();
       }
       this.stayAwake(false);
       this.updateSurfaceScreenOn();
       this._release();
       this.resetListeners();
       this.mPlayerState = KsMediaPlayerImpl$PlayerState.STATE_END;
       return;
    }
    public void updateCurrentMaxWallClockOffset(long p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ksMediaPlaye, "9")) {
          return;
       }
       this._updateCurrentMaxWallClockOffset(p0);
       return;
    }
    public void updateCurrentWallClock(long p0){
       KsMediaPlayerImpl ksMediaPlaye = KsMediaPlayerImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ksMediaPlaye, "10")) {
          return;
       }
       this._updateCurrentWallClock(p0);
       return;
    }
    public final void updateSurfaceScreenOn(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl.class, "45")) {
          return;
       }
       KsMediaPlayerImpl tmSurfaceMan = this.mSurfaceManager;
       boolean b = (this.mScreenOnWhilePlaying != null && this.mStayAwake != null)? true: false;
       tmSurfaceMan.setKeepScreenOn(b);
       return;
    }
}
