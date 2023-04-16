package g21.a$b;
import java.lang.Runnable;
import g21.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dq5.b;
import oq5.b;

public final class a$b implements Runnable	// class@002401
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       this.b.a();
       a j = this.b.j;
       if (j != null) {
          j.a();
       }
       j = this.b.h;
       if (j != null) {
          j.b();
       }
       return;
    }
}
