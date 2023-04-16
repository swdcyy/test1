package d3b.b;
import java.lang.Runnable;
import bw.a$b;
import ar.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b implements Runnable	// class@002422
{
    public final a$b b;
    public final b c;
    public final Runnable d;

    public void b(a$b p0,b p1,Runnable p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.d.run();
       return;
    }
}
