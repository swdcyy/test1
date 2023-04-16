package nz1.b;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import nz1.b$a;
import java.lang.reflect.Type;
import el.a;
import java.lang.Object;
import java.util.Map;
import nz1.a;
import nz1.b$b;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.u1;
import com.kwai.robust.PatchProxyResult;

public final class b	// class@003441
{
    public static Map a;
    public static boolean b;
    public static final b c;

    static {
       boolean b;
       b.c = new b();
       b.a = a.t().u("SOURCE_LIVE").getValue("liveMaterialResourceAdapterMap", new b$a().getType(), null);
       b = a.t().u("SOURCE_LIVE").d("enableLiveMaterialResourceManager", false);
       b.b = b;
       if (b) {
          a c = a.c;
          b$b b1 = b$b.b;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidOneRefs(b1, c, a.class, "1")) {
             a.p(b1, "runnable");
             u1.a(c);
             a.a = b1;
          }
       }
    }
    public void b(){
       super();
    }
    public final String a(String p0,String p1){
       Map obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "oldResKey");
       a.p(p1, "bizKey");
       obj = b.a;
       if (obj != null) {
          Map map = obj.get(p1);
          if (map != null) {
             p0 = map.get(p0);
          label_002d :
             return p0;
          }
       }
       p0 = null;
       goto label_002d ;
    }
    public final boolean b(){
       return b.b;
    }
}
