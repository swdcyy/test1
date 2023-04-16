package com.kwai.video.krtc.AryaAudioEngineProxyImp$99;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$99 implements Runnable	// class@000724
{
    public final String a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$99(AryaAudioEngineProxyImp p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$99.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.b).loadSoundEffectCache(this.a);
       return;
    }
}
