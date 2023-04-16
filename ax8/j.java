package ax8.j;
import erd.o;
import ax8.f;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.Objects;
import bx8.p;
import brd.t;
import mrd.a;
import elb.y;
import elb.z;
import t45.d;
import brd.z;
import cjd.e;
import bx8.q;
import bx8.r;
import erd.g;
import crd.b;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;

public final class j implements o	// class@000338
{
    public final f b;

    public void j(f p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       p obj = PatchProxy.applyOneRefs(p0, this, j.class, str);
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "it");
          p0 = this.b.e;
          Objects.requireNonNull(p0);
          obj = p.class;
          Object[] objArray = null;
          Object[] obj1 = PatchProxy.apply(objArray, p0, obj, str);
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else if(p0.a.i() != null || p0.b != null){
             obj1 = new Object[0];
             a.b().w("ShareStartUpRepo", "getStartUpResult have download or is downloading: "+p0.b, obj1);
          }else {
             p0.b = true;
             if (!PatchProxy.applyVoid(objArray, p0, obj, "2")) {
                y.b.a().a().observeOn(d.a).map(new e()).subscribe(new q(p0), r.b);
             }
          }
          obj = p0.a;
       }
       return obj;
    }
}
