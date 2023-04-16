package g59.k;
import g59.k$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.util.LruCache;

public final class k	// class@00240a
{
    public static final LruCache a;
    public static final k b;

    static {
       k.b = new k();
       k.a = new k$a(10, 10);
    }
    public void k(){
       super();
    }
    public final Object a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       p0 = k.a.remove(p0);
       if (!p0 instanceof Object) {
          p0 = null;
       }
       return p0;
    }
}
