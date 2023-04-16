package h69.j$b;
import erd.o;
import java.util.List;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class j$b implements o	// class@00255c
{
    public final List b;

    public void j$b(List p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       j$b uob = PatchProxy.applyOneRefs(p0, this, j$b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uob = this.b;
       }
       return uob;
    }
}
