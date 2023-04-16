package oj7.a;
import oj7.b;
import android.content.Context;
import oj7.d;
import java.lang.Object;
import com.kwai.plugin.dva.repository.store.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicReference;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Iterator;
import com.kwai.plugin.dva.repository.model.ComponentInfo;
import java.io.File;
import nj7.c;

public class a implements b	// class@002029
{

    public void a(Context p0,d p1){
       super();
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "2")) {
       }else {
          a.f.compareAndSet(null, new a(p0, p1));
       }
       return;
    }
    public PluginConfig a(String p0){
       PluginConfig pluginConfig;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          pluginConfig = obj.next();
          if (p0.equals(pluginConfig.name)) {
             break ;
          }
       }
       return pluginConfig;
    }
    public List b(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.c().e();
    }
    public ComponentInfo c(PluginConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.c().a(c.a(p0.name, p0.version).getAbsolutePath());
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       a.c().k(p0);
       return;
    }
    public void e(PluginConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.c().m(p0);
       return;
    }
    public void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.c().p(p0);
       return;
    }
    public void g(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       a.c().l(p0);
       return;
    }
}
