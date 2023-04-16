package com.kwai.video.stannis.Stannis$KWStannisServerConfig;
import com.kwai.video.stannis.Stannis;
import java.lang.Object;

public class Stannis$KWStannisServerConfig	// class@000be5
{
    public String audioJsonConfig;
    public int chatRoundTripLatency;
    public int dereverb;
    public int deviceType;
    public boolean disableCommonNS;
    public boolean disableNewAecDelayEst;
    public boolean enableAecHighQuality;
    public boolean enableAudioQualityEst;
    public boolean enableAudioRenderThread;
    public boolean enableDeepAec;
    public boolean enableDevAec;
    public boolean enableGroupAecHighQuality;
    public boolean enableGroupDevAec;
    public boolean enableLineAgc;
    public boolean enableLineNs;
    public boolean enableLiteMode;
    public boolean enableProfile;
    public boolean enableSoftAec;
    public boolean enableStereoInput;
    public boolean forceAec;
    public int forceAecNlp;
    public int groupSoftAecNlp;
    public boolean ktvVendorSupport;
    public int lineAecNsLevel;
    public boolean liveStreamMixBgm;
    public int profileStatisticTimes;
    public int roundTripLatency;
    public int softAecNlp;
    public boolean stableSampleRate;
    public final Stannis this$0;
    public boolean useSoftHeadphoneMonitor;

    public void Stannis$KWStannisServerConfig(Stannis p0){
       this.this$0 = p0;
       super();
       this.enableDevAec = false;
       this.softAecNlp = 21;
       this.enableAecHighQuality = true;
       this.enableGroupDevAec = false;
       this.groupSoftAecNlp = 21;
       this.enableGroupAecHighQuality = true;
       this.forceAec = false;
       this.forceAecNlp = 18;
       this.roundTripLatency = 250;
       this.chatRoundTripLatency = 250;
       this.liveStreamMixBgm = false;
       this.ktvVendorSupport = true;
       this.deviceType = 0;
       this.useSoftHeadphoneMonitor = false;
       this.enableStereoInput = false;
       this.enableLiteMode = false;
       this.enableLineAgc = false;
       this.dereverb = 0;
       this.disableCommonNS = false;
       this.enableAudioRenderThread = false;
       this.disableNewAecDelayEst = false;
       this.enableAudioQualityEst = false;
       this.enableProfile = false;
       this.profileStatisticTimes = 2;
       this.enableLineNs = true;
       this.lineAecNsLevel = -20;
       this.stableSampleRate = false;
       this.audioJsonConfig = "";
       this.enableDeepAec = true;
    }
}
