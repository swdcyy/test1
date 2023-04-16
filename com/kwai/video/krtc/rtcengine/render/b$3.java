package com.kwai.video.krtc.rtcengine.render.b$3;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.render.b;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.render.GLDrawer;
import com.kwai.video.krtc.GL.EglBase;

public class b$3 implements Runnable	// class@0008b0
{
    public final CountDownLatch a;
    public final b b;

    public void b$3(b p0,CountDownLatch p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$3.class, "1")) {
          return;
       }
       if (b.c(this.b) != null) {
          b.c(this.b).destroy();
          b.a(this.b, null);
       }
       if (b.a(this.b) != null) {
          b.a(this.b).detachCurrent();
          b.a(this.b).release();
          b.a(this.b, null);
       }
       this.a.countDown();
       return;
    }
}
