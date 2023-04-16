package lod.r;
import io.reactivex.g;
import bod.d;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import bod.e;
import brd.g;

public final class r implements g	// class@001c8e
{
    public final d b;

    public void r(d p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       a.p(p0, "it");
       e.d(e.b(e.c(e.a(this.b))));
       p0.onComplete();
       return;
    }
}
