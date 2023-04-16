package k59.z0$b;
import java.lang.Runnable;
import k59.z0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class z0$b implements Runnable	// class@002b3a
{
    public final z0 b;

    public void z0$b(z0 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, z0$b.class, "1")) {
          return;
       }
       this.b.P8();
       return;
    }
}
