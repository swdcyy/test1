package com.kwai.video.krtc.AryaAudioEngineProxyImp$5;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$5 implements Runnable	// class@0006f4
{
    public final float a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$5(AryaAudioEngineProxyImp p0,float p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$5.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.b).setPcmPlayVolume(this.a);
       return;
    }
}
