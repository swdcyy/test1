package com.kwai.video.krtc.observers.AryaCallObserverInner$31;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$31 implements Runnable	// class@00079e
{
    public final String a;
    public final int b;
    public final AryaCallObserverInner c;

    public void AryaCallObserverInner$31(AryaCallObserverInner p0,String p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$31.class, "1")) {
          return;
       }
       this.c.onRejoinChannelSuccess(this.a, this.b);
       return;
    }
}
