package b58.i;
import java.lang.Runnable;
import b58.l;
import com.mini.engine.EngineCallback;
import b58.m;
import java.lang.Object;
import java.util.List;
import java.lang.StringBuilder;
import java.lang.String;
import com.mini.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import b58.p;
import brd.a0;
import b58.q;
import brd.z;
import b58.d;
import brd.h;
import java.util.Objects;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.flowable.FlowableRetryBiPredicate;
import erd.d;
import ird.a;
import brd.f0;
import brd.a;
import b58.h;
import erd.g;
import b58.e;
import b58.c;
import erd.a;
import b58.g;
import b58.a;
import b58.f;
import crd.b;
import crd.a;

public final class i implements Runnable	// class@000303
{
    public final l b;
    public final EngineCallback c;
    public final m d;

    public void i(l p0,EngineCallback p1,m p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       i tb = this.b;
       i td = this.d;
       tb.a.add(this.c);
       d.c("AppSoBackupDownloader", "×¼±¸ÏÂÔØso:"+td);
       if (PatchProxy.applyVoidOneRefs(td, tb, l.class, "4")) {
       }else {
          p op = new p(td);
          d uod = new d(op);
          h oh = tb.b.a(td).T(d.m()).a0();
          Objects.requireNonNull(oh);
          a.c(uod, "predicate is null");
          tb.d.c(a0.e0(a.f(new FlowableRetryBiPredicate(oh, uod))).G(d.m()).g(tb.b.b(td)).A().s(d.p()).o(new h(op)).o(new e(tb)).l(new c(op)).m(new g(op)).u(new a(tb, td), new f(tb)));
       }
       return;
    }
}
