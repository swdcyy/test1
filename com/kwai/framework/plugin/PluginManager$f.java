package com.kwai.framework.plugin.PluginManager$f;
import ae6.f;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.plugin.repository.persistence.PluginDatabase;
import com.kwai.framework.plugin.PluginManager;
import java.util.Objects;
import qrd.p;

public final class PluginManager$f implements f	// class@000c66
{

    public void PluginManager$f(){
       super();
    }
    public Object getValue(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PluginManager obj = PatchProxy.apply(null, this, PluginManager$f.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = PluginManager.H;
          Objects.requireNonNull(obj);
          obj = PatchProxy.apply(null, obj, PluginManager.class, "14");
          if (obj != patchProxyRe) {
          }else {
             obj = PluginManager.t.getValue();
          }
       }
       return obj;
    }
}
