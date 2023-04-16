package c24.g0$a;
import erd.g;
import com.kuaishou.merchant.router.base.RouterRequest;
import c24.g0;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import us3.f;
import java.util.Objects;
import us3.h;
import java.util.HashMap;
import java.lang.Boolean;

public final class g0$a implements g	// class@000478
{
    public final RouterRequest b;
    public final g0 c;

    public void g0$a(RouterRequest p0,g0 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g0$a.class, "1")) {
       }else {
          p0 = this.c;
          f uof = this.b.b();
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uof, p0, g0.class, "2")) {
             p0 = new h();
             p0.a = 1;
             HashMap hashMap = new HashMap();
             hashMap.put("needRefresh", Boolean.TRUE);
             p0.b = hashMap;
             if (uof != null) {
                uof.a(p0);
             }
          }
          PatchProxy.onMethodExit(g0$a.class, "1");
       }
       return;
    }
}
