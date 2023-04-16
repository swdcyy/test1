package com.kwai.video.krtc.AryaAudioEngineProxyImp$113;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$d;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$113 implements Runnable	// class@0006a7
{
    public final AryaAudioEngineProxyImp a;

    public void AryaAudioEngineProxyImp$113(AryaAudioEngineProxyImp p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$113.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.a(this.a, null);
       AryaAudioEngineProxyImp.f(this.a).stopKaraokeScore();
       return;
    }
}
