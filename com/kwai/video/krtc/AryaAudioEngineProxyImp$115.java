package com.kwai.video.krtc.AryaAudioEngineProxyImp$115;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis$KWStannisConfig;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$115 implements Runnable	// class@0006a9
{
    public final boolean a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$115(AryaAudioEngineProxyImp p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$115.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp$115 tb = this.b;
       AryaAudioEngineProxyImp a = tb.a;
       AryaAudioEngineProxyImp$115 ta = this.a;
       if (a.useExternalDevice != ta) {
          a.useExternalDevice = ta;
          AryaAudioEngineProxyImp.f(tb).setStannisConfig(this.b.a);
       }
       return;
    }
}
