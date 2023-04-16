package com.kwai.video.player.KsMediaPlayerAemonImpl;
import com.kwai.video.player.KsMediaPlayer;
import com.kwai.video.player.KsMediaPlayer$Builder;
import com.kwai.video.player.KsPlayerCore;
import com.kwai.video.player.PlayerLibraryLoader$FindBestParam;
import com.kwai.video.player.KsMediaPlayerAemonImpl$1;
import com.kwai.video.player.KsMediaPlayerAemonImpl$2;
import com.kwai.video.player.KsMediaPlayerAemonImpl$3;
import com.kwai.video.player.KsMediaPlayerAemonImpl$4;
import com.kwai.video.player.KsMediaPlayerAemonImpl$5;
import com.kwai.video.player.KsMediaPlayerAemonImpl$6;
import com.kwai.video.player.KsMediaPlayerAemonImpl$7;
import com.kwai.video.player.KsMediaPlayerAemonImpl$8;
import com.kwai.video.player.KsMediaPlayerAemonImpl$9;
import com.kwai.video.player.KsMediaPlayerAemonImpl$10;
import com.kwai.video.player.KsMediaPlayerAemonImpl$11;
import com.kwai.video.player.KsMediaPlayerAemonImpl$12;
import com.kwai.video.player.KsMediaPlayerAemonImpl$13;
import com.kwai.video.player.KsMediaPlayerAemonImpl$14;
import com.kwai.video.player.KsMediaPlayerAemonImpl$15;
import com.kwai.player.KwaiPlayerConfig;
import com.kwai.player.KwaiPlayerConfig$a;
import com.kwai.video.player.kwai_player.KwaiPlayerCreatorAemonImpl;
import ai7.d;
import com.kwai.video.player.kwai_player.KwaiPlayerCreator$InternalKwaiPlayer;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.AbstractMediaPlayer;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.player.IMediaPlayer$OnLogEventListener;
import com.kwai.video.player.IMediaPlayer$OnFftDataCaptureListener;
import com.kwai.video.player.IMediaPlayer$OnInfoExtraListener;
import com.kwai.video.player.IMediaPlayer$OnRenderingStartListener;
import com.kwai.video.player.IMediaPlayer$OnDecodeFirstFrameListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import ci7.c;
import java.util.Objects;
import ci7.b;
import com.kwai.player.qos.AppLiveAdaptiveRealtimeInfo;
import com.kwai.player.debuginfo.model.AppLiveQosDebugInfo;
import com.kwai.player.debuginfo.model.KwaiPlayerDebugInfo;
import java.lang.Long;
import com.kwai.video.player.MediaInfo;
import android.os.Bundle;
import com.kwai.video.player.IMediaPlayer$OnLiveVoiceCommentListener;
import java.lang.Float;
import ci7.e;
import ci7.d;
import android.graphics.Bitmap;
import com.kwai.player.qos.KwaiQosInfo;
import android.view.Surface;
import com.kwai.video.player.misc.ITrackInfo;
import com.kwai.video.player.misc.KsTrackInfo;
import android.os.Message;
import android.content.Context;
import android.net.Uri;
import java.util.Map;
import com.kwai.video.player.misc.IMediaDataSource;
import java.io.FileDescriptor;
import android.view.SurfaceHolder;
import com.kwai.video.player.KsMediaPlayer$OnAudioProcessPCMListener;
import com.kwai.video.player.KsMediaPlayer$OnControlMessageListener;
import com.kwai.video.player.KsMediaPlayerAemonImpl$16;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$OnControlMessageListener;
import com.kwai.video.player.IMediaPlayer$OnLiveEventListener;
import com.kwai.video.player.AbstractNativeMediaPlayer$OnMediaCodecSelectListener;
import com.kwai.video.player.AbstractNativeMediaPlayer;
import com.kwai.video.player.KsMediaPlayer$OnNativeInvokeListener;
import com.kwai.video.player.IMediaPlayer$OnLiveAdaptiveQosStatListener;
import com.kwai.video.player.IMediaPlayer$OnQosStatListener;
import com.kwai.video.player.KsMediaPlayer$OnVideoTextureListener;
import android.graphics.SurfaceTexture;
import com.kwai.video.player.IMediaPlayer$OnVideoRawDataListener;
import com.kwai.video.cache.PlayerPreferrenceUtil;

