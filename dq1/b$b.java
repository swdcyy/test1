package dq1.b$b;
import z1.k;
import dq1.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController;
import aq1.h;
import yp1.b;
import zp1.i;
import zp1.l;

public final class b$b implements k	// class@001fe7
{
    public final b b;
    public final String c;

    public void b$b(b p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       h oh = PatchProxy.apply(null, this, b$b.class, "1");
       if (oh != PatchProxyResult.class) {
       }else {
          b$b tb = this.b;
          oh = new h(this.c, tb.c, tb.d, tb.e);
       }
       return oh;
    }
}
