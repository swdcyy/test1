package com.kwai.sdk.eve.internal.capsule.EveCapsule$gatherFunc$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.capsule.EveCapsule;
import sm7.i;
import ml5.a;
import com.kwai.sdk.eve.internal.inference.DataBundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Map;
import um7.a;
import java.util.LinkedHashMap;
import msd.l;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.inference.DataBundle$TRANSFER;

public final class EveCapsule$gatherFunc$1 extends Lambda implements p	// class@001469
{
    public final EveCapsule this$0;

    public void EveCapsule$gatherFunc$1(EveCapsule p0){
       this.this$0 = p0;
       super(2);
    }
    public final DataBundle invoke(i p0,a p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, EveCapsule$gatherFunc$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       obj = "event";
       a.p(p1, obj);
       DataBundle uDataBundle = new DataBundle();
       GeneratedMessageLite generatedMes = p1.f();
       a.m(generatedMes);
       uDataBundle.a(obj, generatedMes);
       a uoa = this.this$0.b.get(p0.getTaskId());
       if (uoa != null) {
          uoa = uoa.requestApis;
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          try{
             obj = 0;
             int len = uoa.length;
             for (int i = 0; i < len; i = i + 1) {
                object oobject = uoa[i];
                linkedHashMa.put(oobject, this.this$0.a.invoke(oobject));
             }
             uDataBundle.a("requestApis", linkedHashMa);
          }catch(java.lang.Exception e7){
             EveLog.e$default("EveCapsuleConfig gatherFunc: trans response data failed: "+e7, obj, 2, null);
          }
       }
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
