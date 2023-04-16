package gra.t;
import io.reactivex.g;
import gra.v;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wkd.b;
import yma.a;
import yma.b;
import fra.g;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import gra.t$a;
import gra.t$b;
import erd.g;
import crd.b;

public final class t implements g	// class@002bc6
{
    public final v b;

    public void t(v p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       Object obj = b.a(-1257347683);
       a.o(obj, "Singleton.get\(GrowthApi::class.java\)");
       obj.b().t(this.b.k9().c(), this.b.k9().d()).map(new e()).subscribeOn(d.a).subscribe(new t$a(this, p0), new t$b(p0));
       return;
    }
}
