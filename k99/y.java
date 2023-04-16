package k99.y;
import erd.g;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class y implements g	// class@002b9d
{
    public final Runnable b;

    public void y(Runnable p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
       }else {
          this.b.run();
       }
       return;
    }
}
