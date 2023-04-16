package com.kuaishou.krn.apm.memory.KdsLeakDetector$d;
import java.lang.Runnable;
import java.lang.ref.WeakReference;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.krn.apm.memory.KdsLeakDetector;
import java.util.Objects;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$b;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import ki0.c;
import kotlin.jvm.internal.a;
import java.util.Map;
import msd.a;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import ki0.a;
import java.util.UUID;
import ki0.c$a;
import java.lang.ref.ReferenceQueue;
import ki0.d;
import java.util.concurrent.Executor;

public final class KdsLeakDetector$d implements Runnable	// class@0007e1
{
    public final WeakReference b;
    public final l c;
    public final l d;
    public final long e;

    public void KdsLeakDetector$d(WeakReference p0,l p1,l p2,long p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       KdsLeakDetector$b a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KdsLeakDetector$d.class, "1")) {
          return;
       }
       Object obj = this.b.get();
       if (obj != null && this.c.invoke(obj).booleanValue()) {
          KdsLeakDetector g = KdsLeakDetector.g;
          if (!g.b()) {
             Objects.requireNonNull(g);
             a = KdsLeakDetector.a;
             if (a != null) {
                a.a(obj, this.d.invoke(obj).toString(), this.e);
             }
          }
          Objects.requireNonNull(g);
          c uoc = PatchProxy.apply(objArray, g, KdsLeakDetector.class, "1");
          if (uoc == PatchProxyResult.class) {
             uoc = KdsLeakDetector.f.getValue();
          }
          a.o(obj, "it");
          Object obj1 = this.d.invoke(obj);
          _monitor_enter(uoc);
          if (PatchProxy.applyVoidTwoRefs(obj, obj1, uoc, c.class, "7")) {
             _monitor_exit(uoc);
          }else {
             a.p(obj, "watchedObject");
             a.p(obj1, "description");
             if (!uoc.e.invoke().booleanValue()) {
                _monitor_exit(uoc);
             }else {
                uoc.a();
                LinkedHashMap linkedHashMa = new LinkedHashMap();
                Iterator iterator = uoc.b.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   if (a.g(uEntry.getValue().get(), obj)) {
                      linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
                   }
                }
                if (linkedHashMa.isEmpty() ^ 0x01) {
                   _monitor_exit(uoc);
                }else {
                   String str = UUID.randomUUID().toString();
                   a.o(str, "UUID.randomUUID\(\).toString\(\)");
                   a uoa = new a(obj, str, obj1, c.f.a(), uoc.c);
                   uoc.b.put(str, linkedHashMa);
                   uoc.d.execute(new d(uoc, str));
                   _monitor_exit(uoc);
                }
             }
          }
       }
       return;
    }
}
