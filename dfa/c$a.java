package dfa.c$a;
import java.lang.Object;
import java.util.ArrayList;
import dfa.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import dfa.c;
import java.util.List;

public final class c$a	// class@00249d
{
    public final ArrayList a;

    public void c$a(){
       super();
       this.a = new ArrayList();
    }
    public final c$a a(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "organizerCacheFilter");
       this.a.add(p0);
       return this;
    }
    public final c b(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this.a);
    }
}
