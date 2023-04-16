package af4.f;
import ii4.b;
import af4.g;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Object;
import ws3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import us3.f;
import us3.h;
import java.util.HashMap;

public class f implements b	// class@0000b6
{
    public final RouterRequest a;
    public final g b;

    public void f(g p0,RouterRequest p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       f uof = this.a.b();
       if (uof != null && p0 != null) {
          h oh = new h();
          HashMap hashMap = new HashMap();
          hashMap.put("SUCCESS_RESPONSE", p0);
          oh.a = 1;
          oh.b = hashMap;
          uof.a(oh);
       }
       return;
    }
    public void onFail(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       f uof = this.a.b();
       if (uof != null) {
          h oh = new h();
          oh.a = 2;
          uof.a(oh);
       }
       return;
    }
}
