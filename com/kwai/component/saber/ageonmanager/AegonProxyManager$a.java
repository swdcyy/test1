package com.kwai.component.saber.ageonmanager.AegonProxyManager$a;
import java.lang.Object;
import nsd.u;
import com.kwai.component.saber.ageonmanager.AegonProxyManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class AegonProxyManager$a	// class@000b21
{

    public void AegonProxyManager$a(){
       super();
    }
    public void AegonProxyManager$a(u p0){
       super();
    }
    public final AegonProxyManager a(){
       Object obj = PatchProxy.apply(null, this, AegonProxyManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AegonProxyManager.e.getValue();
    }
}
