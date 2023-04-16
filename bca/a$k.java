package bca.a$k;
import erd.g;
import bca.a;
import eca.g;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$k implements g	// class@000454
{
    public final a b;
    public final g c;

    public void a$k(a p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$k.class, "1")) {
       }else {
          this.b.l(this.c, true);
       }
       return;
    }
}
