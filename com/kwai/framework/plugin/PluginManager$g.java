package com.kwai.framework.plugin.PluginManager$g;
import ae6.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kd6.c;
import com.kwai.framework.plugin.PluginManager;

public final class PluginManager$g implements f	// class@000c68
{

    public void PluginManager$g(){
       super();
    }
    public Object getValue(){
       c uoc = PatchProxy.apply(null, this, PluginManager$g.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = PluginManager.H.s();
       }
       return uoc;
    }
}
