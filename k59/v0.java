package k59.v0;
import erd.g;
import k59.t0;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class v0 implements g	// class@002b27
{
    public final t0 b;

    public void v0(t0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = PatchProxy.applyVoidOneRefs(p0, this, v0.class, "1");
       if (b) {
       }else {
          a.o(p0, "it");
          this.b.onFollowUpdateEvent(p0);
       }
       return;
    }
}
