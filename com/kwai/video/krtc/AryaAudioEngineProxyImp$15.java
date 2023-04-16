package com.kwai.video.krtc.AryaAudioEngineProxyImp$15;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$15 implements Runnable	// class@0006c2
{
    public final int a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$15(AryaAudioEngineProxyImp p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$15.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.b).setAudioRecvRange(this.a);
       return;
    }
}
