package com.kuaishou.growth.pendant.realtime.price.core.PrtpActivityConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;

public final class PrtpActivityConfig	// class@000698
{
    public int nextCircle;
    public PrtpRatioRangeConfig prtpRatioRangeConfig;
    public float recoPid;
    public int startCoinLevel;

    public void PrtpActivityConfig(){
       super();
       this.startCoinLevel = -1;
       this.recoPid = 0xbf800000;
       this.nextCircle = -1;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, PrtpActivityConfig.class, "1");
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
