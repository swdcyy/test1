package com.kwai.video.krtc.observers.AryaCallObserverInner$17;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$17 implements Runnable	// class@00078e
{
    public final String a;
    public final String b;
    public final AryaCallObserverInner c;

    public void AryaCallObserverInner$17(AryaCallObserverInner p0,String p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$17.class, "1")) {
          return;
       }
       this.c.onScreenCaptureRemoteStart(this.a, this.b);
       return;
    }
}