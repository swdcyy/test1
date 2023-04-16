package eb.d;
import eb.c;
import java.lang.Object;
import eb.b;

public class d implements c	// class@001524
{
    public static d b;

    public void d(){
       super();
    }
    public static synchronized d c(){
       _monitor_enter(d.class);
       if (d.b == null) {
          d.b = new d();
       }
       _monitor_exit(d.class);
       return d.b;
    }
    public void a(b p0){
    }
    public void b(b p0){
    }
}
