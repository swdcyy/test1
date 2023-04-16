package com.kwai.video.krtc.observers.AryaCallObserverInner$22;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$22 implements Runnable	// class@000794
{
    public final String a;
    public final int b;
    public final int c;
    public final AryaCallObserverInner d;

    public void AryaCallObserverInner$22(AryaCallObserverInner p0,String p1,int p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$22.class, "1")) {
          return;
       }
       this.d.onConnectionStateChanged(this.a, this.b, this.c);
       return;
    }
}
