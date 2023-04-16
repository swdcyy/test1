package kf0.n;
import erd.g;
import kf0.f$b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class n implements g	// class@002d15
{
    public final f$b b;

    public void n(f$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
       }else {
          this.b.onError(p0);
       }
       return;
    }
}
