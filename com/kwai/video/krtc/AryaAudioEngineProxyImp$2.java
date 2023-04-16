package com.kwai.video.krtc.AryaAudioEngineProxyImp$2;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.AudioServerConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.stannis.Stannis$KWStannisServerConfig;
import com.kwai.video.stannis.Stannis;
import java.util.Objects;

public class AryaAudioEngineProxyImp$2 implements Runnable	// class@0006d3
{
    public final AudioServerConfig a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$2(AryaAudioEngineProxyImp p0,AudioServerConfig p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$2.class, "1")) {
          return;
       }
       Log.i("AryaAudioEngineProxyImp", "updateServerConfig "+this.a);
       Stannis stannis = AryaAudioEngineProxyImp.f(this.b);
       Objects.requireNonNull(stannis);
       Stannis$KWStannisServerConfig kWStannisSer = new Stannis$KWStannisServerConfig(stannis);
       AryaAudioEngineProxyImp$2 ta = this.a;
       kWStannisSer.enableDevAec = ta.enableDevAec;
       kWStannisSer.softAecNlp = ta.softAecNlp;
       kWStannisSer.enableAecHighQuality = ta.enableAecHighQuality;
       kWStannisSer.enableGroupDevAec = ta.enableGroupDevAec;
       kWStannisSer.groupSoftAecNlp = ta.groupSoftAecNlp;
       kWStannisSer.enableGroupAecHighQuality = ta.enableGroupAecHighQuality;
       kWStannisSer.forceAec = ta.forceAec;
       kWStannisSer.forceAecNlp = ta.forceAecNlp;
       kWStannisSer.roundTripLatency = ta.roundTripLatency;
       kWStannisSer.chatRoundTripLatency = ta.chatRoundTripLatency;
       kWStannisSer.ktvVendorSupport = ta.ktvVendorSupport;
       kWStannisSer.liveStreamMixBgm = ta.liveStreamMixBgm;
       kWStannisSer.deviceType = ta.deviceType;
       kWStannisSer.useSoftHeadphoneMonitor = ta.useSoftHeadphoneMonitor;
       kWStannisSer.enableStereoInput = ta.stereoInput;
       kWStannisSer.enableLiteMode = ta.liteMode;
       kWStannisSer.disableCommonNS = ta.disableCommonNS;
       kWStannisSer.enableLineAgc = ta.enableLineAgc;
       kWStannisSer.disableNewAecDelayEst = ta.disableNewAecDelayEst;
       kWStannisSer.enableProfile = ta.enableProfile;
       kWStannisSer.profileStatisticTimes = ta.profileStatisticTimes;
       kWStannisSer.enableLineNs = ta.enableLineNs;
       kWStannisSer.lineAecNsLevel = ta.lineAecNsLevel;
       kWStannisSer.audioJsonConfig = ta.jsonConfig;
       kWStannisSer.enableDeepAec = ta.enableDeepAec;
       AryaAudioEngineProxyImp.f(this.b).updateServerConfig(kWStannisSer);
       this.b.b = kWStannisSer;
       return;
    }
}
