package com.kwai.video.krtc.AryaAudioEngineProxyImp$25;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$25 implements Runnable	// class@0006cd
{
    public final String a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$25(AryaAudioEngineProxyImp p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$25.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.b).setHrtfModelPath(this.a);
       return;
    }
}
