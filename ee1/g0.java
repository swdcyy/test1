package ee1.g0;
import z1.a;
import xv4.g;
import java.lang.Object;
import wv4.d1;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wv4.f1;
import java.util.Map;

public final class g0 implements a	// class@002106
{
    public final g a;

    public void g0(g p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       g0 ta = this.a;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(ta, p0, d1.class, "14")) {
       }else {
          p0 = p0.h;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(ta, p0, f1.class, "3")) {
             if (ta != p0.h) {
                p0.e.clear();
             }
             p0.h = ta;
          }
       }
       return;
    }
}
