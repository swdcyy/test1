package hh1.i;
import hh1.j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.String;
import yg1.e;
import yg1.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import eh1.f;
import java.util.concurrent.TimeUnit;
import brd.t;
import hh1.i$a;
import erd.o;
import t45.d;
import brd.z;
import hh1.i$b;
import hh1.i$c;
import erd.g;
import crd.b;

public final class i extends j	// class@0026c3
{
    public final AtomicBoolean b;

    public void i(){
       super();
       this.b = new AtomicBoolean(false);
    }
    public void a(String p0,e p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, i.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "request");
       a.p(p2, "callback");
       if (!this.b.compareAndSet(false, true)) {
          return;
       }
       b uob = t.timer(p1.a().b, TimeUnit.MILLISECONDS).flatMap(new i$a(this, p1)).subscribeOn(d.b).observeOn(d.a).subscribe(new i$b(this, p2, p0), new i$c(this, p2, p0));
       a.o(uob, "Observable.timer\(request¡­    it\n        \)\n      }\)");
       this.b(uob);
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       super.clear();
       this.b.set(false);
       return;
    }
}
