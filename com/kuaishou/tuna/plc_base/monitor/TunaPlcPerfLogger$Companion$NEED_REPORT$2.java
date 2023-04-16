package com.kuaishou.tuna.plc_base.monitor.TunaPlcPerfLogger$Companion$NEED_REPORT$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna.plc_base.monitor.TunaPlcPerfLogger;
import java.util.Objects;
import com.kuaishou.tuna.plc_base.monitor.TunaPlcPerfLogger$a;
import o56.a;
import kotlin.jvm.internal.a;
import zsd.u;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.tuna.plc_base.monitor.TunaPlcPerfLogger$Companion$NEED_REPORT$2$a;
import java.lang.reflect.Type;
import el.a;
import java.lang.Double;
import java.lang.Number;
import ssd.e;
import ssd.e$a;

public final class TunaPlcPerfLogger$Companion$NEED_REPORT$2 extends Lambda implements a	// class@001073
{
    public static final TunaPlcPerfLogger$Companion$NEED_REPORT$2 INSTANCE;

    static {
       TunaPlcPerfLogger$Companion$NEED_REPORT$2.INSTANCE = new TunaPlcPerfLogger$Companion$NEED_REPORT$2();
    }
    public void TunaPlcPerfLogger$Companion$NEED_REPORT$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       TunaPlcPerfLogger$a obj = PatchProxy.apply(objArray, this, TunaPlcPerfLogger$Companion$NEED_REPORT$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = TunaPlcPerfLogger.f;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, TunaPlcPerfLogger$a.class, "2");
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(a.d()){
          String m = a.m;
          a.o(m, "AppEnv.VERSION");
          if (u.H1(m, ".99999", 0, 2, objArray)) {
             b1 = true;
          }
       }
       b1 = false;
       if (b1) {
          return b;
       }else {
          b1 = (int)(a.t().getValue("tunaPLCPerformanceSampling", new TunaPlcPerfLogger$Companion$NEED_REPORT$2$a().getType(), Double.valueOf(0)).doubleValue() * (double)100);
          int i = 0x2710;
          if (b1 <= 0 || (b1 < i && e.b.m(0, i) > b1)) {
             b = false;
          }
          return b;
       }
    }
}
