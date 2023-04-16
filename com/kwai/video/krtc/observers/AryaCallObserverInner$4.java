package com.kwai.video.krtc.observers.AryaCallObserverInner$4;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.nio.ByteBuffer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$4 implements Runnable	// class@0007b2
{
    public final String a;
    public final ByteBuffer b;
    public final AryaCallObserverInner c;

    public void AryaCallObserverInner$4(AryaCallObserverInner p0,String p1,ByteBuffer p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$4.class, "1")) {
          return;
       }
       this.c.onVoiceComment(this.a, this.b);
       return;
    }
}
