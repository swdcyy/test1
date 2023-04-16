package com.kwai.video.krtc.AryaAudioEngineProxyImp$114;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$d;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.stannis.Stannis;
import com.kwai.video.stannis.observers.KaraokeScoreObserver;

public class AryaAudioEngineProxyImp$114 implements Runnable	// class@0006a8
{
    public final AryaAudioEngineProxyImp a;

    public void AryaAudioEngineProxyImp$114(AryaAudioEngineProxyImp p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$114.class, "1")) {
          return;
       }
       if (AryaAudioEngineProxyImp.z(this.a) != null && AryaAudioEngineProxyImp.z(this.a).a != null) {
          Log.i("AryaAudioEngineProxyImp", "Restore karaokeScore");
          AryaAudioEngineProxyImp.z(this.a).a = false;
          AryaAudioEngineProxyImp.f(this.a).startKaraokeScore(AryaAudioEngineProxyImp.z(this.a).b, AryaAudioEngineProxyImp.z(this.a).c, AryaAudioEngineProxyImp.z(this.a).d, AryaAudioEngineProxyImp.z(this.a).e, AryaAudioEngineProxyImp.z(this.a).f, AryaAudioEngineProxyImp.z(this.a).g, AryaAudioEngineProxyImp.z(this.a).h, AryaAudioEngineProxyImp.z(this.a).i, AryaAudioEngineProxyImp.z(this.a).j);
       }
       return;
    }
}
