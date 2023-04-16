package com.kwai.video.krtc.KWAryaStats$KWAryaRtcStats;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import org.json.JSONArray;
import java.lang.Exception;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class KWAryaStats$KWAryaRtcStats	// class@000764
{
    public String channelId;
    public int cpuAppUsage;
    public int cpuTotalUsage;
    public int downlinkBandwidth;
    public int duration;
    public boolean hasConnected;
    public int memoryAppUsageInKbytes;
    public int rtt;
    public int rxAudioBytes;
    public int rxAudioKBitrate;
    public int rxBytes;
    public int rxKBitrate;
    public int rxPacketLossRate;
    public int rxVideoBytes;
    public int rxVideoKBitrate;
    public int txAudioBytes;
    public int txAudioKBitrate;
    public int txBytes;
    public int txKBitrate;
    public int txPacketLossRate;
    public int txVideoBytes;
    public int txVideoKBitrate;
    public int uplinkBandwidth;
    public int userCount;
    public boolean viaProxy;

    public void KWAryaStats$KWAryaRtcStats(String p0){
       super();
       this.getRtcStatsFromJson(p0);
    }
    public final void getRtcStatsFromJson(String p0){
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, KWAryaStats$KWAryaRtcStats.class, "1")) {
          return;
       }
       try{
          JSONObject jSONObject = new JSONObject(p0);
          this.channelId = jSONObject.getString("channelId");
          this.duration = jSONObject.getInt("duration");
          this.userCount = jSONObject.getInt("userCount");
          JSONObject jSONObject1 = jSONObject.getJSONObject("systemInfo");
          if (jSONObject1 != null) {
             this.cpuAppUsage = jSONObject1.getInt("processCpuUsage");
             this.cpuTotalUsage = jSONObject1.getInt("systemCpuUsage");
             this.memoryAppUsageInKbytes = jSONObject1.getInt("processMemory");
          label_0048 :
             jSONObject1 = jSONObject.getJSONObject("networkInfo");
             if (jSONObject1 != null) {
                this.rtt = jSONObject1.getInt("rtt");
                this.uplinkBandwidth = jSONObject1.getInt("upLinkBandwidth");
                this.downlinkBandwidth = jSONObject1.getInt("downLinkBandwidth");
                this.hasConnected = jSONObject1.getBoolean("hasConnected");
                this.viaProxy = jSONObject1.getBoolean("viaProxy");
                this.txBytes = jSONObject1.getInt("txBytes");
                this.rxBytes = jSONObject1.getInt("rxBytes");
                this.txAudioBytes = jSONObject1.getInt("txAudioBytes");
                this.rxAudioBytes = jSONObject1.getInt("rxAudioBytes");
                this.txVideoBytes = jSONObject1.getInt("txVideoBytes");
                this.rxVideoBytes = jSONObject1.getInt("rxVideoBytes");
                this.txPacketLossRate = jSONObject1.getInt("upLinkLostRate");
                this.rxPacketLossRate = jSONObject1.getInt("downLinkLostRate");
             }
             jSONObject1 = jSONObject.getJSONObject("mediaInfo");
             if (jSONObject1 != null) {
                JSONArray jSONArray = jSONObject1.getJSONArray("audio");
                int i = 0;
                if (jSONArray != null) {
                   i1 = 0;
                   while (i1 < jSONArray.length()) {
                      JSONObject jSONObject2 = jSONArray.getJSONObject(i1);
                      int booleanx = jSONObject2.getBoolean("isUpLink");
                      int intx = jSONObject2.getInt("transKbps");
                      if (booleanx) {
                         booleanx = this.txKBitrate + intx;
                         this.txKBitrate = booleanx;
                         booleanx = this.txAudioKBitrate + intx;
                         this.txAudioKBitrate = booleanx;
                      }else {
                         booleanx = this.rxKBitrate + intx;
                         this.rxKBitrate = booleanx;
                         booleanx = this.rxAudioKBitrate + intx;
                         this.rxAudioKBitrate = booleanx;
                      }
                      i1 = i1 + 1;
                   }
                }
                JSONArray jSONArray1 = jSONObject1.getJSONArray("video");
                if (jSONArray1 != null) {
                   while (i < jSONArray1.length()) {
                      jSONObject = jSONArray1.getJSONObject(i);
                      i1 = jSONObject.getBoolean("isUpLink");
                      int intx1 = jSONObject.getInt("transKbps");
                      if (i1) {
                         i1 = this.txKBitrate + intx1;
                         this.txKBitrate = i1;
                         i1 = this.txVideoKBitrate + intx1;
                         this.txVideoKBitrate = i1;
                      }else {
                         i1 = this.rxKBitrate + intx1;
                         this.rxKBitrate = i1;
                         i1 = this.rxVideoKBitrate + intx1;
                         this.rxVideoKBitrate = i1;
                      }
                      i = i + 1;
                   }
                }
             }
          }else {
             goto label_0048 ;
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KWAryaStats$KWAryaRtcStats.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KWAryaRtcStats{channelId=\'"+this.channelId+'''+", duration="+this.duration+", userCount="+this.userCount+", txBytes="+this.txBytes+", rxBytes="+this.rxBytes+", txKBitrate="+this.txKBitrate+", rxKBitrate="+this.rxKBitrate+", txAudioBytes="+this.txAudioBytes+", txVideoBytes="+this.txVideoBytes+", rxAudioBytes="+this.rxAudioBytes+", rxVideoBytes="+this.rxVideoBytes+", txAudioKBitrate="+this.txAudioKBitrate+", rxAudioKBitrate="+this.rxAudioKBitrate+", txVideoKBitrate="+this.txVideoKBitrate+", rxVideoKBitrate="+this.rxVideoKBitrate+", txPacketLossRate="+this.txPacketLossRate+", rxPacketLossRate="+this.rxPacketLossRate+", cpuAppUsage="+this.cpuAppUsage+", cpuTotalUsage="+this.cpuTotalUsage+", memoryAppUsageInKbytes="+this.memoryAppUsageInKbytes+", rtt="+this.rtt+", uplinkBandwidth="+this.uplinkBandwidth+", downlinkBandwidth="+this.downlinkBandwidth+", hasConnected="+this.hasConnected+", viaProxy="+this.viaProxy+'}';
    }
}
