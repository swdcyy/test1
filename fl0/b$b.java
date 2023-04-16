package fl0.b$b;
import erd.g;
import fl0.b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import android.os.SystemClock;

public final class b$b implements g	// class@002370
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0 = PluginDownloadExtension.k;
             p0.s("life_plugin", 40);
             p0.a("life_plugin");
             p0.s = SystemClock.elapsedRealtime();
          }
       }
       return;
    }
}
