package cp8.a$d;
import java.lang.Runnable;
import cp8.a;
import java.io.IOException;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tx4.v;
import tx4.i;

public class a$d implements Runnable	// class@001fe6
{
    public final IOException b;
    public final a c;

    public void a$d(a p0,IOException p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$d.class, "1")) {
          return;
       }
       if (this.c.e != null) {
          v ov = new v();
          ov.a = "IOException";
          ov.c = this.b.toString();
          this.c.e.a(ov);
       }
       return;
    }
}
