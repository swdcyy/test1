package com.kwai.video.krtc.AryaAudioEngineProxyImp$87$1;
import com.kwai.video.stannis.observers.StannisAudioSceneObserver;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$87;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.krtc.observers.AudioSceneObserver;

public class AryaAudioEngineProxyImp$87$1 implements StannisAudioSceneObserver	// class@000716
{
    public final AryaAudioEngineProxyImp$87 a;

    public void AryaAudioEngineProxyImp$87$1(AryaAudioEngineProxyImp$87 p0){
       this.a = p0;
       super();
    }
    public void onAudioSceneStart(int p0){
       AryaAudioEngineProxyImp$87$1 u87$1 = AryaAudioEngineProxyImp$87$1.class;
       if (PatchProxy.isSupport(u87$1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u87$1, "1")) {
          return;
       }
       AryaAudioEngineProxyImp$87 a = this.a.a;
       if (a != null) {
          a.onAudioSceneStart(p0);
       }
       return;
    }
    public void onAudioSceneStop(int p0){
       AryaAudioEngineProxyImp$87$1 u87$1 = AryaAudioEngineProxyImp$87$1.class;
       if (PatchProxy.isSupport(u87$1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u87$1, "2")) {
          return;
       }
       AryaAudioEngineProxyImp$87 a = this.a.a;
       if (a != null) {
          a.onAudioSceneStop(p0);
       }
       return;
    }
}
