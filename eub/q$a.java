package eub.q$a;
import erd.o;
import eub.q;
import java.lang.Object;
import y26.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import eub.p;
import io.reactivex.g;
import brd.t;

public final class q$a implements o	// class@002832
{
    public final q b;

    public void q$a(q p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, q$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "sharePageParamBuilder");
          ot = t.create(new p(this, p0));
       }
       return ot;
    }
}
