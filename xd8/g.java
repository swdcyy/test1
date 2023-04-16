package xd8.g;
import z98.b;
import ma8.i;
import java.lang.Object;
import xd8.n;
import java.util.HashMap;
import java.lang.Integer;
import ja8.e;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import xd8.i;
import org.json.JSONObject;
import qc8.a;
import com.mini.js.commonapitracer.c;
import yd8.b;
import ga8.e;
import ga8.g;
import com.mini.js.commonapitracer.c$b;

public abstract class g implements b	// class@002fd4
{
    public final n b;
    public final HashMap c;
    public final HashMap d;
    public i e;
    public j f;

    public void g(i p0){
       super();
       this.b = new n();
       this.c = new HashMap();
       this.d = new HashMap();
       this.e = p0;
    }
    public abstract void b(Integer p0,e p1,int p2,int p3);
    public t d(e p0,int p1){
       if (PatchProxy.isSupport(g.class)) {
          p0 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, g.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       return t.just(Boolean.TRUE);
    }
    public void destroy(){
       Map$Entry uEntry;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "12")) {
          return;
       }
       Iterator iterator = this.c.entrySet().iterator();
       while (iterator.hasNext()) {
          uEntry = iterator.next();
          if (uEntry != null && (uEntry.getValue() != null && uEntry.getValue() instanceof b)) {
             uEntry.getValue().destroy();
          }
       }
       this.c.clear();
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, n.class, "4")) {
          Iterator iterator1 = tb.b.entrySet().iterator();
          while (iterator1.hasNext()) {
             uEntry = iterator1.next();
             if (uEntry.getValue() != null) {
                uEntry.getValue().destroy();
             }
          }
          tb.a.clear();
          tb.b.clear();
       }
       return;
    }
    public String e(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.f().optString(this.i());
    }
    public a f(Integer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.get(p0);
    }
    public abstract c h();
    public abstract String i();
    public final Integer j(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.get(p0);
    }
    public abstract i k(String p0);
    public abstract a l(Integer p0,e p1,Integer p2,int p3);
    public void m(e p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "6")) {
          return;
       }
       this.h().h(this.h().e(p0, e.a(p1.a), p1.a, p1.b, p1.c()), p0);
       return;
    }
}
