package com.kwai.video.krtc.rtcengine.extend.RtcEngineExt;
import com.kwai.video.krtc.rtcengine.RtcEngine;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaManager$LogParam;
import com.kwai.video.krtc.rtcengine.internal.q;
import com.kwai.video.krtc.observers.AryaLogObserver;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.rtcengine.extend.RtcEngineExt$1;
import com.kwai.video.krtc.a;
import com.kwai.video.krtc.rtcengine.RtcEngineConfig;
import com.kwai.video.krtc.rtcengine.internal.RtcEngineInnerSetting;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.krtc.rtcengine.extend.a.b;
import android.content.Context;
import com.kwai.video.krtc.AryaManager;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import com.kwai.video.krtc.observers.RawAudioObserver;
import com.kwai.video.krtc.observers.AudioSceneObserver;
import com.kwai.video.krtc.rtcengine.RtcEngine$DirectorConfig;
import android.media.projection.MediaProjection;
import com.kwai.video.krtc.rtcengine.RtcEngineHttpRequestContext;
import com.kwai.video.krtc.observers.IRtcEngineHttpObserver;
import com.kwai.video.krtc.Arya$SignalingMessageInfo;
import android.graphics.Bitmap;
import com.kwai.video.krtc.rtcengine.RtcEngine$JoinChannelSignalParam;
import com.kwai.video.krtc.observers.ConnectivityObserver;
import com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import com.kwai.video.krtc.observers.CustomVideoDataObserver;
import com.kwai.video.krtc.observers.AryaQosObserver;
import com.kwai.video.krtc.rtcengine.extend.RtcEngineExt$RtcEngineAudioEffectParam;
import com.kwai.video.krtc.rtcengine.camera.KCameraEngine$KCameraEngineConfig;
import com.kwai.video.krtc.rtcengine.extend.RtcEngineExt$RtcEngineVideoEncodeParameter;
import com.kwai.video.krtc.observers.AryaResultObserver;
import com.kwai.video.krtc.QosInfo;
import com.kwai.video.krtc.rtcengine.RtcEngine$Layout;
import java.nio.ByteBuffer;

public abstract class RtcEngineExt extends RtcEngine	// class@000855
{
    public static b mInstance;

