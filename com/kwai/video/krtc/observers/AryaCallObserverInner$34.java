package com.kwai.video.krtc.observers.AryaCallObserverInner$34;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$34 implements Runnable	// class@0007a1
{
    public final String a;
    public final int b;
    public final boolean c;
    public final Object d;
    public final int e;
    public final AryaCallObserverInner f;

    public void AryaCallObserverInner$34(AryaCallObserverInner p0,String p1,int p2,boolean p3,Object p4,int p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$34.class, "1")) {
          return;
       }
       this.f.onNotifyInnerChangeAudioScene(this.a, this.b, this.c, this.d, this.e);
       return;
    }
}
