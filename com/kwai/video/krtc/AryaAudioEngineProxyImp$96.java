package com.kwai.video.krtc.AryaAudioEngineProxyImp$96;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$b;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$96 implements Runnable	// class@000721
{
    public final int a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$96(AryaAudioEngineProxyImp p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$96.class, "1")) {
          return;
       }
       if (AryaAudioEngineProxyImp.y(this.b) != null) {
          AryaAudioEngineProxyImp.y(this.b).i = this.a;
       }
       AryaAudioEngineProxyImp.f(this.b).setBgmPitch(this.a);
       return;
    }
}
