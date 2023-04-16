package com.kwai.framework.network.cronet.g;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.network.cronet.diagnostic.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.network.cronet.diagnostic.d;
import com.kuaishou.aegon.diagnostic.DiagnosticManager$a;
import com.kuaishou.aegon.diagnostic.DiagnosticManager;
import eb6.c;
import io7.a;

public final class g implements Runnable	// class@0017ad
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, null, a.class, "1")) {
       }else {
          a uoa = a.t();
          DiagnosticManager.setListener(new d());
          if (uoa != null) {
             a.a(uoa, true);
             c uoc = new c(uoa);
             uoa.p("cdnReliabilityMonitor_enableClientModule", uoc);
             uoa.p("cdnReliabilityMonitor_networkDiagnosisDomains", uoc);
             uoa.p("cdnReliabilityMonitor_dialTestDomainBlackList", uoc);
             uoa.p("cdnReliabilityMonitor_dialTestConfig", uoc);
             uoa.p("cdnReliabilityMonitor_dialTestDomainSelectionTimeRangeSecond", uoc);
             uoa.p("cdnReliabilityMonitor_domainStatisticsTimeRangeSecond", uoc);
             uoa.p("cdnReliabilityMonitor_DomainDialTestCoolDownTimeSecond", uoc);
          }
       }
       return;
    }
}
