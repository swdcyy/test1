package com.kuaishou.krn.apm.memory.KdsLeakDetector$watcher$2$a;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.apm.memory.KdsLeakDetector;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$c;
import ki0.c;
import ki0.c$a;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$a;

public final class KdsLeakDetector$watcher$2$a implements Executor	// class@0007e9
{
    public static final KdsLeakDetector$watcher$2$a b;

    static {
       KdsLeakDetector$watcher$2$a.b = new KdsLeakDetector$watcher$2$a();
    }
    public void KdsLeakDetector$watcher$2$a(){
       super();
    }
    public final void execute(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KdsLeakDetector$watcher$2$a.class, "1")) {
          return;
       }
       if (p0 != null) {
          if (KdsLeakDetector.g.b()) {
             new KdsLeakDetector$c(p0, c.f.a()).run();
          }else {
             new KdsLeakDetector$a(p0).run();
          }
       }
       return;
    }
}
