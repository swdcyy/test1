package com.kwai.video.krtc.AryaAudioEngineProxyImp$10;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$10 implements Runnable	// class@0006a3
{
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final AryaAudioEngineProxyImp g;

    public void AryaAudioEngineProxyImp$10(AryaAudioEngineProxyImp p0,int p1,byte[] p2,int p3,int p4,int p5,long p6){
       this.g = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$10.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.g).inputTrackData(this.a, this.b, this.c, this.d, this.e, this.f);
       return;
    }
}
