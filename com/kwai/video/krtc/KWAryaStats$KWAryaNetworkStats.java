package com.kwai.video.krtc.KWAryaStats$KWAryaNetworkStats;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import java.lang.Exception;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class KWAryaStats$KWAryaNetworkStats	// class@000761
{
    public String channelId;
    public int rxQuality;
    public int txQuality;
    public String uid;

    public void KWAryaStats$KWAryaNetworkStats(String p0){
       super();
       this.txQuality = 0;
       this.rxQuality = 0;
       this.getNetworkStatsFromJson(p0);
    }
    public final void getNetworkStatsFromJson(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KWAryaStats$KWAryaNetworkStats.class, "1")) {
          return;
       }
       if (!p0.isEmpty()) {
          try{
             JSONObject jSONObject = new JSONObject(p0);
             this.channelId = jSONObject.getString("channelId");
             this.uid = jSONObject.getString("userId");
             this.txQuality = jSONObject.getInt("upLinkQuality");
             this.rxQuality = jSONObject.getInt("downLinkQuality");
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
       }
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KWAryaStats$KWAryaNetworkStats.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KWAryaNetworkStats{channelId=\'"+this.channelId+'''+", uid=\'"+this.uid+'''+", txQuality="+this.txQuality+", rxQuality="+this.rxQuality+'}';
    }
}
