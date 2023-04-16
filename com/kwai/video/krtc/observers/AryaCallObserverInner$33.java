package com.kwai.video.krtc.observers.AryaCallObserverInner$33;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$33 implements Runnable	// class@0007a0
{
    public final String a;
    public final String b;
    public final boolean c;
    public final AryaCallObserverInner d;

    public void AryaCallObserverInner$33(AryaCallObserverInner p0,String p1,String p2,boolean p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$33.class, "1")) {
          return;
       }
       this.d.onLocalMutedRemoteVideo(this.a, this.b, this.c);
       return;
    }
}
