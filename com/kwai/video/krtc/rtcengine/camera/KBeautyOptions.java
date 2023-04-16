package com.kwai.video.krtc.rtcengine.camera.KBeautyOptions;
import java.lang.Object;

public class KBeautyOptions	// class@000847
{
    public float beautifyFaceLevel;
    public float lighteningLevel;
    public float smoothnessLevel;

    public void KBeautyOptions(){
       super();
       this.lighteningLevel = 0x3f000000;
       this.smoothnessLevel = 0x3f000000;
       this.beautifyFaceLevel = 0x3f000000;
    }
    public void KBeautyOptions(float p0,float p1,float p2){
       super();
       this.lighteningLevel = p0;
       this.smoothnessLevel = p1;
       this.beautifyFaceLevel = p2;
    }
}
