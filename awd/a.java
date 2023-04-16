package awd.a;
import java.lang.Runnable;
import org.greenrobot.eventbus.a;
import java.lang.Object;
import awd.g;
import awd.f;
import java.lang.IllegalStateException;
import java.lang.String;

public class a implements Runnable	// class@000290
{
    public final g b;
    public final a c;

    public void a(a p0){
       super();
       this.c = p0;
       this.b = new g();
    }
    public void run(){
       f uof = this.b.b();
       if (uof == null) {
          throw new IllegalStateException("No pending post available");
       }
       this.c.g(uof);
       return;
    }
}
