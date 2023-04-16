package com.kwai.video.krtc.AryaAudioEngineProxyImp$63;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.Arya$AryaAudioDeviceStatusListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$63$1;
import com.kwai.video.stannis.observers.StannisAudioDeviceStatusObserver;

public class AryaAudioEngineProxyImp$63 implements Runnable	// class@0006f9
{
    public final Arya$AryaAudioDeviceStatusListener a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$63(AryaAudioEngineProxyImp p0,Arya$AryaAudioDeviceStatusListener p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$63.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.b).setAudioDeviceStatusListener(new AryaAudioEngineProxyImp$63$1(this));
       return;
    }
}
