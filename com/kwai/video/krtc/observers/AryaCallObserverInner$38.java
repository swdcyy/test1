package com.kwai.video.krtc.observers.AryaCallObserverInner$38;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$38 implements Runnable	// class@0007a5
{
    public final String a;
    public final boolean b;
    public final AryaCallObserverInner c;

    public void AryaCallObserverInner$38(AryaCallObserverInner p0,String p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$38.class, "1")) {
          return;
       }
       this.c.onLocalPublishFallbackToAudioOnly(this.a, this.b);
       return;
    }
}
