package com.kwai.video.krtc.observers.AryaCallObserverInner$49;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$49 implements Runnable	// class@0007b1
{
    public final String a;
    public final AryaCallObserverInner b;

    public void AryaCallObserverInner$49(AryaCallObserverInner p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$49.class, "1")) {
          return;
       }
       this.b.onNotifyInnerStopStannis(this.a);
       return;
    }
}
