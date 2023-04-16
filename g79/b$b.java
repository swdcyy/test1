package g79.b$b;
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
import g79.c;
import g79.d;
import erd.a;

public final class b$b implements o	// class@002428
{
    public final int b;

    public void b$b(int p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, b$b.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.q(p0, "loader");
          ot = f$b.b(p0, 0, 0, null, 7, null).map(new c(this)).takeLast(1).doOnTerminate(new d(p0));
       }
       return ot;
    }
}
