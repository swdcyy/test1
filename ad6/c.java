package ad6.c;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.plugin.PluginManager;
import cd6.b;

public final class c implements Runnable	// class@000077
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       if (a.t().d("clean_qigsaw_dir", false)) {
          PluginManager.H.k().a();
       }
       return;
    }
}
