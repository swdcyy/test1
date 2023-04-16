package com.kwai.video.player.kwai_player.KwaiMediaPlayer;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.player.kwai_player.IBuildKwaiPlayer;
import com.kwai.video.player.AbstractNativeMediaPlayer;
import com.kwai.video.player.surface.KwaiSurfaceManager;
import com.kwai.player.debuginfo.model.KwaiPlayerDebugInfo;
import java.lang.String;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.player.PlayerLibraryLoader;
import java.lang.Boolean;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.IOException;
import android.os.Bundle;
import com.kwai.video.player.pragma.DebugLog;
import java.lang.ref.WeakReference;
import com.kwai.video.player.kwai_player.KwaiMediaPlayer$OnNativeInvokeListener;
import com.kwai.video.player.kwai_player.KwaiMediaPlayer$OnControlMessageListener;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.security.InvalidParameterException;
import java.lang.IllegalStateException;
import android.graphics.Bitmap$Config;
import com.kwai.player.debuginfo.model.AppLiveQosDebugInfoNew;
import com.kwai.player.debuginfo.model.AppVodQosDebugInfoNew;
import com.kwai.player.debuginfo.model.PlayerConfigDebugInfo;
import com.kwai.player.qos.KwaiPlayerResultQos;
import com.kwai.video.player.misc.IMediaDataSource;
import java.nio.ByteBuffer;
import android.view.Surface;
import ai7.b;
import java.util.Map;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.player.KsMediaPlayerInitConfig;
import com.kwai.video.hodor.util.Timber;
import java.lang.Long;
import ei7.j;
import com.kwai.video.aemonplayer.surface.KwaiGpuContext;
import com.kwai.player.qos.AppLiveAdaptiveRealtimeInfo;
import com.kwai.player.debuginfo.model.AppLiveQosDebugInfo;
import com.kwai.video.player.kwai_player.AspectAwesomeCache;
import java.util.Objects;
import com.kwai.video.player.kwai_player.AspectKFlv;
import com.kwai.video.player.kwai_player.AspectKwaiVodAdaptive;
import com.kwai.player.KwaiRepresentation;
import com.kwai.video.player.MediaInfo;
import com.kwai.video.player.KsMediaMeta;
import java.io.FileDescriptor;
import android.os.ParcelFileDescriptor;
import fi7.u;
import com.kwai.video.player.kwai_player.ProductContext;
import java.lang.Float;
import com.kwai.player.qos.KwaiQosInfo;
import com.kwai.video.player.misc.ITrackInfo;
import com.kwai.video.player.misc.KsTrackInfo;
import java.util.ArrayList;
import com.kwai.video.player.KsMediaMeta$KSYStreamMeta;
import android.view.MotionEvent;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.video.player.IMediaPlayer$OnABLoopEndOfCounterListener;
import com.kwai.player.KwaiBulletScreenState;
import com.kwai.video.player.IKwaiBulletScreenListener;
import com.kwai.video.player.IKwaiRepresentationListener;
import com.kwai.video.player.IKwaiSubtitleListener;
import android.os.Message;
import com.kwai.video.player.AbstractMediaPlayer;
import com.kwai.video.player.IMediaPlayer$OnLiveVoiceCommentListener;
import com.kwai.video.player.OnInfoExtra;
import java.lang.System;
import ci7.e;
import ci7.c;
import com.kwai.video.cache.PlayerPreferrenceUtil;
import ai7.e;
import com.kwai.video.player.kwai_player.KwaiMediaPlayer$1;
import java.lang.Runnable;
import ai7.c;
import org.json.JSONObject;
import java.lang.Exception;
import com.kwai.player.KwaiPlayerConfig;
import com.kwai.player.KwaiPlayerConfig$EnumBufferStrategy;
import android.content.Context;
import android.net.Uri;
import android.media.RingtoneManager;
import java.io.FileNotFoundException;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.view.SurfaceHolder;
import android.graphics.SurfaceTexture;
import com.kwai.video.player.IKwaiInjectHttpCallback;
import java.lang.IllegalArgumentException;
import com.kwai.video.player.IKwaiVodDrmCallback;
import com.kwai.video.player.IMediaPlayer$OnLiveAdaptiveQosStatListener;
import com.kwai.video.player.IMediaPlayer$OnQosStatListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveExtraInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSrvTsptInfoListener;
import com.kwai.video.player.OnQosEventInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnVideoRenderListener;
import fi7.u$a;
import com.kwai.video.player.kwai_player.KwaiMediaPlayer$2;
import com.kwai.video.player.kwai_player.KwaiMediaPlayer$IHeadTrackerListener;
import android.os.PowerManager$WakeLock;
import android.os.PowerManager;
import com.kwai.video.player.kwai_player.KwaiAspectKFlv;
import ci7.a;
import com.kwai.video.player.kwai_player.KwaiPlayerAspectAwesomeCache;

public final class KwaiMediaPlayer extends AbstractNativeMediaPlayer implements IKwaiMediaPlayer, IBuildKwaiPlayer	// class@000b39
{
    public c mAppQosLiveAdaptiveRealtimeWrapper;
    public e mAppQosLiveRealtimeWrapper;
    public AspectAwesomeCache mAspectAwesomeCache;
    public AspectKFlv mAspectKFlv;
    public int mAudioLatency;
    public int mBufferingCount;
    public IKwaiBulletScreenListener mBulletScreenListener;
    public Context mContext;
    public String mDataSource;
    public final KwaiSurfaceManager mExtSurfaceManager;
    public int mInteractivemode;
    public boolean mIsLive;
    public boolean mIsMultiSurface;
    public boolean mIsVR;
    public boolean mIsVodAdaptive;
    public IKwaiRepresentationListener mKwaiAudioRepresentationListener;
    public IKwaiInjectHttpCallback mKwaiInjectHttpCallback;
    public KwaiPlayerDebugInfo mKwaiPlayerDebugInfo;
    public IKwaiRepresentationListener mKwaiRepresentationListener;
    public u mKwaiVR;
    public IKwaiVodDrmCallback mKwaiVodDrmCallback;
    public IMediaPlayer$OnABLoopEndOfCounterListener mOnABLoopEndOfCounterListener;
    public KwaiMediaPlayer$OnControlMessageListener mOnControlMessageListener;
    public IMediaPlayer$OnLiveVoiceCommentListener mOnLiveVoiceCommentListener;
    public KwaiMediaPlayer$OnNativeInvokeListener mOnNativeInvokeListener;
    public IMediaPlayer$OnQosStatListener mOnQosStatListener;
    public long mPcmBufferHandler;
    public ByteBuffer mProcessPCMBuffer;
    public ProductContext mProductContext;
    public boolean mScreenOnWhilePlaying;
    public long mStartBufferingTime;
    public boolean mStayAwake;
    public int mStereoType;
    public IKwaiSubtitleListener mSubtitleListener;
    public final KwaiSurfaceManager mSurfaceManager;
    public j mSurfaceTextureRender;
    public int mTotalBufferingTime;
    public int mVideoHeight;
    public int mVideoSarDen;
    public int mVideoSarNum;
    public int mVideoWidth;
    public AspectKwaiVodAdaptive mVodAdaptive;
    public PowerManager$WakeLock mWakeLock;
    public static final int INPUT_DATA_TYPE_HLS_CUSTOME_MANIFEST = 3;
    public static final int INPUT_DATA_TYPE_INDEX_CONTENT = 2;
    public static final int INPUT_DATA_TYPE_SINGLE_URL = 0;
    public static final int INPUT_DATA_TYPE_VOD_MANIFEST = 1;
    public static final int MEDIA_BUFFERSIZE_DEFAULT = 20;
    public static final String TAG = "com.kwai.video.player.kwai_player.KwaiMediaPlayer";

