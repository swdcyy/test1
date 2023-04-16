package com.kwai.framework.plugin.PluginManager$mSPProvider$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.plugin.PluginManager$mSPProvider$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PluginManager$mSPProvider$2 extends Lambda implements a	// class@000c7c
{
    public static final PluginManager$mSPProvider$2 INSTANCE;

    static {
       PluginManager$mSPProvider$2.INSTANCE = new PluginManager$mSPProvider$2();
    }
    public void PluginManager$mSPProvider$2(){
       super(0);
    }
    public final PluginManager$mSPProvider$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, PluginManager$mSPProvider$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PluginManager$mSPProvider$2$a();
    }
    public Object invoke(){
       return this.invoke();
    }
}
