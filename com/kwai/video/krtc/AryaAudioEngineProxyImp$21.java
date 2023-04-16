package com.kwai.video.krtc.AryaAudioEngineProxyImp$21;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$21 implements Runnable	// class@0006c9
{
    public final int a;
    public final boolean b;
    public final AryaAudioEngineProxyImp c;

    public void AryaAudioEngineProxyImp$21(AryaAudioEngineProxyImp p0,int p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$21.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.c).enableSpatializer(this.a, this.b);
       return;
    }
}
