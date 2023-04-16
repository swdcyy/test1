package com.kwai.video.krtc.AryaAudioEngineProxyImp$41;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$41 implements Runnable	// class@0006e0
{
    public final boolean a;
    public final int b;
    public final int c;
    public final AryaAudioEngineProxyImp d;

    public void AryaAudioEngineProxyImp$41(AryaAudioEngineProxyImp p0,boolean p1,int p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$41.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.d).setEnableRecordAutoResume(this.a, this.b, this.c);
       return;
    }
}
