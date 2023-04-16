package au6.d;
import au6.d$a;
import nsd.u;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import au6.a;
import kotlin.jvm.internal.a;

public final class d	// class@0003b4
{
    public final ConcurrentHashMap a;
    public static final d$a b;

    static {
       d.b = new d$a(null);
    }
    public void d(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public void d(u p0){
       super();
       this.a = new ConcurrentHashMap();
    }
    public static final d a(){
       Object obj = PatchProxy.apply(null, null, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.b.a();
    }
    public final a b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "platform");
       return this.a.get(p0);
    }
    public final a c(String p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "platform");
       a.p(p1, "shareApi");
       return this.a.put(p0, p1);
    }
}
