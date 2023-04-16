package aq1.i;
import aq1.l;
import java.lang.String;
import yp1.b;
import zp1.i;
import zp1.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class i extends l	// class@000288
{
    public final String Q;
    public final b R;
    public final i S;
    public final l T;

    public void i(String p0,b p1,i p2,l p3){
       a.p(p0, "cellUserId");
       a.p(p1, "renderModel");
       a.p(p2, "chatCellBaseDelegate");
       a.p(p3, "chatCellRendDelegate");
       super(p0, p1, p2, p3);
       this.Q = p0;
       this.R = p1;
       this.S = p2;
       this.T = p3;
    }
    public Integer G3(){
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Integer.valueOf(5);
    }
    public boolean y3(){
       return true;
    }
}
