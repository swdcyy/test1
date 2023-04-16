package com.kwai.video.aemonplayer.AemonMediaPlayer;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.video.aemonplayer.AemonJNI;
import com.kwai.video.aemonplayer.AemonHotfix;
import com.kwai.video.aemonplayer.JavaAttrList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.ref.WeakReference;
import java.lang.StringBuilder;
import com.kwai.video.aemonplayer.AemonNativeLogger;
import android.os.SystemClock;
import android.os.Handler;
import android.os.Message;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Float;
import java.lang.Long;
import com.kwai.video.aemonplayer.AemonMediaPlayer$EventHandler;
import android.os.Looper;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnBufferingUpdateListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnCompletionListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnErrorListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnFftDataCaptureListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnInfoListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnInfoExtraListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnLogEventListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnPreparedListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnRenderingStartListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnSeekCompleteListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnVideoSizeChangedListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnBizInfoListener;
import com.kwai.video.aemonplayer.IMediaDataSource;
import android.view.Surface;

public class AemonMediaPlayer	// class@00199a
{
    public AemonMediaPlayer$EventHandler mEventHandler;
    public Map mExtraQosInfo;
    public final AemonJNI mJni;
    public long mNativeMediaPlayer;
    public AemonMediaPlayerListener$OnBizInfoListener mOnBizInfoListener;
    public AemonMediaPlayerListener$OnBufferingUpdateListener mOnBufferingUpdateListener;
    public AemonMediaPlayerListener$OnCompletionListener mOnCompletionListener;
    public AemonMediaPlayerListener$OnErrorListener mOnErrorListener;
    public AemonMediaPlayerListener$OnFftDataCaptureListener mOnFftDataCaptureListener;
    public AemonMediaPlayerListener$OnInfoExtraListener mOnInfoExtraListener;
    public AemonMediaPlayerListener$OnInfoListener mOnInfoListener;
    public AemonMediaPlayerListener$OnLogEventListener mOnLogEventListener;
    public AemonMediaPlayerListener$OnPreparedListener mOnPreparedListener;
    public AemonMediaPlayerListener$OnRenderingStartListener mOnRenderingStartListener;
    public AemonMediaPlayerListener$OnSeekCompleteListener mOnSeekCompleteListener;
    public AemonMediaPlayerListener$OnVideoSizeChangedListener mOnVideoSizeChangedListener;
    public String mSessionTag;
    public long stForAudioFistFrame;
    public long stForVideoFistFrame;
    public static final String TAG = "AemonMediaPlayer";

