package ae6.d;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.util.a;
import zsd.u;

public final class d	// class@000083
{

    public static final boolean a(File p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$verifyMd5");
       a.p(p1, "md5");
       return u.I1(p1, a.h(p0), true);
    }
}
