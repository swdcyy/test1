package com.kwai.video.krtc.AryaAudioEngineProxyImp$87;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.observers.AudioSceneObserver;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import java.util.HashMap;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$87$1;
import com.kwai.video.stannis.Stannis;
import com.kwai.video.stannis.observers.StannisAudioSceneObserver;

public class AryaAudioEngineProxyImp$87 implements Runnable	// class@000717
{
    public final AudioSceneObserver a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$87(AryaAudioEngineProxyImp p0,AudioSceneObserver p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$87.class, "1")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       String str = "AryaAudioEngineProxyImp";
       Log.i(str, "[addAudioSceneObserver] audioSceneObserver:"+this.a);
       if (AryaAudioEngineProxyImp.i(this.b).containsKey(this.a)) {
          Log.i(str, "[addAudioSceneObserver] audioSceneDelegateMap contains:"+this.a);
          return;
       }else {
          AryaAudioEngineProxyImp$87$1 u87$1 = new AryaAudioEngineProxyImp$87$1(this);
          AryaAudioEngineProxyImp.i(this.b).put(this.a, u87$1);
          Log.i(str, "[addAudioSceneObserver] stannisAudioSceneObserver:"+u87$1);
          AryaAudioEngineProxyImp.f(this.b).addAudioSceneObserver(u87$1);
          return;
       }
    }
}
