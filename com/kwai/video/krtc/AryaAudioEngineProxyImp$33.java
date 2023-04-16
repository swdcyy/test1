package com.kwai.video.krtc.AryaAudioEngineProxyImp$33;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$33 implements Runnable	// class@0006d7
{
    public final int a;
    public final byte[] b;
    public final long c;
    public final AryaAudioEngineProxyImp d;

    public void AryaAudioEngineProxyImp$33(AryaAudioEngineProxyImp p0,int p1,byte[] p2,long p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$33.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.d).startSongSectionScoreWorkshop(this.a, this.b, this.c);
       return;
    }
}
