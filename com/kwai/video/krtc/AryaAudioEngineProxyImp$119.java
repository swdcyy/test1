package com.kwai.video.krtc.AryaAudioEngineProxyImp$119;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$119 implements Runnable	// class@0006ad
{
    public final float a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$119(AryaAudioEngineProxyImp p0,float p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$119.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.b).setCompressGain(this.a);
       return;
    }
}
