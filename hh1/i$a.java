package hh1.i$a;
import erd.o;
import hh1.i;
import yg1.e;
import java.lang.Object;
import java.lang.Long;
import brd.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import dh1.c;
import dh1.b;
import eh1.f;
import brd.t;
import hh1.i$a$a;

public final class i$a implements o	// class@0026c0
{
    public final i b;
    public final e c;

    public void i$a(i p0,e p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final w a(Long p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return b.b().a(this.c.a().a).map(new i$a$a(this));
    }
    public Object apply(Object p0){
       return this.a(p0);
    }
}
