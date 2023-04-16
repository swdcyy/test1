package bk0.o;
import bk0.d;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import bk0.j;
import lj0.c;
import zj0.v;
import com.kuaishou.krn.log.model.KrnLogCommonParams;

public final class o extends d	// class@0003ae
{

    public void o(){
       super();
    }
    public void A(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "3")) {
          return;
       }
       a.p(p0, "throwable");
       j.b.b("krn_bundle_load_result", this.E(this.D(), p0));
       return;
    }
    public void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "1")) {
          return;
       }
       j.b.b("krn_bundle_load_start", d.F(this, this.D(), objArray, 2, objArray));
       return;
    }
    public void r(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "2")) {
          return;
       }
       j.b.b("krn_bundle_load_result", d.F(this, this.D(), objArray, 2, objArray));
       return;
    }
}
