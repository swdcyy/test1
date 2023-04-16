package com.kuaishou.krn.lifecycle.JSLifecycleManager;
import com.kuaishou.krn.lifecycle.JSLifecycleManager$mLifecycleObservers$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JSLifecycleManager	// class@0008d8
{
    public static final p a;
    public static final JSLifecycleManager b;

    static {
       JSLifecycleManager.b = new JSLifecycleManager();
       JSLifecycleManager.a = s.c(JSLifecycleManager$mLifecycleObservers$2.INSTANCE);
    }
    public void JSLifecycleManager(){
       super();
    }
    public final ArrayList a(){
       Object obj = PatchProxy.apply(null, this, JSLifecycleManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JSLifecycleManager.a.getValue();
    }
}
