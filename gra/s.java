package gra.s;
import erd.o;
import gra.v;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import fra.g;
import brd.t;
import gra.b;

public final class s implements o	// class@002bc3
{
    public final v b;

    public void s(v p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, s.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b;
             p0 = p0.a9(p0.k9().c(), this.b.k9().d());
          }else {
             p0 = t.just(Boolean.FALSE);
          }
          ot = p0;
       }
       return ot;
    }
}
