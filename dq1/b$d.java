package dq1.b$d;
import z1.k;
import dq1.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController;
import bq1.f;
import yp1.b;
import zp1.i;
import zp1.l;

public final class b$d implements k	// class@001fe9
{
    public final b b;
    public final String c;

    public void b$d(b p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       f uof = PatchProxy.apply(null, this, b$d.class, "1");
       if (uof != PatchProxyResult.class) {
       }else {
          b$d tb = this.b;
          uof = new f(this.c, tb.c, tb.d, tb.e);
       }
       return uof;
    }
}
