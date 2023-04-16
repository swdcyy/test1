package com.kwai.video.krtc.AryaAudioEngineProxyImp$125;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.AryaContext;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$125 implements Runnable	// class@0006b4
{
    public final AryaContext a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$125(AryaAudioEngineProxyImp p0,AryaContext p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$125.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.b).setAudioInputVolume(this.a.a);
       AryaAudioEngineProxyImp.f(this.b).setReverbLevel(this.a.b);
       AryaAudioEngineProxyImp.f(this.b).setAudioVoiceEffectOption(this.a.c);
       AryaAudioEngineProxyImp.f(this.b).setMuteMicrophone(this.a.e);
       AryaAudioEngineProxyImp.f(this.b).setMuteSpeaker(this.a.f);
       AryaAudioEngineProxyImp.f(this.b).setSpeakerOn(this.a.g);
       AryaAudioEngineProxyImp.f(this.b).setEnableNoiseSuppression(this.a.h);
       AryaAudioEngineProxyImp.f(this.b).setHowlingSuppressionMode(this.a.i);
       AryaAudioEngineProxyImp$125 ta = this.a;
       AryaAudioEngineProxyImp.f(this.b).setMuteRemote(ta.j, ta.k);
       AryaAudioEngineProxyImp.f(this.b).setBgmVolume(this.a.l);
       AryaAudioEngineProxyImp.f(this.b).setRemoteBgmVolume(this.a.m);
       AryaAudioEngineProxyImp.f(this.b).setMuteBgm(this.a.n);
       AryaAudioEngineProxyImp.f(this.b).setBgmPitch(this.a.o);
       AryaAudioEngineProxyImp.f(this.b).setSoundEffectVolume(this.a.p);
       AryaAudioEngineProxyImp.f(this.b).setMuteSoundEffect(this.a.q);
       AryaAudioEngineProxyImp.f(this.b).enableMixingAudioSegment(this.a.r);
       if (this.a.s != null) {
          AryaAudioEngineProxyImp.f(this.b).enableHeadphoneMonitor(false);
       }else {
          AryaAudioEngineProxyImp.f(this.b).disableHeadphoneMonitor();
       }
       AryaAudioEngineProxyImp.f(this.b).setMuteChatOutBgm(this.a.t);
       AryaAudioEngineProxyImp.f(this.b).setRemoteMixVolume(this.a.v);
       AryaAudioEngineProxyImp.f(this.b).setKtvMode(this.a.w);
       AryaAudioEngineProxyImp.f(this.b).setCompressGain(this.a.x);
       AryaAudioEngineProxyImp.f(this.b).setBgmAutoSeekEnable(this.a.y);
       AryaAudioEngineProxyImp.f(this.b).setAgcMode(this.a.z);
       return;
    }
}
