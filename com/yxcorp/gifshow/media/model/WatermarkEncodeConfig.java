package com.yxcorp.gifshow.media.model.WatermarkEncodeConfig;
import com.yxcorp.gifshow.media.model.BaseEncodeConfig;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class WatermarkEncodeConfig extends BaseEncodeConfig	// class@001d19
{
    public float mForceTranscodeIfFpsLessThan;
    public float mForceTranscodeTargetFps;
    public long mVideoBitrate;
    public long mVideoBitrate1080P;
    public int mVideoGopSize;
    public int mVideoGopSize1080p;
    public String mX264Params1080p;
    public String mX264Preset1080p;

    public void WatermarkEncodeConfig(){
       super();
       this.mForceTranscodeIfFpsLessThan = 2.00f;
       this.mForceTranscodeTargetFps = 2.00f;
    }
    public String f(){
       return "crf=15:vbv_maxrate=20000:vbv_bufsize=40000:threads=6:keyint=30";
    }
    public String g(){
       Object obj = PatchProxy.apply(null, this, WatermarkEncodeConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "veryfast";
    }
    public float n(){
       return this.mForceTranscodeIfFpsLessThan;
    }
    public float o(){
       return this.mForceTranscodeTargetFps;
    }
}
