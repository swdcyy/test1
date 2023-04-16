package com.kwai.video.krtc.AryaAudioEngineProxyImp$66;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$b;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$66 implements Runnable	// class@0006ff
{
    public final int a;
    public final int b;
    public final AryaAudioEngineProxyImp c;

    public void AryaAudioEngineProxyImp$66(AryaAudioEngineProxyImp p0,int p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$66.class, "1")) {
          return;
       }
       if (AryaAudioEngineProxyImp.y(this.c) != null) {
          AryaAudioEngineProxyImp.y(this.c).g = this.a;
          AryaAudioEngineProxyImp.y(this.c).h = this.b;
       }
       AryaAudioEngineProxyImp.f(this.c).updateBgmIndex(this.a, this.b);
       return;
    }
}
