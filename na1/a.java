package na1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ja1.e;
import ka1.a;

public abstract class a	// class@0032c9
{
    public a b;

    public void a(){
       super();
    }
    public final a a(){
       return this.b;
    }
    public final a b(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "producer");
       p0.b = this;
       return p0;
    }
    public abstract void c(e p0,a p1);
}
