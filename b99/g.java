package b99.g;
import java.lang.Runnable;
import b99.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class g implements Runnable	// class@0003a2
{
    public final f b;

    public void g(f p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.b.W8();
       this.b.V8();
       return;
    }
}
