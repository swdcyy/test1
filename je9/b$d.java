package je9.b$d;
import erd.g;
import je9.b;
import java.lang.Object;
import t4b.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import com.yxcorp.gifshow.model.CustomMagicInfo;

public final class b$d implements g	// class@002a6c
{
    public final b b;

    public void b$d(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "1")) {
       }else {
          b$d tb = this.b;
          a.o(p0, "event");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, b.class, "5")) {
             HashMap hashMap = new HashMap();
             Map map = p0.b();
             map = (map == null || map.isEmpty())? 1: null;
             if (!map) {
                Iterator iterator = p0.b().entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   hashMap.put(String.valueOf(uEntry.getKey().intValue()), uEntry.getValue());
                }
             }
             tb.o.put(p0.a(), hashMap);
             tb.g2(p0.a());
             p0 = tb.r.get(p0.a());
             if (p0 != null) {
                p0.setDefault(false);
             }
          }
       }
       return;
    }
}
