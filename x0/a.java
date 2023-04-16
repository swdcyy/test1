package x0.a;
import x0.c;
import x0.a$a;
import x0.a$b;
import x0.b;
import java.util.concurrent.Executor;
import java.lang.Runnable;

public class a extends c	// class@0027a0
{
    public c a;
    public c b;
    public static a c;
    public static final Executor d;
    public static final Executor e;

    static {
       a.d = new a$a();
       a.e = new a$b();
    }
    public void a(){
       super();
       b uob = new b();
       this.b = uob;
       this.a = uob;
    }
    public static Executor e(){
       return a.e;
    }
    public static a f(){
       if (a.c != null) {
          return a.c;
       }
       a uoa = a.class;
       _monitor_enter(uoa);
       if (a.c == null) {
          a.c = new a();
       }
       _monitor_exit(uoa);
       return a.c;
    }
    public void a(Runnable p0){
       this.a.a(p0);
    }
    public boolean c(){
       return this.a.c();
    }
    public void d(Runnable p0){
       this.a.d(p0);
    }
}
