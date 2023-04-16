package b94.m$a;
import ks3.l;
import b94.m;
import java.lang.Object;
import ks3.l$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import u84.d;
import java.util.Set;

public class m$a implements l	// class@000333
{
    public final m a;

    public void m$a(m p0){
       this.a = p0;
       super();
    }
    public void a(l$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       m s = this.a.s;
       if (s != null) {
          Objects.requireNonNull(s);
          if (!PatchProxy.applyVoidOneRefs(p0, s, d.class, "2")) {
             s.h.add(p0);
          }
       }
       return;
    }
    public void b(l$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "2")) {
          return;
       }
       m s = this.a.s;
       if (s != null) {
          Objects.requireNonNull(s);
          if (!PatchProxy.applyVoidOneRefs(p0, s, d.class, "3")) {
             s.h.remove(p0);
          }
       }
       return;
    }
}
