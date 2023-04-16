package com.kwai.edge.reco.ctr.CTRPredictor$inferRunnable$2$a;
import oj5.b;
import java.lang.Object;
import qj5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fg6.a;
import com.google.gson.Gson;
import v40.b;
import java.lang.StringBuilder;
import com.kwai.edge.reco.ctr.model.CTRTriggerCustomValue;
import com.yxcorp.utility.Log;

public final class CTRPredictor$inferRunnable$2$a extends b	// class@000d3a
{

    public void CTRPredictor$inferRunnable$2$a(){
       super();
    }
    public void l(Object p0){
       this.m(p0);
    }
    public void m(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CTRPredictor$inferRunnable$2$a.class, "1")) {
          return;
       }
       a.p(p0, "inferTrigger");
       String str = a.a.q(p0);
       a.o(str, "Gsons.KWAI_GSON.toJson\(inferTrigger\)");
       b.b("PageCtrPredictionInfer", str);
       Log.d("CTRPredictor", "infer start, triggerType is "+p0.a().a());
       return;
    }
}
