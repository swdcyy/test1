package com.kwai.video.krtc.AryaAudioEngineProxyImp$44;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.locks.Lock;
import java.util.HashMap;
import java.lang.Integer;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$44 implements Runnable	// class@0006e3
{
    public final int a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$44(AryaAudioEngineProxyImp p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$44.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.w(this.b).lock();
       AryaAudioEngineProxyImp.p(this.b).remove(Integer.valueOf(this.a));
       AryaAudioEngineProxyImp.w(this.b).unlock();
       AryaAudioEngineProxyImp.f(this.b).RemoveRxStream(this.a);
       return;
    }
}
