package d61.n$b;
import d61.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import d61.n$a$a;

public final class n$b	// class@001f39
{

    public static n a(n p0,n p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, n$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "other");
       return new n$a$a(p0, p1);
    }
}
