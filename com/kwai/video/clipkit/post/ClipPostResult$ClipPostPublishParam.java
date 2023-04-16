package com.kwai.video.clipkit.post.ClipPostResult$ClipPostPublishParam;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Arrays;

public class ClipPostResult$ClipPostPublishParam	// class@001aea
{
    public String audioCodec;
    public double avgBitrate;
    public double exportDuration;
    public int exportHeight;
    public int exportWidth;
    public boolean isMp4;
    public boolean isPipeline;
    public double[] originDurationArray;
    public int[] originHeightArray;
    public int[] originWidthArray;
    public int skipTranscode;
    public int transcodeReason;
    public boolean usHwEncode;
    public String videoCodec;

    public void ClipPostResult$ClipPostPublishParam(){
       super();
       this.videoCodec = "default";
       this.audioCodec = "default";
       this.avgBitrate = 0xbff0000000000000;
       this.isMp4 = false;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ClipPostResult$ClipPostPublishParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ClipPostPublishParam{usHwEncode="+this.usHwEncode+", skipTranscode="+this.skipTranscode+", transcodeReason="+this.transcodeReason+", isPipeline="+this.isPipeline+", originWidthArray="+Arrays.toString(this.originWidthArray)+", originHeightArray="+Arrays.toString(this.originHeightArray)+", originDurationArray="+Arrays.toString(this.originDurationArray)+", exportWidth="+this.exportWidth+", exportHeight="+this.exportHeight+", exportDuration="+this.exportDuration+", videoCodecId="+this.videoCodec+", audioCodecId="+this.audioCodec+", avgBitrate="+this.avgBitrate+", isMp4="+this.isMp4+'}';
    }
}
