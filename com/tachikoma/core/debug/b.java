package com.tachikoma.core.debug.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import com.tkruntime.v8.V8;
import no8.a;
import java.util.Map;
import java.lang.StringBuilder;
import zp8.a;
import com.kuaishou.kds.devtools.v8.V8Inspector;
import java.lang.Long;
import com.kuaishou.kds.devtools.v8.V8InspectorGroup;
import op8.a;
import com.tachikoma.core.debug.a;
import lp8.b;
import lp8.c;
import qp8.d;
import java.util.Objects;
import com.tkruntime.v8.V8Value;
import rp8.a;
import mp8.b;
import lp8.e;
import com.kuaishou.kds.devtools.framework.KdsDevtoolsAgent;
import com.kuaishou.kds.devtools.framework.KdsDevtoolsBackend;
import com.kuaishou.kds.devtools.v8.V8InspectorEventListener;
import com.tachikoma.core.debug.b$a;
import com.kuaishou.kds.devtools.framework.KdsDevtoolsAgentListener;
import android.os.Looper;
import com.tachikoma.core.debug.b$b;
import com.kuaishou.kds.devtools.framework.KdsDevtoolsInspector;
import com.tachikoma.core.debug.d;
import android.content.Context;

public class b	// class@000dbc
{
    public static AtomicInteger a;
    public static AtomicInteger b;
    public static String c;
    public static KdsDevtoolsBackend d;
    public static Map e;
    public static Map f;
    public static Map g;
    public static Map h;
    public static List i;

    static {
       b.a = new AtomicInteger(0);
       b.b = new AtomicInteger(0);
       b.e = new HashMap();
       b.f = new HashMap();
       b.g = new HashMap();
       b.h = new HashMap();
       b.i = new ArrayList();
    }
    public void b(){
       super();
    }
    public static boolean d(){
       Object obj = PatchProxy.apply(null, null, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (b.i.isEmpty() ^ 0x01);
    }
    public void a(V8 p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "6")) {
          return;
       }
       Boolean c = a.c;
       if (!c.booleanValue() || (b.d != null && b.e.containsKey(p1))) {
          a.i("KdsDevtoolsHelper", "disableDebug: "+p1);
          V8Inspector v8Inspector = b.g.remove(p1);
          if (v8Inspector != null) {
             long l = b.h.remove(p1).longValue();
             if (l) {
                v8Inspector.removeContext(l);
             }
             v8Inspector.destroyOnLooperThread();
          }
          V8InspectorGroup v8InspectorG = b.f.remove(p1);
          if (v8InspectorG != null) {
             v8InspectorG.destroy();
          }
          a.n().c(p1);
          if (c.a().t3()) {
             d uod = d.p();
             Objects.requireNonNull(uod);
             if (PatchProxy.applyVoidTwoRefs(p0, p1, uod, d.class, "3") || (c.booleanValue() && c.a().t3())) {
                uod.c(p1);
                uod.c.remove(Long.valueOf(p0.getHandle()));
                uod.d.remove(p0.sessionId);
             }
          }
          a.g().c(p1);
          b.n().c(p1);
          KdsDevtoolsAgent kdsDevtoolsA = b.e.remove(p1);
          if (kdsDevtoolsA != null) {
             b.d.removeAgent(kdsDevtoolsA);
             kdsDevtoolsA.destroy();
          }
       }
    label_00d2 :
       return;
    }
    public void b(V8 p0,String p1,boolean p2,V8InspectorEventListener p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, b.class, "3")) {
          return;
       }
       if (b.d != null && !b.e.containsKey(p1)) {
          a.i("KdsDevtoolsHelper", "enableDebug "+p1+", "+p2+", "+p0.getIsolateHandle()+", "+p0.getContextHandle());
          V8InspectorGroup v8InspectorG = V8InspectorGroup.create(b.d, p0.getIsolateHandle(), true);
          b.f.put(p1, v8InspectorG);
          KdsDevtoolsAgent kdsDevtoolsA = new KdsDevtoolsAgent(b.d, new b$a(this, p1));
          b.e.put(p1, kdsDevtoolsA);
          b.d.addAgent(kdsDevtoolsA);
          V8Inspector v8Inspector = new V8Inspector(kdsDevtoolsA, Looper.getMainLooper(), "V8Inspector", v8InspectorG);
          v8Inspector.addContext(p0.getContextHandle(), p1);
          v8Inspector.setPauseOnStart(p2);
          if (p2) {
             v8Inspector.setEventListener(new b$b(this, p1, p3));
          }
          b.g.put(p1, v8Inspector);
          b.h.put(p1, Long.valueOf(p0.getContextHandle()));
          kdsDevtoolsA.setName(p1);
          kdsDevtoolsA.setPlatform("Android");
          kdsDevtoolsA.addInspector(v8Inspector);
          d uod = new d(p1, kdsDevtoolsA, Looper.getMainLooper(), "TKInspector", "TKInspector");
          kdsDevtoolsA.addInspector("Android");
          a.n().b(p1, "Android");
          if (c.a().t3()) {
             uod = new d(p1, kdsDevtoolsA, Looper.getMainLooper(), "TKProfiler", "TKProfiler");
             kdsDevtoolsA.addInspector(c.a().t3());
             d.p().b(p1, c.a().t3());
          }
          String str = p1;
          KdsDevtoolsAgent kdsDevtoolsA1 = kdsDevtoolsA;
          uod = new d(str, kdsDevtoolsA1, Looper.getMainLooper(), "TKStorage", "TKStorage");
          kdsDevtoolsA.addInspector(c.a().t3());
          a.g().b(p1, c.a().t3());
          uod = new d(str, kdsDevtoolsA1, Looper.getMainLooper(), "TKBridge", "TKBridge");
          kdsDevtoolsA.addInspector(c.a().t3());
          b.n().b(p1, c.a().t3());
       }
       return;
    }
    public void c(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       KdsDevtoolsBackend instance = KdsDevtoolsBackend.getInstance();
       b.d = instance;
       instance.connect(b.c);
       return;
    }
}
