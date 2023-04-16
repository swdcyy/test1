package ct2.b$a;
import erd.g;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b$a implements g	// class@0023d9
{
    public final Runnable b;

    public void b$a(Runnable p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
       }else {
          this.b.run();
       }
       return;
    }
}
