package fia.f$k;
import erd.o;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class f$k implements o	// class@002906
{
    public static final f$k b;

    static {
       f$k.b = new f$k();
    }
    public void f$k(){
       super();
    }
    public Object apply(Object p0){
       n on = PatchProxy.applyOneRefs(p0, this, f$k.class, "1");
       if (on != PatchProxyResult.class) {
       }else {
          a.p(p0, "event");
          on = p0.b;
       }
       return on;
    }
}
