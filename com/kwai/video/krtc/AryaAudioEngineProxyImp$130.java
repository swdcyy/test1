package com.kwai.video.krtc.AryaAudioEngineProxyImp$130;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$130 implements Runnable	// class@0006bc
{
    public final boolean a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$130(AryaAudioEngineProxyImp p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$130.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.b).resumeAudioBuffer(this.a);
       return;
    }
}
