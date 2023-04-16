package com.kwai.video.krtc.KWAryaStats$KWAryaLocalVideoStats;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import java.lang.Exception;
import java.util.Locale;
import java.lang.Integer;
import com.kwai.video.krtc.utils.Log;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class KWAryaStats$KWAryaLocalVideoStats	// class@000760
{
    public int captureFrameRate;
    public String channelId;
    public int encodedBitrate;
    public int encodedFrameHeight;
    public int encodedFrameWidth;
    public int encoderOutputFrameRate;
    public int sentBitrate;
    public int targetBitrate;
    public int targetFrameRate;

    public void KWAryaStats$KWAryaLocalVideoStats(String p0){
       super();
       this.getLocalVideoStatsFromJson(p0);
    }
    public final void getLocalVideoStatsFromJson(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KWAryaStats$KWAryaLocalVideoStats.class, "1")) {
          return;
       }
       try{
          JSONObject jSONObject = new JSONObject(p0);
          this.channelId = jSONObject.getString("channelId");
          this.targetBitrate = jSONObject.getInt("tgtKbps");
          this.encodedBitrate = jSONObject.getInt("encKbps");
          this.sentBitrate = jSONObject.getInt("transKbps");
          this.captureFrameRate = jSONObject.getInt("capFps");
          this.targetFrameRate = jSONObject.getInt("tgtFps");
          this.encoderOutputFrameRate = jSONObject.getInt("encFps");
          this.encodedFrameWidth = jSONObject.getInt("width");
          this.encodedFrameHeight = jSONObject.getInt("height");
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
    public void print(){
       if (PatchProxy.applyVoid(null, this, KWAryaStats$KWAryaLocalVideoStats.class, "2")) {
          return;
       }
       Object[] objArray = new Object[9];
       objArray[0] = this.channelId;
       objArray[1] = Integer.valueOf(this.captureFrameRate);
       objArray[2] = Integer.valueOf(this.targetFrameRate);
       objArray[3] = Integer.valueOf(this.encoderOutputFrameRate);
       objArray[4] = Integer.valueOf(this.targetBitrate);
       objArray[5] = Integer.valueOf(this.encodedBitrate);
       objArray[6] = Integer.valueOf(this.sentBitrate);
       objArray[7] = Integer.valueOf(this.encodedFrameWidth);
       objArray[8] = Integer.valueOf(this.encodedFrameHeight);
       Log.i("KWAryaLocalVideoStats", String.format(Locale.getDefault(), "onLocalVideoStats, channel_id:%s\n captureFrameRate:%d\n targetFrameRate:%d\n encoderOutputFrameRate:%d\n targetBitrate:%d\n encodedBitrate:%d\n sentBitrate:%d\n encodedFrameWidth:%d\n encodedFrameHeight:%d\n", objArray));
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KWAryaStats$KWAryaLocalVideoStats.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KWAryaLocalVideoStats{channelId=\'"+this.channelId+'''+", targetBitrate="+this.targetBitrate+", encodedBitrate="+this.encodedBitrate+", sentBitrate="+this.sentBitrate+", captureFrameRate="+this.captureFrameRate+", targetFrameRate="+this.targetFrameRate+", encoderOutputFrameRate="+this.encoderOutputFrameRate+", encodedFrameWidth="+this.encodedFrameWidth+", encodedFrameHeight="+this.encodedFrameHeight+'}';
    }
}
