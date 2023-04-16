package com.kwai.framework.plugin.PluginManager$mCleanListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.plugin.PluginManager$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PluginManager$mCleanListener$2 extends Lambda implements a	// class@000c6d
{
    public static final PluginManager$mCleanListener$2 INSTANCE;

    static {
       PluginManager$mCleanListener$2.INSTANCE = new PluginManager$mCleanListener$2();
    }
    public void PluginManager$mCleanListener$2(){
       super(0);
    }
    public final PluginManager$a invoke(){
       Object obj = PatchProxy.apply(null, this, PluginManager$mCleanListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PluginManager$a();
    }
    public Object invoke(){
       return this.invoke();
    }
}
