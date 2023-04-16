package com.kwai.video.krtc.AryaAudioEngineProxyImp$88;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.observers.AudioSceneObserver;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import com.kwai.video.stannis.observers.StannisAudioSceneObserver;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$88 implements Runnable	// class@000718
{
    public final AudioSceneObserver a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$88(AryaAudioEngineProxyImp p0,AudioSceneObserver p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$88.class, "1")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       StannisAudioSceneObserver stannisAudio = AryaAudioEngineProxyImp.i(this.b).get(this.a);
       AryaAudioEngineProxyImp.i(this.b).remove(this.a);
       Log.i("AryaAudioEngineProxyImp", "removeAudioSceneObserver size:"+AryaAudioEngineProxyImp.i(this.b).size());
       if (stannisAudio != null) {
          AryaAudioEngineProxyImp.f(this.b).removeAudioSceneObserver(stannisAudio);
       }
       return;
    }
}
