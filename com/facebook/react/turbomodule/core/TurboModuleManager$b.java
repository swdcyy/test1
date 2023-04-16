package com.facebook.react.turbomodule.core.TurboModuleManager$b;
import com.facebook.react.turbomodule.core.TurboModuleManager$d;
import com.facebook.react.turbomodule.core.TurboModuleManager;
import com.facebook.react.turbomodule.core.TurboModuleManagerDelegate;
import java.lang.Object;
import java.lang.String;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.CxxModuleWrapper;
import java.lang.StringBuilder;
import od.a;

public class TurboModuleManager$b implements TurboModuleManager$d	// class@001309
{
    public final TurboModuleManagerDelegate a;
    public final TurboModuleManager b;

    public void TurboModuleManager$b(TurboModuleManager p0,TurboModuleManagerDelegate p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public TurboModule a(String p0){
       TurboModuleManager$b ta = this.a;
       TurboModule turboModule = null;
       if (ta == null) {
          return turboModule;
       }
       CxxModuleWrapper legacyCxxMod = ta.getLegacyCxxModule(p0);
       if (legacyCxxMod == null) {
          return turboModule;
       }
       a.b(legacyCxxMod instanceof TurboModule, "CxxModuleWrapper \""+p0+"\" is not a TurboModule");
       return legacyCxxMod;
    }
}
