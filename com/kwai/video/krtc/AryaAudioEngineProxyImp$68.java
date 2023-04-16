package com.kwai.video.krtc.AryaAudioEngineProxyImp$68;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$68 implements Runnable	// class@000701
{
    public final AryaAudioEngineProxyImp a;

    public void AryaAudioEngineProxyImp$68(AryaAudioEngineProxyImp p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$68.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.a).pauseBgm();
       return;
    }
}
