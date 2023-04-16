package ao.b$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.activity.kwaibubble.log.KwaiPopLog;
import java.lang.StringBuilder;

public final class b$c implements g	// class@000200
{
    public static final b$c b;

    static {
       b$c.b = new b$c();
    }
    public void b$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
       }else {
          a.p(p0, "throwable");
          Object[] objArray = new Object[0];
          KwaiPopLog.e.D("link death:"+p0.getMessage(), objArray);
       }
       return;
    }
}
