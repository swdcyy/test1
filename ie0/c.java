package ie0.c;
import erd.o;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import ie0.f;
import java.util.Objects;
import brd.t;
import ce0.b;
import java.lang.StringBuilder;
import com.yxcorp.image.request.a;
import s0d.e;
import ie0.e;
import io.reactivex.g;
import t45.d;
import brd.z;

public final class c implements o	// class@0028a1
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public Object apply(Object p0){
       f a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "url");
          a = f.a;
          Objects.requireNonNull(a);
          ot = PatchProxy.applyOneRefs(p0, a, f.class, "2");
          if (ot != patchProxyRe) {
          }else {
             Object[] objArray = new Object[0];
             b.C().w("PendantCore", "¿ªÊ¼Ô¤¼ÓÔØ:"+p0, objArray);
             ot = t.create(new e(a.u(p0).q(), p0));
             a.o(ot, "Observable.create { emit¡­}\n        }\n      \)\n    }");
          }
          ot = ot.subscribeOn(d.b);
       }
       return ot;
    }
}
