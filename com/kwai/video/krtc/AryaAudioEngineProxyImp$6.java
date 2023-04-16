package com.kwai.video.krtc.AryaAudioEngineProxyImp$6;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.stannis.observers.DataReadyObserver;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$6 implements Runnable	// class@000703
{
    public final DataReadyObserver a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$6(AryaAudioEngineProxyImp p0,DataReadyObserver p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$6.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.b).startMultipleStreamMix(this.a);
       return;
    }
}
