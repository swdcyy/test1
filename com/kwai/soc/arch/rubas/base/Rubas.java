package com.kwai.soc.arch.rubas.base.Rubas;
import com.kwai.soc.arch.rubas.base.Rubas$DEFAULT$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import dt7.d;
import java.util.Map;
import jt7.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;

public final class Rubas	// class@001893
{
    public static final p a;
    public static final ConcurrentHashMap b;
    public static final Rubas c;

    static {
       Rubas.c = new Rubas();
       Rubas.a = s.c(Rubas$DEFAULT$2.INSTANCE);
       Rubas.b = new ConcurrentHashMap();
    }
    public void Rubas(){
       super();
    }
    public static final void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, Rubas.class, "5")) {
          return;
       }
       Rubas.f(p0, null, null, null, 14, null);
       return;
    }
    public static final void d(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Rubas.class, "4")) {
          return;
       }
       Rubas.f(p0, p1, null, null, 12, null);
       return;
    }
    public static final void e(String p0,Object p1,Object p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, Rubas.class, "2")) {
          return;
       }
       a.p(p0, "event");
       Rubas.c.a().b(p0, p1, p2, p3);
       return;
    }
    public static void f(String p0,Object p1,Object p2,String p3,int p4,Object p5){
       if (p4 & 0x02) {
          p1 = null;
       }
       Rubas.e(p0, p1, null, null);
       return;
    }
    public static final void g(String p0,String p1){
       a a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Rubas.class, "6")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       Rubas.b.put(p0, p1);
       a = a.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, a, a.class, "4")) {
          a.p(p0, "key");
          a.p(p1, "value");
       }
       return;
    }
    public final d a(){
       Object obj = PatchProxy.apply(null, this, Rubas.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Rubas.a.getValue();
    }
    public final ConcurrentHashMap b(){
       return Rubas.b;
    }
}
