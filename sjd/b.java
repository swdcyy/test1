package sjd.b;
import java.lang.Object;
import java.util.HashMap;

public class b	// class@002439
{
    public final Map a;
    public static b b;

    public void b(){
       super();
       this.a = new HashMap();
    }
    public static synchronized b a(){
       _monitor_enter(b.class);
       if (b.b == null) {
          b.b = new b();
       }
       _monitor_exit(b.class);
       return b.b;
    }
}
