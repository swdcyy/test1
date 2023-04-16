package bp6.w;
import qo6.n;
import com.kwai.imsdk.internal.o;
import qo6.h1;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import com.kwai.imsdk.msg.KwaiMsg;
import nq6.s;
import qo6.w1;

public class w extends n	// class@000559
{
    public final h1 a;
    public final long b;
    public final o c;

    public void w(o p0,h1 p1,long p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(Object p0){
       this.g(p0);
    }
    public void b(Object p0){
       this.f(p0);
    }
    public void c(Object p0){
       this.h(p0);
    }
    public void d(Object p0,int p1,String p2){
       this.e(p0, p1, p2);
    }
    public void e(List p0,int p1,String p2){
       w ta = this.a;
       if (ta != null) {
          KwaiMsg kwaiMsg = (b.c(p0))? null: p0.get(0);
          ta.g(kwaiMsg, p1, p2, null);
       }
       s.t(this.c.g).X(p0, p1, p2);
       return;
    }
    public void f(List p0){
       w ta = this.a;
       if (ta != null) {
          KwaiMsg kwaiMsg = (b.c(p0))? null: p0.get(0);
          ta.e(kwaiMsg);
       }
       return;
    }
    public void g(List p0){
       w ta = this.a;
       if (ta != null) {
          KwaiMsg kwaiMsg = (b.c(p0))? null: p0.get(0);
          ta.h(kwaiMsg);
       }
       if (!b.c(p0)) {
          s.t(this.c.g).Y(p0, this.b);
       }
       return;
    }
    public void h(List p0){
       w ta = this.a;
       if (ta != null) {
          KwaiMsg kwaiMsg = (b.c(p0))? null: p0.get(0);
          ta.i(kwaiMsg);
       }
       return;
    }
}
