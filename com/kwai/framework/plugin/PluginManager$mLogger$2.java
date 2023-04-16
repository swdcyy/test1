package com.kwai.framework.plugin.PluginManager$mLogger$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.plugin.log.PluginLogger;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.plugin.PluginManager;
import com.kwai.framework.plugin.repository.remote.RemoteProvider;
import rd6.d;

public final class PluginManager$mLogger$2 extends Lambda implements a	// class@000c75
{
    public static final PluginManager$mLogger$2 INSTANCE;

    static {
       PluginManager$mLogger$2.INSTANCE = new PluginManager$mLogger$2();
    }
    public void PluginManager$mLogger$2(){
       super(0);
    }
    public final PluginLogger invoke(){
       Object obj = PatchProxy.apply(null, this, PluginManager$mLogger$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PluginManager h = PluginManager.H;
       RemoteProvider remoteProvid = h.j();
       return new PluginLogger(remoteProvid, h.t());
    }
    public Object invoke(){
       return this.invoke();
    }
}
