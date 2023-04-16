package er2.d$b;
import er2.a;
import er2.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import er2.g;
import java.util.List;
import wp2.e;
import wp2.d;

public class d$b implements a	// class@0027bb
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public void H(){
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, d$b.class, str)) {
          return;
       }
       d l = this.a.l;
       if (l == null) {
          return;
       }
       Objects.requireNonNull(l);
       if (!PatchProxy.applyVoid(objArray, l, g.class, str)) {
          l.e = false;
          l.a(l.d, false);
       }
       return;
    }
    public void c0(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, d$b.class, str)) {
          return;
       }
       d l = this.a.l;
       if (l == null) {
          return;
       }
       Objects.requireNonNull(l);
       if (!PatchProxy.applyVoid(objArray, l, g.class, str)) {
          l.e = true;
          l.a(l.d, true);
       }
       return;
    }
    public void destroy(){
       d.a(this);
    }
}
