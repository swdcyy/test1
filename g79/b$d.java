package g79.b$d;
import erd.o;
import java.lang.Object;
import k79.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import kotlin.jvm.internal.a;
import g79.e;
import g79.f;
import erd.a;

public final class b$d implements o	// class@00242a
{
    public final int b;

    public void b$d(int p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, b$d.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.q(p0, "loader");
          ot = p0.c(0, (this.b - 1)).map(e.b).doOnTerminate(new f(p0));
       }
       return ot;
    }
}
