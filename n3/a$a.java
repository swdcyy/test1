package n3.a$a;
import java.lang.Runnable;
import n3.a;
import u3.r;
import java.lang.Object;
import k3.h;
import java.lang.String;
import java.lang.Throwable;
import n3.b;

public class a$a implements Runnable	// class@0026b2
{
    public final r b;
    public final a c;

    public void a$a(a p0,r p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       Object[] objArray = new Object[]{this.b.a};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(a.d, String.format("Scheduling work %s", objArray), throwableArr);
       r[] orArray = new r[]{this.b};
       this.c.a.a(orArray);
    }
}
