package com.kwai.framework.plugin.PluginManager$mPluginWarmUpManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.plugin.warmup.PluginWarmUpManagerImpl;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.plugin.PluginManager;
import com.kwai.framework.plugin.repository.remote.RemoteProvider;
import java.util.Objects;
import bd6.a;
import qrd.p;
import kotlin.jvm.internal.a;
import ae6.f;

public final class PluginManager$mPluginWarmUpManager$2 extends Lambda implements a	// class@000c79
{
    public static final PluginManager$mPluginWarmUpManager$2 INSTANCE;

    static {
       PluginManager$mPluginWarmUpManager$2.INSTANCE = new PluginManager$mPluginWarmUpManager$2();
    }
    public void PluginManager$mPluginWarmUpManager$2(){
       super(0);
    }
    public final PluginWarmUpManagerImpl invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, PluginManager$mPluginWarmUpManager$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       PluginManager h = PluginManager.H;
       RemoteProvider remoteProvid = h.j();
       PluginManager$g l = PluginManager.l;
       Objects.requireNonNull(h);
       Object obj1 = PatchProxy.apply(objArray, h, PluginManager.class, "5");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = PluginManager.i.getValue();
       }
       a.o(obj1, "mCacheManager");
       return new PluginWarmUpManagerImpl(remoteProvid, l, obj1);
    }
    public Object invoke(){
       return this.invoke();
    }
}
