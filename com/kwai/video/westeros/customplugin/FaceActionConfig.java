package com.kwai.video.westeros.customplugin.FaceActionConfig;
import java.lang.Object;

public class FaceActionConfig	// class@000e76
{
    public float eyeBlinkRatio;
    public int frameNumBlink;
    public int frameNumRotate;
    public int isDetectEye;
    public int isDetectHead;
    public int isDetectMouth;
    public float mouthOpenRatio;
    public float pitchRotateRatio;
    public float yawRotateRatio;

    public void FaceActionConfig(){
       super();
       this.isDetectEye = 1;
       this.isDetectMouth = 1;
       this.isDetectHead = 1;
       this.eyeBlinkRatio = 0.30f;
       this.mouthOpenRatio = 0.20f;
       this.yawRotateRatio = 0.20f;
       this.pitchRotateRatio = 0.15f;
       this.frameNumBlink = 20;
       this.frameNumRotate = 30;
    }
}
