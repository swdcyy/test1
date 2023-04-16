package cf5.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i0a.b;
import i0a.a;
import cf5.a;
import i0a.a0;
import i0a.z;
import i0a.c0;
import i0a.b0;
import i0a.e0;
import i0a.d0;
import j0a.p;
import j0a.o;
import w7a.b;
import w7a.a;
import bia.n;
import bia.m;
import cqb.b;
import cqb.a;
import l5c.b;
import l5c.a;
import blc.g;
import blc.f;
import m7d.w;
import m7d.v;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Set;

public class b	// class@0006af
{
    public static Set a;

    static {
       if (PatchProxy.applyVoid(null, null, b.class, "1")) {
       }else if(PatchProxy.applyVoid(null, null, b.class, "1")){
          b.a(new a());
       }
       if (!PatchProxy.applyVoid(null, null, a0.class, "1")) {
          b.a(new z());
       }
       if (!PatchProxy.applyVoid(null, null, c0.class, "1")) {
          b.a(new b0());
       }
       if (!PatchProxy.applyVoid(null, null, e0.class, "1")) {
          b.a(new d0());
       }
       if (!PatchProxy.applyVoid(null, null, p.class, "1")) {
          b.a(new o());
       }
       if (!PatchProxy.applyVoid(null, null, b.class, "1")) {
          b.a(new a());
       }
       if (!PatchProxy.applyVoid(null, null, n.class, "1")) {
          b.a(new m());
       }
       if (!PatchProxy.applyVoid(null, null, b.class, "1")) {
          b.a(new a());
       }
       if (!PatchProxy.applyVoid(null, null, b.class, "1")) {
          b.a(new a());
       }
       if (!PatchProxy.applyVoid(null, null, g.class, "1")) {
          b.a(new f());
       }
       if (!PatchProxy.applyVoid(null, null, w.class, "1")) {
          b.a(new v());
       }
    }
    public void b(){
       super();
    }
    public static void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "2")) {
          return;
       }
       if (b.a == null) {
          b.a = new CopyOnWriteArraySet();
       }
       b.a.add(p0);
       return;
    }
}
