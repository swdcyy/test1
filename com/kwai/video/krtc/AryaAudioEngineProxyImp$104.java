package com.kwai.video.krtc.AryaAudioEngineProxyImp$104;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.Arya$AryaConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;
import com.kwai.video.stannis.Stannis$KWStannisConfig;

public class AryaAudioEngineProxyImp$104 implements Runnable	// class@00069c
{
    public final Arya$AryaConfig a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$104(AryaAudioEngineProxyImp p0,Arya$AryaConfig p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$104.class, "1")) {
          return;
       }
       Stannis$KWStannisConfig stannisConfi = AryaAudioEngineProxyImp.f(this.b).getStannisConfig();
       AryaAudioEngineProxyImp$104 ta = this.a;
       stannisConfi.qosFlag = ta.qosEnableFlag;
       stannisConfi.qosUploadInterval = ta.qosUploadInterval;
       stannisConfi.activeSpeakerHangOverInterval = (long)ta.speakerInactiveMinIntervalMs;
       stannisConfi.dumpPath = ta.dumpPath;
       stannisConfi.dumpFlag = (int)(ta.dumpEnableFlag & 0xffff);
       stannisConfi.enableAudioVad = ta.enableAudioVad;
       stannisConfi.useExternalDevice = ta.useExternalAudioDevice;
       stannisConfi.audioChannel = 2;
       stannisConfi.audioOutputChannel = 2;
       stannisConfi.activeSpeakerForceNotifyInterval = ta.activeSpeakerForceNotifyInterval;
       Stannis stannis = AryaAudioEngineProxyImp.f(this.b);
       boolean b = (stannisConfi.dumpFlag != null)? true: false;
       stannis.enableAecDump(b);
       AryaAudioEngineProxyImp.f(this.b).setStannisConfig(stannisConfi);
       ta = this.b;
       ta.a = stannisConfi;
       AryaAudioEngineProxyImp.a(ta, this.a.appUserId);
       return;
    }
}
