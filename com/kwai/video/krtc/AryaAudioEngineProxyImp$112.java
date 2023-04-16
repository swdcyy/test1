package com.kwai.video.krtc.AryaAudioEngineProxyImp$112;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.String;
import com.kwai.video.stannis.observers.KaraokeScoreObserver;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$d;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$1;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$112 implements Runnable	// class@0006a6
{
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final KaraokeScoreObserver i;
    public final AryaAudioEngineProxyImp j;

    public void AryaAudioEngineProxyImp$112(AryaAudioEngineProxyImp p0,long p1,String p2,String p3,String p4,String p5,String p6,int p7,int p8,KaraokeScoreObserver p9){
       this.j = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       this.h = p8;
       this.i = p9;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AryaAudioEngineProxyImp$112.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp$112 tj = this.j;
       AryaAudioEngineProxyImp.a(tj, new AryaAudioEngineProxyImp$d(tj, objArray));
       AryaAudioEngineProxyImp.z(this.j).b = this.a;
       AryaAudioEngineProxyImp.z(this.j).c = this.b;
       AryaAudioEngineProxyImp.z(this.j).d = this.c;
       AryaAudioEngineProxyImp.z(this.j).e = this.d;
       AryaAudioEngineProxyImp.z(this.j).f = this.e;
       AryaAudioEngineProxyImp.z(this.j).g = this.f;
       AryaAudioEngineProxyImp.z(this.j).h = this.g;
       AryaAudioEngineProxyImp.z(this.j).i = this.h;
       AryaAudioEngineProxyImp.z(this.j).j = this.i;
       AryaAudioEngineProxyImp.f(this.j).startKaraokeScore(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
       return;
    }
}
