package com.kwai.video.krtc.AryaAudioEngineProxyImp$123;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.stannis.Stannis;
import com.kwai.video.stannis.Stannis$KWStannisConfig;

public class AryaAudioEngineProxyImp$123 implements Runnable	// class@0006b2
{
    public final boolean a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$123(AryaAudioEngineProxyImp p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$123.class, "1")) {
          return;
       }
       Log.i("AryaAudioEngineProxyImp", "setAudioStereo stereo:"+this.a);
       Stannis$KWStannisConfig stannisConfi = AryaAudioEngineProxyImp.f(this.b).getStannisConfig();
       AryaAudioEngineProxyImp$123 ta = this.a;
       int i = 2;
       int i1 = (ta != null)? 2: 1;
       stannisConfi.audioChannel = i1;
       if (ta == null) {
          i = 1;
       }
       stannisConfi.audioOutputChannel = i;
       AryaAudioEngineProxyImp.f(this.b).setStannisConfig(stannisConfi);
       return;
    }
}
