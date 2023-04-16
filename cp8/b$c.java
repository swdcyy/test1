package cp8.b$c;
import java.lang.Runnable;
import cp8.b;
import java.net.MalformedURLException;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tx4.v;
import tx4.i;

public class b$c implements Runnable	// class@001fea
{
    public final MalformedURLException b;
    public final b c;

    public void b$c(b p0,MalformedURLException p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "1")) {
          return;
       }
       if (this.c.e != null) {
          v ov = new v();
          ov.a = "MalformedURLException";
          ov.c = this.b.toString();
          this.c.e.a(ov);
       }
       return;
    }
}
