package com.kwai.video.krtc.observers.AryaCallObserverInner$2;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$2 implements Runnable	// class@00079c
{
    public final String a;
    public final byte[] b;
    public final AryaCallObserverInner c;

    public void AryaCallObserverInner$2(AryaCallObserverInner p0,String p1,byte[] p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$2.class, "1")) {
          return;
       }
       this.c.onNotifyInnerGuestAudioInfoUpdated(this.a, this.b);
       return;
    }
}
