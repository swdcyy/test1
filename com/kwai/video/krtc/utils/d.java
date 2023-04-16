package com.kwai.video.krtc.utils.d;
import com.kwai.video.krtc.utils.d$a;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d	// class@0008c3
{
    public final AtomicInteger a;
    public long b;
    public d$a c;

    public void d(d$a p0,long p1){
       super();
       this.a = new AtomicInteger(1);
       this.b = 0;
       this.c = p0;
       this.b = p1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.a.incrementAndGet();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       if (!this.a.decrementAndGet()) {
          d tc = this.c;
          if (tc != null) {
             tc.release(this.b);
             this.c = null;
          }
       }
       return;
    }
}
