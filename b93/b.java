package b93.b;
import z1.i;
import b93.d;
import b93.e;
import java.lang.Object;
import java.lang.Class;
import java.util.Objects;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Map;
import b93.e$a;
import java.util.Set;

public final class b implements i	// class@000372
{
    public final d a;
    public final e b;

    public void b(d p0,e p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean test(Object p0){
       boolean b;
       b tb = this.b;
       Class class = this.a.getClass();
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.applyTwoRefs(class, p0, tb, e.class, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(class, "clazz");
          a.p(p0, "serviceClass");
          e$a uoa = tb.a.get(class);
          if (uoa != null) {
             uoa = uoa.f;
             if (uoa != null) {
                b = uoa.contains(p0);
             }
          }
          b = true;
       }
       return b;
    }
}
