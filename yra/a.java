package yra.a;
import mr6.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gr6.b;
import mr6.b;
import xra.a;
import yra.a$a;
import erd.g;
import crd.b;
import brd.t;
import kotlin.jvm.internal.a;
import lnc.b9;
import gsa.e0;

public abstract class a extends a	// class@004a62
{
    public b l;

    public void a(){
       super();
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       b uob = this.d().a.subscribe(new a$a(this));
       a.o(uob, "barEventBus.styleSubject¡­  onStyleChange\(it\)\n    }");
       this.l = uob;
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a tl = this.l;
       if (tl == null) {
          a.S("dispose");
       }
       b9.a(tl);
       return;
    }
    public abstract void v(e0 p0);
}
