package com.kwai.video.krtc.utils.e$1;
import com.kwai.video.krtc.utils.e$c;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class e$1 implements e$c	// class@0008c4
{
    public final CountDownLatch a;

    public void e$1(CountDownLatch p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e$1.class, "1")) {
          return;
       }
       this.a.await();
       return;
    }
}
