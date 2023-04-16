package com.kwai.video.krtc.AryaAudioEngineProxyImp$129;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$129 implements Runnable	// class@0006ba
{
    public final AryaAudioEngineProxyImp a;

    public void AryaAudioEngineProxyImp$129(AryaAudioEngineProxyImp p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$129.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.a).pauseAudioBuffer();
       return;
    }
}
