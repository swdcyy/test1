package com.kwai.framework.plugin.PluginManager$b;
import ij7.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.framework.plugin.PluginManager;

public final class PluginManager$b implements d	// class@000c61
{

    public void PluginManager$b(){
       super();
    }
    public void a(long p0,String p1,int p2){
       if (PatchProxy.isSupport(PluginManager$b.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Integer.valueOf(p2), this, PluginManager$b.class, "1")) {
          return;
       }
       a.p(p1, "pluginName");
       Log.g("PluginManager", "plugin onStateUpdate "+p1+' '+p2);
       if (p2 == 0x2904) {
          PluginManager h = PluginManager.H;
          h.M();
          h.g();
          h.L(false);
       }
       return;
    }
}
