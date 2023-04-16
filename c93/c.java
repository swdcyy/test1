package c93.c;
import lp3.c;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lp3.e;
import lp3.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class c implements c	// class@0004f9
{
    public final a b;
    public final a c;

    public void c(a p0,a p1){
       a.p(p0, "factory");
       a.p(p1, "recycler");
       super();
       this.b = p0;
       this.c = p1;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.c.invoke();
       return;
    }
}
