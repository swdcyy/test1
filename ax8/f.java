package ax8.f;
import ax8.f$c;
import nsd.u;
import bx8.k;
import bx8.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mrd.a;
import crd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import f66.i;
import jq.a;
import q87.c;
import ax8.g;
import erd.o;
import ax8.h;
import java.util.concurrent.Callable;
import brd.m;
import ax8.i;
import erd.g;
import java.lang.Boolean;
import ax8.j;
import ax8.k;
import brd.w;
import t45.d;
import brd.z;
import ax8.f$a;
import ax8.f$b;
import crd.b;

public final class f	// class@000334
{
    public final a a;
    public final a b;
    public final boolean c;
    public final k d;
    public final p e;
    public static final f$c f;

    static {
       f.f = new f$c(null);
    }
    public void f(boolean p0,k p1,p p2){
       a.p(p2, "mStartUpRepo");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create\(\)");
       this.a = uoa;
       uoa = new a();
       this.b = uoa;
       t ot = PatchProxy.apply(null, this, f.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          a.b().w("ShareProducerRepo", "loadShareBusinessInfo", objArray);
          if (p0) {
             Object[] objArray1 = new Object[i];
             a.b().w("ShareProducerRepo", "isReEdit, get data from reEditRepo", objArray1);
             a.m(p1);
             ot = p1.b().map(g.b);
             a.o(ot, "reEditRepo!!.getReEditRe¡­roducerHelpConfig\n      }");
          }else {
             ot = m.r(h.b).C().doOnNext(i.b).switchIfEmpty(t.just(Boolean.TRUE).flatMap(new j(this)).map(k.b));
             a.o(ot, "diskCache.switchIfEmpty\(netResponse\)");
          }
       }
       uoa.c(ot.subscribeOn(d.c).observeOn(d.a).subscribe(new f$a(this), f$b.b));
       return;
    }
}
