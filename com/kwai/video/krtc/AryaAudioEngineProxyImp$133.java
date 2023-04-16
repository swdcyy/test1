package com.kwai.video.krtc.AryaAudioEngineProxyImp$133;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$133 implements Runnable	// class@0006bf
{
    public final AryaAudioEngineProxyImp a;

    public void AryaAudioEngineProxyImp$133(AryaAudioEngineProxyImp p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$133.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.a).startPcmPlay();
       return;
    }
}
