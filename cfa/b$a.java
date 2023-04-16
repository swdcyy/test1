package cfa.b$a;
import cfa.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class b$a	// class@0004f4
{

    public static String a(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String simpleName = p0.getClass().getSimpleName();
       a.o(simpleName, "this::class.java.simpleName");
       return simpleName;
    }
}
