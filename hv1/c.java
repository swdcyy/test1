package hv1.c;
import fv1.c;
import hv1.c$c;
import nsd.u;
import fv1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mrd.a;
import java.util.LinkedHashSet;
import crd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import hv1.d;
import erd.g;
import crd.b;
import krd.a;
import hv1.c$a;
import brd.w;
import erd.c;
import hv1.c$b;
import ls5.a;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;

public final class c implements c	// class@00278a
{
    public final a a;
    public final a b;
    public final a c;
    public final Set d;
    public final a e;
    public final a f;
    public static final c$c g;

    static {
       c.g = new c$c(null);
    }
    public void c(a p0){
       a.p(p0, "configManager");
       super();
       this.f = p0;
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<L¡­veTempPlayPendantItem>>\(\)");
       this.a = uoa;
       uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<TempPlayPendantConfig>\(\)");
       this.b = uoa;
       a uoa1 = a.g();
       a.o(uoa1, "BehaviorSubject.create<S¡­veTempPlayPendantItem>>\(\)");
       this.c = uoa1;
       this.d = new LinkedHashSet();
       a uoa2 = new a();
       this.e = uoa2;
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
       }else {
          b uob = p0.a().subscribe(new d(this));
          a.o(uob, "configManager\n      .obs¡­pdater.onNext\(it\)\n      }");
          a.b(uoa2, uob);
       }
       t ot = t.combineLatest(uoa, uoa1, new c$a(this));
       a.h(ot, "Observable.combineLatest¡­ombineFunction\(t1, t2\) }\)");
       ot.subscribe(new c$b(this));
       return;
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       a.p(p0, "item");
       this.d.remove(p0);
       this.c.onNext(this.d);
       return;
    }
    public t b(){
       t obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.hide();
       a.o(obj, "displayItemsNotifier.hide\(\)");
       return obj;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       a.p(p0, "item");
       this.d.add(p0);
       this.c.onNext(this.d);
       return;
    }
}
