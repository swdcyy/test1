package a7a.l$m;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class l$m implements r	// class@000069
{
    public static final l$m b;

    static {
       l$m.b = new l$m();
    }
    public void l$m(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, l$m.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "active");
          b = p0.booleanValue();
          PatchProxy.onMethodExit(l$m.class, "1");
       }
       return b;
    }
}
