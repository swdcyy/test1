package a5b.g$c$b;
import erd.g;
import a5b.g$c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.b;
import a5b.g;
import kotlin.jvm.internal.a;
import a5b.h;
import a5b.h$a;

public final class g$c$b implements g	// class@000050
{
    public final g$c b;

    public void g$c$b(g$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$c$b.class, "1")) {
       }else {
          b.c("MagicSearchDataManager", "searchMagicException", p0);
          p0 = this.b;
          if (a.g(p0.b.a, p0.c)) {
             p0 = this.b.b;
             p0.b = h.e.b(p0.a);
             this.b.b.c(false);
          }
       }
       return;
    }
}
