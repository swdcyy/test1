package com.kuaishou.tuna_core.plugin.n;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.tuna_core.plugin.n$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import com.kuaishou.tuna_core.plugin.n$b;
import com.kwai.plugin.dva.work.c$c;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.kwai.robust.PatchProxyResult;
import jd6.g;

public final class n	// class@001124
{
    public static final n a;

    static {
       n.a = new n();
    }
    public void n(){
       super();
    }
    public final void a(String p0,n$a p1,boolean p2){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, n.class, "2")) {
          return;
       }
       a.p(p0, "moduleName");
       Dva uDva = Dva.instance();
       a.o(uDva, "Dva.instance\(\)");
       uDva.getPluginInstallManager().j(p0).a(new n$b(p1, p0));
       if (p2) {
          PluginDownloadExtension.k.s(p0, 40);
       }
       PluginDownloadExtension.k.a(p0);
       return;
    }
    public final boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "moduleName");
       boolean b = (g.e(p0) || Dva.instance().isLoaded(p0))? true: false;
       return b;
    }
}
