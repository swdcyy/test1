package q90.f$g;
import erd.g;
import q90.f;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;
import q90.z;

public final class f$g implements g	// class@00298e
{
    public final f b;

    public void f$g(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$g.class, "1")) {
       }else {
          f h = this.b.H;
          if (h != null) {
             a uoa = h.t0();
             if (uoa != null) {
                uoa.onNext(p0);
             }
          }
       }
       return;
    }
}
