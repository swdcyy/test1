package a9c.d$a$b;
import java.lang.Runnable;
import a9c.d$a;
import androidx.recyclerview.widget.h$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a9c.d;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import u2.f;
import a9c.b;

public class d$a$b implements Runnable	// class@0000b2
{
    public final h$e b;
    public final d$a c;

    public void d$a$b(d$a p0,h$e p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, d$a$b.class, "1")) {
          return;
       }
       d$a$b tc = this.c;
       d$a e = tc.e;
       if (e.h == tc.d) {
          d$a c = tc.c;
          d$a$b tb = this.b;
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoidTwoRefs(c, tb, e, d.class, "3")) {
             e.e = c;
             e.g = Collections.unmodifiableList(c);
             tb.e(e.a);
             e.d = false;
             if (e.b.b() != null) {
                e.b.b().run();
             }
          }
       }
       return;
    }
}
