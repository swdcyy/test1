package com.kuaishou.tuna.plc.plc2.logger.PlcLoggerWrapper;
import com.kuaishou.tuna.plc.plc2.logger.PlcLoggerWrapper$a;
import nsd.u;
import u06.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna.plc.plc2.logger.PlcLoggerWrapper$mCoverShowListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.tuna.plc.plc2.logger.PlcLoggerWrapper$mCoverClickListener$2;
import com.kuaishou.tuna.plc.plc2.logger.PlcLoggerWrapper$mLongVideoShowListener$2;
import com.kuaishou.tuna.plc.plc2.logger.PlcLoggerWrapper$mLongVideoClickListener$2;
import com.kuaishou.tuna.plc.plc2.logger.PlcLoggerWrapper$mLandscapePlcShowLnr$2;
import u06.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import x06.b;

public final class PlcLoggerWrapper	// class@00105e
{
    public final p a;
    public final p b;
    public final p c;
    public final p d;
    public final p e;
    public final a f;
    public static final String g;
    public static final PlcLoggerWrapper$a h;

    static {
       PlcLoggerWrapper.h = new PlcLoggerWrapper$a(null);
       PlcLoggerWrapper.g = "PlcLoggerWrapper";
    }
    public void PlcLoggerWrapper(a p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PlcLoggerWrapper plcLoggerWra = PlcLoggerWrapper.class;
       a.p(p0, "plc");
       super();
       this.f = p0;
       p op = s.c(PlcLoggerWrapper$mCoverShowListener$2.INSTANCE);
       this.a = op;
       p op1 = s.c(new PlcLoggerWrapper$mCoverClickListener$2(this));
       this.b = op1;
       p op2 = s.c(PlcLoggerWrapper$mLongVideoShowListener$2.INSTANCE);
       this.c = op2;
       p op3 = s.c(new PlcLoggerWrapper$mLongVideoClickListener$2(this));
       this.d = op3;
       p op4 = s.c(PlcLoggerWrapper$mLandscapePlcShowLnr$2.INSTANCE);
       this.e = op4;
       c uoc = p0.c();
       Object obj = PatchProxy.apply(null, this, plcLoggerWra, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = op.getValue();
       }
       uoc.c(obj);
       c uoc1 = p0.c();
       Object obj1 = PatchProxy.apply(null, this, plcLoggerWra, "2");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = op1.getValue();
       }
       uoc1.b(obj1);
       uoc1 = p0.c();
       b uob = PatchProxy.apply(null, this, plcLoggerWra, "3");
       if (uob == patchProxyRe) {
          uob = op2.getValue();
       }
       uoc1.u(uob);
       uoc1 = p0.c();
       uob = PatchProxy.apply(null, this, plcLoggerWra, "4");
       if (uob == patchProxyRe) {
          uob = op3.getValue();
       }
       uoc1.k(uob);
       c uoc2 = p0.c();
       Object obj2 = PatchProxy.apply(null, this, plcLoggerWra, "5");
       if (obj2 != patchProxyRe) {
       }else {
          obj2 = op4.getValue();
       }
       uoc2.h(obj2);
       return;
    }
}
