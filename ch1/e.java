package ch1.e;
import ch1.d;
import ul1.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class e	// class@0004b8
{

    public static final d a(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$toTabDataWrapper");
       return new d(p0.a(), p0);
    }
}
