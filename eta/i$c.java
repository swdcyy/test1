package eta.i$c;
import zq6.i;
import eta.i;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zq6.p;

public class i$c implements i	// class@0027e3
{
    public final i a;

    public void i$c(i p0){
       this.a = p0;
       super();
    }
    public void a(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$c.class, "1")) {
          return;
       }
       this.a.q();
       return;
    }
    public void b(p p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i$c.class, "2")) {
          return;
       }
       this.a.q();
       return;
    }
}
