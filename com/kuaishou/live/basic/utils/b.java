package com.kuaishou.live.basic.utils.b;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.util.Map;
import com.kuaishou.live.basic.utils.a;
import ok.n;

public class b	// class@000d2a
{
    public static final WeakHashMap a;
    public static final AtomicInteger b;

    static {
       b.a = new WeakHashMap();
       b.b = new AtomicInteger();
    }
    public void b(){
       super();
    }
    public static String a(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getSimpleName()+"."+b.b.incrementAndGet();
    }
    public static boolean b(Object p0,String p1,boolean p2){
       Boolean obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, b.class, "5");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, uob, "6");
       if (obj1 != patchProxyRe) {
          obj = obj1;
       }else {
          p0 = b.a.get(p0);
          if (p0 != null) {
             obj = p0.get(p1);
          }
       }
       if (obj == null) {
          return p2;
       }else {
          return obj.booleanValue();
       }
    }
    public static void c(Object p0,String p1,boolean p2){
       a b;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, b.class, "2")) {
          return;
       }
       Boolean uBoolean = Boolean.valueOf(p2);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, uBoolean, null, b.class, "3")) {
          WeakHashMap a = b.a;
          b = a.b;
          Object obj = PatchProxy.applyThreeRefs(a, p0, b, null, b.class, "7");
          if (obj == PatchProxyResult.class) {
             n.j(a);
             n.j(b);
             obj = a.get(p0);
             if (obj == null) {
                obj = b.apply(p0);
                a.put(p0, obj);
             }
          }
          obj.put(p1, uBoolean);
       }
       return;
    }
}
