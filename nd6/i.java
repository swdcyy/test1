package nd6.i;
import mj7.a;
import com.kwai.framework.plugin.log.PluginLogger;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mj7.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import nd6.l;
import java.lang.Runnable;
import t45.c;
import com.kwai.framework.plugin.log.PluginInstallResultLogger;
import java.util.concurrent.ConcurrentHashMap;
import nd6.d;
import java.lang.System;

public final class i implements a	// class@001f35
{
    public final PluginLogger a;

    public void i(PluginLogger p0){
       a.p(p0, "logger");
       super();
       this.a = p0;
    }
    public void a(b p0){
       b a;
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       a.p(p0, "result");
       i ta = this.a;
       a = p0.a;
       String str = "result.pluginName";
       a.o(a, str);
       b b = p0.b;
       b e = p0.e;
       b f = p0.f;
       b d = p0.d;
       b c = p0.c;
       Objects.requireNonNull(ta);
       PluginLogger pluginLogger = PluginLogger.class;
       if (PatchProxy.isSupport(pluginLogger)) {
          objArray = new Object[]{a,Boolean.valueOf(b),Integer.valueOf(e),f,Long.valueOf(d),Boolean.valueOf(c)};
          if (PatchProxy.applyVoid(objArray, ta, pluginLogger, "4")) {
          label_006a :
             PluginInstallResultLogger g = PluginInstallResultLogger.g;
             b a1 = p0.a;
             a.o(a1, str);
             p0 = p0.c;
             Objects.requireNonNull(g);
             PluginInstallResultLogger pluginInstal = PluginInstallResultLogger.class;
             if (!PatchProxy.isSupport(pluginInstal) || !PatchProxy.applyVoidTwoRefs(a1, Boolean.valueOf(p0), g, pluginInstal, "11")) {
                a.p(a1, "pluginName");
                d uod = g.b().get(a1);
                if (uod != null) {
                   uod.isFirstInstall = p0;
                   uod.installedTimestamp = System.currentTimeMillis();
                }
             }
             return;
          }
       }
       a.p(a, "pluginName");
       l ol = new l(ta, a, b, e, f, d, c);
       c.a(objArray);
       goto label_006a ;
    }
}
