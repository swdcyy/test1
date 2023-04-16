package com.kwai.video.krtc.AryaAudioEngineProxyImp$56;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import java.util.concurrent.locks.Lock;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import com.kwai.video.stannis.Stannis;
import java.lang.Integer;

public class AryaAudioEngineProxyImp$56 implements Runnable	// class@0006f0
{
    public final float a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$56(AryaAudioEngineProxyImp p0,float p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$56.class, "1")) {
          return;
       }
       Log.i("AryaAudioEngineProxyImp", "setSpeakerVolume:"+this.a);
       AryaAudioEngineProxyImp.a(this.b, this.a);
       AryaAudioEngineProxyImp.o(this.b).lock();
       Iterator iterator = AryaAudioEngineProxyImp.p(this.b).keySet().iterator();
       while (iterator.hasNext()) {
          AryaAudioEngineProxyImp.f(this.b).setAudioRxVolume(iterator.next().intValue(), this.a);
       }
       AryaAudioEngineProxyImp.o(this.b).unlock();
       return;
    }
}
