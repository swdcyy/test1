package bf0.g;
import android.os.Message;
import xe0.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class g	// class@00036d
{

    public static final b a(Message p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$obtainFeature");
       p0 = p0.obj;
       if (!p0 instanceof b) {
          return null;
       }
       return p0;
    }
}
