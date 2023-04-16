package com.kwai.video.krtc.AryaAudioEngineProxyImp$65;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.util.ArrayList;
import com.kwai.video.stannis.observers.BgmObserver;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$b;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$1;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$65 implements Runnable	// class@0006fe
{
    public final ArrayList a;
    public final boolean b;
    public final int c;
    public final BgmObserver d;
    public final ArrayList e;
    public final AryaAudioEngineProxyImp f;

    public void AryaAudioEngineProxyImp$65(AryaAudioEngineProxyImp p0,ArrayList p1,boolean p2,int p3,BgmObserver p4,ArrayList p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AryaAudioEngineProxyImp$65.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp$65 tf = this.f;
       AryaAudioEngineProxyImp.a(tf, new AryaAudioEngineProxyImp$b(tf, objArray));
       boolean b = false;
       AryaAudioEngineProxyImp.y(this.f).a = b;
       AryaAudioEngineProxyImp.y(this.f).b = this.a;
       AryaAudioEngineProxyImp.y(this.f).c = this.b;
       AryaAudioEngineProxyImp.y(this.f).d = this.c;
       AryaAudioEngineProxyImp.y(this.f).e = this.d;
       AryaAudioEngineProxyImp.y(this.f).f = 0;
       if (this.a.size() >= 2) {
          AryaAudioEngineProxyImp.y(this.f).g = b;
          AryaAudioEngineProxyImp.y(this.f).h = 1;
       }else {
          AryaAudioEngineProxyImp.y(this.f).h = b;
          AryaAudioEngineProxyImp.y(this.f).g = b;
       }
       if (this.e == null) {
          AryaAudioEngineProxyImp.f(this.f).startBgm(this.a, this.b, this.c, this.d);
       }else {
          AryaAudioEngineProxyImp.f(this.f).startBgm(this.a, this.e, this.b, this.c, this.d);
       }
       return;
    }
}
