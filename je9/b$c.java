package je9.b$c;
import erd.g;
import je9.b;
import java.lang.Object;
import t4b.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.HashMap;
import java.util.Map;
import com.yxcorp.gifshow.model.CustomMagicInfo;

public final class b$c implements g	// class@002a6b
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
       }else {
          b$c tb = this.b;
          a.o(p0, "event");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, b.class, "4")) {
             Map map = tb.o.get(p0.b());
             if (map == null) {
                if (!p0.d()) {
                   HashMap hashMap = new HashMap();
                   hashMap.put(String.valueOf(p0.a()), p0.c());
                   tb.o.put(p0.b(), hashMap);
                }
             }else if(map instanceof HashMap){
                if (p0.d()) {
                   map.remove(String.valueOf(p0.a()));
                }else {
                   map.put(String.valueOf(p0.a()), p0.c());
                }
             }
             tb.g2(p0.b());
             p0 = tb.r.get(p0.b());
             if (p0 != null) {
                p0.setDefault(false);
             }
          }
       }
       return;
    }
}
