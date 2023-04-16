package com.kwai.plugin.dva.split.b;
import com.kwai.plugin.dva.install.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.plugin.dva.split.SplitManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import java.util.Objects;
import com.kwai.plugin.dva.split.NativeLibraryInstaller;

public final class b implements a	// class@001389
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void a(String p0){
       SplitManager a;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, null, SplitManager.class, "10")) {
       }else {
          a.p(p0, "pluginName");
          List c = SplitManager.c;
          ArrayList uArrayList = new ArrayList(u.Y(c, 10));
          Iterator iterator = c.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().name);
          }
          if (uArrayList.contains(p0)) {
             a = SplitManager.a;
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(p0, a, SplitManager.class, "8")) {
                a.a().b(p0);
             }
          }
          PatchProxy.onMethodExit(SplitManager.class, "10");
       }
       return;
    }
}
