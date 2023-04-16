package com.kwai.video.krtc.AryaAudioEngineProxyImp$50;
import java.util.TimerTask;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class AryaAudioEngineProxyImp$50 extends TimerTask	// class@0006ea
{
    public final AryaAudioEngineProxyImp a;

    public void AryaAudioEngineProxyImp$50(AryaAudioEngineProxyImp p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$50.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.h(this.a);
       return;
    }
}
