package dq1.b$a;
import z1.k;
import dq1.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController;
import aq1.i;
import yp1.b;
import zp1.i;
import zp1.l;

public final class b$a implements k	// class@001fe6
{
    public final b b;
    public final String c;

    public void b$a(b p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       i oi = PatchProxy.apply(null, this, b$a.class, "1");
       if (oi != PatchProxyResult.class) {
       }else {
          b$a tb = this.b;
          oi = new i(this.c, tb.c, tb.d, tb.e);
       }
       return oi;
    }
}
