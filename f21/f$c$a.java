package f21.f$c$a;
import z1.k;
import f21.f$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import f21.f;
import n91.f;
import lp3.c;
import lp3.i;
import kotlin.jvm.internal.a;

public final class f$c$a implements k	// class@0022a6
{
    public final f$c b;

    public void f$c$a(f$c p0){
       this.b = p0;
       super();
    }
    public Object get(){
       Long longx = PatchProxy.apply(null, this, f$c$a.class, "1");
       if (longx != PatchProxyResult.class) {
       }else {
          c uoc = this.b.a.p.a(f.class);
          a.o(uoc, "liveServiceManager.getSe¡­lass.java\n              \)");
          longx = Long.valueOf(uoc.s());
       }
       return longx;
    }
}
