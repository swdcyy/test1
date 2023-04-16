package com.kuaishou.krn.lifecycle.AppLifecycleManager$b;
import java.lang.Object;
import nsd.u;
import com.kuaishou.krn.lifecycle.AppLifecycleManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.lifecycle.AppLifecycleManager$b$a;
import java.util.Objects;

public final class AppLifecycleManager$b	// class@0008d4
{

    public void AppLifecycleManager$b(){
       super();
    }
    public void AppLifecycleManager$b(u p0){
       super();
    }
    public final AppLifecycleManager a(){
       Object obj = PatchProxy.apply(null, this, AppLifecycleManager$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(AppLifecycleManager$b$a.b);
       return AppLifecycleManager$b$a.a;
    }
}
