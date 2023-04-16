package com.kwai.video.krtc.rtcengine.RtcEngine;
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
import com.kwai.video.krtc.rtcengine.RtcEngine$1;
import com.kwai.video.krtc.a;
import com.kwai.video.krtc.rtcengine.RtcEngineConfig;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.krtc.rtcengine.internal.o;
import android.content.Context;
import android.view.SurfaceView;
import com.kwai.video.krtc.EglContextHolder;
import com.kwai.video.krtc.rtcengine.render.RtcEngineSurfaceView;
import android.util.AttributeSet;
import android.view.TextureView;
import com.kwai.video.krtc.rtcengine.render.RtcEngineTextureView;
import com.kwai.video.krtc.AryaManager;
import java.lang.Number;
import java.lang.Integer;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import com.kwai.video.krtc.rtcengine.VideoWatermark;
import com.kwai.video.krtc.rtcengine.camera.KVideoCanvas;
import com.kwai.video.krtc.rtcengine.DataStreamConfig;
import com.kwai.video.krtc.rtcengine.RtcEngineAudioFrame;
import com.kwai.video.krtc.rtcengine.JoinChannelParam;
import com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import com.kwai.video.krtc.observers.AryaRawAudioFrameObserver;
import com.kwai.video.krtc.rtcengine.IMediaFrameObserver;
import java.util.ArrayList;
import com.kwai.video.krtc.rtcengine.RtcEngine$FaceBeautyOptions;
import com.kwai.video.krtc.rtcengine.camera.KCameraCapturerConfiguration;
import com.kwai.video.krtc.rtcengine.LiveTranscoding;
import com.kwai.video.krtc.rtcengine.RtcEngine$VideoEncoderConfiguration;
import com.kwai.video.krtc.rtcengine.AudioMixingParam;
import com.kwai.video.krtc.rtcengine.RtcEngineFileStreamingConfig;
import android.graphics.Bitmap;
import android.media.projection.MediaProjection;

public abstract class RtcEngine	// class@0007ed
{
    public static o mInstance;

