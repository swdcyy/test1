package fs2.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;

public class x	// class@0029bf
{
    public b a;

    public void x(){
       super();
       this.a = null;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, x.class, "3")) {
          return;
       }
       x ta = this.a;
       if (ta != null) {
          ta.dispose();
          this.a = null;
       }
       return;
    }
}
