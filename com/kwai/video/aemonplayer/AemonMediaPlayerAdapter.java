package com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.player.kwai_player.IBuildKwaiPlayer;
import com.kwai.video.player.AbstractMediaPlayer;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$StaticMethod;
import com.kwai.video.player.KsPlayerCore;
import com.kwai.video.player.surface.KwaiSurfaceManager;
import com.kwai.player.debuginfo.model.KwaiPlayerDebugInfo;
import android.os.Handler;
import android.os.Looper;
import com.kwai.video.aemonplayer.AemonMediaPlayer;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$1;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnPreparedListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$2;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnCompletionListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$3;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnBufferingUpdateListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$4;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnSeekCompleteListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$5;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnErrorListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$6;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnInfoListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$7;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnInfoExtraListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$8;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnRenderingStartListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$9;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnLogEventListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$10;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnFftDataCaptureListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$11;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnBizInfoListener;
import java.lang.Object;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.player.pragma.DebugLog;
import java.lang.ref.WeakReference;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$OnNativeInvokeListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$OnControlMessageListener;
import java.lang.RuntimeException;
import java.io.IOException;
import java.lang.Throwable;
import java.security.InvalidParameterException;
import java.lang.IllegalStateException;
import ai7.b;
import java.lang.Number;
import com.kwai.video.aemonplayer.JavaAttrList;
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
import ci7.c;
import ci7.e;
import com.kwai.video.player.kwai_player.AspectAwesomeCache;
import java.util.Objects;
import com.kwai.video.player.kwai_player.AspectKFlv;
import com.kwai.video.player.kwai_player.AspectKwaiVodAdaptive;
import com.kwai.player.KwaiRepresentation;
import com.kwai.player.debuginfo.model.PlayerConfigDebugInfo;
import com.kwai.player.debuginfo.model.AppLiveQosDebugInfoNew;
import com.kwai.player.debuginfo.model.AppVodQosDebugInfoNew;
import com.kwai.video.player.MediaInfo;
import com.kwai.video.player.KsMediaMeta;
import java.io.FileDescriptor;
import android.os.ParcelFileDescriptor;
import com.kwai.video.player.IMediaPlayer$OnLiveVoiceCommentListener;
import fi7.u;
import com.kwai.video.player.kwai_player.ProductContext;
import java.lang.Float;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import com.kwai.player.qos.KwaiQosInfo;
import android.view.Surface;
import com.kwai.video.player.misc.ITrackInfo;
import com.kwai.video.player.misc.KsTrackInfo;
import java.util.ArrayList;
import com.kwai.video.player.KsMediaMeta$KSYStreamMeta;
import android.view.MotionEvent;
import java.nio.ByteBuffer;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.video.player.IMediaPlayer$OnABLoopEndOfCounterListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$15;
import java.lang.Runnable;
import java.util.List;
import com.kwai.video.player.IKwaiRepresentationListener;
import com.kwai.video.player.IKwaiSubtitleListener;
import com.kwai.video.cache.PlayerPreferrenceUtil;
import ai7.e;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$13;
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
import com.kwai.video.player.misc.IMediaDataSource;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$12;
import com.kwai.video.aemonplayer.IMediaDataSource;
import android.view.SurfaceHolder;
import android.graphics.SurfaceTexture;
import com.kwai.video.player.IKwaiBulletScreenListener;
import com.kwai.video.player.IKwaiInjectHttpCallback;
import java.lang.IllegalArgumentException;
import com.kwai.video.player.IKwaiVodDrmCallback;
import com.kwai.video.player.IMediaPlayer$OnLiveAdaptiveQosStatListener;
import com.kwai.video.player.IMediaPlayer$OnQosStatListener;
import com.kwai.video.player.KsMediaPlayer$OnAudioProcessPCMListener;
import com.kwai.video.player.IMediaPlayer$OnLiveEventListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveExtraInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSrvTsptInfoListener;
import com.kwai.video.player.OnQosEventInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnVideoRenderListener;
import fi7.u$a;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$14;
import com.kwai.video.player.kwai_player.KwaiMediaPlayer$IHeadTrackerListener;
import com.kwai.video.player.IMediaPlayer$OnVideoRawDataListener;
import android.os.PowerManager$WakeLock;
import android.os.PowerManager;
import com.kwai.video.player.kwai_player.KwaiAspectKFlv;
import ci7.a;
import com.kwai.video.player.kwai_player.KwaiPlayerAspectAwesomeCache;
import com.kwai.video.aemonplayer.surface.KwaiGpuContextFactory;

public final class AemonMediaPlayerAdapter extends AbstractMediaPlayer implements IKwaiMediaPlayer, IBuildKwaiPlayer	// class@0019ae
{
    public final AemonMediaPlayer mAemonMediaPlayer;
    public c mAppQosLiveAdaptiveRealtimeWrapper;
    public e mAppQosLiveRealtimeWrapper;
    public AspectAwesomeCache mAspectAwesomeCache;
    public AspectKFlv mAspectKFlv;
    public int mBufferingCount;
    public Context mContext;
    public String mDataSource;
    public final KwaiSurfaceManager mExtSurfaceManager;
    public KwaiGpuContext mGpuContext;
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
    public final Handler mMainThreadHandler;
    public IMediaPlayer$OnABLoopEndOfCounterListener mOnABLoopEndOfCounterListener;
    public KsMediaPlayer$OnAudioProcessPCMListener mOnAudioProcessPCMListener;
    public AemonMediaPlayerAdapter$OnControlMessageListener mOnControlMessageListener;
    public IMediaPlayer$OnLiveEventListener mOnLiveEventListener;
    public IKwaiMediaPlayer$OnLiveExtraInfoListener mOnLiveExtraInfoListener;
    public IKwaiMediaPlayer$OnLiveInterActiveListener mOnLiveInterActiveListener;
    public IKwaiMediaPlayer$OnLiveSeiInfoListener mOnLiveSeiInfoListener;
    public IMediaPlayer$OnLiveVoiceCommentListener mOnLiveVoiceCommentListener;
    public AemonMediaPlayerAdapter$OnNativeInvokeListener mOnNativeInvokeListener;
    public IMediaPlayer$OnQosStatListener mOnQosStatListener;
    public IMediaPlayer$OnVideoRawDataListener mOnVideoRawDataListener;
    public final KsPlayerCore mPlayerCore;
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
    public byte[] mVideoRawBuffer;
    public int mVideoSarDen;
    public int mVideoSarNum;
    public int mVideoWidth;
    public AspectKwaiVodAdaptive mVodAdaptive;
    public PowerManager$WakeLock mWakeLock;
    public IKwaiMediaPlayer$OnLiveSrvTsptInfoListener onLiveSrvTsptInfoListener;
    public static final int INPUT_DATA_TYPE_HLS_CUSTOME_MANIFEST = 3;
    public static final int INPUT_DATA_TYPE_INDEX_CONTENT = 2;
    public static final int INPUT_DATA_TYPE_SINGLE_URL = 0;
    public static final int INPUT_DATA_TYPE_VOD_MANIFEST = 1;
    public static final int MEDIA_BUFFERSIZE_DEFAULT = 20;
    public static final String TAG = "com.kwai.video.aemonplayer.AemonMediaPlayerAdapter";
    public static final AemonMediaPlayerAdapter$StaticMethod sStaticMethodAemon;
    public static final AemonMediaPlayerAdapter$StaticMethod sStaticMethodAemonHotfix;

