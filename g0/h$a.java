package g0.h$a;
import java.lang.Runnable;
import g0.h;
import java.lang.Object;

public class h$a implements Runnable	// class@002027
{
    public final Runnable b;
    public final h c;

    public void h$a(h p0,Runnable p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.b.run();
       this.c.a();
    }
}
