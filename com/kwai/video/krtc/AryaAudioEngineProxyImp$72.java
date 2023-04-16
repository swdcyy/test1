package com.kwai.video.krtc.AryaAudioEngineProxyImp$72;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;
import com.kwai.video.stannis.Stannis$KWStannisConfig;
import com.kwai.video.stannis.Stannis$KWStannisServerConfig;
import java.util.concurrent.locks.Lock;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Integer;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$a;

public class AryaAudioEngineProxyImp$72 implements Runnable	// class@000706
{
    public final AryaAudioEngineProxyImp a;

    public void AryaAudioEngineProxyImp$72(AryaAudioEngineProxyImp p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$72.class, "1")) {
          return;
       }
       if (AryaAudioEngineProxyImp.l(this.a)) {
          return;
       }
       int b = true;
       AryaAudioEngineProxyImp.a(this.a, b);
       if (AryaAudioEngineProxyImp.m(this.a)) {
          AryaAudioEngineProxyImp$72 ta = this.a;
          if (ta.a != null && ta.b != null) {
             Stannis stannis = AryaAudioEngineProxyImp.f(ta);
             if (this.a.a.dumpFlag == null) {
                b = false;
             }
             stannis.enableAecDump(b);
             AryaAudioEngineProxyImp.f(this.a).setStannisConfig(this.a.a);
             AryaAudioEngineProxyImp.f(this.a).updateServerConfig(this.a.b);
             AryaAudioEngineProxyImp.f(this.a).startPipelineWithNativePtr(AryaAudioEngineProxyImp.n(this.a), AryaAudioEngineProxyImp.j(this.a));
             ta = this.a;
             AryaAudioEngineProxyImp.a(ta, AryaAudioEngineProxyImp.n(ta));
             AryaAudioEngineProxyImp.o(this.a).lock();
             Iterator iterator = AryaAudioEngineProxyImp.p(this.a).keySet().iterator();
             while (iterator.hasNext()) {
                b = iterator.next().intValue();
                AryaAudioEngineProxyImp$a uoa = AryaAudioEngineProxyImp.p(this.a).get(Integer.valueOf(b));
                AryaAudioEngineProxyImp.f(this.a).AddRxStreamWithNativeDataProvider(b, AryaAudioEngineProxyImp.k(this.a), uoa.a, uoa.b);
                AryaAudioEngineProxyImp.f(this.a).setAudioRxVolume(b, AryaAudioEngineProxyImp.q(this.a));
             }
             AryaAudioEngineProxyImp.o(this.a).unlock();
          }
       }
       return;
    }
}
