package com.ks.ksapi.DefaultDynamicLibLoader;
import com.ks.ksapi.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.kwai.plugin.dva.Dva;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;

public final class DefaultDynamicLibLoader implements a	// class@000748
{

    public void DefaultDynamicLibLoader(){
       super();
    }
    public boolean loadLibs(){
       Dva obj = PatchProxy.apply(null, this, DefaultDynamicLibLoader.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PluginDownloadExtension.k.s("rickon", 40);
       obj = Dva.instance();
       a.o(obj, "Dva.instance\(\)");
       obj.getPluginInstallManager().j("rickon").c();
       return Dva.instance().isLoaded("rickon");
    }
}
