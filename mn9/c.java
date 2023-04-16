package mn9.c;
import io.reactivex.g;
import mn9.f;
import java.lang.Object;
import mn9.a;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mn9.b;

public final class c implements g	// class@003061
{
    public final f b;
    public final Object c;
    public final a d;

    public void c(f p0,Object p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       c tc = this.c;
       if (tc == null) {
          this.b.a.f(this.d, p0);
       }else {
          this.b.a.h(this.d, tc, p0);
       }
       return;
    }
}
