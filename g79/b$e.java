package g79.b$e;
import erd.o;
import java.lang.Object;
import k79.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import kotlin.jvm.internal.a;
import k79.f$b;
import g79.g;
import g79.h;
import erd.a;

public final class b$e implements o	// class@00242b
{
    public final int b;

    public void b$e(int p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, b$e.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.q(p0, "loader");
          ot = f$b.b(p0, this.b, 0, null, 6, null).map(g.b).doOnTerminate(new h(p0));
       }
       return ot;
    }
}
