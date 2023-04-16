package hh1.c$b;
import erd.g;
import yg1.a;
import java.lang.String;
import java.lang.Object;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class c$b implements g	// class@0026ae
{
    public final a b;
    public final String c;

    public void c$b(a p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.a(this.c, p0);
       }
       return;
    }
}
