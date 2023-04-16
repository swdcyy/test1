package kf0.l;
import erd.o;
import kf0.f$b;
import java.lang.Object;
import com.kuaishou.growth.pendant.core.manager.f$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;

public final class l implements o	// class@002d13
{
    public final f$b b;

    public void l(f$b p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       f$a uoa = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "listResourceWrapper");
          f$a b = p0.b;
          a.o(b, "listResourceWrapper.mOrigin");
          this.b.b(b);
          uoa = p0.a;
       }
       return uoa;
    }
}
