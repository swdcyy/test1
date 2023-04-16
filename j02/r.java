package j02.r;
import erd.o;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import kotlin.jvm.internal.a;

public final class r implements o	// class@002a2e
{
    public static final r b;

    static {
       r.b = new r();
    }
    public void r(){
       super();
    }
    public Object apply(Object p0){
       Long longx = PatchProxy.applyOneRefs(p0, this, r.class, "1");
       if (longx != PatchProxyResult.class) {
       }else {
          a.p(p0, "retryTimes");
          long l = (p0.intValue() == 1)? 1000: 3000;
          longx = Long.valueOf(l);
       }
       return longx;
    }
}
