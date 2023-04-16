package com.kwai.video.krtc.AryaAudioEngineProxyImp$106;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$106 implements Runnable	// class@00069e
{
    public final boolean a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$106(AryaAudioEngineProxyImp p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$106.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.b).setMuteSoundEffect(this.a);
       return;
    }
}