    public void RtcEngine(){
       super();
    }
    public static void applyLogParam(){
       if (PatchProxy.applyVoid(null, null, RtcEngine.class, "16")) {
          return;
       }
       AryaManager$LogParam logParam = new AryaManager$LogParam();
       logParam.filePath = q.a();
       logParam.logLevel = q.c();
       logParam.maxFileSize = q.b();
       logParam.maxFileNum = q.d();
       logParam.logCb = q.e();
       logParam.isConsoleEnable = false;
       logParam.isFileEnable = TextUtils.isEmpty(logParam.filePath) ^ 0x01;
       Log.setLogParam(logParam);
       a.a(logParam, new RtcEngine$1(logParam));
       return;
    }
    public static RtcEngine createInstance(RtcEngineConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RtcEngine.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new o(p0);
    }
    public static SurfaceView createLocalSurfaceView(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RtcEngine.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EglContextHolder.forceUseEgl10();
       return new RtcEngineSurfaceView(p0, null, true);
    }
    public static TextureView createLocalTextureView(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RtcEngine.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RtcEngineTextureView(p0, null, true);
    }
    public static SurfaceView createRemoteSurfaceView(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RtcEngine.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EglContextHolder.forceUseEgl10();
       return new RtcEngineSurfaceView(p0, null, true);
    }
    public static TextureView createRemoteTextureView(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RtcEngine.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RtcEngineTextureView(p0, null, true);
    }
    public static synchronized void destroy(){
       _monitor_enter(RtcEngine.class);
       if (PatchProxy.applyVoid(null, null, RtcEngine.class, "2")) {
          _monitor_exit(RtcEngine.class);
          return;
       }else {
          o mInstance = RtcEngine.mInstance;
          if (mInstance != null) {
             mInstance.destroyInstance();
             RtcEngine.mInstance = null;
          }
          _monitor_exit(RtcEngine.class);
          return;
       }
    }
    public static String getErrorDescription(int p0){
       String str = "Disconnected from media server.";
       if (!p0) {
          str = "No Error";
       }else if(p0 == 19){
          str = "Failed to join channel due to wrong parameters.";
       }else if(p0 == 22){
          if (p0 != 50 && (p0 != 2004 && (p0 != 2002 && (p0 != 2003 && (p0 != 2001 && p0 != 2000))))) {
             int i = 2011;
             if (p0 != i) {
                if (p0 != 2005 && (p0 == 2006 || p0 == 2007)) {
                   str = "Failed to join channel due to invalid parameter.";
                }else if(p0 == 2008){
                   str = "Failed to join channel due to invalid AppID.";
                }else if(p0 == 2009){
                   str = "Failed to join channel due to invalid token.";
                }else if(p0 == 2010){
                   str = "Failed to join channel due to expired token.";
                }else if(p0 == 56){
                   str = "Failed to set live transcoding.";
                }else if(p0 == 57){
                   str = "Failed to add the publishing url for live transcoding.";
                }else if(p0 == 58){
                   str = "Failed to remove the publishing url for live transcoding.";
                }else if(p0 == 59){
                   str = "Failed to stop live transcoding.";
                }else if(p0 == 60){
                   str = "Video encoder run into a fatal error.";
                }else if(p0 == 61){
                   str = "Video decoder run into a fatal error.";
                }else if(p0 == 85){
                   str = "Rejected by media server because the room was not found.";
                }else if(p0 == 89){
                   str = "Failed to create the data stream because it has already exist.";
                }else if(p0 == 90){
                   str = "Failed to create the data stream due to the count limitation.";
                }else if(p0 == 91){
                   str = "Failed to create the data stream due to channel not exist.";
                }else if(p0 == 92){
                   str = "Failed to create the data stream due to bad role or bad source type.";
                }else if(p0 == 93){
                   str = "Failed to send the data because the data stream does not exist.";
                }else if(p0 == 94){
                   str = "Failed to send the data due to the size limitation of single package.";
                }else if(p0 == 95){
                   str = "Failed to send the data due to the size limitation of packages in one second.";
                }else if(p0 == 96){
                   str = "Failed to send the data due to the count limitation of packages in one second.";
                }else if(p0 != 115 && (p0 != 2013 && (p0 != 2012 && (p0 != 2014 && (p0 == 2016 || p0 == i))))){
                   str = "Failed to rejoin channel after network restored.";
                }else if(p0 == 2015){
                   str = "Failed to rejoin channel after network restored due to expired token.";
                }else if(p0 == 0x10001){
                   str = "Audio Device is in abnormal state.";
                }else if(p0 == 0x10002){
                   str = "Failed to call the method because parameters in invalid.";
                }else if(p0 == 0x10003){
                   str = "Failed to leave channel.";
                }else if(p0 == 5){
                   str = "Network is not good.";
                }else if(p0 == 17){
                   str = "Reconnect to media server too many times.";
                }else if(p0 == 22){
                   if (p0 == 88) {
                      str = "Leave channel due to kicked off.";
                   }else if(p0 == 109){
                      str = "Screen sharing was kicked off.";
                   }else {
                      str = "Unknown.";
                   }
                }
             }
          }
          str = "Failed to join channel due to signaling error.";
       }
       return str;
    }
    public static String getSdkVersion(){
       Object obj = PatchProxy.apply(null, null, RtcEngine.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AryaManager.getInstance().getAryaVersion();
    }
    public static int setLogCb(AryaLogObserver p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RtcEngine.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       q.a(p0);
       RtcEngine.applyLogParam();
       return 0;
    }
    public static int setLogFile(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RtcEngine.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       q.a(p0);
       RtcEngine.applyLogParam();
       return 0;
    }
    public static int setLogFileNum(int p0){
       RtcEngine rtcEngine = RtcEngine.class;
       if (PatchProxy.isSupport(rtcEngine)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, rtcEngine, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       q.c(p0);
       RtcEngine.applyLogParam();
       return 0;
    }
    public static int setLogFileSize(int p0){
       RtcEngine rtcEngine = RtcEngine.class;
       if (PatchProxy.isSupport(rtcEngine)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, rtcEngine, "13");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       q.b(p0);
       RtcEngine.applyLogParam();
       return 0;
    }
    public static int setLogLevel(int p0){
       RtcEngine rtcEngine = RtcEngine.class;
       if (PatchProxy.isSupport(rtcEngine)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, rtcEngine, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       q.a(p0);
       RtcEngine.applyLogParam();
       return 0;
    }
    public static synchronized RtcEngine sharedInstance(RtcEngineConfig p0){
       _monitor_enter(RtcEngine.class);
       o obj = PatchProxy.applyOneRefs(p0, null, RtcEngine.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(RtcEngine.class);
          return obj;
       }else {
          obj = RtcEngine.mInstance;
          if (obj == null) {
             RtcEngine.mInstance = new o(p0);
          }else if(p0 != null){
             p0 = p0.mHandler;
             if (p0 != null) {
                obj.addHandler(p0);
             }
          }
          _monitor_exit(RtcEngine.class);
          return RtcEngine.mInstance;
       }
    }
    public void addHandler(IRtcEngineEventHandler p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcEngine.class, "4")) {
          return;
       }
       RtcEngine.mInstance.addHandler(p0);
       return;
    }
    public abstract int addPublishStreamUrl(String p0,String p1);
    public abstract int addVideoWatermark(VideoWatermark p0);
    public abstract int adjustAudioMixingPlayoutVolume(int p0);
    public abstract int adjustAudioMixingPublishVolume(int p0);
    public abstract int adjustAudioMixingVolume(int p0);
    public abstract int adjustPlaybackVolume(int p0);
    public abstract int adjustRecordingVolume(int p0);
    public abstract int adjustUserPlaybackVolume(String p0,int p1);
    public abstract int bindLocalVideoView(KVideoCanvas p0);
    public abstract int bindRemoteVideoView(KVideoCanvas p0);
    public abstract int clearAllPlayAudio();
    public abstract int clearPlayAudio(String p0);
    public abstract int clearVideoWatermarks();
    public abstract int createDataStream(String p0,int p1,DataStreamConfig p2);
    public abstract void destroyInstance();
    public abstract int disableAttenuation(int p0);
    public abstract int disableAudio();
    public abstract int disableAudioVolumeIndication();
    public abstract int disableDenoise();
    public abstract int disableDualStreamMode(String p0);
    public abstract int disableExternalRawAudioSource();
    public abstract int disableInEarMonitoring();
    public abstract void disableLastmileTest();
    public abstract int disableLocalAudio();
    public abstract int disableLocalAudioComfortableNoise();
    public abstract int disableLocalVideo();
    public abstract int disableNoiseSuppression();
    public abstract int disableRangeAudio(int p0);
    public abstract int disableRemotePriority(String p0);
    public abstract int disableRequestAudioFocus();
    public abstract int disableSpatializer(int p0);
    public abstract int disableSpeakerphone();
    public abstract int disableVideo();
    public abstract int enableAttenuation(int p0);
    public abstract int enableAudio();
    public abstract int enableAudioVolumeIndication(int p0,int p1,boolean p2);
    public abstract int enableDenoise();
    public abstract int enableDualStreamMode(String p0);
    public abstract int enableExternalRawAudioSource();
    public abstract int enableHrtf(boolean p0);
    public abstract int enableInEarMonitoring();
    public abstract void enableLastmileTest();
    public abstract int enableLocalAudio();
    public abstract int enableLocalAudioComfortableNoise();
    public abstract int enableLocalVideo();
    public abstract int enableNoiseSuppression();
    public abstract int enableRangeAudio(int p0);
    public abstract int enableRemotePriority(String p0,String p1);
    public abstract int enableRequestAudioFocus();
    public abstract int enableSpatializer(int p0);
    public abstract int enableSpeakerphone();
    public abstract int enableVideo();
    public abstract int getAudioMixingCurrentPosition();
    public abstract int getAudioMixingDuration();
    public abstract int getAudioMixingPlayoutVolume();
    public abstract int getAudioMixingPublishVolume();
    public abstract float getCameraMaxZoomFactor();
    public abstract double getEffectsVolume();
    public abstract int getNetworkQualityScore();
    public abstract int inputSpeakerAudio(RtcEngineAudioFrame p0);
    public abstract boolean isCameraTorchSupported();
    public abstract boolean isCameraZoomSupported();
    public abstract boolean isFileStreamStarted();
    public abstract boolean isSpeakerphoneEnabled();
    public abstract boolean isSupportHeadphoneMonitor();
    public abstract int joinChannel(JoinChannelParam p0);
    public abstract int leaveChannel(String p0);
    public abstract int muteAllRemoteAudioStreams();
    public abstract int muteAllRemoteAudioStreams(String p0);
    public abstract int muteAudioEffects();
    public abstract int muteAudioMixing();
    public abstract int muteLocalAudioStream();
    public abstract int muteLocalVideoStream(String p0);
    public abstract int muteRecordingSignal();
    public abstract int muteRemoteAudioStream(String p0,String p1);
    public abstract int muteRemoteVideoStream(String p0,String p1);
    public abstract int muteSpeaker();
    public abstract void onBackground();
    public abstract void onForeground();
    public abstract void pause();
    public abstract int pauseAllEffects();
    public abstract int pauseAllPlayAudio();
    public abstract int pauseAllRemoteVideoStreams(String p0);
    public abstract int pauseAudioMixing();
    public abstract int pauseEffect(String p0);
    public abstract int pauseFileStream(String p0);
    public abstract int pauseVideoRecording();
    public abstract int playAudioEffect(String p0,String p1);
    public abstract int preloadAudioEffect(String p0);
    public abstract int pushExternalRawAudioFrame(RtcEngineAudioFrame p0);
    public abstract boolean pushExternalRawVideoFrame(RtcEngineVideoFrame p0);
    public abstract void registerAudioFrameObserver(AryaRawAudioFrameObserver p0);
    public abstract int registerMediaFrameObserver(IMediaFrameObserver p0,int p1);
    public void removeHandler(IRtcEngineEventHandler p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcEngine.class, "5")) {
          return;
       }
       RtcEngine.mInstance.removeHandler(p0);
       return;
    }
    public abstract int removePublishStreamUrl(String p0,String p1);
    public abstract void resume();
    public abstract int resumeAllEffects();
    public abstract int resumeAllPlayAudio(boolean p0);
    public abstract int resumeAllRemoteVideoStreams(String p0);
    public abstract int resumeAudioMixing();
    public abstract int resumeEffect(String p0);
    public abstract int resumeFileStream(String p0);
    public abstract int resumeVideoRecording();
    public abstract int seekFileStreamToMs(String p0,long p1);
    public abstract int sendStreamMessage(int p0,byte[] p1);
    public abstract int sendStreamMessage(byte[] p0);
    public abstract int sendStreamMessageV3(byte[] p0);
    public abstract int setAVSyncSource(String p0,String p1);
    public abstract int setAudioEffectsVolume(float p0);
    public abstract int setAudioFocusUser(ArrayList p0);
    public abstract int setAudioMixingPitch(int p0);
    public abstract int setAudioMixingPosition(int p0);
    public abstract int setAudioProfile(int p0,int p1);
    public abstract int setAudioRecvRange(int p0);
    public abstract int setAudioTeamId(int p0);
    public abstract int setAudioTeamMode(int p0);
    public abstract int setAudioTunnel(int p0);
    public abstract int setAudioVoiceRoleOption(int p0);
    public abstract void setBeautyEffectOptions(boolean p0,RtcEngine$FaceBeautyOptions p1);
    public abstract int setCameraAutoFocusFaceModeEnabled(boolean p0);
    public abstract int setCameraCaptureConfiguration(KCameraCapturerConfiguration p0);
    public abstract int setCameraTorchOn(boolean p0);
    public abstract float setCameraZoomFactor(float p0);
    public abstract int setClientRole(String p0,int p1);
    public abstract int setDefaultAudioRouteToSpeakerphone(boolean p0);
    public abstract int setDefaultMuteAllRemoteAudioStreams();
    public abstract int setDefaultMuteAllRemoteVideoStreams();
    public abstract int setDefaultUnmuteAllRemoteAudioStreams();
    public abstract int setDefaultUnmuteAllRemoteVideoStreams();
    public abstract int setEnableAudioMusicMode(boolean p0);
    public abstract void setEnableMonitorDebug(boolean p0);
    public abstract void setEnableRecordAutoResume(boolean p0,int p1,int p2);
    public abstract void setExternalRawVideoSource(boolean p0);
    public abstract int setHrtfModelPath(String p0);
    public abstract int setInEarMonitoringVolume(int p0);
    public abstract int setLiveTranscoding(String p0,LiveTranscoding p1);
    public abstract int setLocalPublishFallbackOption(String p0,int p1);
    public abstract int setLocalRenderMode(int p0,int p1);
    public abstract int setLocalVoiceChanger(int p0);
    public abstract int setLocalVoiceReverbPreset(int p0);
    public abstract void setMixedAudioFrameParameters(int p0,int p1);
    public abstract int setMuteRemote(boolean p0,boolean p1);
    public abstract int setParameters(String p0);
    public abstract void setPlaybackAudioFrameParameters(int p0,int p1,int p2,int p3);
    public abstract int setProperty(String p0,int p1,int p2);
    public abstract int setProperty(String p0,String p1,int p2);
    public abstract void setRecordingAudioFrameParameters(int p0,int p1,int p2,int p3);
    public abstract void setRecordingRawAudioFrameParameters(int p0,int p1,int p2,int p3);
    public abstract int setRemoteDefaultVideoStreamType(String p0,int p1);
    public abstract int setRemoteRenderMode(int p0,int p1);
    public abstract int setRemoteRenderMode(String p0,String p1,int p2,int p3);
    public abstract int setRemoteSubscribeFallbackOption(String p0,int p1);
    public abstract int setRemoteVideoStreamType(String p0,String p1,int p2);
    public abstract int setRxStreamMixerGain(String p0,boolean p1,float p2);
    public abstract int setVideoEncoderConfiguration(String p0,int p1);
    public abstract int setVideoEncoderConfiguration(String p0,RtcEngine$VideoEncoderConfiguration p1);
    public abstract int setVocalBgmDelay(int p0);
    public abstract int setVolumeOfEffect(String p0,double p1);
    public abstract int startAudioMixing(AudioMixingParam p0);
    public abstract int startAudioRecording(int p0);
    public abstract int startAudioRecording(int p0,int p1,int p2);
    public abstract int startAudioRecording(String p0);
    public abstract int startFileStream(String p0,ArrayList p1,RtcEngineFileStreamingConfig p2);
    public abstract int startPlayAudio(String p0,String p1,boolean p2,boolean p3);
    public abstract int startPlayAudio(String p0,byte[] p1,float p2,boolean p3);
    public abstract int startPreview();
    public abstract int startPushImage(String p0,Bitmap p1);
    public abstract int startScreenCapture(String p0,MediaProjection p1);
    public abstract int startVideoRecording(String p0,int p1);
    public abstract int stopAllAudioEffects();
    public abstract int stopAudioMixing();
    public abstract int stopAudioRecording(int p0);
    public abstract int stopEffect(String p0);
    public abstract int stopFileStream(String p0);
    public abstract int stopLiveTranscoding(String p0);
    public abstract int stopPlayAudio();
    public abstract int stopPreview();
    public abstract int stopPushImage(String p0);
    public abstract int stopScreenCapture(String p0);
    public abstract int stopVideoRecording();
    public abstract void subscribeRemoteScreenCapture(String p0,String p1);
    public abstract void subscribeRemoteVideoStream(String p0,ArrayList p1);
    public abstract int subscribeRemoteVideoStreamByDefault();
    public abstract int switchCamera();
    public abstract int unbindAllLocalVideoViews();
    public abstract int unbindAllRemoteVideoViews(String p0,String p1);
    public abstract int unbindAllRemoteVideoViews(String p0,String p1,int p2);
    public abstract int unbindLocalVideoView(KVideoCanvas p0);
    public abstract int unbindRemoteVideoView(KVideoCanvas p0);
    public abstract int unloadAllAudioEffects();
    public abstract int unloadEffect(String p0);
    public abstract int unmuteAllRemoteAudioStreams();
    public abstract int unmuteAllRemoteAudioStreams(String p0);
    public abstract int unmuteAudioEffects();
    public abstract int unmuteAudioMixing();
    public abstract int unmuteLocalAudioStream();
    public abstract int unmuteLocalVideoStream(String p0);
    public abstract int unmuteRecordingSignal();
    public abstract int unmuteRemoteAudioStream(String p0,String p1);
    public abstract int unmuteRemoteVideoStream(String p0,String p1);
    public abstract int unmuteSpeaker();
    public abstract void unsubscribeRemoteScreenCapture(String p0,String p1);
    public abstract void unsubscribeRemoteVideoStream(String p0,ArrayList p1);
    public abstract int unsubscribeRemoteVideoStreamByDefault();
    public abstract boolean updateAudioMixingLocalIndex(int p0,int p1);
    public abstract int updateSelfPosition(int[] p0,float[] p1,float[] p2,float[] p3);
}
