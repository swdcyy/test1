package com.kwai.video.krtc.AryaAudioEngineProxyImp$45;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$c;

public class AryaAudioEngineProxyImp$45 implements Runnable	// class@0006e4
{
    public final a$a a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$45(AryaAudioEngineProxyImp p0,a$a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$45.class, "1")) {
          return;
       }
       if (AryaAudioEngineProxyImp.c(this.b).containsKey(this.a)) {
          AryaAudioEngineProxyImp.c(this.b).get(this.a).a = true;
          AryaAudioEngineProxyImp$45 tb = this.b;
          AryaAudioEngineProxyImp.c(tb, AryaAudioEngineProxyImp.j(tb), this.a.b);
          tb = this.b;
          AryaAudioEngineProxyImp.d(tb, AryaAudioEngineProxyImp.k(tb), this.a.b);
          AryaAudioEngineProxyImp.v(this.b);
       }
       return;
    }
}
