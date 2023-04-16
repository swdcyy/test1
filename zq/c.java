package zq.c;
import upd.b;
import zq.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tq.f;
import upd.d;

public final class c implements b	// class@00295c
{
    public final a a;

    public void c(a p0){
       super();
       this.a = p0;
    }
    public static c a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(p0);
    }
    public static f c(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       f uof = p0.b();
       d.c(uof, "Cannot return null from a non-@Nullable @Provides method");
       return uof;
    }
    public f b(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.c(this.a);
    }
    public Object get(){
       return this.b();
    }
}
