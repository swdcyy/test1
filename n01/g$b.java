package n01.g$b;
import d61.n;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import d61.l0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d61.n$b;

public abstract class g$b implements n	// class@003266
{
    public String b;
    public final l0 c;

    public void g$b(String p0){
       a.p(p0, "key");
       super();
       l0 ol0 = l0.h(p0);
       this.c = ol0;
       ol0 = ol0.b("");
       a.o(ol0, "store.get\(TextUtils.EMPTY_STRING\)");
       this.b = ol0;
    }
    public n a(n p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "other");
       return n$b.a(this, p0);
    }
}
