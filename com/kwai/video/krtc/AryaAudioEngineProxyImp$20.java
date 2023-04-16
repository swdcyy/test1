package com.kwai.video.krtc.AryaAudioEngineProxyImp$20;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$20 implements Runnable	// class@0006c8
{
    public final int a;
    public final boolean b;
    public final AryaAudioEngineProxyImp c;

    public void AryaAudioEngineProxyImp$20(AryaAudioEngineProxyImp p0,int p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$20.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.c).enableAttenuation(this.a, this.b);
       return;
    }
}
