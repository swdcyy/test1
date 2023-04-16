package hh1.h$b;
import erd.g;
import hh1.h;
import yg1.a;
import java.lang.String;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fh1.c;
import yg1.f;
import hh1.h$a;

public final class h$b implements g	// class@0026bc
{
    public final h b;
    public final a c;
    public final String d;

    public void h$b(h p0,a p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "1")) {
       }else {
          p0 = p0.a();
          a.o(p0, "it.body\(\)");
          this.c.a(this.d, this.b.b.b(p0));
       }
       return;
    }
}
