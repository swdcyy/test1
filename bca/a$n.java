package bca.a$n;
import erd.a;
import bca.a;
import eca.g;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import brd.g;

public final class a$n implements a	// class@000457
{
    public final a b;
    public final g c;
    public final v d;

    public void a$n(a p0,g p1,v p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$n.class, "1")) {
          return;
       }
       this.b.l(this.c, false);
       if (this.b.h == null) {
          this.d.onNext(Integer.valueOf(100));
       }
       this.d.onComplete();
       return;
    }
}
