package com.kwai.video.krtc.AryaAudioEngineProxyImp$37;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$37 implements Runnable	// class@0006db
{
    public final AryaAudioEngineProxyImp a;

    public void AryaAudioEngineProxyImp$37(AryaAudioEngineProxyImp p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$37.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.a).stopSongSectionScore();
       return;
    }
}
