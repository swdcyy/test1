package com.kwai.video.krtc.ChannelSummaryInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ChannelSummaryInfo	// class@00073b
{
    public String channelId;
    public int cpuAppUsage;
    public int cpuTotalUsage;
    public long duration;
    public long memoryAppUsageInKbytes;
    public int networkRtt;
    public long rxAudioBytes;
    public int rxAudioKbitrate;
    public long rxBytes;
    public int rxKbitrate;
    public long rxVideoBytes;
    public int rxVideoKbitrate;
    public long txAudioBytes;
    public int txAudioKbitrate;
    public long txBytes;
    public int txKbitrate;
    public int txPacketLossRate;
    public long txVideoBytes;
    public int txVideoKbitrate;
    public int userCount;

    public void ChannelSummaryInfo(String p0,long p1,long p2,long p3,long p4,long p5,long p6,long p7,int p8,int p9,int p10,int p11,int p12,int p13,int p14,int p15,long p16,int p17,int p18,int p19){
       int i = this;
       super();
       i.channelId = p0;
       i.duration = p1;
       i.txBytes = p2;
       i.rxBytes = p3;
       i.txAudioBytes = p4;
       i.rxAudioBytes = p5;
       i.txVideoBytes = p6;
       i.rxVideoBytes = p7;
       i.txKbitrate = p8;
       i.rxKbitrate = p9;
       i.txAudioKbitrate = p10;
       i.rxAudioKbitrate = p11;
       i.txVideoKbitrate = p12;
       i.rxVideoKbitrate = p13;
       i.cpuAppUsage = p14;
       i.cpuTotalUsage = p15;
       i.memoryAppUsageInKbytes = p16;
       i.networkRtt = p17;
       i.txPacketLossRate = p18;
       i.userCount = p19;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ChannelSummaryInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ChannelSummaryInfo{channelId=\'"+this.channelId+'''+", duration="+this.duration+", txBytes="+this.txBytes+", rxBytes="+this.rxBytes+", txAudioBytes="+this.txAudioBytes+", rxAudioBytes="+this.rxAudioBytes+", txVideoBytes="+this.txVideoBytes+", rxVideoBytes="+this.rxVideoBytes+", txKbitrate="+this.txKbitrate+", rxKbitrate="+this.rxKbitrate+", txAudioKbitrate="+this.txAudioKbitrate+", rxAudioKbitrate="+this.rxAudioKbitrate+", txVideoKbitrate="+this.txVideoKbitrate+", rxVideoKbitrate="+this.rxVideoKbitrate+", cpuAppUsage="+this.cpuAppUsage+", cpuTotalUsage="+this.cpuTotalUsage+", memoryAppUsageInKbytes="+this.memoryAppUsageInKbytes+", networkRtt="+this.networkRtt+", txPacketLossRate="+this.txPacketLossRate+", userCount="+this.userCount+'}';
    }
}
