package dq1.d$b;
import z1.k;
import dq1.d;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController;
import aq1.j;
import yp1.b;
import zp1.i;
import zp1.l;

public final class d$b implements k	// class@001fed
{
    public final d b;
    public final String c;

    public void d$b(d p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       j oj = PatchProxy.apply(null, this, d$b.class, "1");
       if (oj != PatchProxyResult.class) {
       }else {
          d$b tb = this.b;
          oj = new j(this.c, tb.c, tb.d, tb.e);
       }
       return oj;
    }
}
