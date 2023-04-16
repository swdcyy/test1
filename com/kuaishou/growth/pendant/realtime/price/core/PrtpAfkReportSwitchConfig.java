package com.kuaishou.growth.pendant.realtime.price.core.PrtpAfkReportSwitchConfig;
import java.io.Serializable;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpAfkReportSwitchConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;
import java.lang.StringBuilder;
import ye0.a;
import fg6.a;
import com.google.gson.Gson;

public final class PrtpAfkReportSwitchConfig implements Serializable	// class@00069b
{
    public int enable;
    public long reportIntervalSecond;
    public static final PrtpAfkReportSwitchConfig$a Companion;
    public static final PrtpAfkReportSwitchConfig DEFAULT;
    public static final PrtpAfkReportSwitchConfig TEST;
    public static final long serialVersionUID;

    static {
       PrtpAfkReportSwitchConfig.Companion = new PrtpAfkReportSwitchConfig$a(null);
       PrtpAfkReportSwitchConfig prtpAfkRepor = new PrtpAfkReportSwitchConfig();
       prtpAfkRepor.enable = 0;
       PrtpAfkReportSwitchConfig.DEFAULT = prtpAfkRepor;
       prtpAfkRepor = new PrtpAfkReportSwitchConfig();
       prtpAfkRepor.enable = 1;
       prtpAfkRepor.reportIntervalSecond = 120;
       PrtpAfkReportSwitchConfig.TEST = prtpAfkRepor;
       PrtpAfkReportSwitchConfig.serialVersionUID = 0xfffb4cf2fc540fbe;
    }
    public void PrtpAfkReportSwitchConfig(){
       super();
       this.reportIntervalSecond = 120;
    }
    public static final PrtpAfkReportSwitchConfig getDEFAULT(){
       return PrtpAfkReportSwitchConfig.DEFAULT;
    }
    public static final long getSerialVersionUID(){
       return PrtpAfkReportSwitchConfig.serialVersionUID;
    }
    public static final PrtpAfkReportSwitchConfig getTEST(){
       return PrtpAfkReportSwitchConfig.TEST;
    }
    public final long getReportInterval(){
       Long obj = PatchProxy.apply(null, this, PrtpAfkReportSwitchConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = Long.valueOf(this.reportIntervalSecond);
       long l = (obj.longValue() - (long)5 >= 0)? 1: 0;
       if (!l) {
          Object[] objArray = null;
       }
       l = (obj != null)? obj.longValue(): 120;
       l = l * (long)1000;
       a.h("Afk#PrtpManager#reportInterval : >>> >>> "+this.reportIntervalSecond+" -> "+l, false, 2, null);
       return l;
    }
    public final boolean isEnable(){
       boolean b = (this.enable > null)? true: false;
       return b;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, PrtpAfkReportSwitchConfig.class, "2");
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
