package com.kwai.framework.plugin.PluginManager$mUrlSource$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.plugin.downloader.url.source.CDNUrlSourceImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.plugin.PluginManager;
import com.kwai.framework.plugin.repository.remote.RemoteProvider;

public final class PluginManager$mUrlSource$2 extends Lambda implements a	// class@000c7e
{
    public static final PluginManager$mUrlSource$2 INSTANCE;

    static {
       PluginManager$mUrlSource$2.INSTANCE = new PluginManager$mUrlSource$2();
    }
    public void PluginManager$mUrlSource$2(){
       super(0);
    }
    public final CDNUrlSourceImpl invoke(){
       Object obj = PatchProxy.apply(null, this, PluginManager$mUrlSource$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CDNUrlSourceImpl(PluginManager.H.j());
    }
    public Object invoke(){
       return this.invoke();
    }
}
