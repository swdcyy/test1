package c24.b;
import cb4.e;
import c24.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.router.base.RouterRequest;
import com.kuaishou.merchant.router.RouterConfig;
import java.util.Map;
import java.util.Objects;
import nsd.s0;
import java.util.HashMap;
import cb4.d;

public final class b implements e	// class@00046e
{
    public final c a;
    public final e b;

    public void b(c p0,e p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.a();
    }
    public boolean b(RouterRequest p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       Map obj = PatchProxy.applyOneRefs(p0, this, b.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = p0.c().c();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
       obj = s0.k(obj);
       b ta = this.a;
       Objects.requireNonNull(ta);
       HashMap hashMap = PatchProxy.apply(null, ta, c.class, str);
       if (hashMap != patchProxyRe) {
       }else {
          hashMap = new HashMap();
          hashMap.put("liveId", ta.b);
          hashMap.put("pageId", ta.a);
          hashMap.put("routerToken", ta.c);
       }
       obj.putAll(hashMap);
       return this.b.b(p0);
    }
    public String getName(){
       return d.b(this);
    }
}
