package com.kwai.video.krtc.rtcengine.camera.KCameraEngine;
import java.lang.Object;
import com.kwai.video.krtc.rtcengine.camera.KCameraEngine$KCameraEngineConfig;
import com.kwai.video.krtc.rtcengine.camera.KCameraEngine$KCameraErrorCallback;
import com.kwai.video.krtc.videocapture.VideoCapturerCallback;
import com.kwai.video.krtc.rtcengine.RtcEngine$FaceBeautyOptions;
import com.kwai.video.krtc.rtcengine.camera.b;

public abstract class KCameraEngine	// class@00084d
{

    public void KCameraEngine(){
       super();
    }
    public static synchronized KCameraEngine create(KCameraEngine$KCameraEngineConfig p0){
       _monitor_enter(KCameraEngine.class);
       _monitor_exit(KCameraEngine.class);
       return null;
    }
    public static int determineCameraEngineType(KCameraEngine$KCameraEngineConfig p0){
       if (p0.mCaptureScreen != null && p0.mMediaProjection != null) {
          return 0;
       }
       return 1;
    }
    public abstract void addCameraErrorCallback(KCameraEngine$KCameraErrorCallback p0);
    public abstract void addCaptureCallback(VideoCapturerCallback p0);
    public abstract void changeCapturerFormat(int p0,int p1,int p2);
    public abstract void destroy();
    public abstract float getCameraMaxZoomFactor();
    public abstract boolean isCameraTorchSupported();
    public abstract boolean isCameraZoomSupported();
    public abstract void removeCameraErrorCallback();
    public abstract void removeCaptureCallback();
    public abstract void setBeautyEffectOptions(boolean p0,RtcEngine$FaceBeautyOptions p1);
    public abstract int setCameraAutoFocusFaceModeEnabled(boolean p0);
    public abstract int setCameraCapturerConfiguration(b p0);
    public abstract int setCameraTorchOn(boolean p0);
    public abstract float setCameraZoomFactor(float p0);
    public abstract int startPreview();
    public abstract int stopPreview();
    public abstract int switchCamera();
}
