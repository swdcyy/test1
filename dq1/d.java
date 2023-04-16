package dq1.d;
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
import aq1.k;
import dq1.d$a;
import z1.k;
import aq1.j;
import dq1.d$b;
import bq1.i;
import dq1.d$c;
import bq1.h;
import dq1.d$d;

public final class d extends a	// class@001ff0
{
    public final b c;
    public final i d;
    public final l e;

    public void d(b p0,i p1,l p2){
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
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "userId");
       if (this.c.i(p1)) {
          return null;
       }else if(this.c.j()){
          uoe = (p0)? new e(k.class, new d$a(this, p1)): new e(j.class, new d$b(this, p1));
       }else if(p0){
          uoe = new e(i.class, new d$c(this, p1));
       }else {
          uoe = new e(h.class, new d$d(this, p1));
       }
       return uoe;
    }
}
