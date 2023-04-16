package k99.e;
import erd.g;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class e implements g	// class@002b75
{
    public final Runnable b;

    public void e(Runnable p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          this.b.run();
       }
       return;
    }
}
