package gy2.l;
import gy2.c;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.Integer;
import gy2.j;
import java.util.Map;
import gy2.h;
import gy2.m;
import gy2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import gy2.e;
import gy2.b;
import gy2.b$a;
import java.util.List;
import com.kwai.robust.PatchProxyResult;

public final class l implements c	// class@002bd1
{
    public final Map a;

    public void l(){
       super();
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       this.a = linkedHashMa;
       linkedHashMa.put(Integer.valueOf(1), new j());
       linkedHashMa.put(Integer.valueOf(2), new h());
       linkedHashMa.put(Integer.valueOf(3), new m());
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       a.p(p0, "dialog");
       b uob = this.a.get(Integer.valueOf(p0.D6().a()));
       if (uob != null) {
          uob.a(p0);
       }
       return;
    }
    public void b(a p0,b$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "1")) {
          return;
       }
       a.p(p0, "dialog");
       a.p(p1, "delegate");
       b uob = this.a.get(Integer.valueOf(p0.D6().a()));
       if (uob != null) {
          uob.b(p0, p1);
       }
       return;
    }
    public List c(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ol, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       b uob = this.a.get(Integer.valueOf(p0));
       List list = (uob != null)? uob.c(): null;
       return list;
    }
}
