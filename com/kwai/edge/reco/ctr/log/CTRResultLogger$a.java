package com.kwai.edge.reco.ctr.log.CTRResultLogger$a;
import java.lang.Runnable;
import qj5.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.Gson;
import com.kwai.sdk.eve.internal.common.utils.DataKt;
import k2b.u1;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class CTRResultLogger$a implements Runnable	// class@000d52
{
    public final a b;
    public final List c;
    public final List d;
    public final List e;

    public void CTRResultLogger$a(a p0,List p1,List p2,List p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, CTRResultLogger$a.class, "1")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("inferId", this.b.a());
       oi3.c("triggerType", Integer.valueOf(this.b.b));
       oi3.d("processorOutputs", DataKt.a().q(this.b.c));
       oi3.d("pagesDuringInterval", DataKt.a().q(this.c));
       oi3.d("stayDuringInterval", DataKt.a().q(this.d));
       oi3.d("result", DataKt.a().q(this.e));
       String str = oi3.e();
       u1.R("PageCtrPredictionVerify", str, 22);
       Log.g("CTRResultLogger", "reportCTRResult "+str);
       return;
    }
}
