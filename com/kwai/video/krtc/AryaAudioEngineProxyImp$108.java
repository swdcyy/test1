package com.kwai.video.krtc.AryaAudioEngineProxyImp$108;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.lang.String;
import com.kwai.video.krtc.observers.AudioSegmentPlayerObserver;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.Stannis;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$108$1;
import com.kwai.video.stannis.observers.AudioSegmentPlayerObserver;

public class AryaAudioEngineProxyImp$108 implements Runnable	// class@0006a1
{
    public final String a;
    public final String b;
    public final AudioSegmentPlayerObserver c;
    public final AryaAudioEngineProxyImp d;

    public void AryaAudioEngineProxyImp$108(AryaAudioEngineProxyImp p0,String p1,String p2,AudioSegmentPlayerObserver p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$108.class, "1")) {
          return;
       }
       AryaAudioEngineProxyImp.f(this.d).startPlayAudioSegment(this.a, this.b, new AryaAudioEngineProxyImp$108$1(this));
       return;
    }
}
