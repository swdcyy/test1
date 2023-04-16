package com.kwai.video.krtc.AryaAudioEngineProxyImp$46;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import com.kwai.video.stannis.Stannis;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$c;
import com.kwai.video.stannis.observers.DataReadyObserver;

public class AryaAudioEngineProxyImp$46 implements Runnable	// class@0006e5
{
    public final a$a a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$46(AryaAudioEngineProxyImp p0,a$a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$46.class, "1")) {
          return;
       }
       if (AryaAudioEngineProxyImp.c(this.b).containsKey(this.a)) {
          AryaAudioEngineProxyImp$46 tb = this.b;
          AryaAudioEngineProxyImp.a(tb, AryaAudioEngineProxyImp.j(tb), this.a.b);
          tb = this.b;
          AryaAudioEngineProxyImp.b(tb, AryaAudioEngineProxyImp.k(tb), this.a.b);
          boolean b = false;
          if (AryaAudioEngineProxyImp.s(this.b)) {
             AryaAudioEngineProxyImp.f(this.b).resume();
             AryaAudioEngineProxyImp.b(this.b, b);
          }
          AryaAudioEngineProxyImp$c uoc = AryaAudioEngineProxyImp.c(this.b).get(this.a);
          uoc.a = b;
          if (uoc.b != AryaAudioEngineProxyImp.n(this.b)) {
             if (AryaAudioEngineProxyImp.l(this.b)) {
                AryaAudioEngineProxyImp.f(this.b).startPipelineWithNativePtr(uoc.b, AryaAudioEngineProxyImp.j(this.b));
             }
             AryaAudioEngineProxyImp.b(this.b, uoc.b);
             tb = this.b;
             AryaAudioEngineProxyImp.a(tb, AryaAudioEngineProxyImp.n(tb));
             AryaAudioEngineProxyImp.c(this.b, true);
             if (AryaAudioEngineProxyImp.t(this.b) != null) {
                AryaAudioEngineProxyImp.f(this.b).AddBypassDataReadyObserver(AryaAudioEngineProxyImp.t(this.b), AryaAudioEngineProxyImp.u(this.b));
             }
          }
       }
    label_00b1 :
       return;
    }
}
