package com.kwai.framework.plugin.PluginManager$mLoadReporter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import nd6.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.plugin.PluginManager;
import com.kwai.framework.plugin.log.PluginLogger;

public final class PluginManager$mLoadReporter$2 extends Lambda implements a	// class@000c74
{
    public static final PluginManager$mLoadReporter$2 INSTANCE;

    static {
       PluginManager$mLoadReporter$2.INSTANCE = new PluginManager$mLoadReporter$2();
    }
    public void PluginManager$mLoadReporter$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, PluginManager$mLoadReporter$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j(PluginManager.H.r());
    }
}
