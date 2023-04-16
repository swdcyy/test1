package com.kwai.video.krtc.AryaAudioEngineProxyImp$61;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;
import java.util.HashMap;

public class AryaAudioEngineProxyImp$61 implements Runnable	// class@0006f6
{
    public final AryaAudioEngineProxyImp a;

    public void AryaAudioEngineProxyImp$61(AryaAudioEngineProxyImp p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$61.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.a).uninitStannisEngine(AryaAudioEngineProxyImp.e(this.a));
       AryaAudioEngineProxyImp.c(this.a, -1);
       AryaAudioEngineProxyImp.c(this.a).clear();
       AryaAudioEngineProxyImp.i(this.a).clear();
       AryaAudioEngineProxyImp$61 ta = this.a;
       AryaAudioEngineProxyImp.d(ta, AryaAudioEngineProxyImp.j(ta));
       AryaAudioEngineProxyImp.a(this.a, 0);
       ta = this.a;
       AryaAudioEngineProxyImp.e(ta, AryaAudioEngineProxyImp.k(ta));
       AryaAudioEngineProxyImp.b(this.a, 0);
       AryaAudioEngineProxyImp.a(this.a, true);
       AryaAudioEngineProxyImp.a(this.a, 0x3f800000);
       return;
    }
}
