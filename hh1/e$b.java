package hh1.e$b;
import erd.g;
import hh1.e;
import yg1.a;
import java.lang.String;
import java.lang.Object;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class e$b implements g	// class@0026b3
{
    public final e b;
    public final a c;
    public final String d;

    public void e$b(e p0,a p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
       }else {
          this.b.d = p0;
          a.o(p0, "it");
          this.c.a(this.d, p0);
       }
       return;
    }
}
