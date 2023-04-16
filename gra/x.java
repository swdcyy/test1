package gra.x;
import erd.o;
import gra.y;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import fra.f;
import brd.t;
import gra.b;

public final class x implements o	// class@002bce
{
    public final y b;

    public void x(y p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, x.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b;
             p0 = p0.a9(p0.e9().c, this.b.e9().c());
          }else {
             p0 = t.just(Boolean.FALSE);
          }
          ot = p0;
       }
       return ot;
    }
}
