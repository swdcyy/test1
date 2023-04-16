package gna.c;
import gna.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import gna.b$a;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.lang.Long;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import cra.c0;
import fna.f;

public final class c	// class@002b2c
{

    public static final long a(b p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       a.p(p0, "$this$getSelectedSize");
       long l = 0;
       if (p0 instanceof b$a) {
          List list = p0.z();
          obj = new ArrayList(u.Y(list, 10));
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             obj.add(Long.valueOf(c.a(iterator.next())));
          }
          l = CollectionsKt___CollectionsKt.p5(obj);
       }else if(!p0.l()){
          c0 uoc0 = p0.j();
          if (uoc0 != null) {
             Long longx = uoc0.f();
             if (longx != null) {
                l = longx.longValue();
             }
          }
       }
       return l;
    }
    public static final void b(b$a p0){
       long l1;
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "2")) {
          return;
       }
       a.p(p0, "$this$updateDesc");
       long l = c.a(p0);
       c0 uoc0 = p0.j();
       if (uoc0 != null) {
          Long longx = uoc0.f();
          if (longx != null) {
             l1 = longx.longValue();
          label_002c :
             p0.n(f.a(l, l1));
             return;
          }
       }
       l1 = 0;
       goto label_002c ;
    }
}
