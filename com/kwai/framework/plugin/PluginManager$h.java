package com.kwai.framework.plugin.PluginManager$h;
import ae6.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import be6.e;
import com.kwai.framework.plugin.PluginManager;

public final class PluginManager$h implements f	// class@000c69
{

    public void PluginManager$h(){
       super();
    }
    public Object getValue(){
       e uoe = PatchProxy.apply(null, this, PluginManager$h.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = PluginManager.H.u();
       }
       return uoe;
    }
}
