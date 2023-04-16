package bb6.c;
import bb6.c$b;
import nsd.u;
import bb6.c$a;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import bjd.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class c	// class@000456
{
    public static final x a;
    public static final c$b b;

    static {
       c.b = new c$b(null);
       x ox = Suppliers.a(c$a.b);
       a.o(ox, "Suppliers.memoize {\n    ¡­HostGroups\)\n      }\n    }");
       c.a = ox;
    }
    public void c(){
       super();
    }
    public static final d a(){
       Object obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.b.a();
    }
}
