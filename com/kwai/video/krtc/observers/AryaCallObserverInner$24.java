package com.kwai.video.krtc.observers.AryaCallObserverInner$24;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$24 implements Runnable	// class@000796
{
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final AryaCallObserverInner e;

    public void AryaCallObserverInner$24(AryaCallObserverInner p0,String p1,String p2,int p3,int p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$24.class, "1")) {
          return;
       }
       this.e.onRtmpStreamingStateChanged(this.a, this.b, this.c, this.d);
       return;
    }
}
