package com.kwai.video.krtc.observers.AryaCallObserverInner$27;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$27 implements Runnable	// class@000799
{
    public final String a;
    public final String b;
    public final int c;
    public final byte[] d;
    public final AryaCallObserverInner e;

    public void AryaCallObserverInner$27(AryaCallObserverInner p0,String p1,String p2,int p3,byte[] p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$27.class, "1")) {
          return;
       }
       this.e.onPassThroughDataReceived(this.a, this.b, this.c, this.d);
       return;
    }
}
