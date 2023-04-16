package a76.g;
import hkd.d;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class g extends d	// class@000036
{
    public final Runnable b;

    public void g(Runnable p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.b.run();
       return;
    }
}
