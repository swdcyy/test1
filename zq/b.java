package zq.b;
import upd.b;
import zq.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import upd.d;

public final class b implements b	// class@00295b
{
    public final a a;

    public void b(a p0){
       super();
       this.a = p0;
    }
    public static b a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(p0);
    }
    public static Context c(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Context uContext = p0.a();
       d.c(uContext, "Cannot return null from a non-@Nullable @Provides method");
       return uContext;
    }
    public Context b(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.c(this.a);
    }
    public Object get(){
       return this.b();
    }
}
