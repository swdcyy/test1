package com.kwai.video.krtc.KWAryaStats$KWAryaRemoteAudioStats;
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

public class KWAryaStats$KWAryaRemoteAudioStats	// class@000762
{
    public int audioLossRate;
    public String channelId;
    public int jitterBufferDelay;
    public int networkTransportDelay;
    public int numChannels;
    public int receivedBitrate;
    public int receivedSampleRate;
    public String uid;

    public void KWAryaStats$KWAryaRemoteAudioStats(String p0){
       super();
       this.getRemoteAudioStatsFromJson(p0);
    }
    public final void getRemoteAudioStatsFromJson(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KWAryaStats$KWAryaRemoteAudioStats.class, "1")) {
          return;
       }
       try{
          JSONObject jSONObject = new JSONObject(p0);
          this.channelId = jSONObject.getString("channelId");
          this.uid = jSONObject.getString("userId");
          this.networkTransportDelay = jSONObject.getInt("delay");
          this.numChannels = jSONObject.getInt("audioChannelNum");
          this.receivedSampleRate = jSONObject.getInt("audioSampleRate");
          this.receivedBitrate = jSONObject.getInt("transKbps");
          this.audioLossRate = jSONObject.getInt("pktLossRate");
          this.jitterBufferDelay = jSONObject.getInt("audioJitBufDly");
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
    public void print(){
       if (PatchProxy.applyVoid(null, this, KWAryaStats$KWAryaRemoteAudioStats.class, "2")) {
          return;
       }
       Object[] objArray = new Object[]{this.channelId,this.uid,Integer.valueOf(this.networkTransportDelay),Integer.valueOf(this.audioLossRate),Integer.valueOf(this.receivedBitrate),Integer.valueOf(this.numChannels),Integer.valueOf(this.receivedSampleRate),Integer.valueOf(this.jitterBufferDelay)};
       Log.i("KWAryaRemoteAudioStats", String.format(Locale.getDefault(), "onRemoteAudioStats, channel_id:%s\n user_id:%s\n networkTransportDelay:%d\n audioLossRate:%d\n receivedBitrate:%d\n numChannels:%d\n receivedSampleRate:%d\n jitterBufferDelay:%d", objArray));
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KWAryaStats$KWAryaRemoteAudioStats.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KWAryaRemoteAudioStats{channelId=\'"+this.channelId+'''+", uid=\'"+this.uid+'''+", networkTransportDelay="+this.networkTransportDelay+", numChannels="+this.numChannels+", receivedSampleRate="+this.receivedSampleRate+", receivedBitrate="+this.receivedBitrate+", audioLossRate="+this.audioLossRate+", jitterBufferDelay="+this.jitterBufferDelay+'}';
    }
}
