package vq.d$b;
import java.lang.Runnable;
import vq.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vq.a;

public class d$b implements Runnable	// class@0026d5
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "1")) {
          return;
       }
       this.b.o();
       return;
    }
}
