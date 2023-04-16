package com.kwai.video.krtc.rtcengine.camera.KCameraEngine$KCameraEngineConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class KCameraEngine$KCameraEngineConfig	// class@00084a
{
    public int mCaptureFps;
    public int mCaptureHeight;
    public boolean mCaptureScreen;
    public boolean mCaptureTexture;
    public int mCaptureWidth;
    public Context mContext;
    public MediaProjection mMediaProjection;
    public boolean mRetryOpenCameraWhenDisconnet;
    public boolean mUseFrontCamera;
    public int orientationMode;

    public void KCameraEngine$KCameraEngineConfig(){
       super();
       this.mCaptureWidth = 720;
       this.mCaptureHeight = 1280;
       this.mCaptureFps = 15;
       this.mCaptureTexture = true;
       this.mRetryOpenCameraWhenDisconnet = false;
       this.mUseFrontCamera = true;
       this.mCaptureScreen = false;
       this.orientationMode = 0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KCameraEngine$KCameraEngineConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KCameraEngineConfig{mContext="+this.mContext+", mCaptureWidth="+this.mCaptureWidth+", mCaptureHeight="+this.mCaptureHeight+", mCaptureFps="+this.mCaptureFps+", mCaptureTexture="+this.mCaptureTexture+", mRetryOpenCameraWhenDisconnet="+this.mRetryOpenCameraWhenDisconnet+", mUseFrontCamera="+this.mUseFrontCamera+", mCaptureScreen="+this.mCaptureScreen+", orientationMode="+this.orientationMode+", mMediaProjection="+this.mMediaProjection+'}';
    }
}
