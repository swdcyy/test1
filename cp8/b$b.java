package cp8.b$b;
import java.lang.Runnable;
import cp8.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tx4.u;
import tx4.i;

public class b$b implements Runnable	// class@001fe9
{
    public final String b;
    public final b c;

    public void b$b(b p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       b e = this.c.e;
       if (e != null) {
          u ou = new u();
          ou.body = this.b;
          e.b(ou);
       }
       return;
    }
}
