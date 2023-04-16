package com.kwai.sdk.kbar.qrdetection.KBarConfig;
import com.kwai.sdk.kbar.qrdetection.KBarConfig$Builder;
import java.lang.Object;
import com.kwai.sdk.kbar.qrdetection.KBarConfig$a;
import com.kwai.sdk.kbar.qrdetection.KBarConfig$CameraPosition;
import com.kwai.sdk.kbar.qrdetection.KBarConfig$DetectType;
import com.kwai.sdk.kbar.qrdetection.KBarConfig$DeviceOrientation;
import com.kwai.sdk.kbar.qrdetection.KBarConfig$AspectRatio;
import com.kwai.sdk.kbar.qrdetection.KBarConfig$InputImgType;
import java.lang.String;

public class KBarConfig	// class@001626
{
    public final float cameraFov;
    public final KBarConfig$CameraPosition cameraPosition;
    public final KBarConfig$DetectType detectType;
    public final KBarConfig$DeviceOrientation deviceOrientation;
    public final KBarConfig$AspectRatio inputImgAsRatio;
    public final int inputImgRotation;
    public final KBarConfig$InputImgType inputImgType;
    public final String modelFlag;
    public final String modelPath;

    public void KBarConfig(KBarConfig$Builder p0){
       super();
       this.detectType = p0.detectType;
       this.modelPath = p0.modelPath;
       this.modelFlag = p0.modelFlag;
       this.inputImgType = p0.inputImgType;
       this.inputImgAsRatio = p0.inputImgAsRatio;
       this.cameraFov = p0.cameraFov;
       this.inputImgRotation = p0.inputImgRotation;
       this.deviceOrientation = p0.deviceOrientation;
       this.cameraPosition = p0.cameraPosition;
    }
    public void KBarConfig(KBarConfig$Builder p0,KBarConfig$a p1){
       super(p0);
    }
    public float getCameraFov(){
       return this.cameraFov;
    }
    public KBarConfig$CameraPosition getCameraPosition(){
       return this.cameraPosition;
    }
    public KBarConfig$DetectType getDetectType(){
       return this.detectType;
    }
    public KBarConfig$DeviceOrientation getDeviceOrientation(){
       return this.deviceOrientation;
    }
    public KBarConfig$AspectRatio getInputImgAsRatio(){
       return this.inputImgAsRatio;
    }
    public int getInputImgRotation(){
       return this.inputImgRotation;
    }
    public KBarConfig$InputImgType getInputImgType(){
       return this.inputImgType;
    }
    public String getModelFlag(){
       return this.modelFlag;
    }
    public String getModelPath(){
       return this.modelPath;
    }
}
