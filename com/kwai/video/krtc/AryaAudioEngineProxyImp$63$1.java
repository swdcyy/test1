package com.kwai.video.krtc.AryaAudioEngineProxyImp$63$1;
import com.kwai.video.stannis.observers.StannisAudioDeviceStatusObserver;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$63;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.krtc.Arya$AryaAudioDeviceStatusListener;

public class AryaAudioEngineProxyImp$63$1 implements StannisAudioDeviceStatusObserver	// class@0006f8
{
    public final AryaAudioEngineProxyImp$63 a;

    public void AryaAudioEngineProxyImp$63$1(AryaAudioEngineProxyImp$63 p0){
       this.a = p0;
       super();
    }
    public void onAudioDeviceStatusChange(int p0){
       AryaAudioEngineProxyImp$63$1 u63$1 = AryaAudioEngineProxyImp$63$1.class;
       if (PatchProxy.isSupport(u63$1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u63$1, "1")) {
          return;
       }
       this.a.a.onAudioDeviceStatusChange(p0);
       return;
    }
}
