package com.kwai.video.krtc.AryaAudioEngineProxyImp$22;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$22 implements Runnable	// class@0006ca
{
    public final int[] a;
    public final float[] b;
    public final float[] c;
    public final float[] d;
    public final AryaAudioEngineProxyImp e;

    public void AryaAudioEngineProxyImp$22(AryaAudioEngineProxyImp p0,int[] p1,float[] p2,float[] p3,float[] p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$22.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.e).updateSelfPosition(this.a, this.b, this.c, this.d);
       return;
    }
}