    public void AemonMediaPlayer(int p0){
       super();
       this.mSessionTag = "AemonMediaPlayer";
       this.mExtraQosInfo = new HashMap();
       this.mJni = AemonHotfix.CreateAemonJni(p0);
       this.initPlayer();
    }
    public static void postEventFromNative(Object p0,int p1,int p2,int p3,JavaAttrList p4){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       int i = 2;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, uAemonMediaP, "46")) {
             return;
          }
       }
       if (p0 == null) {
          return;
       }else {
          p0 = p0.get();
          if (p0 == null) {
             return;
          }else {
             String sessionTag = p0.getSessionTag();
             int i1 = 200;
             if (p1 == i1 && p2 == i) {
                p0.start();
             }
             if (p1 == i1 && (p2 != 3 && (p2 != 0x2713 && (p2 == 0x2712 || p2 == 0x2714)))) {
                p0.notifyOnRenderingStart(p2, p3);
             }
             if (p0.mEventHandler == null) {
                AemonNativeLogger.e(sessionTag, "postEventFromNative == null, ignore event what:"+p1);
                return;
             }else if(p2 == 0x2712){
                p0.stForAudioFistFrame = SystemClock.elapsedRealtime();
             }
             if (p2 == 3) {
                p0.stForVideoFistFrame = SystemClock.elapsedRealtime();
             }
             Message message = Message.obtain(p0.mEventHandler, p1, p2, p3, p4);
             if (p4 != null && p4.GetIntValue("sync") == 1) {
                p0.onReceivePostEvent(message);
             }else if(p2 != 3 && (p2 == 0x2713 || p2 == 0x2780)){
                p0.mEventHandler.sendMessageAtFrontOfQueue(message);
             }else {
                p0.mEventHandler.sendMessage(message);
             }
             return;
          }
       }
    }
    public static JavaAttrList staticBizInvoke(int p0,int p1,JavaAttrList p2){
       if (PatchProxy.isSupport(AemonMediaPlayer.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, null, AemonMediaPlayer.class, "48");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return AemonHotfix.staticBizInvoke(p0, p1, p2);
    }
    public static Object staticBizInvoke(int p0,int p1,Object[] p2){
       return null;
    }
    public static JavaAttrList staticNewJavaAttrList(int p0){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uAemonMediaP, "47");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return AemonHotfix.staticCreateJavaAttrList(p0);
    }
    public int addDataSource(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(AemonMediaPlayer.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, AemonMediaPlayer.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.mJni.native_addDataSource(this.mNativeMediaPlayer, p0, p1, p2);
    }
    public JavaAttrList bizInvoke(int p0,JavaAttrList p1){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uAemonMediaP, "32");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.mJni.native_bizInvoke(this.mNativeMediaPlayer, p0, p1);
    }
    public Object bizInvoke(int p0,Object[] p1){
       return null;
    }
    public long getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayer.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mJni.native_getCurrentPosition(this.mNativeMediaPlayer);
    }
    public long getDuration(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayer.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mJni.native_getDuration(this.mNativeMediaPlayer);
    }
    public int getJniInstallMode(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayer.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mJni.getJniInstallMode();
    }
    public float getPropertyFloat(int p0,float p1){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, uAemonMediaP, "24");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this.mJni.native_getPropertyFloat(this.mNativeMediaPlayer, p0, p1);
    }
    public int getPropertyInt(int p0,int p1){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAemonMediaP, "27");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.mJni.native_getPropertyInt(this.mNativeMediaPlayer, p0, p1);
    }
    public long getPropertyLong(int p0,long p1){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, uAemonMediaP, "26");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this.mJni.native_getPropertyLong(this.mNativeMediaPlayer, p0, p1);
    }
    public String getPropertyString(int p0){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "30");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.mJni.native_getPropertyString(this.mNativeMediaPlayer, p0);
    }
    public long getSessionId(){
       return this.mNativeMediaPlayer;
    }
    public String getSessionTag(){
       return this.mSessionTag;
    }
    public void initPlayer(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayer.class, "1")) {
          return;
       }
       this.mEventHandler = new AemonMediaPlayer$EventHandler(this, Looper.getMainLooper());
       this.mNativeMediaPlayer = this.mJni.native_createPlayer(new WeakReference(this));
       this.mSessionTag = "AemonMediaPlayer ["+this.getSessionId()+"]";
       return;
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayer.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mJni.native_isPlaying(this.mNativeMediaPlayer);
    }
    public JavaAttrList newJavaAttrList(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mJni.newJavaAttrList();
    }
    public final void notifyOnBufferingUpdate(int p0){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "35")) {
          return;
       }
       uAemonMediaP = this.mOnBufferingUpdateListener;
       if (uAemonMediaP != null) {
          uAemonMediaP.onBufferingUpdate(this, p0);
       }
       return;
    }
    public final void notifyOnCompletion(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayer.class, "34")) {
          return;
       }
       AemonNativeLogger.i("NativeMediaPlayer", "java notifyOnCompletion");
       AemonMediaPlayer tmOnCompleti = this.mOnCompletionListener;
       if (tmOnCompleti != null) {
          tmOnCompleti.onCompletion(this);
       }
       return;
    }
    public final boolean notifyOnError(int p0,int p1){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAemonMediaP, "38");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       AemonNativeLogger.i(this.getSessionTag(), "java notifyOnError: what="+p0+", extra="+p1);
       uAemonMediaP = this.mOnErrorListener;
       boolean b = (uAemonMediaP != null && uAemonMediaP.onError(this, p0, p1))? true: false;
       return b;
    }
    public void notifyOnFftDataCapture(float[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayer.class, "43")) {
          return;
       }
       AemonMediaPlayer tmOnFftDataC = this.mOnFftDataCaptureListener;
       if (tmOnFftDataC != null) {
          tmOnFftDataC.onFftDataCapture(p0);
       }
       return;
    }
    public final boolean notifyOnInfo(int p0,int p1){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAemonMediaP, "39");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       AemonNativeLogger.i(this.getSessionTag(), "java notifyOnInfo: what="+p0+", extra="+p1);
       uAemonMediaP = this.mOnInfoListener;
       boolean b = (uAemonMediaP != null && uAemonMediaP.onInfo(this, p0, p1))? true: false;
       return b;
    }
    public final boolean notifyOnInfoExtra(int p0,int p1,int p2,String p3){
       AemonMediaPlayer obj;
       if (PatchProxy.isSupport(AemonMediaPlayer.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), p3, this, AemonMediaPlayer.class, "41");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.mOnInfoExtraListener;
       boolean b = (obj != null && obj.onInfoExtra(this, p0, p1, p2, p3))? true: false;
       return b;
    }
    public final void notifyOnLogEvent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayer.class, "42")) {
          return;
       }
       AemonMediaPlayer tmOnLogEvent = this.mOnLogEventListener;
       if (tmOnLogEvent != null) {
          tmOnLogEvent.onLogEvent(this, p0);
       }
       return;
    }
    public final void notifyOnPrepared(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayer.class, "33")) {
          return;
       }
       AemonMediaPlayer tmOnPrepared = this.mOnPreparedListener;
       if (tmOnPrepared != null) {
          tmOnPrepared.onPrepared(this);
       }
       return;
    }
    public final void notifyOnRenderingStart(int p0,int p1){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAemonMediaP, "40")) {
          return;
       }
       AemonNativeLogger.i(this.getSessionTag(), "notifyOnRenderingStart var1:"+p0+" var2: "+p1);
       uAemonMediaP = this.mOnRenderingStartListener;
       if (uAemonMediaP != null) {
          uAemonMediaP.onRenderingStart(this, p0, p1);
       }else {
          AemonNativeLogger.i(this.getSessionTag(), "java notifyOnRenderingStart failed, listener = null");
       }
       return;
    }
    public final void notifyOnSeekComplete(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayer.class, "36")) {
          return;
       }
       AemonMediaPlayer tmOnSeekComp = this.mOnSeekCompleteListener;
       if (tmOnSeekComp != null) {
          tmOnSeekComp.onSeekComplete(this);
       }
       return;
    }
    public final void notifyOnVideoSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(AemonMediaPlayer.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, AemonMediaPlayer.class, "37")) {
          return;
       }
       AemonNativeLogger.i(this.getSessionTag(), "java notifyOnVideoSizeChanged: width="+p0+", height="+p1+", sarNum="+p2+", sarDen="+p3);
       AemonMediaPlayer tmOnVideoSiz = this.mOnVideoSizeChangedListener;
       if (tmOnVideoSiz != null) {
          tmOnVideoSiz.onVideoSizeChanged(this, p0, p1, p2, p3);
       }else {
          AemonNativeLogger.i(this.getSessionTag(), "java notifyOnVideoSizeChanged failed, listener = null");
       }
       return;
    }
    public void onReceivePostEvent(Message p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayer.class, "44")) {
          return;
       }
       Message what = p0.what;
       if (what != null) {
          if (what != 1) {
             if (what != 2) {
                if (what != 3) {
                   if (what != 4) {
                      if (what != 99) {
                         if (what != 100) {
                            if (what != 200) {
                               if (what != 201) {
                                  AemonMediaPlayer tmOnBizInfoL = this.mOnBizInfoListener;
                                  if (tmOnBizInfoL != null) {
                                     tmOnBizInfoL.onBizInfo(p0);
                                  }
                               }else {
                                  what = p0.arg1;
                                  if (what == 0x3e81) {
                                     what = p0.obj;
                                     i = what.GetIntValue("audio_stream_count");
                                     this.notifyOnInfoExtra(p0.arg1, i, what.GetIntValue("video_stream_count"), "");
                                  }else if(what == 0x3a99){
                                     what = p0.obj;
                                     i = what.GetIntValue("video_drop_frame_count");
                                     this.notifyOnInfoExtra(p0.arg1, i, what.GetIntValue("video_read_frame_count"), "");
                                  }
                               }
                            }else {
                               what = p0.arg1;
                               if (what != 0x2774) {
                                  this.notifyOnInfo(what, p0.arg2);
                                  return;
                               }else {
                                  this.notifyOnSeekComplete();
                                  return;
                               }
                            }
                         }else if(!this.notifyOnError(p0.arg1, p0.arg2)){
                            this.notifyOnCompletion();
                         }
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
                return;
             }
          }else {
             this.notifyOnPrepared();
          }
       }
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayer.class, "12")) {
          return;
       }
       this.mJni.native_pause(this.mNativeMediaPlayer);
       return;
    }
    public void prepareAsync(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayer.class, "10")) {
          return;
       }
       this.mJni.native_prepareAsync(this.mNativeMediaPlayer);
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayer.class, "15")) {
          return;
       }
       this.mJni.native_release(this.mNativeMediaPlayer);
       this.mNativeMediaPlayer = 0;
       return;
    }
    public void reset(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AemonMediaPlayer.class, "16")) {
          return;
       }
       this.mEventHandler.removeCallbacksAndMessages(objArray);
       this.mJni.native_reset(this.mNativeMediaPlayer);
       return;
    }
    public void resetListeners(){
       this.mOnPreparedListener = null;
       this.mOnBufferingUpdateListener = null;
       this.mOnCompletionListener = null;
       this.mOnSeekCompleteListener = null;
       this.mOnVideoSizeChangedListener = null;
       this.mOnErrorListener = null;
       this.mOnInfoListener = null;
       this.mOnRenderingStartListener = null;
       this.mOnLogEventListener = null;
       this.mOnFftDataCaptureListener = null;
    }
    public void seekTo(long p0){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAemonMediaP, "18")) {
          return;
       }
       this.mJni.native_seekTo(this.mNativeMediaPlayer, p0);
       return;
    }
    public int setDataSource(String p0,String[] p1,String[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, AemonMediaPlayer.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mJni.native_setDataSource(this.mNativeMediaPlayer, p0, p1, p2);
    }
    public void setDataSource(IMediaDataSource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayer.class, "6")) {
          return;
       }
       this.mJni.native_setDataSource(this.mNativeMediaPlayer, p0);
       return;
    }
    public void setDataSourceFd(int p0,long p1,long p2){
       if (PatchProxy.isSupport(AemonMediaPlayer.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, AemonMediaPlayer.class, "9")) {
          return;
       }
       this.mJni.native_setDataSourceFd(this.mNativeMediaPlayer, p0, p1, p2);
       return;
    }
    public final void setOnBizInfoListener(AemonMediaPlayerListener$OnBizInfoListener p0){
       this.mOnBizInfoListener = p0;
    }
    public final void setOnBufferingUpdateListener(AemonMediaPlayerListener$OnBufferingUpdateListener p0){
       this.mOnBufferingUpdateListener = p0;
    }
    public final void setOnCompletionListener(AemonMediaPlayerListener$OnCompletionListener p0){
       this.mOnCompletionListener = p0;
    }
    public final void setOnErrorListener(AemonMediaPlayerListener$OnErrorListener p0){
       this.mOnErrorListener = p0;
    }
    public final void setOnFftDataCaptureListener(AemonMediaPlayerListener$OnFftDataCaptureListener p0){
       this.mOnFftDataCaptureListener = p0;
    }
    public final void setOnInfoExtraListener(AemonMediaPlayerListener$OnInfoExtraListener p0){
       this.mOnInfoExtraListener = p0;
    }
    public final void setOnInfoListener(AemonMediaPlayerListener$OnInfoListener p0){
       this.mOnInfoListener = p0;
    }
    public final void setOnLogEventListener(AemonMediaPlayerListener$OnLogEventListener p0){
       this.mOnLogEventListener = p0;
    }
    public final void setOnPreparedListener(AemonMediaPlayerListener$OnPreparedListener p0){
       this.mOnPreparedListener = p0;
    }
    public final void setOnRenderingStartListener(AemonMediaPlayerListener$OnRenderingStartListener p0){
       this.mOnRenderingStartListener = p0;
    }
    public final void setOnSeekCompleteListener(AemonMediaPlayerListener$OnSeekCompleteListener p0){
       this.mOnSeekCompleteListener = p0;
    }
    public final void setOnVideoSizeChangedListener(AemonMediaPlayerListener$OnVideoSizeChangedListener p0){
       this.mOnVideoSizeChangedListener = p0;
    }
    public void setOption(int p0,String p1,long p2){
       if (PatchProxy.isSupport(AemonMediaPlayer.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Long.valueOf(p2), this, AemonMediaPlayer.class, "23")) {
          return;
       }
       this.mJni.native_setOption(this.mNativeMediaPlayer, p0, p1, p2);
       return;
    }
    public void setOption(int p0,String p1,String p2){
       if (PatchProxy.isSupport(AemonMediaPlayer.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, AemonMediaPlayer.class, "22")) {
          return;
       }
       this.mJni.native_setOption(this.mNativeMediaPlayer, p0, p1, p2);
       return;
    }
    public void setPropertyBoolean(int p0,boolean p1){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uAemonMediaP, "29")) {
          return;
       }
       this.mJni.native_setPropertyBoolean(this.mNativeMediaPlayer, p0, p1);
       return;
    }
    public void setPropertyFloat(int p0,float p1){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, uAemonMediaP, "25")) {
          return;
       }
       this.mJni.native_setPropertyFloat(this.mNativeMediaPlayer, p0, p1);
       return;
    }
    public void setPropertyInt(int p0,int p1){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAemonMediaP, "28")) {
          return;
       }
       this.mJni.native_setPropertyInt(this.mNativeMediaPlayer, p0, p1);
       return;
    }
    public void setPropertyString(int p0,String p1){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uAemonMediaP, "31")) {
          return;
       }
       this.mJni.native_setPropertyString(this.mNativeMediaPlayer, p0, p1);
       return;
    }
    public void setVideoSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayer.class, "3")) {
          return;
       }
       this.mJni.native_setVideoSurface(this.mNativeMediaPlayer, p0, -1);
       return;
    }
    public void setVideoSurface(Surface p0,int p1){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAemonMediaP, "4")) {
          return;
       }
       this.mJni.native_setVideoSurface(this.mNativeMediaPlayer, p0, p1);
       return;
    }
    public void setVolume(float p0,float p1){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uAemonMediaP, "21")) {
          return;
       }
       this.mJni.native_setVolume(this.mNativeMediaPlayer, p0, p1);
       return;
    }
    public void shutdownWaitStop(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayer.class, "14")) {
          return;
       }
       this.mJni.native_shutdownWaitStop(this.mNativeMediaPlayer);
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayer.class, "11")) {
          return;
       }
       this.mJni.native_start(this.mNativeMediaPlayer);
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayer.class, "13")) {
          return;
       }
       this.mJni.native_stop(this.mNativeMediaPlayer);
       return;
    }
    public void switchToDataSource(int p0){
       AemonMediaPlayer uAemonMediaP = AemonMediaPlayer.class;
       if (PatchProxy.isSupport(uAemonMediaP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAemonMediaP, "8")) {
          return;
       }
       this.mJni.native_switchToDataSource(this.mNativeMediaPlayer, p0);
       return;
    }
}
