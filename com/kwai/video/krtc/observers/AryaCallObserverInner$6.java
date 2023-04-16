package com.kwai.video.krtc.observers.AryaCallObserverInner$6;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$6 implements Runnable	// class@0007b4
{
    public final String a;
    public final AryaCallObserverInner b;

    public void AryaCallObserverInner$6(AryaCallObserverInner p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$6.class, "1")) {
          return;
       }
       this.b.onLocalVideoStats(this.a);
       return;
    }
}
