package bn7.a;
import bn7.c;
import bn7.a$a;
import nsd.u;
import bn7.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Map;
import trd.t0;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import msd.l;
import java.util.LinkedHashMap;
import trd.s0;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import hn7.i;
import kotlin.Pair;
import qrd.r0;

public final class a implements c	// class@00042e
{
    public final Map a;
    public static final a b;
    public static final a$a c;

    static {
       a.c = new a$a(null);
       a.b = new b().b();
    }
    public void a(b p0){
       a.p(p0, "builder");
       super();
       this.a = t0.D0(p0.a);
    }
    public Map a(GeneratedMessageLite p0){
       Map map;
       l obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "event");
       obj = this.a.get(p0.getClass());
       if (obj != null) {
          map = obj.invoke(p0);
          if (map != null) {
          label_002f :
             return map;
          }
       }
       map = t0.z();
       goto label_002f ;
    }
    public Map b(GeneratedMessageLite p0){
       LinkedHashMap linkedHashMa;
       l obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "event");
       obj = this.a.get(p0.getClass());
       if (obj != null) {
          Map map = obj.invoke(p0);
          if (map != null) {
             linkedHashMa = new LinkedHashMap(s0.j(map.size()));
             Iterator iterator = map.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                Object key = uEntry.getKey();
                linkedHashMa.put(key, uEntry.getValue().toString());
             }
             return t0.n0(linkedHashMa, s0.k(r0.a("data.type", i.a(p0))));
          }
       }
       linkedHashMa = new LinkedHashMap();
       goto label_0060 ;
    }
}
