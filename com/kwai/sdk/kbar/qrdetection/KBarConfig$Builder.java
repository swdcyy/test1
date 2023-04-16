package com.kwai.sdk.kbar.qrdetection.KBarConfig$Builder;
import java.lang.Object;
import com.kwai.sdk.kbar.qrdetection.KBarConfig$DetectType;
import com.kwai.sdk.kbar.qrdetection.KBarConfig$InputImgType;
import com.kwai.sdk.kbar.qrdetection.KBarConfig$AspectRatio;
import com.kwai.sdk.kbar.qrdetection.KBarConfig$DeviceOrientation;
import com.kwai.sdk.kbar.qrdetection.KBarConfig$CameraPosition;
import com.kwai.sdk.kbar.qrdetection.KBarConfig;
import com.kwai.sdk.kbar.qrdetection.KBarConfig$a;
import java.lang.String;

public class KBarConfig$Builder	// class@001620
{
    public float cameraFov;
    public KBarConfig$CameraPosition cameraPosition;
    public KBarConfig$DetectType detectType;
    public KBarConfig$DeviceOrientation deviceOrientation;
    public KBarConfig$AspectRatio inputImgAsRatio;
    public int inputImgRotation;
    public KBarConfig$InputImgType inputImgType;
    public String modelFlag;
    public String modelPath;

    public void KBarConfig$Builder(){
       super();
       this.detectType = KBarConfig$DetectType.DETECT_QRONED;
       this.modelPath = "";
       this.modelFlag = "";
       this.inputImgType = KBarConfig$InputImgType.INPUT_IMG_NV21;
       this.inputImgAsRatio = new KBarConfig$AspectRatio(9, 16);
       this.cameraFov = 59.00f;
       this.inputImgRotation = 90;
       this.deviceOrientation = KBarConfig$DeviceOrientation.DEVICE_ORIENTATION_PORTRAIT;
       this.cameraPosition = KBarConfig$CameraPosition.CAMERA_POSITION_BACK;
    }
    public KBarConfig build(){
       return new KBarConfig(this, null);
    }
    public KBarConfig$Builder setCameraFov(float p0){
       this.cameraFov = p0;
       return this;
    }
    public KBarConfig$Builder setCameraPosition(KBarConfig$CameraPosition p0){
       this.cameraPosition = p0;
       return this;
    }
    public KBarConfig$Builder setDetectType(KBarConfig$DetectType p0){
       this.detectType = p0;
       return this;
    }
    public KBarConfig$Builder setDeviceOrientation(KBarConfig$DeviceOrientation p0){
       this.deviceOrientation = p0;
       return this;
    }
    public KBarConfig$Builder setInputImgAsRatio(KBarConfig$AspectRatio p0){
       this.inputImgAsRatio = p0;
       return this;
    }
    public KBarConfig$Builder setInputImgRotation(int p0){
       this.inputImgRotation = p0;
       return this;
    }
    public KBarConfig$Builder setInputImgType(KBarConfig$InputImgType p0){
       this.inputImgType = p0;
       return this;
    }
    public KBarConfig$Builder setModelFlag(String p0){
       this.modelFlag = p0;
       return this;
    }
    public KBarConfig$Builder setModelPath(String p0){
       this.modelPath = p0;
       return this;
    }
}
