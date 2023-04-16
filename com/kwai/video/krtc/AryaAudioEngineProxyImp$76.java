package com.kwai.video.krtc.AryaAudioEngineProxyImp$76;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$76 implements Runnable	// class@00070a
{
    public final boolean a;
    public final String b;
    public final AryaAudioEngineProxyImp c;

    public void AryaAudioEngineProxyImp$76(AryaAudioEngineProxyImp p0,boolean p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$76.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.c).setEnableDeepNs(this.a, this.b);
       return;
    }
}
