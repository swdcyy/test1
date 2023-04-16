package com.kwai.framework.plugin.PluginManager$mPluginSource$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.plugin.repository.DefaultPluginSource;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.plugin.PluginManager;
import com.kwai.framework.plugin.repository.remote.RemoteProvider;
import com.kwai.framework.plugin.PluginManager$f;
import ae6.f;

public final class PluginManager$mPluginSource$2 extends Lambda implements a	// class@000c78
{
    public static final PluginManager$mPluginSource$2 INSTANCE;

    static {
       PluginManager$mPluginSource$2.INSTANCE = new PluginManager$mPluginSource$2();
    }
    public void PluginManager$mPluginSource$2(){
       super(0);
    }
    public final DefaultPluginSource invoke(){
       Object obj = PatchProxy.apply(null, this, PluginManager$mPluginSource$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PluginManager h = PluginManager.H;
       RemoteProvider remoteProvid = h.j();
       return new DefaultPluginSource(remoteProvid, PluginManager.c(h));
    }
    public Object invoke(){
       return this.invoke();
    }
}
