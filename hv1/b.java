package hv1.b;
import fv1.a;
import z1.k;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mrd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import t45.d;
import brd.z;
import hv1.a;
import erd.g;

public final class b implements a	// class@002786
{
    public final a a;
    public final b b;
    public final k c;
    public final t d;

    public void b(k p0,t p1){
       a.p(p0, "liveIdSupplier");
       a.p(p1, "userStatusObservable");
       super();
       this.c = p0;
       this.d = p1;
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<TempPlayPendantConfig>\(\)");
       this.a = uoa;
       b uob = PatchProxy.apply(null, this, b.class, "3");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = p1.observeOn(d.c).subscribe(new a(this));
          a.o(uob, "userStatusObservable\n   ¡­onfig\(it\)\n        }\n    }");
       }
       this.b = uob;
       return;
    }
    public t a(){
       t obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.observeOn(d.a);
       a.o(obj, "pendantConfigNotifier.ob¡­veOn\(KwaiSchedulers.MAIN\)");
       return obj;
    }
}
