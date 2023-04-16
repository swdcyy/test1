package dq1.d$c;
import z1.k;
import dq1.d;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController;
import bq1.i;
import yp1.b;
import zp1.i;
import zp1.l;

public final class d$c implements k	// class@001fee
{
    public final d b;
    public final String c;

    public void d$c(d p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       i oi = PatchProxy.apply(null, this, d$c.class, "1");
       if (oi != PatchProxyResult.class) {
       }else {
          d$c tb = this.b;
          oi = new i(this.c, tb.c, tb.d, tb.e);
       }
       return oi;
    }
}