public class KsMediaPlayerAemonImpl extends KsMediaPlayer	// class@000aeb
{
    public final AemonMediaPlayerAdapter mAemonPlayer;
    public KwaiPlayerConfig mConfig;
    public boolean mEnableCache;
    public boolean mEnableQosStat;
    public boolean mIsVodAdaptive;
    public KsMediaPlayer$OnAudioProcessPCMListener mOnAudioProcessPCMListener;
    public KsMediaPlayer$OnAudioProcessPCMListener mOnAudioProcessPCMListenerOutside;
    public IMediaPlayer$OnBufferingUpdateListener mOnBufferingUpdateListener;
    public IMediaPlayer$OnCompletionListener mOnCompletionListener;
    public IMediaPlayer$OnDecodeFirstFrameListener mOnDecodeFirstFrameListener;
    public IMediaPlayer$OnErrorListener mOnErrorListener;
    public IMediaPlayer$OnFftDataCaptureListener mOnFftDataCaptureListener;
    public IMediaPlayer$OnInfoExtraListener mOnInfoExtraListener;
    public IMediaPlayer$OnInfoListener mOnInfoListener;
    public IMediaPlayer$OnLiveEventListener mOnLiveEventListener;
    public IMediaPlayer$OnLiveEventListener mOnLiveEventListenerOutside;
    public IMediaPlayer$OnLogEventListener mOnLogEventListener;
    public IMediaPlayer$OnPreparedListener mOnPreparedListener;
    public IMediaPlayer$OnRenderingStartListener mOnRenderingStartListener;
    public IMediaPlayer$OnSeekCompleteListener mOnSeekCompleteListener;
    public IMediaPlayer$OnVideoRawDataListener mOnVideoRawDataListener;
    public IMediaPlayer$OnVideoRawDataListener mOnVideoRawDataListenerOutside;
    public IMediaPlayer$OnVideoSizeChangedListener mOnVideoSizeChangedListener;

