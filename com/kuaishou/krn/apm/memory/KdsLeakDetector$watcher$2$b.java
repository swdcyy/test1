package com.kuaishou.krn.apm.memory.KdsLeakDetector$watcher$2$b;
import ki0.e;
import java.lang.Object;
import ki0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import android.view.View;
import a2.i0;
import java.lang.Boolean;
import com.kuaishou.krn.apm.memory.KdsLeakDetector;
import jk0.b;
import jk0.c;
import java.lang.StringBuilder;
import java.util.Objects;
import java.lang.Long;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$showToast$1;
import msd.a;
import ev6.f;
import bk0.j;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.t0;

public final class KdsLeakDetector$watcher$2$b implements e	// class@0007ea
{
    public static final KdsLeakDetector$watcher$2$b a;

    static {
       KdsLeakDetector$watcher$2$b.a = new KdsLeakDetector$watcher$2$b();
    }
    public void KdsLeakDetector$watcher$2$b(){
       super();
    }
    public final void a(a p0){
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, KdsLeakDetector$watcher$2$b.class, "1")) {
          return;
       }
       a.p(p0, "kdsKeyedWeakReference");
       Boolean obj = p0.get();
       if (obj != null) {
          String canonicalNam = obj.getClass().getCanonicalName();
          obj = (obj instanceof View)? Boolean.valueOf(i0.X(obj)): "";
          if (canonicalNam != null) {
             KdsLeakDetector g = KdsLeakDetector.g;
             if (!g.b() && c.a().C()) {
                String str = "KDS¶ÔÏóÐ¹Â©1:"+canonicalNam;
                long l = 0x1d4c0;
                Objects.requireNonNull(g);
                KdsLeakDetector kdsLeakDetec = KdsLeakDetector.class;
                if (!PatchProxy.isSupport(kdsLeakDetec) || !PatchProxy.applyVoidTwoRefs(str, Long.valueOf(l), g, kdsLeakDetec, "6")) {
                   f.c(new KdsLeakDetector$showToast$1(str, l));
                }
             }
             Pair[] pairArray = new Pair[]{r0.a("ClassPath", canonicalNam),r0.a("Description", p0.c),r0.a("RetainTime", Long.valueOf((p0.a - p0.d))),r0.a("IsRelease", Boolean.valueOf(g.b())),r0.a("isAttached", obj)};
             j.b.b("kds_leak_report", t0.W(pairArray));
          }
       }
       return;
    }
}
