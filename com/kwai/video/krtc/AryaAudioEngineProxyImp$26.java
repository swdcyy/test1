package com.kwai.video.krtc.AryaAudioEngineProxyImp$26;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.observers.AryaRawAudioFrameObserver;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$26$1;
import com.kwai.video.stannis.observers.AudioFrameObserver;

public class AryaAudioEngineProxyImp$26 implements Runnable	// class@0006cf
{
    public final AryaRawAudioFrameObserver a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$26(AryaAudioEngineProxyImp p0,AryaRawAudioFrameObserver p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$26.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.b).registerAudioFrameObserver(new AryaAudioEngineProxyImp$26$1(this));
       return;
    }
}
