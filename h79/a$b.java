package h79.a$b;
import java.util.concurrent.Callable;
import h79.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.Collection;
import ekd.q;
import tkd.b;
import tkd.d;
import ra0.d;
import qrd.l1;

public final class a$b implements Callable	// class@00255f
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public Object call(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
       }else {
          List list = this.b.w();
          if ((a.g("tab_all", this.b.n) ^ 0x01) && q.f(list)) {
             d.a(0x1bf6ff1d).Y();
          }
       }
       return l1.a;
    }
}
