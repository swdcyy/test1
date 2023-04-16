package jk0.c;
import java.lang.Object;
import jk0.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.c;
import kotlin.jvm.internal.a;
import jk0.a;
import ukd.a;
import java.lang.Throwable;
import ek0.d;

public final class c	// class@002bba
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public static final b a(){
       c obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.b();
       a.o(obj, "KrnManager.get\(\)");
       if (obj.j()) {
          return a.a;
       }
       Object[] objArray = new Object[0];
       Object obj1 = a.b("com.kuaishou.krn.debug.preference.KdsDebugPreferenceImpl", "get", objArray);
       a.o(obj1, "JavaCalls.callStaticMeth¡­          \"get\"\n        \)");
       return obj1;
    }
}
