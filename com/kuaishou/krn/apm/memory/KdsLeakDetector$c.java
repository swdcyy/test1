package com.kuaishou.krn.apm.memory.KdsLeakDetector$c;
import java.lang.Runnable;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$c$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.apm.memory.KdsLeakDetector;
import java.util.Objects;
import brd.z;
import lrd.b;
import java.util.concurrent.TimeUnit;
import crd.b;

public final class KdsLeakDetector$c implements Runnable	// class@0007e0
{
    public int b;
    public final Runnable c;
    public final long d;
    public static final KdsLeakDetector$c$a e;

    static {
       KdsLeakDetector$c.e = new KdsLeakDetector$c$a(null);
    }
    public void KdsLeakDetector$c(Runnable p0,long p1){
       a.p(p0, "command");
       super();
       this.c = p0;
       this.d = p1;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KdsLeakDetector$c.class, "1")) {
          return;
       }
       if (this.b > 10) {
          return;
       }
       Objects.requireNonNull(KdsLeakDetector.g);
       if (this.d - KdsLeakDetector.e < 0) {
          this.c.run();
       }else {
          this.b = this.b + 1;
          a.o(b.e().e(this, 5000, TimeUnit.MILLISECONDS), "Schedulers.single\(\).sche¡­L, TimeUnit.MILLISECONDS\)");
       }
       return;
    }
}
