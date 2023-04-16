package ad6.e;
import io7.a;
import java.lang.Object;
import java.lang.String;
import io7.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.plugin.PluginManager;
import rd6.d;

public final class e implements a	// class@000079
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void a(String p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       if (p1 != null) {
          PluginManager.H.t().c(p1.a(true));
       }
       return;
    }
}
