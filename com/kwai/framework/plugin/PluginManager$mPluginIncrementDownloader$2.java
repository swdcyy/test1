package com.kwai.framework.plugin.PluginManager$mPluginIncrementDownloader$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.plugin.incremental.IncrementDownloaderImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.plugin.PluginManager;
import com.kwai.framework.plugin.incremental.IncrementStoreImpl;
import com.kwai.framework.plugin.repository.remote.RemoteProvider;
import kd6.f;

public final class PluginManager$mPluginIncrementDownloader$2 extends Lambda implements a	// class@000c77
{
    public static final PluginManager$mPluginIncrementDownloader$2 INSTANCE;

    static {
       PluginManager$mPluginIncrementDownloader$2.INSTANCE = new PluginManager$mPluginIncrementDownloader$2();
    }
    public void PluginManager$mPluginIncrementDownloader$2(){
       super(0);
    }
    public final IncrementDownloaderImpl invoke(){
       Object obj = PatchProxy.apply(null, this, PluginManager$mPluginIncrementDownloader$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PluginManager h = PluginManager.H;
       IncrementStoreImpl incrementSto = h.n();
       return new IncrementDownloaderImpl(incrementSto, h.j());
    }
    public Object invoke(){
       return this.invoke();
    }
}
