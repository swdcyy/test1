package b86.d$a;
import java.lang.Runnable;
import b86.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b86.f;

public final class d$a implements Runnable	// class@000437
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       this.b.d();
       return;
    }
}
