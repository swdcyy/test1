package dd9.d;
import erd.g;
import dd9.g;
import java.lang.Object;
import mc9.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;

public final class d implements g	// class@001f0e
{
    public final g b;

    public void d(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, g.class, "39")) {
       }else {
          a c = p0.c;
          if (c == 1 || c == 3) {
             tb.p = p0.a;
             tb.q = p0.b.getAbsolutePath();
             tb.l2();
          }
       }
       return;
    }
}
