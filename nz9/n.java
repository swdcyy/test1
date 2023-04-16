package nz9.n;
import erd.g;
import nz9.z0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;

public final class n implements g	// class@003237
{
    public final z0 b;

    public void n(z0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, z0.class, "36")) {
       }else {
          p0 = tb.y;
          if (p0 != null) {
             p0.run();
          }
       }
       return;
    }
}
