package com.kwai.framework.plugin.PluginManager$mInstallReporter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import nd6.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.plugin.PluginManager;
import com.kwai.framework.plugin.log.PluginLogger;

public final class PluginManager$mInstallReporter$2 extends Lambda implements a	// class@000c72
{
    public static final PluginManager$mInstallReporter$2 INSTANCE;

    static {
       PluginManager$mInstallReporter$2.INSTANCE = new PluginManager$mInstallReporter$2();
    }
    public void PluginManager$mInstallReporter$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final i invoke(){
       Object obj = PatchProxy.apply(null, this, PluginManager$mInstallReporter$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i(PluginManager.H.r());
    }
}
