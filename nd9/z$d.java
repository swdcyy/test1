package nd9.z$d;
import erd.g;
import nd9.z;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fw8.r;
import fw8.r$a;
import j8c.a;
import w46.b;

public final class z$d implements g	// class@003166
{
    public final z b;

    public void z$d(z p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z$d.class, "1")) {
       }else {
          z$d tb = this.b;
          r.c().g(tb.i2());
          Object[] objArray = new Object[0];
          a.D().t(tb.o, p0.getMessage(), objArray);
       }
       return;
    }
}
