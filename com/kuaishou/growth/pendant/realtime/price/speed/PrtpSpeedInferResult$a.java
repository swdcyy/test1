package com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedInferResult$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.util.Map;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedInferResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class PrtpSpeedInferResult$a	// class@0006c4
{

    public void PrtpSpeedInferResult$a(){
       super();
    }
    public void PrtpSpeedInferResult$a(u p0){
       super();
    }
    public final PrtpSpeedInferResult a(String p0,String p1,String p2,String p3,String p4,long p5,float p6,Map p7){
       PrtpSpeedInferResult obj;
       PrtpSpeedInferResult$a uoa = PrtpSpeedInferResult$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Long.valueOf(p5),Float.valueOf(p6),p7};
          obj = PatchProxy.apply(objArray, this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "trigger");
       a.p(p1, "uid");
       a.p(p2, "modelId");
       a.p(p3, "abParams");
       a.p(p4, "inferMd5");
       obj = new PrtpSpeedInferResult();
       obj.trigger = p0;
       obj.uid = p1;
       obj.modelId = p2;
       obj.abParams = p3;
       obj.inferMd5 = p4;
       obj.inferTimestamp = p5;
       obj.inferResultRatio = p6;
       obj.inferResultMap = p7;
       return obj;
    }
    public final PrtpSpeedInferResult b(){
       return PrtpSpeedInferResult.DEFAULT;
    }
}
