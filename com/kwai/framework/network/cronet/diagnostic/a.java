package com.kwai.framework.network.cronet.diagnostic.a;
import java.lang.Object;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.kuaishou.aegon.diagnostic.DiagnosticManager;

public class a	// class@0017a7
{

    public void a(){
       super();
    }
    public static void a(a p0,boolean p1){
       String[] stringArray = String[].class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoa, "3")) {
          return;
       }
       JsonObject value = p0.getValue("cdnReliabilityMonitor_dialTestConfig", JsonObject.class, null);
       if (value != null) {
          DiagnosticManager.setDialTestConfig(value.toString());
       }
       DiagnosticManager.setMonitoredHosts(p0.getValue("cdnReliabilityMonitor_networkDiagnosisDomains", stringArray, null));
       DiagnosticManager.setExcludedHosts(p0.getValue("cdnReliabilityMonitor_dialTestDomainBlackList", stringArray, null));
       if (p1) {
          DiagnosticManager.setAttentionErrorCodes(p0.getValue("cdnReliabilityMonitor_enableClientModuleErrorCodesForColdStart", int[].class, null));
       }
       DiagnosticManager.setDialUrlSelectionTimeRange(p0.a("cdnReliabilityMonitor_dialTestDomainSelectionTimeRangeSecond", -1));
       DiagnosticManager.setDomainStatisticsTimeRange(p0.a("cdnReliabilityMonitor_domainStatisticsTimeRangeSecond", -1));
       DiagnosticManager.setMinimalIntervalPerDomainSec(p0.a("cdnReliabilityMonitor_DomainDialTestCoolDownTimeSecond", -1));
       DiagnosticManager.setEnable(p0.d("cdnReliabilityMonitor_enableClientModule", false));
       return;
    }
}
