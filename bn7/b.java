package bn7.b;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.Class;
import msd.l;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import nsd.s0;
import java.util.Map;
import bn7.a;

public final class b	// class@00042f
{
    public final Map a;

    public void b(){
       super();
       this.a = new LinkedHashMap();
    }
    public final b a(Class p0,l p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "eventClass");
       a.p(p1, "converter");
       this.a.put(p0, s0.q(p1, 1));
       return this;
    }
    public final a b(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this);
    }
}
