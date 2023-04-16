package com.kwai.edge.reco.ctr.log.CTRResultLogger;
import com.kwai.edge.reco.ctr.log.CTRResultLogger$ctrResultLogRatio$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import qj5.a;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ekd.k1;
import java.util.Random;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.edge.reco.ctr.log.CTRResultLogger$a;
import java.lang.Runnable;
import t45.c;

public final class CTRResultLogger	// class@000d54
{
    public static final p a;
    public static final CTRResultLogger b;

    static {
       CTRResultLogger.b = new CTRResultLogger();
       CTRResultLogger.a = s.c(CTRResultLogger$ctrResultLogRatio$2.INSTANCE);
    }
    public void CTRResultLogger(){
       super();
    }
    public final void a(a p0,List p1,List p2,List p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, CTRResultLogger.class, "2")) {
          return;
       }
       a.p(p0, "inferResult");
       float f = k1.b.nextFloat();
       Number number = PatchProxy.apply(null, this, CTRResultLogger.class, "1");
       if (number == PatchProxyResult.class) {
          number = CTRResultLogger.a.getValue();
       }
       if (f - number.floatValue() > 0) {
          return;
       }else {
          c.a(new CTRResultLogger$a(p0, p1, p3, p2));
          return;
       }
    }
}
