package com.kwai.video.krtc.observers.AryaCallObserverInner$48;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$48 implements Runnable	// class@0007b0
{
    public final String a;
    public final int b;
    public final int c;
    public final AryaCallObserverInner d;

    public void AryaCallObserverInner$48(AryaCallObserverInner p0,String p1,int p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$48.class, "1")) {
          return;
       }
       this.d.onNotifyInnerRemoteBgmProgressUpdate(this.a, this.b, this.c);
       return;
    }
}
