package com.kwai.edge.reco.ctr.CtrEnvLightMonitor$logPageListener$2$a;
import k2b.s1;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.edge.reco.ctr.CtrEnvLightMonitor;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig;
import com.kwai.edge.reco.ctr.config.CTRPredictConfig;
import java.util.List;

public final class CtrEnvLightMonitor$logPageListener$2$a implements s1	// class@000d46
{
    public static final CtrEnvLightMonitor$logPageListener$2$a b;

    static {
       CtrEnvLightMonitor$logPageListener$2$a.b = new CtrEnvLightMonitor$logPageListener$2$a();
    }
    public void CtrEnvLightMonitor$logPageListener$2$a(){
       super();
    }
    public final void d(String p0,int p1,String p2){
       if (PatchProxy.isSupport(CtrEnvLightMonitor$logPageListener$2$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, CtrEnvLightMonitor$logPageListener$2$a.class, "1")) {
          return;
       }
       if (p1 == 1 || p1 == 3) {
          CtrEnvLightMonitor h = CtrEnvLightMonitor.h;
          if (h.a().d().b().contains(p0)) {
             h.f();
          }else {
             h.h();
          }
       }
       return;
    }
}
