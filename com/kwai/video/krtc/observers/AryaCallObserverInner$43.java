package com.kwai.video.krtc.observers.AryaCallObserverInner$43;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$43 implements Runnable	// class@0007ab
{
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final AryaCallObserverInner f;

    public void AryaCallObserverInner$43(AryaCallObserverInner p0,String p1,String p2,int p3,int p4,int p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$43.class, "1")) {
          return;
       }
       this.f.onRemoteAudioStateChanged(this.a, this.b, this.c, this.d, this.e);
       return;
    }
}
