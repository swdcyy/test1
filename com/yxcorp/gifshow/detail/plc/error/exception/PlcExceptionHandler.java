package com.yxcorp.gifshow.detail.plc.error.exception.PlcExceptionHandler;
import java.lang.Object;
import com.yxcorp.gifshow.detail.plc.error.exception.BasePlcException;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna_logger.KsLogTunaPlcTag;
import java.util.List;
import com.yxcorp.gifshow.detail.plc.error.exception.PlcExceptionHandler$handleException$1;
import msd.a;
import java.lang.Throwable;
import c15.b;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class PlcExceptionHandler	// class@001665
{
    public static final PlcExceptionHandler a;

    static {
       PlcExceptionHandler.a = new PlcExceptionHandler();
    }
    public void PlcExceptionHandler(){
       super();
    }
    public static final void a(BasePlcException p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PlcExceptionHandler.class, "1")) {
          return;
       }
       a.p(p0, "ex");
       String str = "logTag";
       try{
          a.p(p1, str);
          KsLogTunaPlcTag pLC = KsLogTunaPlcTag.PLC;
          pLC.appendTag(p1);
          KsLogTunaPlcTag ksLogTunaPlc = pLC;
          b.e(ksLogTunaPlc, PlcExceptionHandler$handleException$1.INSTANCE, p0);
          ExceptionHandler.handleCaughtException(p0);
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
