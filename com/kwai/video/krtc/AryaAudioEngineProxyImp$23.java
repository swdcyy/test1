package com.kwai.video.krtc.AryaAudioEngineProxyImp$23;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$23 implements Runnable	// class@0006cb
{
    public final int a;
    public final int b;
    public final AryaAudioEngineProxyImp c;

    public void AryaAudioEngineProxyImp$23(AryaAudioEngineProxyImp p0,int p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$23.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.c).setHrtfMode(this.a, this.b);
       return;
    }
}
