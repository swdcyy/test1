package azb.e;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o36.g;
import java.lang.System;
import azb.e$a;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;
import azb.e$b;
import erd.o;
import azb.e$c;
import azb.e$d;
import erd.g;
import crd.b;

public final class e	// class@00036d
{
    public static long a;
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void a(int p0,Integer p1,String p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, e.class, "1")) {
          return;
       }
       if (!g.a) {
          return;
       }
       long l = System.currentTimeMillis();
       if ((l - e.a) - (long)500 < 0) {
          return;
       }
       e.a = l;
       z c = d.c;
       t ot = t.create(e$a.b).subscribeOn(c).observeOn(c);
       t ot1 = ot.flatMap(new e$b(p0, p2, System.currentTimeMillis()));
       ot1.observeOn(d.a).subscribe(e$c.b, e$d.b);
       return;
    }
}
