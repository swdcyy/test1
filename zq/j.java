package zq.j;
import upd.b;
import zq.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tq.d;
import upd.d;

public final class j implements b	// class@002965
{
    public final f a;

    public void j(f p0){
       super();
       this.a = p0;
    }
    public static j a(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j(p0);
    }
    public static d c(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d uod = p0.e();
       d.c(uod, "Cannot return null from a non-@Nullable @Provides method");
       return uod;
    }
    public d b(){
       Object obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.c(this.a);
    }
    public Object get(){
       return this.b();
    }
}
