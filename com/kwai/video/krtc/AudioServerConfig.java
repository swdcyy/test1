package com.kwai.video.krtc.AudioServerConfig;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class AudioServerConfig	// class@00073a
{
    public int chatRoundTripLatency;
    public int deviceType;
    public boolean disableCommonNS;
    public boolean disableNewAecDelayEst;
    public boolean enableAecHighQuality;
    public boolean enableDeepAec;
    public boolean enableDevAec;
    public boolean enableGroupAecHighQuality;
    public boolean enableGroupDevAec;
    public boolean enableLineAgc;
    public boolean enableLineNs;
    public boolean enableProfile;
    public boolean forceAec;
    public int forceAecNlp;
    public int groupSoftAecNlp;
    public String jsonConfig;
    public boolean ktvVendorSupport;
    public int lineAecNsLevel;
    public boolean liteMode;
    public boolean liveStreamMixBgm;
    public boolean liveStreamStereo;
    public int profileStatisticTimes;
    public int roundTripLatency;
    public int softAecNlp;
    public boolean stereoInput;
    public boolean useSoftHeadphoneMonitor;

    public void AudioServerConfig(boolean p0,int p1,boolean p2,boolean p3,int p4,boolean p5,boolean p6,int p7,int p8,int p9,boolean p10,boolean p11,boolean p12,int p13,boolean p14,boolean p15,boolean p16,boolean p17,boolean p18,boolean p19,boolean p20,int p21,boolean p22,int p23,String p24,boolean p25){
       int i = this;
       super();
       i.enableDevAec = p0;
       i.softAecNlp = p1;
       i.enableAecHighQuality = p2;
       i.enableGroupDevAec = p3;
       i.groupSoftAecNlp = p4;
       i.enableGroupAecHighQuality = p5;
       i.forceAec = p6;
       i.forceAecNlp = p7;
       i.roundTripLatency = p8;
       i.chatRoundTripLatency = p9;
       i.liveStreamStereo = p10;
       i.ktvVendorSupport = p11;
       i.liveStreamMixBgm = p12;
       i.deviceType = p13;
       i.useSoftHeadphoneMonitor = p14;
       i.stereoInput = p15;
       i.liteMode = p16;
       i.disableCommonNS = p17;
       i.enableLineAgc = p18;
       i.disableNewAecDelayEst = p19;
       i.enableProfile = p20;
       i.profileStatisticTimes = p21;
       i.enableLineNs = p22;
       i.lineAecNsLevel = p23;
       i.jsonConfig = p24;
       i.enableDeepAec = p25;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AudioServerConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AudioServerConfig{enableDevAec="+this.enableDevAec+", softAecNlp="+this.softAecNlp+", enableAecHighQuality="+this.enableAecHighQuality+", enableGroupDevAec="+this.enableGroupDevAec+", groupSoftAecNlp="+this.groupSoftAecNlp+", enableGroupAecHighQuality="+this.enableGroupAecHighQuality+", forceAec="+this.forceAec+", forceAecNlp="+this.forceAecNlp+", roundTripLatency="+this.roundTripLatency+", chatRoundTripLatency="+this.chatRoundTripLatency+", liveStreamStereo="+this.liveStreamStereo+", ktvVendorSupport="+this.ktvVendorSupport+", liveStreamMixBgm="+this.liveStreamMixBgm+", deviceType="+this.deviceType+", useSoftHeadphoneMonitor="+this.useSoftHeadphoneMonitor+", stereoInput="+this.stereoInput+", liteMode="+this.liteMode+", disableCommonNS="+this.disableCommonNS+", enableLineAgc="+this.enableLineAgc+", disableNewAecDelayEst="+this.disableNewAecDelayEst+", enableprofile="+this.enableProfile+", profileStatisticTimes="+this.profileStatisticTimes+", enableLineNs="+this.enableLineNs+", lineAecNsLevel="+this.lineAecNsLevel+", jsonConfg="+this.jsonConfig+", enableDeepAec="+this.enableDeepAec+'}';
    }
}
