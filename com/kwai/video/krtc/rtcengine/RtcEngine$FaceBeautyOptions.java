package com.kwai.video.krtc.rtcengine.RtcEngine$FaceBeautyOptions;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class RtcEngine$FaceBeautyOptions	// class@0007e7
{
    public float lighteningLevel;
    public float smoothnessLevel;

    public void RtcEngine$FaceBeautyOptions(){
       super();
       this.lighteningLevel = 0x3f000000;
       this.smoothnessLevel = 0x3f000000;
    }
    public float getLighteningLevel(){
       return this.lighteningLevel;
    }
    public float getSmoothnessLevel(){
       return this.smoothnessLevel;
    }
    public void setLighteningLevel(float p0){
       this.lighteningLevel = p0;
    }
    public void setSmoothnessLevel(float p0){
       this.smoothnessLevel = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RtcEngine$FaceBeautyOptions.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FaceBeautyOptions{lighteningLevel="+this.lighteningLevel+", smoothnessLevel="+this.smoothnessLevel+'}';
    }
}
