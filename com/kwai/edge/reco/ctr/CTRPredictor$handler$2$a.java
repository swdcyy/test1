package com.kwai.edge.reco.ctr.CTRPredictor$handler$2$a;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import qj5.b;
import com.kwai.edge.reco.ctr.CTRPredictor;
import com.kwai.edge.reco.ctr.CTRPredictor$inferRunnable$2$a;
import qrd.p;
import qj5.a;
import com.kwai.edge.reco.ctr.log.CTRResultLogger;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.System;
import java.lang.Number;
import java.lang.Long;
import com.yxcorp.utility.Log;

public final class CTRPredictor$handler$2$a extends Handler	// class@000d38
{
    public final HandlerThread a;

    public void CTRPredictor$handler$2$a(HandlerThread p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       CTRResultLogger obj;
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, CTRPredictor$handler$2$a.class, "1")) {
          return;
       }
       a.p(p0, "msg");
       Message what = p0.what;
       if (what == 2022) {
          p0 = p0.obj;
          Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kwai.edge.reco.ctr.model.CTRInferTrigger");
          CTRPredictor v = CTRPredictor.v;
          Objects.requireNonNull(v);
          obj = PatchProxy.apply(null, v, CTRPredictor.class, "3");
          if (obj != patchProxyRe) {
          }else {
             obj = CTRPredictor.u.getValue();
          }
          obj.m(p0);
       }else if(what == 917){
          p0 = p0.obj;
          Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kwai.edge.reco.ctr.model.CTRInferResult");
          obj = CTRResultLogger.b;
          CTRPredictor v1 = CTRPredictor.v;
          List list = CTRPredictor.f(v1).get(p0.a());
          List list1 = CTRPredictor.i(v1).get(p0.a());
          List list2 = CTRPredictor.e(v1).get(p0.a());
          ArrayList uArrayList = PatchProxy.applyOneRefs(list2, this, CTRPredictor$handler$2$a.class, "2");
          if (uArrayList != patchProxyRe) {
          }else {
             uArrayList = new ArrayList();
             if (list2 != null) {
                int i = 0;
                int i1 = list2.size();
                while (i < i1) {
                   int i2 = list2.size() - 1;
                   if (i == i2) {
                      l = System.currentTimeMillis() / (long)1000;
                      l = l - list2.get(i).longValue();
                      uArrayList.add(Long.valueOf(l));
                   }else {
                      i2 = i + 1;
                      l = list2.get(i2).longValue() - list2.get(i).longValue();
                      uArrayList.add(Long.valueOf(l));
                   }
                   i = i + 1;
                }
             }
          }
          obj.a(p0, list, list1, uArrayList);
          CTRPredictor v2 = CTRPredictor.v;
          CTRPredictor.f(v2).remove(p0.a());
          CTRPredictor.e(v2).remove(p0.a());
          CTRPredictor.i(v2).remove(p0.a());
          if (CTRPredictor.f(v2).isEmpty()) {
             v2.r(5);
             Log.d("CTRPredictor", "start next infer, trigger type: 5");
          }
       }
       return;
    }
}
