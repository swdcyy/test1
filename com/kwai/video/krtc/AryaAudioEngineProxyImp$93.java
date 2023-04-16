package com.kwai.video.krtc.AryaAudioEngineProxyImp$93;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$93 implements Runnable	// class@00071e
{
    public final float a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$93(AryaAudioEngineProxyImp p0,float p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$93.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.b).setRemoteMixVolume(this.a);
       return;
    }
}
