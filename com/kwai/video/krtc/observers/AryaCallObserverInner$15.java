package com.kwai.video.krtc.observers.AryaCallObserverInner$15;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$15 implements Runnable	// class@00078c
{
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final AryaCallObserverInner e;

    public void AryaCallObserverInner$15(AryaCallObserverInner p0,String p1,String p2,boolean p3,int p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$15.class, "1")) {
          return;
       }
       this.e.onRemoteVideoFrozen(this.a, this.b, this.c, this.d);
       return;
    }
}
