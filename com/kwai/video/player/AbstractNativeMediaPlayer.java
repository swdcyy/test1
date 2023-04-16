package com.kwai.video.player.AbstractNativeMediaPlayer;
import com.kwai.video.player.AbstractMediaPlayer;
import java.util.HashMap;
import java.lang.Object;
import android.view.Surface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import android.content.Context;
import android.opengl.EGLContext;
import com.kwai.video.player.surface.DummySurface;
import com.kwai.video.player.surface.DummySurfaceTexture;
import com.kwai.video.aemonplayer.surface.KwaiGpuContext;
import com.kwai.video.player.surface.DummySurfaceTextureImpl;
import java.lang.Number;
import java.nio.ByteBuffer;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Double;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.video.player.KsMediaPlayer$OnAudioProcessPCMListener;
import com.kwai.video.player.IMediaPlayer$OnLiveEventListener;
import com.kwai.video.player.AbstractNativeMediaPlayer$DefaultMediaCodecSelector;
import com.kwai.video.player.AbstractNativeMediaPlayer$OnMediaCodecSelectListener;
import com.kwai.video.player.IMediaPlayer$OnVideoRawDataListener;
import android.os.SystemClock;
import android.os.Message;
import android.os.Handler;
import com.kwai.video.aemonplayer.surface.KwaiGpuContextFactory;
import com.kwai.video.player.AbstractNativeMediaPlayer$EventHandler;
import android.os.Looper;

public abstract class AbstractNativeMediaPlayer extends AbstractMediaPlayer	// class@000aa7
{
    public Context mContext;
    public Surface mDummySurface;
    public DummySurfaceTexture mDummySurfaceTexture;
    public AbstractNativeMediaPlayer$EventHandler mEventHandler;
    public Map mExtraQosInfo;
    public KwaiGpuContext mGpuContext;
    public int mListenerContext;
    public long mNativeMediaDataSource;
    public long mNativeMediaPlayer;
    public int mNativeSurfaceTexture;
    public KsMediaPlayer$OnAudioProcessPCMListener mOnAudioProcessPCMListener;
    public IMediaPlayer$OnLiveEventListener mOnLiveEventListener;
    public AbstractNativeMediaPlayer$OnMediaCodecSelectListener mOnMediaCodecSelectListener;
    public IMediaPlayer$OnVideoRawDataListener mOnVideoRawDataListener;
    public long stForAudioFistFrame;
    public long stForVideoFistFrame;
    public static final String TAG = "com.kwai.video.player.AbstractNativeMediaPlayer";

