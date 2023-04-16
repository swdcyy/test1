package ap2.c;
import erd.o;
import ap2.g;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import o02.f;
import o02.e;
import hp2.j;
import brd.t;
import ap2.b;

public final class c implements o	// class@0002a7
{
    public final g b;

    public void c(g p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = e.a().j(this.b.g.c(), 3).onErrorResumeNext(b.b);
       }
       return ot;
    }
}
