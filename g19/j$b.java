package g19.j$b;
import jta.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import g19.p;
import java.util.Objects;

public final class j$b extends a	// class@0023bf
{

    public void j$b(){
       super();
    }
    public void a(float p0){
       j$b uob = j$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (!p0) {
          Objects.requireNonNull(p.c);
          p.b = -1;
       }
       return;
    }
}
