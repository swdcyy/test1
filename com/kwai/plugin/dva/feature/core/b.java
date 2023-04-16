package com.kwai.plugin.dva.feature.core.b;
import com.kwai.plugin.dva.install.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.plugin.dva.feature.core.FeatureManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.plugin.dva.split.NativeLibraryInstaller;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.entity.Plugin;
import com.kwai.plugin.dva.repository.model.PluginInfo;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import bj7.a;
import java.lang.ClassLoader;

public final class b implements a	// class@001302
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void a(String p0){
       FeatureManager a;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, null, FeatureManager.class, "23")) {
       }else {
          a.p(p0, "pluginName");
          if (FeatureManager.e.contains(p0)) {
             FeatureManager.a.d().b(p0);
          }
          Plugin plugin = Dva.instance().getPlugin(p0);
          if (plugin != null && plugin.getPluginType() != 1) {
             a = FeatureManager.a;
             PluginInfo soDir = plugin.getPluginInfo().soDir;
             a.o(soDir, "it.pluginInfo.soDir");
             _monitor_enter(a);
             if (PatchProxy.applyVoidOneRefs(soDir, a, FeatureManager.class, "6")) {
                _monitor_exit(a);
             }else {
                List plugins = Dva.instance().getPlugins();
                a.o(plugins, "instance\(\).plugins");
                Iterator iterator = plugins.iterator();
                while (iterator.hasNext()) {
                   Plugin plugin1 = iterator.next();
                   if (plugin1.getPluginType() == 1) {
                      String name = plugin1.getName();
                      a.o(name, "it.name");
                      if (a.a.d(name) && plugin1.getClassLoader() != null) {
                         ClassLoader classLoader = plugin1.getClassLoader();
                         a.m(classLoader);
                         a.o(classLoader, "it.classLoader!!");
                         FeatureManager.a.d().a(classLoader, soDir);
                      }
                   }
                }
                _monitor_exit(a);
             }
          }
          PatchProxy.onMethodExit(FeatureManager.class, "23");
       }
       return;
    }
}
