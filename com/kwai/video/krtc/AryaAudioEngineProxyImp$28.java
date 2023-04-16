package com.kwai.video.krtc.AryaAudioEngineProxyImp$28;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$28 implements Runnable	// class@0006d1
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final AryaAudioEngineProxyImp e;

    public void AryaAudioEngineProxyImp$28(AryaAudioEngineProxyImp p0,int p1,int p2,int p3,int p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$28.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.e).setPlaybackAudioFrameParameters(this.a, this.b, this.c, this.d);
       return;
    }
}
