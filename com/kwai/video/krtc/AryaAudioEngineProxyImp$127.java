package com.kwai.video.krtc.AryaAudioEngineProxyImp$127;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;
import com.kwai.video.stannis.observers.DataReadyObserver;

public class AryaAudioEngineProxyImp$127 implements Runnable	// class@0006b7
{
    public final AryaAudioEngineProxyImp a;

    public void AryaAudioEngineProxyImp$127(AryaAudioEngineProxyImp p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$127.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.a).RemoveAllBypassDataReadyObserver();
       AryaAudioEngineProxyImp.a(this.a, null);
       return;
    }
}
