package nu6.d;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import com.kwai.kxb.PlatformType;
import nu6.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class d	// class@0033d4
{
    public static final ConcurrentHashMap a;
    public static final d b;

    static {
       d.b = new d();
       d.a = new ConcurrentHashMap();
    }
    public void d(){
       super();
    }
    public final c a(PlatformType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "type");
       return d.a.get(p0);
    }
}
