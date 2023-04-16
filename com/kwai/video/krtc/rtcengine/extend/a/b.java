package com.kwai.video.krtc.rtcengine.extend.a.b;
import com.kwai.video.krtc.rtcengine.extend.RtcEngineExt;
import com.kwai.video.krtc.rtcengine.RtcEngineConfig;
import com.kwai.video.krtc.rtcengine.internal.RtcEngineInnerSetting;
import com.kwai.video.krtc.rtcengine.internal.o;
import com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.rtcengine.extend.a.a;
import com.kwai.video.krtc.rtcengine.internal.z;
import com.kwai.video.krtc.rtcengine.internal.x;
import com.kwai.video.krtc.rtcengine.extend.a.d;
import com.kwai.video.krtc.rtcengine.extend.a.c;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import com.kwai.video.krtc.observers.RawAudioObserver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.krtc.observers.AudioSceneObserver;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.rtcengine.VideoWatermark;
import com.kwai.video.krtc.rtcengine.camera.KVideoCanvas;
import com.kwai.video.krtc.rtcengine.DataStreamConfig;
import com.kwai.video.krtc.rtcengine.RtcEngine$DirectorConfig;
import com.kwai.video.krtc.observers.AryaLogObserver;
import java.lang.Boolean;
import android.media.projection.MediaProjection;
import com.kwai.video.krtc.rtcengine.RtcEngineHttpRequestContext;
import com.kwai.video.krtc.observers.IRtcEngineHttpObserver;
import com.kwai.video.krtc.Arya$SignalingMessageInfo;
import java.lang.Long;
import android.graphics.Bitmap;
import com.kwai.video.krtc.rtcengine.RtcEngineAudioFrame;
import com.kwai.video.krtc.rtcengine.JoinChannelParam;
import com.kwai.video.krtc.rtcengine.RtcEngine$JoinChannelSignalParam;
import com.kwai.video.krtc.observers.ConnectivityObserver;
import com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import com.kwai.video.krtc.observers.AryaRawAudioFrameObserver;
import com.kwai.video.krtc.observers.CustomVideoDataObserver;
import com.kwai.video.krtc.rtcengine.IMediaFrameObserver;
import com.kwai.video.krtc.observers.AryaQosObserver;
import com.kwai.video.krtc.rtcengine.extend.RtcEngineExt$RtcEngineAudioEffectParam;
import com.kwai.video.stannis.Stannis$KWStannisAudioEffectParam;
import java.lang.Float;
import java.util.ArrayList;
import com.kwai.video.krtc.rtcengine.RtcEngine$FaceBeautyOptions;
import com.kwai.video.krtc.rtcengine.camera.KCameraCapturerConfiguration;
import com.kwai.video.krtc.rtcengine.camera.KCameraEngine$KCameraEngineConfig;
import com.kwai.video.krtc.rtcengine.extend.RtcEngineExt$RtcEngineVideoEncodeParameter;
import com.kwai.video.krtc.Arya$KWAryaVideoEncodeParameter;
import com.kwai.video.krtc.rtcengine.LiveTranscoding;
import com.kwai.video.krtc.rtcengine.RtcEngine$VideoEncoderConfiguration;
import java.lang.Double;
import com.kwai.video.krtc.rtcengine.AudioMixingParam;
import com.kwai.video.krtc.rtcengine.RtcEngineFileStreamingConfig;
import com.kwai.video.krtc.rtcengine.extend.a.b$1;
import com.kwai.video.krtc.observers.AudioMixerObserver;
import rv7.a;
import com.kwai.video.krtc.rtcengine.internal.z$a;
import com.kwai.video.krtc.observers.AryaResultObserver;
import com.kwai.video.krtc.QosInfo;
import com.kwai.video.krtc.rtcengine.RtcEngine$Layout;
import java.nio.ByteBuffer;
import com.kwai.video.krtc.rtcengine.extend.a.b$2;

public class b extends RtcEngineExt	// class@000859
{
    public RtcEngineConfig a;
    public o b;
    public x c;
    public a d;
    public Arya e;
    public d f;
    public c g;

