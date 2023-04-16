package com.kuaishou.growth.pendant.realtime.price.core.PrtpInferResult;
import java.io.Serializable;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpInferResult$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.utility.SystemUtil;
import ue0.a;
import android.content.SharedPreferences;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import java.lang.Throwable;
import ye0.a;

public final class PrtpInferResult implements Serializable	// class@00069f
{
    public String abParams;
    public int inferCircle;
    public String inferMd5;
    public int inferResultAmount;
    public int inferResultLevel;
    public Map inferResultMap;
    public float inferResultRatio;
    public int inferResultType;
    public long inferTimestamp;
    public String modelId;
    public String trigger;
    public String uid;
    public static final PrtpInferResult$a Companion;
    public static final PrtpInferResult DEFAULT;
    public static final long serialVersionUID;

    static {
       PrtpInferResult.Companion = new PrtpInferResult$a(null);
       PrtpInferResult prtpInferRes = new PrtpInferResult();
       prtpInferRes.inferResultRatio = 0x3f800000;
       PrtpInferResult.DEFAULT = prtpInferRes;
       PrtpInferResult.serialVersionUID = 0xffb1571bcd1bf2e6;
    }
    public void PrtpInferResult(){
       super();
       this.trigger = "";
       this.uid = "";
       this.modelId = "";
       this.abParams = "";
       this.inferMd5 = "";
       this.inferTimestamp = -1;
       this.inferResultRatio = 0xbf800000;
       this.inferResultLevel = -1;
       this.inferResultAmount = -1;
       this.inferCircle = -1;
    }
    public static final PrtpInferResult fromInferAmount(int p0,String p1,String p2,String p3,String p4,String p5,long p6,int p7,int p8,Map p9){
       if (PatchProxy.isSupport(PrtpInferResult.class)) {
          Object[] objArray = new Object[10];
          objArray[0] = Integer.valueOf(p0);
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Long.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = p9;
          Object obj = PatchProxy.apply(objArray, null, PrtpInferResult.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return PrtpInferResult.Companion.a(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }
    public static final PrtpInferResult fromInferRatio(int p0,String p1,String p2,String p3,String p4,String p5,long p6,float p7,int p8,Map p9){
       if (PatchProxy.isSupport(PrtpInferResult.class)) {
          Object[] objArray = new Object[10];
          objArray[0] = Integer.valueOf(p0);
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Long.valueOf(p6);
          objArray[7] = Float.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = p9;
          Object obj = PatchProxy.apply(objArray, null, PrtpInferResult.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return PrtpInferResult.Companion.b(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }
    public static final PrtpInferResult getDEFAULT(){
       return PrtpInferResult.DEFAULT;
    }
    public static final long getSerialVersionUID(){
       return PrtpInferResult.serialVersionUID;
    }
    public String toString(){
       String str;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, PrtpInferResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = a.a.q(this);
          if (SystemUtil.K()) {
             str = a.a.getString("prtpInferTest", "");
             a.o(str, "it");
             String str1 = (str.length() > 0)? 1: null;
             if (!str1) {
                str = objArray;
             }
             if (str != null) {
                a.c("PrtpInferResult#toString : mock to ==> "+str, objArray, false, 6, objArray);
                obj = str;
             }
          }
          a.o(obj, "str");
       }catch(java.lang.Exception e0){
          obj = super.toString();
       }
       return obj;
    }
}
