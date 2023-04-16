package d92.k$b;
import joc.o;
import d92.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.u1;
import t02.a0;
import com.kwai.feature.api.live.base.service.statistics.CloseLiveReason;
import tq5.c;

public class k$b extends o	// class@0024b0
{
    public final k a;

    public void k$b(k p0){
       this.a = p0;
       super();
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, k$b.class, "1")) {
          return;
       }
       u1.K0(3);
       this.a.p.w1.ub(CloseLiveReason.RIGHT_SWIPE);
       return;
    }
}
