package a5b.g$c$a;
import erd.g;
import a5b.g$c;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a5b.g;
import kotlin.jvm.internal.a;
import a5b.h;

public final class g$c$a implements g	// class@00004f
{
    public final g$c b;

    public void g$c$a(g$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$c$a.class, "1")) {
       }else {
          g$c$a tb = this.b;
          if (a.g(tb.b.a, tb.c)) {
             this.b.b.b = new h(this.b.c, p0, null, false);
             this.b.b.c(false);
          }
       }
       return;
    }
}
