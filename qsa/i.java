package qsa.i;
import mr6.a;
import qsa.i$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tra.b;
import java.lang.StringBuilder;
import gr6.b;
import mr6.b;
import qsa.b;
import q87.c;
import mrd.a;
import qsa.i$b;
import erd.g;
import crd.b;
import brd.t;
import kotlin.jvm.internal.a;
import lnc.b9;
import gsa.e0;

public abstract class i extends a	// class@003d54
{
    public b l;
    public static final i$a m;

    static {
       i.m = new i$a(null);
    }
    public void i(){
       super();
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("HomeBaseMvpViewElement", "onCreated "+this.d(), objArray);
       b uob = this.d().a().subscribe(new i$b(this));
       a.o(uob, "barEventBus.styleSubject¡­  onStyleChange\(it\)\n    }");
       this.l = uob;
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       i tl = this.l;
       if (tl == null) {
          a.S("dispose");
       }
       b9.a(tl);
       return;
    }
    public abstract void v(e0 p0);
}