    public void KsMediaPlayerAemonImpl(KsMediaPlayer$Builder p0,KsPlayerCore p1,PlayerLibraryLoader$FindBestParam p2){
       super(p0);
       this.mOnPreparedListener = new KsMediaPlayerAemonImpl$1(this);
       this.mOnCompletionListener = new KsMediaPlayerAemonImpl$2(this);
       this.mOnBufferingUpdateListener = new KsMediaPlayerAemonImpl$3(this);
       this.mOnSeekCompleteListener = new KsMediaPlayerAemonImpl$4(this);
       this.mOnVideoSizeChangedListener = new KsMediaPlayerAemonImpl$5(this);
       this.mOnErrorListener = new KsMediaPlayerAemonImpl$6(this);
       this.mOnInfoListener = new KsMediaPlayerAemonImpl$7(this);
       this.mOnLogEventListener = new KsMediaPlayerAemonImpl$8(this);
       this.mOnFftDataCaptureListener = new KsMediaPlayerAemonImpl$9(this);
       this.mOnInfoExtraListener = new KsMediaPlayerAemonImpl$10(this);
       this.mOnRenderingStartListener = new KsMediaPlayerAemonImpl$11(this);
       this.mOnDecodeFirstFrameListener = new KsMediaPlayerAemonImpl$12(this);
       this.mOnVideoRawDataListener = new KsMediaPlayerAemonImpl$13(this);
       this.mOnAudioProcessPCMListener = new KsMediaPlayerAemonImpl$14(this);
       this.mOnLiveEventListener = new KsMediaPlayerAemonImpl$15(this);
       this.mConfig = new KwaiPlayerConfig(new KwaiPlayerConfig$a());
       this.initPlayer();
       AemonMediaPlayerAdapter iKwaiMediaPl = new KwaiPlayerCreatorAemonImpl(p1, p2.mProvider, p2.mIsLive).create().getIKwaiMediaPlayer();
       this.mAemonPlayer = iKwaiMediaPl;
       iKwaiMediaPl.setOnPreparedListener(this.mOnPreparedListener);
       iKwaiMediaPl.setOnCompletionListener(this.mOnCompletionListener);
       iKwaiMediaPl.setOnBufferingUpdateListener(this.mOnBufferingUpdateListener);
       iKwaiMediaPl.setOnSeekCompleteListener(this.mOnSeekCompleteListener);
       iKwaiMediaPl.setOnVideoSizeChangedListener(this.mOnVideoSizeChangedListener);
       iKwaiMediaPl.setOnErrorListener(this.mOnErrorListener);
       iKwaiMediaPl.setOnInfoListener(this.mOnInfoListener);
       iKwaiMediaPl.setOnLogEventListener(this.mOnLogEventListener);
       iKwaiMediaPl.setOnFftDataCaptureListener(this.mOnFftDataCaptureListener);
       iKwaiMediaPl.setOnInfoExtraListener(this.mOnInfoExtraListener);
       iKwaiMediaPl.setOnRenderingStartListener(this.mOnRenderingStartListener);
       iKwaiMediaPl.setOnDecodeFirstFrameListener(this.mOnDecodeFirstFrameListener);
       this.initWithBuilder(p0);
    }
    public void abortNativeCacheIO(){
    }
    public void addVideoRawBuffer(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "92")) {
          return;
       }
       this.mAemonPlayer.addVideoRawBuffer(p0);
       return;
    }
    public void audioOnly(boolean p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "15")) {
          return;
       }
       this.mAemonPlayer.audioOnly(p0);
       return;
    }
    public int bufferEmptyCountOld(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mAemonPlayer.bufferEmptyCountOld();
    }
    public long bufferEmptyDurationOld(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonPlayer.bufferEmptyDurationOld();
    }
    public void deselectTrack(int p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "28")) {
          return;
       }
       this.mAemonPlayer.deselectTrack(p0);
       return;
    }
    public void disableSoftVideoDecode(boolean p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "16")) {
          return;
       }
       this.mAemonPlayer.disableSoftVideoDecode(p0);
       return;
    }
    public void enableMediacodecDummy(boolean p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "97")) {
          return;
       }
       this.mAemonPlayer.enableMediacodecDummy(p0);
       return;
    }
    public void enableVideoRawDataCallback(boolean p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "91")) {
          return;
       }
       this.mAemonPlayer.enableVideoRawDataCallback(p0);
       return;
    }
    public boolean getAdaptiveQosTimerStarted(){
       boolean b;
       c c;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, KsMediaPlayerAemonImpl.class, "30");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.mAemonPlayer.getAppQosLiveAdaptiveRealtimeWrapper();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, c.class, "5");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          c = obj.c;
          b = (c != null)? c.g: false;
       }
       return b;
    }
    public AppLiveAdaptiveRealtimeInfo getAppLiveAdaptiveRealtimeInfo(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "74");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getAppLiveAdaptiveRealtimeInfo();
    }
    public AppLiveQosDebugInfo getAppLiveQosDebugInfo(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getAppLiveQosDebugInfo();
    }
    public int getAudioSessionId(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mAemonPlayer.getAudioSessionId();
    }
    public long getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonPlayer.getCurrentPosition();
    }
    public String getDataSource(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getDataSource();
    }
    public KwaiPlayerDebugInfo getDebugInfo(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getDebugInfo();
    }
    public long getDuration(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonPlayer.getDuration();
    }
    public boolean getEnableLiveAdaptiveQos(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mAemonPlayer.getAppQosLiveAdaptiveRealtimeWrapper().b;
    }
    public String getKwaiLiveVoiceComment(long p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, ksMediaPlaye, "52");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.mAemonPlayer.getKwaiLiveVoiceComment(p0);
    }
    public String getKwaiSign(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "80");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getKwaiSign();
    }
    public String getKwaivppFilters(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "100");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getKwaivppFilters();
    }
    public long getLiveAdaptiveTickDuration(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonPlayer.getAppQosLiveAdaptiveRealtimeWrapper().e;
    }
    public String getLiveRealTimeQosJson(int p0,int p1,long p2,long p3,long p4){
       KsMediaPlayerAemonImpl ksMediaPlaye = this;
       KsMediaPlayerAemonImpl ksMediaPlaye1 = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Long.valueOf(p2),Long.valueOf(p3),Long.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, ksMediaPlaye1, "75");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return ksMediaPlaye.mAemonPlayer.getLiveRealTimeQosJson(p0, p1, p2, p3, p4);
    }
    public MediaInfo getMediaInfo(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getMediaInfo();
    }
    public Bundle getMediaMeta(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getMediaMeta();
    }
    public IMediaPlayer$OnLiveVoiceCommentListener getOnLiveVoiceCommentListener(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getOnLiveVoiceCommentListener();
    }
    public float getProbeFps(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mAemonPlayer.getProbeFps();
    }
    public float getPropertyFloat(int p0,float p1){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, ksMediaPlaye, "46");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this.mAemonPlayer.getPropertyFloat(p0, p1);
    }
    public long getPropertyLong(int p0,long p1){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, ksMediaPlaye, "47");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this.mAemonPlayer.getPropertyLong(p0, p1);
    }
    public String getPropertyString(int p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "48");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.mAemonPlayer.getPropertyString(p0);
    }
    public boolean getQosTimerStarted(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, KsMediaPlayerAemonImpl.class, "29");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.mAemonPlayer.getAppQosLiveRealtimeWrapper();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, e.class, "6");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          e a = obj.a;
          b = (a != null)? a.h: false;
       }
       return b;
    }
    public Bitmap getScreenShot(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "87");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getScreenShot();
    }
    public int getSelectedTrack(int p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "26");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.mAemonPlayer.getSelectedTrack(p0);
    }
    public String getStatJson(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "78");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getLiveStatJson();
    }
    public KwaiQosInfo getStreamQosInfo(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getStreamQosInfo();
    }
    public Surface getSurface(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getSurface();
    }
    public long getTickDuration(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonPlayer.getAppQosLiveRealtimeWrapper().e;
    }
    public ITrackInfo[] getTrackInfo(){
       return this.getTrackInfo();
    }
    public KsTrackInfo[] getTrackInfo(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getTrackInfo();
    }
    public int getVideoHeight(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mAemonPlayer.getVideoHeight();
    }
    public int getVideoSarDen(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mAemonPlayer.getVideoSarDen();
    }
    public int getVideoSarNum(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mAemonPlayer.getVideoSarNum();
    }
    public String getVideoStatJson(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "79");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getVodStatJson();
    }
    public int getVideoWidth(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mAemonPlayer.getVideoWidth();
    }
    public String getVodAdaptiveCacheKey(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "83");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getVodAdaptiveCacheKey();
    }
    public String getVodAdaptiveHdrType(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getVodAdaptiveHdrType();
    }
    public String getVodAdaptiveHostName(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "84");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getVodAdaptiveHostName();
    }
    public String getVodAdaptiveUrl(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "82");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getVodAdaptiveUrl();
    }
    public String getXksCache(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonPlayer.getXksCache();
    }
    public void initPlayerInternal(){
    }
    public void initProcessPCMBuffer(){
    }
    public final void initWithBuilder(KsMediaPlayer$Builder p0){
       boolean b = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, b, KsMediaPlayerAemonImpl.class, "1")) {
          return;
       }
       boolean b1 = false;
       b.mAemonPlayer.setupAspectLiveRealTimeReporter(b1, null);
       long l = 1;
       long l1 = (obj.enablePlayerCache != null)? l: 0;
       b.setOption(4, "cache-enabled", l1);
       KsMediaPlayer$Builder enablePlayer = obj.enablePlayerCache;
       b.mEnableCache = enablePlayer;
       b.mAemonPlayer.setupAspectNativeCache(enablePlayer);
       b.mAemonPlayer.setupAspectKlv(b1);
       enablePlayer = obj.awesomeCacheCallback;
       if (enablePlayer != null) {
          b.mAemonPlayer.setAwesomeCacheCallback(enablePlayer);
       }
       enablePlayer = obj.httpResponseErrorCallback;
       if (enablePlayer != null) {
          b.mAemonPlayer.setHttpResponseErrorCallback(enablePlayer);
       }
       b.mAemonPlayer.setupCacheSessionListener(obj.cacheSessionListener);
       enablePlayer = obj.preLoadDurationMs;
       if (enablePlayer > 0) {
          b.mAemonPlayer.enablePreDemux(obj.preLoadVer, enablePlayer);
       }
       KsMediaPlayer$Builder abLoopEndMs = obj.abLoopEndMs;
       if (abLoopEndMs > 0) {
          b.mAemonPlayer.setAbLoop(obj.abLoopStartMs, abLoopEndMs, obj.abLoopCount, obj.mDisableSeekAtStart);
       }
       enablePlayer = obj.seekAtStart;
       if (enablePlayer > 0) {
          b.setOption(4, "seek-at-start", enablePlayer);
       }
       enablePlayer = obj.fadeinEndTimeMs;
       if (enablePlayer > null) {
          b.setOption(4, "fade-in-end-time-ms", (long)enablePlayer);
       }
       if (obj.vodManifestEnable != null) {
          b.setOption(4, "enable-vod-manifest", l);
          b.setOption(1, "device-resolution-width", obj.vodManifestWidth);
          b.setOption(1, "device-resolution-height", obj.vodManifestHeight);
          b.setOption(1, "device-network-type", (long)obj.vodManifestNetType);
          b.setOption(1, "abr-config-string", obj.vodManifestRateConfig);
          b.setOption(1, "low-device", (long)obj.vodManifestLowDevice);
          b.setOption(1, "signal-strength", (long)obj.vodManifestSignalStrength);
          b.setOption(1, "clarity-score", (long)obj.vodManifestClarityScore);
          b.setOption(1, "switch-code", (long)obj.vodManifestSwitchCode);
          b.setOption(1, "adaptive-max-resolution", (long)obj.mVodManifestMaxResolution);
          b.setOption(1, "manifest_type", (long)obj.mManifestType);
          b.setOption(1, "enable-aegon-net-speed", (long)obj.mEnableAegonNetSpeed);
          enablePlayer = obj.mSf21WarmupPercent;
          if (enablePlayer > null && enablePlayer <= 100) {
             b.setOption(1, "sf21-warmup-percent", (long)enablePlayer);
          }
          b.mIsVodAdaptive = obj.vodManifestEnable;
       }
       return;
    }
    public boolean isCacheEnabled(){
       return this.mEnableCache;
    }
    public boolean isLiveManifest(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mAemonPlayer.isLiveManifest();
    }
    public boolean isLooping(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mAemonPlayer.isLooping();
    }
    public boolean isMediaPlayerValid(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mAemonPlayer.isMediaPlayerValid();
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayerAemonImpl.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mAemonPlayer.isPlaying();
    }
    public boolean onNativeInvokeInternal(int p0,Bundle p1){
       return false;
    }
    public void onReceivePostEvent(Message p0){
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerAemonImpl.class, "21")) {
          return;
       }
       this.mAemonPlayer.pause();
       return;
    }
    public void prepareAsync(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerAemonImpl.class, "14")) {
          return;
       }
       this.mAemonPlayer.setupAspectLiveRealTimeReporter(this.mEnableQosStat, this.mConfig);
       this.mAemonPlayer.prepareAsync();
       return;
    }
    public void reload(String p0,boolean p1){
    }
    public void resetInternal(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerAemonImpl.class, "41")) {
          return;
       }
       this.mAemonPlayer.reset();
       return;
    }
    public void resetListenersInternal(){
    }
    public void seekTo(long p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ksMediaPlaye, "36")) {
          return;
       }
       this.mAemonPlayer.seekTo(p0);
       return;
    }
    public void selectTrack(int p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "27")) {
          return;
       }
       this.mAemonPlayer.selectTrack(p0);
       return;
    }
    public void setCodecFlag(int p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "70")) {
          return;
       }
       this.mAemonPlayer.setCodecFlag(p0);
       return;
    }
    public void setConfig(KwaiPlayerConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "69")) {
          return;
       }
       this.mEnableQosStat = p0.f();
       this.mConfig = p0;
       this.mAemonPlayer.setConfig(p0);
       return;
    }
    public void setConfigJson(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "95")) {
          return;
       }
       this.mAemonPlayer.setConfigJson(p0);
       return;
    }
    public void setDataReadTimeout(int p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "64")) {
          return;
       }
       this.mAemonPlayer.setReadTimeout(p0);
       return;
    }
    public void setDataSource(Context p0,Uri p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KsMediaPlayerAemonImpl.class, "8")) {
          return;
       }
       this.mAemonPlayer.setDataSource(p0, p1, p2);
       return;
    }
    public void setDataSource(IMediaDataSource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "12")) {
          return;
       }
       this.mAemonPlayer.setDataSource(p0);
       return;
    }
    public void setDataSource(FileDescriptor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "11")) {
          return;
       }
       this.mAemonPlayer.setDataSource(p0);
       return;
    }
    public void setDataSource(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "9")) {
          return;
       }
       this.mAemonPlayer.setDataSource(p0);
       return;
    }
    public void setDataSource(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsMediaPlayerAemonImpl.class, "10")) {
          return;
       }
       this.mAemonPlayer.setDataSource(p0, p1);
       return;
    }
    public void setDisplay(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "2")) {
          return;
       }
       this.mAemonPlayer.setDisplay(p0);
       return;
    }
    public void setEnableQosStat(boolean p0){
       this.mEnableQosStat = p0;
    }
    public void setHevcCodecName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "6")) {
          return;
       }
       this.mAemonPlayer.setHevcCodecName(p0);
       return;
    }
    public void setIsLive(boolean p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "76")) {
          return;
       }
       this.mAemonPlayer.setIsLive(p0);
       return;
    }
    public void setKwaivppExtJson(int p0,String p1){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ksMediaPlaye, "99")) {
          return;
       }
       this.mAemonPlayer.setKwaivppExtJson(p0, p1);
       return;
    }
    public void setKwaivppFilters(int p0,String p1){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ksMediaPlaye, "98")) {
          return;
       }
       this.mAemonPlayer.setKwaivppFilters(p0, p1);
       return;
    }
    public void setKwaivppKswitchJson(int p0,String p1){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ksMediaPlaye, "101")) {
          return;
       }
       this.mAemonPlayer.setKwaivppKswitchJson(p0, p1);
       return;
    }
    public void setLiveManifestSwitchMode(int p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "7")) {
          return;
       }
       this.mAemonPlayer.setLiveManifestSwitchMode(p0);
       return;
    }
    public void setLooping(boolean p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "42")) {
          return;
       }
       this.mAemonPlayer.setLooping(p0);
       return;
    }
    public void setNetWorkConnectionTimeout(int p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "65")) {
          return;
       }
       this.mAemonPlayer.setConnectionTimeout(p0);
       return;
    }
    public void setOnAudioProcessPCMAvailableListener(KsMediaPlayer$OnAudioProcessPCMListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "104")) {
          return;
       }
       this.mOnAudioProcessPCMListenerOutside = p0;
       KsMediaPlayerAemonImpl tmAemonPlaye = this.mAemonPlayer;
       KsMediaPlayerAemonImpl tmOnAudioPro = (p0 != null)? this.mOnAudioProcessPCMListener: null;
       tmAemonPlaye.setOnAudioProcessPCMAvailableListener(tmOnAudioPro);
       return;
    }
    public void setOnControlMessageListener(KsMediaPlayer$OnControlMessageListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "90")) {
          return;
       }
       this.mAemonPlayer.setOnControlMessageListener(new KsMediaPlayerAemonImpl$16(this, p0));
       return;
    }
    public void setOnLiveEventListener(IMediaPlayer$OnLiveEventListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "103")) {
          return;
       }
       this.mOnLiveEventListenerOutside = p0;
       KsMediaPlayerAemonImpl tmAemonPlaye = this.mAemonPlayer;
       KsMediaPlayerAemonImpl tmOnLiveEven = (p0 != null)? this.mOnLiveEventListener: null;
       tmAemonPlaye.setOnLiveEventListener(tmOnLiveEven);
       return;
    }
    public void setOnLiveVoiceCommentListener(IMediaPlayer$OnLiveVoiceCommentListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "59")) {
          return;
       }
       this.mAemonPlayer.setOnLiveVoiceCommentListener(p0);
       return;
    }
    public void setOnMediaCodecSelectListener(AbstractNativeMediaPlayer$OnMediaCodecSelectListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "106")) {
          return;
       }
       super.setOnMediaCodecSelectListener(p0);
       return;
    }
    public void setOnNativeInvokeListener(KsMediaPlayer$OnNativeInvokeListener p0){
    }
    public void setOnPeriodicalLiveAdaptiveQosStatListener(IMediaPlayer$OnLiveAdaptiveQosStatListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "58")) {
          return;
       }
       this.mAemonPlayer.setLiveOnPeriodicalLiveAdaptiveQosStatListener(p0);
       return;
    }
    public void setOnPeriodicalQosStatListener(IMediaPlayer$OnQosStatListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "57")) {
          return;
       }
       this.mAemonPlayer.setLiveOnQosStatListener(p0);
       return;
    }
    public void setOnVideoTextureListener(KsMediaPlayer$OnVideoTextureListener p0){
    }
    public void setOption(int p0,String p1,long p2){
       if (PatchProxy.isSupport(KsMediaPlayerAemonImpl.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Long.valueOf(p2), this, KsMediaPlayerAemonImpl.class, "62")) {
          return;
       }
       this.mAemonPlayer.setOption(p0, p1, p2);
       return;
    }
    public void setOption(int p0,String p1,String p2){
       if (PatchProxy.isSupport(KsMediaPlayerAemonImpl.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KsMediaPlayerAemonImpl.class, "61")) {
          return;
       }
       this.mAemonPlayer.setOption(p0, p1, p2);
       return;
    }
    public void setPlayerMute(int p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "89")) {
          return;
       }
       ksMediaPlaye = this.mAemonPlayer;
       boolean b = (p0)? true: false;
       ksMediaPlaye.setPlayerMute(b);
       return;
    }
    public void setPropertyFloat(int p0,float p1){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, ksMediaPlaye, "49")) {
          return;
       }
       this.mAemonPlayer.setPropertyFloat(p0, p1);
       return;
    }
    public void setQosTickDuration(int p0){
    }
    public boolean setRotateDegree(int p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "88");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.mAemonPlayer.setRotateDegree(p0);
    }
    public void setScreenOnWhilePlaying(boolean p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "24")) {
          return;
       }
       this.mAemonPlayer.setScreenOnWhilePlaying(p0);
       return;
    }
    public void setSpeed(float p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ksMediaPlaye, "44")) {
          return;
       }
       this.mAemonPlayer.setSpeed(p0);
       return;
    }
    public void setStartPlayBlockBufferMs(int p0,int p1){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ksMediaPlaye, "96")) {
          return;
       }
       this.mAemonPlayer.setStartPlayBlockBufferMs(p0, p1);
       return;
    }
    public void setSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "3")) {
          return;
       }
       this.mAemonPlayer.setSurface(p0);
       return;
    }
    public void setSurfaceTexture(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "5")) {
          return;
       }
       this.mAemonPlayer.setSurfaceTexture(p0);
       return;
    }
    public void setTone(int p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "45")) {
          return;
       }
       this.mAemonPlayer.setTone(p0);
       return;
    }
    public void setVideoRawDataListener(IMediaPlayer$OnVideoRawDataListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl.class, "105")) {
          return;
       }
       this.mOnVideoRawDataListenerOutside = p0;
       KsMediaPlayerAemonImpl tmAemonPlaye = this.mAemonPlayer;
       KsMediaPlayerAemonImpl tmOnVideoRaw = (p0 != null)? this.mOnVideoRawDataListener: null;
       tmAemonPlaye.setVideoRawDataListener(tmOnVideoRaw);
       return;
    }
    public void setVideoScalingMode(int p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "86")) {
          return;
       }
       this.mAemonPlayer.setVideoScalingMode(p0);
       return;
    }
    public void setVolume(float p0,float p1){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, ksMediaPlaye, "54")) {
          return;
       }
       this.mAemonPlayer.setVolume(p0, p1);
       return;
    }
    public void setWakeMode(Context p0,int p1){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ksMediaPlaye, "23")) {
          return;
       }
       this.mAemonPlayer.setWakeMode(p0, p1);
       return;
    }
    public void setupGpuContext(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerAemonImpl.class, "102")) {
          return;
       }
       this.mAemonPlayer.setupGpuContext();
       return;
    }
    public void shutdownWaitStop(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerAemonImpl.class, "20")) {
          return;
       }
       this.mAemonPlayer.shutdownWaitStop();
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerAemonImpl.class, "17")) {
          return;
       }
       this.mAemonPlayer.start();
       return;
    }
    public void step_frame(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerAemonImpl.class, "22")) {
          return;
       }
       this.mAemonPlayer.stepFrame();
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerAemonImpl.class, "19")) {
          return;
       }
       this.mAemonPlayer.stop();
       return;
    }
    public void stopStatTimer(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerAemonImpl.class, "18")) {
          return;
       }
       this.mAemonPlayer.stopLiveStatTimerImmediately();
       return;
    }
    public void unInitPlayerInternal(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerAemonImpl.class, "40")) {
          return;
       }
       if (this.mIsVodAdaptive != null) {
          PlayerPreferrenceUtil.getInstance().saveVodAdaptiveData();
       }
       this.mAemonPlayer.release();
       return;
    }
    public void updateCurrentMaxWallClockOffset(long p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ksMediaPlaye, "94")) {
          return;
       }
       this.mAemonPlayer.updateCurrentMaxWallClockOffset(p0);
       return;
    }
    public void updateCurrentWallClock(long p0){
       KsMediaPlayerAemonImpl ksMediaPlaye = KsMediaPlayerAemonImpl.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ksMediaPlaye, "93")) {
          return;
       }
       this.mAemonPlayer.updateCurrentWallClock(p0);
       return;
    }
}
