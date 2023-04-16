package k51.b$b;
import erd.o;
import msd.a;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class b$b implements o	// class@002c8d
{
    public final a b;

    public void b$b(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          obj = this.b.invoke();
       }
       return obj;
    }
}
