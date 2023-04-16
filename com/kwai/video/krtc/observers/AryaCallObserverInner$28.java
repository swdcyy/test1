package com.kwai.video.krtc.observers.AryaCallObserverInner$28;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$28 implements Runnable	// class@00079a
{
    public final int a;
    public final AryaCallObserverInner b;

    public void AryaCallObserverInner$28(AryaCallObserverInner p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$28.class, "1")) {
          return;
       }
       this.b.onLastmileQuality(this.a);
       return;
    }
}
