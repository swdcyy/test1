package com.kwai.video.krtc.KWAryaStats$KWAryaLocalAudioStats;
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

public class KWAryaStats$KWAryaLocalAudioStats	// class@00075f
{
    public String channelId;
    public int numChannels;
    public int sentBitrate;
    public int sentSampleRate;

    public void KWAryaStats$KWAryaLocalAudioStats(String p0){
       super();
       this.getLocalAudioStatsFromJson(p0);
    }
    public final void getLocalAudioStatsFromJson(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KWAryaStats$KWAryaLocalAudioStats.class, "1")) {
          return;
       }
       try{
          JSONObject jSONObject = new JSONObject(p0);
          this.channelId = jSONObject.getString("channelId");
          this.numChannels = jSONObject.getInt("audioChannelNum");
          this.sentSampleRate = jSONObject.getInt("audioSampleRate");
          this.sentBitrate = jSONObject.getInt("transKbps");
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
    public void print(){
       if (PatchProxy.applyVoid(null, this, KWAryaStats$KWAryaLocalAudioStats.class, "2")) {
          return;
       }
       Object[] objArray = new Object[]{this.channelId,Integer.valueOf(this.numChannels),Integer.valueOf(this.sentSampleRate),Integer.valueOf(this.sentBitrate)};
       Log.i("KWAryaLocalAudioStats", String.format(Locale.getDefault(), "onLocalAudioStats, channel_id:%s\n numChannels:%d\n sentSampleRate:%d\n sentBitrate:%d", objArray));
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KWAryaStats$KWAryaLocalAudioStats.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KWAryaLocalAudioStats{channelId=\'"+this.channelId+'''+", numChannels="+this.numChannels+", sentSampleRate="+this.sentSampleRate+", sentBitrate="+this.sentBitrate+'}';
    }
}
