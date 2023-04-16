package com.kwai.video.krtc.AryaAudioEngineProxyImp$128;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.String;
import com.kwai.video.krtc.observers.AudioBufferPlayObserver;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$128$1;
import com.kwai.video.stannis.observers.AudioBufferPlayObserver;

public class AryaAudioEngineProxyImp$128 implements Runnable	// class@0006b9
{
    public final String a;
    public final byte[] b;
    public final float c;
    public final boolean d;
    public final AudioBufferPlayObserver e;
    public final AryaAudioEngineProxyImp f;

    public void AryaAudioEngineProxyImp$128(AryaAudioEngineProxyImp p0,String p1,byte[] p2,float p3,boolean p4,AudioBufferPlayObserver p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$128.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.f).playAudioBuffer(this.a, this.b, this.c, this.d, new AryaAudioEngineProxyImp$128$1(this));
       return;
    }
}
