package com.kuaishou.growth.pendant.realtime.price.core.PrtpSwitchConfig;
import java.io.Serializable;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpSwitchConfig$a;
import nsd.u;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;

public final class PrtpSwitchConfig implements Serializable	// class@0006b1
{
    public String abParams;
    public boolean enable;
    public ArrayList featuresTimeLevels;
    public long inferInterval;
    public int inferType;
    public long reportInterval;
    public float samplingRate;
    public static final PrtpSwitchConfig$a Companion;
    public static final PrtpSwitchConfig TEST;
    public static final long serialVersionUID;

    static {
       PrtpSwitchConfig.Companion = new PrtpSwitchConfig$a(null);
       PrtpSwitchConfig prtpSwitchCo = new PrtpSwitchConfig();
       prtpSwitchCo.enable = true;
       prtpSwitchCo.inferInterval = 10;
       prtpSwitchCo.samplingRate = 0x3f800000;
       prtpSwitchCo.reportInterval = 10;
       Long[] longArray = new Long[]{Long.valueOf(5),Long.valueOf(15),Long.valueOf(30)};
       prtpSwitchCo.featuresTimeLevels = CollectionsKt__CollectionsKt.r(longArray);
       PrtpSwitchConfig.TEST = prtpSwitchCo;
       PrtpSwitchConfig.serialVersionUID = 0xfe2d259bb0648f96;
    }
    public void PrtpSwitchConfig(){
       super();
       this.inferInterval = 10;
       this.reportInterval = 10;
       this.featuresTimeLevels = new ArrayList();
    }
    public static final long getSerialVersionUID(){
       return PrtpSwitchConfig.serialVersionUID;
    }
    public static final PrtpSwitchConfig getTEST(){
       return PrtpSwitchConfig.TEST;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, PrtpSwitchConfig.class, "1");
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
