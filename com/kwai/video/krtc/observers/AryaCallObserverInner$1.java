package com.kwai.video.krtc.observers.AryaCallObserverInner$1;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$1 implements Runnable	// class@000791
{
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final AryaCallObserverInner g;

    public void AryaCallObserverInner$1(AryaCallObserverInner p0,String p1,int p2,int p3,int p4,String p5,String p6){
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
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$1.class, "1")) {
          return;
       }
       this.g.onNotify(this.a, this.b, this.c, this.d, this.e, this.f);
       return;
    }
}
