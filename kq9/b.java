package kq9.b;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Map;
import kq9.a;
import kq9.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import eq9.b;

public class b	// class@002cff
{
    public final Map a;

    public void b(){
       super();
       this.a = new LinkedHashMap();
    }
    public final Object a(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "type");
       return this.a.get(p0);
    }
    public final void b(a p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       a.p(p0, "module");
       String str = "params";
       a.p(p1, str);
       if (!PatchProxy.applyVoidOneRefs(p1, p0, a.class, "3")) {
          a.p(p1, str);
          p0.d = p1;
          p0.g(p1);
          p0.f();
       }
       this.a.put(p0.getClass(), p0);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          Objects.requireNonNull(uoa);
          if (PatchProxy.applyVoid(null, uoa, a.class, "4")) {
             continue ;
          }else {
             uoa.a.clear();
             uoa.b.clear();
             uoa.c.c();
          }
       }
       return;
    }
}
