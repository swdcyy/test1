package gz9.m$f;
import erd.g;
import gz9.m;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class m$f implements g	// class@002527
{
    public final m b;

    public void m$f(m p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$f.class, "1")) {
       }else {
          a.o(p0, "visible");
          if (p0.booleanValue() && !this.b.n0()) {
             this.b.o0();
          }else if(!p0.booleanValue() && this.b.n0()){
             this.b.p0();
          }
       }
       return;
    }
}
