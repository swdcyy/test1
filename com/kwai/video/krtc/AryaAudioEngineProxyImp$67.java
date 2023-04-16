package com.kwai.video.krtc.AryaAudioEngineProxyImp$67;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$b;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$67 implements Runnable	// class@000700
{
    public final AryaAudioEngineProxyImp a;

    public void AryaAudioEngineProxyImp$67(AryaAudioEngineProxyImp p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$67.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.a(this.a, null);
       AryaAudioEngineProxyImp.f(this.a).stopBgm();
       return;
    }
}
