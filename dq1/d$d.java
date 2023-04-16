package dq1.d$d;
import z1.k;
import dq1.d;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController;
import bq1.h;
import yp1.b;
import zp1.i;
import zp1.l;

public final class d$d implements k	// class@001fef
{
    public final d b;
    public final String c;

    public void d$d(d p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       h oh = PatchProxy.apply(null, this, d$d.class, "1");
       if (oh != PatchProxyResult.class) {
       }else {
          d$d tb = this.b;
          oh = new h(this.c, tb.c, tb.d, tb.e);
       }
       return oh;
    }
}
