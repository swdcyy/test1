package com.kwai.video.krtc.AryaAudioEngineProxyImp$24;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$24 implements Runnable	// class@0006cc
{
    public final a$a a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$24(AryaAudioEngineProxyImp p0,a$a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$24.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp$24 tb = this.b;
       AryaAudioEngineProxyImp.c(tb, AryaAudioEngineProxyImp.j(tb), this.a.b);
       tb = this.b;
       AryaAudioEngineProxyImp.d(tb, AryaAudioEngineProxyImp.k(tb), this.a.b);
       AryaAudioEngineProxyImp.c(this.b).remove(this.a);
       Log.i("AryaAudioEngineProxyImp", "stop delegateMap size:"+AryaAudioEngineProxyImp.c(this.b).size());
       if (AryaAudioEngineProxyImp.c(this.b).isEmpty()) {
          AryaAudioEngineProxyImp.f(this.b).stopPipeline();
          AryaAudioEngineProxyImp.c(this.b, false);
          AryaAudioEngineProxyImp.a(this.b, false);
       }else {
          AryaAudioEngineProxyImp.v(this.b);
       }
       return;
    }
}
