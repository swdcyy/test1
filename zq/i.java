package zq.i;
import upd.b;
import zq.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import upd.d;

public final class i implements b	// class@002964
{
    public final f a;

    public void i(f p0){
       super();
       this.a = p0;
    }
    public static i a(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i(p0);
    }
    public static String c(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = p0.d();
       d.c(str, "Cannot return null from a non-@Nullable @Provides method");
       return str;
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return i.c(this.a);
    }
    public Object get(){
       return this.b();
    }
}
