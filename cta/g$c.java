package cta.g$c;
import java.lang.Runnable;
import cta.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class g$c implements Runnable	// class@0023b8
{
    public final g b;

    public void g$c(g p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, g$c.class, "1")) {
          return;
       }
       this.b.a();
       return;
    }
}
