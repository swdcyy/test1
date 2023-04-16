package tb.a;
import java.lang.Object;
import tb.b;
import tb.a$a;

public abstract class a	// class@0024a0
{
    public static a a;

    public void a(){
       super();
    }
    public static synchronized a b(){
       _monitor_enter(a.class);
       if (a.a == null) {
          a.a = new b();
       }
       _monitor_exit(a.class);
       return a.a;
    }
    public abstract void a(a$a p0);
    public abstract void c(a$a p0);
}
