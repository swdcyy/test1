package d0d.c;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Object;
import d0d.d$a;
import java.util.List;
import okhttp3.EventListener$Factory;
import j89.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j89.n;
import java.util.Collection;
import d0d.c$a;
import d0d.g$b;

public class c	// class@001459
{
    public g$b a;
    public boolean b;
    public List c;
    public static List d;

    static {
       c.d = new CopyOnWriteArrayList();
    }
    public void c(){
       super();
       this.c = new CopyOnWriteArrayList();
    }
    public static void b(d$a p0){
       c.d.add(p0);
    }
    public EventListener$Factory a(){
       if (this.b != null) {
          if (!PatchProxy.applyVoid(null, null, o.class, "1")) {
             c.b(new n());
          }
          this.c.addAll(c.d);
          c.d.clear();
       }
       return new c$a(this);
    }
    public c c(g$b p0){
       this.a = p0;
       return this;
    }
}
