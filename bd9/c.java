package bd9.c;
import erd.g;
import bd9.d;
import java.lang.Object;
import mc9.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;

public final class c implements g	// class@000470
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "19")) {
       }else {
          a c = p0.c;
          if (c == 1 || c == 3) {
             tb.q = p0.a;
             tb.r = p0.b.getAbsolutePath();
          }
       }
       return;
    }
}
