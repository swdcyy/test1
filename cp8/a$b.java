package cp8.a$b;
import java.lang.Runnable;
import cp8.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tx4.u;
import tx4.i;

public class a$b implements Runnable	// class@001fe4
{
    public final String b;
    public final a c;

    public void a$b(a p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       a e = this.c.e;
       if (e != null) {
          u ou = new u();
          ou.body = this.b;
          e.b(ou);
       }
       return;
    }
}
