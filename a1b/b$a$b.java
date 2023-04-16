package a1b.b$a$b;
import java.lang.Runnable;
import a1b.b$a;
import androidx.recyclerview.widget.h$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a1b.b;
import java.util.Objects;
import java.lang.Boolean;
import java.util.List;
import java.util.Collections;
import y0b.e;
import u2.f;
import y0b.i;

public class b$a$b implements Runnable	// class@000013
{
    public final h$e b;
    public final b$a c;

    public void b$a$b(b$a p0,h$e p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$a$b.class, "1")) {
          return;
       }
       b$a$b tc = this.c;
       b$a g = tc.g;
       if (g.e == tc.d) {
          b$a c = tc.c;
          b$a$b tb = this.b;
          b$a e = tc.e;
          b$a f = tc.f;
          Objects.requireNonNull(g);
          if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidFourRefs(c, tb, Boolean.valueOf(e), f, g, b.class, "2")) {
             g.c = c;
             g.d = Collections.unmodifiableList(c);
             f.g((c.size() - g.c.size()));
             tb.e(f);
             g.b = false;
             if (g.a.I() != null) {
                g.a.I().run();
             }
             f.e();
          }
       }
       return;
    }
}
