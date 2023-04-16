package bca.a$l;
import erd.a;
import bca.a;
import eca.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$l implements a	// class@000455
{
    public final a b;
    public final g c;

    public void a$l(a p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$l.class, "1")) {
          return;
       }
       this.b.l(this.c, false);
       return;
    }
}
