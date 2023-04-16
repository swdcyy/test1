package com.kwai.video.krtc.AryaAudioEngineProxyImp$17;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$17 implements Runnable	// class@0006c4
{
    public final String a;
    public final boolean b;
    public final float c;
    public final AryaAudioEngineProxyImp d;

    public void AryaAudioEngineProxyImp$17(AryaAudioEngineProxyImp p0,String p1,boolean p2,float p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$17.class, "1")) {
          return;
       }
       int i = AryaAudioEngineProxyImp.b(this.d, this.a);
       Log.i("AryaAudioEngineProxyImp", "setRxStreamMixerGain uid = "+this.a+" audio_id= "+i+" enable = "+this.b+" gain = "+this.c);
       AryaAudioEngineProxyImp.f(this.d).SetRxStreamMixerGain(i, this.b, this.c);
       return;
    }
}
