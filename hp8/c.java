package hp8.c;
import oo8.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oo8.d;
import java.lang.Throwable;

public final class c implements e	// class@0025c8
{
    public final e a;

    public void c(e p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c ta = this.a;
       if (ta != null) {
          ta.a();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       c ta = this.a;
       if (ta != null) {
          ta.b();
       }
       return;
    }
    public void c(){
       d.d(this);
    }
    public void error(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       c ta = this.a;
       if (ta != null) {
          ta.error(p0);
       }
       return;
    }
}
