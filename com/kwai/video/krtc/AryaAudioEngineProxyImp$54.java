package com.kwai.video.krtc.AryaAudioEngineProxyImp$54;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$54 implements Runnable	// class@0006ee
{
    public final String a;
    public final float b;
    public final AryaAudioEngineProxyImp c;

    public void AryaAudioEngineProxyImp$54(AryaAudioEngineProxyImp p0,String p1,float p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$54.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.c).setAudioRxVolume(AryaAudioEngineProxyImp.b(this.c, this.a), this.b);
       return;
    }
}