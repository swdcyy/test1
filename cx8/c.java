package cx8.c;
import io.reactivex.g;
import com.kwai.poi.service.model.KLocation;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cx8.c$a;
import erd.f;
import cx8.c$b;
import ee6.a;
import lk7.a;

public final class c implements g	// class@002010
{
    public final KLocation b;
    public final ArrayList c;
    public final String d;

    public void c(KLocation p0,ArrayList p1,String p2){
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
       p0.setCancellable(c$a.a);
       a.a("poster", "publish", this.b, this.c, this.d, new c$b(p0));
       return;
    }
}