    public void AbstractNativeMediaPlayer(){
       super();
       this.mExtraQosInfo = new HashMap();
       this.mOnLiveEventListener = null;
       this.mOnAudioProcessPCMListener = null;
       this.mOnVideoRawDataListener = null;
    }
    public static Surface getDummySurface(Object p0){
       DummySurface obj = PatchProxy.applyOneRefs(p0, null, AbstractNativeMediaPlayer.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          p0 = p0.get();
          if (p0 != null) {
             obj = DummySurface.newInstanceV17(null, false, null);
             p0.mDummySurface = obj;
             return obj;
          }
       }
       return null;
    }
    public static DummySurfaceTexture getOESSurfaceTexture(Object p0){
       Object obj = null;
       KwaiGpuContext obj1 = PatchProxy.applyOneRefs(p0, obj, AbstractNativeMediaPlayer.class, "16");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 != null) {
          p0 = p0.get();
          if (p0 != null) {
             obj1 = p0.setupGpuContextInternal();
             if (obj1 != null) {
                obj = obj1.getContext();
             }
             DummySurfaceTextureImpl uDummySurfac = DummySurfaceTextureImpl.newInstanceV17(false, obj);
             p0.mDummySurfaceTexture = uDummySurfac;
             return uDummySurfac;
          }
       }
       return obj;
    }
    public static long getSharedGpuContext(Object p0){
       KwaiGpuContext kwaiGpuConte = null;
       Object obj = PatchProxy.applyOneRefs(p0, kwaiGpuConte, AbstractNativeMediaPlayer.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (p0 != null) {
          p0 = p0.get();
          if (p0 != null) {
             kwaiGpuConte = p0.setupGpuContextInternal();
          }
          if (kwaiGpuConte != null) {
             return kwaiGpuConte.getContextHandler();
          }
       }
       return 0;
    }
    public static void onAudioProcessPCMReady(Object p0,ByteBuffer p1,long p2,int p3,int p4,int p5,double p6){
       AbstractNativeMediaPlayer uAbstractNat = AbstractNativeMediaPlayer.class;
       if (PatchProxy.isSupport(uAbstractNat)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Double.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, uAbstractNat, "11")) {
             return;
          }
       }
       WeakReference weakReferenc = p0;
       if (weakReferenc) {
          Object obj = weakReferenc.get();
          if (obj != null) {
             AbstractNativeMediaPlayer mOnAudioProc = obj.mOnAudioProcessPCMListener;
             if (mOnAudioProc != null) {
                mOnAudioProc.onAudioProcessPCMAvailable(obj, p1, p2, p4, p3, p5, p6);
             }
          }
       }
       return;
    }
    public static void onLiveEventCallback(Object p0,byte[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, AbstractNativeMediaPlayer.class, "8")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.get();
          if (p0 != null) {
             p0 = p0.mOnLiveEventListener;
             if (p0 != null) {
                p0.onLiveEventChange(p1);
             }
          }
       }
       return;
    }
    public static String onSelectCodec(Object p0,String p1,int p2,int p3){
       String obj;
       if (PatchProxy.isSupport(AbstractNativeMediaPlayer.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, AbstractNativeMediaPlayer.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       if (p0 == null || !p0 instanceof WeakReference) {
          return obj;
       }else {
          p0 = p0.get();
          if (p0 == null) {
             return obj;
          }else {
             AbstractNativeMediaPlayer mOnMediaCode = p0.mOnMediaCodecSelectListener;
             if (mOnMediaCode == null) {
                mOnMediaCode = AbstractNativeMediaPlayer$DefaultMediaCodecSelector.sInstance;
             }
             return mOnMediaCode.onMediaCodecSelect(p0, p1, p2, p3);
          }
       }
    }
    public static void onVideoRawDataReady(Object p0,byte[] p1,int p2,int p3,int p4,int p5){
       AbstractNativeMediaPlayer uAbstractNat = AbstractNativeMediaPlayer.class;
       if (PatchProxy.isSupport(uAbstractNat)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, uAbstractNat, "19")) {
             return;
          }
       }
       if (p0 != null) {
          Object obj = p0.get();
          if (obj != null) {
             uAbstractNat = obj.mOnVideoRawDataListener;
             if (uAbstractNat != null) {
                uAbstractNat.onVideoRawDataAvailable(obj, p1, p2, p3, p4, p5);
             }
          }
       }
       return;
    }
    public static void onVideoRawDataSize(Object p0,int p1,int p2,int p3,int p4){
       AbstractNativeMediaPlayer uAbstractNat = AbstractNativeMediaPlayer.class;
       if (PatchProxy.isSupport(uAbstractNat)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, uAbstractNat, "20")) {
             return;
          }
       }
       if (p0 != null) {
          Object obj = p0.get();
          if (obj != null) {
             uAbstractNat = obj.mOnVideoRawDataListener;
             if (uAbstractNat != null) {
                uAbstractNat.onVideoRawDataSize(obj, p1, p2, p3, p4);
             }
          }
       }
       return;
    }
    public static void postEventFromNative(Object p0,int p1,int p2,int p3,Object p4){
       AbstractNativeMediaPlayer uAbstractNat = AbstractNativeMediaPlayer.class;
       int i = 2;
       if (PatchProxy.isSupport(uAbstractNat)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, uAbstractNat, "4")) {
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
             int i1 = 200;
             if (p1 == i1 && p2 == i) {
                p0.start();
             }
             if (p1 == i1 && (p2 != 3 && (p2 != 0x2713 && (p2 == 0x2712 || p2 == 0x2714)))) {
                p0.notifyOnRenderingStart(p2, p3);
             }
             if (p1 == i1 && p2 == 0x277f) {
                p0.notifyOnDecodeFirstFrame(p2, p3);
             }
             if (p2 == 0x2712) {
                p0.stForAudioFistFrame = SystemClock.elapsedRealtime();
             }
             if (p2 == 3) {
                p0.stForVideoFistFrame = SystemClock.elapsedRealtime();
             }
             uAbstractNat = p0.mEventHandler;
             if (uAbstractNat != null) {
                Message message = uAbstractNat.obtainMessage(p1, p2, p3, p4);
                if (p2 == 3 || p2 == 0x2713) {
                   p0.mEventHandler.sendMessageAtFrontOfQueue(message);
                }else {
                   p0.mEventHandler.sendMessage(message);
                }
             }
             return;
          }
       }
    }
    public static void postFftDataNative(Object p0,float[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, AbstractNativeMediaPlayer.class, "9")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.get();
          if (p0 != null) {
             p0.notifyOnFftDataCapture(p1);
          }
       }
       return;
    }
    public static void releaseDummySurface(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, AbstractNativeMediaPlayer.class, "15")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.get();
          if (p0 != null) {
             AbstractNativeMediaPlayer mDummySurfac = p0.mDummySurface;
             if (mDummySurfac != null) {
                mDummySurfac.release();
                p0.mDummySurface = null;
             }
          }
       }
       return;
    }
    public static void releaseOESSurfaceTexture(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, AbstractNativeMediaPlayer.class, "17")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.get();
          if (p0 != null) {
             AbstractNativeMediaPlayer mDummySurfac = p0.mDummySurfaceTexture;
             if (mDummySurfac != null) {
                mDummySurfac.release();
                p0.mDummySurfaceTexture = null;
             }
          }
       }
       return;
    }
    private KwaiGpuContext setupGpuContextInternal(){
       AbstractNativeMediaPlayer obj = PatchProxy.apply(null, this, AbstractNativeMediaPlayer.class, "6");
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
    public abstract void enableVideoRawDataCallback(boolean p0);
    public KwaiGpuContext getSharedContext(){
       Object obj = PatchProxy.apply(null, this, AbstractNativeMediaPlayer.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.setupGpuContextInternal();
    }
    public void initPlayer(){
       if (PatchProxy.applyVoid(null, this, AbstractNativeMediaPlayer.class, "1")) {
          return;
       }
       this.mEventHandler = new AbstractNativeMediaPlayer$EventHandler(this, Looper.getMainLooper());
       return;
    }
    public abstract void initProcessPCMBuffer();
    public void notifyOnInfoInHandler(int p0,int p1){
       AbstractNativeMediaPlayer uAbstractNat = AbstractNativeMediaPlayer.class;
       if (PatchProxy.isSupport(uAbstractNat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAbstractNat, "22")) {
          return;
       }
       uAbstractNat = this.mEventHandler;
       if (uAbstractNat != null) {
          this.mEventHandler.sendMessage(uAbstractNat.obtainMessage(200, p0, p1));
       }
       return;
    }
    public abstract void onReceivePostEvent(Message p0);
    public void reset(){
       if (PatchProxy.applyVoid(null, this, AbstractNativeMediaPlayer.class, "3")) {
          return;
       }
       this.mEventHandler.removeCallbacksAndMessages(null);
       return;
    }
    public void resetListeners(){
       if (PatchProxy.applyVoid(null, this, AbstractNativeMediaPlayer.class, "7")) {
          return;
       }
       super.resetListeners();
       this.mOnLiveEventListener = null;
       this.mOnAudioProcessPCMListener = null;
       this.mOnVideoRawDataListener = null;
       this.mOnMediaCodecSelectListener = null;
       return;
    }
    public void setContext(Context p0){
       this.mContext = p0;
    }
    public void setOnAudioProcessPCMAvailableListener(KsMediaPlayer$OnAudioProcessPCMListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbstractNativeMediaPlayer.class, "10")) {
          return;
       }
       this.mOnAudioProcessPCMListener = p0;
       if (p0 != null) {
          this.initProcessPCMBuffer();
       }
       return;
    }
    public void setOnLiveEventListener(IMediaPlayer$OnLiveEventListener p0){
       this.mOnLiveEventListener = p0;
    }
    public void setOnMediaCodecSelectListener(AbstractNativeMediaPlayer$OnMediaCodecSelectListener p0){
       this.mOnMediaCodecSelectListener = p0;
    }
    public void setVideoRawDataListener(IMediaPlayer$OnVideoRawDataListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbstractNativeMediaPlayer.class, "13")) {
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
    public void setupGpuContext(){
       if (PatchProxy.applyVoid(null, this, AbstractNativeMediaPlayer.class, "5")) {
          return;
       }
       this.setupGpuContextInternal();
       return;
    }
    public final void unInitPlayer(){
       if (PatchProxy.applyVoid(null, this, AbstractNativeMediaPlayer.class, "2")) {
          return;
       }
       AbstractNativeMediaPlayer tmGpuContext = this.mGpuContext;
       if (tmGpuContext != null) {
          tmGpuContext.release();
       }
       return;
    }
}
