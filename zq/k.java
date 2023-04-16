package zq.k;
import upd.b;
import zq.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import er.m;
import upd.d;

public final class k implements b	// class@002966
{
    public final f a;

    public void k(f p0){
       super();
       this.a = p0;
    }
    public static k a(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k(p0);
    }
    public static m c(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       m om = p0.f();
       d.c(om, "Cannot return null from a non-@Nullable @Provides method");
       return om;
    }
    public m b(){
       Object obj = PatchProxy.apply(null, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k.c(this.a);
    }
    public Object get(){
       return this.b();
    }
}