    public void KwaiMediaPlayer(){
       super();
       this.mWakeLock = null;
       this.mInteractivemode = 0;
       this.mStereoType = 0;
       this.mSurfaceManager = new KwaiSurfaceManager();
       this.mExtSurfaceManager = new KwaiSurfaceManager();
       this.mPcmBufferHandler = 0;
       this.mAudioLatency = -1;
       this.mProductContext = null;
       this.mProcessPCMBuffer = null;
       this.mKwaiPlayerDebugInfo = new KwaiPlayerDebugInfo();
       this.initPlayer();
       this.resetSomething();
    }
    public static native String _getColorFormatName(int p0);
    public static int _getPlayerAliveCnt(){
       return KwaiMediaPlayer.getPlayerAliveCnt();
    }
    public static native int _native_getPlayerAliveCnt();
    public static native String _native_getVersion();
    public static native String _native_getVersionExt();
    public static native void _native_init();
    public static native void _native_profileBegin(String p0);
    public static native void _native_profileEnd();
    public static native void _native_setKlogParam(Object p0);
    public static native void _native_setKwaiLogLevel(int p0);
    public static native void _native_setLogLevel(int p0);
    public static native void _native_setPlayerEncryptLiveDebugInfoKey(String p0);
    public static native void _native_setPlayerNativeDebugInfoAuthKey(String p0);
    public static native void _toneMappingProcess(Bitmap p0,int p1,int p2,int p3);
    public static String getColorFormatName(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, kwaiMediaPla, "188");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return KwaiMediaPlayer._getColorFormatName(p0);
    }
    public static int getPlayerAliveCnt(){
       Object obj = PatchProxy.apply(null, null, KwaiMediaPlayer.class, "244");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!PlayerLibraryLoader.isKwaiplayerLoaded()) {
          return -1;
       }
       return KwaiMediaPlayer._native_getPlayerAliveCnt();
    }
    public static String getVersion(){
       Object obj = PatchProxy.apply(null, null, KwaiMediaPlayer.class, "233");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!PlayerLibraryLoader.isKwaiplayerLoaded()) {
          return "kwaiplayer-so-not-load";
       }
       return KwaiMediaPlayer._native_getVersion();
    }
    public static String getVersionExt(){
       Object obj = PatchProxy.apply(null, null, KwaiMediaPlayer.class, "234");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!PlayerLibraryLoader.isKwaiplayerLoaded()) {
          return "kwaiplayer-so-not-load";
       }
       return KwaiMediaPlayer._native_getVersionExt();
    }
    public static boolean isHdrFile(String p0){
       int i;
       MediaExtractor obj = PatchProxy.applyOneRefs(p0, null, KwaiMediaPlayer.class, "228");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new MediaExtractor();
       try{
          i = 0;
          obj.setDataSource(p0);
          int i1 = 0;
          while (true) {
             if (i1 >= obj.getTrackCount()) {
                return i;
             }
             MediaFormat trackFormat = obj.getTrackFormat(i1);
             if (trackFormat.containsKey("color-standard")) {
                String str = "color-transfer";
                if (trackFormat.getInteger(str) == 6 || (trackFormat.getInteger(str) == 7 && trackFormat.getInteger("color-standard") == 6)) {
                   break ;
                }
             }
             i1++;
          }
          return true;
       }catch(java.io.IOException e7){
          e7.printStackTrace();
          return i;
       }
    }
    public static void native_init(){
       if (PatchProxy.applyVoid(null, null, KwaiMediaPlayer.class, "237")) {
          return;
       }
       if (!PlayerLibraryLoader.isKwaiplayerLoaded()) {
          return;
       }
       KwaiMediaPlayer._native_init();
       return;
    }
    public static void native_init_install(){
       if (PatchProxy.applyVoid(null, null, KwaiMediaPlayer.class, "238")) {
          return;
       }
       KwaiMediaPlayer._native_init();
       return;
    }
    public static void native_profileBegin(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KwaiMediaPlayer.class, "239")) {
          return;
       }
       if (!PlayerLibraryLoader.isKwaiplayerLoaded()) {
          return;
       }
       KwaiMediaPlayer._native_profileBegin(p0);
       return;
    }
    public static void native_profileEnd(){
       if (PatchProxy.applyVoid(null, null, KwaiMediaPlayer.class, "240")) {
          return;
       }
       if (!PlayerLibraryLoader.isKwaiplayerLoaded()) {
          return;
       }
       KwaiMediaPlayer._native_profileEnd();
       return;
    }
    public static void native_setKlogParam(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KwaiMediaPlayer.class, "235")) {
          return;
       }
       if (!PlayerLibraryLoader.isKwaiplayerLoaded()) {
          return;
       }
       KwaiMediaPlayer._native_setKlogParam(p0);
       return;
    }
    public static void native_setKwaiLogLevel(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, kwaiMediaPla, "236")) {
          return;
       }
       if (!PlayerLibraryLoader.isKwaiplayerLoaded()) {
          return;
       }
       KwaiMediaPlayer._native_setKwaiLogLevel(p0);
       return;
    }
    public static void native_setLogLevel(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, kwaiMediaPla, "241")) {
          return;
       }
       if (!PlayerLibraryLoader.isKwaiplayerLoaded()) {
          return;
       }
       KwaiMediaPlayer._native_setLogLevel(p0);
       return;
    }
    public static boolean onNativeInvoke(Object p0,int p1,Bundle p2){
       KwaiMediaPlayer obj;
       if (PatchProxy.isSupport(KwaiMediaPlayer.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, KwaiMediaPlayer.class, "72");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(p1)};
       DebugLog.ifmt(KwaiMediaPlayer.TAG, "onNativeInvoke %d", objArray);
       if (p0 != null && p0 instanceof WeakReference) {
          p0 = p0.get();
          if (p0 != null) {
             obj = p0.mOnNativeInvokeListener;
             if (obj != null && obj.onNativeInvoke(p1, p2)) {
                return 1;
             }else if(p1 != 0x10000){
                return 0;
             }else {
                p0 = p0.mOnControlMessageListener;
                if (p0 == null) {
                   return 0;
                }else {
                   p1 = p2.getInt("segment_index", -1);
                   if (p1 >= 0) {
                      p0 = p0.onControlResolveSegmentUrl(p1);
                      if (p0 != null) {
                         p2.putString("url", p0);
                         return 1;
                      }else {
                         throw new RuntimeException(new IOException("onNativeInvoke\(\) = <NULL newUrl>"));
                      }
                   }else {
                      throw new InvalidParameterException("onNativeInvoke\(invalid segment index\)");
                   }
                }
             }
          }else {
             throw new IllegalStateException("<null weakPlayer>.onNativeInvoke\(\)");
          }
       }else {
          throw new IllegalStateException("<null weakThiz>.onNativeInvoke\(\)");
       }
    }
    public static void setPlayerEncryptLiveDebugInfoKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KwaiMediaPlayer.class, "243")) {
          return;
       }
       if (!PlayerLibraryLoader.isKwaiplayerLoaded()) {
          return;
       }
       KwaiMediaPlayer._native_setPlayerEncryptLiveDebugInfoKey(p0);
       return;
    }
    public static void setPlayerNativeDebugInfoAuthKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KwaiMediaPlayer.class, "242")) {
          return;
       }
       if (!PlayerLibraryLoader.isKwaiplayerLoaded()) {
          return;
       }
       KwaiMediaPlayer._native_setPlayerNativeDebugInfoAuthKey(p0);
       return;
    }
    public static void toneMappingProcess(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KwaiMediaPlayer.class, "229")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int width = p0.getWidth();
       int height = p0.getHeight();
       if (p0.getConfig().equals(Bitmap$Config.ARGB_8888)) {
          KwaiMediaPlayer._toneMappingProcess(p0, width, height, 8);
       }
       return;
    }
    public native final int _addBulletScreen(Object p0);
    public native final int _addBulletScreenParam(String p0,int p1,int p2,int p3);
    public native final int _addSubtitle(String p0,boolean p1);
    public native final void _addVideoRawBuffer(byte[] p0);
    public native final void _audioOnly(boolean p0);
    public native final boolean _checkCanStartPlay();
    public native final void _disableSoftVideoDecode(boolean p0);
    public native void _enableAbLoop(long p0,long p1,int p2,boolean p3);
    public native final void _enableLoopOnBlock(int p0,int p1,long p2);
    public native final void _enableMediacodecDummy(boolean p0);
    public native final void _enablePipenodeV2();
    public native void _enablePreDemux(int p0,long p1);
    public native final void _enableVideoRawDataCallback(boolean p0);
    public native final boolean _getAPJoySoundSwitchStatus();
    public native final Bundle _getAppLiveAdaptiveRealtimeInfo();
    public native final Bundle _getAppLiveQosDebugInfo();
    public native final void _getAppLiveQosDebugInfoNew(AppLiveQosDebugInfoNew p0);
    public native final void _getAppVodQosDebugInfoNew(AppVodQosDebugInfoNew p0);
    public native final String _getAudioCodecInfo();
    public native final String _getBriefVideoStatJson();
    public native final int _getCurAudioRepresentationId();
    public native final Object _getCurRepresentation();
    public native final int _getCurRepresentationId();
    public native final int _getDownloadedPercent();
    public native final String _getKwaiLiveVoiceComment(long p0);
    public native final String _getKwaiSign();
    public native String _getKwaivppFilters();
    public native final String _getLiveRealTimeQosJson(int p0,int p1,long p2,long p3,long p4);
    public native final String _getLiveStatJson();
    public native final int _getLoopCount();
    public native final Bundle _getMediaMeta();
    public native final void _getPlayerConfigDebugInfo(PlayerConfigDebugInfo p0);
    public native long _getPlayerId();
    public native final String _getPlayerTsJson();
    public native final float _getProbeFps();
    public native float _getPropertyFloat(int p0,float p1);
    public native long _getPropertyLong(int p0,long p1);
    public native String _getPropertyString(int p0);
    public native final Bundle _getQosInfo();
    public native KwaiPlayerResultQos _getResultQos();
    public native final void _getScreenShot(Bitmap p0);
    public native final int _getTotalPlayBackDuration();
    public native final int _getVideoAlphaType();
    public native final String _getVideoCodecInfo();
    public native final String _getVideoStatJson();
    public native final String _getVodAdaptiveCacheKey();
    public native final String _getVodAdaptiveHdrType();
    public native final String _getVodAdaptiveHostName();
    public native final String _getVodAdaptiveUrl();
    public native final String _getXksCache();
    public native final boolean _isAudioOnly();
    public native final boolean _isCacheEnabled();
    public native boolean _isLiveManifest();
    public native final boolean _isMediaPlayerValid();
    public native final boolean _isRepresentationEnableAdaptive(int p0);
    public native final void _pause();
    public native final void _prepareAsync();
    public native final void _release();
    public native final void _releasePcmBuffer(long p0);
    public native final void _reload(String p0,boolean p1);
    public native final int _removeBulletScreen(int p0);
    public native final void _reset();
    public native final void _setAPJoySoundSwitchStatus(boolean p0);
    public native final void _setAudioRepresentation(int p0);
    public native final void _setAudioRepresentationListener(Object p0);
    public native void _setAwesomeCacheCallback(Object p0);
    public native final void _setClickCoordForOpaque(float p0,float p1);
    public native final void _setCodecFlag(int p0);
    public native void _setConfigJson(String p0);
    public native void _setConnectionTimeout(int p0);
    public native void _setCustomCdnEvent(Object p0);
    public native final void _setDataSource(IMediaDataSource p0);
    public native final void _setDataSource(String p0,String[] p1,String[] p2);
    public native final void _setDataSourceFd(int p0,long p1,long p2);
    public native final void _setDrmKeyInfo(String p0,int p1,int p2);
    public native final void _setHeadTracker(float p0,float p1,float p2);
    public native final void _setHevcCodecName(String p0);
    public native void _setHttpResponseErrorCallback(Object p0);
    public native final void _setKwaiBulletScreenListener(Object p0);
    public native final void _setKwaiInjectHttpCallback(Object p0);
    public native final void _setKwaiSubtitleListener(Object p0);
    public native void _setKwaivppExtJson(int p0,String p1);
    public native void _setKwaivppFilters(int p0,String p1);
    public native void _setKwaivppKswitchJson(int p0,String p1);
    public native final void _setLastTryFlag(int p0);
    public native final void _setLiveAppQosInfo(String p0);
    public native void _setLiveLowDelayConfigJson(String p0);
    public native final void _setLiveManifestSwitchMode(int p0);
    public native final void _setLoopCount(int p0);
    public native final void _setNetworkRetryScene(String p0);
    public native final void _setOnLiveExtraInfoListener(Object p0);
    public native final void _setOnLiveInterActiveListener(Object p0,int p1);
    public native final void _setOnLiveSeiInfoListener(Object p0);
    public native final void _setOnLiveSrvTsptInfoListener(Object p0);
    public native final void _setOnQosEventInfoListener(Object p0);
    public native final void _setOnVideoRenderListener(Object p0);
    public native final void _setOption(int p0,String p1,long p2);
    public native final void _setOption(int p0,String p1,String p2);
    public native final void _setPlayerMute(int p0);
    public native final void _setProcessPCMBuffer(ByteBuffer p0);
    public native void _setPropertyFloat(int p0,float p1);
    public native void _setPropertyLong(int p0,long p1);
    public native void _setQy265Context(Object p0);
    public native void _setReadTimeout(int p0);
    public native final void _setRepresentation(int p0);
    public native final void _setRepresentationListener(Object p0);
    public native final boolean _setRotateDegree(int p0);
    public native final void _setSpeed(float p0);
    public native void _setStartPlayBlockBufferMs(int p0,int p1);
    public native void _setStartPlayBlockBufferStrategy(int p0);
    public native final void _setStreamSelected(int p0,boolean p1);
    public native final void _setSubtitleSelected(int p0,boolean p1);
    public native final void _setTone(int p0);
    public native final void _setVideoScalingMode(int p0);
    public native final void _setVideoSurface(Surface p0);
    public native final void _setViewSizeWithRatio(int p0,int p1,float p2);
    public native final void _setVodDrmCallback(Object p0);
    public native void _setupCacheSessionListener(Object p0);
    public native final void _shutdownWaitStop();
    public native final void _start();
    public native final void _step_frame();
    public native final void _stop();
    public native final void _updateAdaptiveMode(int p0);
    public native final void _updateCurrentMaxWallClockOffset(long p0);
    public native final void _updateCurrentWallClock(long p0);
    public native final int _updateKwaiManfiest(String p0);
    public native final void _updateRepresentationAdaptiveFlag(int p0,boolean p1);
    public int addBulletScreen(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiMediaPlayer.class, "197");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this._addBulletScreen(p0);
    }
    public int addBulletScreenWithParam(int p0,int p1,int p2,String p3){
       if (PatchProxy.isSupport(KwaiMediaPlayer.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), p3, this, KwaiMediaPlayer.class, "198");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._addBulletScreenParam(p3, p0, p1, p2);
    }
    public int addSubtitle(String p0,boolean p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, kwaiMediaPla, "195");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._addSubtitle(p0, p1);
    }
    public void addVideoRawBuffer(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "109")) {
          return;
       }
       this._addVideoRawBuffer(p0);
       return;
    }
    public void audioOnly(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "150")) {
          return;
       }
       this._audioOnly(p0);
       return;
    }
    public int bufferEmptyCount(){
       return (int)this._getPropertyLong(0x7535, 0);
    }
    public int bufferEmptyCountOld(){
       return this.mBufferingCount;
    }
    public long bufferEmptyDuration(){
       return this._getPropertyLong(0x7534, 0);
    }
    public long bufferEmptyDurationOld(){
       return (long)this.mTotalBufferingTime;
    }
    public boolean checkCanStartPlay(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "100");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this._checkCanStartPlay();
    }
    public final void configHeaders(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "90")) {
          return;
       }
       if (p0 != null && !p0.isEmpty()) {
          StringBuilder str = p0.get("Host");
          if (str != null) {
             this.setOption(4, "host", str);
          }
          str = "";
          Iterator iterator = p0.entrySet().iterator();
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
       return;
    }
    public final void configUserAgent(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "91")) {
          return;
       }
       Object[] objArray = new Object[]{KsMediaPlayerInitConfig.packageName,KsMediaPlayerInitConfig.packageVersion,KwaiMediaPlayer.getVersion()};
       String str = String.format("a/%s/%s/%s", objArray);
       this.setOption(1, "user-agent", str);
       Object[] objArray1 = new Object[]{str};
       Timber.d("user-agent:%s", objArray1);
       return;
    }
    public void deselectTrack(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "49")) {
          return;
       }
       this._setStreamSelected(p0, false);
       return;
    }
    public void disableSoftVideoDecode(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "151")) {
          return;
       }
       this._disableSoftVideoDecode(p0);
       return;
    }
    public void enableAudioMono(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "200")) {
          return;
       }
       this.setOption(4, "audio-mono-type", (long)p0);
       return;
    }
    public void enableLoopOnBlock(int p0,int p1,long p2){
       if (PatchProxy.isSupport(KwaiMediaPlayer.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), this, KwaiMediaPlayer.class, "115")) {
          return;
       }
       this._enableLoopOnBlock(p0, p1, p2);
       return;
    }
    public void enableMediacodecDummy(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "223")) {
          return;
       }
       this._enableMediacodecDummy(p0);
       return;
    }
    public void enableMultiSurface(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "202")) {
          return;
       }
       this.mIsMultiSurface = true;
       KwaiMediaPlayer tmSurfaceTex = this.mSurfaceTextureRender;
       if (tmSurfaceTex != null) {
          tmSurfaceTex.f();
       }
       j oj = j.a();
       this.mSurfaceTextureRender = oj;
       oj.e(this.getSharedContext());
       return;
    }
    public void enablePipenodeV2(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "219")) {
          return;
       }
       if (p0) {
          this._enablePipenodeV2();
       }
       return;
    }
    public void enablePreDemux(int p0,long p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, kwaiMediaPla, "124")) {
          return;
       }
       this._enablePreDemux(p0, p1);
       return;
    }
    public void enableVideoRawDataCallback(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "108")) {
          return;
       }
       this._enableVideoRawDataCallback(p0);
       return;
    }
    public boolean getAPJoySoundSwitchStatus(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "231");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this._getAPJoySoundSwitchStatus();
    }
    public AppLiveAdaptiveRealtimeInfo getAppLiveAdaptiveRealtimeInfo(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "157");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AppLiveAdaptiveRealtimeInfo.from(this._getAppLiveAdaptiveRealtimeInfo());
    }
    public AppLiveQosDebugInfo getAppLiveQosDebugInfo(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "164");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AppLiveQosDebugInfo.from(this._getAppLiveQosDebugInfo());
    }
    public AspectAwesomeCache getAspectAwesomeCache(){
       KwaiMediaPlayer obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "87");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAspectAwesomeCache;
       Objects.requireNonNull(obj, "AspectAwesomeCache is not setup");
       return obj;
    }
    public AspectKFlv getAspectKFlv(){
       KwaiMediaPlayer obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "147");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAspectKFlv;
       Objects.requireNonNull(obj, "AspectKFlv is not setup");
       return obj;
    }
    public AspectKwaiVodAdaptive getAspectVodAdaptive(){
       KwaiMediaPlayer obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "149");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mVodAdaptive;
       Objects.requireNonNull(obj, "AspectKwaiVodAdaptive is not setup");
       return obj;
    }
    public long getAudioCachedBytes(){
       return this._getPropertyLong(0x4e28, 0);
    }
    public long getAudioCachedDuration(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getPropertyLong(0x4e26, 0);
    }
    public long getAudioCachedPackets(){
       return this._getPropertyLong(0x4e2a, 0);
    }
    public float getAudioRawLatencySeconds(){
       KwaiMediaPlayer obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "178");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.mAudioLatency;
       if (obj != -1) {
          return ((float)obj / 1000.00f);
       }
       return this._getPropertyFloat(0x7547, 0);
    }
    public native int getAudioSessionId();
    public float getAverageDisplayFps(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "177");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this._getPropertyFloat(0x7544, 0);
    }
    public long getBitrate(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "179");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getPropertyLong(0x4e84, 0);
    }
    public String getBriefVodStatJson(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "117");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getBriefVideoStatJson();
    }
    public float getBufferTimeMax(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "184");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this._getPropertyFloat(0x753d, 0);
    }
    public long getCpuUsage(){
       return this._getPropertyLong(0x7532, 0);
    }
    public long getCurAbsTime(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "183");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getPropertyLong(0x753a, 0);
    }
    public int getCurPlayingId(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)this._getPropertyLong(0x75f9, 0);
    }
    public String getCurPlayingUrl(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getPropertyString(0x7599);
    }
    public int getCurrentAudioRepresentationId(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this._getCurAudioRepresentationId();
    }
    public native long getCurrentPosition();
    public KwaiRepresentation getCurrentRepresentation(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getCurRepresentation();
    }
    public int getCurrentRepresentationId(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this._getCurRepresentationId();
    }
    public String getCurrentTranscodeType(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "222");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getPropertyString(0x759a);
    }
    public native long getCurrentVideoPosition();
    public String getDataSource(){
       return this.mDataSource;
    }
    public KwaiPlayerDebugInfo getDebugInfo(){
       KwaiMediaPlayer tmKwaiPlayer;
       KwaiPlayerDebugInfo obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "163");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(this.mKwaiPlayerDebugInfo.mSdkVersion)) {
          this.mKwaiPlayerDebugInfo.mSdkVersion = KwaiMediaPlayer.getVersion();
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
    public long getDecodeVideoFrameCount(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "174");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getPropertyLong(0x7542, 0);
    }
    public long getDecodedDataSize(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "166");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getPropertyLong(0x753b, 0);
    }
    public long getDecodedVideoHeight(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "182");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getPropertyLong(0x7538, 0);
    }
    public long getDecodedVideoWidth(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "181");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getPropertyLong(0x7537, 0);
    }
    public long getDisplayFrameCount(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "175");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getPropertyLong(0x7543, 0);
    }
    public long getDownloadDataSize(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "167");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getPropertyLong(0x753c, 0);
    }
    public int getDownloadedPercent(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "101");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this._getDownloadedPercent();
    }
    public long getDroppedDuration(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "172");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getPropertyLong(0x7541, 0);
    }
    public long getDtsDuration(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "168");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getPropertyLong(0x753f, 0);
    }
    public native long getDuration();
    public Map getExtraQosInfo(){
       return this.mExtraQosInfo;
    }
    public native long getFirstVideoPts();
    public String getKflvVideoPlayingUrl(){
       return this.getCurPlayingUrl();
    }
    public String getKwaiLiveVoiceComment(long p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, kwaiMediaPla, "152");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._getKwaiLiveVoiceComment(p0);
    }
    public String getKwaiSign(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "102");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getKwaiSign();
    }
    public String getKwaivppFilters(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "226");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getKwaivppFilters();
    }
    public native long getLastVideoPts();
    public String getLiveRealTimeQosJson(int p0,int p1,long p2,long p3,long p4){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Long.valueOf(p2),Long.valueOf(p3),Long.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, kwaiMediaPla, "155");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._getLiveRealTimeQosJson(p0, p1, p2, p3, p4);
    }
    public String getLiveStatJson(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "158");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getLiveStatJson();
    }
    public MediaInfo getMediaInfo(){
       String[] stringArray;
       MediaInfo obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "63");
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
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getMediaMeta();
    }
    public long getMemorySize(){
       return this._getPropertyLong(0x7533, 0);
    }
    public final int getNativeFd(FileDescriptor p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiMediaPlayer.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ParcelFileDescriptor.dup(p0).getFd();
    }
    public int getOrientationDegrees(){
       KwaiMediaPlayer obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "209");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mKwaiVR;
       if (obj != null) {
          return obj.b();
       }
       return 0;
    }
    public long getPlayerId(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "185");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getPlayerId();
    }
    public ProductContext getPlayerProductContext(){
       return this.mProductContext;
    }
    public String getPlayerTsJson(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "118");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getPlayerTsJson();
    }
    public float getProbeFps(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "94");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this._getProbeFps();
    }
    public long getReadVideoFrameCount(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "173");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getPropertyLong(0x7545, 0);
    }
    public Bitmap getScreenShot(){
       Object[] objArray = null;
       KwaiMediaPlayer obj = PatchProxy.apply(objArray, this, KwaiMediaPlayer.class, "96");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mVideoWidth;
       if (obj > null) {
          KwaiMediaPlayer tmVideoHeigh = this.mVideoHeight;
          if (tmVideoHeigh > null) {
             Bitmap uBitmap = Bitmap.createBitmap(obj, tmVideoHeigh, Bitmap$Config.RGB_565);
             this._getScreenShot(uBitmap);
             return uBitmap;
          }
       }
       return objArray;
    }
    public int getSelectedTrack(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "37");
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
    public String getServerAddress(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "169");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getPropertyString(0x7594);
    }
    public long getSourceDeviceType(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "176");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getPropertyLong(0x7546, 0);
    }
    public float getSpeed(float p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, kwaiMediaPla, "165");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this._getPropertyFloat(0x2713, 0);
    }
    public String getStreamId(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "170");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getPropertyString(0x7596);
    }
    public KwaiQosInfo getStreamQosInfo(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "159");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiQosInfo.fromBundle(this._getQosInfo());
    }
    public Surface getSurface(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mSurfaceManager.getSurface();
    }
    public int getTotalPlayBackDuration(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this._getTotalPlayBackDuration();
    }
    public ITrackInfo[] getTrackInfo(){
       return this.getTrackInfo();
    }
    public KsTrackInfo[] getTrackInfo(){
       Object[] objArray = null;
       Bundle obj = PatchProxy.apply(objArray, this, KwaiMediaPlayer.class, "64");
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
    public int getVideoAlphaType(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "212");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this._getVideoAlphaType();
    }
    public float getVideoAvgFps(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "180");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this._getPropertyFloat(0x7536, 0);
    }
    public long getVideoCachedBytes(){
       return this._getPropertyLong(0x4e27, 0);
    }
    public long getVideoCachedDuration(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getPropertyLong(0x4e25, 0);
    }
    public long getVideoCachedPackets(){
       return this._getPropertyLong(0x4e29, 0);
    }
    public long getVideoDecErrorCount(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "171");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getPropertyLong(0x7540, 0);
    }
    public float getVideoDecodeFramesPerSecond(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this._getPropertyFloat(0x2711, 0);
    }
    public int getVideoDecoder(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)this._getPropertyLong(0x4e23, 0);
    }
    public int getVideoHeight(){
       return this.mVideoHeight;
    }
    public float getVideoOutputFramesPerSecond(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this._getPropertyFloat(0x2712, 0);
    }
    public int getVideoSarDen(){
       return this.mVideoSarDen;
    }
    public int getVideoSarNum(){
       return this.mVideoSarNum;
    }
    public int getVideoWidth(){
       return this.mVideoWidth;
    }
    public String getVodAdaptiveCacheKey(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "120");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getVodAdaptiveCacheKey();
    }
    public String getVodAdaptiveHdrType(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "123");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getVodAdaptiveHdrType();
    }
    public String getVodAdaptiveHostName(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "122");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getVodAdaptiveHostName();
    }
    public int getVodAdaptiveRepID(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "121");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)this._getPropertyLong(0x75f8, 0);
    }
    public String getVodAdaptiveUrl(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "119");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getVodAdaptiveUrl();
    }
    public String getVodStatJson(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "116");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getVideoStatJson();
    }
    public String getXksCache(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "103");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._getXksCache();
    }
    public boolean handleTouchEvent(MotionEvent p0){
       KwaiMediaPlayer obj = PatchProxy.applyOneRefs(p0, this, KwaiMediaPlayer.class, "208");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mKwaiVR;
       if (obj != null) {
          return obj.c(p0);
       }
       return false;
    }
    public boolean hasNativeCdnRetry(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "186");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this._getPropertyLong(0x7549, 0) > 0)? true: false;
       return b;
    }
    public final void initPlayer(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "1")) {
          return;
       }
       super.initPlayer();
       this.native_setup(new WeakReference(this));
       return;
    }
    public void initProcessPCMBuffer(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "110")) {
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
    public boolean isAudioOnly(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this._isAudioOnly();
    }
    public boolean isCacheEnabled(){
       return this._isCacheEnabled();
    }
    public boolean isLiveManifest(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "156");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mAspectKFlv.isLiveManifest();
    }
    public boolean isLiveManifestNative(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "142");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this._isLiveManifest();
    }
    public boolean isLooping(){
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "51");
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
       Object obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "99");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this._isMediaPlayerValid();
    }
    public boolean isPlayable(){
       return true;
    }
    public native boolean isPlaying();
    public boolean isRepresentationEnableAdaptive(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "42");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this._isRepresentationEnableAdaptive(p0);
    }
    public native final void native_finalize();
    public native final void native_message_loop(Object p0);
    public native final void native_setup(Object p0);
    public final void notifyABLoopEndOfCounter(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "68")) {
          return;
       }
       KwaiMediaPlayer tmOnABLoopEn = this.mOnABLoopEndOfCounterListener;
       if (tmOnABLoopEn != null) {
          tmOnABLoopEn.onABLoopEndOfCounter(this);
       }
       return;
    }
    public final void notifyBulletScreenStateChange(int p0,int p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, kwaiMediaPla, "70")) {
          return;
       }
       kwaiMediaPla = this.mBulletScreenListener;
       if (kwaiMediaPla != null) {
          b uob = new b();
          uob.a = p0;
          kwaiMediaPla.onBulletScreenStateChange(uob, KwaiBulletScreenState.values()[p1]);
       }
       return;
    }
    public void notifyKwaiOnInfo(int p0,int p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, kwaiMediaPla, "25")) {
          return;
       }
       this.notifyOnInfoInHandler(p0, p1);
       return;
    }
    public final void notifyRepresentationChangeEnd(int p0,boolean p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, kwaiMediaPla, "66")) {
          return;
       }
       kwaiMediaPla = this.mKwaiRepresentationListener;
       if (kwaiMediaPla != null) {
          kwaiMediaPla.representationChangeEnd(p0, p1);
       }
       return;
    }
    public final void notifyRepresentationChangeStart(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(KwaiMediaPlayer.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, KwaiMediaPlayer.class, "65")) {
          return;
       }
       KwaiMediaPlayer tmKwaiRepres = this.mKwaiRepresentationListener;
       if (tmKwaiRepres != null) {
          tmKwaiRepres.representationChangeStart(p0, p1);
       }
       return;
    }
    public final void notifyRepresentationSelected(int p0,boolean p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, kwaiMediaPla, "67")) {
          return;
       }
       kwaiMediaPla = this.mKwaiRepresentationListener;
       if (kwaiMediaPla != null) {
          kwaiMediaPla.onRepresentationSelected(p0, p1);
       }
       return;
    }
    public final void notifySubtitleStateChangeEnd(int p0,int p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, kwaiMediaPla, "69")) {
          return;
       }
       kwaiMediaPla = this.mSubtitleListener;
       if (kwaiMediaPla != null) {
          kwaiMediaPla.onSelectedSubtitleStatusChange(p0, p1);
       }
       return;
    }
    public void onReceivePostEvent(Message p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "71")) {
          return;
       }
       Message what = p0.what;
       if (what != null) {
          boolean b = true;
          if (what != b) {
             int i = 2;
             boolean b1 = false;
             if (what != i) {
                if (what != 3) {
                   if (what != 4) {
                      if (what != 5) {
                         if (what != 99) {
                            if (what != 100) {
                               if (what != 200) {
                                  if (what != 201) {
                                     if (what != 300) {
                                        if (what != 0x2711) {
                                           if (what != 0x277b) {
                                              if (what != 0x32cc) {
                                                 if (what != 0x36b1) {
                                                    switch (what){
                                                        case 0x2ee1:
                                                          this.notifyRepresentationChangeStart(p0.arg1, p0.arg2, b1);
                                                          break;
                                                        case 0x2ee2:
                                                          what = p0.arg1;
                                                          if (p0.arg2 == null) {
                                                             b = false;
                                                          }
                                                          this.notifyRepresentationChangeEnd(what, b);
                                                          break;
                                                        case 0x2ee3:
                                                          what = p0.arg1;
                                                          if (p0.arg2 == null) {
                                                             b = false;
                                                          }
                                                          this.notifyRepresentationSelected(what, b);
                                                          break;
                                                        default:
                                                          DebugLog.e(KwaiMediaPlayer.TAG, "Unknown message type "+p0.what);
                                                    }
                                                 }else {
                                                    this.notifyBulletScreenStateChange(p0.arg1, p0.arg2);
                                                 }
                                              }else {
                                                 this.notifySubtitleStateChangeEnd(p0.arg1, p0.arg2);
                                              }
                                           }else {
                                              this.notifyABLoopEndOfCounter();
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
                                        objArray = new Object[i];
                                        objArray[b1] = Long.valueOf(l);
                                        objArray[b] = kwaiLiveVoic;
                                        Timber.i("MEDIA_LIVE_VC_TIME, vc_time:%d, voice_comment:%s", objArray);
                                        KwaiMediaPlayer tmOnLiveVoic = this.mOnLiveVoiceCommentListener;
                                        if (tmOnLiveVoic != null) {
                                           tmOnLiveVoic.onLiveVoiceCommentChange(this, kwaiLiveVoic);
                                        }
                                     }
                                  }else {
                                     this.notifyOnInfoExtra(p0.arg1, p0.obj);
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
                                     this.mBufferingCount = this.mBufferingCount + b;
                                     this.mStartBufferingTime = System.currentTimeMillis();
                                  }
                                  this.notifyOnInfo(p0.arg1, p0.arg2);
                                  return;
                               }
                            }else {
                               objArray = new Object[i];
                               objArray[b1] = Integer.valueOf(p0.arg1);
                               objArray[b] = Integer.valueOf(p0.arg2);
                               Timber.e("MEDIA_ERROR, msg.arg1:%d, msg.arg2:%d", objArray);
                               if (!this.notifyOnError(p0.arg1, p0.arg2)) {
                                  this.notifyOnCompletion();
                               }
                               this.stayAwake(b1);
                               return;
                            }
                         }
                      }else {
                         what = p0.arg2;
                         this.mVideoHeight = what;
                         this.mVideoWidth = (this.mIsLive != null && this.mIsVR != null)? (int)((double)what * 0x3fe2000000000000): p0.arg1;
                         this.notifyOnVideoSizeChanged(this.mVideoWidth, what, this.mVideoSarNum, this.mVideoSarDen);
                         this.resizeVideo(this.mVideoWidth, this.mVideoHeight);
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
                this.notifyOnCompletion();
                this.stayAwake(b1);
                return;
             }
          }else {
             this.notifyOnPrepared();
          }
       }
       return;
    }
    public Surface openSurface(){
       KwaiMediaPlayer obj = PatchProxy.apply(null, this, KwaiMediaPlayer.class, "206");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mSurfaceTextureRender;
       if (obj != null) {
          return obj.d();
       }
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "30")) {
          return;
       }
       this.stayAwake(false);
       this._pause();
       return;
    }
    public void prepareAsync(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "28")) {
          return;
       }
       this.mAppQosLiveRealtimeWrapper.d(this.mDataSource);
       this.mAppQosLiveAdaptiveRealtimeWrapper.d();
       this._prepareAsync();
       return;
    }
    public void registerSensorEvent(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "210")) {
          return;
       }
       KwaiMediaPlayer tmKwaiVR = this.mKwaiVR;
       if (tmKwaiVR != null) {
          tmKwaiVR.e();
       }
       return;
    }
    public final void release(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "35")) {
          return;
       }
       if (this.mIsVodAdaptive != null) {
          PlayerPreferrenceUtil.getInstance().saveVodAdaptiveData();
       }
       this.stayAwake(false);
       this.updateSurfaceScreenOn();
       this._release();
       this.resetListeners();
       this.mAspectAwesomeCache.release();
       if (this.mIsVR != null || this.mIsMultiSurface != null) {
          KwaiMediaPlayer tmSurfaceTex = this.mSurfaceTextureRender;
          if (tmSurfaceTex != null) {
             tmSurfaceTex.f();
          }
          tmSurfaceTex = this.mKwaiVR;
          if (tmSurfaceTex != null) {
             tmSurfaceTex.f();
             this.mKwaiVR = null;
          }
       }
       this.unInitPlayer();
       return;
    }
    public void releaseAsync(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "33")) {
          return;
       }
       this.releaseAsync(null);
       return;
    }
    public void releaseAsync(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "34")) {
          return;
       }
       c.a(new KwaiMediaPlayer$1(this, p0));
       return;
    }
    public void reload(String p0,boolean p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, kwaiMediaPla, "92")) {
          return;
       }
       this._reload(p0, p1);
       return;
    }
    public int removeBulletScreen(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "199");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._removeBulletScreen(p0);
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "36")) {
          return;
       }
       this.stayAwake(false);
       this._reset();
       super.reset();
       this.mVideoWidth = 0;
       this.mVideoHeight = 0;
       return;
    }
    public void resetListeners(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "73")) {
          return;
       }
       super.resetListeners();
       KwaiMediaPlayer tmPcmBufferH = this.mPcmBufferHandler;
       if (tmPcmBufferH) {
          this._releasePcmBuffer(tmPcmBufferH);
       }
       this.mProcessPCMBuffer = null;
       this.mKwaiRepresentationListener = null;
       return;
    }
    public final void resetSomething(){
       this.mBufferingCount = 0;
       this.mTotalBufferingTime = 0;
       this.mStartBufferingTime = 0;
    }
    public void resizeVideo(int p0,int p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, kwaiMediaPla, "215")) {
          return;
       }
       kwaiMediaPla = this.mSurfaceTextureRender;
       if (kwaiMediaPla != null) {
          kwaiMediaPla.h(p0, p1);
       }
       return;
    }
    public native void seekTo(long p0);
    public void selectTrack(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "38")) {
          return;
       }
       this._setStreamSelected(p0, true);
       return;
    }
    public void setAPJoySoundSwitchStatus(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "230")) {
          return;
       }
       this._setAPJoySoundSwitchStatus(p0);
       return;
    }
    public void setAbLoop(long p0,long p1,int p2){
       if (PatchProxy.isSupport(KwaiMediaPlayer.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, KwaiMediaPlayer.class, "213")) {
          return;
       }
       this._enableAbLoop(p0, p1, p2, false);
       return;
    }
    public void setAbLoop(long p0,long p1,int p2,boolean p3){
       if (PatchProxy.isSupport(KwaiMediaPlayer.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, KwaiMediaPlayer.class, "214")) {
          return;
       }
       this._enableAbLoop(p0, p1, p2, p3);
       return;
    }
    public void setAppQosStatJson(JSONObject p0){
       String str = "page_session_id";
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "129")) {
          return;
       }
       try{
          if (p0.has(str)) {
             KwaiMediaPlayer tmAppQosLive = this.mAppQosLiveRealtimeWrapper;
             if (tmAppQosLive != null) {
                tmAppQosLive.b(p0.getString(str));
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       this._setLiveAppQosInfo(p0.toString());
       return;
    }
    public void setAudioLatency(int p0){
       this.mAudioLatency = p0;
    }
    public void setAudioRepresentation(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "45")) {
          return;
       }
       this._setAudioRepresentation(p0);
       return;
    }
    public void setAudioStreamType(int p0){
    }
    public void setAwesomeCacheCallback(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "144")) {
          return;
       }
       this._setAwesomeCacheCallback(p0);
       return;
    }
    public void setBufferSize(int p0){
    }
    public void setCdnStatEvent(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "146")) {
          return;
       }
       this._setCustomCdnEvent(p0);
       return;
    }
    public void setCencKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "112")) {
          return;
       }
       this.setOption(1, "decryption_key", p0);
       return;
    }
    public void setClickCoordForOpaque(float p0,float p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, kwaiMediaPla, "232")) {
          return;
       }
       this._setClickCoordForOpaque(p0, p1);
       return;
    }
    public void setCodecFlag(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "187")) {
          return;
       }
       if (p0 <= 0) {
          p0 = 0;
       }
       this._setCodecFlag(p0);
       return;
    }
    public void setConfig(KwaiPlayerConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "160")) {
          return;
       }
       if (p0 == null) {
          throw new IllegalStateException("method invoking failed pConfig ==null !");
       }
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
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "161")) {
          return;
       }
       this._setConfigJson(p0);
       return;
    }
    public void setConnectionTimeout(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "220")) {
          return;
       }
       this._setConnectionTimeout(p0);
       return;
    }
    public void setContext(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "204")) {
          return;
       }
       super.setContext(p0);
       this.mContext = p0;
       return;
    }
    public void setDataSource(Context p0,Uri p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiMediaPlayer.class, "11")) {
          return;
       }
       this.setDataSource(p0, p1, null);
       return;
    }
    public void setDataSource(Context p0,Uri p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KwaiMediaPlayer.class, "12")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "17")) {
          return;
       }
       this._setDataSource(p0);
       return;
    }
    public void setDataSource(FileDescriptor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "15")) {
          return;
       }
       this.mDataSource = p0.toString();
       this._setDataSourceFd(this.getNativeFd(p0), 0, 0);
       return;
    }
    public final void setDataSource(FileDescriptor p0,long p1,long p2){
       if (PatchProxy.isSupport(KwaiMediaPlayer.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, KwaiMediaPlayer.class, "27")) {
          return;
       }
       this.mDataSource = p0.toString();
       this._setDataSourceFd(this.getNativeFd(p0), p1, p2);
       return;
    }
    public void setDataSource(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "13")) {
          return;
       }
       this.mDataSource = p0;
       this.configUserAgent();
       this._setDataSource(p0, null, null);
       return;
    }
    public void setDataSource(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiMediaPlayer.class, "14")) {
          return;
       }
       if (p1 != null && !p1.isEmpty()) {
          StringBuilder str = p1.get("Host");
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
    public void setDisableHlsAbr(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "82")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(1, "disable_hls_abr", l);
       return;
    }
    public void setDisplay(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "2")) {
          return;
       }
       this.mSurfaceManager.asSurfaceHolder(p0);
       this.setVideoSurface(this.mSurfaceManager.getSurface());
       this.updateSurfaceScreenOn();
       return;
    }
    public void setDrmKeyInfo(String p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiMediaPlayer.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KwaiMediaPlayer.class, "113")) {
          return;
       }
       this._setDrmKeyInfo(p0, p1, p2);
       return;
    }
    public void setEnableAudioConvert(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "218")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(4, "audio-convert.enable", l);
       return;
    }
    public void setEnableAudioMix(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "77")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(4, "enable-audio-mix", l);
       return;
    }
    public void setEnableAudioSpectrum(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "107")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(4, "enable-audio-spectrum", l);
       return;
    }
    public void setEnableBulletScreenCache(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "76")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(4, "enable-bullet-screen-cache", l);
       return;
    }
    public void setEnableManifestRetry(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "84")) {
          return;
       }
       int i = 4;
       long l = 1;
       long l1 = (p0)? l: 0;
       this.setOption(i, "enable-manfiest-retry", l1);
       if (!p0) {
          l = 0;
       }
       this.setOption(1, "enable_retry_for_forbidden_error", l);
       return;
    }
    public void setEnablePlaylistCache(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "78")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(1, "enable_playlist_cache", l);
       return;
    }
    public void setEnableSegmentCache(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "75")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(4, "enable-segment-cache", l);
       return;
    }
    public void setExtOption(int p0,int p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, kwaiMediaPla, "86")) {
          return;
       }
       int i = 1;
       if (p0 != i) {
          if (p0 != 2) {
             if (p0 != 3) {
                int i1 = 4;
                if (p0 != i1) {
                   if (p0 == 6) {
                      this.setOption(i, "view_pixel_ratio", (long)p1);
                   }
                }else {
                   this.setOption(i1, "no-aemon-reason", (long)p1);
                }
             }else {
                this.setOption(i, "view_height", (long)p1);
             }
          }else {
             this.setOption(i, "view_width", (long)p1);
          }
       }else {
          this.setOption(i, "special_buffer_init_ms", (long)p1);
       }
       return;
    }
    public void setExtOption(int p0,String p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, kwaiMediaPla, "85")) {
          return;
       }
       if (p0 == 5) {
          this.setNetworkRetryScene(p1);
       }
       return;
    }
    public void setExtSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "18")) {
          return;
       }
       DebugLog.i(KwaiMediaPlayer.TAG, "setExtSurface "+String.valueOf(p0));
       this.mExtSurfaceManager.asSurface(p0);
       this.updateMultiSurface(this.mExtSurfaceManager.getSurface());
       return;
    }
    public void setExtSurfaceCrop(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(KwaiMediaPlayer.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, KwaiMediaPlayer.class, "22")) {
          return;
       }
       KwaiMediaPlayer tmSurfaceTex = this.mSurfaceTextureRender;
       if (tmSurfaceTex != null) {
          tmSurfaceTex.j(p0, p1, p2, p3, 1);
       }
       return;
    }
    public void setExtSurfaceCrop(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(KwaiMediaPlayer.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, KwaiMediaPlayer.class, "21")) {
          return;
       }
       KwaiMediaPlayer tmSurfaceTex = this.mSurfaceTextureRender;
       if (tmSurfaceTex != null) {
          tmSurfaceTex.k(p0, p1, p2, p3, 1);
       }
       return;
    }
    public void setExtSurfaceTexture(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "19")) {
          return;
       }
       DebugLog.i(KwaiMediaPlayer.TAG, "setExtSurfaceTexture "+String.valueOf(p0));
       this.mExtSurfaceManager.asSurfaceTexture(p0);
       this.updateMultiSurface(this.mExtSurfaceManager.getSurface());
       return;
    }
    public void setHeadTracker(float p0,float p1,float p2){
       if (PatchProxy.isSupport(KwaiMediaPlayer.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, KwaiMediaPlayer.class, "217")) {
          return;
       }
       this._setHeadTracker(p0, p1, p2);
       return;
    }
    public void setHevcCodecName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "98")) {
          return;
       }
       this._setHevcCodecName(p0);
       return;
    }
    public void setHlsEnableMediaCodecBytebuffer(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "83")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(4, "hls-use-mediacodec-bytebuffer", l);
       return;
    }
    public void setHlsSegmentAlignThreshold(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "80")) {
          return;
       }
       this.setOption(1, "segment_align_threshold_ms", (long)p0);
       return;
    }
    public void setHttpResponseErrorCallback(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "145")) {
          return;
       }
       this._setHttpResponseErrorCallback(p0);
       return;
    }
    public void setIndexContent(String p0,String p1,String p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, KwaiMediaPlayer.class, "125")) {
          return;
       }
       this.mDataSource = p0;
       this.configHeaders(p3);
       this.configUserAgent();
       this._setDataSource(p0, null, null);
       this.setOption(4, "input-data-type", 2);
       this.setOption(4, "index-content.pre_path", p1);
       this.setOption(4, "index-content.content", p2);
       return;
    }
    public void setInteractiveMode(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "207")) {
          return;
       }
       this.mInteractivemode = p0;
       kwaiMediaPla = this.mKwaiVR;
       if (kwaiMediaPla != null) {
          kwaiMediaPla.h(p0);
       }
       return;
    }
    public void setIsLive(boolean p0){
       this.mIsLive = p0;
    }
    public void setIsVR(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "201")) {
          return;
       }
       this.mIsVR = p0;
       this.setVR();
       return;
    }
    public void setIsVodAdaptive(boolean p0){
       this.mIsVodAdaptive = p0;
    }
    public void setKeepInBackground(boolean p0){
    }
    public void setKwaiAudioRepresentationListener(IKwaiRepresentationListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "191")) {
          return;
       }
       this.mKwaiAudioRepresentationListener = p0;
       this._setAudioRepresentationListener(new WeakReference(this.mKwaiAudioRepresentationListener));
       return;
    }
    public void setKwaiBulletScreenListener(IKwaiBulletScreenListener p0){
       this.mBulletScreenListener = p0;
    }
    public void setKwaiInjectHttpCallback(IKwaiInjectHttpCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "192")) {
          return;
       }
       if (this.mKwaiInjectHttpCallback != null) {
          Object[] objArray = new Object[0];
          Timber.w("do not setKwaiInjectHttpCallback more than once!", objArray);
          return;
       }else {
          this.mKwaiInjectHttpCallback = p0;
          this._setKwaiInjectHttpCallback(new WeakReference(this.mKwaiInjectHttpCallback));
          return;
       }
    }
    public void setKwaiManifest(String p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KwaiMediaPlayer.class, "126")) {
          return;
       }
       if (p0 == null || p0.isEmpty()) {
          p0 = "KwaiManifest";
       }
       if (p1 != null && !p1.isEmpty()) {
          this.mDataSource = p0;
          this.configHeaders(p2);
          this.configUserAgent();
          this._setDataSource(p0, null, null);
          this.setOption(4, "input-data-type", 3);
          this.setOption(4, "index-content.content", p1);
          return;
       }else {
          throw new IllegalArgumentException("Empty manifest!");
       }
    }
    public void setKwaiRepresentationListener(IKwaiRepresentationListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "190")) {
          return;
       }
       this.mKwaiRepresentationListener = p0;
       this._setRepresentationListener(new WeakReference(this.mKwaiRepresentationListener));
       return;
    }
    public void setKwaiSubtitleListener(IKwaiSubtitleListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "194")) {
          return;
       }
       this.mSubtitleListener = p0;
       this._setKwaiSubtitleListener(new WeakReference(this.mSubtitleListener));
       return;
    }
    public void setKwaiVodDrmCallback(IKwaiVodDrmCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "114")) {
          return;
       }
       this.mKwaiVodDrmCallback = p0;
       this._setVodDrmCallback(new WeakReference(this.mKwaiVodDrmCallback));
       return;
    }
    public void setKwaivppExtJson(int p0,String p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, kwaiMediaPla, "227")) {
          return;
       }
       this._setKwaivppExtJson(p0, p1);
       return;
    }
    public void setKwaivppFilters(int p0,String p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, kwaiMediaPla, "224")) {
          return;
       }
       this._setKwaivppFilters(p0, p1);
       return;
    }
    public void setKwaivppKswitchJson(int p0,String p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, kwaiMediaPla, "225")) {
          return;
       }
       this._setKwaivppKswitchJson(p0, p1);
       return;
    }
    public void setLastTryFlag(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "111")) {
          return;
       }
       this._setLastTryFlag(p0);
       return;
    }
    public void setLiveLowDelayConfigJson(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "162")) {
          return;
       }
       this._setLiveLowDelayConfigJson(p0);
       return;
    }
    public void setLiveManifestSwitchMode(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "139")) {
          return;
       }
       this._setLiveManifestSwitchMode(p0);
       return;
    }
    public void setLiveOnPeriodicalLiveAdaptiveQosStatListener(IMediaPlayer$OnLiveAdaptiveQosStatListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "140")) {
          return;
       }
       this.mAppQosLiveAdaptiveRealtimeWrapper.b(p0);
       return;
    }
    public void setLiveOnQosStatListener(IMediaPlayer$OnQosStatListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "132")) {
          return;
       }
       this.mOnQosStatListener = p0;
       this.mAppQosLiveRealtimeWrapper.a(p0);
       return;
    }
    public void setLooping(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "50")) {
          return;
       }
       int i = p0 ^ 0x01;
       this.setOption(4, "loop", (long)i);
       this._setLoopCount(i);
       return;
    }
    public void setNetworkRetryScene(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "26")) {
          return;
       }
       this._setNetworkRetryScene(p0);
       return;
    }
    public void setOnABLoopEndOfCounterListener(IMediaPlayer$OnABLoopEndOfCounterListener p0){
       this.mOnABLoopEndOfCounterListener = p0;
    }
    public final void setOnControlMessageListener(KwaiMediaPlayer$OnControlMessageListener p0){
       this.mOnControlMessageListener = p0;
    }
    public void setOnLiveExtraInfoListener(IKwaiMediaPlayer$OnLiveExtraInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "137")) {
          return;
       }
       if (p0 != null) {
          this._setOnLiveExtraInfoListener(new WeakReference(p0));
       }
       return;
    }
    public void setOnLiveInterActiveListener(IKwaiMediaPlayer$OnLiveInterActiveListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "134")) {
          return;
       }
       this.setOnLiveInterActiveListener(p0, IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType.KwaiLiveListenerTypeAll);
       return;
    }
    public void setOnLiveInterActiveListener(IKwaiMediaPlayer$OnLiveInterActiveListener p0,IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiMediaPlayer.class, "133")) {
          return;
       }
       if (p0 != null) {
          this._setOnLiveInterActiveListener(new WeakReference(p0), p1.getIndex());
       }
       return;
    }
    public void setOnLiveSeiInfoListener(IKwaiMediaPlayer$OnLiveSeiInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "136")) {
          return;
       }
       if (p0 != null) {
          this._setOnLiveSeiInfoListener(new WeakReference(p0));
       }
       return;
    }
    public void setOnLiveSrvTsptInfoListener(IKwaiMediaPlayer$OnLiveSrvTsptInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "135")) {
          return;
       }
       if (p0 != null) {
          this._setOnLiveSrvTsptInfoListener(new WeakReference(p0));
       }
       return;
    }
    public void setOnLiveVoiceCommentListener(IMediaPlayer$OnLiveVoiceCommentListener p0){
       this.mOnLiveVoiceCommentListener = p0;
    }
    public void setOnNativeInvokeListener(KwaiMediaPlayer$OnNativeInvokeListener p0){
       this.mOnNativeInvokeListener = p0;
    }
    public void setOnQosEventInfoListener(OnQosEventInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "193")) {
          return;
       }
       if (p0 != null) {
          this._setOnQosEventInfoListener(new WeakReference(p0));
       }
       return;
    }
    public void setOnVideoRenderListener(IKwaiMediaPlayer$OnVideoRenderListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "138")) {
          return;
       }
       if (p0 != null) {
          this._setOnVideoRenderListener(new WeakReference(p0));
       }
       return;
    }
    public void setOption(int p0,String p1,long p2){
       if (PatchProxy.isSupport(KwaiMediaPlayer.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Long.valueOf(p2), this, KwaiMediaPlayer.class, "54")) {
          return;
       }
       this._setOption(p0, p1, p2);
       return;
    }
    public void setOption(int p0,String p1,String p2){
       if (PatchProxy.isSupport(KwaiMediaPlayer.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KwaiMediaPlayer.class, "53")) {
          return;
       }
       this._setOption(p0, p1, p2);
       return;
    }
    public void setPlayerMute(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "189")) {
          return;
       }
       this._setPlayerMute(p0);
       return;
    }
    public void setProductContext(ProductContext p0){
       this.mProductContext = p0;
    }
    public void setPropertyFloat(int p0,float p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, kwaiMediaPla, "89")) {
          return;
       }
       this._setPropertyFloat(p0, p1);
       return;
    }
    public void setQy265Context(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "203")) {
          return;
       }
       this._setQy265Context(p0);
       return;
    }
    public void setReadTimeout(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "221")) {
          return;
       }
       this._setReadTimeout(p0);
       return;
    }
    public void setRepresentation(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "39")) {
          return;
       }
       this._setRepresentation(p0);
       return;
    }
    public boolean setRotateDegree(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "105");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this._setRotateDegree(p0);
    }
    public void setScreenOnWhilePlaying(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "7")) {
          return;
       }
       if (this.mScreenOnWhilePlaying != p0) {
          if (p0 && !this.mSurfaceManager.isSourceSurfaceHolder()) {
             DebugLog.w(KwaiMediaPlayer.TAG, "setScreenOnWhilePlaying\(true\) is ineffective without a SurfaceHolder");
          }
          this.mScreenOnWhilePlaying = p0;
          this.updateSurfaceScreenOn();
       }
       return;
    }
    public void setSegmentCacheCount(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "79")) {
          return;
       }
       this.setOption(1, "segment_cache_count", (long)p0);
       return;
    }
    public void setSpeed(float p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, kwaiMediaPla, "95")) {
          return;
       }
       this._setSpeed(p0);
       return;
    }
    public void setStartPlayBlockBufferMs(int p0,int p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, kwaiMediaPla, "88")) {
          return;
       }
       this._setStartPlayBlockBufferMs(p0, p1);
       return;
    }
    public void setStartPlayBlockBufferStrategy(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "106")) {
          return;
       }
       this._setStartPlayBlockBufferStrategy(p0);
       return;
    }
    public void setStereoType(int p0){
       this.mStereoType = p0;
    }
    public void setSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "3")) {
          return;
       }
       if (this.mScreenOnWhilePlaying != null && p0 != null) {
          DebugLog.w(KwaiMediaPlayer.TAG, "setScreenOnWhilePlaying\(true\) is ineffective for Surface");
       }
       this.mSurfaceManager.asSurface(p0);
       this.setVideoSurface(this.mSurfaceManager.getSurface());
       return;
    }
    public void setSurfaceTexture(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "4")) {
          return;
       }
       if (this.mScreenOnWhilePlaying != null && p0 != null) {
          DebugLog.w(KwaiMediaPlayer.TAG, "setScreenOnWhilePlaying\(true\) is ineffective for SurfaceTexture");
       }
       this.mSurfaceManager.asSurfaceTexture(p0);
       this.setVideoSurface(this.mSurfaceManager.getSurface());
       return;
    }
    public void setSutitleSelected(int p0,boolean p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, kwaiMediaPla, "196")) {
          return;
       }
       this._setSubtitleSelected(p0, p1);
       return;
    }
    public void setTag1(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "97")) {
          return;
       }
       this.setOption(4, "tag1", (long)p0);
       return;
    }
    public void setTone(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "52")) {
          return;
       }
       this._setTone(p0);
       return;
    }
    public void setUseSegmentPreload(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "81")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(1, "use_segment_preload", l);
       return;
    }
    public void setVR(){
       KwaiMediaPlayer tmKwaiVR;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KwaiMediaPlayer.class, "205")) {
          return;
       }
       if (this.mIsVR != null) {
          u$a uoa = u.a();
          uoa.c(this.mInteractivemode);
          boolean b = true;
          uoa.d(b);
          uoa.b(this.mContext);
          uoa.e(this.mStereoType);
          u ou = uoa.a();
          this.mKwaiVR = ou;
          if (!ou.d()) {
             this.mIsVR = false;
             tmKwaiVR = this.mKwaiVR;
             if (tmKwaiVR != null) {
                tmKwaiVR.f();
                this.mKwaiVR = objArray;
             }
             return;
          }else {
             this.setOption(b, "video-stereo-type", (long)this.mStereoType);
             this.setOption(4, "video-stereo-type", (long)this.mStereoType);
             tmKwaiVR = this.mSurfaceTextureRender;
             if (tmKwaiVR != null) {
                tmKwaiVR.f();
             }
             j oj = j.b();
             this.mSurfaceTextureRender = oj;
             oj.e(objArray);
             this.mSurfaceTextureRender.m(this.mKwaiVR);
             this.mSurfaceTextureRender.l(new KwaiMediaPlayer$2(this));
          }
       }
       return;
    }
    public void setVideoScalingMode(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "104")) {
          return;
       }
       this._setVideoScalingMode(p0);
       return;
    }
    public final void setVideoSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "6")) {
          return;
       }
       if (this.mIsVR != null || this.mIsMultiSurface != null) {
          Surface surface = (p0 != null)? this.openSurface(): p0;
          KwaiMediaPlayer tmSurfaceTex = this.mSurfaceTextureRender;
          if (tmSurfaceTex != null) {
             tmSurfaceTex.q(p0, 0);
          }
          p0 = surface;
       }
       this._setVideoSurface(p0);
       return;
    }
    public void setViewSize(int p0,int p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, kwaiMediaPla, "23")) {
          return;
       }
       this.setViewSize(p0, p1, 0);
       return;
    }
    public void setViewSize(int p0,int p1,float p2){
       if (PatchProxy.isSupport(KwaiMediaPlayer.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), this, KwaiMediaPlayer.class, "24")) {
          return;
       }
       this._setViewSizeWithRatio(p0, p1, p2);
       return;
    }
    public native void setVolume(float p0,float p1);
    public void setWakeMode(Context p0,int p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, kwaiMediaPla, "9")) {
          return;
       }
       KwaiMediaPlayer tmWakeLock = this.mWakeLock;
       if (tmWakeLock != null) {
          if (tmWakeLock.isHeld()) {
             this.mWakeLock.release();
          }else {
             tmWakeLock = 0;
          }
          this.mWakeLock = null;
       }else {
          tmWakeLock = 0;
       }
       PowerManager$WakeLock wakeLock = p0.getSystemService("power").newWakeLock((p1 | 0x20000000), kwaiMediaPla.getName());
       this.mWakeLock = wakeLock;
       wakeLock.setReferenceCounted(false);
       if (1) {
          this.mWakeLock.acquire();
       }
       return;
    }
    public void setupAspectKlv(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "141")) {
          return;
       }
       this.mAspectKFlv = new KwaiAspectKFlv(this, p0);
       return;
    }
    public void setupAspectKwaiVodAdaptive(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "148")) {
          return;
       }
       this.mVodAdaptive = new AspectKwaiVodAdaptive(this, p0);
       return;
    }
    public void setupAspectLiveRealTimeReporter(boolean p0,KwaiPlayerConfig p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, kwaiMediaPla, "128")) {
          return;
       }
       if (p0) {
          e uoe = new e(this, p1.f());
          this.mAppQosLiveRealtimeWrapper = uoe;
          uoe.c(p1.l());
          c uoc = new c(this, p1.e());
          this.mAppQosLiveAdaptiveRealtimeWrapper = uoc;
          uoc.a(p1.d());
          this.mAppQosLiveAdaptiveRealtimeWrapper.c(p1.h());
       }else {
          this.mAppQosLiveRealtimeWrapper = new e(this, false);
          this.mAppQosLiveAdaptiveRealtimeWrapper = new c(this, false);
       }
       return;
    }
    public void setupAspectNativeCache(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "74")) {
          return;
       }
       this.mAspectAwesomeCache = new KwaiPlayerAspectAwesomeCache(this, p0);
       return;
    }
    public void setupCacheSessionListener(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "143")) {
          return;
       }
       this._setupCacheSessionListener(p0);
       return;
    }
    public void shutdownWaitStop(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "32")) {
          return;
       }
       this.stayAwake(false);
       this.stopDrawLoopTimer();
       this._shutdownWaitStop();
       this.stopLiveStatTimerImmediately();
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "29")) {
          return;
       }
       this.stayAwake(true);
       this._start();
       return;
    }
    public void startLiveStatTimer(KwaiPlayerConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "130")) {
          return;
       }
       this.setupAspectLiveRealTimeReporter(true, p0);
       this.mAppQosLiveRealtimeWrapper.a(this.mOnQosStatListener);
       this.mAppQosLiveRealtimeWrapper.d(this.mDataSource);
       this.mAppQosLiveAdaptiveRealtimeWrapper.d();
       return;
    }
    public final void stayAwake(boolean p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiMediaPla, "10")) {
          return;
       }
       kwaiMediaPla = this.mWakeLock;
       if (kwaiMediaPla != null) {
          if (p0 && !kwaiMediaPla.isHeld()) {
             this.mWakeLock.acquire();
          }else if(!p0 && this.mWakeLock.isHeld()){
             this.mWakeLock.release();
          }
       }
       this.mStayAwake = p0;
       this.updateSurfaceScreenOn();
       return;
    }
    public void stepFrame(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "93")) {
          return;
       }
       this.stayAwake(false);
       this._step_frame();
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "31")) {
          return;
       }
       this.stopLiveStatTimerImmediately();
       this.stayAwake(false);
       this.stopDrawLoopTimer();
       this._stop();
       return;
    }
    public void stopDrawLoopTimer(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "216")) {
          return;
       }
       KwaiMediaPlayer tmSurfaceTex = this.mSurfaceTextureRender;
       if (tmSurfaceTex != null) {
          tmSurfaceTex.n();
       }
       return;
    }
    public void stopLiveStatTimerImmediately(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "131")) {
          return;
       }
       this.mAppQosLiveRealtimeWrapper.e();
       this.mAppQosLiveAdaptiveRealtimeWrapper.e();
       return;
    }
    public void unRegisterSensorEvent(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "211")) {
          return;
       }
       KwaiMediaPlayer tmKwaiVR = this.mKwaiVR;
       if (tmKwaiVR != null) {
          tmKwaiVR.j();
       }
       return;
    }
    public void updateAdaptiveMode(int p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiMediaPla, "41")) {
          return;
       }
       this._updateAdaptiveMode(p0);
       return;
    }
    public void updateCurrentMaxWallClockOffset(long p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, kwaiMediaPla, "154")) {
          return;
       }
       this._updateCurrentMaxWallClockOffset(p0);
       return;
    }
    public void updateCurrentWallClock(long p0){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, kwaiMediaPla, "153")) {
          return;
       }
       this._updateCurrentWallClock(p0);
       return;
    }
    public int updateKwaiManfiest(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiMediaPlayer.class, "127");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this._updateKwaiManfiest(p0);
    }
    public final void updateMultiSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiMediaPlayer.class, "20")) {
          return;
       }
       KwaiMediaPlayer tmSurfaceTex = this.mSurfaceTextureRender;
       if (tmSurfaceTex != null) {
          tmSurfaceTex.q(p0, 1);
       }
       return;
    }
    public void updateRepresentationAdaptiveFlag(int p0,boolean p1){
       KwaiMediaPlayer kwaiMediaPla = KwaiMediaPlayer.class;
       if (PatchProxy.isSupport(kwaiMediaPla) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, kwaiMediaPla, "40")) {
          return;
       }
       this._updateRepresentationAdaptiveFlag(p0, p1);
       return;
    }
    public final void updateSurfaceScreenOn(){
       if (PatchProxy.applyVoid(null, this, KwaiMediaPlayer.class, "8")) {
          return;
       }
       KwaiMediaPlayer tmSurfaceMan = this.mSurfaceManager;
       boolean b = (this.mScreenOnWhilePlaying != null && this.mStayAwake != null)? true: false;
       tmSurfaceMan.setKeepScreenOn(b);
       return;
    }
}
