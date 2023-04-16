package com.kwai.video.krtc.observers.AryaCallObserverInner$29;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$29 implements Runnable	// class@00079b
{
    public final String a;
    public final String b;
    public final int c;
    public final AryaCallObserverInner d;

    public void AryaCallObserverInner$29(AryaCallObserverInner p0,String p1,String p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$29.class, "1")) {
          return;
       }
       this.d.onJoinChannelSuccess(this.a, this.b, this.c);
       return;
    }
}
