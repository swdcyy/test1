package gra.q;
import erd.o;
import gra.v;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.Objects;
import brd.t;
import gra.t;
import io.reactivex.g;
import t45.d;
import brd.z;
import gra.p;

public final class q implements o	// class@002bc1
{
    public final v b;

    public void q(v p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.applyOneRefs(p0, this, q.class, "1");
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             ot = PatchProxy.apply(null, p0, v.class, "20");
             if (ot != patchProxyRe) {
             }else {
                ot = t.create(new t(p0));
                a.o(ot, "Observable.create { emit¡­plete\(\)\n          }\n    }");
             }
             p0 = ot.observeOn(d.b).flatMap(new p(this));
          }else {
             p0 = t.just(Boolean.FALSE);
          }
          ot = p0;
       }
       return ot;
    }
}
