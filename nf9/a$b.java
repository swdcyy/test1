package nf9.a$b;
import java.lang.Runnable;
import nf9.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import crd.b;
import java.util.Objects;
import nsd.s0;

public final class a$b implements Runnable	// class@003173
{
    public final a b;
    public final String c;

    public void a$b(a p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       b uob = this.b.p.get(this.c);
       if (uob != null) {
          uob.dispose();
          a p = this.b.p;
          Objects.requireNonNull(p, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
          s0.k(p).remove(this.c);
       }
       return;
    }
}
