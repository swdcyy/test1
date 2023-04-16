package ae6.b;
import java.util.List;
import msd.p;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Collection;
import trd.t0;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Integer;

public final class b	// class@000082
{

    public static final Map a(List p0,p p1,p p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "keyAction");
       a.p(p2, "valueAction");
       int i = 0;
       HashMap hashMap = (p0 == null || p0.isEmpty())? 1: null;
       if (hashMap) {
          return t0.z();
       }else {
          hashMap = new HashMap(p0.size());
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             Object obj2 = p1.invoke(Integer.valueOf(i), obj1);
             obj = p2.invoke(Integer.valueOf(i), obj1);
             if (obj2 != null && obj != null) {
                hashMap.put(obj2, obj);
             }
             i = i1;
          }
          return hashMap;
       }
    }
}
