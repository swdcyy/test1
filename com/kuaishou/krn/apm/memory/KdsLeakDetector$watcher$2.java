package com.kuaishou.krn.apm.memory.KdsLeakDetector$watcher$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ki0.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$watcher$2$a;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$watcher$2$2;
import java.util.concurrent.Executor;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$watcher$2$b;
import kotlin.jvm.internal.a;
import java.util.Set;

public final class KdsLeakDetector$watcher$2 extends Lambda implements a	// class@0007eb
{
    public static final KdsLeakDetector$watcher$2 INSTANCE;

    static {
       KdsLeakDetector$watcher$2.INSTANCE = new KdsLeakDetector$watcher$2();
    }
    public void KdsLeakDetector$watcher$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final c invoke(){
       c obj = PatchProxy.apply(null, this, KdsLeakDetector$watcher$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c(KdsLeakDetector$watcher$2$a.b, KdsLeakDetector$watcher$2$2.INSTANCE);
       KdsLeakDetector$watcher$2$b a = KdsLeakDetector$watcher$2$b.a;
       _monitor_enter(obj);
       if (PatchProxy.applyVoidOneRefs(a, obj, c.class, "5")) {
          _monitor_exit(obj);
       }else {
          a.p(a, "listener");
          obj.a.add(a);
          _monitor_exit(obj);
       }
       return obj;
    }
}
