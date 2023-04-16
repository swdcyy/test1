package ekd.b$a$a;
import java.lang.Runnable;
import ekd.b$a;
import java.lang.Object;
import ekd.b;

public class b$a$a implements Runnable	// class@000d26
{
    public final Object b;
    public final b$a c;

    public void b$a$a(b$a p0,Object p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       b$a b = this.c.b;
       b.run(b.getElapse(), this.b);
    }
}
