package eub.i$e;
import erd.o;
import eub.i;
import g6c.c;
import java.lang.Object;
import y26.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import eub.n;
import io.reactivex.g;
import brd.t;

public final class i$e implements o	// class@002826
{
    public final i b;
    public final c c;

    public void i$e(i p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, i$e.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "sharePageParamBuilder");
          ot = t.create(new n(this, p0));
       }
       return ot;
    }
}
