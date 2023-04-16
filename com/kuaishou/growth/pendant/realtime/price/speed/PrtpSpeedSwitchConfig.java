package com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedSwitchConfig;
import java.io.Serializable;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedSwitchConfig$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;

public final class PrtpSpeedSwitchConfig implements Serializable	// class@0006ce
{
    public String abParams;
    public boolean afkEnable;
    public float afkRatio;
    public boolean enable;
    public ArrayList featuresTimeLevels;
    public boolean inferMultiTimesEnable;
    public float maxSpeedRatio;
    public boolean minEnable;
    public float minSpeedRatio;
    public long reportIntervalSecond;
    public long reportMergeSecond;
    public float samplingRate;
    public static final PrtpSpeedSwitchConfig$a Companion;
    public static final PrtpSpeedSwitchConfig TEST;
    public static final PrtpSpeedSwitchConfig TEST_AFK;
    public static final long serialVersionUID;

    static {
       PrtpSpeedSwitchConfig.Companion = new PrtpSpeedSwitchConfig$a(null);
       PrtpSpeedSwitchConfig prtpSpeedSwi = new PrtpSpeedSwitchConfig();
       prtpSpeedSwi.enable = true;
       prtpSpeedSwi.samplingRate = 0x3f800000;
       prtpSpeedSwi.reportIntervalSecond = 120;
       prtpSpeedSwi.minSpeedRatio = 0x3f666666;
       prtpSpeedSwi.maxSpeedRatio = 0x3f828f5c;
       prtpSpeedSwi.reportMergeSecond = 0;
       PrtpSpeedSwitchConfig.TEST = prtpSpeedSwi;
       prtpSpeedSwi = new PrtpSpeedSwitchConfig();
       prtpSpeedSwi.enable = false;
       prtpSpeedSwi.afkEnable = true;
       prtpSpeedSwi.afkRatio = 0x3f000000;
       prtpSpeedSwi.reportIntervalSecond = 120;
       prtpSpeedSwi.reportMergeSecond = 0;
       PrtpSpeedSwitchConfig.TEST_AFK = prtpSpeedSwi;
       PrtpSpeedSwitchConfig.serialVersionUID = 0xfffff40c6fe99e3e;
    }
    public void PrtpSpeedSwitchConfig(){
       super();
       this.afkRatio = 0x3f800000;
       this.reportIntervalSecond = 120;
       this.reportMergeSecond = 120;
       this.featuresTimeLevels = new ArrayList();
    }
    public static final long getSerialVersionUID(){
       return PrtpSpeedSwitchConfig.serialVersionUID;
    }
    public static final PrtpSpeedSwitchConfig getTEST(){
       return PrtpSpeedSwitchConfig.TEST;
    }
    public static final PrtpSpeedSwitchConfig getTEST_AFK(){
       return PrtpSpeedSwitchConfig.TEST_AFK;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, PrtpSpeedSwitchConfig.class, "1");
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
