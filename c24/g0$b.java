package c24.g0$b;
import erd.g;
import com.kuaishou.merchant.router.base.RouterRequest;
import c24.g0;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import us3.f;
import java.util.Objects;
import us3.h;
import java.util.HashMap;
import java.lang.Boolean;

public final class g0$b implements g	// class@000479
{
    public final RouterRequest b;
    public final g0 c;

    public void g0$b(RouterRequest p0,g0 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g0$b.class, "1")) {
       }else {
          p0 = this.c;
          f uof = this.b.b();
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uof, p0, g0.class, "3")) {
             p0 = new h();
             p0.a = 2;
             HashMap hashMap = new HashMap();
             hashMap.put("needRefresh", Boolean.FALSE);
             p0.b = hashMap;
             if (uof != null) {
                uof.a(p0);
             }
          }
          PatchProxy.onMethodExit(g0$b.class, "1");
       }
       return;
    }
}
