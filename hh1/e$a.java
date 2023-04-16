package hh1.e$a;
import erd.o;
import hh1.e;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yg1.f;
import kotlin.jvm.internal.a;
import fh1.b;
import hh1.d;

public final class e$a implements o	// class@0026b2
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       f uof = PatchProxy.applyOneRefs(p0, this, e$a.class, "1");
       if (uof != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = p0.a();
          a.o(p0, "it.body\(\)");
          uof = this.b.c.b(p0);
       }
       return uof;
    }
}
