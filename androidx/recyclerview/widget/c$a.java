package androidx.recyclerview.widget.c$a;
import java.lang.Object;
import androidx.recyclerview.widget.h$f;
import androidx.recyclerview.widget.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;

public final class c$a	// class@0008ec
{
    public Executor a;
    public Executor b;
    public final h$f c;
    public static final Object d;
    public static Executor e;

    static {
       c$a.d = new Object();
    }
    public void c$a(h$f p0){
       super();
       this.c = p0;
    }
    public c a(){
       if (this.b == null) {
          Object d = c$a.d;
          _monitor_enter(d);
          if (c$a.e == null) {
             c$a.e = Executors.newFixedThreadPool(2);
          }
          _monitor_exit(d);
          this.b = c$a.e;
       }
       return new c(this.a, this.b, this.c);
    }
}
