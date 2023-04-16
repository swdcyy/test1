package com.kwai.video.krtc.observers.AryaCallObserverInner$23;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$23 implements Runnable	// class@000795
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final AryaCallObserverInner e;

    public void AryaCallObserverInner$23(AryaCallObserverInner p0,int p1,int p2,int p3,int p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$23.class, "1")) {
          return;
       }
       this.e.onVideoSendParamChanged(this.a, this.b, this.c, this.d);
       return;
    }
}
