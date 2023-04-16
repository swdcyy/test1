package com.kwai.video.krtc.AryaAudioEngineProxyImp$31;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.stannis.Stannis$KWStannisAudioEffectParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$31 implements Runnable	// class@0006d5
{
    public final boolean a;
    public final Stannis$KWStannisAudioEffectParam b;
    public final AryaAudioEngineProxyImp c;

    public void AryaAudioEngineProxyImp$31(AryaAudioEngineProxyImp p0,boolean p1,Stannis$KWStannisAudioEffectParam p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$31.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.c).setAudioEffectParam(this.a, this.b);
       return;
    }
}
