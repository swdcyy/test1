package hh1.g$b;
import erd.g;
import yg1.a;
import java.lang.String;
import java.lang.Object;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class g$b implements g	// class@0026b8
{
    public final a b;
    public final String c;

    public void g$b(a p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.a(this.c, p0);
       }
       return;
    }
}
