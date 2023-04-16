package cgc.e;
import io.reactivex.g;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.logger.KwaiLog;
import cgc.f;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import cgc.e$a;
import com.kwai.plugin.dva.work.c$c;

public final class e implements g	// class@000597
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       Object[] objArray = new Object[0];
       KwaiLog.c("screencast_plugin", "SCREENCAST_PLUGIN", "插件开始下载逻辑", objArray);
       f b = f.b;
       b.c("biz_screencast_plugin_start", "", "DVA_RELOAD");
       f.a(b, true);
       Dva uDva = Dva.instance();
       a.o(uDva, "Dva.instance\(\)");
       uDva.getPluginInstallManager().j("screencast_plugin").a(new e$a(p0));
       return;
    }
}
