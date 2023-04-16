package c24.o0;
import cb4.e;
import c24.p0;
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
import ks3.f0;
import fq5.b;
import cb4.d;

public final class o0 implements e	// class@00048f
{
    public final p0 a;
    public final e b;

    public void o0(p0 p0,e p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, o0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.a();
    }
    public boolean b(RouterRequest p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       Map obj = PatchProxy.applyOneRefs(p0, this, o0.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = p0.c().c();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
       obj = s0.k(obj);
       o0 ta = this.a;
       Objects.requireNonNull(ta);
       HashMap hashMap = PatchProxy.apply(null, ta, p0.class, str);
       if (hashMap != patchProxyRe) {
       }else {
          hashMap = new HashMap();
          p0 b = ta.b;
          if (b != null) {
             hashMap.put("liveId", b.J4());
             hashMap.put("pageId", b.I4());
          }
          b = ta.a;
          if (b != null) {
             hashMap.put("routerToken", b.s5());
          }
       }
       obj.putAll(hashMap);
       return this.b.b(p0);
    }
    public String getName(){
       return d.b(this);
    }
}
