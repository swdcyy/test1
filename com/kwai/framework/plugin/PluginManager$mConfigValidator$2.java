package com.kwai.framework.plugin.PluginManager$mConfigValidator$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ad6.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PluginManager$mConfigValidator$2 extends Lambda implements a	// class@000c6f
{
    public static final PluginManager$mConfigValidator$2 INSTANCE;

    static {
       PluginManager$mConfigValidator$2.INSTANCE = new PluginManager$mConfigValidator$2();
    }
    public void PluginManager$mConfigValidator$2(){
       super(0);
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, PluginManager$mConfigValidator$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public Object invoke(){
       return this.invoke();
    }
}
