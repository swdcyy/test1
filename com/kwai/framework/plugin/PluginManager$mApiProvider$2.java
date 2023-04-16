package com.kwai.framework.plugin.PluginManager$mApiProvider$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.plugin.repository.remote.RemoteProvider;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.plugin.PluginManager;
import android.content.Context;

public final class PluginManager$mApiProvider$2 extends Lambda implements a	// class@000c6b
{
    public static final PluginManager$mApiProvider$2 INSTANCE;

    static {
       PluginManager$mApiProvider$2.INSTANCE = new PluginManager$mApiProvider$2();
    }
    public void PluginManager$mApiProvider$2(){
       super(0);
    }
    public final RemoteProvider invoke(){
       Object obj = PatchProxy.apply(null, this, PluginManager$mApiProvider$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RemoteProvider(PluginManager.a(PluginManager.H));
    }
    public Object invoke(){
       return this.invoke();
    }
}
