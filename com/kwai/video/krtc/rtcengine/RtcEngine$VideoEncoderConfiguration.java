package com.kwai.video.krtc.rtcengine.RtcEngine$VideoEncoderConfiguration;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class RtcEngine$VideoEncoderConfiguration	// class@0007eb
{
    public int frameRate;
    public int initBitrate;
    public int maxBitrate;
    public int minBitrate;
    public int minFrameRate;
    public int mirrorMode;
    public int orientationMode;
    public int targetHeight;
    public int targetWidth;

    public void RtcEngine$VideoEncoderConfiguration(){
       super();
       this.targetWidth = 544;
       this.targetHeight = 960;
       this.frameRate = 15;
       this.minFrameRate = 15;
       this.initBitrate = 800;
       this.minBitrate = 200;
       this.maxBitrate = 900;
       this.orientationMode = 0;
       this.mirrorMode = 0;
    }
    public void RtcEngine$VideoEncoderConfiguration(int p0,int p1,int p2,int p3,int p4){
       super();
       this.targetWidth = 544;
       this.targetHeight = 960;
       this.frameRate = 15;
       this.minFrameRate = 15;
       this.initBitrate = 800;
       this.minBitrate = 200;
       this.maxBitrate = 900;
       this.orientationMode = 0;
       this.mirrorMode = 0;
       this.targetWidth = p0;
       this.targetHeight = p1;
       this.frameRate = p2;
       this.initBitrate = p3;
       this.orientationMode = p4;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RtcEngine$VideoEncoderConfiguration.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VideoEncoderConfiguration{targetWidth="+this.targetWidth+", targetHeight="+this.targetHeight+", frameRate="+this.frameRate+", minFrameRate="+this.minFrameRate+", initBitrate="+this.initBitrate+", minBitrate="+this.minBitrate+", maxBitrate="+this.maxBitrate+", orientationMode="+this.orientationMode+", mirrorMode="+this.mirrorMode+'}';
    }
}
