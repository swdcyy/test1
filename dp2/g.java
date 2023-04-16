package dp2.g;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.FailWithReason;
import brd.t;

public final class g implements o	// class@002571
{

    public void g(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "t");
          ot = t.error(new FailWithReason(2, p0));
       }
       return ot;
    }
}
