package dq1.b;
import dq1.a;
import yp1.b;
import zp1.i;
import zp1.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import dq1.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import aq1.i;
import dq1.b$a;
import z1.k;
import aq1.h;
import dq1.b$b;
import bq1.g;
import dq1.b$c;
import bq1.f;
import dq1.b$d;

public final class b extends a	// class@001fea
{
    public final b c;
    public final i d;
    public final l e;

    public void b(b p0,i p1,l p2){
       a.p(p0, "renderModel");
       a.p(p1, "chatCellBaseDelegate");
       a.p(p2, "chatCellRendDelegate");
       super(p1, p2);
       this.c = p0;
       this.d = p1;
       this.e = p2;
    }
    public e b(boolean p0,String p1){
       e uoe;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "userId");
       if (this.c.j()) {
          uoe = (p0)? new e(i.class, new b$a(this, p1)): new e(h.class, new b$b(this, p1));
       }else if(p0){
          uoe = new e(g.class, new b$c(this, p1));
       }else {
          uoe = new e(f.class, new b$d(this, p1));
       }
       return uoe;
    }
}
