package m69.g$f;
import erd.o;
import i69.a;
import java.lang.Object;
import pr3.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.io.File;

public final class g$f implements o	// class@002e1c
{
    public final a b;

    public void g$f(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       g$f uof = PatchProxy.applyOneRefs(p0, this, g$f.class, "1");
       if (uof != PatchProxyResult.class) {
       }else {
          a.p(p0, "percentResult");
          this.b.d(p0.a());
          this.b.e(p0.c);
          uof = this.b;
       }
       return uof;
    }
}
