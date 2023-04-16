package qsa.j;
import mr6.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gr6.b;
import qsa.b;
import mrd.a;
import qsa.j$a;
import erd.g;
import crd.b;
import brd.t;
import kotlin.jvm.internal.a;
import lnc.b9;
import gsa.e0;

public abstract class j extends b	// class@003d56
{
    public b i;

    public void j(){
       super();
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       b uob = this.d().a().subscribe(new j$a(this));
       a.o(uob, "barEventBus.styleSubject¡­  onStyleChange\(it\)\n    }");
       this.i = uob;
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       j ti = this.i;
       if (ti == null) {
          a.S("dispose");
       }
       b9.a(ti);
       return;
    }
    public abstract void t(e0 p0);
}
