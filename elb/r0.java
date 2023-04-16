package elb.r0;
import java.util.List;
import elb.p0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import elb.r0$a;
import java.lang.Iterable;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class r0	// class@002765
{

    public static final p0 a(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, r0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CollectionsKt___CollectionsKt.F3(p0, r0$a.b);
    }
}
