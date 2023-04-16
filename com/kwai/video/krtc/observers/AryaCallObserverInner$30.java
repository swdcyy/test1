package com.kwai.video.krtc.observers.AryaCallObserverInner$30;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.ChannelSummaryInfo;

public class AryaCallObserverInner$30 implements Runnable	// class@00079d
{
    public final String a;
    public final int b;
    public final int c;
    public final Object d;
    public final AryaCallObserverInner e;

    public void AryaCallObserverInner$30(AryaCallObserverInner p0,String p1,int p2,int p3,Object p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$30.class, "1")) {
          return;
       }
       this.e.onLeaveChannel(this.a, this.b, this.c, this.d);
       return;
    }
}
