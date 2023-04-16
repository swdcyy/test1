package k71.k$b;
import z1.k;
import k71.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import lp3.e;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import n91.f;
import lp3.c;
import kotlin.jvm.internal.a;

public final class k$b implements k	// class@002cb9
{
    public final k b;

    public void k$b(k p0){
       this.b = p0;
       super();
    }
    public Object get(){
       Long longx = PatchProxy.apply(null, this, k$b.class, "1");
       if (longx != PatchProxyResult.class) {
       }else {
          c uoc = this.b.h().a(f.class);
          a.o(uoc, "serviceManager.getServic¡­TimeProvider::class.java\)");
          longx = Long.valueOf(uoc.s());
       }
       return longx;
    }
}
