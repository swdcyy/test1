package j69.c$a;
import j69.c;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class c$a	// class@002760
{

    public static t a(c p0){
       p0 = PatchProxy.applyOneRefs(p0, null, c$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       t ot = t.just(Boolean.TRUE);
       a.o(ot, "Observable.just\(true\)");
       return ot;
    }
}
