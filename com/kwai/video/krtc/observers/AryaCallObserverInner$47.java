package com.kwai.video.krtc.observers.AryaCallObserverInner$47;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$47 implements Runnable	// class@0007af
{
    public final String a;
    public final int b;
    public final AryaCallObserverInner c;

    public void AryaCallObserverInner$47(AryaCallObserverInner p0,String p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$47.class, "1")) {
          return;
       }
       this.c.onNotifyInnerKtvBgmStart(this.a, this.b);
       return;
    }
}
