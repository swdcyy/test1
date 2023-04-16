package cp8.a$c;
import java.lang.Runnable;
import cp8.a;
import java.net.MalformedURLException;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tx4.v;
import tx4.i;

public class a$c implements Runnable	// class@001fe5
{
    public final MalformedURLException b;
    public final a c;

    public void a$c(a p0,MalformedURLException p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       if (this.c.e != null) {
          v ov = new v();
          ov.a = "Exception";
          ov.c = this.b.toString();
          this.c.e.a(ov);
       }
       return;
    }
}