    public void RtcEngineExt(){
       super();
    }
    public static void applyLogParam(){
       if (PatchProxy.applyVoid(null, null, RtcEngineExt.class, "10")) {
          return;
       }
       AryaManager$LogParam logParam = new AryaManager$LogParam();
       logParam.filePath = q.a();
       logParam.logLevel = q.c();
       logParam.maxFileSize = q.b();
       logParam.maxFileNum = q.d();
       logParam.logCb = q.e();
       logParam.isConsoleEnable = q.f();
       logParam.isFileEnable = TextUtils.isEmpty(logParam.filePath) ^ 0x01;
       Log.setLogParam(logParam);
       a.a(logParam, new RtcEngineExt$1(logParam));
       return;
    }
    public static RtcEngineExt createInstance(RtcEngineConfig p0,RtcEngineInnerSetting p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RtcEngineExt.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(p0, p1);
    }
    public static synchronized void destroy(){
       _monitor_enter(RtcEngineExt.class);
       if (PatchProxy.applyVoid(null, null, RtcEngineExt.class, "2")) {
          _monitor_exit(RtcEngineExt.class);
          return;
       }else {
          b mInstance = RtcEngineExt.mInstance;
          if (mInstance != null) {
             mInstance.destroyInstance();
             RtcEngineExt.mInstance = null;
          }
          _monitor_exit(RtcEngineExt.class);
          return;
       }
    }
    public static String getDeviceId(Context p0){
       p0 = PatchProxy.applyOneRefs(p0, null, RtcEngineExt.class, "11");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return AryaManager.getInstanceId();
    }
    public static int setLogCb(AryaLogObserver p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RtcEngineExt.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       q.a(p0);
       RtcEngineExt.applyLogParam();
       return 0;
    }
    public static int setLogEnableConsole(boolean p0){
       RtcEngineExt rtcEngineExt = RtcEngineExt.class;
       if (PatchProxy.isSupport(rtcEngineExt)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, rtcEngineExt, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       q.a(p0);
       RtcEngineExt.applyLogParam();
       return 0;
    }
    public static int setLogFile(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RtcEngineExt.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       q.a(p0);
       RtcEngineExt.applyLogParam();
       return 0;
    }
    public static int setLogFileNum(int p0){
       RtcEngineExt rtcEngineExt = RtcEngineExt.class;
       if (PatchProxy.isSupport(rtcEngineExt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, rtcEngineExt, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       q.c(p0);
       RtcEngineExt.applyLogParam();
       return 0;
    }
    public static int setLogFileSize(int p0){
       RtcEngineExt rtcEngineExt = RtcEngineExt.class;
       if (PatchProxy.isSupport(rtcEngineExt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, rtcEngineExt, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       q.b(p0);
       RtcEngineExt.applyLogParam();
       return 0;
    }
    public static int setLogLevel(int p0){
       RtcEngineExt rtcEngineExt = RtcEngineExt.class;
       if (PatchProxy.isSupport(rtcEngineExt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, rtcEngineExt, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       q.a(p0);
       RtcEngineExt.applyLogParam();
       return 0;
    }
    public static synchronized RtcEngineExt sharedInstance(RtcEngineConfig p0,RtcEngineInnerSetting p1){
       _monitor_enter(RtcEngineExt.class);
       b obj = PatchProxy.applyTwoRefs(p0, p1, null, RtcEngineExt.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(RtcEngineExt.class);
          return obj;
       }else {
          obj = RtcEngineExt.mInstance;
          if (obj == null) {
             RtcEngineExt.mInstance = new b(p0, p1);
          }else if(p0 != null){
             p0 = p0.mHandler;
             if (p0 != null) {
                obj.addHandler(p0);
             }
          }
          _monitor_exit(RtcEngineExt.class);
          return RtcEngineExt.mInstance;
       }
    }
    public abstract void addAudioBypassDataObserver(RawAudioObserver p0,int p1);
    public abstract int addAudioMixTrack(int p0);
    public abstract void addAudioSceneObserver(AudioSceneObserver p0);
    public abstract void changeCapturerFormat(int p0,int p1,int p2);
    public abstract int createScene(RtcEngine$DirectorConfig p0);
    public abstract int destroyScene(int p0);
    public abstract void disableCaeProcess();
    public abstract void disableDeepAEC();
    public abstract int disableDeepDenoise();
    public abstract int disableDeepNs();
    public abstract int disableDenoise();
    public abstract void disablePushCustomVideoData();
    public abstract int disableReplaceImageInnerMix();
    public abstract int disableSpeakerInputAEC();
    public abstract int disableUsingBuiltinMic();
    public abstract int disableVideoInnerMix();
    public abstract int disableVideoMix();
    public abstract void enableCaeProcess();
    public abstract int enableCaptureScreen(boolean p0,MediaProjection p1);
    public abstract void enableDeepAEC();
    public abstract int enableDeepDenoise();
    public abstract int enableDeepNs(String p0);
    public abstract int enableDenoise();
    public abstract void enablePushCustomVideoData();
    public abstract int enableReplaceImageInnerMix();
    public abstract int enableSpeakerInputAEC();
    public abstract int enableUsingBuiltinMic();
    public abstract int enableVideoInnerMix();
    public abstract int enableVideoMix();
    public abstract int executeHttpRequest(RtcEngineHttpRequestContext p0,IRtcEngineHttpObserver p1);
    public abstract int[] getAllAudioOutputTypes();
    public abstract int getAudioOutputType();
    public abstract Arya$SignalingMessageInfo getSignalMessageInfo(byte[] p0);
    public abstract float[] getSongSectionScore();
    public abstract int getSpeakerDeviceVolume();
    public abstract int getVoiceEnergy(String p0);
    public abstract void inputAudioTrackData(int p0,byte[] p1,int p2,int p3,int p4,long p5);
    public abstract int inputImageToSource(Bitmap p0,int p1);
    public abstract void inputPlayAudioBuffer(byte[] p0,int p1,int p2,int p3,long p4);
    public abstract int joinChannel(RtcEngine$JoinChannelSignalParam p0);
    public abstract int pauseAudioDevice();
    public abstract int postReceivedSignalingJson(String p0,String p1,String p2);
    public abstract int postReceivedSignalingMessage(String p0,String p1,byte[] p2);
    public abstract void probeConnectivity(String p0,int p1,int p2,ConnectivityObserver p3);
    public abstract void pushCustomVideoData(byte[] p0);
    public abstract boolean pushExternalRawVideoFrame(RtcEngineVideoFrame p0,int p1);
    public abstract void registerCustomVideoDataObserver(CustomVideoDataObserver p0);
    public abstract void registerQosCallback(AryaQosObserver p0);
    public abstract int rejoinChannel(RtcEngine$JoinChannelSignalParam p0);
    public abstract void removeAllAudioBypassDataObserver();
    public abstract int removeAudioMixTrack(int p0);
    public abstract void removeAudioSceneObserver(AudioSceneObserver p0);
    public abstract void resetPlayAudio(int p0);
    public abstract int resumeAudioDevice();
    public abstract int sendMediaMetadataData(byte[] p0,int p1);
    public abstract int setAgcMode(int p0);
    public abstract int setAsMainSourceOfScene(int p0,int p1);
    public abstract void setAudioEffectParam(boolean p0,RtcEngineExt$RtcEngineAudioEffectParam p1);
    public abstract int setAudioLowDelayMode(int p0);
    public abstract void setAudioOutputType(int p0);
    public abstract void setAudioPreProcessVolume(float p0);
    public abstract void setCaeModelPath(String p0);
    public abstract void setCameraParams(KCameraEngine$KCameraEngineConfig p0);
    public abstract void setCommentStreamAudioPts(long p0);
    public abstract void setCommentStreamId(String p0);
    public abstract void setCommentStreamVolume(float p0);
    public abstract void setDeepAECModelPath(String p0);
    public abstract int setDeepDenoiseModelPath(String p0);
    public abstract int setHowlingSuppressionMode(int p0);
    public abstract int setKtpModelPath(String p0);
    public abstract int setKtpRtcModelPath(String p0);
    public abstract void setLiveStreamVideoEncodeParam(RtcEngineExt$RtcEngineVideoEncodeParameter p0);
    public abstract void setPlayAudioVolume(int p0,float p1);
    public abstract void setRotation(int p0,int p1);
    public abstract int setSceneSourceMixMode(int p0,int p1,int p2);
    public abstract void setSongSectionStartEndTime(int[] p0);
    public abstract int setVideoEncoderConfiguration(boolean p0);
    public abstract int setVideoMixOutputMode(int p0,int p1);
    public abstract int setVideoMixType(int p0);
    public abstract void setWallClockTime(long p0);
    public abstract void startAudioEngine(int p0);
    public abstract boolean startAudioInnerCap(MediaProjection p0);
    public abstract int startAudioMixingForMultiTrack();
    public abstract int startAudioRecording(int p0,int p1,int p2);
    public abstract int startMixRemoteAndLocalAudio();
    public abstract int startNetSpeedMeasure(String p0,String p1,int p2,int p3);
    public abstract void startPlayAudio(int p0);
    public abstract void startScreencast(String p0,int p1,int p2,int p3,int p4,int p5);
    public abstract void startSongSectionScore();
    public abstract void startSongSectionScoreWorkshop(int p0,byte[] p1,long p2);
    public abstract int startVideoRecording(String p0,int p1,AryaResultObserver p2);
    public abstract int stopAudioMixingForMultiTrack();
    public abstract void stopInnerCap();
    public abstract int stopMixRemoteAndLocalAudio();
    public abstract int stopNetSpeedMeasure();
    public abstract void stopPlayAudio(int p0);
    public abstract void stopScreencast();
    public abstract void stopSongSectionScore();
    public abstract void stopSongSectionScoreWorkshop();
    public abstract int stopVideoRecording(AryaResultObserver p0);
    public abstract QosInfo summaryQosInfo();
    public abstract void switchVoicePartyBusinessScene(int p0);
    public abstract void unRegisterCustomVideoDataObserver();
    public abstract void unregisterQosCallback();
    public abstract int updateLayoutAndResolutionForScene(int p0,RtcEngine$Layout[] p1,int p2,int p3,ByteBuffer p4);
    public abstract int updateLayoutAndResolutionForScene(int p0,RtcEngine$Layout[] p1,int p2,int p3,ByteBuffer p4,ByteBuffer p5);
    public abstract int updateLayoutForScene(int p0,RtcEngine$Layout[] p1,ByteBuffer p2);
    public abstract int videoRecordingLastPeriod(String p0);
    public abstract int websocketClose(int p0);
    public abstract int websocketOpen(int p0,String p1);
    public abstract int websocketSend(int p0,byte[] p1);
}
