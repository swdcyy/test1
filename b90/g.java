package b90.g;
import erd.g;
import b90.e;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.logic.c;

public final class g implements g	// class@000afa
{
    public final e b;

    public void g(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          this.b.i.a();
       }
       return;
    }
}
