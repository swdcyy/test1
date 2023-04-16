package com.kwai.framework.plugin.log.PluginLogger$mGson$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.google.gson.Gson;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PluginLogger$mGson$2 extends Lambda implements a	// class@000c9e
{
    public static final PluginLogger$mGson$2 INSTANCE;

    static {
       PluginLogger$mGson$2.INSTANCE = new PluginLogger$mGson$2();
    }
    public void PluginLogger$mGson$2(){
       super(0);
    }
    public final Gson invoke(){
       Object obj = PatchProxy.apply(null, this, PluginLogger$mGson$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Gson();
    }
    public Object invoke(){
       return this.invoke();
    }
}
