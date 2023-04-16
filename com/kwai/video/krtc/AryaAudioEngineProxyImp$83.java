package com.kwai.video.krtc.AryaAudioEngineProxyImp$83;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$83 implements Runnable	// class@000712
{
    public final AryaAudioEngineProxyImp a;

    public void AryaAudioEngineProxyImp$83(AryaAudioEngineProxyImp p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$83.class, "1")) {
          return;
       }
       if (!AryaAudioEngineProxyImp.l(this.a)) {
          return;
       }
       AryaAudioEngineProxyImp.a(this.a, false);
       if (AryaAudioEngineProxyImp.m(this.a)) {
          AryaAudioEngineProxyImp.f(this.a).stopPipeline();
       }
       return;
    }
}
