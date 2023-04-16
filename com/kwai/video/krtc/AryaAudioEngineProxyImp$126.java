package com.kwai.video.krtc.AryaAudioEngineProxyImp$126;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.observers.RawAudioObserver;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$126$1;
import com.kwai.video.stannis.observers.DataReadyObserver;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$126 implements Runnable	// class@0006b6
{
    public final RawAudioObserver a;
    public final int b;
    public final AryaAudioEngineProxyImp c;

    public void AryaAudioEngineProxyImp$126(AryaAudioEngineProxyImp p0,RawAudioObserver p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$126.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.a(this.c, new AryaAudioEngineProxyImp$126$1(this));
       AryaAudioEngineProxyImp.c(this.c, this.b);
       AryaAudioEngineProxyImp.f(this.c).AddBypassDataReadyObserver(AryaAudioEngineProxyImp.t(this.c), AryaAudioEngineProxyImp.u(this.c));
       return;
    }
}
