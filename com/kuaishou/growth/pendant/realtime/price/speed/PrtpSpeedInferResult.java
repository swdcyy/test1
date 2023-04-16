package com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedInferResult;
import java.io.Serializable;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedInferResult$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;

public final class PrtpSpeedInferResult implements Serializable	// class@0006c5
{
    public String abParams;
    public String inferMd5;
    public Map inferResultMap;
    public float inferResultRatio;
    public long inferTimestamp;
    public String modelId;
    public String trigger;
    public String uid;
    public static final PrtpSpeedInferResult$a Companion;
    public static final PrtpSpeedInferResult DEFAULT;
    public static final long serialVersionUID;

    static {
       PrtpSpeedInferResult.Companion = new PrtpSpeedInferResult$a(null);
       PrtpSpeedInferResult prtpSpeedInf = new PrtpSpeedInferResult();
       prtpSpeedInf.inferResultRatio = 0x3f800000;
       PrtpSpeedInferResult.DEFAULT = prtpSpeedInf;
       PrtpSpeedInferResult.serialVersionUID = 0xfff91ae6d51cd696;
    }
    public void PrtpSpeedInferResult(){
       super();
       this.trigger = "";
       this.uid = "";
       this.modelId = "";
       this.abParams = "";
       this.inferMd5 = "";
       this.inferTimestamp = -1;
       this.inferResultRatio = 0xbf800000;
    }
    public static final PrtpSpeedInferResult fromInferRatio(String p0,String p1,String p2,String p3,String p4,long p5,float p6,Map p7){
       if (PatchProxy.isSupport(PrtpSpeedInferResult.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Long.valueOf(p5),Float.valueOf(p6),p7};
          Object obj = PatchProxy.apply(objArray, null, PrtpSpeedInferResult.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return PrtpSpeedInferResult.Companion.a(p0, p1, p2, p3, p4, p5, p6, p7);
    }
    public static final PrtpSpeedInferResult getDEFAULT(){
       return PrtpSpeedInferResult.DEFAULT;
    }
    public static final long getSerialVersionUID(){
       return PrtpSpeedInferResult.serialVersionUID;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, PrtpSpeedInferResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = a.a.q(this);
          a.o(obj, "Gsons.KWAI_GSON.toJson\(this\)");
       }catch(java.lang.Exception e0){
          obj = "{}";
       }
       return obj;
    }
}
