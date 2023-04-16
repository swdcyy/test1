package com.kuaishou.growth.pendant.realtime.price.core.PrtpReportSwitchConfig;
import java.io.Serializable;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpReportSwitchConfig$a;
import nsd.u;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;

public final class PrtpReportSwitchConfig implements Serializable	// class@0006ad
{
    public long reportMerge;
    public ArrayList reportMergeKeys;
    public static final PrtpReportSwitchConfig$a Companion;
    public static final PrtpReportSwitchConfig DEFAULT;
    public static final PrtpReportSwitchConfig TEST;
    public static final long serialVersionUID;

    static {
       PrtpReportSwitchConfig.Companion = new PrtpReportSwitchConfig$a(null);
       PrtpReportSwitchConfig prtpReportSw = new PrtpReportSwitchConfig();
       prtpReportSw.reportMerge = 120;
       prtpReportSw.reportMergeKeys = new ArrayList();
       PrtpReportSwitchConfig.DEFAULT = prtpReportSw;
       prtpReportSw = new PrtpReportSwitchConfig();
       prtpReportSw.reportMerge = 120;
       String[] stringArray = new String[]{"prtp_post_infer_event","prtp_infer_error","prtp_infer_finish","prtp_infer_result"};
       prtpReportSw.reportMergeKeys = CollectionsKt__CollectionsKt.r(stringArray);
       PrtpReportSwitchConfig.TEST = prtpReportSw;
       PrtpReportSwitchConfig.serialVersionUID = 0xffff87b1eb675f1e;
    }
    public void PrtpReportSwitchConfig(){
       super();
       this.reportMerge = 120;
       this.reportMergeKeys = new ArrayList();
    }
    public static final PrtpReportSwitchConfig getDEFAULT(){
       return PrtpReportSwitchConfig.DEFAULT;
    }
    public static final long getSerialVersionUID(){
       return PrtpReportSwitchConfig.serialVersionUID;
    }
    public static final PrtpReportSwitchConfig getTEST(){
       return PrtpReportSwitchConfig.TEST;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, PrtpReportSwitchConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = a.a.q(this);
          if (obj == null) {
             obj = "";
          }
       }catch(java.lang.Exception e0){
          obj = super.toString();
       }
       return obj;
    }
}
