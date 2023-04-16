package iy0.g$a;
import eq5.a;
import iy0.g;
import java.lang.Object;
import eq5.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import lp3.e;
import lp3.c;
import lp3.b;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;

public class g$a implements a	// class@0029b9
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void Xg(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.b.u.add(p0);
       }
       return;
    }
    public void co(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "3")) {
          return;
       }
       if (p0 != null) {
          this.b.u.remove(p0);
       }
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public ArrayList ja(){
       Object obj = PatchProxy.apply(null, this, g$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b.p.clear();
       g$a tb = this.b;
       tb.p.addAll(tb.q);
       return new ArrayList(this.b.p);
    }
}