    static {
       AemonMediaPlayerAdapter.sStaticMethodAemon = new AemonMediaPlayerAdapter$StaticMethod(AemonMediaPlayerAdapter.toJniInstallMode(KsPlayerCore.PLAYER_CORE_AEMON));
       AemonMediaPlayerAdapter.sStaticMethodAemonHotfix = new AemonMediaPlayerAdapter$StaticMethod(AemonMediaPlayerAdapter.toJniInstallMode(KsPlayerCore.PLAYER_CORE_AEMON_HOTFIX));
    }
    public void AemonMediaPlayerAdapter(KsPlayerCore p0){
       super();
       this.mWakeLock = null;
       this.mInteractivemode = 0;
       this.mStereoType = 0;
       this.mSurfaceManager = new KwaiSurfaceManager();
       this.mExtSurfaceManager = new KwaiSurfaceManager();
       this.mVideoRawBuffer = null;
       this.mProcessPCMBuffer = null;
       this.mKwaiPlayerDebugInfo = new KwaiPlayerDebugInfo();
       this.mProductContext = null;
       this.mOnVideoRawDataListener = null;
       this.mOnLiveEventListener = null;
       this.mOnAudioProcessPCMListener = null;
       this.mPlayerCore = p0;
       this.mMainThreadHandler = new Handler(Looper.getMainLooper());
       AemonMediaPlayer uAemonMediaP = new AemonMediaPlayer(AemonMediaPlayerAdapter.toJniInstallMode(p0));
       this.mAemonMediaPlayer = uAemonMediaP;
       uAemonMediaP.setOnPreparedListener(new AemonMediaPlayerAdapter$1(this));
       uAemonMediaP.setOnCompletionListener(new AemonMediaPlayerAdapter$2(this));
       uAemonMediaP.setOnBufferingUpdateListener(new AemonMediaPlayerAdapter$3(this));
       uAemonMediaP.setOnSeekCompleteListener(new AemonMediaPlayerAdapter$4(this));
       uAemonMediaP.setOnErrorListener(new AemonMediaPlayerAdapter$5(this));
       uAemonMediaP.setOnInfoListener(new AemonMediaPlayerAdapter$6(this));
       uAemonMediaP.setOnInfoExtraListener(new AemonMediaPlayerAdapter$7(this));
       uAemonMediaP.setOnRenderingStartListener(new AemonMediaPlayerAdapter$8(this));
       uAemonMediaP.setOnLogEventListener(new AemonMediaPlayerAdapter$9(this));
       uAemonMediaP.setOnFftDataCaptureListener(new AemonMediaPlayerAdapter$10(this));
       uAemonMediaP.setOnBizInfoListener(new AemonMediaPlayerAdapter$11(this));
       this.resetSomething();
    }
    public static AemonMediaPlayerAdapter$StaticMethod getStaticMethod(KsPlayerCore p0){
       AemonMediaPlayerAdapter$StaticMethod sStaticMetho = (p0 == KsPlayerCore.PLAYER_CORE_AEMON_HOTFIX)? AemonMediaPlayerAdapter.sStaticMethodAemonHotfix: AemonMediaPlayerAdapter.sStaticMethodAemon;
       return sStaticMetho;
    }
    public static boolean onNativeInvoke(Object p0,int p1,Bundle p2){
       AemonMediaPlayerAdapter obj;
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, AemonMediaPlayerAdapter.class, "69");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(p1)};
       DebugLog.ifmt(AemonMediaPlayerAdapter.TAG, "onNativeInvoke %d", objArray);
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
    public static int toJniInstallMode(KsPlayerCore p0){
       int i = (p0 == KsPlayerCore.PLAYER_CORE_AEMON_HOTFIX)? 1: 0;
       return i;
    }
    public int addBulletScreen(b p0){
       return 0;
    }
    public int addBulletScreenWithParam(int p0,int p1,int p2,String p3){
       return 0;
    }
    public int addSubtitle(String p0,boolean p1){
       JavaAttrList obj;
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uAemonMediaP, "188");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.mAemonMediaPlayer.newJavaAttrList();
       obj.SetStringValue("url", p0);
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.bizInvoke(0xc380, obj);
       obj.Destroy();
       javaAttrList.Destroy();
       return javaAttrList.GetIntValue("ret");
    }
    public void addVideoRawBuffer(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "111")) {
          return;
       }
       this.mVideoRawBuffer = p0;
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetByteBufferValue("video-buffer", p0);
       this.mAemonMediaPlayer.bizInvoke(0xc374, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void audioOnly(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "146")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyBoolean(0x9c57, p0);
       return;
    }
    public int bufferEmptyCount(){
       return (int)this.mAemonMediaPlayer.getPropertyLong(0x7535, 0);
    }
    public int bufferEmptyCountOld(){
       return this.mBufferingCount;
    }
    public long bufferEmptyDuration(){
       return this.mAemonMediaPlayer.getPropertyLong(0x7534, 0);
    }
    public long bufferEmptyDurationOld(){
       return (long)this.mTotalBufferingTime;
    }
    public boolean checkCanStartPlay(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "101");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (this.mAemonMediaPlayer.getPropertyInt(0x9c47, i) > 0) {
          i = true;
       }
       return i;
    }
    public final void configHeaders(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "88")) {
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
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "89")) {
          return;
       }
       Object[] objArray = new Object[]{KsMediaPlayerInitConfig.packageName,KsMediaPlayerInitConfig.packageVersion,Integer.valueOf(this.mAemonMediaPlayer.getJniInstallMode())};
       String str = String.format("a/%s/%s/%s", objArray);
       this.setOption(1, "user-agent", str);
       Object[] objArray1 = new Object[]{str};
       Timber.d("user-agent:%s", objArray1);
       return;
    }
    public void deselectTrack(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "39")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetIntValue("track", p0);
       javaAttrList.SetIntValue("bool", 1);
       this.mAemonMediaPlayer.bizInvoke(0xc363, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void disableSoftVideoDecode(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "147")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyBoolean(0x9c58, p0);
       return;
    }
    public void enableAudioMono(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "190")) {
          return;
       }
       this.setOption(4, "audio-mono-type", (long)p0);
       return;
    }
    public void enableLoopOnBlock(int p0,int p1,long p2){
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), this, AemonMediaPlayerAdapter.class, "117")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetIntValue("bufferStartPercent", p0);
       javaAttrList.SetIntValue("bufferEndPercent", p1);
       javaAttrList.SetLongValue("loopBegin", p2);
       this.mAemonMediaPlayer.bizInvoke(0xc377, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void enableMediacodecDummy(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "207")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyBoolean(0x9c5e, p0);
       return;
    }
    public void enableMultiSurface(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "82")) {
          return;
       }
       this.mIsMultiSurface = true;
       AemonMediaPlayerAdapter tmSurfaceTex = this.mSurfaceTextureRender;
       if (tmSurfaceTex != null) {
          tmSurfaceTex.f();
       }
       j oj = j.a();
       this.mSurfaceTextureRender = oj;
       oj.e(this.getSharedContext());
       return;
    }
    public void enablePipenodeV2(boolean p0){
    }
    public void enablePreDemux(int p0,long p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, uAemonMediaP, "126")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetIntValue("ver", p0);
       javaAttrList.SetLongValue("preDemuxDurationMs", p1);
       this.mAemonMediaPlayer.bizInvoke(0xc378, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void enableVideoRawDataCallback(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "110")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyBoolean(0x9c4d, p0);
       return;
    }
    public boolean getAPJoySoundSwitchStatus(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "214");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (this.mAemonMediaPlayer.getPropertyInt(0x9c60, i) > 0) {
          i = true;
       }
       return i;
    }
    public AppLiveAdaptiveRealtimeInfo getAppLiveAdaptiveRealtimeInfo(){
       JavaAttrList obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "153");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAemonMediaPlayer.newJavaAttrList();
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.bizInvoke(0xc35e, obj);
       obj.Destroy();
       javaAttrList.Destroy();
       return AppLiveAdaptiveRealtimeInfo.from(javaAttrList.GetObjectValue("bundle"));
    }
    public AppLiveQosDebugInfo getAppLiveQosDebugInfo(){
       JavaAttrList obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "158");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAemonMediaPlayer.newJavaAttrList();
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.bizInvoke(0xc362, obj);
       obj.Destroy();
       javaAttrList.Destroy();
       return AppLiveQosDebugInfo.from(javaAttrList.GetObjectValue("bundle"));
    }
    public c getAppQosLiveAdaptiveRealtimeWrapper(){
       return this.mAppQosLiveAdaptiveRealtimeWrapper;
    }
    public e getAppQosLiveRealtimeWrapper(){
       return this.mAppQosLiveRealtimeWrapper;
    }
    public AspectAwesomeCache getAspectAwesomeCache(){
       AemonMediaPlayerAdapter obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "83");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAspectAwesomeCache;
       Objects.requireNonNull(obj, "AspectAwesomeCache is not setup");
       return obj;
    }
    public AspectKFlv getAspectKFlv(){
       AemonMediaPlayerAdapter obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "143");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAspectKFlv;
       Objects.requireNonNull(obj, "AspectKFlv is not setup");
       return obj;
    }
    public AspectKwaiVodAdaptive getAspectVodAdaptive(){
       AemonMediaPlayerAdapter obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "145");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mVodAdaptive;
       Objects.requireNonNull(obj, "AspectKwaiVodAdaptive is not setup");
       return obj;
    }
    public long getAudioCachedBytes(){
       return this.mAemonMediaPlayer.getPropertyLong(0x4e28, 0);
    }
    public long getAudioCachedDuration(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x4e26, 0);
    }
    public long getAudioCachedPackets(){
       return this.mAemonMediaPlayer.getPropertyLong(0x4e2a, 0);
    }
    public float getAudioRawLatencySeconds(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "172");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mAemonMediaPlayer.getPropertyFloat(0x7547, 0);
    }
    public int getAudioSessionId(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mAemonMediaPlayer.getPropertyInt(0x9c40, -1);
    }
    public float getAverageDisplayFps(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "171");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mAemonMediaPlayer.getPropertyFloat(0x7544, 0);
    }
    public long getBitrate(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "173");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x4e84, 0);
    }
    public String getBriefVodStatJson(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "119");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonMediaPlayer.getPropertyString(0x9c50);
    }
    public float getBufferTimeMax(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "178");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mAemonMediaPlayer.getPropertyFloat(0x753d, 0);
    }
    public long getCpuUsage(){
       return this.mAemonMediaPlayer.getPropertyLong(0x7532, 0);
    }
    public long getCurAbsTime(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "177");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x753a, 0);
    }
    public int getCurPlayingId(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)this.mAemonMediaPlayer.getPropertyLong(0x759b, 0);
    }
    public String getCurPlayingUrl(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonMediaPlayer.getPropertyString(0x7599);
    }
    public int getCurrentAudioRepresentationId(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mAemonMediaPlayer.getPropertyInt(0x9c63, 0);
    }
    public long getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getCurrentPosition();
    }
    public KwaiRepresentation getCurrentRepresentation(){
       JavaAttrList obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAemonMediaPlayer.newJavaAttrList();
       KwaiRepresentation kwaiRepresen = new KwaiRepresentation();
       obj.SetObjectValue("kwai_representation", kwaiRepresen);
       this.mAemonMediaPlayer.bizInvoke(0xc366, obj);
       obj.Destroy();
       return kwaiRepresen;
    }
    public int getCurrentRepresentationId(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mAemonMediaPlayer.getPropertyInt(0x9c62, 0);
    }
    public String getCurrentTranscodeType(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "206");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonMediaPlayer.getPropertyString(0x759a);
    }
    public long getCurrentVideoPosition(){
       return 0;
    }
    public String getDataSource(){
       return this.mDataSource;
    }
    public KwaiPlayerDebugInfo getDebugInfo(){
       AemonMediaPlayerAdapter tmKwaiPlayer;
       JavaAttrList obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "157");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(this.mKwaiPlayerDebugInfo.mSdkVersion)) {
          this.mKwaiPlayerDebugInfo.mSdkVersion = AemonMediaPlayerAdapter.getStaticMethod(this.mPlayerCore).getVersion();
       }
       if (this.mKwaiPlayerDebugInfo.mPlayerApplyConfig.collectFinish == null) {
          obj = this.mAemonMediaPlayer.newJavaAttrList();
          obj.SetObjectValue("PlayerApplyConfig", this.mKwaiPlayerDebugInfo.mPlayerApplyConfig);
          this.mAemonMediaPlayer.bizInvoke(0xc360, obj);
          obj.Destroy();
       }
       this.mKwaiPlayerDebugInfo.setIsLive(this.mIsLive);
       if (this.mIsLive != null) {
          tmKwaiPlayer = this.mKwaiPlayerDebugInfo;
          if (tmKwaiPlayer.mAppLiveQosDebugInfoNew == null) {
             tmKwaiPlayer.mAppLiveQosDebugInfoNew = new AppLiveQosDebugInfoNew();
          }
          obj = this.mAemonMediaPlayer.newJavaAttrList();
          obj.SetObjectValue("LiveQosDebugInfo", this.mKwaiPlayerDebugInfo.mAppLiveQosDebugInfoNew);
          this.mAemonMediaPlayer.bizInvoke(0xc361, obj);
          obj.Destroy();
          this.mKwaiPlayerDebugInfo.mAppLiveQosDebugInfoNew.setWidth(this.getVideoWidth());
          this.mKwaiPlayerDebugInfo.mAppLiveQosDebugInfoNew.setHeight(this.getVideoHeight());
       }else {
          tmKwaiPlayer = this.mKwaiPlayerDebugInfo;
          if (tmKwaiPlayer.mAppVodQosDebugInfo == null) {
             tmKwaiPlayer.mAppVodQosDebugInfo = new AppVodQosDebugInfoNew();
          }
          obj = this.mAemonMediaPlayer.newJavaAttrList();
          obj.SetObjectValue("VodQosDebugInfo", this.mKwaiPlayerDebugInfo.mAppVodQosDebugInfo);
          this.mAemonMediaPlayer.bizInvoke(0xc35f, obj);
          obj.Destroy();
       }
       return this.mKwaiPlayerDebugInfo;
    }
    public long getDecodeVideoFrameCount(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "168");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x7542, 0);
    }
    public long getDecodedDataSize(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "160");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x753b, 0);
    }
    public long getDecodedVideoHeight(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "176");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x7538, 0);
    }
    public long getDecodedVideoWidth(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "175");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x7537, 0);
    }
    public long getDisplayFrameCount(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "169");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x7543, 0);
    }
    public long getDownloadDataSize(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "161");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x753c, 0);
    }
    public int getDownloadedPercent(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "102");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mAemonMediaPlayer.getPropertyInt(0x9c48, 0);
    }
    public long getDroppedDuration(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "166");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x7541, 0);
    }
    public long getDtsDuration(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "162");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x753f, 0);
    }
    public long getDuration(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getDuration();
    }
    public Map getExtraQosInfo(){
       return this.mAemonMediaPlayer.mExtraQosInfo;
    }
    public long getFirstVideoPts(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x9c66, 0);
    }
    public String getKflvVideoPlayingUrl(){
       return this.getCurPlayingUrl();
    }
    public String getKwaiLiveVoiceComment(long p0){
       JavaAttrList obj;
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uAemonMediaP, "148");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.mAemonMediaPlayer.newJavaAttrList();
       obj.SetLongValue("time", p0);
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.bizInvoke(0xc37a, obj);
       obj.Destroy();
       javaAttrList.Destroy();
       return javaAttrList.GetStringValue("comment");
    }
    public String getKwaiSign(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "103");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonMediaPlayer.getPropertyString(0x9c49);
    }
    public String getKwaivppFilters(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "210");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonMediaPlayer.getPropertyString(0x9c5f);
    }
    public long getLastVideoPts(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x9c65, 0);
    }
    public String getLiveRealTimeQosJson(int p0,int p1,long p2,long p3,long p4){
       JavaAttrList obj;
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Long.valueOf(p2),Long.valueOf(p3),Long.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, uAemonMediaP, "151");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.mAemonMediaPlayer.newJavaAttrList();
       obj.SetIntValue("first", p0);
       obj.SetIntValue("last", p1);
       obj.SetLongValue("startTime", p2);
       obj.SetLongValue("duration", p3);
       obj.SetLongValue("collectInterval", p4);
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.bizInvoke(0xc35c, obj);
       obj.Destroy();
       javaAttrList.Destroy();
       return javaAttrList.GetStringValue("LiveQosJson");
    }
    public String getLiveStatJson(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "154");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonMediaPlayer.getPropertyString(0x9c59);
    }
    public MediaInfo getMediaInfo(){
       String[] stringArray;
       MediaInfo obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MediaInfo();
       obj.mMediaPlayerName = "kwaiplayer";
       String propertyStri = this.mAemonMediaPlayer.getPropertyString(0x9c41);
       String str = "";
       if (!TextUtils.isEmpty(propertyStri)) {
          stringArray = propertyStri.split(",");
          if (stringArray.length >= 2) {
             obj.mVideoDecoder = stringArray[0];
             obj.mVideoDecoderImpl = stringArray[1];
          }else if(stringArray.length >= 1){
             obj.mVideoDecoder = stringArray[0];
             obj.mVideoDecoderImpl = str;
          }
       }
       propertyStri = this.mAemonMediaPlayer.getPropertyString(0x9c42);
       if (!TextUtils.isEmpty(propertyStri)) {
          stringArray = propertyStri.split(",");
          if (stringArray.length >= 2) {
             obj.mAudioDecoder = stringArray[0];
             obj.mAudioDecoderImpl = stringArray[1];
          }else if(stringArray.length >= 1){
             obj.mAudioDecoder = stringArray[0];
             obj.mAudioDecoderImpl = str;
          }
       }
       Object[] objArray = new Object[0];
       obj.mMeta = KsMediaMeta.parse(this.mAemonMediaPlayer.bizInvoke(0xc367, objArray));
       return obj;
    }
    public Bundle getMediaMeta(){
       JavaAttrList obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAemonMediaPlayer.newJavaAttrList();
       obj.SetObjectValue("drm_callback", this.mKwaiVodDrmCallback);
       obj.Destroy();
       return null;
    }
    public long getMemorySize(){
       return this.mAemonMediaPlayer.getPropertyLong(0x7533, 0);
    }
    public final int getNativeFd(FileDescriptor p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AemonMediaPlayerAdapter.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ParcelFileDescriptor.dup(p0).getFd();
    }
    public IMediaPlayer$OnLiveVoiceCommentListener getOnLiveVoiceCommentListener(){
       return this.mOnLiveVoiceCommentListener;
    }
    public int getOrientationDegrees(){
       AemonMediaPlayerAdapter obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "196");
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
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "179");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x7548, -1);
    }
    public ProductContext getPlayerProductContext(){
       return this.mProductContext;
    }
    public String getPlayerTsJson(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "120");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonMediaPlayer.getPropertyString(0x9c73);
    }
    public float getProbeFps(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "92");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mAemonMediaPlayer.getPropertyFloat(0x9c43, 0);
    }
    public float getPropertyFloat(int p0,float p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, uAemonMediaP, "229");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this.mAemonMediaPlayer.getPropertyFloat(p0, p1);
    }
    public long getPropertyLong(int p0,long p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, uAemonMediaP, "230");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this.mAemonMediaPlayer.getPropertyLong(p0, p1);
    }
    public String getPropertyString(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "231");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.mAemonMediaPlayer.getPropertyString(p0);
    }
    public long getReadVideoFrameCount(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "167");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x7545, 0);
    }
    public Bitmap getScreenShot(){
       Object[] objArray = null;
       AemonMediaPlayerAdapter obj = PatchProxy.apply(objArray, this, AemonMediaPlayerAdapter.class, "94");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mVideoWidth;
       if (obj > null) {
          AemonMediaPlayerAdapter tmVideoHeigh = this.mVideoHeight;
          if (tmVideoHeigh > null) {
             Bitmap uBitmap = Bitmap.createBitmap(obj, tmVideoHeigh, Bitmap$Config.RGB_565);
             JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
             javaAttrList.SetObjectValue("bitmap", uBitmap);
             this.mAemonMediaPlayer.bizInvoke(0xc372, javaAttrList);
             javaAttrList.Destroy();
             return uBitmap;
          }
       }
       return objArray;
    }
    public int getSelectedTrack(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "29");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 != 1) {
          if (p0 != 2) {
             return -1;
          }else {
             return (int)this.mAemonMediaPlayer.getPropertyLong(0x4e22, -1);
          }
       }else {
          return (int)this.mAemonMediaPlayer.getPropertyLong(0x4e21, -1);
       }
    }
    public String getServerAddress(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "163");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonMediaPlayer.getPropertyString(0x7594);
    }
    public final KwaiGpuContext getSharedContext(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "226");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.setupGpuContextInternal();
    }
    public long getSourceDeviceType(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "170");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x7546, 0);
    }
    public float getSpeed(float p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uAemonMediaP, "159");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this.mAemonMediaPlayer.getPropertyFloat(0x2713, 0);
    }
    public String getStreamId(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "164");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonMediaPlayer.getPropertyString(0x7596);
    }
    public KwaiQosInfo getStreamQosInfo(){
       JavaAttrList obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "155");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAemonMediaPlayer.newJavaAttrList();
       KwaiQosInfo kwaiQosInfo = new KwaiQosInfo();
       obj.SetObjectValue("info", kwaiQosInfo);
       this.mAemonMediaPlayer.bizInvoke(0xc35d, obj);
       obj.Destroy();
       return kwaiQosInfo;
    }
    public Surface getSurface(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mSurfaceManager.getSurface();
    }
    public int getTotalPlayBackDuration(){
       return 0;
    }
    public ITrackInfo[] getTrackInfo(){
       return this.getTrackInfo();
    }
    public KsTrackInfo[] getTrackInfo(){
       Object[] objArray = null;
       Bundle obj = PatchProxy.apply(objArray, this, AemonMediaPlayerAdapter.class, "62");
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
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "199");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mAemonMediaPlayer.getPropertyInt(0x9c5d, 0);
    }
    public float getVideoAvgFps(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "174");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mAemonMediaPlayer.getPropertyFloat(0x7536, 0);
    }
    public long getVideoCachedBytes(){
       return this.mAemonMediaPlayer.getPropertyLong(0x4e27, 0);
    }
    public long getVideoCachedDuration(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x4e25, 0);
    }
    public long getVideoCachedPackets(){
       return this.mAemonMediaPlayer.getPropertyLong(0x4e29, 0);
    }
    public long getVideoDecErrorCount(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "165");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mAemonMediaPlayer.getPropertyLong(0x7540, 0);
    }
    public float getVideoDecodeFramesPerSecond(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mAemonMediaPlayer.getPropertyFloat(0x2711, 0);
    }
    public int getVideoDecoder(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)this.mAemonMediaPlayer.getPropertyLong(0x4e23, 0);
    }
    public int getVideoHeight(){
       return this.mVideoHeight;
    }
    public float getVideoOutputFramesPerSecond(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mAemonMediaPlayer.getPropertyFloat(0x2712, 0);
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
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "122");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonMediaPlayer.getPropertyString(0x9c52);
    }
    public String getVodAdaptiveHdrType(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "125");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonMediaPlayer.getPropertyString(0x9c54);
    }
    public String getVodAdaptiveHostName(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "124");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonMediaPlayer.getPropertyString(0x9c53);
    }
    public int getVodAdaptiveRepID(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "123");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)this.mAemonMediaPlayer.getPropertyLong(0x75f8, 0);
    }
    public String getVodAdaptiveUrl(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "121");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonMediaPlayer.getPropertyString(0x9c51);
    }
    public String getVodStatJson(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "118");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonMediaPlayer.getPropertyString(0x9c4f);
    }
    public String getXksCache(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "104");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAemonMediaPlayer.getPropertyString(0x9c4a);
    }
    public boolean handleTouchEvent(MotionEvent p0){
       AemonMediaPlayerAdapter obj = PatchProxy.applyOneRefs(p0, this, AemonMediaPlayerAdapter.class, "195");
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
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "180");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mAemonMediaPlayer.getPropertyLong(0x7549, 0) > 0)? true: false;
       return b;
    }
    public void initProcessPCMBuffer(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "112")) {
          return;
       }
       if (this.mProcessPCMBuffer == null) {
          int i = (int)this.mAemonMediaPlayer.getPropertyLong(0x7539, 0);
          this.mProcessPCMBuffer = (i <= 0)? ByteBuffer.allocateDirect(0x2af80): ByteBuffer.allocateDirect((i * 2));
       }
    label_002f :
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetObjectValue("pcm-buffer", this.mProcessPCMBuffer);
       this.mAemonMediaPlayer.bizInvoke(0xc375, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public boolean isAudioOnly(){
       return false;
    }
    public boolean isCacheEnabled(){
       int i = 0;
       if (this.mAemonMediaPlayer.getPropertyInt(0x9c5a, i) > 0) {
          i = true;
       }
       return i;
    }
    public boolean isLiveManifest(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "152");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mAspectKFlv.isLiveManifest();
    }
    public boolean isLiveManifestNative(){
       return false;
    }
    public boolean isLooping(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (this.mAemonMediaPlayer.getPropertyInt(0x9c64, i) != 1) {
          i = true;
       }
       return i;
    }
    public boolean isMediaPlayerValid(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "100");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (this.mAemonMediaPlayer.getPropertyInt(0x9c46, i) > 0) {
          i = true;
       }
       return i;
    }
    public boolean isPlayable(){
       return true;
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mAemonMediaPlayer.isPlaying();
    }
    public boolean isRepresentationEnableAdaptive(int p0){
       JavaAttrList obj;
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "34");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.mAemonMediaPlayer.newJavaAttrList();
       obj.SetIntValue("repId", p0);
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.bizInvoke(0xc365, obj);
       int i = javaAttrList.GetIntValue("result");
       javaAttrList.Destroy();
       obj.Destroy();
       boolean b = true;
       if (i != b) {
          b = false;
       }
       return b;
    }
    public void notifyABLoopEndOfCounter(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "67")) {
          return;
       }
       AemonMediaPlayerAdapter tmOnABLoopEn = this.mOnABLoopEndOfCounterListener;
       if (tmOnABLoopEn != null) {
          tmOnABLoopEn.onABLoopEndOfCounter(this);
       }
       return;
    }
    public void notifyKwaiOnInfo(int p0,int p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAemonMediaP, "224")) {
          return;
       }
       this.runOnMainThread(new AemonMediaPlayerAdapter$15(this, p0, p1));
       return;
    }
    public int notifyOnSelectRepresentation(List p0){
       AemonMediaPlayerAdapter obj = PatchProxy.applyOneRefs(p0, this, AemonMediaPlayerAdapter.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mKwaiRepresentationListener;
       int i = -1;
       if (obj != null) {
          i = obj.onSelectRepresentation(p0);
       }
       return i;
    }
    public void notifyRepresentationChangeEnd(int p0,boolean p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uAemonMediaP, "64")) {
          return;
       }
       uAemonMediaP = this.mKwaiRepresentationListener;
       if (uAemonMediaP != null) {
          uAemonMediaP.representationChangeEnd(p0, p1);
       }
       return;
    }
    public void notifyRepresentationChangeStart(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, AemonMediaPlayerAdapter.class, "63")) {
          return;
       }
       AemonMediaPlayerAdapter tmKwaiRepres = this.mKwaiRepresentationListener;
       if (tmKwaiRepres != null) {
          tmKwaiRepres.representationChangeStart(p0, p1);
       }
       return;
    }
    public void notifyRepresentationSelected(int p0,boolean p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uAemonMediaP, "65")) {
          return;
       }
       uAemonMediaP = this.mKwaiRepresentationListener;
       if (uAemonMediaP != null) {
          uAemonMediaP.onRepresentationSelected(p0, p1);
       }
       return;
    }
    public void notifySubtitleStateChangeEnd(int p0,int p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAemonMediaP, "68")) {
          return;
       }
       uAemonMediaP = this.mSubtitleListener;
       if (uAemonMediaP != null) {
          uAemonMediaP.onSelectedSubtitleStatusChange(p0, p1);
       }
       return;
    }
    public Surface openSurface(){
       AemonMediaPlayerAdapter obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "193");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mSurfaceTextureRender;
       if (obj != null) {
          return obj.d();
       }
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "21")) {
          return;
       }
       this.stayAwake(false);
       this.mAemonMediaPlayer.pause();
       return;
    }
    public void prepareAsync(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "19")) {
          return;
       }
       this.mAppQosLiveRealtimeWrapper.d(this.mDataSource);
       this.mAppQosLiveAdaptiveRealtimeWrapper.d();
       this.mAemonMediaPlayer.prepareAsync();
       return;
    }
    public void registerSensorEvent(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "197")) {
          return;
       }
       AemonMediaPlayerAdapter tmKwaiVR = this.mKwaiVR;
       if (tmKwaiVR != null) {
          tmKwaiVR.e();
       }
       return;
    }
    public final void release(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "26")) {
          return;
       }
       if (this.mIsVodAdaptive != null) {
          PlayerPreferrenceUtil.getInstance().saveVodAdaptiveData();
       }
       this.stayAwake(false);
       this.updateSurfaceScreenOn();
       this.mAemonMediaPlayer.release();
       this.resetListeners();
       this.mAspectAwesomeCache.release();
       if (this.mIsVR != null || this.mIsMultiSurface != null) {
          AemonMediaPlayerAdapter tmSurfaceTex = this.mSurfaceTextureRender;
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
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "24")) {
          return;
       }
       this.releaseAsync(null);
       return;
    }
    public void releaseAsync(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "25")) {
          return;
       }
       c.a(new AemonMediaPlayerAdapter$13(this, p0));
       return;
    }
    public void reload(String p0,boolean p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uAemonMediaP, "90")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetStringValue("path", p0);
       javaAttrList.SetIntValue("flushBuffer", p1);
       this.mAemonMediaPlayer.bizInvoke(0xc370, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public int removeBulletScreen(int p0){
       return 0;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "28")) {
          return;
       }
       this.stayAwake(false);
       this.mAemonMediaPlayer.reset();
       this.mVideoWidth = 0;
       this.mVideoHeight = 0;
       return;
    }
    public void resetListeners(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "70")) {
          return;
       }
       super.resetListeners();
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
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAemonMediaP, "202")) {
          return;
       }
       uAemonMediaP = this.mSurfaceTextureRender;
       if (uAemonMediaP != null) {
          uAemonMediaP.h(p0, p1);
       }
       return;
    }
    public final void runOnMainThread(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "228")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (Looper.getMainLooper() == Looper.myLooper()) {
          p0.run();
       }else {
          this.mMainThreadHandler.post(p0);
       }
       return;
    }
    public void seekTo(long p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAemonMediaP, "43")) {
          return;
       }
       this.mAemonMediaPlayer.seekTo(p0);
       return;
    }
    public void selectTrack(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "30")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetIntValue("track", p0);
       javaAttrList.SetIntValue("value", 1);
       this.mAemonMediaPlayer.bizInvoke(0xc363, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setAPJoySoundSwitchStatus(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "212")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyBoolean(0x9c60, p0);
       return;
    }
    public void setAbLoop(long p0,long p1,int p2){
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, AemonMediaPlayerAdapter.class, "200")) {
          return;
       }
       this.setAbLoop(p0, p1, p2, false);
       return;
    }
    public void setAbLoop(long p0,long p1,int p2,boolean p3){
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, AemonMediaPlayerAdapter.class, "201")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetLongValue("startMs", p0);
       javaAttrList.SetLongValue("endMs", p1);
       javaAttrList.SetIntValue("count", p2);
       javaAttrList.SetIntValue("disableSeekAtStart", p3);
       this.mAemonMediaPlayer.bizInvoke(0xc379, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setAppQosStatJson(JSONObject p0){
       String str = "page_session_id";
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "131")) {
          return;
       }
       try{
          if (p0.has(str)) {
             AemonMediaPlayerAdapter tmAppQosLive = this.mAppQosLiveRealtimeWrapper;
             if (tmAppQosLive != null) {
                tmAppQosLive.b(p0.getString(str));
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       this.mAemonMediaPlayer.setPropertyString(0x9c55, p0.toString());
       return;
    }
    public void setAudioLatency(int p0){
    }
    public void setAudioRepresentation(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "37")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyInt(0x9c63, p0);
       return;
    }
    public void setAudioStreamType(int p0){
    }
    public void setAwesomeCacheCallback(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "85")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetObjectValue("awesome-cache-callback", p0);
       this.mAemonMediaPlayer.bizInvoke(0xc352, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setBufferSize(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "99")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyInt(0x9c69, p0);
       return;
    }
    public void setCdnStatEvent(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "87")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetObjectValue("custom-cdn-event", p0);
       this.mAemonMediaPlayer.bizInvoke(0xc38f, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setCencKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "114")) {
          return;
       }
       this.setOption(1, "decryption_key", p0);
       return;
    }
    public void setClickCoordForOpaque(float p0,float p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uAemonMediaP, "232")) {
          return;
       }
       uAemonMediaP = 0;
       if (p0 - uAemonMediaP < 0 || ((double)p0 - 0x3ff0000000000000 > 0 || (p1 - uAemonMediaP >= 0 && (double)p1 - 0x3ff0000000000000 <= 0))) {
          JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
          javaAttrList.SetFloatValue("xPos", p0);
          javaAttrList.SetFloatValue("yPos", p1);
          this.mAemonMediaPlayer.bizInvoke(0xc393, javaAttrList);
          javaAttrList.Destroy();
       }
    label_004a :
       return;
    }
    public void setCodecFlag(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "181")) {
          return;
       }
       if (p0 <= 0) {
          p0 = 0;
       }
       this.mAemonMediaPlayer.setPropertyInt(0x9c5b, p0);
       return;
    }
    public void setConfig(KwaiPlayerConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "156")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "182")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyString(0x9c6a, p0);
       return;
    }
    public void setConnectionTimeout(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "98")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyInt(0x9c68, p0);
       return;
    }
    public void setContext(Context p0){
       this.mContext = p0;
    }
    public void setDataSource(Context p0,Uri p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AemonMediaPlayerAdapter.class, "11")) {
          return;
       }
       this.setDataSource(p0, p1, null);
       return;
    }
    public void setDataSource(Context p0,Uri p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AemonMediaPlayerAdapter.class, "12")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "17")) {
          return;
       }
       this.mAemonMediaPlayer.setDataSource(new AemonMediaPlayerAdapter$12(this, p0));
       return;
    }
    public void setDataSource(FileDescriptor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "15")) {
          return;
       }
       this.mDataSource = p0.toString();
       this.mAemonMediaPlayer.setDataSourceFd(this.getNativeFd(p0), 0, 0);
       return;
    }
    public final void setDataSource(FileDescriptor p0,long p1,long p2){
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, AemonMediaPlayerAdapter.class, "18")) {
          return;
       }
       this.mDataSource = p0.toString();
       this.mAemonMediaPlayer.setDataSourceFd(this.getNativeFd(p0), p1, p2);
       return;
    }
    public void setDataSource(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "13")) {
          return;
       }
       this.mDataSource = p0;
       this.configUserAgent();
       this.mAemonMediaPlayer.setDataSource(p0, null, null);
       return;
    }
    public void setDataSource(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AemonMediaPlayerAdapter.class, "14")) {
          return;
       }
       int i = 4;
       String str = "host";
       this.setOption(i, str, "myhost");
       if (p1 != null && !p1.isEmpty()) {
          String str1 = p1.get("Host");
          if (str1 != null) {
             this.setOption(i, str, str1);
          }
          StringBuilder str2 = "";
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             str2 = str2+uEntry.getKey()+": ";
             if (!TextUtils.isEmpty(uEntry.getValue())) {
                str2 = str2+uEntry.getValue();
             }
             str2 = str2+"\r\n";
          }
          this.setOption(1, "headers", str2);
       }
       this.setDataSource(p0);
       return;
    }
    public void setDisableHlsAbr(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "77")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(1, "disable_hls_abr", l);
       return;
    }
    public void setDisplay(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "2")) {
          return;
       }
       this.mSurfaceManager.asSurfaceHolder(p0);
       this.setVideoSurface(this.mSurfaceManager.getSurface());
       this.updateSurfaceScreenOn();
       return;
    }
    public void setDrmKeyInfo(String p0,int p1,int p2){
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AemonMediaPlayerAdapter.class, "115")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetStringValue("key", p0);
       javaAttrList.SetIntValue("index", p1);
       javaAttrList.SetIntValue("errorCode", p2);
       this.mAemonMediaPlayer.bizInvoke(0xc376, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setEnableAudioConvert(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "205")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(4, "audio-convert.enable", l);
       return;
    }
    public void setEnableAudioMix(boolean p0){
    }
    public void setEnableAudioSpectrum(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "109")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(4, "enable-audio-spectrum", l);
       return;
    }
    public void setEnableBulletScreenCache(boolean p0){
    }
    public void setEnableManifestRetry(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "79")) {
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
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "73")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(1, "enable_playlist_cache", l);
       return;
    }
    public void setEnableSegmentCache(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "72")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(4, "enable-segment-cache", l);
       return;
    }
    public void setExtOption(int p0,int p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAemonMediaP, "81")) {
          return;
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 == 3) {
                this.setOption(1, "view_height", (long)p1);
             }
          }else {
             this.setOption(1, "view_width", (long)p1);
          }
       }else {
          this.setOption(1, "special_buffer_init_ms", (long)p1);
       }
       return;
    }
    public void setExtOption(int p0,String p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uAemonMediaP, "80")) {
          return;
       }
       if (p0 == 5) {
          this.setNetworkRetryScene(p1);
       }
       return;
    }
    public void setExtSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "215")) {
          return;
       }
       DebugLog.i(AemonMediaPlayerAdapter.TAG, "setExtSurface "+String.valueOf(p0));
       this.mExtSurfaceManager.asSurface(p0);
       this.updateMultiSurface(this.mExtSurfaceManager.getSurface());
       return;
    }
    public void setExtSurfaceCrop(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, AemonMediaPlayerAdapter.class, "219")) {
          return;
       }
       AemonMediaPlayerAdapter tmSurfaceTex = this.mSurfaceTextureRender;
       if (tmSurfaceTex != null) {
          tmSurfaceTex.j(p0, p1, p2, p3, 1);
       }
       return;
    }
    public void setExtSurfaceCrop(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, AemonMediaPlayerAdapter.class, "218")) {
          return;
       }
       AemonMediaPlayerAdapter tmSurfaceTex = this.mSurfaceTextureRender;
       if (tmSurfaceTex != null) {
          tmSurfaceTex.k(p0, p1, p2, p3, 1);
       }
       return;
    }
    public void setExtSurfaceTexture(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "216")) {
          return;
       }
       DebugLog.i(AemonMediaPlayerAdapter.TAG, "setExtSurfaceTexture "+String.valueOf(p0));
       this.mExtSurfaceManager.asSurfaceTexture(p0);
       this.updateMultiSurface(this.mExtSurfaceManager.getSurface());
       return;
    }
    public void setHeadTracker(float p0,float p1,float p2){
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, AemonMediaPlayerAdapter.class, "204")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetFloatValue("yaw", p0);
       javaAttrList.SetFloatValue("pitch", p1);
       javaAttrList.SetFloatValue("roll", p2);
       this.mAemonMediaPlayer.bizInvoke(0xc382, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setHevcCodecName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "96")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyString(0x9c45, p0);
       return;
    }
    public void setHlsEnableMediaCodecBytebuffer(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "78")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(4, "hls-use-mediacodec-bytebuffer", l);
       return;
    }
    public void setHlsSegmentAlignThreshold(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "75")) {
          return;
       }
       this.setOption(1, "segment_align_threshold_ms", (long)p0);
       return;
    }
    public void setHttpResponseErrorCallback(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "86")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetObjectValue("error-callback", p0);
       this.mAemonMediaPlayer.bizInvoke(0xc353, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setIndexContent(String p0,String p1,String p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, AemonMediaPlayerAdapter.class, "127")) {
          return;
       }
       this.mDataSource = p0;
       this.configHeaders(p3);
       this.configUserAgent();
       this.mAemonMediaPlayer.setDataSource(p0, null, null);
       this.setOption(4, "input-data-type", 2);
       this.setOption(4, "index-content.pre_path", p1);
       this.setOption(4, "index-content.content", p2);
       return;
    }
    public void setInteractiveMode(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "194")) {
          return;
       }
       this.mInteractivemode = p0;
       uAemonMediaP = this.mKwaiVR;
       if (uAemonMediaP != null) {
          uAemonMediaP.h(p0);
       }
       return;
    }
    public void setIsLive(boolean p0){
       this.mIsLive = p0;
    }
    public void setIsVR(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "191")) {
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
       this.mKwaiAudioRepresentationListener = p0;
    }
    public void setKwaiBulletScreenListener(IKwaiBulletScreenListener p0){
    }
    public void setKwaiInjectHttpCallback(IKwaiInjectHttpCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "187")) {
          return;
       }
       if (this.mKwaiInjectHttpCallback != null) {
          Object[] objArray = new Object[0];
          Timber.w("do not setKwaiInjectHttpCallback more than once!", objArray);
          return;
       }else {
          this.mKwaiInjectHttpCallback = p0;
          JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
          javaAttrList.SetObjectValue("error-callback", new WeakReference(this.mKwaiInjectHttpCallback));
          this.mAemonMediaPlayer.bizInvoke(0xc390, javaAttrList);
          javaAttrList.Destroy();
          return;
       }
    }
    public void setKwaiManifest(String p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AemonMediaPlayerAdapter.class, "128")) {
          return;
       }
       if (p0 == null || p0.isEmpty()) {
          p0 = "KwaiManifest";
       }
       if (p1 != null && !p1.isEmpty()) {
          this.mDataSource = p0;
          this.configHeaders(p2);
          this.configUserAgent();
          this.mAemonMediaPlayer.setDataSource(p0, null, null);
          this.setOption(4, "input-data-type", 3);
          this.setOption(4, "index-content.content", p1);
          return;
       }else {
          throw new IllegalArgumentException("Empty manifest!");
       }
    }
    public void setKwaiRepresentationListener(IKwaiRepresentationListener p0){
       this.mKwaiRepresentationListener = p0;
    }
    public void setKwaiSubtitleListener(IKwaiSubtitleListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "186")) {
          return;
       }
       this.mSubtitleListener = p0;
       Object[] objArray = new Object[]{new WeakReference(this.mSubtitleListener)};
       this.mAemonMediaPlayer.bizInvoke(0xc358, objArray);
       return;
    }
    public void setKwaiVodDrmCallback(IKwaiVodDrmCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "116")) {
          return;
       }
       this.mKwaiVodDrmCallback = p0;
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetObjectValue("callback", new WeakReference(this.mKwaiVodDrmCallback));
       this.mAemonMediaPlayer.bizInvoke(0xc354, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setKwaivppExtJson(int p0,String p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uAemonMediaP, "211")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetIntValue("requestId", p0);
       javaAttrList.SetStringValue("value", p1);
       this.mAemonMediaPlayer.bizInvoke(0xc385, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setKwaivppFilters(int p0,String p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uAemonMediaP, "208")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetIntValue("requestId", p0);
       javaAttrList.SetStringValue("value", p1);
       this.mAemonMediaPlayer.bizInvoke(0xc383, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setKwaivppKswitchJson(int p0,String p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uAemonMediaP, "209")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetIntValue("requestId", p0);
       javaAttrList.SetStringValue("value", p1);
       this.mAemonMediaPlayer.bizInvoke(0xc384, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setLastTryFlag(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "113")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyBoolean(0x9c4e, p0);
       return;
    }
    public void setLiveLowDelayConfigJson(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "183")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyString(0x9c6b, p0);
       return;
    }
    public void setLiveManifestSwitchMode(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "140")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyInt(0x9c56, p0);
       return;
    }
    public void setLiveOnPeriodicalLiveAdaptiveQosStatListener(IMediaPlayer$OnLiveAdaptiveQosStatListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "141")) {
          return;
       }
       this.mAppQosLiveAdaptiveRealtimeWrapper.b(p0);
       return;
    }
    public void setLiveOnQosStatListener(IMediaPlayer$OnQosStatListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "134")) {
          return;
       }
       this.mOnQosStatListener = p0;
       this.mAppQosLiveRealtimeWrapper.a(p0);
       return;
    }
    public void setLooping(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "40")) {
          return;
       }
       int i = p0 ^ 0x01;
       this.setOption(4, "loop", (long)i);
       this.mAemonMediaPlayer.setPropertyInt(0x9c64, i);
       return;
    }
    public void setNetworkRetryScene(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "223")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetStringValue("scene", p0);
       this.mAemonMediaPlayer.bizInvoke(0xc38b, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setOnABLoopEndOfCounterListener(IMediaPlayer$OnABLoopEndOfCounterListener p0){
       this.mOnABLoopEndOfCounterListener = p0;
    }
    public void setOnAudioProcessPCMAvailableListener(KsMediaPlayer$OnAudioProcessPCMListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "220")) {
          return;
       }
       this.mOnAudioProcessPCMListener = p0;
       if (p0 != null) {
          this.initProcessPCMBuffer();
       }
       return;
    }
    public void setOnControlMessageListener(AemonMediaPlayerAdapter$OnControlMessageListener p0){
       this.mOnControlMessageListener = p0;
    }
    public void setOnLiveEventListener(IMediaPlayer$OnLiveEventListener p0){
       this.mOnLiveEventListener = p0;
    }
    public void setOnLiveExtraInfoListener(IKwaiMediaPlayer$OnLiveExtraInfoListener p0){
       this.mOnLiveExtraInfoListener = p0;
    }
    public void setOnLiveInterActiveListener(IKwaiMediaPlayer$OnLiveInterActiveListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "135")) {
          return;
       }
       this.setOnLiveInterActiveListener(p0, IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType.KwaiLiveListenerTypeAll);
       return;
    }
    public void setOnLiveInterActiveListener(IKwaiMediaPlayer$OnLiveInterActiveListener p0,IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AemonMediaPlayerAdapter.class, "136")) {
          return;
       }
       this.mOnLiveInterActiveListener = p0;
       this.setOption(4, "live-interactive-type", (long)p1.getIndex());
       if (p1.getIndex() & IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType.KwaiLiveListenerTypeVideoFrameRender.getIndex()) {
          this.setOption(4, "enable-videoframerender-calback", 1);
       }
       return;
    }
    public void setOnLiveSeiInfoListener(IKwaiMediaPlayer$OnLiveSeiInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "138")) {
          return;
       }
       this.mOnLiveSeiInfoListener = p0;
       this.setOption(4, "enable-seiinfo-callback", 1);
       return;
    }
    public void setOnLiveSrvTsptInfoListener(IKwaiMediaPlayer$OnLiveSrvTsptInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "137")) {
          return;
       }
       this.onLiveSrvTsptInfoListener = p0;
       this.setOption(4, "enable-tstpinfo-callback", 1);
       return;
    }
    public void setOnLiveVoiceCommentListener(IMediaPlayer$OnLiveVoiceCommentListener p0){
       this.mOnLiveVoiceCommentListener = p0;
    }
    public void setOnNativeInvokeListener(AemonMediaPlayerAdapter$OnNativeInvokeListener p0){
       this.mOnNativeInvokeListener = p0;
    }
    public void setOnQosEventInfoListener(OnQosEventInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "185")) {
          return;
       }
       if (p0 != null) {
          Object[] objArray = new Object[]{new WeakReference(p0)};
          this.mAemonMediaPlayer.bizInvoke(0xc357, objArray);
       }
       return;
    }
    public void setOnVideoRenderListener(IKwaiMediaPlayer$OnVideoRenderListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "139")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       if (p0 != null) {
          javaAttrList.SetObjectValue("listener", p0);
       }
       this.mAemonMediaPlayer.bizInvoke(0xc35a, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setOption(int p0,String p1,long p2){
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Long.valueOf(p2), this, AemonMediaPlayerAdapter.class, "51")) {
          return;
       }
       this.mAemonMediaPlayer.setOption(p0, p1, p2);
       return;
    }
    public void setOption(int p0,String p1,String p2){
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, AemonMediaPlayerAdapter.class, "50")) {
          return;
       }
       this.mAemonMediaPlayer.setOption(p0, p1, p2);
       return;
    }
    public void setPlayerMute(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "184")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyBoolean(0x9c5c, p0);
       return;
    }
    public void setProductContext(ProductContext p0){
       this.mProductContext = p0;
    }
    public void setPropertyFloat(int p0,float p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, uAemonMediaP, "1")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyFloat(p0, p1);
       return;
    }
    public void setQy265Context(Context p0){
    }
    public void setReadTimeout(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "97")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyInt(0x9c67, p0);
       return;
    }
    public void setRepresentation(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "31")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyInt(0x9c62, p0);
       return;
    }
    public boolean setRotateDegree(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "106");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.mAemonMediaPlayer.setPropertyInt(0x9c4c, p0);
       return true;
    }
    public void setScreenOnWhilePlaying(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "7")) {
          return;
       }
       if (this.mScreenOnWhilePlaying != p0) {
          if (p0 && !this.mSurfaceManager.isSourceSurfaceHolder()) {
             DebugLog.w(AemonMediaPlayerAdapter.TAG, "setScreenOnWhilePlaying\(true\) is ineffective without a SurfaceHolder");
          }
          this.mScreenOnWhilePlaying = p0;
          this.updateSurfaceScreenOn();
       }
       return;
    }
    public void setSegmentCacheCount(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "74")) {
          return;
       }
       this.setOption(1, "segment_cache_count", (long)p0);
       return;
    }
    public void setSpeed(float p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uAemonMediaP, "93")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyFloat(0x2713, p0);
       return;
    }
    public void setStartPlayBlockBufferMs(int p0,int p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAemonMediaP, "107")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetIntValue("bufferMs", p0);
       javaAttrList.SetIntValue("maxBufferCostMs", p1);
       this.mAemonMediaPlayer.bizInvoke(0xc373, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setStartPlayBlockBufferStrategy(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "108")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetIntValue("strategy", p0);
       this.mAemonMediaPlayer.bizInvoke(0xc38c, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setStereoType(int p0){
       this.mStereoType = p0;
    }
    public void setSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "3")) {
          return;
       }
       if (this.mScreenOnWhilePlaying != null && p0 != null) {
          DebugLog.w(AemonMediaPlayerAdapter.TAG, "setScreenOnWhilePlaying\(true\) is ineffective for Surface");
       }
       this.mSurfaceManager.asSurface(p0);
       this.setVideoSurface(this.mSurfaceManager.getSurface());
       return;
    }
    public void setSurfaceTexture(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "4")) {
          return;
       }
       if (this.mScreenOnWhilePlaying != null && p0 != null) {
          DebugLog.w(AemonMediaPlayerAdapter.TAG, "setScreenOnWhilePlaying\(true\) is ineffective for SurfaceTexture");
       }
       this.mSurfaceManager.asSurfaceTexture(p0);
       this.setVideoSurface(this.mSurfaceManager.getSurface());
       return;
    }
    public void setSutitleSelected(int p0,boolean p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uAemonMediaP, "189")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetIntValue("index", p0);
       this.mAemonMediaPlayer.bizInvoke(0xc381, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setTag1(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "95")) {
          return;
       }
       this.setOption(4, "tag1", (long)p0);
       return;
    }
    public void setTone(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "49")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyInt(0x9c61, p0);
       return;
    }
    public void setUseSegmentPreload(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "76")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(1, "use_segment_preload", l);
       return;
    }
    public void setVR(){
       AemonMediaPlayerAdapter tmKwaiVR;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AemonMediaPlayerAdapter.class, "192")) {
          return;
       }
       if (this.mIsVR != null) {
          u$a uoa = u.a();
          uoa.c(this.mInteractivemode);
          uoa.d(true);
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
             tmKwaiVR = this.mSurfaceTextureRender;
             if (tmKwaiVR != null) {
                tmKwaiVR.f();
             }
             j oj = j.b();
             this.mSurfaceTextureRender = oj;
             oj.e(objArray);
             this.mSurfaceTextureRender.m(this.mKwaiVR);
             this.mSurfaceTextureRender.l(new AemonMediaPlayerAdapter$14(this));
             this.setOption(4, "video-stereo-type", (long)this.mStereoType);
          }
       }
       return;
    }
    public void setVideoRawDataListener(IMediaPlayer$OnVideoRawDataListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "213")) {
          return;
       }
       this.mOnVideoRawDataListener = p0;
       if (p0 == null) {
          this.enableVideoRawDataCallback(false);
       }else {
          this.enableVideoRawDataCallback(true);
       }
       return;
    }
    public void setVideoScalingMode(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "105")) {
          return;
       }
       this.mAemonMediaPlayer.setPropertyInt(0x9c4b, p0);
       return;
    }
    public final void setVideoSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "6")) {
          return;
       }
       if (this.mIsVR != null || this.mIsMultiSurface != null) {
          Surface surface = (p0 != null)? this.openSurface(): p0;
          AemonMediaPlayerAdapter tmSurfaceTex = this.mSurfaceTextureRender;
          if (tmSurfaceTex != null) {
             tmSurfaceTex.q(p0, 0);
          }
          p0 = surface;
       }
       this.mAemonMediaPlayer.setVideoSurface(p0);
       return;
    }
    public void setViewSize(int p0,int p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAemonMediaP, "221")) {
          return;
       }
       this.setViewSize(p0, p1, 0);
       return;
    }
    public void setViewSize(int p0,int p1,float p2){
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), this, AemonMediaPlayerAdapter.class, "222")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetIntValue("width", p0);
       javaAttrList.SetIntValue("height", p1);
       javaAttrList.SetFloatValue("ratio", p2);
       this.mAemonMediaPlayer.bizInvoke(0xc387, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setVolume(float p0,float p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uAemonMediaP, "48")) {
          return;
       }
       this.mAemonMediaPlayer.setVolume(p0, p1);
       return;
    }
    public void setWakeMode(Context p0,int p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAemonMediaP, "9")) {
          return;
       }
       AemonMediaPlayerAdapter tmWakeLock = this.mWakeLock;
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
       PowerManager$WakeLock wakeLock = p0.getSystemService("power").newWakeLock((p1 | 0x20000000), uAemonMediaP.getName());
       this.mWakeLock = wakeLock;
       wakeLock.setReferenceCounted(false);
       if (1) {
          this.mWakeLock.acquire();
       }
       return;
    }
    public void setupAspectKlv(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "142")) {
          return;
       }
       this.mAspectKFlv = new KwaiAspectKFlv(this, p0);
       return;
    }
    public void setupAspectKwaiVodAdaptive(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "144")) {
          return;
       }
       this.mVodAdaptive = new AspectKwaiVodAdaptive(this, p0);
       return;
    }
    public void setupAspectLiveRealTimeReporter(boolean p0,KwaiPlayerConfig p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uAemonMediaP, "130")) {
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
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "71")) {
          return;
       }
       this.mAspectAwesomeCache = new KwaiPlayerAspectAwesomeCache(this, p0);
       return;
    }
    public void setupCacheSessionListener(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "84")) {
          return;
       }
       Object[] objArray = new Object[]{p0};
       this.mAemonMediaPlayer.bizInvoke(0xc351, objArray);
       return;
    }
    public void setupGpuContext(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "225")) {
          return;
       }
       this.setupGpuContextInternal();
       return;
    }
    public final KwaiGpuContext setupGpuContextInternal(){
       AemonMediaPlayerAdapter obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter.class, "227");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mGpuContext;
       if (obj != null) {
          return obj;
       }
       _monitor_enter(this);
       if (this.mGpuContext == null) {
          this.mGpuContext = KwaiGpuContextFactory.createEGL14(true);
       }
       _monitor_exit(this);
       return this.mGpuContext;
    }
    public void shutdownWaitStop(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "23")) {
          return;
       }
       this.stayAwake(false);
       this.stopDrawLoopTimer();
       this.mAemonMediaPlayer.shutdownWaitStop();
       this.stopLiveStatTimerImmediately();
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "20")) {
          return;
       }
       this.stayAwake(true);
       this.mAemonMediaPlayer.start();
       return;
    }
    public void startLiveStatTimer(KwaiPlayerConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "132")) {
          return;
       }
       this.setupAspectLiveRealTimeReporter(true, p0);
       this.mAppQosLiveRealtimeWrapper.a(this.mOnQosStatListener);
       this.mAppQosLiveRealtimeWrapper.d(this.mDataSource);
       this.mAppQosLiveAdaptiveRealtimeWrapper.d();
       return;
    }
    public void stayAwake(boolean p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAemonMediaP, "10")) {
          return;
       }
       uAemonMediaP = this.mWakeLock;
       if (uAemonMediaP != null) {
          if (p0 && !uAemonMediaP.isHeld()) {
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
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "91")) {
          return;
       }
       this.stayAwake(false);
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       this.mAemonMediaPlayer.bizInvoke(0xc371, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "22")) {
          return;
       }
       this.stopLiveStatTimerImmediately();
       this.stayAwake(false);
       this.stopDrawLoopTimer();
       this.mAemonMediaPlayer.stop();
       return;
    }
    public void stopDrawLoopTimer(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "203")) {
          return;
       }
       AemonMediaPlayerAdapter tmSurfaceTex = this.mSurfaceTextureRender;
       if (tmSurfaceTex != null) {
          tmSurfaceTex.n();
       }
       return;
    }
    public void stopLiveStatTimerImmediately(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "133")) {
          return;
       }
       this.mAppQosLiveRealtimeWrapper.e();
       this.mAppQosLiveAdaptiveRealtimeWrapper.e();
       return;
    }
    public final void unInitPlayer(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "27")) {
          return;
       }
       AemonMediaPlayerAdapter tmGpuContext = this.mGpuContext;
       if (tmGpuContext != null) {
          tmGpuContext.release();
       }
       return;
    }
    public void unRegisterSensorEvent(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "198")) {
          return;
       }
       AemonMediaPlayerAdapter tmKwaiVR = this.mKwaiVR;
       if (tmKwaiVR != null) {
          tmKwaiVR.j();
       }
       return;
    }
    public void updateAdaptiveMode(int p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "32")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetIntValue("adaptiveMode", p0);
       this.mAemonMediaPlayer.bizInvoke(0xc38d, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void updateCurrentMaxWallClockOffset(long p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAemonMediaP, "150")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetLongValue("max_wall_clock_offset", p0);
       this.mAemonMediaPlayer.bizInvoke(0xc37c, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void updateCurrentWallClock(long p0){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAemonMediaP, "149")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetLongValue("current_wall_clock", p0);
       this.mAemonMediaPlayer.bizInvoke(0xc37b, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public int updateKwaiManfiest(String p0){
       JavaAttrList obj = PatchProxy.applyOneRefs(p0, this, AemonMediaPlayerAdapter.class, "129");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mAemonMediaPlayer.newJavaAttrList();
       obj.SetStringValue("manifest", p0);
       this.mAemonMediaPlayer.bizInvoke(0xc391, obj);
       obj.Destroy();
       return 0;
    }
    public final void updateMultiSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter.class, "217")) {
          return;
       }
       AemonMediaPlayerAdapter tmSurfaceTex = this.mSurfaceTextureRender;
       if (tmSurfaceTex != null) {
          tmSurfaceTex.q(p0, 1);
       }
       return;
    }
    public void updateRepresentationAdaptiveFlag(int p0,boolean p1){
       AemonMediaPlayerAdapter uAemonMediaP = AemonMediaPlayerAdapter.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uAemonMediaP, "33")) {
          return;
       }
       JavaAttrList javaAttrList = this.mAemonMediaPlayer.newJavaAttrList();
       javaAttrList.SetIntValue("repId", p0);
       javaAttrList.SetIntValue("enable", p1);
       this.mAemonMediaPlayer.bizInvoke(0xc364, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public final void updateSurfaceScreenOn(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter.class, "8")) {
          return;
       }
       AemonMediaPlayerAdapter tmSurfaceMan = this.mSurfaceManager;
       boolean b = (this.mScreenOnWhilePlaying != null && this.mStayAwake != null)? true: false;
       tmSurfaceMan.setKeepScreenOn(b);
       return;
    }
}
