package com.kuaishou.krn.apm.memory.KdsLeakDetector$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ki0.c;
import ki0.c$a;
import com.kuaishou.krn.apm.memory.KdsLeakDetector;
import java.util.Objects;
import brd.z;
import lrd.b;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$a$a;
import java.util.concurrent.TimeUnit;
import crd.b;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$a$b;

public final class KdsLeakDetector$a implements Runnable	// class@0007dd
{
    public final Runnable b;

    public void KdsLeakDetector$a(Runnable p0){
       a.p(p0, "command");
       super();
       this.b = p0;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KdsLeakDetector$a.class, "1")) {
          return;
       }
       long l = c.f.a();
       KdsLeakDetector g = KdsLeakDetector.g;
       Objects.requireNonNull(g);
       if (l - KdsLeakDetector.d > 0) {
          Objects.requireNonNull(g);
          KdsLeakDetector.d = l + 5000;
          b.e().e(KdsLeakDetector$a$a.b, 5000, TimeUnit.MILLISECONDS);
       }
       b.e().e(new KdsLeakDetector$a$b(this), 5000, TimeUnit.MILLISECONDS);
       return;
    }
}
