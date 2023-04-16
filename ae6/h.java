package ae6.h;
import java.lang.Object;
import com.kwai.plugin.dva.install.b;
import java.lang.String;
import com.kwai.dva.design.PluginInstallerUIHandler$a;
import com.kwai.dva.design.PluginInstallerUIHandler;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import vi5.b;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.work.c;
import wi5.a;
import vi5.j;
import java.util.List;
import java.util.Iterator;

public class h	// class@000087
{

    public void h(){
       super();
    }
    public static PluginInstallerUIHandler a(b p0,String p1,PluginInstallerUIHandler$a p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PluginInstallerUIHandler obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, h.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       PluginDownloadExtension.k.s(p1, 40);
       obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "<this>");
          a.p(p1, "plugin");
          a.p(p2, "builder");
          c uoc = Dva.instance().getPluginInstallManager().j(p1);
          a.o(uoc, "instance\(\).pluginInstall¡­ager.startInstall\(plugin\)");
          p2.f(new a(uoc));
          obj = p2.a();
          obj.g();
       }
       return obj;
    }
    public static PluginInstallerUIHandler b(b p0,List p1,PluginInstallerUIHandler$a p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Iterator obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, h.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p1.iterator();
       while (obj.hasNext()) {
          PluginDownloadExtension.k.s(obj.next(), 40);
       }
       PluginInstallerUIHandler pluginInstal = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "2");
       if (pluginInstal != patchProxyRe) {
       }else {
          a.p(p0, "<this>");
          a.p(p1, "plugins");
          a.p(p2, "builder");
          c uoc = Dva.instance().getPluginInstallManager().k(p1);
          a.o(uoc, "instance\(\).pluginInstall¡­ger.startInstall\(plugins\)");
          p2.f(new a(uoc));
          pluginInstal = p2.a();
          pluginInstal.g();
       }
       return pluginInstal;
    }
}
