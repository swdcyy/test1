package com.kwai.video.krtc.rtcengine.internal.o;
import com.kwai.video.krtc.rtcengine.camera.KCameraEngine$KCameraErrorCallback;
import com.kwai.video.krtc.rtcengine.internal.z;
import com.kwai.video.krtc.videocapture.VideoCapturerCallback;
import com.kwai.video.krtc.rtcengine.RtcEngine;
import com.kwai.video.krtc.rtcengine.RtcEngineConfig;
import com.kwai.video.krtc.rtcengine.internal.RtcEngineInnerSetting;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.video.krtc.rtcengine.internal.aa;
import java.lang.Integer;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.video.krtc.utils.Log;
import android.content.Context;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.rtcengine.internal.u;
import java.util.Set;
import com.kwai.video.krtc.observers.AryaQosObserver;
import android.media.projection.MediaProjection;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.WindowManager;
import com.kwai.video.krtc.rtcengine.camera.KCameraEngine$KCameraEngineConfig;
import android.view.Display;
import com.kwai.video.krtc.rtcengine.camera.KCameraEngine;
import sv7.a0;
import com.kwai.video.krtc.rtcengine.internal.z$a;
import com.kwai.video.krtc.rtcengine.internal.a;
import java.util.List;
import java.util.Iterator;
import sv7.b0;
import com.kwai.video.krtc.Arya$AryaConfig;
import com.kwai.video.krtc.observers.CustomVideoDataObserver;
import com.kwai.video.krtc.rtcengine.internal.r;
import java.lang.Boolean;
import android.os.Build$VERSION;
import com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import com.kwai.video.krtc.rtcengine.internal.w;
import com.kwai.video.krtc.rtcengine.internal.p;
import com.kwai.video.krtc.rtcengine.VideoWatermark;
import com.kwai.video.krtc.rtcengine.internal.y;
import com.kwai.video.krtc.rtcengine.internal.d;
import com.kwai.video.krtc.rtcengine.internal.k;
import java.util.Map;
import sv7.z;
import com.kwai.video.krtc.rtcengine.RtcEngine$VideoEncoderConfiguration;
import com.kwai.video.krtc.rtcengine.internal.o$4;
import java.lang.Runnable;
import android.os.Handler;
import com.kwai.video.krtc.rtcengine.camera.KVideoCanvas;
import com.kwai.video.krtc.rtcengine.render.RtcEngineRenderView;
import com.kwai.video.krtc.rtcengine.render.RtcEngineRenderer;
import com.kwai.video.krtc.rtcengine.internal.b;
import com.kwai.video.krtc.rtcengine.DataStreamConfig;
import com.kwai.video.krtc.rtcengine.internal.v;
import com.kwai.video.krtc.rtcengine.internal.e;
import android.os.HandlerThread;
import com.kwai.video.krtc.AryaManager;
import com.kwai.video.krtc.rtcengine.internal.n;
import com.kwai.video.krtc.rtcengine.internal.l;
import com.kwai.video.krtc.rtcengine.internal.c;
import com.kwai.video.krtc.rtcengine.internal.f;
import com.kwai.video.krtc.rtcengine.internal.t;
import com.kwai.video.krtc.rtcengine.RtcEngineAudioFrame;
import com.kwai.video.krtc.rtcengine.internal.m;
import com.kwai.video.krtc.rtcengine.JoinChannelParam;
import com.kwai.video.krtc.rtcengine.internal.i;
import android.os.Looper;
import com.kwai.video.krtc.rtcengine.internal.g;
import com.kwai.video.krtc.rtcengine.internal.h;
import com.kwai.video.krtc.rtcengine.internal.o$1;
import com.kwai.video.krtc.rtcengine.internal.u$a;
import com.kwai.video.krtc.rtcengine.internal.o$2;
import com.kwai.video.krtc.rtcengine.internal.j;
import com.kwai.video.krtc.rtcengine.internal.s;
import com.kwai.video.krtc.rtcengine.camera.a;
import java.lang.Exception;
import java.lang.Long;
import java.nio.ByteBuffer;
import com.kwai.video.krtc.Arya$VideoFrameAttribute;
import com.kwai.video.krtc.GL.TextureBuffer;
import com.kwai.video.krtc.rtcengine.internal.a0;
import com.kwai.video.krtc.Arya$InitParam;
import com.kwai.video.krtc.rtcengine.internal.o$a;
import com.kwai.video.krtc.rtcengine.internal.o$b;
import com.kwai.video.krtc.SignalMessageHandler;
import com.kwai.video.krtc.observers.AryaCallObserver;
import com.kuaishou.aegon.Aegon;
import com.kuaishou.aegon.Aegon$b;
import com.kwai.video.krtc.rtcengine.internal.o$3;
import bo.p;
import aegon.chrome.net.d;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import com.kwai.video.krtc.observers.AryaRawAudioFrameObserver;
import com.kwai.video.krtc.rtcengine.IMediaFrameObserver;
import java.lang.System;
import java.lang.Float;
import java.util.ArrayList;
import com.kwai.video.krtc.rtcengine.RtcEngine$FaceBeautyOptions;
import com.kwai.video.krtc.rtcengine.camera.KCameraCapturerConfiguration;
import com.kwai.video.krtc.rtcengine.camera.b;
import com.kwai.video.krtc.rtcengine.LiveTranscoding;
import java.lang.CharSequence;
import java.lang.Double;
import com.kwai.video.krtc.rtcengine.AudioMixingParam;
import com.kwai.video.krtc.rtcengine.RtcEngineFileStreamingConfig;
import android.graphics.Bitmap;
import com.kwai.video.krtc.rtcengine.internal.o$6;
import com.kwai.video.krtc.observers.AryaResultObserver;
import com.kwai.video.krtc.rtcengine.internal.o$5;
import com.kwai.video.krtc.rtcengine.internal.o$7;

public class o extends RtcEngine implements KCameraEngine$KCameraErrorCallback, z, VideoCapturerCallback	// class@00088d
{
    public n A;
    public p B;
    public s C;
    public Set D;
    public Set E;
    public Map F;
    public aa G;
    public aa H;
    public boolean I;
    public boolean J;
    public boolean K;
    public HandlerThread L;
    public Handler M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public RtcEngine$VideoEncoderConfiguration R;
    public RtcEngineInnerSetting S;
    public Context T;
    public KCameraEngine$KCameraEngineConfig U;
    public boolean V;
    public MediaProjection W;
    public boolean X;
    public AryaQosObserver Y;
    public final boolean a;
    public final int b;
    public final ConcurrentHashMap c;
    public k d;
    public l e;
    public i f;
    public KCameraEngine g;
    public KCameraEngine h;
    public c i;
    public w j;
    public y k;
    public m l;
    public f m;
    public h n;
    public d o;
    public t p;
    public b q;
    public g r;
    public e s;
    public r t;
    public RtcEngineConfig u;
    public u v;
    public u w;
    public a x;
    public v y;
    public Arya z;

