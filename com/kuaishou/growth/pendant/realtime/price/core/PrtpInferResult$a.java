package com.kuaishou.growth.pendant.realtime.price.core.PrtpInferResult$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.util.Map;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpInferResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Float;

public final class PrtpInferResult$a	// class@00069e
{

    public void PrtpInferResult$a(){
       super();
    }
    public void PrtpInferResult$a(u p0){
       super();
    }
    public final PrtpInferResult a(int p0,String p1,String p2,String p3,String p4,String p5,long p6,int p7,int p8,Map p9){
       PrtpInferResult obj;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       object oobject5 = p9;
       PrtpInferResult$a uoa = PrtpInferResult$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[10];
          objArray[0] = Integer.valueOf(p0);
          objArray[1] = oobject;
          objArray[2] = oobject1;
          objArray[3] = oobject2;
          objArray[4] = oobject3;
          objArray[5] = oobject4;
          objArray[6] = Long.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = oobject5;
          obj = PatchProxy.apply(objArray, this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p1, "trigger");
       a.p(p2, "uid");
       a.p(p3, "modelId");
       a.p(oobject3, "abParams");
       a.p(oobject4, "inferMd5");
       obj = new PrtpInferResult();
       obj.inferCircle = p0;
       obj.trigger = oobject;
       obj.uid = oobject1;
       obj.modelId = oobject2;
       obj.abParams = oobject3;
       obj.inferMd5 = oobject4;
       obj.inferTimestamp = p6;
       obj.inferResultType = 1;
       obj.inferResultLevel = p7;
       obj.inferResultAmount = p8;
       obj.inferResultMap = oobject5;
       return obj;
    }
    public final PrtpInferResult b(int p0,String p1,String p2,String p3,String p4,String p5,long p6,float p7,int p8,Map p9){
       PrtpInferResult obj;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       object oobject5 = p9;
       PrtpInferResult$a uoa = PrtpInferResult$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[10];
          objArray[0] = Integer.valueOf(p0);
          objArray[1] = oobject;
          objArray[2] = oobject1;
          objArray[3] = oobject2;
          objArray[4] = oobject3;
          objArray[5] = oobject4;
          objArray[6] = Long.valueOf(p6);
          objArray[7] = Float.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = oobject5;
          obj = PatchProxy.apply(objArray, this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p1, "trigger");
       a.p(p2, "uid");
       a.p(p3, "modelId");
       a.p(oobject3, "abParams");
       a.p(oobject4, "inferMd5");
       obj = new PrtpInferResult();
       obj.inferCircle = p0;
       obj.trigger = oobject;
       obj.uid = oobject1;
       obj.modelId = oobject2;
       obj.abParams = oobject3;
       obj.inferMd5 = oobject4;
       obj.inferTimestamp = p6;
       obj.inferResultType = 0;
       obj.inferResultRatio = p7;
       obj.inferResultLevel = p8;
       obj.inferResultMap = oobject5;
       return obj;
    }
}
