package com.kuaishou.tuna.plc.monitor.PlcPerformancePluginImpl;
import u06.g;
import com.kuaishou.tuna.plc.monitor.PlcPerformancePluginImpl$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.tuna.plc.monitor.PlcPerformancePluginImpl$mShouldReport$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import xx5.g;
import zx5.a;
import zx5.e;
import com.kuaishou.tuna.plc.monitor.PlcPerformancePluginImpl$logLivePluginInvalid$1;
import zx5.a$a;
import a16.a;
import com.kuaishou.tuna.plc_base.monitor.TunaPlcPerfLogger;

public class PlcPerformancePluginImpl implements g	// class@001034
{
    public final p b;
    public static final PlcPerformancePluginImpl$a c;

    static {
       PlcPerformancePluginImpl.c = new PlcPerformancePluginImpl$a(null);
    }
    public void PlcPerformancePluginImpl(){
       super();
       this.b = s.c(PlcPerformancePluginImpl$mShouldReport$2.INSTANCE);
    }
    public void GY(int p0){
       PlcPerformancePluginImpl plcPerforman = PlcPerformancePluginImpl.class;
       if (PatchProxy.isSupport(plcPerforman) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, plcPerforman, "2")) {
          return;
       }
       Object[] objArray = null;
       Boolean uBoolean = PatchProxy.apply(objArray, this, plcPerforman, "1");
       if (uBoolean == PatchProxyResult.class) {
          uBoolean = this.b.getValue();
       }
       if (!uBoolean.booleanValue()) {
          return;
       }else {
          g og = d.a(-174493078);
          if (og != null) {
             objArray = og.PB(a.class);
          }
          Object[] objArray1 = objArray;
          if (objArray1 != null) {
             a$a.a(objArray1, "PLC_BIZ_MONITOR", false, new PlcPerformancePluginImpl$logLivePluginInvalid$1(p0), 2, null);
          }
          return;
       }
    }
    public a aF(){
       Object obj = PatchProxy.apply(null, this, PlcPerformancePluginImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TunaPlcPerfLogger();
    }
    public boolean isAvailable(){
       Object obj = PatchProxy.apply(null, this, PlcPerformancePluginImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return true;
    }
}
