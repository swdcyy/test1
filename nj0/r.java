package nj0.r;
import erd.c;
import com.kuaishou.krn.delegate.k;
import java.lang.Object;
import fk0.a;
import com.kuaishou.krn.load.JsRuntimeState;
import com.kuaishou.krn.delegate.KrnDelegate;
import lj0.c;
import sj0.b;
import com.kuaishou.krn.widget.react.KrnReactRootView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;
import com.kuaishou.krn.model.LaunchModel;
import ukd.a;
import java.lang.Exception;

public final class r implements c	// class@00333f
{
    public final k a;

    public void r(k p0){
       this.a = p0;
    }
    public final Object a(Object p0,Object p1){
       r ta = this.a;
       p1 = ta.e;
       p1.h = p0;
       p1.i().m(p0);
       p1 = ta.g();
       if (PatchProxy.applyVoidOneRefs(p1, ta, k.class, "23")) {
       }else if(p1 == null || !ta.d.g().containsKey("krnAutoTestRouterKey")){
          try{
             Object[] objArray = new Object[]{ta.e};
             a.b("com.kuaishou.krn.debug.bridges.BridgeHookInvokedManager", "enableBridgeHookInvoked", objArray);
          }catch(java.lang.Exception e6){
             e6.printStackTrace();
          }
       }
    }
}
