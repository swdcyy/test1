package d92.a$a;
import d92.a$b;
import d92.a;
import java.lang.Object;
import d92.q;
import iq5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;

public class a$a implements a$b	// class@0024a1
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public q a(){
       return this.a.t;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.a.u.add(p0);
       }
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.a.u.remove(p0);
       }
       return;
    }
}
