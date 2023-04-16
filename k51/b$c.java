package k51.b$c;
import erd.o;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class b$c implements o	// class@002c8e
{
    public final l b;

    public void b$c(l p0){
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.invoke(p0);
    }
}
