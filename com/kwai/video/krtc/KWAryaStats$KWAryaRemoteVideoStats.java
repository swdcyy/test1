package com.kwai.video.krtc.KWAryaStats$KWAryaRemoteVideoStats;
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

public class KWAryaStats$KWAryaRemoteVideoStats	// class@000763
{
    public int avSyncTimeMs;
    public String channelId;
    public int decoderOutputFrameRate;
    public int endToEndDelayMs;
    public int height;
    public int packetLossRate;
    public int receivedBitrate;
    public int rendererOutputFrameRate;
    public String uid;
    public int width;

    public void KWAryaStats$KWAryaRemoteVideoStats(String p0){
       super();
       this.getRemoteVideoStatsFromJson(p0);
    }
    public final void getRemoteVideoStatsFromJson(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KWAryaStats$KWAryaRemoteVideoStats.class, "1")) {
          return;
       }
       try{
          JSONObject jSONObject = new JSONObject(p0);
          this.channelId = jSONObject.getString("channelId");
          this.uid = jSONObject.getString("userId");
          this.endToEndDelayMs = jSONObject.getInt("delay");
          this.width = jSONObject.getInt("width");
          this.height = jSONObject.getInt("height");
          this.receivedBitrate = jSONObject.getInt("transKbps");
          this.decoderOutputFrameRate = jSONObject.getInt("decFps");
          this.rendererOutputFrameRate = jSONObject.getInt("rendFps");
          this.packetLossRate = jSONObject.getInt("pktLossRate");
          this.avSyncTimeMs = jSONObject.getInt("avGap");
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
    public void print(){
       if (PatchProxy.applyVoid(null, this, KWAryaStats$KWAryaRemoteVideoStats.class, "2")) {
          return;
       }
       Object[] objArray = new Object[10];
       objArray[0] = this.channelId;
       objArray[1] = this.uid;
       objArray[2] = Integer.valueOf(this.width);
       objArray[3] = Integer.valueOf(this.height);
       objArray[4] = Integer.valueOf(this.packetLossRate);
       objArray[5] = Integer.valueOf(this.decoderOutputFrameRate);
       objArray[6] = Integer.valueOf(this.rendererOutputFrameRate);
       objArray[7] = Integer.valueOf(this.receivedBitrate);
       objArray[8] = Integer.valueOf(this.endToEndDelayMs);
       objArray[9] = Integer.valueOf(this.avSyncTimeMs);
       Log.i("KWAryaRemoteVideoStats", String.format(Locale.getDefault(), "onRemoteVideoStats, channel_id:%s\n user_id:%s\n width:%d\n height:%d\n packetLossRate:%d\n decoderOutputFrameRate:%d\n rendererOutputFrameRate:%d\n receivedBitrate:%d\n endToEndDelayMs:%d avSyncTimeMs:%d\n", objArray));
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KWAryaStats$KWAryaRemoteVideoStats.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KWAryaRemoteVideoStats{channelId=\'"+this.channelId+'''+", uid=\'"+this.uid+'''+", endToEndDelayMs="+this.endToEndDelayMs+", width="+this.width+", height="+this.height+", receivedBitrate="+this.receivedBitrate+", decoderOutputFrameRate="+this.decoderOutputFrameRate+", rendererOutputFrameRate="+this.rendererOutputFrameRate+", packetLossRate="+this.packetLossRate+", avSyncTimeMs="+this.avSyncTimeMs+'}';
    }
}
