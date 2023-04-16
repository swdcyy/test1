package com.kwai.edge.reco.xtab.log.XTabResultLogger;
import com.kwai.edge.reco.xtab.log.XTabResultLogger$xtabResultLogRatio$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import yj5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ekd.k1;
import java.util.Random;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.edge.reco.xtab.log.XTabResultLogger$a;
import java.lang.Runnable;
import t45.c;

public final class XTabResultLogger	// class@000d64
{
    public static final p a;
    public static final XTabResultLogger b;

    static {
       XTabResultLogger.b = new XTabResultLogger();
       XTabResultLogger.a = s.c(XTabResultLogger$xtabResultLogRatio$2.INSTANCE);
    }
    public void XTabResultLogger(){
       super();
    }
    public final void a(a p0){
       XTabResultLogger xTabResultLo = XTabResultLogger.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, xTabResultLo, "2")) {
          return;
       }
       a.p(p0, "inferResult");
       float f = k1.b.nextFloat();
       Number number = PatchProxy.apply(null, this, xTabResultLo, "1");
       if (number == PatchProxyResult.class) {
          number = XTabResultLogger.a.getValue();
       }
       if (f - number.floatValue() > 0) {
          return;
       }else {
          c.a(new XTabResultLogger$a(p0));
          return;
       }
    }
}
