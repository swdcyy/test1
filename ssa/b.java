package ssa.b;
import mr6.a;
import ssa.b$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tra.b;
import java.lang.StringBuilder;
import gr6.b;
import mr6.b;
import rsa.b;
import q87.c;
import mrd.a;
import ssa.b$b;
import erd.g;
import crd.b;
import brd.t;
import kotlin.jvm.internal.a;
import crd.a;
import sn5.a;

public abstract class b extends a	// class@004060
{
    public static final b$a l;

    static {
       b.l = new b$a(null);
    }
    public void b(){
       super();
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("BottomBaseMvpViewElement", "onCreated "+this.d(), objArray);
       b uob = this.d().c().subscribe(new b$b(this));
       a.o(uob, "barEventBus.styleSubject¡­  onStyleChange\(it\)\n    }");
       if (!PatchProxy.applyVoidOneRefs(uob, this, a.class, "3")) {
          a.p(uob, "disposable");
          this.k.c(uob);
       }
       return;
    }
    public void m(){
       PatchProxy.applyVoid(null, this, b.class, "2");
    }
    public abstract void v(a p0);
}
