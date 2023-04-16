package com.kwai.framework.plugin.PluginManager$mDeviceSource$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import rd6.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.plugin.PluginManager;
import android.content.Context;

public final class PluginManager$mDeviceSource$2 extends Lambda implements a	// class@000c70
{
    public static final PluginManager$mDeviceSource$2 INSTANCE;

    static {
       PluginManager$mDeviceSource$2.INSTANCE = new PluginManager$mDeviceSource$2();
    }
    public void PluginManager$mDeviceSource$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, PluginManager$mDeviceSource$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(PluginManager.a(PluginManager.H));
    }
}