    public void o(RtcEngineConfig p0){
       super(p0, null);
    }
    public void o(RtcEngineConfig p0,RtcEngineInnerSetting p1){
       super();
       this.a = true;
       this.b = -1;
       this.c = new ConcurrentHashMap();
       Integer integer = Integer.valueOf(0);
       this.G = new aa(integer);
       this.H = new aa(integer);
       this.I = false;
       this.J = true;
       this.K = false;
       this.N = true;
       this.O = true;
       this.P = false;
       this.Q = true;
       this.S = null;
       this.X = false;
       Log.i("RtcEngineImpl", "RtcEngineImpl config "+p0);
       this.u = p0;
       this.S = p1;
       this.T = p0.mContext.getApplicationContext();
       p0 = p0.mHandler;
       if (p0 != null) {
          this.addHandler(p0);
       }
       this.D = new CopyOnWriteArraySet();
       this.E = new CopyOnWriteArraySet();
       this.F = new ConcurrentHashMap();
       this.n();
       this.m();
       this.p();
       this.o();
       this.z.subscribeRemoteVideoStreamByDefault();
       return;
    }
    public static Arya a(o p0){
       return p0.z;
    }
    public static void a(int p0,int p1,int p2,IRtcEngineEventHandler p3){
       p3.onFirstLocalVideoFrame(p0, p1, p2);
    }
    public static void a(int p0,int p1,IRtcEngineEventHandler p2){
       p2.onLocalVideoStateChanged(p0, p1);
    }
    public static void a(IRtcEngineEventHandler p0){
       p0.onMediaProjectionStop();
    }
    public static u b(o p0){
       return p0.v;
    }
    public static void b(int p0,int p1,IRtcEngineEventHandler p2){
       p2.onLocalAudioStateChanged(p0, p1);
    }
    public static u c(o p0){
       return p0.w;
    }
    public static Set d(o p0){
       return p0.D;
    }
    public static RtcEngineConfig e(o p0){
       return p0.u;
    }
    public static AryaQosObserver f(o p0){
       return p0.Y;
    }
    public final int a(MediaProjection p0){
       KCameraEngine$KCameraEngineConfig obj = PatchProxy.applyOneRefs(p0, this, o.class, "105");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.W = p0;
       WindowManager systemServic = this.T.getSystemService("window");
       obj = new KCameraEngine$KCameraEngineConfig();
       obj.mCaptureScreen = true;
       obj.mCaptureWidth = systemServic.getDefaultDisplay().getWidth();
       obj.mCaptureHeight = systemServic.getDefaultDisplay().getHeight();
       obj.mMediaProjection = this.W;
       obj.mContext = this.T;
       obj.mCaptureTexture = true;
       obj.mRetryOpenCameraWhenDisconnet = false;
       Log.i("RtcEngineImpl", "startCaptureScreen config:"+obj.toString());
       KCameraEngine kCameraEngin = KCameraEngine.create(obj);
       this.h = kCameraEngin;
       kCameraEngin.addCaptureCallback(this);
       this.h.addCameraErrorCallback(this);
       this.h.startPreview();
       return false;
    }
    public int a(boolean p0,MediaProjection p1){
       this.V = p0;
       this.W = p1;
       return 0;
    }
    public Arya a(){
       return this.z;
    }
    public void a(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oo, "221")) {
          return;
       }
       if (this.G.a(Integer.valueOf(p0))) {
          this.G.b(Integer.valueOf(p0));
          this.a(new a0(p0, 0));
       }
       return;
    }
    public final void a(int p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oo, "223")) {
          return;
       }
       if (this.I == null) {
          this.I = true;
          Iterator iterator = this.e().a().iterator();
          while (iterator.hasNext()) {
             this.a(new b0(p0, p1, this.e().a(iterator.next())));
          }
       }
       return;
    }
    public void a(int p0,int p1,int p2){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, o.class, "225")) {
          return;
       }
       o th = this.h;
       if (th != null) {
          th.changeCapturerFormat(p0, p1, p2);
       }else {
          th = this.g;
          if (th != null) {
             th.changeCapturerFormat(p0, p1, p2);
          }
       }
       return;
    }
    public final void a(Arya$AryaConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "7")) {
          return;
       }
       o tS = this.S;
       if (tS != null && tS.isValid()) {
          Log.i("RtcEngineImpl", "RtcEngineImpl applyInnerSetting "+this.S);
          tS = this.S;
          p0.qosUploadInterval = tS.mQosInterval;
          p0.enableOpenApi = tS.mOpenApi;
          p0.videoEnableHwEnc = tS.mVideoHwEnc;
          p0.videoEnableHwDec = tS.mVideoHwDec;
          p0.videoEnableHevc = tS.mHevc;
          p0.aryaConfig = tS.mAryaConfig;
       }
       return;
    }
    public void a(AryaQosObserver p0){
       this.Y = p0;
    }
    public void a(CustomVideoDataObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "231")) {
          return;
       }
       o tt = this.t;
       if (tt != null) {
          tt.a(p0);
       }
       return;
    }
    public void a(KCameraEngine$KCameraEngineConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "102")) {
          return;
       }
       Log.i("RtcEngineImpl", "setCameraParams config: "+p0.toString());
       this.U = p0;
       return;
    }
    public void a(z$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "185")) {
          return;
       }
       o tc = this.c;
       if (tc != null) {
          Iterator iterator = tc.keySet().iterator();
          while (iterator.hasNext()) {
             IRtcEngineEventHandler iRtcEngineEv = iterator.next();
             if (iRtcEngineEv == null) {
                continue ;
             }
             p0.apply(iRtcEngineEv);
          }
       }
       return;
    }
    public final boolean a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "229");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Build$VERSION.SDK_INT >= 23 && p0.checkSelfPermission("android.permission.CAMERA")) {
          return false;
       }
       return true;
    }
    public boolean a(RtcEngineVideoFrame p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oo, "224");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.j.a(p0, p1);
    }
    public boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "187");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.u.mUserId).equals(p0);
    }
    public void addHandler(IRtcEngineEventHandler p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "11")) {
          return;
       }
       this.c.put(p0, Integer.valueOf(0));
       return;
    }
    public int addPublishStreamUrl(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "82");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.B.a(p0, p1);
    }
    public int addVideoWatermark(VideoWatermark p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "115");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.k.a(p0);
    }
    public int adjustAudioMixingPlayoutVolume(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "135");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.o.b(p0);
    }
    public int adjustAudioMixingPublishVolume(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "136");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.o.c(p0);
    }
    public int adjustAudioMixingVolume(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "134");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.o.a(p0);
    }
    public int adjustPlaybackVolume(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "16");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.d.b(p0);
    }
    public int adjustRecordingVolume(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.d.a(p0);
    }
    public int adjustUserPlaybackVolume(String p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oo, "17");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.d.a(p0, p1);
    }
    public Map b(){
       return this.c;
    }
    public void b(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oo, "222")) {
          return;
       }
       if (this.H.a(Integer.valueOf(p0))) {
          this.H.b(Integer.valueOf(p0));
          this.a(new z(p0, 0));
       }
       return;
    }
    public final void b(KCameraEngine$KCameraEngineConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "9")) {
          return;
       }
       String str = ", height:";
       Log.i("RtcEngineImpl", "Initial camera config, width:"+p0.mCaptureWidth+str+p0.mCaptureHeight+", fps:"+p0.mCaptureFps);
       if (this.R != null) {
          Log.d("RtcEngineImpl", "VideoEncoderConfig:"+this.R.toString());
          o tR = this.R;
          RtcEngine$VideoEncoderConfiguration targetWidth = tR.targetWidth;
          int i = 640;
          int i1 = 480;
          if (targetWidth > i1 || (tR.targetHeight <= i || (targetWidth <= i && tR.targetHeight <= i1))) {
             p0.mCaptureWidth = i1;
             p0.mCaptureHeight = i;
          }else if(targetWidth > 720 || (tR.targetHeight <= 1280 || (targetWidth <= 1280 && tR.targetHeight <= 720))){
             p0.mCaptureWidth = 720;
             p0.mCaptureHeight = 1280;
          }else {
             p0.mCaptureWidth = 1080;
             p0.mCaptureHeight = 1920;
          }
          p0.mCaptureFps = tR.frameRate;
          p0.orientationMode = tR.orientationMode;
          Log.i("RtcEngineImpl", "Camera config, width:"+p0.mCaptureWidth+str+p0.mCaptureHeight+", fps:"+p0.mCaptureFps);
       }
       return;
    }
    public void b(z$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "186")) {
          return;
       }
       o tM = this.M;
       if (tM != null) {
          tM.post(new o$4(this, p0));
       }
       return;
    }
    public final boolean b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "230");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Build$VERSION.SDK_INT >= 23 && p0.checkSelfPermission("android.permission.RECORD_AUDIO")) {
          return false;
       }
       return true;
    }
    public int bindLocalVideoView(KVideoCanvas p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "92");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineImpl", "bindLocalVideoView userId:"+p0.userId+", channelId:"+p0.channelId+", surfaceView:"+p0.remoteRenderView+", render:"+p0.remoteRenderView.getRenderer());
       if (this.E.add(p0)) {
          return 0;
       }
       Log.e("RtcEngineImpl", "failed to bindLocalVideoView");
       return -1;
    }
    public int bindRemoteVideoView(KVideoCanvas p0){
       KVideoCanvas obj = PatchProxy.applyOneRefs(p0, this, o.class, "95");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineImpl", "bindRemoteVideoView userId:"+p0.userId+", channelId:"+p0.channelId+", surfaceView:"+p0.remoteRenderView+", render:"+p0.remoteRenderView.getRenderer());
       obj = p0.remoteRenderView;
       if (obj == null) {
          return -1;
       }
       if (!obj instanceof RtcEngineRenderView) {
          return -1;
       }
       Object[] objArray = new Object[]{p0.userId,p0.channelId,Integer.valueOf(p0.sourceType)};
       String str = String.format("%s-%s-%d", objArray);
       if (!this.F.containsKey(str)) {
          this.F.put(str, new CopyOnWriteArraySet());
       }
       if (!this.F.get(str).add(p0.remoteRenderView)) {
          Log.e("RtcEngineImpl", "failed to bindRemoteVideoView");
          return -1;
       }else {
          p0.remoteRenderView.setVideoScaleMode(p0.renderMode);
          return 0;
       }
    }
    public Set c(){
       return this.D;
    }
    public int clearAllPlayAudio(){
       Object obj = PatchProxy.apply(null, this, o.class, "165");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.q.b();
    }
    public int clearPlayAudio(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "164");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.q.a(p0);
    }
    public int clearVideoWatermarks(){
       Object obj = PatchProxy.apply(null, this, o.class, "116");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.k.a();
    }
    public int createDataStream(String p0,int p1,DataStreamConfig p2){
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, o.class, "178");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.y.a(p0, p1, p2);
    }
    public Map d(){
       return this.F;
    }
    public void destroyInstance(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "10")) {
          return;
       }
       Log.i("RtcEngineImpl", "destroyInstance");
       o ts = this.s;
       if (ts != null) {
          ts.a();
       }
       ts = this.g;
       if (ts != null) {
          ts.destroy();
          this.g = objArray;
       }
       ts = this.h;
       if (ts != null) {
          ts.destroy();
          this.h = objArray;
       }
       this.D.clear();
       this.E.clear();
       this.F.clear();
       this.L.quit();
       this.t.b();
       this.c.clear();
       AryaManager.getInstance().destroyArya(this.z);
       return;
    }
    public int disableAttenuation(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "207");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.A.j(p0);
    }
    public int disableAudio(){
       Object obj = PatchProxy.apply(null, this, o.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v.a(false);
       return this.d.b();
    }
    public int disableAudioVolumeIndication(){
       Object obj = PatchProxy.apply(null, this, o.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.c();
    }
    public int disableDenoise(){
       Object obj = PatchProxy.apply(null, this, o.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.z.disableDenoise();
    }
    public int disableDualStreamMode(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.e.f(p0);
       return 0;
    }
    public int disableExternalRawAudioSource(){
       Object obj = PatchProxy.apply(null, this, o.class, "110");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.i.b();
    }
    public int disableInEarMonitoring(){
       Object obj = PatchProxy.apply(null, this, o.class, "122");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.m.c();
    }
    public void disableLastmileTest(){
       if (PatchProxy.applyVoid(null, this, o.class, "215")) {
          return;
       }
       Log.i("RtcEngineImpl", "[RtcEngine] disableLastmileTest");
       o tz = this.z;
       if (tz != null) {
          tz.disableLastmileTest();
       }
       return;
    }
    public int disableLocalAudio(){
       Object obj = PatchProxy.apply(null, this, o.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v.b(false);
       return this.d.e();
    }
    public int disableLocalAudioComfortableNoise(){
       Object obj = PatchProxy.apply(null, this, o.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v.c(false);
       return this.d.k();
    }
    public int disableLocalVideo(){
       o obj = PatchProxy.apply(null, this, o.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.w.b(false);
       obj = this.g;
       if (obj != null) {
          obj.stopPreview();
       }
       this.O = false;
       return this.e.d();
    }
    public int disableNoiseSuppression(){
       Object obj = PatchProxy.apply(null, this, o.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.s();
    }
    public int disableRangeAudio(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "202");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.A.f(p0);
    }
    public int disableRemotePriority(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.z.disableRemotePriority(p0);
    }
    public int disableRequestAudioFocus(){
       Object obj = PatchProxy.apply(null, this, o.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.u();
    }
    public int disableSpatializer(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "204");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.A.h(p0);
    }
    public int disableSpeakerphone(){
       Object obj = PatchProxy.apply(null, this, o.class, "119");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.m.a(false);
    }
    public int disableVideo(){
       Object obj = PatchProxy.apply(null, this, o.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.w.a(false);
       this.N = false;
       return this.e.b();
    }
    public a e(){
       return this.x;
    }
    public int enableAttenuation(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "206");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.A.i(p0);
    }
    public int enableAudio(){
       Object obj = PatchProxy.apply(null, this, o.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v.a(true);
       return this.d.a();
    }
    public int enableAudioVolumeIndication(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, o.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.d.a(p0, p1, p2);
    }
    public int enableDenoise(){
       Object obj = PatchProxy.apply(null, this, o.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.z.enableDenoise();
    }
    public int enableDualStreamMode(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.e.e(p0);
       return 0;
    }
    public int enableExternalRawAudioSource(){
       Object obj = PatchProxy.apply(null, this, o.class, "109");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.i.a();
    }
    public int enableHrtf(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oo, "213");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.z.enableHrtf(p0);
       return 0;
    }
    public int enableInEarMonitoring(){
       Object obj = PatchProxy.apply(null, this, o.class, "121");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.m.b();
    }
    public void enableLastmileTest(){
       if (PatchProxy.applyVoid(null, this, o.class, "214")) {
          return;
       }
       Log.i("RtcEngineImpl", "[RtcEngine] enableLastmileTest");
       o tz = this.z;
       if (tz != null) {
          tz.enableLastmileTest();
       }
       return;
    }
    public int enableLocalAudio(){
       Object obj = PatchProxy.apply(null, this, o.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v.b(true);
       return this.d.d();
    }
    public int enableLocalAudioComfortableNoise(){
       Object obj = PatchProxy.apply(null, this, o.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v.c(true);
       return this.d.j();
    }
    public int enableLocalVideo(){
       o obj = PatchProxy.apply(null, this, o.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.w.b(true);
       if (this.N != null) {
          obj = this.g;
          if (obj != null) {
             obj.startPreview();
          }
       }
       this.O = true;
       return this.e.c();
    }
    public int enableNoiseSuppression(){
       Object obj = PatchProxy.apply(null, this, o.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.r();
    }
    public int enableRangeAudio(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "201");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.A.e(p0);
    }
    public int enableRemotePriority(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.z.enableRemotePriority(p0, p1);
    }
    public int enableRequestAudioFocus(){
       Object obj = PatchProxy.apply(null, this, o.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.t();
    }
    public int enableSpatializer(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "203");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.A.g(p0);
    }
    public int enableSpeakerphone(){
       Object obj = PatchProxy.apply(null, this, o.class, "118");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.m.a(true);
    }
    public int enableVideo(){
       Object obj = PatchProxy.apply(null, this, o.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.w.a(true);
       this.N = true;
       return this.e.a();
    }
    public f f(){
       return this.m;
    }
    public u g(){
       return this.v;
    }
    public int getAudioMixingCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, o.class, "217");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.o.i();
    }
    public int getAudioMixingDuration(){
       Object obj = PatchProxy.apply(null, this, o.class, "216");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.o.h();
    }
    public int getAudioMixingPlayoutVolume(){
       Object obj = PatchProxy.apply(null, this, o.class, "139");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.o.f();
    }
    public int getAudioMixingPublishVolume(){
       Object obj = PatchProxy.apply(null, this, o.class, "140");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.o.g();
    }
    public float getCameraMaxZoomFactor(){
       o obj = PatchProxy.apply(null, this, o.class, "87");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       Log.i("RtcEngineImpl", "getCameraMaxZoomFactor");
       obj = this.g;
       float cameraMaxZoo = (obj != null)? obj.getCameraMaxZoomFactor(): 0xbf800000;
       return cameraMaxZoo;
    }
    public double getEffectsVolume(){
       Object obj = PatchProxy.apply(null, this, o.class, "156");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return this.p.e();
    }
    public int getNetworkQualityScore(){
       Object obj = PatchProxy.apply(null, this, o.class, "226");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.z.getNetState();
    }
    public u h(){
       return this.w;
    }
    public boolean i(){
       return this.J;
    }
    public int inputSpeakerAudio(RtcEngineAudioFrame p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "112");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.i.b(p0);
    }
    public boolean isCameraTorchSupported(){
       o obj = PatchProxy.apply(null, this, o.class, "91");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       boolean b = (obj != null && obj.isCameraTorchSupported())? true: false;
       return b;
    }
    public boolean isCameraZoomSupported(){
       o obj = PatchProxy.apply(null, this, o.class, "90");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       boolean b = (obj != null && obj.isCameraZoomSupported())? true: false;
       return b;
    }
    public boolean isFileStreamStarted(){
       Object obj = PatchProxy.apply(null, this, o.class, "173");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.l.a();
    }
    public boolean isSpeakerphoneEnabled(){
       Object obj = PatchProxy.apply(null, this, o.class, "120");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.m.a();
    }
    public boolean isSupportHeadphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, o.class, "232");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.z.isSupportHeadphoneMonitor();
    }
    public Handler j(){
       return this.M;
    }
    public int joinChannel(JoinChannelParam p0){
       o obj = PatchProxy.applyOneRefs(p0, this, o.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.m.a(this.J);
       this.m.d();
       this.v.a(p0.channelId);
       this.w.a(p0.channelId);
       obj = this.T;
       if (obj != null) {
          this.a(obj);
          this.b(this.T);
       }
       return this.f.a(p0);
    }
    public void k(){
       this.K = true;
    }
    public void l(){
       this.K = false;
    }
    public int leaveChannel(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v.a();
       this.w.a();
       return this.f.a(p0);
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       if (this.r()) {
          RtcEngineInnerSetting rtcEngineInn = RtcEngineInnerSetting.getRtcEngineInnerSetting();
          if (rtcEngineInn != null && rtcEngineInn.isValid()) {
             this.S = rtcEngineInn;
          }
       }
       return;
    }
    public int muteAllRemoteAudioStreams(){
       Object obj = PatchProxy.apply(null, this, o.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.l();
    }
    public int muteAllRemoteAudioStreams(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.a(p0);
    }
    public int muteAudioEffects(){
       Object obj = PatchProxy.apply(null, this, o.class, "158");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.p.f();
    }
    public int muteAudioMixing(){
       Object obj = PatchProxy.apply(null, this, o.class, "137");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.o.d();
    }
    public int muteLocalAudioStream(){
       Object obj = PatchProxy.apply(null, this, o.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v.c(true);
       return this.d.f();
    }
    public int muteLocalVideoStream(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.w.c(true);
       return this.e.a(p0);
    }
    public int muteRecordingSignal(){
       Object obj = PatchProxy.apply(null, this, o.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v.c(true);
       return this.d.h();
    }
    public int muteRemoteAudioStream(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.a(p0, p1);
    }
    public int muteRemoteVideoStream(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.a(p0, p1);
    }
    public int muteSpeaker(){
       Object obj = PatchProxy.apply(null, this, o.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.n();
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       HandlerThread handlerThrea = new HandlerThread("RtcEngineCb");
       this.L = handlerThrea;
       handlerThrea.start();
       this.M = new Handler(this.L.getLooper());
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       this.f = new i(this.u, this);
       this.d = new k(this);
       this.e = new l(this);
       this.o = new d(this.z, this);
       this.p = new t(this.z, this);
       this.q = new b(this.z, this);
       this.r = new g(this.z, this);
       this.n = new h(this.z);
       this.i = new c(this.z);
       this.j = new w(this.z);
       this.s = new e(this.z, this);
       this.k = new y(this.z);
       this.l = new m(this.z, this);
       this.m = new f(this, this.z);
       this.A = new n(this);
       this.B = new p(this.z);
       this.v = new u(new o$1(this));
       this.w = new u(new o$2(this));
       this.x = new j();
       this.y = new v(this);
       this.C = new s(this);
       this.u();
       this.v();
       return;
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, o.class, "194")) {
          return;
       }
       o tz = this.z;
       if (tz != null) {
          tz.onBackground();
       }
       return;
    }
    public void onForeground(){
       if (PatchProxy.applyVoid(null, this, o.class, "195")) {
          return;
       }
       o tz = this.z;
       if (tz != null) {
          tz.onForeground();
       }
       return;
    }
    public void onOpenCameraFailed(a p0,Exception p1){
    }
    public void onRawVideo(int p0,byte[] p1,int p2,int p3,long p4,int p5,int p6,String p7,boolean p8,boolean p9){
       Object obj = this;
       object oobject = p1;
       o oo = o.class;
       int i = 0;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[10];
          objArray[i] = Integer.valueOf(p0);
          objArray[1] = oobject;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Long.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = Boolean.valueOf(p9);
          if (PatchProxy.applyVoid(objArray, obj, oo, "182")) {
             return;
          }
       }
       obj.t.a(ByteBuffer.wrap(p1), p2, p3, p0, p5, p6, p4, p8);
       if (obj.z != null && obj.P == null) {
          Arya$VideoFrameAttribute videoFrameAt = new Arya$VideoFrameAttribute(p0, p2, p3, p4, p5, p6, p7);
          if (obj.K != null) {
             oo.sourceId = 1;
          }
          o z = obj.z;
          if (p9 && obj.X != null) {
             i = true;
          }
          z.inputRawVideo(oobject, oo, i);
       }
       oo = obj.E;
       if (oo != null && !p9) {
          Iterator iterator = oo.iterator();
          while (iterator.hasNext()) {
             RtcEngineVideoFrame rtcEngineVid = new RtcEngineVideoFrame(p0, ByteBuffer.wrap(p1), p2, p3, 0, p5, p6, false, true, p8);
             iterator.next().remoteRenderView.getRenderer().renderFrame(i);
          }
       }
       if (!p9 || obj.X == null) {
          obj.b(1);
          obj.a(p2, p3);
       }
       return;
    }
    public void onRawVideo(TextureBuffer p0,String p1,boolean p2,boolean p3){
       boolean b;
       o oo = this;
       TextureBuffer textureBuffe = p0;
       int i = p1;
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, o.class, "183")) {
          return;
       }
       oo.t.a(textureBuffe, p2);
       o e = oo.E;
       if (e != null && !p3) {
          Iterator iterator = e.iterator();
          while (iterator.hasNext()) {
             RtcEngineRenderer renderer = iterator.next().remoteRenderView.getRenderer();
             int width = p0.getWidth();
             int height = p0.getHeight();
             int rotation = p0.getRotation();
             int i1 = (rotation == 90 || rotation == 270)? 1: 0;
             int i2 = (i1)? height: width;
             int i3 = (i1)? width: height;
             RtcEngineVideoFrame rtcEngineVid = new RtcEngineVideoFrame(i2, i3, 0, rotation, p0, p2);
             renderer.renderFrame(v11);
             i = i;
             textureBuffe = textureBuffe;
          }
       }
       String str = i;
       TextureBuffer textureBuffe1 = textureBuffe;
       if (!p3 || oo.X == null) {
          oo.b(1);
          oo.a(p0.getWidth(), p0.getHeight());
       }
       e = oo.z;
       if (e != null && oo.P == null) {
          if (oo.K != null) {
             e.inputRawVideo(textureBuffe1, str, 1, false);
          }else if(p3 && oo.X != null){
             b = true;
          }else {
             b = false;
          }
          e.inputRawVideo(textureBuffe1, str, b);
       }else if(textureBuffe1 != null){
          p0.release();
       }
       return;
    }
    public void onScreencastStopped(){
       if (PatchProxy.applyVoid(null, this, o.class, "184")) {
          return;
       }
       this.a(a0.a);
       return;
    }
    public final void p(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "4")) {
          return;
       }
       o tS = this.S;
       this.z = (tS != null && (tS.isValid() && this.S.mUseStannis == null))? AryaManager.getInstance().createAryaWithOutAudioEngine(this.T): AryaManager.getInstance().createArya(this.T);
       this.q();
       Arya$InitParam initParam = new Arya$InitParam();
       initParam.enableWebSocket = true;
       this.z.init(objArray, new o$a(this, this.L.getLooper()), new o$b(this, objArray), initParam);
       Arya$AryaConfig uAryaConfig = new Arya$AryaConfig();
       o tu = this.u;
       uAryaConfig.appId = tu.mAppId;
       uAryaConfig.appToken = tu.mAppToken;
       uAryaConfig.appUserId = tu.mUserId;
       uAryaConfig.appName = tu.mAppName;
       uAryaConfig.appVersion = tu.mAppVersion;
       uAryaConfig.enableVideoRequest = true;
       uAryaConfig.dumpEnableFlag = tu.dumpEnableFlag;
       uAryaConfig.dumpPath = tu.dumpPath;
       uAryaConfig.enableNeedleLog = tu.mEnableNeedleLog;
       uAryaConfig.enableOpenApi = tu.mEnableOpenApi;
       uAryaConfig.enableDebugMode = tu.mEnableDebugMode;
       uAryaConfig.enableUseTexture = true;
       uAryaConfig.videoEnableCrop = true;
       uAryaConfig.userNetworkType = tu.userNetworkType;
       uAryaConfig.deviceId = tu.mDeviceId;
       uAryaConfig.httpRequestTimeout = tu.httpRequestTimeout;
       uAryaConfig.httpRetryCount = tu.httpRetryCount;
       uAryaConfig.enableNetState = tu.enableNetState;
       uAryaConfig.activeSpeakerForceNotifyInterval = tu.activeSpeakerForceNotifyInterval;
       this.a(uAryaConfig);
       this.z.updateConfig(uAryaConfig);
       r or = new r(this);
       this.t = or;
       or.a();
       this.z.startBroadcastObserver();
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, o.class, "193")) {
          return;
       }
       o tz = this.z;
       if (tz != null) {
          tz.pause();
       }
       return;
    }
    public int pauseAllEffects(){
       Object obj = PatchProxy.apply(null, this, o.class, "150");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.p.a();
    }
    public int pauseAllPlayAudio(){
       Object obj = PatchProxy.apply(null, this, o.class, "162");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.q.a();
    }
    public int pauseAllRemoteVideoStreams(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.c(p0);
    }
    public int pauseAudioMixing(){
       Object obj = PatchProxy.apply(null, this, o.class, "132");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.o.b();
    }
    public int pauseEffect(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "147");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.p.a(p0);
    }
    public int pauseFileStream(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "170");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.l.b(p0);
    }
    public int pauseVideoRecording(){
       o obj = PatchProxy.apply(null, this, o.class, "190");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.z;
       if (obj == null) {
          return -1;
       }
       obj.pauseLiveRecording();
       return 0;
    }
    public int playAudioEffect(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "146");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.p.a(p0, p1);
    }
    public int preloadAudioEffect(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "153");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.p.d(p0);
    }
    public int pushExternalRawAudioFrame(RtcEngineAudioFrame p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "111");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.i.a(p0);
    }
    public boolean pushExternalRawVideoFrame(RtcEngineVideoFrame p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "114");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.j.a(p0);
    }
    public final void q(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "5")) {
          return;
       }
       if (!Aegon.f()) {
          Log.i("RtcEngineImpl", "Aegon init start");
          Aegon.d(this.T, "{}", this.u.dumpPath, objArray);
          Aegon.i(false);
          Aegon.j(new o$3(this), true);
          Aegon.c();
          Log.i("RtcEngineImpl", "Aegon init done");
       }else {
          Aegon.c();
       }
       return;
    }
    public final boolean r(){
       Object obj = PatchProxy.apply(null, this, o.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       try{
          if ((this.T.getPackageManager().getPackageInfo(this.T.getPackageName(), i).packageName).equals("com.smile.video.aryademo")) {
             return true;
          }
       }catch(android.content.pm.PackageManager$NameNotFoundException e1){
          e1.printStackTrace();
       }
       return i;
    }
    public void registerAudioFrameObserver(AryaRawAudioFrameObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "208")) {
          return;
       }
       this.C.a(p0);
       return;
    }
    public int registerMediaFrameObserver(IMediaFrameObserver p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oo, "108");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineImpl", "registerMediaFrameObserver "+p1);
       return this.t.a(p0, p1);
    }
    public void removeHandler(IRtcEngineEventHandler p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "12")) {
          return;
       }
       if (this.c.containsKey(p0)) {
          this.c.remove(p0);
       }
       return;
    }
    public int removePublishStreamUrl(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "83");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.B.b(p0, p1);
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, o.class, "192")) {
          return;
       }
       o tz = this.z;
       if (tz != null) {
          tz.resume();
       }
       return;
    }
    public int resumeAllEffects(){
       Object obj = PatchProxy.apply(null, this, o.class, "151");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.p.b();
    }
    public int resumeAllPlayAudio(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oo, "163");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.q.a(p0);
    }
    public int resumeAllRemoteVideoStreams(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.d(p0);
    }
    public int resumeAudioMixing(){
       Object obj = PatchProxy.apply(null, this, o.class, "133");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.o.c();
    }
    public int resumeEffect(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "148");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.p.b(p0);
    }
    public int resumeFileStream(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "171");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.l.c(p0);
    }
    public int resumeVideoRecording(){
       o obj = PatchProxy.apply(null, this, o.class, "191");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.z;
       if (obj == null) {
          return -1;
       }
       obj.resumeLiveRecording();
       return 0;
    }
    public final void s(){
       if (PatchProxy.applyVoid(null, this, o.class, "8")) {
          return;
       }
       if (this.g == null && this.P == null) {
          System.currentTimeMillis();
          KCameraEngine$KCameraEngineConfig kCameraEngin = new KCameraEngine$KCameraEngineConfig();
          o tU = this.U;
          if (tU != null) {
             kCameraEngin.mContext = tU.mContext;
             kCameraEngin.mCaptureWidth = tU.mCaptureWidth;
             kCameraEngin.mCaptureHeight = tU.mCaptureHeight;
             kCameraEngin.mCaptureFps = tU.mCaptureFps;
             kCameraEngin.mCaptureTexture = tU.mCaptureTexture;
             kCameraEngin.mRetryOpenCameraWhenDisconnet = tU.mRetryOpenCameraWhenDisconnet;
             kCameraEngin.mUseFrontCamera = tU.mUseFrontCamera;
             kCameraEngin.mCaptureScreen = tU.mCaptureScreen;
             kCameraEngin.orientationMode = tU.orientationMode;
             kCameraEngin.mMediaProjection = tU.mMediaProjection;
          }else {
             boolean b = true;
             if (this.V != null) {
                tU = this.W;
                if (tU != null) {
                   kCameraEngin.mCaptureScreen = b;
                   kCameraEngin.mMediaProjection = tU;
                }
             }
             kCameraEngin.mContext = this.T;
             kCameraEngin.mCaptureTexture = b;
             kCameraEngin.mRetryOpenCameraWhenDisconnet = false;
             kCameraEngin.mUseFrontCamera = b;
             this.b(kCameraEngin);
          }
          Log.i("RtcEngineImpl", "initAndStartCamera config:"+kCameraEngin.toString());
          if (this.g == null) {
             this.g = KCameraEngine.create(kCameraEngin);
          }
          this.g.addCaptureCallback(this);
          this.g.addCameraErrorCallback(this);
       }
       return;
    }
    public int seekFileStreamToMs(String p0,long p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, oo, "172");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.l.a(p0, p1);
    }
    public int sendStreamMessage(int p0,byte[] p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oo, "179");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.y.a(p0, p1);
    }
    public int sendStreamMessage(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "180");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.z.broadcastToOtherParticipants(p0);
       return 0;
    }
    public int sendStreamMessageV3(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "181");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.z.broadcastToOtherParticipantsV3(p0);
       return 0;
    }
    public int setAVSyncSource(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "79");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f.a(p0, p1);
    }
    public int setAudioEffectsVolume(float p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, oo, "157");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.p.a(p0);
    }
    public int setAudioFocusUser(ArrayList p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "144");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.a(p0);
    }
    public int setAudioMixingPitch(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "142");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.o.e(p0);
    }
    public int setAudioMixingPosition(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "141");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.o.d(p0);
    }
    public int setAudioProfile(int p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oo, "127");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.o.b(p0, p1);
       return 0;
    }
    public int setAudioRecvRange(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "198");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.A.c(p0);
    }
    public int setAudioTeamId(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "196");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.A.a(p0);
    }
    public int setAudioTeamMode(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "199");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.A.d(p0);
    }
    public int setAudioTunnel(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "197");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.A.b(p0);
    }
    public int setAudioVoiceRoleOption(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "126");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.n.c(p0);
    }
    public void setBeautyEffectOptions(boolean p0,RtcEngine$FaceBeautyOptions p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oo, "107")) {
          return;
       }
       Log.i("RtcEngineImpl", "setBeautyEffectOptions enable:"+p0+", options:"+p1.toString());
       oo = this.g;
       if (oo != null) {
          oo.setBeautyEffectOptions(p0, p1);
       }
       return;
    }
    public int setCameraAutoFocusFaceModeEnabled(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oo, "89");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineImpl", "setCameraAutoFocusFaceModeEnabled "+p0);
       oo = this.g;
       int i = (oo != null)? oo.setCameraAutoFocusFaceModeEnabled(p0): -1;
       return i;
    }
    public int setCameraCaptureConfiguration(KCameraCapturerConfiguration p0){
       b obj = PatchProxy.applyOneRefs(p0, this, o.class, "84");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineImpl", "setCameraCaptureConfiguration");
       obj = new b();
       obj.cameraDirection = p0.cameraDirection;
       o tg = this.g;
       int i = (tg != null)? tg.setCameraCapturerConfiguration(obj): -1;
       return i;
    }
    public int setCameraTorchOn(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oo, "88");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineImpl", "setCameraTorchOn "+p0);
       oo = this.g;
       int i = (oo != null)? oo.setCameraTorchOn(p0): -1;
       return i;
    }
    public float setCameraZoomFactor(float p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, oo, "86");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       Log.i("RtcEngineImpl", "setCameraZoomFactor");
       oo = this.g;
       p0 = (oo != null)? oo.setCameraZoomFactor(p0): 0xbf800000;
       return p0;
    }
    public int setClientRole(String p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oo, "74");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.f.a(p0, p1);
    }
    public int setDefaultAudioRouteToSpeakerphone(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oo, "117");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineImpl", "setDefaultAudioRouteToSpeakerphone "+p0);
       this.J = p0;
       return 0;
    }
    public int setDefaultMuteAllRemoteAudioStreams(){
       Object obj = PatchProxy.apply(null, this, o.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.p();
    }
    public int setDefaultMuteAllRemoteVideoStreams(){
       Object obj = PatchProxy.apply(null, this, o.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.e();
    }
    public int setDefaultUnmuteAllRemoteAudioStreams(){
       Object obj = PatchProxy.apply(null, this, o.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.q();
    }
    public int setDefaultUnmuteAllRemoteVideoStreams(){
       Object obj = PatchProxy.apply(null, this, o.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.f();
    }
    public int setEnableAudioMusicMode(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oo, "145");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.d.a(p0);
    }
    public void setEnableMonitorDebug(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "235")) {
          return;
       }
       this.z.setEnableMonitorDebug(p0);
       return;
    }
    public void setEnableRecordAutoResume(boolean p0,int p1,int p2){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, o.class, "234")) {
          return;
       }
       this.z.setEnableRecordAutoResume(p0, p1, p2);
       return;
    }
    public void setExternalRawVideoSource(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "113")) {
          return;
       }
       this.P = p0;
       if (p0 && this.g != null) {
          Log.i("RtcEngineImpl", "setExternalRawVideoSource destroy camera");
          this.g.destroy();
          this.g = null;
       }
       this.j.a(p0);
       return;
    }
    public int setHrtfModelPath(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "205");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.A.a(p0);
    }
    public int setInEarMonitoringVolume(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "123");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.m.a(p0);
    }
    public int setLiveTranscoding(String p0,LiveTranscoding p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "80");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.B.a(p0, p1);
    }
    public int setLocalPublishFallbackOption(String p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oo, "69");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.e.d(p0, p1);
       return 0;
    }
    public int setLocalRenderMode(int p0,int p1){
       Iterator obj;
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oo, "99");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineImpl", "setLocalRenderMode "+p0+" mirror "+p1);
       oo = this.E;
       if (oo != null) {
          obj = oo.iterator();
          while (obj.hasNext()) {
             KVideoCanvas remoteRender = obj.next().remoteRenderView;
             remoteRender.setMirrorMode(p1);
             remoteRender.setVideoScaleMode(p0);
          }
          return 0;
       }else {
          return -1;
       }
    }
    public int setLocalVoiceChanger(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "124");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.n.a(p0);
    }
    public int setLocalVoiceReverbPreset(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "125");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.n.b(p0);
    }
    public void setMixedAudioFrameParameters(int p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oo, "211")) {
          return;
       }
       this.C.a(p0, p1);
       return;
    }
    public int setMuteRemote(boolean p0,boolean p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, oo, "233");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.z.setMuteRemote(p0, p1);
       return 0;
    }
    public int setParameters(String p0){
       o obj = PatchProxy.applyOneRefs(p0, this, o.class, "218");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.z;
       if (obj != null) {
          return obj.setParameters(p0);
       }
       return 0;
    }
    public void setPlaybackAudioFrameParameters(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, o.class, "210")) {
          return;
       }
       this.C.b(p0, p1, p2, p3);
       return;
    }
    public int setProperty(String p0,int p1,int p2){
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, o.class, "228");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.z.setProperty(p0, p1, p2);
       return 0;
    }
    public int setProperty(String p0,String p1,int p2){
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, o.class, "227");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.z.setProperty(p0, p1, p2);
       return 0;
    }
    public void setRecordingAudioFrameParameters(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, o.class, "209")) {
          return;
       }
       this.C.a(p0, p1, p2, p3);
       return;
    }
    public void setRecordingRawAudioFrameParameters(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, o.class, "212")) {
          return;
       }
       this.C.c(p0, p1, p2, p3);
       return;
    }
    public int setRemoteDefaultVideoStreamType(String p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oo, "67");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.e.b(p0, p1);
       return 0;
    }
    public int setRemoteRenderMode(int p0,int p1){
       Iterator obj;
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oo, "101");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineImpl", "setRemoteRenderMode render "+p0+" mirror "+p1);
       oo = this.F;
       if (oo == null) {
          return -1;
       }else {
          obj = oo.keySet().iterator();
          while (obj.hasNext()) {
             Iterator iterator = this.F.get(obj.next()).iterator();
             while (iterator.hasNext()) {
                RtcEngineRenderView rtcEngineRen = iterator.next();
                rtcEngineRen.setMirrorMode(p1);
                rtcEngineRen.setVideoScaleMode(p0);
             }
          }
          return 0;
       }
    }
    public int setRemoteRenderMode(String p0,String p1,int p2,int p3){
       o obj;
       if (PatchProxy.isSupport(o.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, o.class, "100");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineImpl", "setRemoteRenderMode "+p1+" ch "+p0+" rend "+p2+" mirror "+p3);
       obj = this.F;
       if (obj == null) {
          return -1;
       }else {
          Iterator iterator = obj.keySet().iterator();
          int i = 0;
          while (iterator.hasNext()) {
             String str = iterator.next();
             Object[] objArray = new Object[2];
             objArray[i] = p1;
             objArray[1] = p0;
             if (str.contains(String.format("%s-%s", objArray))) {
                Iterator iterator1 = this.F.get(str).iterator();
                while (iterator1.hasNext()) {
                   RtcEngineRenderView rtcEngineRen = iterator1.next();
                   rtcEngineRen.setMirrorMode(p3);
                   rtcEngineRen.setVideoScaleMode(p2);
                }
             }
          }
          return i;
       }
    }
    public int setRemoteSubscribeFallbackOption(String p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oo, "68");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.e.c(p0, p1);
       return 0;
    }
    public int setRemoteVideoStreamType(String p0,String p1,int p2){
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, o.class, "66");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.e.a(p0, p1, p2);
       return 0;
    }
    public int setRxStreamMixerGain(String p0,boolean p1,float p2){
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Float.valueOf(p2), this, o.class, "143");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.d.a(p0, p1, p2);
    }
    public int setVideoEncoderConfiguration(String p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oo, "49");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.e.a(p0, p1);
    }
    public int setVideoEncoderConfiguration(String p0,RtcEngine$VideoEncoderConfiguration p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.R = p1;
       return this.e.a(p0, p1);
    }
    public int setVocalBgmDelay(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "128");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.o.f(p0);
       return 0;
    }
    public int setVolumeOfEffect(String p0,double p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, oo, "160");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.p.a(p0, p1);
    }
    public int startAudioMixing(AudioMixingParam p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "129");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.o.a(p0);
    }
    public int startAudioRecording(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "174");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.s.a(p0);
    }
    public int startAudioRecording(int p0,int p1,int p2){
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, o.class, "175");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.s.a(p0, p1, p2);
    }
    public int startAudioRecording(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "176");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.s.a(p0);
    }
    public int startFileStream(String p0,ArrayList p1,RtcEngineFileStreamingConfig p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, o.class, "168");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.l.a(p0, p1, p2);
    }
    public int startPlayAudio(String p0,String p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, o.class, "166");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.r.a(p0, p1, p2, p3);
    }
    public int startPlayAudio(String p0,byte[] p1,float p2,boolean p3){
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Boolean.valueOf(p3), this, o.class, "161");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.q.a(p0, p1, p2, p3);
    }
    public int startPreview(){
       o obj = PatchProxy.apply(null, this, o.class, "103");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineImpl", "startPreview localVideoModuleEnabled:"+this.O);
       int i = -1;
       if (this.O == null) {
          return i;
       }
       this.s();
       System.currentTimeMillis();
       obj = this.g;
       if (obj != null) {
          i = obj.startPreview();
       }
       return i;
    }
    public int startPushImage(String p0,Bitmap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineImpl", "startPushImage channelId:"+p0);
       return this.e.a(p0, p1);
    }
    public int startScreenCapture(String p0,MediaProjection p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineImpl", "startScreenCapture with channelId:"+p0+" and mediaProjection:"+p1);
       this.X = true;
       this.a(p1);
       this.z.startAudioInnerCap(p1);
       return this.f.b(p0);
    }
    public int startVideoRecording(String p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oo, "188");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       oo = this.z;
       if (oo != null) {
          if (p1) {
             if (p1 == 1) {
                oo.startLiveRecordingForAudioMix(p0, new o$6(this), 1280);
                return 0;
             }
          }else {
             oo.startLiveRecording(p0, new o$5(this));
             return 0;
          }
       }
       return -1;
    }
    public int stopAllAudioEffects(){
       Object obj = PatchProxy.apply(null, this, o.class, "152");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.p.c();
    }
    public int stopAudioMixing(){
       Object obj = PatchProxy.apply(null, this, o.class, "131");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.o.a();
    }
    public int stopAudioRecording(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "177");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.s.b(p0);
    }
    public int stopEffect(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "149");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.p.c(p0);
    }
    public int stopFileStream(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "169");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.l.a(p0);
    }
    public int stopLiveTranscoding(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.B.a(p0);
    }
    public int stopPlayAudio(){
       Object obj = PatchProxy.apply(null, this, o.class, "167");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.r.a();
    }
    public int stopPreview(){
       o obj = PatchProxy.apply(null, this, o.class, "104");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineImpl", "stopPreview localVideoModuleEnabled:"+this.O);
       int i = -1;
       if (this.O == null) {
          return i;
       }
       System.currentTimeMillis();
       obj = this.g;
       if (obj != null) {
          i = obj.stopPreview();
       }
       return i;
    }
    public int stopPushImage(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "76");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineImpl", "stopPushImage channelId:"+p0);
       return this.e.g(p0);
    }
    public int stopScreenCapture(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "78");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineImpl", "stopScreenCapture with channelId:"+p0);
       this.X = false;
       this.t();
       this.z.stopInnerCap();
       return this.f.c(p0);
    }
    public int stopVideoRecording(){
       o obj = PatchProxy.apply(null, this, o.class, "189");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.z;
       if (obj == null) {
          return -1;
       }
       obj.stopLiveRecording(new o$7(this));
       return 0;
    }
    public void subscribeRemoteScreenCapture(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "62")) {
          return;
       }
       this.e.c(p0, p1);
       return;
    }
    public void subscribeRemoteVideoStream(String p0,ArrayList p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "60")) {
          return;
       }
       this.e.a(p0, p1);
       return;
    }
    public int subscribeRemoteVideoStreamByDefault(){
       Object obj = PatchProxy.apply(null, this, o.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.g();
    }
    public int switchCamera(){
       o obj = PatchProxy.apply(null, this, o.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineImpl", "switchCamera localVideoModuleEnabled:"+this.O);
       int i = -1;
       if (this.O == null) {
          return i;
       }
       System.currentTimeMillis();
       obj = this.g;
       if (obj != null) {
          i = obj.switchCamera();
       }
       if (!i) {
          this.Q = this.Q ^ 0x01;
       }
       return i;
    }
    public final int t(){
       o obj = PatchProxy.apply(null, this, o.class, "106");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineImpl", "stopCaptureScreen");
       obj = this.h;
       if (obj != null) {
          obj.stopPreview();
          this.h.destroy();
          this.h = null;
       }
       return 0;
    }
    public final void u(){
       if (PatchProxy.applyVoid(null, this, o.class, "219")) {
          return;
       }
       this.G.a(Integer.valueOf(0), Integer.valueOf(1));
       this.G.a(Integer.valueOf(1), Integer.valueOf(2));
       this.G.a(Integer.valueOf(1), Integer.valueOf(3));
       this.G.a(Integer.valueOf(2), Integer.valueOf(0));
       return;
    }
    public int unbindAllLocalVideoViews(){
       Object obj = PatchProxy.apply(null, this, o.class, "94");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineImpl", "unbindAllLocalVideoViews");
       this.E.clear();
       return 0;
    }
    public int unbindAllRemoteVideoViews(String p0,String p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "97");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{p1,p0};
       p0 = String.format("%s-%s", obj);
       Iterator iterator = this.F.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (str.startsWith(p0)) {
             this.F.remove(str);
          }
       }
       return 0;
    }
    public int unbindAllRemoteVideoViews(String p0,String p1,int p2){
       Object[] obj;
       if (PatchProxy.isSupport(o.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, o.class, "98");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = new Object[]{p1,p0,Integer.valueOf(p2)};
       p0 = String.format("%s-%s-%d", obj);
       Iterator iterator = this.F.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (str.startsWith(p0)) {
             this.F.remove(str);
          }
       }
       return 0;
    }
    public int unbindLocalVideoView(KVideoCanvas p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "93");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineImpl", "unbindLocalVideoView userId:"+p0.userId+", channelId:"+p0.channelId+", surfaceView:"+p0.remoteRenderView+", render:"+p0.remoteRenderView.getRenderer());
       this.E.remove(p0);
       return 0;
    }
    public int unbindRemoteVideoView(KVideoCanvas p0){
       KVideoCanvas obj = PatchProxy.applyOneRefs(p0, this, o.class, "96");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineImpl", "unBindRemoteVideoView userId:"+p0.userId+", channelId:"+p0.channelId+", surfaceView:"+p0.remoteRenderView+", render:"+p0.remoteRenderView.getRenderer());
       obj = p0.remoteRenderView;
       int i = -1;
       if (obj == null) {
          return i;
       }
       if (!obj instanceof RtcEngineRenderView) {
          return i;
       }
       Object[] objArray = new Object[]{p0.userId,p0.channelId,Integer.valueOf(p0.sourceType)};
       String str = String.format("%s-%s-%d", objArray);
       if (this.F.containsKey(str)) {
          this.F.get(str).remove(p0.remoteRenderView);
          if (!this.F.get(str).size()) {
             this.F.remove(str);
          }
       }
       return 0;
    }
    public int unloadAllAudioEffects(){
       Object obj = PatchProxy.apply(null, this, o.class, "155");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.p.d();
    }
    public int unloadEffect(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "154");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.p.e(p0);
    }
    public int unmuteAllRemoteAudioStreams(){
       Object obj = PatchProxy.apply(null, this, o.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.m();
    }
    public int unmuteAllRemoteAudioStreams(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.b(p0);
    }
    public int unmuteAudioEffects(){
       Object obj = PatchProxy.apply(null, this, o.class, "159");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.p.g();
    }
    public int unmuteAudioMixing(){
       Object obj = PatchProxy.apply(null, this, o.class, "138");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.o.e();
    }
    public int unmuteLocalAudioStream(){
       Object obj = PatchProxy.apply(null, this, o.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v.c(false);
       return this.d.g();
    }
    public int unmuteLocalVideoStream(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.w.c(false);
       return this.e.b(p0);
    }
    public int unmuteRecordingSignal(){
       Object obj = PatchProxy.apply(null, this, o.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v.c(false);
       return this.d.i();
    }
    public int unmuteRemoteAudioStream(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.b(p0, p1);
    }
    public int unmuteRemoteVideoStream(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.b(p0, p1);
    }
    public int unmuteSpeaker(){
       Object obj = PatchProxy.apply(null, this, o.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.o();
    }
    public void unsubscribeRemoteScreenCapture(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "63")) {
          return;
       }
       this.e.d(p0, p1);
       return;
    }
    public void unsubscribeRemoteVideoStream(String p0,ArrayList p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "61")) {
          return;
       }
       this.e.b(p0, p1);
       return;
    }
    public int unsubscribeRemoteVideoStreamByDefault(){
       Object obj = PatchProxy.apply(null, this, o.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.h();
    }
    public boolean updateAudioMixingLocalIndex(int p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oo, "130");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.o.a(p0, p1);
    }
    public int updateSelfPosition(int[] p0,float[] p1,float[] p2,float[] p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, o.class, "200");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.A.a(p0, p1, p2, p3);
    }
    public final void v(){
       if (PatchProxy.applyVoid(null, this, o.class, "220")) {
          return;
       }
       this.H.a(Integer.valueOf(0), Integer.valueOf(1));
       this.H.a(Integer.valueOf(1), Integer.valueOf(2));
       this.H.a(Integer.valueOf(1), Integer.valueOf(3));
       this.H.a(Integer.valueOf(2), Integer.valueOf(0));
       return;
    }
}
