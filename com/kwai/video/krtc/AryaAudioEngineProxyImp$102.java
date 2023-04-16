package com.kwai.video.krtc.AryaAudioEngineProxyImp$102;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.String;
import com.kwai.video.stannis.observers.BgmObserver;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$102 implements Runnable	// class@00069a
{
    public final String a;
    public final BgmObserver b;
    public final AryaAudioEngineProxyImp c;

    public void AryaAudioEngineProxyImp$102(AryaAudioEngineProxyImp p0,String p1,BgmObserver p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$102.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.c).playSoundEffect(this.a, this.b);
       return;
    }
}
