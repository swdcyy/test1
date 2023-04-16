package com.kwai.video.krtc.AryaAudioEngineProxyImp$64$1;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$64;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$b;

public class AryaAudioEngineProxyImp$64$1 implements Runnable	// class@0006fa
{
    public final float a;
    public final AryaAudioEngineProxyImp$64 b;

    public void AryaAudioEngineProxyImp$64$1(AryaAudioEngineProxyImp$64 p0,float p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$64$1.class, "1")) {
          return;
       }
       if (AryaAudioEngineProxyImp.y(this.b.b) != null) {
          AryaAudioEngineProxyImp.y(this.b.b).f = this.a;
       }
       return;
    }
}
