package nd6.j;
import mj7.c;
import com.kwai.framework.plugin.log.PluginLogger;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mj7.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import nd6.m;
import java.lang.Runnable;
import t45.c;

public final class j implements c	// class@001f36
{
    public final PluginLogger a;

    public void j(PluginLogger p0){
       a.p(p0, "logger");
       super();
       this.a = p0;
    }
    public void a(d p0){
       d a;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       a.p(p0, "result");
       j ta = this.a;
       a = p0.a;
       a.o(a, "result.pluginName");
       d c = p0.c;
       d e = p0.e;
       d f = p0.f;
       d d = p0.d;
       d b = p0.b;
       Objects.requireNonNull(ta);
       PluginLogger pluginLogger = PluginLogger.class;
       if (PatchProxy.isSupport(pluginLogger)) {
          Object[] objArray = new Object[]{a,Boolean.valueOf(c),Integer.valueOf(e),f,Long.valueOf(d),b};
          if (PatchProxy.applyVoid(objArray, ta, pluginLogger, "12")) {
          label_0066 :
             return;
          }
       }
       a.p(a, "pluginName");
       m om = new m(ta, a, c, e, f, d, b);
       c.a("pluginName");
       goto label_0066 ;
    }
}
