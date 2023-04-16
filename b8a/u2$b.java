package b8a.u2$b;
import d6a.a;
import b8a.u2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s4a.g;

public final class u2$b extends a	// class@000400
{
    public final u2 b;

    public void u2$b(u2 p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, u2$b.class, "1")) {
          return;
       }
       u2 z = this.b.z;
       if (z != null) {
          z.b0();
       }
       return;
    }
}
