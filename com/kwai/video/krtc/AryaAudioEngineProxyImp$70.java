package com.kwai.video.krtc.AryaAudioEngineProxyImp$70;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$b;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.stannis.Stannis;
import java.util.ArrayList;
import com.kwai.video.stannis.observers.BgmObserver;

public class AryaAudioEngineProxyImp$70 implements Runnable	// class@000704
{
    public final AryaAudioEngineProxyImp a;

    public void AryaAudioEngineProxyImp$70(AryaAudioEngineProxyImp p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$70.class, "1")) {
          return;
       }
       if (AryaAudioEngineProxyImp.y(this.a) != null && AryaAudioEngineProxyImp.y(this.a).a != null) {
          Log.i("AryaAudioEngineProxyImp", "Restore BGM with position:"+AryaAudioEngineProxyImp.y(this.a).f);
          AryaAudioEngineProxyImp.y(this.a).a = false;
          AryaAudioEngineProxyImp.f(this.a).startBgm(AryaAudioEngineProxyImp.y(this.a).b, AryaAudioEngineProxyImp.y(this.a).c, AryaAudioEngineProxyImp.y(this.a).d, AryaAudioEngineProxyImp.y(this.a).e);
          AryaAudioEngineProxyImp.f(this.a).updateBgmIndex(AryaAudioEngineProxyImp.y(this.a).g, AryaAudioEngineProxyImp.y(this.a).h);
          AryaAudioEngineProxyImp.f(this.a).seekBgm((int)AryaAudioEngineProxyImp.y(this.a).f);
          AryaAudioEngineProxyImp.f(this.a).setBgmPitch(AryaAudioEngineProxyImp.y(this.a).i);
       }
       return;
    }
}