    public void b(RtcEngineConfig p0,RtcEngineInnerSetting p1){
       super();
       o oo = new o(p0, p1);
       this.b = oo;
       this.e = oo.a();
       this.a = p0;
       this.d = new a(p0, this.b);
       this.c = new x(this.e, this.b);
       this.f = new d(this.e, this.b);
       this.g = new c(this.e);
    }
    public static o a(b p0){
       return p0.b;
    }
    public static void a(int p0,IRtcEngineEventHandler p1){
       p1.onPlayAudioFinished(p0, 5);
    }
    public void addAudioBypassDataObserver(RawAudioObserver p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "289")) {
          return;
       }
       this.e.addAudioBypassDataObserver(p0, p1);
       return;
    }
    public int addAudioMixTrack(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "283");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.e.addMixTrack(p0);
       return 0;
    }
    public void addAudioSceneObserver(AudioSceneObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "239")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "addAudioSceneObserver observer:"+p0);
       this.e.addAudioSceneObserver(p0);
       return;
    }
    public void addHandler(IRtcEngineEventHandler p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.b.addHandler(p0);
       return;
    }
    public int addPublishStreamUrl(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "91");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.addPublishStreamUrl(p0, p1);
    }
    public int addVideoWatermark(VideoWatermark p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "115");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.addVideoWatermark(p0);
    }
    public int adjustAudioMixingPlayoutVolume(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "135");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.adjustAudioMixingPlayoutVolume(p0);
    }
    public int adjustAudioMixingPublishVolume(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "136");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.adjustAudioMixingPublishVolume(p0);
    }
    public int adjustAudioMixingVolume(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "134");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.adjustAudioMixingVolume(p0);
    }
    public int adjustPlaybackVolume(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "31");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.adjustPlaybackVolume(p0);
    }
    public int adjustRecordingVolume(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "30");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.adjustRecordingVolume(p0);
    }
    public int adjustUserPlaybackVolume(String p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "32");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.adjustUserPlaybackVolume(p0, p1);
    }
    public int bindLocalVideoView(KVideoCanvas p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "213");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.bindLocalVideoView(p0);
    }
    public int bindRemoteVideoView(KVideoCanvas p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "216");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.bindRemoteVideoView(p0);
    }
    public void changeCapturerFormat(int p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "261")) {
          return;
       }
       this.b.a(p0, p1, p2);
       return;
    }
    public int clearAllPlayAudio(){
       Object obj = PatchProxy.apply(null, this, b.class, "165");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.clearAllPlayAudio();
    }
    public int clearPlayAudio(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "164");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.clearPlayAudio(p0);
    }
    public int clearVideoWatermarks(){
       Object obj = PatchProxy.apply(null, this, b.class, "116");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.clearVideoWatermarks();
    }
    public int createDataStream(String p0,int p1,DataStreamConfig p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, b.class, "177");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.createDataStream(p0, p1, p2);
    }
    public int createScene(RtcEngine$DirectorConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.a(p0);
    }
    public void destroyInstance(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.b.destroyInstance();
       RtcEngineExt.setLogCb(null);
       return;
    }
    public int destroyScene(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.c.a(p0);
    }
    public int disableAttenuation(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "207");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.disableAttenuation(p0);
    }
    public int disableAudio(){
       Object obj = PatchProxy.apply(null, this, b.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.disableAudio();
    }
    public int disableAudioVolumeIndication(){
       Object obj = PatchProxy.apply(null, this, b.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.disableAudioVolumeIndication();
    }
    public void disableCaeProcess(){
       if (PatchProxy.applyVoid(null, this, b.class, "309")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "disableCaeProcess");
       this.e.setEnableCaeProcess(false);
       return;
    }
    public void disableDeepAEC(){
       if (PatchProxy.applyVoid(null, this, b.class, "312")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "disableDeepAEC");
       this.e.setEnableDeepAEC(false);
       return;
    }
    public int disableDeepDenoise(){
       Object obj = PatchProxy.apply(null, this, b.class, "297");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineExtImpl", "disableDeepDenoise");
       this.e.setEnableDeepDenoise(false);
       return false;
    }
    public int disableDeepNs(){
       Object obj = PatchProxy.apply(null, this, b.class, "248");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineExtImpl", "disableDeepNs");
       this.e.setEnableDeepNs(false, "");
       return false;
    }
    public int disableDenoise(){
       Object obj = PatchProxy.apply(null, this, b.class, "225");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineExtImpl", "disableDenoise");
       return this.b.disableDenoise();
    }
    public int disableDualStreamMode(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "78");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.disableDualStreamMode(p0);
    }
    public int disableExternalRawAudioSource(){
       Object obj = PatchProxy.apply(null, this, b.class, "110");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.disableExternalRawAudioSource();
    }
    public int disableInEarMonitoring(){
       Object obj = PatchProxy.apply(null, this, b.class, "122");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.disableInEarMonitoring();
    }
    public void disableLastmileTest(){
       if (PatchProxy.applyVoid(null, this, b.class, "210")) {
          return;
       }
       this.b.disableLastmileTest();
       return;
    }
    public int disableLocalAudio(){
       Object obj = PatchProxy.apply(null, this, b.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.disableLocalAudio();
    }
    public int disableLocalAudioComfortableNoise(){
       Object obj = PatchProxy.apply(null, this, b.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.disableLocalAudioComfortableNoise();
    }
    public int disableLocalVideo(){
       Object obj = PatchProxy.apply(null, this, b.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.disableLocalVideo();
    }
    public int disableNoiseSuppression(){
       Object obj = PatchProxy.apply(null, this, b.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.disableNoiseSuppression();
    }
    public void disablePushCustomVideoData(){
       if (PatchProxy.applyVoid(null, this, b.class, "269")) {
          return;
       }
       this.e.disablePushCustomVideoData();
       return;
    }
    public int disableRangeAudio(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "193");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.disableRangeAudio(p0);
    }
    public int disableRemotePriority(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "84");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.disableRemotePriority(p0);
    }
    public int disableReplaceImageInnerMix(){
       Object obj = PatchProxy.apply(null, this, b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.f();
    }
    public int disableRequestAudioFocus(){
       Object obj = PatchProxy.apply(null, this, b.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.disableRequestAudioFocus();
    }
    public int disableSpatializer(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "195");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.disableSpatializer(p0);
    }
    public int disableSpeakerInputAEC(){
       Object obj = PatchProxy.apply(null, this, b.class, "237");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineExtImpl", "disableSpeakerInputAEC");
       this.e.setEnableSpeakerInputAEC(false);
       return false;
    }
    public int disableSpeakerphone(){
       Object obj = PatchProxy.apply(null, this, b.class, "119");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.disableSpeakerphone();
    }
    public int disableUsingBuiltinMic(){
       Object obj = PatchProxy.apply(null, this, b.class, "227");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineExtImpl", "disableUsingBuiltinMic");
       this.e.setUsingBuiltinMic(false);
       return false;
    }
    public int disableVideo(){
       Object obj = PatchProxy.apply(null, this, b.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.disableVideo();
    }
    public int disableVideoInnerMix(){
       Object obj = PatchProxy.apply(null, this, b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.d();
    }
    public int disableVideoMix(){
       Object obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.b.l();
       return this.c.b();
    }
    public int enableAttenuation(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "206");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.enableAttenuation(p0);
    }
    public int enableAudio(){
       Object obj = PatchProxy.apply(null, this, b.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.enableAudio();
    }
    public int enableAudioVolumeIndication(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, b.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.enableAudioVolumeIndication(p0, p1, p2);
    }
    public void enableCaeProcess(){
       if (PatchProxy.applyVoid(null, this, b.class, "308")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "enableCaeProcess");
       this.e.setEnableCaeProcess(true);
       return;
    }
    public int enableCaptureScreen(boolean p0,MediaProjection p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, uob, "22");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.a(p0, p1);
    }
    public void enableDeepAEC(){
       if (PatchProxy.applyVoid(null, this, b.class, "311")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "enableDeepAEC");
       this.e.setEnableDeepAEC(true);
       return;
    }
    public int enableDeepDenoise(){
       Object obj = PatchProxy.apply(null, this, b.class, "296");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineExtImpl", "enableDeepDenoise");
       this.e.setEnableDeepDenoise(true);
       return 0;
    }
    public int enableDeepNs(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "247");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineExtImpl", "enableDeepNs file:"+p0);
       this.e.setEnableDeepNs(true, p0);
       return 0;
    }
    public int enableDenoise(){
       Object obj = PatchProxy.apply(null, this, b.class, "224");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineExtImpl", "enableDenoise");
       return this.b.enableDenoise();
    }
    public int enableDualStreamMode(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.enableDualStreamMode(p0);
    }
    public int enableExternalRawAudioSource(){
       Object obj = PatchProxy.apply(null, this, b.class, "109");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.enableExternalRawAudioSource();
    }
    public int enableHrtf(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "208");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.enableHrtf(p0);
    }
    public int enableInEarMonitoring(){
       Object obj = PatchProxy.apply(null, this, b.class, "121");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.enableInEarMonitoring();
    }
    public void enableLastmileTest(){
       if (PatchProxy.applyVoid(null, this, b.class, "209")) {
          return;
       }
       this.b.enableLastmileTest();
       return;
    }
    public int enableLocalAudio(){
       Object obj = PatchProxy.apply(null, this, b.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.enableLocalAudio();
    }
    public int enableLocalAudioComfortableNoise(){
       Object obj = PatchProxy.apply(null, this, b.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.enableLocalAudioComfortableNoise();
    }
    public int enableLocalVideo(){
       Object obj = PatchProxy.apply(null, this, b.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.enableLocalVideo();
    }
    public int enableNoiseSuppression(){
       Object obj = PatchProxy.apply(null, this, b.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.enableNoiseSuppression();
    }
    public void enablePushCustomVideoData(){
       if (PatchProxy.applyVoid(null, this, b.class, "268")) {
          return;
       }
       this.e.enablePushCustomVideoData();
       return;
    }
    public int enableRangeAudio(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "192");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.enableRangeAudio(p0);
    }
    public int enableRemotePriority(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "83");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.enableRemotePriority(p0, p1);
    }
    public int enableReplaceImageInnerMix(){
       Object obj = PatchProxy.apply(null, this, b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.e();
    }
    public int enableRequestAudioFocus(){
       Object obj = PatchProxy.apply(null, this, b.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.enableRequestAudioFocus();
    }
    public int enableSpatializer(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "194");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.enableSpatializer(p0);
    }
    public int enableSpeakerInputAEC(){
       Object obj = PatchProxy.apply(null, this, b.class, "236");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineExtImpl", "enableSpeakerInputAEC");
       this.e.setEnableSpeakerInputAEC(true);
       return 0;
    }
    public int enableSpeakerphone(){
       Object obj = PatchProxy.apply(null, this, b.class, "118");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.enableSpeakerphone();
    }
    public int enableUsingBuiltinMic(){
       Object obj = PatchProxy.apply(null, this, b.class, "226");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineExtImpl", "enableUsingBuiltinMic");
       this.e.setUsingBuiltinMic(true);
       return 0;
    }
    public int enableVideo(){
       Object obj = PatchProxy.apply(null, this, b.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.enableVideo();
    }
    public int enableVideoInnerMix(){
       Object obj = PatchProxy.apply(null, this, b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.c();
    }
    public int enableVideoMix(){
       Object obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.b.k();
       return this.c.a();
    }
    public int executeHttpRequest(RtcEngineHttpRequestContext p0,IRtcEngineHttpObserver p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "223");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineExtImpl", "executeHttpRequest url:"+p0.url);
       return this.g.a(p0, p1);
    }
    public int[] getAllAudioOutputTypes(){
       Object obj = PatchProxy.apply(null, this, b.class, "231");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getAllAudioOutputTypes();
    }
    public int getAudioMixingCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, b.class, "212");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.getAudioMixingCurrentPosition();
    }
    public int getAudioMixingDuration(){
       Object obj = PatchProxy.apply(null, this, b.class, "211");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.getAudioMixingDuration();
    }
    public int getAudioMixingPlayoutVolume(){
       Object obj = PatchProxy.apply(null, this, b.class, "139");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.getAudioMixingPlayoutVolume();
    }
    public int getAudioMixingPublishVolume(){
       Object obj = PatchProxy.apply(null, this, b.class, "140");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.getAudioMixingPublishVolume();
    }
    public int getAudioOutputType(){
       Object obj = PatchProxy.apply(null, this, b.class, "230");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.getAudioOutputType();
    }
    public float getCameraMaxZoomFactor(){
       Object obj = PatchProxy.apply(null, this, b.class, "96");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.b.getCameraMaxZoomFactor();
    }
    public double getEffectsVolume(){
       Object obj = PatchProxy.apply(null, this, b.class, "156");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return this.b.getEffectsVolume();
    }
    public int getNetworkQualityScore(){
       Object obj = PatchProxy.apply(null, this, b.class, "254");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.getNetworkQualityScore();
    }
    public Arya$SignalingMessageInfo getSignalMessageInfo(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "265");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getSignalMessageInfo(p0);
    }
    public float[] getSongSectionScore(){
       Object obj = PatchProxy.apply(null, this, b.class, "306");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.i("RtcEngineExtImpl", "getSongSectionScore");
       return this.e.getSongSectionScore();
    }
    public int getSpeakerDeviceVolume(){
       Object obj = PatchProxy.apply(null, this, b.class, "232");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.getSpeakerDeviceVolume();
    }
    public int getVoiceEnergy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "264");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.getVoiceEnergy(p0);
    }
    public void inputAudioTrackData(int p0,byte[] p1,int p2,int p3,int p4,long p5){
       b uob = this;
       b uob1 = b.class;
       if (PatchProxy.isSupport(uob1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Long.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uob1, "285")) {
             return;
          }
       }
       uob.e.inputTrackData(p0, p1, p2, p3, p4, p5);
       return;
    }
    public int inputImageToSource(Bitmap p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "19");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.c.a(p0, p1);
    }
    public void inputPlayAudioBuffer(byte[] p0,int p1,int p2,int p3,long p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uob, "243")) {
             return;
          }
       }
       this.e.inputPcmPlay(p0, p1, p2, p3, p4);
       return;
    }
    public int inputSpeakerAudio(RtcEngineAudioFrame p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "112");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.inputSpeakerAudio(p0);
    }
    public boolean isCameraTorchSupported(){
       Object obj = PatchProxy.apply(null, this, b.class, "100");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isCameraTorchSupported();
    }
    public boolean isCameraZoomSupported(){
       Object obj = PatchProxy.apply(null, this, b.class, "99");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isCameraZoomSupported();
    }
    public boolean isFileStreamStarted(){
       Object obj = PatchProxy.apply(null, this, b.class, "173");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isFileStreamStarted();
    }
    public boolean isSpeakerphoneEnabled(){
       Object obj = PatchProxy.apply(null, this, b.class, "120");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isSpeakerphoneEnabled();
    }
    public boolean isSupportHeadphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, b.class, "291");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isSupportHeadphoneMonitor();
    }
    public int joinChannel(JoinChannelParam p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.joinChannel(p0);
    }
    public int joinChannel(RtcEngine$JoinChannelSignalParam p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.a(p0);
    }
    public int leaveChannel(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "86");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.leaveChannel(p0);
    }
    public int muteAllRemoteAudioStreams(){
       Object obj = PatchProxy.apply(null, this, b.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.muteAllRemoteAudioStreams();
    }
    public int muteAllRemoteAudioStreams(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.muteAllRemoteAudioStreams(p0);
    }
    public int muteAudioEffects(){
       Object obj = PatchProxy.apply(null, this, b.class, "158");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.muteAudioEffects();
    }
    public int muteAudioMixing(){
       Object obj = PatchProxy.apply(null, this, b.class, "137");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.muteAudioMixing();
    }
    public int muteLocalAudioStream(){
       Object obj = PatchProxy.apply(null, this, b.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.muteLocalAudioStream();
    }
    public int muteLocalVideoStream(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.muteLocalVideoStream(p0);
    }
    public int muteRecordingSignal(){
       Object obj = PatchProxy.apply(null, this, b.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.muteRecordingSignal();
    }
    public int muteRemoteAudioStream(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.muteRemoteAudioStream(p0, p1);
    }
    public int muteRemoteVideoStream(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.muteRemoteVideoStream(p0, p1);
    }
    public int muteSpeaker(){
       Object obj = PatchProxy.apply(null, this, b.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.muteSpeaker();
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, b.class, "203")) {
          return;
       }
       this.b.onBackground();
       return;
    }
    public void onForeground(){
       if (PatchProxy.applyVoid(null, this, b.class, "202")) {
          return;
       }
       this.b.onForeground();
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, b.class, "204")) {
          return;
       }
       this.b.pause();
       return;
    }
    public int pauseAllEffects(){
       Object obj = PatchProxy.apply(null, this, b.class, "150");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.pauseAllEffects();
    }
    public int pauseAllPlayAudio(){
       Object obj = PatchProxy.apply(null, this, b.class, "162");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.pauseAllPlayAudio();
    }
    public int pauseAllRemoteVideoStreams(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.pauseAllRemoteVideoStreams(p0);
    }
    public int pauseAudioDevice(){
       Object obj = PatchProxy.apply(null, this, b.class, "277");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.e.pauseStannis();
       return 0;
    }
    public int pauseAudioMixing(){
       Object obj = PatchProxy.apply(null, this, b.class, "132");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.pauseAudioMixing();
    }
    public int pauseEffect(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "147");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.pauseEffect(p0);
    }
    public int pauseFileStream(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "170");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.pauseFileStream(p0);
    }
    public int pauseVideoRecording(){
       Object obj = PatchProxy.apply(null, this, b.class, "183");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.pauseVideoRecording();
    }
    public int playAudioEffect(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "146");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.playAudioEffect(p0, p1);
    }
    public int postReceivedSignalingJson(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.a(p0, p1, p2);
    }
    public int postReceivedSignalingMessage(String p0,String p1,byte[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.a(p0, p1, p2);
    }
    public int preloadAudioEffect(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "153");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.preloadAudioEffect(p0);
    }
    public void probeConnectivity(String p0,int p1,int p2,ConnectivityObserver p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, b.class, "255")) {
          return;
       }
       this.e.probeConnectivity(p0, p1, p2, p3);
       return;
    }
    public void pushCustomVideoData(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "270")) {
          return;
       }
       this.e.pushCustomVideoData(p0);
       return;
    }
    public int pushExternalRawAudioFrame(RtcEngineAudioFrame p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "111");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.pushExternalRawAudioFrame(p0);
    }
    public boolean pushExternalRawVideoFrame(RtcEngineVideoFrame p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "114");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.pushExternalRawVideoFrame(p0);
    }
    public boolean pushExternalRawVideoFrame(RtcEngineVideoFrame p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "27");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.b.a(p0, p1);
    }
    public void registerAudioFrameObserver(AryaRawAudioFrameObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "197")) {
          return;
       }
       this.b.registerAudioFrameObserver(p0);
       return;
    }
    public void registerCustomVideoDataObserver(CustomVideoDataObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "266")) {
          return;
       }
       this.b.a(p0);
       return;
    }
    public int registerMediaFrameObserver(IMediaFrameObserver p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "108");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.registerMediaFrameObserver(p0, p1);
    }
    public void registerQosCallback(AryaQosObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "256")) {
          return;
       }
       this.b.a(p0);
       return;
    }
    public int rejoinChannel(RtcEngine$JoinChannelSignalParam p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.b(p0);
    }
    public void removeAllAudioBypassDataObserver(){
       if (PatchProxy.applyVoid(null, this, b.class, "290")) {
          return;
       }
       this.e.removeAllAudioBypassDataObserver();
       return;
    }
    public int removeAudioMixTrack(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "284");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.e.removeMixTrack(p0);
       return 0;
    }
    public void removeAudioSceneObserver(AudioSceneObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "240")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "removeAudioSceneObserver observer:"+p0);
       this.e.removeAudioSceneObserver(p0);
       return;
    }
    public void removeHandler(IRtcEngineEventHandler p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       this.b.removeHandler(p0);
       return;
    }
    public int removePublishStreamUrl(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "92");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.removePublishStreamUrl(p0, p1);
    }
    public void resetPlayAudio(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "244")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "resetPlayAudio type:"+p0);
       if (p0 == 1) {
          this.e.resetPcmPlay();
       }
       return;
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, b.class, "205")) {
          return;
       }
       this.b.resume();
       return;
    }
    public int resumeAllEffects(){
       Object obj = PatchProxy.apply(null, this, b.class, "151");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.resumeAllEffects();
    }
    public int resumeAllPlayAudio(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "163");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.resumeAllPlayAudio(p0);
    }
    public int resumeAllRemoteVideoStreams(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.resumeAllRemoteVideoStreams(p0);
    }
    public int resumeAudioDevice(){
       Object obj = PatchProxy.apply(null, this, b.class, "278");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.e.resumeStannis();
       return 0;
    }
    public int resumeAudioMixing(){
       Object obj = PatchProxy.apply(null, this, b.class, "133");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.resumeAudioMixing();
    }
    public int resumeEffect(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "148");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.resumeEffect(p0);
    }
    public int resumeFileStream(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "171");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.resumeFileStream(p0);
    }
    public int resumeVideoRecording(){
       Object obj = PatchProxy.apply(null, this, b.class, "184");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.resumeVideoRecording();
    }
    public int seekFileStreamToMs(String p0,long p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, uob, "172");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.seekFileStreamToMs(p0, p1);
    }
    public int sendMediaMetadataData(byte[] p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "253");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p1 == 1 || !p1) {
          this.e.sendMediaMetadataData(p0, p1);
       }else {
          this.e.insertDataInLiveStream(p0);
       }
       return 0;
    }
    public int sendStreamMessage(int p0,byte[] p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, "178");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.sendStreamMessage(p0, p1);
    }
    public int sendStreamMessage(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "179");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.sendStreamMessage(p0);
    }
    public int sendStreamMessageV3(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "180");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.sendStreamMessageV3(p0);
    }
    public int setAVSyncSource(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "88");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.setAVSyncSource(p0, p1);
    }
    public int setAgcMode(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "234");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineExtImpl", "setAgcMode:"+p0);
       this.e.setAgcMode(p0);
       return 0;
    }
    public int setAsMainSourceOfScene(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "13");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.c.b(p0, p1);
    }
    public void setAudioEffectParam(boolean p0,RtcEngineExt$RtcEngineAudioEffectParam p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "299")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "setAudioEffectParam:"+p0);
       Stannis$KWStannisAudioEffectParam kWStannisAud = new Stannis$KWStannisAudioEffectParam();
       kWStannisAud.KWReverbSpace = p1.reverbSpace;
       kWStannisAud.KWPreDelay = p1.preDelay;
       kWStannisAud.KWReverbTime = p1.reverbTime;
       kWStannisAud.KWReverbDamping = p1.reverbDamping;
       kWStannisAud.KWReverbInputBandWidth = p1.reverbInputBandWidth;
       kWStannisAud.KWDryLevel = p1.dryLevel;
       kWStannisAud.KWEarlyLevel = p1.earlyLevel;
       kWStannisAud.KWTaiLevel = p1.tailLevel;
       kWStannisAud.KWCompressorRatio = p1.compressorRatio;
       kWStannisAud.KWCompressorThreshold = p1.compressorThreshold;
       kWStannisAud.KWCompressorAttackMs = p1.compressorAttackMs;
       kWStannisAud.KWCompressorReleaseMs = p1.compressorReleaseMs;
       kWStannisAud.KWCompressorGain = p1.compressorGain;
       kWStannisAud.KWCompressorKneeWidth = p1.compressorKneeWidth;
       kWStannisAud.KWEnableDeesser = p1.enableDeesser;
       kWStannisAud.KWDeesserThreshold = p1.deesserThreshold;
       kWStannisAud.KWDeesserRatio = p1.deesserRatio;
       kWStannisAud.KWEnableAutoTune = p1.enableAutoTune;
       kWStannisAud.KWAutoTuneTonic = p1.autoTuneTonic;
       kWStannisAud.KWAutoTuneScale = p1.autoTuneScale;
       kWStannisAud.KWEnableHarmony = p1.enableHarmony;
       kWStannisAud.KWHarmonyTonality = p1.harmonyTonality;
       kWStannisAud.KWHarmonyMode = p1.harmonyMode;
       kWStannisAud.KWHarmonyTimbre = p1.harmonyTimbre;
       kWStannisAud.KWHarmonyIsChorus = p1.harmonyIsChorus;
       kWStannisAud.KWHarmonyRatio = p1.harmonyRatio;
       kWStannisAud.KWEnableEcho = p1.enableEcho;
       kWStannisAud.KWEchoPingpong = p1.echoPingPong;
       kWStannisAud.KWEchoBpm = p1.echoBpm;
       kWStannisAud.KWEchoBeatsPerMeasure = p1.echoBeatsPerMeasure;
       kWStannisAud.KWEchoWetDecay = p1.echoWetDecay;
       kWStannisAud.KWEchoFeedbackDecay = p1.echoFeedbackDecay;
       kWStannisAud.KWEchoWetGain = p1.echoWetGain;
       kWStannisAud.KWEnableReverb = p1.enableReverb;
       kWStannisAud.KWEnableAutoMix = p1.enableAutoMix;
       kWStannisAud.KWMainTrackGain = p1.mainTrackGain;
       kWStannisAud.KWSendTrackGain = p1.sendTrackGain;
       kWStannisAud.KWEnableEnsemble = p1.enableEnsemble;
       kWStannisAud.KWEnableSaturation = p1.enableSaturation;
       kWStannisAud.KWSaturationDriveLevel = p1.saturationDriveLevel;
       int i = 0;
       for (int i1 = 0; i1 < 10; i1 = i1 + 1) {
          kWStannisAud.KWEqualizerGain[i1] = p1.equalizerGain[i1];
          kWStannisAud.KWEqualizerSendTrackGain[i1] = p1.equalizerSendTrackGain[i1];
          kWStannisAud.KWSaturationEqualizerLhcGain[i1] = p1.saturationEqualizerLhcGain[i1];
          kWStannisAud.KWSaturationEqualizerHcGain[i1] = p1.saturationEqualizerHcGain[i1];
       }
       for (i1 = 0; i1 < 3; i1 = i1 + 1) {
          kWStannisAud.KWEnsembleRatio[i1] = p1.ensembleRatio[i1];
       }
       for (i1 = 0; i1 < 4; i1 = i1 + 1) {
          kWStannisAud.KWEnsembleDelayTime[i1] = p1.ensembleDelayTime[i1];
          kWStannisAud.KWEnsembleWidth[i1] = p1.ensembleWidth[i1];
          kWStannisAud.KWEnsembleLfofreq[i1] = p1.ensembleLfofreq[i1];
       }
       RtcEngineExt$RtcEngineAudioEffectParam midiLength = p1.midiLength;
       while (i < midiLength) {
          kWStannisAud.KWHarmonyMidi[i] = p1.harmonyMidi[i];
          i = i + 1;
       }
       kWStannisAud.midi_length = midiLength;
       this.e.setAudioEffectParam(p0, kWStannisAud);
       return;
    }
    public int setAudioEffectsVolume(float p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uob, "157");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setAudioEffectsVolume(p0);
    }
    public int setAudioFocusUser(ArrayList p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "144");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.setAudioFocusUser(p0);
    }
    public int setAudioLowDelayMode(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "235");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineExtImpl", "setAudioLowDelayMode:"+p0);
       this.e.setAudioLowDelayMode(p0);
       return 0;
    }
    public int setAudioMixingPitch(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "142");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setAudioMixingPitch(p0);
    }
    public int setAudioMixingPosition(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "141");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setAudioMixingPosition(p0);
    }
    public void setAudioOutputType(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "229")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "setAudioOutputType:"+p0);
       this.e.setAudioOutputType(p0);
       return;
    }
    public void setAudioPreProcessVolume(float p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "300")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "setAudioPreProcessVolume:"+p0);
       this.e.setAudioPreProcessVolume(p0);
       return;
    }
    public int setAudioProfile(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "127");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setAudioProfile(p0, p1);
    }
    public int setAudioRecvRange(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "189");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setAudioRecvRange(p0);
    }
    public int setAudioTeamId(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "187");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setAudioTeamId(p0);
    }
    public int setAudioTeamMode(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "190");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setAudioTeamMode(p0);
    }
    public int setAudioTunnel(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "188");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setAudioTunnel(p0);
    }
    public int setAudioVoiceRoleOption(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "126");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setAudioVoiceRoleOption(p0);
    }
    public void setBeautyEffectOptions(boolean p0,RtcEngine$FaceBeautyOptions p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "107")) {
          return;
       }
       this.b.setBeautyEffectOptions(p0, p1);
       return;
    }
    public void setCaeModelPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "307")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "setCaeModelPath:"+p0);
       this.e.setCaeModelPath(p0);
       return;
    }
    public int setCameraAutoFocusFaceModeEnabled(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "98");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setCameraAutoFocusFaceModeEnabled(p0);
    }
    public int setCameraCaptureConfiguration(KCameraCapturerConfiguration p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "93");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.setCameraCaptureConfiguration(p0);
    }
    public void setCameraParams(KCameraEngine$KCameraEngineConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "104")) {
          return;
       }
       this.b.a(p0);
       return;
    }
    public int setCameraTorchOn(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "97");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setCameraTorchOn(p0);
    }
    public float setCameraZoomFactor(float p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uob, "95");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this.b.setCameraZoomFactor(p0);
    }
    public int setClientRole(String p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "87");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setClientRole(p0, p1);
    }
    public void setCommentStreamAudioPts(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "273")) {
          return;
       }
       this.e.setCommentStreamAudioPts(p0);
       return;
    }
    public void setCommentStreamId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "274")) {
          return;
       }
       this.e.setCommentStreamId(p0);
       return;
    }
    public void setCommentStreamVolume(float p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "272")) {
          return;
       }
       this.e.setCommentStreamVolume(p0);
       return;
    }
    public void setDeepAECModelPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "310")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "setDeepAECModelPath:"+p0);
       this.e.setDeepAECModelPath(p0);
       return;
    }
    public int setDeepDenoiseModelPath(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "295");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineExtImpl", "setDeepDenoiseModelPath :"+p0);
       this.e.setDeepDenoiseModelPath(p0);
       return 0;
    }
    public int setDefaultAudioRouteToSpeakerphone(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "117");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setDefaultAudioRouteToSpeakerphone(p0);
    }
    public int setDefaultMuteAllRemoteAudioStreams(){
       Object obj = PatchProxy.apply(null, this, b.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.setDefaultMuteAllRemoteAudioStreams();
    }
    public int setDefaultMuteAllRemoteVideoStreams(){
       Object obj = PatchProxy.apply(null, this, b.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.setDefaultMuteAllRemoteVideoStreams();
    }
    public int setDefaultUnmuteAllRemoteAudioStreams(){
       Object obj = PatchProxy.apply(null, this, b.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.setDefaultUnmuteAllRemoteAudioStreams();
    }
    public int setDefaultUnmuteAllRemoteVideoStreams(){
       Object obj = PatchProxy.apply(null, this, b.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.setDefaultUnmuteAllRemoteVideoStreams();
    }
    public int setEnableAudioMusicMode(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "145");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setEnableAudioMusicMode(p0);
    }
    public void setEnableMonitorDebug(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "314")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "setEnableMonitorDebug enable:"+p0);
       this.e.setEnableMonitorDebug(p0);
       return;
    }
    public void setEnableRecordAutoResume(boolean p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "313")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "setEnableRecordAutoResume resume:"+p0+" detectTimeBySec:"+p1+" target:"+p2);
       this.e.setEnableRecordAutoResume(p0, p1, p2);
       return;
    }
    public void setExternalRawVideoSource(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "113")) {
          return;
       }
       this.b.setExternalRawVideoSource(p0);
       return;
    }
    public int setHowlingSuppressionMode(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "233");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineExtImpl", "setHowlingSuppressionMode:"+p0);
       this.e.setHowlingSuppressionMode(p0);
       return 0;
    }
    public int setHrtfModelPath(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "196");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.setHrtfModelPath(p0);
    }
    public int setInEarMonitoringVolume(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "123");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setInEarMonitoringVolume(p0);
    }
    public int setKtpModelPath(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "293");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.e.setKtpModelPath(p0);
       return 0;
    }
    public int setKtpRtcModelPath(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "294");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.e.setKtpRtcModelPath(p0);
       return 0;
    }
    public void setLiveStreamVideoEncodeParam(RtcEngineExt$RtcEngineVideoEncodeParameter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "315")) {
          return;
       }
       StringBuilder str = "setLiveStreamVideoEncodeParam:";
       String str1 = (p0 == null)? "null": p0.toString();
       Log.i("RtcEngineExtImpl", str+str1);
       Arya$KWAryaVideoEncodeParameter kWAryaVideoE = null;
       if (p0 != null) {
          kWAryaVideoE = new Arya$KWAryaVideoEncodeParameter();
          kWAryaVideoE.width = p0.width;
          kWAryaVideoE.height = p0.height;
          kWAryaVideoE.fps = p0.fps;
          kWAryaVideoE.maxBitrate = p0.maxBitrate;
          kWAryaVideoE.resumeOnRtcStop = p0.resumeOnRtcStop;
       }
       this.e.setLiveStreamVideoEncodeParam(kWAryaVideoE);
       return;
    }
    public int setLiveTranscoding(String p0,LiveTranscoding p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "89");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.setLiveTranscoding(p0, p1);
    }
    public int setLocalPublishFallbackOption(String p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "82");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setLocalPublishFallbackOption(p0, p1);
    }
    public int setLocalRenderMode(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "101");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setLocalRenderMode(p0, p1);
    }
    public int setLocalVoiceChanger(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "124");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setLocalVoiceChanger(p0);
    }
    public int setLocalVoiceReverbPreset(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "125");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setLocalVoiceReverbPreset(p0);
    }
    public void setMixedAudioFrameParameters(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "200")) {
          return;
       }
       this.b.setMixedAudioFrameParameters(p0, p1);
       return;
    }
    public int setMuteRemote(boolean p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "292");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setMuteRemote(p0, p1);
    }
    public int setParameters(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "228");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.setParameters(p0);
    }
    public void setPlayAudioVolume(int p0,float p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, uob, "245")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "setPlayAudioVolume type:"+p0+" volume:"+p1);
       if (p0 == 1) {
          this.e.setPcmPlayVolume(p1);
       }
       return;
    }
    public void setPlaybackAudioFrameParameters(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, b.class, "199")) {
          return;
       }
       this.b.setPlaybackAudioFrameParameters(p0, p1, p2, p3);
       return;
    }
    public int setProperty(String p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "263");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setProperty(p0, p1, p2);
    }
    public int setProperty(String p0,String p1,int p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, b.class, "262");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setProperty(p0, p1, p2);
    }
    public void setRecordingAudioFrameParameters(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, b.class, "198")) {
          return;
       }
       this.b.setRecordingAudioFrameParameters(p0, p1, p2, p3);
       return;
    }
    public void setRecordingRawAudioFrameParameters(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, b.class, "201")) {
          return;
       }
       this.b.setRecordingRawAudioFrameParameters(p0, p1, p2, p3);
       return;
    }
    public int setRemoteDefaultVideoStreamType(String p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "80");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setRemoteDefaultVideoStreamType(p0, p1);
    }
    public int setRemoteRenderMode(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "103");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setRemoteRenderMode(p0, p1);
    }
    public int setRemoteRenderMode(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, b.class, "102");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setRemoteRenderMode(p0, p1, p2, p3);
    }
    public int setRemoteSubscribeFallbackOption(String p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "81");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setRemoteSubscribeFallbackOption(p0, p1);
    }
    public int setRemoteVideoStreamType(String p0,String p1,int p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, b.class, "79");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setRemoteVideoStreamType(p0, p1, p2);
    }
    public void setRotation(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "252")) {
          return;
       }
       this.e.setRotation(p0, p1);
       return;
    }
    public int setRxStreamMixerGain(String p0,boolean p1,float p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Float.valueOf(p2), this, b.class, "143");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setRxStreamMixerGain(p0, p1, p2);
    }
    public int setSceneSourceMixMode(int p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.c.a(p0, p1, p2);
    }
    public void setSongSectionStartEndTime(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "305")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "setSongSectionStartEndTime");
       this.e.setSongSectionStartEndTime(p0);
       return;
    }
    public int setVideoEncoderConfiguration(String p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "62");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setVideoEncoderConfiguration(p0, p1);
    }
    public int setVideoEncoderConfiguration(String p0,RtcEngine$VideoEncoderConfiguration p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.setVideoEncoderConfiguration(p0, p1);
    }
    public int setVideoEncoderConfiguration(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "286");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.e.setVideoMirror(p0);
       return 0;
    }
    public int setVideoMixOutputMode(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "11");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.c.a(p0, p1);
    }
    public int setVideoMixType(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.c.b(p0);
    }
    public int setVocalBgmDelay(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "128");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setVocalBgmDelay(p0);
    }
    public int setVolumeOfEffect(String p0,double p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, uob, "160");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.setVolumeOfEffect(p0, p1);
    }
    public void setWallClockTime(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "246")) {
          return;
       }
       this.e.updateWallClockTime(p0);
       return;
    }
    public void startAudioEngine(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "298")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "startAudioEngine scene:"+p0);
       this.e.startAudioEngine(p0);
       return;
    }
    public boolean startAudioInnerCap(MediaProjection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "250");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.e.startAudioInnerCap(p0);
    }
    public int startAudioMixing(AudioMixingParam p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "129");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.startAudioMixing(p0);
    }
    public int startAudioMixingForMultiTrack(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "281");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int currentAudio = this.e.getCurrentAudioScene();
       b = this.e.checkAudioSceneExclusive(currentAudio, 1280);
       Log.i("RtcEngineExtImpl", "startAudioMixingForMultiTrack currentAudioScene:"+currentAudio+", requestAudioScene:"+1280+", isExclusive:"+b);
       if (b) {
          return -1;
       }
       this.e.tryStartAudioEngineWithScene(currentAudio, 1280);
       this.e.startMultipleStreamMix();
       return 0;
    }
    public int startAudioRecording(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "174");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.startAudioRecording(p0);
    }
    public int startAudioRecording(int p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "238");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineExtImpl", "startAudioRecording type:"+p1+", mode:"+p2);
       return this.b.startAudioRecording(p0, p1, p2);
    }
    public int startAudioRecording(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "175");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.startAudioRecording(p0);
    }
    public int startFileStream(String p0,ArrayList p1,RtcEngineFileStreamingConfig p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "168");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.startFileStream(p0, p1, p2);
    }
    public int startMixRemoteAndLocalAudio(){
       b obj = PatchProxy.apply(null, this, b.class, "185");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.e;
       if (obj == null) {
          return -1;
       }
       obj.startMixRemoteAndLocalAudio(new b$1(this));
       return 0;
    }
    public int startNetSpeedMeasure(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, b.class, "287");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.e.startNetSpeedMeasure(p0, p1, p2, p3);
       return 0;
    }
    public int startPlayAudio(String p0,String p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, b.class, "166");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.startPlayAudio(p0, p1, p2, p3);
    }
    public int startPlayAudio(String p0,byte[] p1,float p2,boolean p3){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Boolean.valueOf(p3), this, b.class, "161");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.startPlayAudio(p0, p1, p2, p3);
    }
    public void startPlayAudio(int p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "241")) {
          return;
       }
       String str = "RtcEngineExtImpl";
       Log.i(str, "startPlayAudio type:"+p0);
       int currentAudio = this.e.getCurrentAudioScene();
       b = this.e.checkAudioSceneExclusive(currentAudio, 1280);
       Log.i(str, "startPlayAudio currentAudioScene:"+currentAudio+", requestAudioScene:"+1280+", isExclusive:"+b);
       if (b) {
          this.b.b(new a(p0));
          return;
       }else {
          this.e.tryStartAudioEngineWithScene(currentAudio, 1280);
          if (p0 == 1) {
             this.e.startPcmPlay();
          }
          return;
       }
    }
    public int startPreview(){
       Object obj = PatchProxy.apply(null, this, b.class, "105");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.startPreview();
    }
    public int startPushImage(String p0,Bitmap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "275");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.startPushImage(p0, p1);
    }
    public int startScreenCapture(String p0,MediaProjection p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.startScreenCapture(p0, p1);
    }
    public void startScreencast(String p0,int p1,int p2,int p3,int p4,int p5){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uob, "259")) {
             return;
          }
       }
       this.e.startScreencast(p0, p1, p2, p3, p4, p5);
       return;
    }
    public void startSongSectionScore(){
       if (PatchProxy.applyVoid(null, this, b.class, "303")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "startSongSectionScore");
       this.e.startSongSectionScore();
       return;
    }
    public void startSongSectionScoreWorkshop(int p0,byte[] p1,long p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Long.valueOf(p2), this, b.class, "301")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "startSongSectionScoreWorkshop:"+p0);
       this.e.startSongSectionScoreWorkshop(p0, p1, p2);
       return;
    }
    public int startVideoRecording(String p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "181");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.startVideoRecording(p0, p1);
    }
    public int startVideoRecording(String p0,int p1,AryaResultObserver p2){
       b obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, b.class, "279");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.e;
       if (obj != null) {
          if (p1) {
             if (p1 == 1) {
                obj.startLiveRecordingForAudioMix(p0, p2, 1280);
                return 0;
             }
          }else {
             obj.startLiveRecording(p0, p2);
             return 0;
          }
       }
       return -1;
    }
    public int stopAllAudioEffects(){
       Object obj = PatchProxy.apply(null, this, b.class, "152");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.stopAllAudioEffects();
    }
    public int stopAudioMixing(){
       Object obj = PatchProxy.apply(null, this, b.class, "131");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.stopAudioMixing();
    }
    public int stopAudioMixingForMultiTrack(){
       Object obj = PatchProxy.apply(null, this, b.class, "282");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.e.stopMultipleStreamMix();
       return 0;
    }
    public int stopAudioRecording(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "176");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.stopAudioRecording(p0);
    }
    public int stopEffect(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "149");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.stopEffect(p0);
    }
    public int stopFileStream(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "169");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.stopFileStream(p0);
    }
    public void stopInnerCap(){
       if (PatchProxy.applyVoid(null, this, b.class, "251")) {
          return;
       }
       this.e.stopInnerCap();
       return;
    }
    public int stopLiveTranscoding(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "90");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.stopLiveTranscoding(p0);
    }
    public int stopMixRemoteAndLocalAudio(){
       b obj = PatchProxy.apply(null, this, b.class, "186");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.e;
       if (obj == null) {
          return -1;
       }
       obj.stopMixRemoteAndLocalAudio();
       return 0;
    }
    public int stopNetSpeedMeasure(){
       Object obj = PatchProxy.apply(null, this, b.class, "288");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.stopNetSpeedMeasure();
    }
    public int stopPlayAudio(){
       Object obj = PatchProxy.apply(null, this, b.class, "167");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.stopPlayAudio();
    }
    public void stopPlayAudio(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "242")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "stopPlayAudio type:"+p0);
       if (p0 == 1) {
          this.e.stopPcmPlay();
       }
       return;
    }
    public int stopPreview(){
       Object obj = PatchProxy.apply(null, this, b.class, "106");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.stopPreview();
    }
    public int stopPushImage(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "276");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.stopPushImage(p0);
    }
    public int stopScreenCapture(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.stopScreenCapture(p0);
    }
    public void stopScreencast(){
       if (PatchProxy.applyVoid(null, this, b.class, "260")) {
          return;
       }
       this.e.stopScreencast();
       return;
    }
    public void stopSongSectionScore(){
       if (PatchProxy.applyVoid(null, this, b.class, "304")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "stopSongSectionScore");
       this.e.stopSongSectionScore();
       return;
    }
    public void stopSongSectionScoreWorkshop(){
       if (PatchProxy.applyVoid(null, this, b.class, "302")) {
          return;
       }
       Log.i("RtcEngineExtImpl", "stopSongSectionScoreWorkshop");
       this.e.stopSongSectionScoreWorkshop();
       return;
    }
    public int stopVideoRecording(){
       Object obj = PatchProxy.apply(null, this, b.class, "182");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.stopVideoRecording();
    }
    public int stopVideoRecording(AryaResultObserver p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "280");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.e.stopLiveRecording(p0);
       return 0;
    }
    public void subscribeRemoteScreenCapture(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "75")) {
          return;
       }
       this.b.subscribeRemoteScreenCapture(p0, p1);
       return;
    }
    public void subscribeRemoteVideoStream(String p0,ArrayList p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "73")) {
          return;
       }
       this.b.subscribeRemoteVideoStream(p0, p1);
       return;
    }
    public int subscribeRemoteVideoStreamByDefault(){
       Object obj = PatchProxy.apply(null, this, b.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.subscribeRemoteVideoStreamByDefault();
    }
    public QosInfo summaryQosInfo(){
       Object obj = PatchProxy.apply(null, this, b.class, "258");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getQosInfo();
    }
    public int switchCamera(){
       Object obj = PatchProxy.apply(null, this, b.class, "94");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.switchCamera();
    }
    public void switchVoicePartyBusinessScene(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "271")) {
          return;
       }
       this.e.switchVoicePartyBusinessScene(p0);
       return;
    }
    public void unRegisterCustomVideoDataObserver(){
       if (PatchProxy.applyVoid(null, this, b.class, "267")) {
          return;
       }
       this.b.a(null);
       return;
    }
    public int unbindAllLocalVideoViews(){
       Object obj = PatchProxy.apply(null, this, b.class, "215");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.unbindAllLocalVideoViews();
    }
    public int unbindAllRemoteVideoViews(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "218");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.unbindAllRemoteVideoViews(p0, p1);
    }
    public int unbindAllRemoteVideoViews(String p0,String p1,int p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, b.class, "219");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.b.unbindAllRemoteVideoViews(p0, p1, p2);
    }
    public int unbindLocalVideoView(KVideoCanvas p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "214");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.unbindLocalVideoView(p0);
    }
    public int unbindRemoteVideoView(KVideoCanvas p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "217");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.unbindRemoteVideoView(p0);
    }
    public int unloadAllAudioEffects(){
       Object obj = PatchProxy.apply(null, this, b.class, "155");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.unloadAllAudioEffects();
    }
    public int unloadEffect(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "154");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.unloadEffect(p0);
    }
    public int unmuteAllRemoteAudioStreams(){
       Object obj = PatchProxy.apply(null, this, b.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.unmuteAllRemoteAudioStreams();
    }
    public int unmuteAllRemoteAudioStreams(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.unmuteAllRemoteAudioStreams(p0);
    }
    public int unmuteAudioEffects(){
       Object obj = PatchProxy.apply(null, this, b.class, "159");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.unmuteAudioEffects();
    }
    public int unmuteAudioMixing(){
       Object obj = PatchProxy.apply(null, this, b.class, "138");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.unmuteAudioMixing();
    }
    public int unmuteLocalAudioStream(){
       Object obj = PatchProxy.apply(null, this, b.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.unmuteLocalAudioStream();
    }
    public int unmuteLocalVideoStream(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.unmuteLocalVideoStream(p0);
    }
    public int unmuteRecordingSignal(){
       Object obj = PatchProxy.apply(null, this, b.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.unmuteRecordingSignal();
    }
    public int unmuteRemoteAudioStream(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.unmuteRemoteAudioStream(p0, p1);
    }
    public int unmuteRemoteVideoStream(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.unmuteRemoteVideoStream(p0, p1);
    }
    public int unmuteSpeaker(){
       Object obj = PatchProxy.apply(null, this, b.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.unmuteSpeaker();
    }
    public void unregisterQosCallback(){
       if (PatchProxy.applyVoid(null, this, b.class, "257")) {
          return;
       }
       this.b.a(null);
       return;
    }
    public void unsubscribeRemoteScreenCapture(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "76")) {
          return;
       }
       this.b.unsubscribeRemoteScreenCapture(p0, p1);
       return;
    }
    public void unsubscribeRemoteVideoStream(String p0,ArrayList p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "74")) {
          return;
       }
       this.b.unsubscribeRemoteVideoStream(p0, p1);
       return;
    }
    public int unsubscribeRemoteVideoStreamByDefault(){
       Object obj = PatchProxy.apply(null, this, b.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.unsubscribeRemoteVideoStreamByDefault();
    }
    public boolean updateAudioMixingLocalIndex(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "130");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.b.updateAudioMixingLocalIndex(p0, p1);
    }
    public int updateLayoutAndResolutionForScene(int p0,RtcEngine$Layout[] p1,int p2,int p3,ByteBuffer p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, uob, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineExtImpl", "updateLayoutAndResolutionForScene sceneId:"+p0+" "+p2+" x "+p3);
       return this.c.a(p0, p1, p2, p3, p4, null);
    }
    public int updateLayoutAndResolutionForScene(int p0,RtcEngine$Layout[] p1,int p2,int p3,ByteBuffer p4,ByteBuffer p5){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),p4,p5};
          Object obj = PatchProxy.apply(objArray, this, uob, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineExtImpl", "updateLayoutAndResolutionForSceneWithSei sceneId:"+p0+" "+p2+" x "+p3);
       return this.c.a(p0, p1, p2, p3, p4, p5);
    }
    public int updateLayoutForScene(int p0,RtcEngine$Layout[] p1,ByteBuffer p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, b.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.c.a(p0, p1, p2);
    }
    public int updateSelfPosition(int[] p0,float[] p1,float[] p2,float[] p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "191");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.updateSelfPosition(p0, p1, p2, p3);
    }
    public int videoRecordingLastPeriod(String p0){
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "249");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.e;
       if (obj == null) {
          return -1;
       }
       obj.saveMoments(p0, new b$2(this));
       return 0;
    }
    public int websocketClose(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "221");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineExtImpl", "websocketClose websocketId:"+p0);
       return this.f.a(p0);
    }
    public int websocketOpen(int p0,String p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, "220");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineExtImpl", "websocketOpen websocketId:"+p0+", url:"+p1);
       return this.f.a(p0, p1);
    }
    public int websocketSend(int p0,byte[] p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, "222");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineExtImpl", "websocketSend websocketId:"+p0+", length"+p1.length);
       return this.f.a(p0, p1);
    }
}
