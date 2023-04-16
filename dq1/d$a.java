package dq1.d$a;
import z1.k;
import dq1.d;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController;
import aq1.k;
import yp1.b;
import zp1.i;
import zp1.l;

public final class d$a implements k	// class@001fec
{
    public final d b;
    public final String c;

    public void d$a(d p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       k ok = PatchProxy.apply(null, this, d$a.class, "1");
       if (ok != PatchProxyResult.class) {
       }else {
          d$a tb = this.b;
          ok = new k(this.c, tb.c, tb.d, tb.e);
       }
       return ok;
    }
}
