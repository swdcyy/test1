package bca.a$m;
import erd.g;
import bca.a;
import eca.g;
import brd.v;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;

public final class a$m implements g	// class@000456
{
    public final a b;
    public final g c;
    public final v d;

    public void a$m(a p0,g p1,v p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$m.class, "1")) {
       }else {
          this.b.l(this.c, false);
          this.d.onError(p0);
       }
       return;
    }
}
