package com.kwai.video.krtc.rtcengine.extend.RtcEngineExt$RtcEngineVideoEncodeParameter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class RtcEngineExt$RtcEngineVideoEncodeParameter	// class@000853
{
    public int fps;
    public int height;
    public int maxBitrate;
    public boolean resumeOnRtcStop;
    public int width;

    public void RtcEngineExt$RtcEngineVideoEncodeParameter(){
       super();
       this.width = 0;
       this.height = 0;
       this.fps = 0;
       this.maxBitrate = 0;
       this.resumeOnRtcStop = true;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RtcEngineExt$RtcEngineVideoEncodeParameter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RtcEngineVideoEncodeParameter{width="+this.width+", height="+this.height+", fps="+this.fps+", maxBitrate="+this.maxBitrate+", resumeOnRtcStop="+this.resumeOnRtcStop+'}';
    }
}
