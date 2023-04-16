package dq1.b$c;
import z1.k;
import dq1.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController;
import bq1.g;
import yp1.b;
import zp1.i;
import zp1.l;

public final class b$c implements k	// class@001fe8
{
    public final b b;
    public final String c;

    public void b$c(b p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       g og = PatchProxy.apply(null, this, b$c.class, "1");
       if (og != PatchProxyResult.class) {
       }else {
          b$c tb = this.b;
          og = new g(this.c, tb.c, tb.d, tb.e);
       }
       return og;
    }
}
