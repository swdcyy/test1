package com.kwai.video.krtc.observers.AryaCallObserverInner$3;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.String;
import java.nio.ByteBuffer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaCallObserverInner$3 implements Runnable	// class@0007a7
{
    public final String a;
    public final ByteBuffer b;
    public final AryaCallObserverInner c;

    public void AryaCallObserverInner$3(AryaCallObserverInner p0,String p1,ByteBuffer p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaCallObserverInner$3.class, "1")) {
          return;
       }
       this.c.onAudioPassThroughMsg(this.a, this.b);
       return;
    }
}
