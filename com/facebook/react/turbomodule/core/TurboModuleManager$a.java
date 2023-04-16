package com.facebook.react.turbomodule.core.TurboModuleManager$a;
import com.facebook.react.turbomodule.core.TurboModuleManager$d;
import com.facebook.react.turbomodule.core.TurboModuleManager;
import com.facebook.react.turbomodule.core.TurboModuleManagerDelegate;
import java.lang.Object;
import java.lang.String;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public class TurboModuleManager$a implements TurboModuleManager$d	// class@001308
{
    public final TurboModuleManagerDelegate a;
    public final TurboModuleManager b;

    public void TurboModuleManager$a(TurboModuleManager p0,TurboModuleManagerDelegate p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public TurboModule a(String p0){
       TurboModuleManager$a ta = this.a;
       if (ta == null) {
          return null;
       }
       return ta.b(p0);
    }
}
