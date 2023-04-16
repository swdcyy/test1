package ec9.a;
import java.lang.Object;
import java.util.HashMap;
import cc9.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import ec9.k;
import sa6.a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;

public final class a	// class@002164
{
    public final HashMap a;

    public void a(){
       super();
       this.a = new HashMap();
    }
    public final void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       String str = "action";
       a.p(p0, str);
       k ok = this.a.get(Integer.valueOf(p0.a()));
       if (ok == null) {
          throw new IllegalArgumentException("not found action: "+p0.a());
       }
       a.o(ok, "delegateMap[action.type]бн action: ${action.type}\"\)");
       if (!PatchProxy.applyVoidOneRefs(p0, ok, k.class, "1")) {
          a.p(p0, str);
          ok.c(p0);
       }
       return;
    }
    public final Object b(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object obj1 = this.a.get(Integer.valueOf(p0));
       if (!obj1 instanceof Object) {
          obj1 = null;
       }
       return obj1;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       Iterator iterator = this.a.entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().b();
       }
       return;
    }
    public final void d(int p0,k p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       a.p(p1, "delegate");
       this.a.put(Integer.valueOf(p0), p1);
       return;
    }
}
