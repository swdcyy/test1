package k7a.d$c;
import java.lang.Runnable;
import k7a.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d$c implements Runnable	// class@002c0b
{
    public final d b;

    public void d$c(d p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "1")) {
          return;
       }
       this.b.S8();
       return;
    }
}
