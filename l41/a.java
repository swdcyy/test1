package l41.a;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.String;
import o63.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;

public final class a	// class@002e80
{
    public static final ConcurrentHashMap a;
    public static final a b;

    static {
       a.b = new a();
       a.a = new ConcurrentHashMap();
    }
    public void a(){
       super();
    }
    public static final a a(String p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, a.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(p0, "liveId");
       WeakReference weakReferenc = a.a.get(p0);
       if (weakReferenc != null) {
          obj = weakReferenc.get();
       }
       return obj;
    }
}
