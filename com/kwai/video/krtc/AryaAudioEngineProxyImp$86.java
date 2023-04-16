package com.kwai.video.krtc.AryaAudioEngineProxyImp$86;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$86 implements Runnable	// class@000715
{
    public final byte[] a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final AryaAudioEngineProxyImp f;

    public void AryaAudioEngineProxyImp$86(AryaAudioEngineProxyImp p0,byte[] p1,int p2,int p3,int p4,long p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$86.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.f).inputSpeakerAudio(this.a, this.b, this.c, this.d, this.e);
       return;
    }
}
