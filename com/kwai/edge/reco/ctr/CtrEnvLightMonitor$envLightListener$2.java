package com.kwai.edge.reco.ctr.CtrEnvLightMonitor$envLightListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.edge.reco.ctr.CtrEnvLightMonitor$envLightListener$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CtrEnvLightMonitor$envLightListener$2 extends Lambda implements a	// class@000d44
{
    public static final CtrEnvLightMonitor$envLightListener$2 INSTANCE;

    static {
       CtrEnvLightMonitor$envLightListener$2.INSTANCE = new CtrEnvLightMonitor$envLightListener$2();
    }
    public void CtrEnvLightMonitor$envLightListener$2(){
       super(0);
    }
    public final CtrEnvLightMonitor$envLightListener$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, CtrEnvLightMonitor$envLightListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CtrEnvLightMonitor$envLightListener$2$a();
    }
    public Object invoke(){
       return this.invoke();
    }
}
