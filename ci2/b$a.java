package ci2.b$a;
import java.lang.Object;
import ci2.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ok.x;
import ci2.a;
import com.google.common.base.Suppliers;
import kotlin.jvm.internal.a;

public final class b$a	// class@000541
{
    public static final b$a a;

    static {
       b$a.a = new b$a();
    }
    public void b$a(){
       super();
    }
    public final b a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b$a uoa = b$a.class;
       Object obj = PatchProxy.apply(null, this, uoa, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       x ox = PatchProxy.apply(null, this, uoa, "1");
       if (ox != patchProxyRe) {
       }else {
          ox = Suppliers.c(Suppliers.a(a.b));
          a.o(ox, "Suppliers.synchronizedSu¡­ice::class.java\)\n      }\)");
       }
       Object obj1 = ox.get();
       a.o(obj1, "sApiSupplier.get\(\)");
       return obj1;
    }
}
