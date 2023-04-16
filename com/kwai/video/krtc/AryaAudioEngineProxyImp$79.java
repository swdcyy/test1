package com.kwai.video.krtc.AryaAudioEngineProxyImp$79;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$79 implements Runnable	// class@00070d
{
    public final String a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$79(AryaAudioEngineProxyImp p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$79.class, "1")) {
          return;
       }
       if (!(this.a).isEmpty()) {
          AryaAudioEngineProxyImp.f(this.b).setDeepAECModelPath(this.a);
       }
       return;
    }
}
