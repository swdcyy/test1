package fia.q;
import erd.o;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class q implements o	// class@002933
{
    public static final q b;

    static {
       q.b = new q();
    }
    public void q(){
       super();
    }
    public Object apply(Object p0){
       n on = PatchProxy.applyOneRefs(p0, this, q.class, "1");
       if (on != PatchProxyResult.class) {
       }else {
          a.p(p0, "event");
          on = p0.b;
       }
       return on;
    }
}
